# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464 \
                    file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/ChimeraTK/ControlSystemAdapter.git;protocol=https;branch=master \
           file://0001-Bump-libxml-version-to-5.0.patch \
           file://0002-Remove-old-configuration-files.patch \
           "

# Modify these as desired
PV = "02.12.00"
SRCREV = "756d32b7f50c395c6ef9be04a2e9e4fa1f55e1a1"

S = "${WORKDIR}/git"

# NOTE: the following library dependencies are unknown, ignoring: libatomic
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "libxml++-5.0 boost deviceaccess"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

