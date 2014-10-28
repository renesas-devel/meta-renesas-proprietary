include renesas-proprietary-multimedia.inc
IMAGE_INSTALL_append = " gstreamer1.0-plugins-base-ximagesink \
						 gstreamer1.0-plugins-base-xvimagesink"

IMAGE_INSTALL_append = "${@ ' gles-test-module' if ${GLES_ENABLE} == 1 \ 
							and ${GLES_TP_ENABLE} == 1 else '' }"
