require recipes-kernel/mmngr-module/mmngr-module.inc
LICENSE = "CLOSED"
DEPENDS = "mmngr-kernel-module mmngr-user-module"
PN = "mmngr-tp-user-module"
PR = "r0"
SRC_URI = "file://mmngr.tar.bz2"

do_compile() {
# Build test kernel module
	cd ${S}
	make all ARCH=arm
}

do_install() {
# Copy kernel test program
	mkdir -p ${D}/usr/local/bin/
	cp ${S}/mmtp ${D}/usr/local/bin/
}

PACKAGES = "\
  ${PN} \
"
FILES_${PN} = " \
  /usr/local/bin/mmtp \
"

RPROVIDES_${PN} += "mmngr-tp-user-module"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"