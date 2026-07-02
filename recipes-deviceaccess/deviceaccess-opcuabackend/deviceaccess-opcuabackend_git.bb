# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/DeviceAccess-OpcUaBackend.git;protocol=https;branch=master \
           file://0001-Bump-libxml-to-5.0.patch \
           file://0002-Drop-RPATH-handling.patch \
           file://0001-Do-not-install-pkgconfig-file.patch \
           "

# Modify these as desired
PV = "01.07.01+git"
SRCREV = "a43a5484f2d4972e4ff86c7cfe43fe8bab3ad008"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: open62541 ChimeraTK-DeviceAccess
DEPENDS = "boost deviceaccess open62541 libxml++-5.0"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

