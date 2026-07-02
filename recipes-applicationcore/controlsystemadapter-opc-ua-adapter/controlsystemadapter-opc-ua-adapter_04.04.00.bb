SUMMARY = "An adapter layer which allows to use control applications with different control system software environments"
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/ControlSystemAdapter-OPC-UA-Adapter;protocol=https;branch=master \
           file://0001-csa-opc-ua-Remove-RPATH-handling.patch \
           file://0001-Disable-mapfile-generator.patch \
           file://0002-Remove-old-configuration-files.patch \
           "

# Modify these as desired
PV = "04.04.00"
SRCREV = "32cddf9cbd7fed82dd5f6472c7ed7f9c338f38d6"

S = "${WORKDIR}/git"

DEPENDS = "libxml2 boost open62541 deviceaccess controlsystemadapter"

inherit cmake python3native

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DBUILD_TESTS=OFF"

