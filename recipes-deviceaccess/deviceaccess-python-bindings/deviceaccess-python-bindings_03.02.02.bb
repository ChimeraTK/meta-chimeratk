LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/DeviceAccess-PythonBindings.git;protocol=https;branch=master \
           file://0002-original-patch-drop-cmake-version.patch.patch \
           file://0001-Drop-RPATH-from-python-bindings.patch \
           "

PV = "03.02.02"
SRCREV = "5aa5168a6cc727d2a13e447c4912bd394e9b34b3"

S = "${WORKDIR}/git"

DEPENDS = "boost python3 python3-numpy deviceaccess"
RDEPENDS:${PN} = "python3-numpy"

# We are using setuptools3-base here to get the proper FILES defines for python
inherit cmake pkgconfig python3-dir setuptools3-base

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DNUMPY_INCLUDE_DIRS:PATH=${STAGING_DIR_HOST}/${PYTHON_SITEPACKAGES_DIR}/numpy/core/include"

