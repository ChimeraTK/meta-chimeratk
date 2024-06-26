# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

FILESEXTRAPATHS_prepend := "${THISDIR}/genericdeviceserver:"

SRC_URI = "git://github.com/ChimeraTK/GenericDeviceServer;protocol=https;branch=master \
           file://0001-Drop-RPATH-handling.patch \
           file://0003-Make-internal-library-static.patch \
           file://0001-Lower-CMake-requirement.patch \
           file://0001-Install-XML-Generator.patch \
           "

# Modify these as desired
PV = "01.05.00"
SRCREV = "0adf42c6165b5f1fabdd6259622b137f6c62cdf1"

S = "${WORKDIR}/git"

DEPENDS = "boost applicationcore"

inherit cmake

