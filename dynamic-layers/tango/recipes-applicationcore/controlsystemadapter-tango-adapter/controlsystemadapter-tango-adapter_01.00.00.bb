LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/ControlSystemAdapter-TangoAdapter;protocol=https;branch=master \
           file://0001-Drop-CMake-version-requirement.patch \
           "

# Modify these as desired
PV = "01.00.00"
SRCREV = "ce2f778877de3c88e251374bebb6f56d0581074e"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Doxygen
DEPENDS = "controlsystemadapter cpptango"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

