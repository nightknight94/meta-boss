include recipes-core/images/core-image-minimal.bb

# Temporary 
DEVELOPEMENT_PKGS = " \ 
    \
    libstdc++ \
    \
    ntp \
    tzdata \
    tzdata-europe \
"

# TODO: check if this config will pull wayland on warrior
# propably one of them pulls strange dependencies
#    vim \ 40mb
#    kernel-modules \ 70 mb

#    hostapd dhcp-server iptables


# Needed for wifi to work properly
WIFI_REQUIRED_PKGS = " \
    linux-firmware-bcm43430 \
    wpa-supplicant \
"
#linux-firmware-rpidistro-bcm43430

DISTRO_FEATURES = "wifi"

# TODO: custom distro
# TODO: set machine and distro with `export`

IMAGE_FEATURES = "debug-tweaks ssh-server-dropbear"
IMAGE_INSTALL_append = " ${WIFI_REQUIRED_PKGS} ${DEVELOPEMENT_PKGS}"

# check if this will work:
#     host with +=
#     target with =
# or do I even care about sdk size?
TOOLCHAIN_HOST_TASK += " \
    nativesdk-gtest-dev      \
    nativesdk-cpr-dev        \
    nativesdk-cpr-staticdev  \
    nativesdk-jsoncpp-dev    \
    nativesdk-lvgl-staticdev \
"

TOOLCHAIN_TARGET_TASK += " \
    cpr-staticdev  \
    jsoncpp-dev    \
    lvgl-staticdev \
"
