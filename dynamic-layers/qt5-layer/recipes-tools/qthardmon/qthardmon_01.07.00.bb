LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI = "git://github.com/ChimeraTK/QtHardMon;protocol=https;branch=master \
           file://0001-Drop-CMake-version.patch \
           "

# Modify these as desired
PV = "01.07.00"
SRCREV = "6341ff4356eb2432a2f493aed3feeb8f83ff5688"

S = "${WORKDIR}/git"

DEPENDS = "boost qtbase deviceaccess"
RDEPENDS_${PN} += "xauth ttf-bitstream-vera liberation-fonts"

inherit cmake cmake_qt5

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

