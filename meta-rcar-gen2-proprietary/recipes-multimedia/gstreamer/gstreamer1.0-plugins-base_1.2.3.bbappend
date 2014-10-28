include ${@base_conditional("WAYLAND_GFX_ENABLE", "1", \
		"wayland-gstreamer1.0-plugins-base.inc", \
		"x11-gstreamer1.0-plugins-base.inc" , d)}

PACKAGECONFIG_remove = '${@base_conditional("WAYLAND_ENABLE", "1", "orc", "", d)}'

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += '${@base_conditional("WAYLAND_GFX_ENABLE", "1", "file://gstvspfilter-${MACHINE}.conf", "" , d)}'
