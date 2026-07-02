SUMMARY = "An adapter layer which allows to use control applications with different control system software environments"
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464 \
                    file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/ChimeraTK/ControlSystemAdapter.git;protocol=https;branch=master \
           file://0001-Bump-libxml-version-to-5.0.patch \
           file://0001-Do-not-create-pkgconfig-file.patch \
           "

# Modify these as desired
PV = "02.13.03"
SRCREV = "622fe75b2d3b477b3d6df2fbec5a59e4b3aef235"

S = "${WORKDIR}/git"

# NOTE: the following library dependencies are unknown, ignoring: libatomic
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "libxml++-5.0 boost deviceaccess"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

