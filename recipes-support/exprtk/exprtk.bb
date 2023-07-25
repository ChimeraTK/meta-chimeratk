LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

# gitsm = including submodules
SRC_URI = "gitsm://github.com/ChimeraTK/exprtk-interface.git;branch=master;protocol=https \
           file://0001-Drop-CMake-version-requirement.patch \
           "

# Modify these as desired
PV = "01.04.00"
SRCREV = "6f186424311a57b9fef3f71b06446be3aad1e14d"

S = "${WORKDIR}/git"

inherit pkgconfig cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

