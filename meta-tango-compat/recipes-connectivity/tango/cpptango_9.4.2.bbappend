DEPENDS:remove = "doxygen-native graphviz-native"

SRC_URI = "git://gitlab.com/tango-controls/cppTango.git;protocol=https;nobranch=1 \
	"
SRC_URI[sha256sum] = "e6332d14242c493ad89ed2ef437646541fa7cfb74258fa90e6d8a4ba67b17402"

# ZMQ pkgconfig leaks system paths in the compile test, so we force tango to accept this is a good
# ZMQ version (4.8 which is > 4.0.5)
EXTRA_OECMAKE += " -DTANGO_ZMQ_USABLE_VERSION=On"

EXTRA_OECMAKE_BUILD:remove = "doc"
do_compile:append() {
    mkdir ${B}/doc_html
}

inherit cmake python3native pkgconfig

BBCLASSEXTEND = "nativesdk"
