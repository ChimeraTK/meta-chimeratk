# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/ChimeraTK/ControlSystemAdapter-OPC-UA-Adapter;protocol=https;branch=master \
           file://0001-csa-opc-ua-Remove-RPATH-handling.patch \
           "

# Modify these as desired
PV = "03.02.02"
SRCREV = "5a3fa2f6d83016c17ca926b67aba3cee5f0618a8"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Doxygen ChimeraTK-ControlSystemAdapter ChimeraTK-DeviceAccess open62541
DEPENDS = "libxml2 boost open62541 deviceaccess controlsystemadapter"

inherit cmake python3native

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

