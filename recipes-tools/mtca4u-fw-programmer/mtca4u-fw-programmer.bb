LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/FirmwareProgrammer.git;protocol=https;branch=master \
           file://0001-Drop-CMake-version.patch \
           file://0002-Remove-link-flags.patch \
           "

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "b34b1081d71fbb945ec8a24e2c4ac15bb363d45f"

S = "${WORKDIR}/git"

DEPENDS = "boost deviceaccess ncurses"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
