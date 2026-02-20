SUMMARY = "ControlSystemAdapter implementation for the Tango Controls framework"
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/ControlSystemAdapter-TangoAdapter;protocol=https;branch=master \
           file://0001-Bump-libxml-API-to-5.0.patch \
           file://0002-Remove-old-configuration-files.patch \
           "

# Modify these as desired
PV = "02.00.02"
SRCREV = "c32dbddb36587f7719b41c446f895755d3b6ed78"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Doxygen
DEPENDS = "controlsystemadapter cpptango"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DBUILD_TESTS=OFF"

