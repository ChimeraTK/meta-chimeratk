# FIXME: the LIC_FILES_CHKSUM values have been updated by 'devtool upgrade'.
# The following is the difference between the old and the new license text.
# Please update the LICENSE value if needed, and summarize the changes in
# the commit message via 'License-Update:' tag.
# (example: 'License-Update: copyright years updated.')
#
# The changes:
#
# --- LICENSE
# +++ LICENSE
# @@ -1,7 +1,7 @@
#                     GNU LESSER GENERAL PUBLIC LICENSE
#                         Version 3, 29 June 2007
#  
# - Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
# + Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>
#   Everyone is permitted to copy and distribute verbatim copies
#   of this license document, but changing it is not allowed.
#  
# 
#

# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/ControlSystemAdapter-OPC-UA-Adapter;protocol=https;branch=master \
           file://0001-csa-opc-ua-Remove-RPATH-handling.patch \
           file://0001-Disable-mapfile-generator.patch \
           "

# Modify these as desired
PV = "04.00.04"
SRCREV = "2653b5a123946c63723c5db618f6a3cf7ba80fd8"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Doxygen ChimeraTK-ControlSystemAdapter ChimeraTK-DeviceAccess open62541
DEPENDS = "libxml2 boost open62541 deviceaccess controlsystemadapter"

inherit cmake python3native

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DBUILD_TESTS=OFF"

