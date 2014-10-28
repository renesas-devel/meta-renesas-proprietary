include ${@base_conditional("WAYLAND_ENABLE", "1", \
		"wayland-gstreamer1.0-plugins-bad.inc", \
		"x11-gstreamer1.0-plugins-bad.inc" , d)}
