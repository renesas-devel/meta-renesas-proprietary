require fdpm-module.inc
LICENSE = "GPLv2&MIT"
LIC_FILES_CHKSUM = "file://drv/GPL-COPYING;md5=ffa10f40b98be2c2bc9608f56827ed23 \
					file://drv/MIT-COPYING;md5=5526ef6e21dc96a1dd89fac4bde9f995"

DEPENDS = "linux-renesas mmngr-kernel-module"
PN = "fdpm-kernel-module"
PR = "r0"
SRC_URI = "file://fdpm-kernel.tar.bz2"

FDPM_CFG_alt="E2CONFIG"
FDPM_CFG_koelsch="M2CONFIG"
FDPM_CFG_gose="M2CONFIG"
FDPM_CFG_lager="H2CONFIG"

do_compile() {
# Build kernel module
	export FDPM_CONFIG=${FDPM_CFG}
	export FDPM_MMNGRDIR=${KERNELSRC}/include
	cd ${S}/drv
	make all ARCH=arm
}

do_install() {
# Create destination folder
	mkdir -p ${D}/lib/modules/${KERNEL_VERSION}/extra ${D}/usr/src/kernel/include

# Copy shared library
	cp -f ${S}/drv/fdpm.ko ${D}/lib/modules/${KERNEL_VERSION}/extra
	cp -f ${KERNELSRC}/include/linux/fdpm_drv.h ${KERNELSRC}/include
	cp -f ${KERNELSRC}/include/linux/fdpm_public.h ${KERNELSRC}/include
	cp -f ${KERNELSRC}/include/linux/fdpm_api.h ${KERNELSRC}/include
    cp ${S}/drv/Module.symvers ${KERNELSRC}/include/fdpm.symvers
# Copy header files to destination
    cp -f ${KERNELSRC}/include/fdpm_drv.h ${D}/usr/src/kernel/include
    cp -f ${KERNELSRC}/include/fdpm_public.h ${D}/usr/src/kernel/include
    cp -f ${KERNELSRC}/include/fdpm_api.h ${D}/usr/src/kernel/include
    cp -f ${S}/drv/Module.symvers ${D}/usr/src/kernel/include/fdpm.symvers
}

# Append function to clean extract source
do_cleansstate_prepend() {
        bb.build.exec_func('do_clean_source', d)
}

do_clean_source() {
	rm -f ${KERNELSRC}/include/linux/fdpm_drv.h
	rm -f ${KERNELSRC}/include/linux/fdpm_public.h
	rm -f ${KERNELSRC}/include/linux/fdpm_api.h
	rm -f ${KERNELSRC}/include/fdpm.symvers
	rm -f ${KERNELSRC}/include/fdpm_drv.h
	rm -f ${KERNELSRC}/include/fdpm_public.h
	rm -f ${KERNELSRC}/include/fdpm_api.h
}

PACKAGES = " \
  ${PN} \
  ${PN}-dev \
"

FILES_${PN} = " \
  /lib/modules/${KERNEL_VERSION}/extra/fdpm.ko \
"

FILES_${PN}-dev = " \
  /usr/src/kernel/include/ \
  /usr/src/kernel/include/*.h \
  /usr/src/kernel/include/fdpm.symvers \
"
RPROVIDES_${PN} += "fdpm-kernel-module"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
