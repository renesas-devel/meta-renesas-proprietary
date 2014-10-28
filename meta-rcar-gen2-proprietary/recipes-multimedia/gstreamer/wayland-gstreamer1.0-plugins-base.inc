FILESEXTRAPATHS_prepend := "${THISDIR}/gstreamer1.0-plugins-base/wayland-gstreamer1.0-plugins-base:"

EXTRA_OECONF += "--enable-vspfilter"

SRC_URI += " \
            file://0002-vspfilter-Add-a-new-plugin-converting-colorspace-and.patch \
            file://0003-Set-a-default-video-converter-by-.-configure-script.patch \
            file://0004-playsink-Insert-videoscale-into-the-pipeline-when-vs.patch \
            file://0005-playsink-Move-the-queue-plugin-insertion-after-the-v.patch \
            file://0006-vspfilter-Specify-the-width-of-the-V4L2-output-port-.patch \
            file://0007-vspfilter-Remove-an-unnecessary-switch-statement.patch \
            file://0008-vspfilter-Replace-this-plugin-s-own-definition-with-.patch \
            file://0009-vspfilter-Get-the-parameters-of-a-video-stream-from-.patch \
            file://0010-vspfilter-Wrap-the-frame-transformation-function-to-.patch \
            file://0011-vspfilter-Set-a-dmabuf-descriptor-to-a-v4l2-plane-wh.patch \
            file://0012-vspfilter-Override-the-transform-function-of-the-Gst.patch \
            file://0013-vspfilter-Set-the-stride-obtained-from-a-buffer-meta.patch \
            file://0014-vspfilter-Support-the-dmabuf-handling.patch \
            file://0015-vspfilter-Change-returned-values-of-the-functions-th.patch \
            file://0016-vspfilter-Dynamically-specify-the-name-of-a-wpf-outp.patch \
           "

do_install_append() {
        mkdir ${D}/etc/
        install -m644 ${WORKDIR}/gstvspfilter-${MACHINE}.conf ${D}/etc/gstvspfilter.conf
}

FILES_${PN} += " \
	${datadir}/gst-plugins-base/1.0/* \
	${sysconfdir}/*.conf"
