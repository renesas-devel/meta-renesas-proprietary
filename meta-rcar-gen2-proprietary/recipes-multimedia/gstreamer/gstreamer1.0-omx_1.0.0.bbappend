DEPENDS += "gstreamer1.0 gstreamer1.0-plugins-base omx-user-module"

EXTRA_OECONF += "--with-omx-target=rcar"

# Overwrite do_install[postfuncs] += " set_omx_core_name "
# because it will force the plugin to use bellagio instead of our config
do_install[postfuncs] = " "
include ${@base_conditional("WAYLAND_GFX_ENABLE", "1", "wayland-gstreamer1.0-omx.inc", "x11-gstreamer1.0-omx.inc", d)}
