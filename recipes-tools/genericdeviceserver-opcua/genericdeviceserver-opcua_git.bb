# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/GenericDeviceServer;protocol=https;branch=master \
           file://0001-Drop-RPATH-handling.patch \
           file://0003-Make-internal-library-static.patch \
           file://0001-Install-XML-Generator.patch \
           "

# Modify these as desired
PV = "01.04.01"
SRCREV = "103e30063a2ac9e23b2d4c370aa03b8b6c1f6fe8"

S = "${WORKDIR}/git"

DEPENDS = "boost applicationcore controlsystemadapter-opc-ua-adapter"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DADAPTER=OPCUA"

