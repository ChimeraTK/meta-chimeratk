DESCRIPTION = "TANGO is an object oriented distributed control system using CORBA \
(synchronous and asynchronous communication) and zeromq (event based communication)"
HOMEPAGE = "http://www.tango-controls.org"
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c9432eab6a070a936cf9da6191d6db6"

DEPENDS += "omniorb-native omniorb tango-idl cppzmq libjpeg-turbo doxygen-native graphviz-native"

SRC_URI = "https://gitlab.com/tango-controls/cppTango/-/archive/9.4.2/cppTango-9.4.2.tar.bz2 \
	"
SRC_URI[sha256sum] = "e6332d14242c493ad89ed2ef437646541fa7cfb74258fa90e6d8a4ba67b17402"

S = "${WORKDIR}/cppTango-9.4.2"

# ZMQ pkgconfig leaks system paths in the compile test, so we force tango to accept this is a good
# ZMQ version (4.8 which is > 4.0.5)
EXTRA_OECMAKE += " -DTANGO_IDL_BASE=${STAGING_EXECPREFIXDIR} -DCMAKE_BUILD_TYPE=Release \
	-DBUILD_TESTING=OFF -DOMNIIDL_TEST_RUN=0 -DTANGO_ZMQ_USABLE_VERSION=On"
EXTRA_OECMAKE_BUILD = "doc"

do_install:append() {
	install -d ${D}${docdir}/${BPN}
	cp -R ${B}/doc_html ${D}${docdir}/${BPN}/
}

inherit cmake python3native pkgconfig

BBCLASSEXTEND = "nativesdk"
