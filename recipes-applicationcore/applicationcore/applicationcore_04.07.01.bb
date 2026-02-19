LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464 \
                    file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/ChimeraTK/ApplicationCore.git;protocol=https;branch=master \
           file://0004-Drop-glib2-dependency.patch \
           file://0002-Do-not-set-rpath.patch \
           file://0001-Do-not-leak-build-sysroot-into-install.patch \
           file://0005-Bump-libxml-to-5.0-API.patch \
           file://0001-Do-not-run-stubgen.patch \
           file://0002-do-not-create-pkgconfig-files.patch \
           "

PV = "04.07.01"
SRCREV = "39b1103d794cd8790a4dc5d7cef55a9ff1d81eea"

S = "${WORKDIR}/git"

DEPENDS = "boost controlsystemadapter deviceaccess python3 python3-pybind11"
RDEPENDS:${PN} += "python3-core"
FILES:${PN} += "${libdir}/${PYTHON_DIR}/site-packages"

inherit cmake pkgconfig python3targetconfig python3-dir setuptools3-base

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DBUILD_TESTS=OFF"

