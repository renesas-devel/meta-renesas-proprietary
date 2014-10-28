MULTIMEDIA_INSTALL = '${@base_conditional( "MULTIMEDIA_ENABLE", "1", "${MULTIMEDIA_TP_ENABLE}", "0", d )}'
IMAGE_INSTALL_append = '${@base_conditional( "MULTIMEDIA_INSTALL", "1", " mmngr-tp-user-module \
                                                                          mmngrbuf-tp-user-module \
                                                                          vspm-tp-user-module \
                                                                          s3ctl-tp-user-module \
                                                                          fdpm-tp-user-module", \
                                                                          "", d )}'

MULTIMEDIA_PKGS = " mmngr-kernel-module mmngrbuf-kernel-module mmngr-user-module mmngrbuf-user-module \
					mmngrbuf-user-module-dev fdpm-kernel-module fdpm-user-module vspm-kernel-module \
					vspm-user-module s3ctl-kernel-module s3ctl-user-module uvcs-kernel-module omx-user-module"

IMAGE_INSTALL_append = '${@ "${MULTIMEDIA_PKGS}" if ${MULTIMEDIA_ENABLE} == 1 or ${DTV_ENABLE} == 1 else ""}'

IMAGE_INSTALL_append = " gstreamer1.0-plugins-good-audioparsers \
						 gstreamer1.0-plugins-bad-faad"

IMAGE_INSTALL_append = " media-ctl"

# Add DTV packages to image
IMAGE_INSTALL_append = '${@base_conditional( "DTV_ENABLE", "1", " scu-kernel-module ssp-kernel-module dtv dtv-dev dtv-staticdev", "", d )}'

IMAGE_INSTALL_append = " gstreamer1.0-meta-base \
						 gstreamer1.0-meta-audio \
						 gstreamer1.0-meta-video \
						 gstreamer1.0-plugins-base-audioconvert \
						 gstreamer1.0-plugins-base-audioresample \
						 gstreamer1.0-plugins-base-playback \
						 gstreamer1.0-plugins-base-videoconvert \
						 gstreamer1.0-plugins-base-typefindfunctions \
						 gstreamer1.0-plugins-base-videoscale \
						 gstreamer1.0-plugins-good-avi \
						 gstreamer1.0-plugins-good-id3demux \
						 gstreamer1.0-plugins-bad-mpegtsdemux \
						 gstreamer1.0-plugins-bad-debugutilsbad \
						 "
