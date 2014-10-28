require recipes-kernel/s3ctl-module/s3ctl-module.inc
LICENSE = "CLOSED"
DEPENDS = "s3ctl-kernel-module s3ctl-user-module"
PN = "s3ctl-tp-user-module"
PR = "r0"
SRC_URI = "file://s3ctl-tp-user.tar.bz2"

do_compile() {
# Build user test program
	cd ${S}
	make all ARCH=arm
}

do_install() {
# Create shared folder
	mkdir -p ${D}/usr/local/bin/
# Copy user test program
	cp ${S}/s3tp ${D}/usr/local/bin/
}

PACKAGES = "\
  ${PN} \
  ${PN}-dev \
  ${PN}-dbg \
"

FILES_${PN} = " \
  /usr/local/bin/s3tp \
"

RPROVIDES_${PN} += "s3ctl-tp-user-module"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
