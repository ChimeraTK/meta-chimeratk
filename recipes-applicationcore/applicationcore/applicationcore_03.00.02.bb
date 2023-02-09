LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464 \
                    file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/ChimeraTK/ApplicationCore.git;protocol=https;branch=master \
           file://0002-Do-not-set-rpath.patch \
           file://0003-Do-not-install-Find-scripts.patch \
           "

PV = "1.0+git${SRCPV}"
SRCREV = "83ab75cec59d9be85c0d7e7396d6c2702d191bfb"

S = "${WORKDIR}/git"

DEPENDS = "boost controlsystemadapter deviceaccess"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

