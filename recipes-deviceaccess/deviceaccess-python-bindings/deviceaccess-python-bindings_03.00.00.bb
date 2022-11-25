LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/DeviceAccess-PythonBindings.git;protocol=https;branch=master \
           file://0002-original-patch-drop-cmake-version.patch.patch \
           file://0001-Make-NUMPY-INCLUDES-a-cached-variable.patch \
           "

PV = "1.0+git${SRCPV}"
SRCREV = "fd73e4882f22e9d91e409119410f883d9696cf49"

S = "${WORKDIR}/git"

DEPENDS = "boost python3 python3-numpy deviceaccess"
RDEPENDS_${PN} = "python3-numpy python3-typing"

# We are using distutils-common-base here to get the proper FILES defines for python
inherit cmake pkgconfig python3-dir distutils-common-base

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DNUMPY_INCLUDE_DIRS:PATH=${STAGING_DIR_HOST}/${PYTHON_SITEPACKAGES_DIR}/numpy/core/include"
