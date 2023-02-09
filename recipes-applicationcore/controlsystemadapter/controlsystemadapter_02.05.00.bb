# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/ControlSystemAdapter.git;protocol=https;branch=master \
           file://0001-Do-not-install-Find-scripts-at-all.patch \
           file://0002-Skip-library-dirs-and-rpath.patch \
           "

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "d46eca8586edd3b080cbfa87b0c556c4f3c11b15"

S = "${WORKDIR}/git"

# NOTE: the following library dependencies are unknown, ignoring: libatomic
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "libxml++ boost deviceaccess"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

