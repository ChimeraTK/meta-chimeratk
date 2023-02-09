# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/GenericDeviceServer;protocol=https;branch=master \
           file://0001-Drop-RPATH-handling.patch \
           file://0002-Drop-hard-dependency-on-DOOCS.patch \
           file://0003-Make-internal-library-static.patch \
           file://0001-Lower-CMake-requirement.patch \
           "

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "7cfa924fb9a983ac2e7383eaf15bcaa8996a29bd"

S = "${WORKDIR}/git"

DEPENDS = "boost applicationcore controlsystemadapter-opc-ua-adapter"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DADAPTER=OPCUA"

