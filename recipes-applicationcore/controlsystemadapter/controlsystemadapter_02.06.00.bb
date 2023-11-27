# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464 \
                    file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/ChimeraTK/ControlSystemAdapter.git;protocol=https;branch=master \
           "

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "00f5502069784065dec5b55ceb82e9cc52af5f74"

S = "${WORKDIR}/git"

# NOTE: the following library dependencies are unknown, ignoring: libatomic
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "libxml++ boost deviceaccess"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

