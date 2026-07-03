SUMMARY = "ControlSystemAdapter implementation for the Tango Controls framework"
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/ControlSystemAdapter-DoocsAdapter;protocol=https;branch=master \
           file://0002-Remove-old-configuration-files.patch \
           file://0002-Bump-libxml-to-5.0.patch \
           file://0001-doocs-server-test-helper-only-in-test-build.patch \
           "

# Modify these as desired
PV = "01.16.00"
SRCREV = "3c7736e9b24c6062298062004ed70494b77c54d8"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Doxygen
DEPENDS = "controlsystemadapter doocs-clientlib doocs-serverlib"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DBUILD_TESTS=OFF"

