require conf/meta-rcar-gen2-proprietary.inc
LICENSE = "CLOSED"
DEPENDS = " mmngr-kernel-module mmngr-user-module \
			vspm-kernel-module vspm-user-module \
			s3ctl-kernel-module s3ctl-user-module \
			fdpm-kernel-module fdpm-user-module \
			uvcs-kernel-module"

PR = "r0"
PV = "1.0"
PN = "omx-user-module"

SRC_URI = "file://RTM0AC0000XCMCTL20SL32C.tar.bz2;name=file1 \
           file://RTM0AC0000XVCMND20SL32C.tar.bz2;name=file2 \
           file://RTM0AC0000XV264D20SL32C.tar.bz2;name=file3 \
           "
SRC_URI += '${@base_conditional( "H263_DECODER_CONF", "1", " file://RTM0AC0000XV263D20SL32C.tar.bz2;name=file4", "", d )}'
SRC_URI += '${@base_conditional( "MPEG2_DECODER_CONF", "1", " file://RTM0AC0000XVM2VD20SL32C.tar.bz2;name=file5", "", d )}'
SRC_URI += '${@base_conditional( "MPEG4_DECODER_CONF", "1", " file://RTM0AC0000XVM4VD20SL32C.tar.bz2;name=file6", "", d )}'
SRC_URI += '${@base_conditional( "DIVX_DECODER_CONF", "1", " file://RTM0AC0000XVDVXD20SL32C.tar.bz2;name=file7", "", d )}'
SRC_URI += '${@base_conditional( "VC1_DECODER_CONF", "1", " file://RTM0AC0000XVVC1D20SL32C.tar.bz2;name=file8", "", d )}'
SRC_URI += '${@base_conditional( "H264AVC_ENCODER_CONF", "1", " file://RTM0AC0000XV264E20SL32C.tar.bz2;name=file9", "", d )}'
SRC_URI += '${@base_conditional( "VIDEO_COMMON_ENCODER_CONF", "1", " file://RTM0AC0000XVCMNE20SL32C.tar.bz2;name=file10", "", d )}'
SRC_URI += '${@base_conditional( "AUDIO_COMMON_CONF", "1", " file://RTM0AC0000XACMND20SL32C.tar.bz2;name=file11", "", d )}'
SRC_URI += '${@base_conditional( "AACP2_DECODER_CONF", "1", " file://RTM0AC0000XAAAPD20SL32C.tar.bz2;name=file12", "", d )}'
SRC_URI += '${@base_conditional( "MP3_DECODER_CONF", "1", " file://RTM0AC0000XAMP3D20SL32C.tar.bz2;name=file13", "", d )}'
SRC_URI += '${@base_conditional( "WMA_DECODER_CONF", "1", " file://RTM0AC0000XAWMAD20SL32C.tar.bz2;name=file14", "", d )}'
SRC_URI += '${@base_conditional( "DDD_DECODER_CONF", "1", " file://RTM0AC0000XADDDD20SL32C.tar.bz2;name=file15", "", d )}'
SRC_URI += '${@base_conditional( "ALAC_DECODER_CONF", "1", " file://RTM0AC0000XAALAD20SL32C.tar.bz2;name=file16", "", d )}'
SRC_URI += '${@base_conditional( "FLAC_DECODER_CONF", "1", " file://RTM0AC0000XAFLAD20SL32C.tar.bz2;name=file17", "", d )}'
SRC_URI += '${@base_conditional( "AAC_ENCODER_CONF", "1", " file://RTM0AC0000XAAACE20SL32C.tar.bz2;name=file18", "", d )}'
SRC_URI += '${@base_conditional( "ARMAACP2_MDW_DECODER", "1", " file://RTM0AC0000ADAAPMZ1SL32C.tar.bz2;name=file19", "", d )}'
SRC_URI += '${@base_conditional( "MP3_MDW_DECODER", "1", " file://RTM0AC0000ADMP3MZ1SL32C.tar.bz2;name=file20", "", d )}'
SRC_URI += '${@base_conditional( "WMA_MDW_DECODER", "1", " file://RTM0AC0000ADWMAMZ1SL32C.tar.bz2;name=file21", "", d )}'
SRC_URI += '${@base_conditional( "DDD_MDW_DECODER", "1", " file://RTM0AC0000ADDD5MZ1SL32C.tar.bz2;name=file22", "", d )}'
SRC_URI += '${@base_conditional( "ALAC_MDW_DECODER", "1", " file://RCG2ADALAMZ1SL32.tar.bz2;name=file23", "", d )}'
SRC_URI += '${@base_conditional( "FLAC_MDW_DECODER", "1", " file://RCG2ADFLAMZ1SL32.tar.bz2;name=file24", "", d )}'
SRC_URI += '${@base_conditional( "AAC_MDW_ENCODER", "1", " file://RTM0AC0000AEAACMZ1SL32C.tar.bz2;name=file25", "", d )}'

