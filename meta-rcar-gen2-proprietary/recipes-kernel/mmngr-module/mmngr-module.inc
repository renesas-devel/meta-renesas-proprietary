require conf/meta-rcar-gen2-proprietary.inc
inherit module
S = "${WORKDIR}/mmngr"
do_configure[noexec] = "1"

python do_package_ipk_prepend () {
    d.setVar('ALLOW_EMPTY', '1')
}