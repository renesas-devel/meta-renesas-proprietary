include renesas-proprietary-multimedia.inc
IMAGE_INSTALL += '${@ "gstreamer1.0-plugins-base-vspfilter" if ${MULTIMEDIA_ENABLE} == 1 and ${WAYLAND_GFX_ENABLE} == 1 else ""}'
