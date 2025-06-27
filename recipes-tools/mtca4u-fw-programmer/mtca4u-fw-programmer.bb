LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/FirmwareProgrammer.git;protocol=https;branch=master \
           file://0001-Drop-CMake-version.patch \
           file://0002-Search-for-fmt.patch \
           "

# Modify these as desired
PV = "04.10.01"
SRCREV = "1a4020c141b8b5d70baad7ee2f7e0525fd8173fa"

S = "${WORKDIR}/git"

DEPENDS = "boost deviceaccess ncurses"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
