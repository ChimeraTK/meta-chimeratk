LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/QtHardMon;protocol=https;branch=master \
           file://0001-Drop-CMake-version.patch \
           file://0001-Search-for-fmt.patch \
           "

# Modify these as desired
PV = "01.07.01"
SRCREV = "60f966178b985009b4512c8ad21c0a9882d63c0a"

S = "${WORKDIR}/git"

DEPENDS = "boost qtbase deviceaccess"
RDEPENDS_${PN} += "xauth ttf-bitstream-vera liberation-fonts"

inherit cmake cmake_qt5

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

