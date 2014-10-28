DEPENDS += "gstreamer1.0"

include ${@base_conditional("WAYLAND_GFX_ENABLE", "1", \
		"wayland-gstreamer1.0-plugins-good.inc", \
		"x11-gstreamer1.0-plugins-good.inc", d)}
