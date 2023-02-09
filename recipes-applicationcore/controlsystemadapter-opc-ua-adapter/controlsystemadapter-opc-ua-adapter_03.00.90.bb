# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/ChimeraTK/ControlSystemAdapter-OPC-UA-Adapter;protocol=https;branch=history_test \
           file://0001-Remove-RPATH-handling.patch \
           file://0002-Do-not-install-Find-CMake-files.patch \
           "

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "03.00.90"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Doxygen ChimeraTK-ControlSystemAdapter ChimeraTK-DeviceAccess open62541
DEPENDS = "libxml2 boost open62541 deviceaccess controlsystemadapter"

inherit cmake python3native

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

