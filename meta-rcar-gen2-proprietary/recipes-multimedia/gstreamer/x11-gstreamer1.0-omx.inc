FILESEXTRAPATHS_prepend := "${THISDIR}/gstreamer1.0-omx/x11-gstreamer1.0-omx:"

SRC_URI += " \
             file://0001-omx-renesas-rcar-support.patch \
             file://0002-h264dec-support-mp4-container.patch \
             file://0003-omx-change-reset-to-flush.patch \
             file://0004-omx-fix-flushing-issue.patch \
             file://0005-omx-fix-not-negotiated-issue.patch \
             file://0006-omx-workaround-for-timestamp-issue.patch \
             file://0007-support_audiodec_and_aacdec.patch \
             file://0008-omxvideodec-support-no-copy-mode.patch \
             file://0009-omxvideodec-fix_not_negotiated.patch \
             file://0010-support_nal_length_size_1_or_2.patch \
             file://0011-videodec-Manually-calculate-timestamp-if-not-provided.patch \
             file://0012-h264dec-Add-setting-for-StoreUnit-and-Deinterl.patch \
             file://0013-videodec-Support-no-reorder-option.patch \
             file://0014-videodec-Fix-slow-issue-with-filler-data.patch \
             file://0015-videodec-Update-for-no-copy.patch \
             file://0016-videodec-Workaround-for-Decoder-initialize-error.patch \
             file://0017-omxvideodec-release-frames-with-old-PTS-to-avoid-mem.patch \
             file://0018-videodec-Not-clean-older-frames-in-no_reorder.patch \
             file://0019-videodec-Remove-Bug-in-decoder-message.patch \
             file://0020-h264enc-add-omxh264enc.patch \
             file://0021-videodec-add-dmabuf-feature.patch \
             file://0022-omx-fix-two-serious-message-handling-bugs.patch \
             file://0023-videodec-fix-issue-with-wrong-timestamp-ES-stream.patch \
             file://0024-264dec-remove-not-supported-aligment-nal.patch \
             file://0025-videoenc-Align-stride-due-to-limitation-of-encode-MC.patch \
           "
