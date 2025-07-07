LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464 \
                    file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/ChimeraTK/ApplicationCore.git;protocol=https;branch=04.02 \
           file://0004-Drop-glib2-dependency.patch \
           file://0002-Do-not-set-rpath.patch \
           file://0002-Add-fmt-package-dragged-in-from-cppext.patch \
           file://0003-Drop-unneccessary-constructor.-Fails-to-compile-with.patch \
           file://0017-Remove-unportable-c-32-code.patch \
           file://0001-feat-project-template-Add-soVersion-to-VersionInfo-t.patch \
           file://0002-fix-put-PyApplicationCore-bindings-into-versioned-di.patch \
           file://0003-fix-python-paths.patch \
           file://0010-Do-not-run-stubgen.patch \
           file://0011-Do-not-leak-build-path-into-python-install.patch \
           file://0012-Remove-unsupported-C-20.patch \
           file://0001-Bump-libxml-to-5.0.patch \
           "

PV = "04.02.02"
SRCREV = "6098f6f1af7d252b2bc946f446e9350574ad510c"

S = "${WORKDIR}/git"

DEPENDS = "boost controlsystemadapter deviceaccess python3 python3-pybind11 libxml++-5.0"
RDEPENDS_${PN} += "python3-core"
FILES_${PN} += "${libdir}/${PYTHON_DIR}/site-packages"

inherit cmake pkgconfig python3targetconfig python3-dir distutils-common-base

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DBUILD_TESTS=Off"

