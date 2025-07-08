LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/QtHardMon;protocol=https;branch=master"

# Modify these as desired
PV = "01.08.01"
SRCREV = "95fb7f8cc506ea7bcbca92bcd0ea177ac560dc96"

S = "${WORKDIR}/git"

DEPENDS = "boost qtbase qtcharts deviceaccess"
RDEPENDS:${PN} += "xauth ttf-bitstream-vera liberation-fonts"

inherit cmake qt6-cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

