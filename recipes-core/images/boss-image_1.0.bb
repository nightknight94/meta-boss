# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs
IMAGE_INSTALL_append = " \ 
                        vim      \
                        kernel-modules \
                        i2c-tools \
                        wiringpi \
                        libstdc++ \
                        \
                        linux-firmware-bcm43430 \
                        wpa-supplicant \
                        ntp \
                        tzdata \
                        tzdata-europe \
                       "

# hostapd dhcp-server iptables 


DISTRO_FEATURES += "wifi"
IMAGE_FEATURES_append = " ssh-server-dropbear"

TOOLCHAIN_HOST_TASK += " \
                         nativesdk-wiringpi      \
                         nativesdk-wiringpi-dev  \
                         nativesdk-gtest         \
                         nativesdk-gtest-dev     \
                         nativesdk-curl          \
                         nativesdk-curl-dev      \
                         nativesdk-cpr-dev       \
                         nativesdk-cpr-staticdev \
                         nativesdk-jsoncpp       \
                         nativesdk-jsoncpp-dev   \
                        "

TOOLCHAIN_TARGET_TASK += " \
                           wiringpi       \
                           curl           \
                           cpr-dev        \
                           cpr-staticdev  \
                           jsoncpp        \
                           jsoncpp-dev    \
                         "
