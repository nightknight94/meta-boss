DESCRIPTION = "cpr"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f28c0d4b9780111fb0975c6bbb374d4b"

SRC_URI = "git://github.com/whoshuu/cpr.git;protocol=https"
SRCREV = "feebd2fd5467e219cf124acb5de3f8eee0d0970b"

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
