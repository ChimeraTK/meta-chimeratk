# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464 \
                    file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/ChimeraTK/ControlSystemAdapter.git;protocol=https;branch=master \
           file://0001-Drop-CMake-requirement.patch \
           file://0001-Drop-libatomic.patch \
           "

# Modify these as desired
PV = "02.08.00"
SRCREV = "b0801fc8d2bb80da4c421bd648d11dd3033e9f37"

S = "${WORKDIR}/git"

# NOTE: the following library dependencies are unknown, ignoring: libatomic
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "libxml++ boost deviceaccess"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

