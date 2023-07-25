LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464 \
                    file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/ChimeraTK/ApplicationCore.git;protocol=https;branch=master \
           file://0001-Bump-libxml-to-5.0.patch \
           file://0002-Remove-explicit-glib-dependency.patch \
           file://0003-Remote-install-rpath.patch \
           "

PV = "1.0+git${SRCPV}"
SRCREV = "54673e1aff99a167a5b70a601b985d1dac7fcd75"

S = "${WORKDIR}/git"

DEPENDS = "boost controlsystemadapter deviceaccess"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
