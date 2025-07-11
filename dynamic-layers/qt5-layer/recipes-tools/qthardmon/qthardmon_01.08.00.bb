LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/QtHardMon;protocol=https;branch=master \
           file://0001-Look-for-libfmt.patch \
           "

# Modify these as desired
PV = "01.08.00"
SRCREV = "34bcd1c8cbd1fd3772234b573ef79e1c4dd825dd"

S = "${WORKDIR}/git"

DEPENDS = "boost qtbase qtcharts deviceaccess"
RDEPENDS:${PN} += "xauth ttf-bitstream-vera liberation-fonts"

inherit cmake cmake_qt5 pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