LISTSRC = "RTM0AC0000XCMCTL20SL32C \
           RTM0AC0000XVCMND20SL32C \
           RTM0AC0000XV264D20SL32C"

LISTSRC += '${@base_conditional( "H263_DECODER_CONF", "1", "RTM0AC0000XV263D20SL32C", "", d )}'
LISTSRC += '${@base_conditional( "MPEG2_DECODER_CONF", "1", "RTM0AC0000XVM2VD20SL32C", "", d )}'
LISTSRC += '${@base_conditional( "MPEG4_DECODER_CONF", "1", "RTM0AC0000XVM4VD20SL32C", "", d )}'
LISTSRC += '${@base_conditional( "DIVX_DECODER_CONF", "1", "RTM0AC0000XVDVXD20SL32C", "", d )}'
LISTSRC += '${@base_conditional( "VC1_DECODER_CONF", "1", "RTM0AC0000XVVC1D20SL32C", "", d )}'
LISTSRC += '${@base_conditional( "H264AVC_ENCODER_CONF", "1", "RTM0AC0000XV264E20SL32C", "", d )}'
LISTSRC += '${@base_conditional( "VIDEO_COMMON_ENCODER_CONF", "1", "RTM0AC0000XVCMNE20SL32C", "", d )}'
LISTSRC += '${@base_conditional( "AUDIO_COMMON_CONF", "1", "RTM0AC0000XACMND20SL32C", "", d )}'
LISTSRC += '${@base_conditional( "AACP2_DECODER_CONF", "1", "RTM0AC0000XAAAPD20SL32C", "", d )}'
LISTSRC += '${@base_conditional( "MP3_DECODER_CONF", "1", "RTM0AC0000XAMP3D20SL32C", "", d )}'
LISTSRC += '${@base_conditional( "WMA_DECODER_CONF", "1", "RTM0AC0000XAWMAD20SL32C", "", d )}'
LISTSRC += '${@base_conditional( "DDD_DECODER_CONF", "1", "RTM0AC0000XADDDD20SL32C", "", d )}'
LISTSRC += '${@base_conditional( "ALAC_DECODER_CONF", "1", "RTM0AC0000XAALAD20SL32C", "", d )}'
LISTSRC += '${@base_conditional( "FLAC_DECODER_CONF", "1", "RTM0AC0000XAFLAD20SL32C", "", d )}'
LISTSRC += '${@base_conditional( "AAC_ENCODER_CONF", "1", "RTM0AC0000XAAACE20SL32C", "", d )}'
MIDWARESRC = '${@base_conditional( "ARMAACP2_MDW_DECODER", "1", "RTM0AC0000ADAAPMZ1SL32C", "", d )}'
MIDWARESRC += '${@base_conditional( "MP3_MDW_DECODER", "1", "RTM0AC0000ADMP3MZ1SL32C", "", d )}'
MIDWARESRC += '${@base_conditional( "WMA_MDW_DECODER", "1", "RTM0AC0000ADWMAMZ1SL32C", "", d )}'
MIDWARESRC += '${@base_conditional( "DDD_MDW_DECODER", "1", "RTM0AC0000ADDD5MZ1SL32C", "", d )}'
MIDWARESRC += '${@base_conditional( "ALAC_MDW_DECODER", "1", "RCG2ADALAMZ1SL32", "", d )}'
MIDWARESRC += '${@base_conditional( "FLAC_MDW_DECODER", "1", "RCG2ADFLAMZ1SL32", "", d )}'
MIDWARESRC += '${@base_conditional( "AAC_MDW_ENCODER", "1", "RTM0AC0000AEAACMZ1SL32C", "", d )}'

