SUMMARY = "Tools for building C/C++ binaries"

inherit packagegroup

RDEPENDS_${PN} = " \
    nativesdk-gcc \
    nativesdk-gcc-symlinks \
    nativesdk-g++ \
    nativesdk-g++-symlinks \
    nativesdk-libstdc++ \
    nativesdk-libstdc++-dev \
    nativesdk-cmake \
    "

# meta/recipes-core/packagegroups/nativesdk...
