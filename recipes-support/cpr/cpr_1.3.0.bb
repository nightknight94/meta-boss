DESCRIPTION = "cpr"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/whoshuu/cpr.git;protocol=https"
SRCREV = "92182a6e0ab952d60d823080afd5f9416593317d"

DEPENDS += "curl"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += " -DBUILD_CPR_TESTS=OFF -DUSE_SYSTEM_CURL=ON"
inherit cmake

OECMAKE_C_FLAGS += " -fPIC"
OECMAKE_CXX_FLAGS += " -fPIC"

# cpr library does not support installing with cmake
do_install () {
	install -d ${D}${libdir}
	install -m 0755 ${B}/lib/libcpr.a ${D}${libdir}

	install -d ${D}${includedir}/cpr
	install -m 0755 ${S}/include/cpr/* ${D}${includedir}/cpr
}

ALLOW_EMPTY_${PN} = "1"

BBCLASSEXTEND_append = " native nativesdk"
