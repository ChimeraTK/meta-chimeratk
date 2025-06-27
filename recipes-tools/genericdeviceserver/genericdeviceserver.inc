# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

FILESEXTRAPATHS:prepend := "${THISDIR}/genericdeviceserver:"

SRC_URI = "git://github.com/ChimeraTK/GenericDeviceServer;protocol=https;branch=master \
           file://0001-Drop-RPATH-handling.patch \
           file://0003-Make-internal-library-static.patch \
           file://0001-Install-XML-Generator.patch \
           file://0001-Add-fmt.patch \
           "

# Modify these as desired
PV = "02.00.01"
SRCREV = "586d3ee497cfee5a2b436891fdc7d23daac96999"

S = "${WORKDIR}/git"

DEPENDS = "boost applicationcore"

inherit cmake

