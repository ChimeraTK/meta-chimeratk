LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464 \
                    file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/ChimeraTK/ApplicationCore.git;protocol=https;branch=master \
           file://0003-Remote-install-rpath.patch \
           file://0003-Drop-CMake-requirements.patch \
           file://0004-Remove-install-rpath-part-2.patch \
           file://0004-Drop-glib2-dependency.patch \
           "

PV = "03.06.00"
SRCREV = "1b3a59eab6ea5a13992217a4bf93ab22663e9ca5"

S = "${WORKDIR}/git"

DEPENDS = "boost controlsystemadapter deviceaccess"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

