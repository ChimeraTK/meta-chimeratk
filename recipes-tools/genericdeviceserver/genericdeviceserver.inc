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
           "

# Modify these as desired
PV = "02.03.00"
SRCREV = "0a3ae763b2e5cb36e069d07e2bb239d80a4e476d"

S = "${WORKDIR}/git"

DEPENDS = "boost applicationcore"

inherit cmake

