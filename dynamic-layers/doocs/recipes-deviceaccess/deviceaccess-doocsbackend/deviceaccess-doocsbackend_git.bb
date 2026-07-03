# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/DeviceAccess-DoocsBackend.git;protocol=https;branch=master \
           file://0001-Do-not-install-pkgconfig-file.patch \
           file://0002-Bump-Libxml-to-5.0.patch \
           file://0001-Only-depend-on-doocs-server-test-helper-on-tests.patch \
           "

# Modify these as desired
PV = "01.12.01+git"
SRCREV = "5caa55aecae9b18a19273d3bd2bace5caed4e9d4"

S = "${WORKDIR}/git"

DEPENDS = "boost libxml2 deviceaccess doocs-clientlib doocs-serverlib"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DBUILD_TESTS=OFF"

