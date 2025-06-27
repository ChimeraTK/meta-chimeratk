SUMMARY = "Seamless operability between C++11 and Python"
HOMEPAGE = "https://github.com/wjakob/pybind11"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=774f65abd8a7fe3124be2cdf766cd06f"

DEPENDS = "boost"

SRC_URI = "git://github.com/pybind/pybind11.git;branch=v2.10;protocol=https \
           "
SRCREV = "5b0a6fc2017fcc176545afe3e09c9f9885283242"

S = "${WORKDIR}/git"

inherit cmake setuptools3 python3native

do_configure() {
    cmake_do_configure
    cp -a ${S}/* ${B}
}

do_compile() {
    distutils3_do_compile
    cmake_do_compile
}

do_install() {
    distutils3_do_install
    cmake_do_install
}

BBCLASSEXTEND = "native nativesdk"

