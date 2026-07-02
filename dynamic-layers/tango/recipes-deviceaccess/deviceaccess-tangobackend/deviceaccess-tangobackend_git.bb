# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/DeviceAccess-TangoBackend.git;protocol=https;branch=master \
           file://0001-Do-not-install-pkgconfig-file.patch \
           "

# Modify these as desired
PV = "00.01.03+git"
SRCREV = "fefe3403c99e6df360d81de2a13bd8b0635e6f27"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: nlohmann_json ChimeraTK-DeviceAccess Doxygen
DEPENDS = "boost libxml2 deviceaccess cpptango"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DBUILD_TESTS=OFF"

