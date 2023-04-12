LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/DeviceAccess-PythonBindings.git;protocol=https;branch=03.01 \
           file://0002-original-patch-drop-cmake-version.patch.patch \
           file://0001-Make-NUMPY-INCLUDES-a-cached-variable.patch \
           file://0001-Drop-RPATH-from-python-bindings.patch \
           file://0001-build-Drop-required-CMake-version.patch \
           file://0001-Also-remote-linker-flags-from-ctk.patch \
           "

PV = "1.0+git${SRCPV}"
SRCREV = "b7cbe792fe1b4938e5615571c10b66afb195b1ca"

S = "${WORKDIR}/git"

DEPENDS = "boost python3 python3-numpy deviceaccess"
RDEPENDS_${PN} = "python3-numpy python3-typing"

# We are using distutils-common-base here to get the proper FILES defines for python
inherit cmake pkgconfig python3-dir distutils-common-base

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DNUMPY_INCLUDE_DIRS:PATH=${STAGING_DIR_HOST}/${PYTHON_SITEPACKAGES_DIR}/numpy/core/include"

