FILESEXTRAPATHS_prepend := "${THISDIR}/gstreamer1.0-omx/wayland-gstreamer1.0-omx:"

SRC_URI += " \
             file://0016-Revert-omxvideodec-remove-the-data-packets-left-queu.patch \
             file://0017-Revert-omxh264dec-allow-to-accept-H.264-stream-in-a-.patch \
             file://0018-gstomx.conf-use-REL-OMXIL-library-and-give-a-top-pri.patch \
             file://0019-gstomx.conf-Use-REL-OMXIL-library.patch \
             file://0020-gstomx-set-the-default-path-of-gstomx.conf.patch \
             file://0021-omxvideodec-support-zero-copy-buffer-output-to-the-d.patch \
             file://0022-omxvideodec-Fix-incorrect-UV-plane-addressing.patch \
             file://0023-omxvideodec-Generalize-the-output-buffer-creation-fo.patch \
             file://0024-omxvideodec-Group-the-input-buffer-copying-into-a-fu.patch \
             file://0025-omxh264dec-Retrieve-necessary-information-from-codec.patch \
             file://0026-omxh264dec-Support-the-frame-unit-input-into-REL-OMX.patch \
             file://0027-omxvideodec-Don-t-set-the-OMX_BUFFERFLAG_ENDOFFRAME-.patch \
             file://0028-omxh264dec-Remove-parsed-field-from-the-template-cap.patch \
             file://0029-gstomx-Move-output-buffers-sending-into-the-omx-comp.patch \
             file://0030-Support-audiodec-and-aacdec.patch \
             file://0001-omxvideodec-release-frames-with-old-PTS-to-avoid-mem.patch \
             file://0001-omx-fix-two-serious-message-handling-bugs.patch \
           "
