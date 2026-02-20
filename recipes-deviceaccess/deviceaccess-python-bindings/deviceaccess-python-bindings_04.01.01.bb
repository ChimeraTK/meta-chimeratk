SUMMARY = "Python bindings for the ChimeraTK DeviceAccess library"
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/DeviceAccess-PythonBindings.git;protocol=https;branch=master \
           file://0002-original-patch-drop-cmake-version.patch.patch \
           file://0002-Drop-RPATH-handling.patch \
           file://0003-Disable-stubgen.patch \
           file://0004-Do-not-install-matlab-hack-on-Yocto.patch \
           "

PV = "04.01.01"
SRCREV = "4da3ba96e524938591620881a593977e2c97e439"

S = "${WORKDIR}/git"

DEPENDS = "python3 python3-pybind11 python3-numpy deviceaccess"
RDEPENDS:${PN} = "python3-numpy python3-core"

# We are using setuptools3-base here to get the proper FILES defines for python
inherit cmake pkgconfig python3-dir setuptools3-base

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DNUMPY_INCLUDE_DIRS:PATH=${STAGING_DIR_HOST}/${PYTHON_SITEPACKAGES_DIR}/numpy/core/include"

