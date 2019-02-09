DESCRIPTION = "rpclib"

# Check license from repo
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/rpclib/rpclib.git;protocol=https"
SRCREV = "598a691b9e40e3c0038a0df7f2f94af985c4a3d8"

# Need to change so cmake will find CMakeLists.txt
S = "${WORKDIR}/git"

inherit cmake
