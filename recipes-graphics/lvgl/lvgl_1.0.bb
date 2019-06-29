DESCRIPTION = "Open-source Embedded GUI Library"
HOMEPAGE = "https://littlevgl.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# DEPENDS = ""

SRC_URI = " \
	git://github.com/littlevgl/lvgl.git;name=lvgl;protocol=https;destsuffix=git/lvgl \
	git://github.com/littlevgl/lv_drivers.git;name=lvdrivers;protocol=https;destsuffix=git/lv_drivers \
	\
	file://CMakeLists.txt;subdir=git/ \
	file://lv_drv_conf.h;subdir=git/ \
	file://lv_conf.h;subdir=git/ \
"
SRCREV_lvgl = "4139cd619bbfed1b2295f8175e9fb710f9abb8af"
SRCREV_lvdrivers = "a688824dfea92e14001600767b60765950db0136"

S = "${WORKDIR}/git"

inherit cmake

# We build only static library (needed to include in SDK)
ALLOW_EMPTY_${PN} = "1"

BBCLASSEXTEND = "native nativesdk"