S = "${WORKDIR}/omx"

do_unpack_append () {
    bb.build.exec_func('do_collect_src', d)
}

do_collect_src() {
    cd ${WORKDIR}
    mkdir -p ${S}
    for dir in ${LISTSRC}; do
        cp -rf ${dir}/Software/* ${S}
        rm -rf ${dir}
    done
    cp -rf ${S}/OMXR/include ${S}/UDF_Linux
    cp -rf ${S}/OMXR/lib/linux/linaro_4_7_3/* ${S}/OMXR/lib/
    rm -rf ${S}/OMXR/lib/linux/
	# Colect audio midleware
	mkdir -p ${S}/audio_mdw
	for dir in ${MIDWARESRC}; do
		cp -rf ${dir}/* ${S}/audio_mdw
		rm -rf ${dir}
	done
}


do_configure() {
	cd ${S}/UDF_Linux
	./autogen.sh
	./configure --prefix=${D}/usr/local/ --host=arm-linux \
		CFLAGS="-I${BUILDDIR}/include -I${KERNELDIR}/include" \
		LDFLAGS="-L${LIBSHARED}" \
		OMXR_DEFAULT_CONFIG_FILE_NAME=/usr/local/config/omxr_config_base.txt
}

do_compile() {
	cd ${S}/UDF_Linux
	make
}

do_install() {
# Create share files
	mkdir -p ${D}/usr/local/lib ${D}/usr/local/config
	cd ${S}/UDF_Linux
	make install
	cp -rf ${S}/OMXR/config/*.txt ${D}/usr/local/config/
	cp -rf ${S}/UDF_Linux/include ${D}/usr/local/include
	cp -rf ${S}/UDF_Linux/include/*.h ${STAGING_INCDIR}

	cd ${S}/OMXR/lib/

	# OMX ctrl part
	ln -s -f libomxr_core.so.2.0.0 libomxr_core.so.2
	ln -s -f libomxr_core.so.2 libomxr_core.so

	ln -s -f libomxr_mc_cmn.so.2.0.0 libomxr_mc_cmn.so.2
	ln -s -f libomxr_mc_cmn.so.2 libomxr_mc_cmn.so

	# Video (decode) common
	ln -s -f libomxr_mc_vcmn.so.2.0.0 libomxr_mc_vcmn.so.2
	ln -s -f libomxr_mc_vcmn.so.2 libomxr_mc_vcmn.so

	ln -s -f libomxr_mc_vdcmn.so.2.0.0 libomxr_mc_vdcmn.so.2
	ln -s -f libomxr_mc_vdcmn.so.2 libomxr_mc_vdcmn.so
	
	ln -s -f libuvcs_dec.so.1.0.0 libuvcs_dec.so.1
	ln -s -f libuvcs_dec.so.1 libuvcs_dec.so

	ln -s -f libvcp3_mcvd.so.1.0.0 libvcp3_mcvd.so.1
	ln -s -f libvcp3_mcvd.so.1 libvcp3_mcvd.so

	# H264 Decoder
	ln -s -f libomxr_mc_h264d.so.2.0.0 libomxr_mc_h264d.so.2
	ln -s -f libomxr_mc_h264d.so.2 libomxr_mc_h264d.so
	
	ln -s -f libvcp3_avcd.so.1.0.0 libvcp3_avcd.so.1
	ln -s -f libvcp3_avcd.so.1 libvcp3_avcd.so
	
		# H263 Decoder
	if [ "X${H263_DECODER_CONF}" = "X1" ] ; then
		ln -s -f libomxr_mc_h263d.so.2.0.0 libomxr_mc_h263d.so.2
		ln -s -f libomxr_mc_h263d.so.2 libomxr_mc_h263d.so

		ln -s -f libvcp3_hv3d.so.1.0.0 libvcp3_hv3d.so.1
		ln -s -f libvcp3_hv3d.so.1 libvcp3_hv3d.so
	fi

	# M2VD decoder
	if [ "X${MPEG2_DECODER_CONF}" = "X1" ] ; then
		ln -s -f libvcp3_m2vd.so.1.0.0 libvcp3_m2vd.so.1
		ln -s -f libvcp3_m2vd.so.1 libvcp3_m2vd.so

		ln -s -f libomxr_mc_m2vd.so.2.0.0 libomxr_mc_m2vd.so.2
		ln -s -f libomxr_mc_m2vd.so.2 libomxr_mc_m2vd.so
	fi

	# M4VD decoder
	if [ "X${MPEG4_DECODER_CONF}" = "X1" ] ; then
		ln -s -f libvcp3_m4vd.so.1.0.0 libvcp3_m4vd.so.1
		ln -s -f libvcp3_m4vd.so.1 libvcp3_m4vd.so

		ln -s -f libomxr_mc_m4vd.so.2.0.0 libomxr_mc_m4vd.so.2
		ln -s -f libomxr_mc_m4vd.so.2 libomxr_mc_m4vd.so
	fi

	# DIVX decoder
	if [ "X${DIVX_DECODER_CONF}" = "X1" ] ; then
		ln -s -f libvcp3_dvxd.so.1.0.0 libvcp3_dvxd.so.1
		ln -s -f libvcp3_dvxd.so.1 libvcp3_dvxd.so

		ln -s -f libomxr_mc_divxd.so.2.0.0 libomxr_mc_divxd.so.2
		ln -s -f libomxr_mc_divxd.so.2 libomxr_mc_divxd.so
	fi

	# VC1D decoder
	if [ "X${VC1_DECODER_CONF}" = "X1" ] ; then
		ln -s -f libvcp3_vc1d.so.1.0.0 libvcp3_vc1d.so.1
		ln -s -f libvcp3_vc1d.so.1 libvcp3_vc1d.so

		ln -s -f libomxr_mc_vc1d.so.2.0.0 libomxr_mc_vc1d.so.2
		ln -s -f libomxr_mc_vc1d.so.2 libomxr_mc_vc1d.so
	fi

	#Encoder
	# H264E
	if [ "X${H264AVC_ENCODER_CONF}" = "X1" ] ; then
		ln -s -f libomxr_mc_h264e.so.2.0.0 libomxr_mc_h264e.so.2
		ln -s -f libomxr_mc_h264e.so.2 libomxr_mc_h264e.so
		
		ln -s -f libvcp3_avce.so.1.0.0 libvcp3_avce.so.1
		ln -s -f libvcp3_avce.so.1 libvcp3_avce.so
	fi

	### Encoder common
	if [ "X${VIDEO_COMMON_ENCODER_CONF}" = "X1" ] ; then
		ln -s -f libomxr_mc_vecmn.so.2.0.0 libomxr_mc_vecmn.so.2
		ln -s -f libomxr_mc_vecmn.so.2 libomxr_mc_vecmn.so

		ln -s -f libuvcs_enc.so.1.0.0 libuvcs_enc.so.1
		ln -s -f libuvcs_enc.so.1 libuvcs_enc.so
		ln -s -f libuvcs_enc.so.1 libuvcsenc.so

		ln -s -f libvcp3_mcve.so.1.0.0 libvcp3_mcve.so.1
		ln -s -f libvcp3_mcve.so.1 libvcp3_mcve.so
	fi
	
	# audio common OMX
	if [ "X${AUDIO_COMMON_CONF}" = "X1" ] ; then
		ln -s -f libomxr_mc_acmn.so.2.0.0 libomxr_mc_acmn.so.2
		ln -s -f libomxr_mc_acmn.so.2 libomxr_mc_acmn.so
	fi

	# aacd OMX
	if [ "X${AACP2_DECODER_CONF}" = "X1" ] ; then
		ln -s -f libomxr_mc_aacd.so.2.0.0 libomxr_mc_aacd.so.2
		ln -s -f libomxr_mc_aacd.so.2 libomxr_mc_aacd.so
	fi

	# mp3 OMX
	if [ "X${MP3_DECODER_CONF}" = "X1" ] ; then
		ln -s -f libomxr_mc_mp3d.so.2.0.0 libomxr_mc_mp3d.so.2
		ln -s -f libomxr_mc_mp3d.so.2 libomxr_mc_mp3d.so
	fi

	# wma OMX
	if [ "X${WMA_DECODER_CONF}" = "X1" ] ; then
		ln -s -f libomxr_mc_wmad.so.2.0.0 libomxr_mc_wmad.so.2
		ln -s -f libomxr_mc_wmad.so.2 libomxr_mc_wmad.so
	fi

	# ddd OMX
	if [ "X${DDD_DECODER_CONF}" = "X1" ] ; then
		ln -s -f libomxr_mc_ddd.so.2.0.0 libomxr_mc_ddd.so.2
		ln -s -f libomxr_mc_ddd.so.2 libomxr_mc_ddd.so
	fi

	# alac OMX
	if [ "X${ALAC_DECODER_CONF}" = "X1" ] ; then
		ln -s -f libomxr_mc_alacd.so.2.0.0 libomxr_mc_alacd.so.2
		ln -s -f libomxr_mc_alacd.so.2 libomxr_mc_alacd.so
	fi

	# flac OMX
	if [ "X${FLAC_DECODER_CONF}" = "X1" ] ; then
		ln -s -f libomxr_mc_flacd.so.2.0.0 libomxr_mc_flacd.so.2
		ln -s -f libomxr_mc_flacd.so.2 libomxr_mc_flacd.so
	fi

	# aac enc omx
	if [ "X${AAC_ENCODER_CONF}" = "X1" ] ; then
		ln -s -f libomxr_mc_aace.so.2.0.0 libomxr_mc_aace.so.2
		ln -s -f libomxr_mc_aace.so.2 libomxr_mc_aace.so
	fi

	# Copy all the symbolic link and lib to destination
	cp -Prf ${S}/OMXR/lib/* ${D}/usr/local/lib
	
	# Copy the audio midleware
	# audio aacp2 midleware
	if [ "X${ARMAACP2_MDW_DECODER}" = "X1" ] ; then
		cd ${S}/audio_mdw
		ln -s -f libRSACPDLA_L.so.1.0 libRSACPDAL_L.so.1.0
		ln -s -f libRSACPDLA_L.so.1.0 libRSACPDLA_L.so.1
		ln -s -f libRSACPDLA_L.so.1 libRSACPDLA_L.so
		ln -s -f libRSACPDAL_L.so.1.0 libRSACPDAL_L.so.1
		ln -s -f libRSACPDAL_L.so.1 libRSACPDAL_L.so
		cp -P ${S}/audio_mdw/*.so* ${D}/usr/local/lib/
		cp -P ${S}/audio_mdw/RSACPD_ADL.h ${D}/usr/local/include
		cp -P ${S}/audio_mdw/RSACPD_ADL.h ${STAGING_INCDIR}
	fi
	
	if [ "X${MP3_MDW_DECODER}" = "X1" ] ; then
		cd ${S}/audio_mdw
		ln -s -f libMP3DLA_L.so.1.0 libMP3DLA_L.so.1
		ln -s -f libMP3DLA_L.so.1 libMP3DLA_L.so
		cp -P ${S}/audio_mdw/*.so* ${D}/usr/local/lib/
		cp -P ${S}/audio_mdw/mp3d_Lib.h ${D}/usr/local/include
		cp -P ${S}/audio_mdw/mp3d_Lib.h ${STAGING_INCDIR}
	fi
	
	if [ "X${WMA_MDW_DECODER}" = "X1" ] ; then
		cd ${S}/audio_mdw
		ln -s -f libWMASTDLA_L.so.1.0 libWMASTDLA_L.so.1
		ln -s -f libWMASTDLA_L.so.1 libWMASTDLA_L.so
		cp -P ${S}/audio_mdw/*.so* ${D}/usr/local/lib/
		cp -P ${S}/audio_mdw/wmastd_Lib.h ${D}/usr/local/include
		cp -P ${S}/audio_mdw/wmastd_Lib.h ${STAGING_INCDIR}
	fi

	if [ "X${DDD_MDW_DECODER}" = "X1" ] ; then
		cd ${S}/audio_mdw
		ln -s -f libRSDACDLA_L.so.1.0 libRSDACDLA_L.so.1
		ln -s -f libRSDACDLA_L.so.1 libRSDACDLA_L.so
		cp -P ${S}/audio_mdw/*.so* ${D}/usr/local/lib/
		cp -P ${S}/audio_mdw/RSDACD_ADL.h ${D}/usr/local/include
		cp -P ${S}/audio_mdw/RSDACD_ADL.h ${STAGING_INCDIR}
	fi

	if [ "X${ALAC_MDW_DECODER}" = "X1" ] ; then
		cd ${S}/audio_mdw
		ln -s -f libALACDLA_L.so.1.0 libALACDLA_L.so.1
		ln -s -f libALACDLA_L.so.1 libALACDLA_L.so
		cp -P ${S}/audio_mdw/*.so* ${D}/usr/local/lib/
		cp -P ${S}/audio_mdw/alacd_Lib.h ${D}/usr/local/include
		cp -P ${S}/audio_mdw/alacd_Lib.h ${STAGING_INCDIR}
	fi

	if [ "X${FLAC_MDW_DECODER}" = "X1" ] ; then
		cd ${S}/audio_mdw
		ln -s -f libFLACDLA_L.so.1.0 libFLACDLA_L.so.1
		ln -s -f libFLACDLA_L.so.1 libFLACDLA_L.so
		cp -P ${S}/audio_mdw/*.so* ${D}/usr/local/lib/
		cp -P ${S}/audio_mdw/flacd_Lib.h ${D}/usr/local/include
		cp -P ${S}/audio_mdw/flacd_Lib.h ${STAGING_INCDIR}
	fi

	if [ "X${AAC_MDW_ENCODER}" = "X1" ] ; then
		cd ${S}/audio_mdw
		ln -s -f libRSAACELA_L.so.1.0 libRSAACELA_L.so.1
		ln -s -f libRSAACELA_L.so.1 libRSAACELA_L.so
		cp -P ${S}/audio_mdw/*.so* ${D}/usr/local/lib/
		cp -P ${S}/audio_mdw/RSAACE_AAC.h ${D}/usr/local/include
		cp -P ${S}/audio_mdw/RSAACE_AAC.h ${STAGING_INCDIR}
	fi
}

SYSROOT_PREPROCESS_FUNCS += "do_populate_share_lib"

do_populate_share_lib () {
	sysroot_stage_dir ${D}/usr/local/lib ${SYSROOT_DESTDIR}/usr/lib
}

# Append function to clean extract source
CLEANFUNCS += 'do_clean_sharedfiles'

do_clean_sharedfiles() {
	rm -rf ${LIBSHARED}/libomxr_*.so*
	rm -rf ${LIBSHARED}/libuvcs*.so*
	rm -rf ${LIBSHARED}/libvcp3_*.so*
	rm -rf ${STAGING_INCDIR}/OMX_*.h
	rm -rf ${STAGING_INCDIR}/OMXR_*.h

	rm -rf ${LIBSHARED}/libRSACPDLA_L.so*
	rm -rf ${LIBSHARED}/libRSACPDAL_L.so*
	rm -rf ${STAGING_INCDIR}/RSACPD_ADL.h
	
	rm -rf ${LIBSHARED}/libMP3DLA_L.so*
	rm -rf ${STAGING_INCDIR}/mp3d_Lib.h

	rm -rf ${LIBSHARED}/libWMASTDLA_L.so*
	rm -rf ${STAGING_INCDIR}/wmastd_Lib.h

	rm -rf ${LIBSHARED}/libRSDACDLA_L.so*
	rm -rf ${STAGING_INCDIR}/RSDACD_ADL.h

	rm -rf ${LIBSHARED}/libALACDLA_L.so*
	rm -rf ${STAGING_INCDIR}/alacd_Lib.h

	rm -rf ${LIBSHARED}/libFLACDLA_L.so*
	rm -rf ${STAGING_INCDIR}/flacd_Lib.h

	rm -rf ${LIBSHARED}/libRSAACELA_L.so*
	rm -rf ${STAGING_INCDIR}/RSAACE_AAC.h
}

PACKAGES = "\
  ${PN} \
  ${PN}-dev \
  ${PN}-staticdev \
"
FILES_${PN} = " \
  /usr/local/lib/*.so \
  /usr/local/lib/*.so.* \
  /usr/local/config/* \
  "
FILES_${PN}-dev = " \
  /usr/local/include/* \
"
FILES_${PN}-staticdev = " \
  /usr/local/lib/*.a \
  /usr/local/lib/*.la \
"
INSANE_SKIP_${PN} += "rpaths"
INSANE_SKIP_${PN} += "dev-so"
INSANE_SKIP_${PN} += "libdir"
INSANE_SKIP_${PN}-dev += "libdir"
RPROVIDES_${PN} += "omx-user-module"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
