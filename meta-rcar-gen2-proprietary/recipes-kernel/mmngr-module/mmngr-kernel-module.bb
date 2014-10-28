require mmngr-module.inc
LICENSE = "GPLv2&MIT"
DEPENDS = "linux-renesas"
PN = "mmngr-kernel-module"
PR = "r0"
SRC_URI = "file://mmngr.tar.bz2"
LIC_FILES_CHKSUM = "file://drv/GPL-COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
					file://drv/MIT-COPYING;md5=fea016ce2bdf2ec10080f69e9381d378 \
					file://include/GPL-COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
					file://include/MIT-COPYING;md5=fea016ce2bdf2ec10080f69e9381d378 "
MMNGR_CFG_koelsch="MMNGR_KOELSCH"
MMNGR_CFG_lager="MMNGR_LAGER"
MMNGR_CFG_alt="MMNGR_ALT"
MMNGR_CFG_gose="MMNGR_GOSE"

do_compile() {
	export MMNGR_CONFIG=${MMNGR_CFG}
	if [ "X${DTV_ENABLE}" = "X1" ]; then
		export MMNGR_SSP_CONFIG="MMNGR_SSP_ENABLE"
	else
		export MMNGR_SSP_CONFIG="MMNGR_SSP_DISABLE"
	fi
	cd ${S}/drv
	make all ARCH=arm
}

do_install () {
# Create destination folders
	mkdir -p ${D}/lib/modules/${KERNEL_VERSION}/extra/ ${D}/usr/src/kernel/include

# Copy shared library for reference from other modules
	cp -f ${S}/drv/Module.symvers ${KERNELSRC}/include/mmngr.symvers
	cp -f ${S}/drv/Module.symvers ${KERNELSRC}/include
	cp -f ${S}/drv/Module.symvers ${D}/usr/src/kernel/include
	cp -f ${S}/drv/Module.symvers ${D}/usr/src/kernel/include/mmngr.symvers

# Copy kernel module
	cp -f ${S}/drv/mmngr.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/

# Copy shared header files
	cp -f ${KERNELSRC}/include/mmngr_public.h ${D}/usr/src/kernel/include
	cp -f ${KERNELSRC}/include/mmngr_private.h ${D}/usr/src/kernel/include
}

# Append function to clean extract source
do_cleansstate_prepend() {
        bb.build.exec_func('do_clean_source', d)
}

do_clean_source() {
	rm -Rf ${KERNELSRC}/include/mmngr_private.h
	rm -Rf ${KERNELSRC}/include/mmngr_public.h
	rm -Rf ${KERNELSRC}/include/mmngr.symvers
	rm -Rf ${KERNELSRC}/include/Module.symvers
}

PACKAGES = "\
  ${PN} \
  ${PN}-dev \
"
FILES_${PN} = " \
  /lib/modules/${KERNEL_VERSION}/extra/mmngr.ko \
"
FILES_${PN}-dev = " \
  /usr/src/kernel/include \
  /usr/src/kernel/include/Module.symvers \
  /usr/src/kernel/include/mmngr.symvers \
  /usr/src/kernel/include/*.h \
"

RPROVIDES_${PN} += "mmngr-kernel-module"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
