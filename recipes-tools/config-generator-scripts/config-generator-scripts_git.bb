# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://gitlab.desy.de/msk-sw/utilities/config-generator/config-generator-scripts.git;protocol=https;branch=master \
           file://0001-Do-not-look-for-Mako.patch \
           "

# Modify these as desired
PV = "03.05.01+git"
SRCREV = "be524ac3e131813b367c6bacd82b6f583a8cc44d"

S = "${WORKDIR}/git"

DEPENDS = "python3-mako"
RDEPENDS:${PN} = "python3-platformdirs python3-mako"
FILES:${PN} = "/usr/share/ConfigGenerator03.05"

# NOTE: unable to map the following CMake package dependencies: Python3 Mako
inherit cmake python3-dir setuptools3-base

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

