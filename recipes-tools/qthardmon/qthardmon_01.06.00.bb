LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI = "git://github.com/ChimeraTK/QtHardMon;protocol=https;branch=master"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "26e6fbe8211e469d4b336a804e24a8d9dce93107"

S = "${WORKDIR}/git"

DEPENDS = "boost qtbase deviceaccess"
RDEPENDS:${PN} += "xauth ttf-bitstream-vera liberation-fonts"

inherit cmake cmake_qt5

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

