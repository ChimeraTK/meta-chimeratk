LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/FirmwareProgrammer.git;protocol=https;branch=master"

# Modify these as desired
PV = "04.10.00"
SRCREV = "7e99a80d2369a97e9d5ac59219de1d0fb9c95554"

S = "${WORKDIR}/git"

DEPENDS = "boost deviceaccess ncurses"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
