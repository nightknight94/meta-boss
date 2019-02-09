# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb
 
# Include modules in rootfs
IMAGE_INSTALL_append = " vim"

IMAGE_FEATURES_append = " ssh-server-dropbear"

TOOLCHAIN_HOST_TASK += " \
                        nativesdk-wiringpi \
                        nativesdk-wiringpi-dev \
                        nativesdk-gtest \
                        nativesdk-gtest-dev \
                       "
TOOLCHAIN_TARGET_TASK += " \
                          wiringpi \
                         "