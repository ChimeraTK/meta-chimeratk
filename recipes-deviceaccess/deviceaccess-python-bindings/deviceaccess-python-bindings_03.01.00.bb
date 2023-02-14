LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/DeviceAccess-PythonBindings.git;protocol=https;branch=master \
           file://run-ptest \
           file://0002-original-patch-drop-cmake-version.patch.patch \
           file://0001-Make-NUMPY-INCLUDES-a-cached-variable.patch \
           file://0001-ctk-ptest-paths.patch \
           file://0002-Fix-type-annotation-error-for-older-python.patch \
           "

PV = "1.0+git${SRCPV}"
SRCREV = "daea2bf9a7400f9893bc16956e067d558a565d8d"

S = "${WORKDIR}/git"

DEPENDS = "boost python3 python3-numpy deviceaccess"
RDEPENDS:${PN} = "python3-numpy"

# We are using setuptools3-base here to get the proper FILES defines for python
inherit cmake pkgconfig python3-dir setuptools3-base ptest-ctk

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DNUMPY_INCLUDE_DIRS:PATH=${STAGING_DIR_HOST}/${PYTHON_SITEPACKAGES_DIR}/numpy/core/include"

do_install:append() {
    sed --in-place -e "s,${WORKDIR}/recipe-sysroot-native/usr/bin/python3-native/python3,/usr/bin/python3," ${D}${libdir}/${PN}/installed-tests/CTestTestfile.cmake
    sed --in-place -e "s,${B},${libdir}/${PN}/installed-tests," ${D}${libdir}/${PN}/installed-tests/CTestTestfile.cmake
}