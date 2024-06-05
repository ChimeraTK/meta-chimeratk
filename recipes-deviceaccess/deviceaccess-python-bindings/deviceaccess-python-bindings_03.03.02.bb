LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/DeviceAccess-PythonBindings.git;protocol=https;branch=master \
           file://0002-original-patch-drop-cmake-version.patch.patch \
           file://0002-Drop-RPATH-handling.patch \
           file://0003-Hard-code-numpy-include-path.patch \
           file://0001-Do-not-use-Python_SITEARCH.patch \
           file://0001-Drop-CMake-version.patch \
           "

PV = "03.03.02"
SRCREV = "9b8bbcc50f0e48d0c4f3b60a483528d97ac53030"

S = "${WORKDIR}/git"

DEPENDS = "boost python3 python3-numpy deviceaccess"
RDEPENDS_${PN} = "python3-numpy python3-typing"

# We are using distutils-common-base here to get the proper FILES defines for python
inherit python3native cmake pkgconfig python3-dir distutils-common-base

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

