LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

# gitsm = including submodules
SRC_URI = "gitsm://github.com/ChimeraTK/exprtk-interface.git;branch=master;protocol=https \
           file://drop-cmake-version.patch"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "715f4058cd12d49511f170fe01e6e6e41d0923a9"

S = "${WORKDIR}/git"

inherit pkgconfig cmake

  
# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

