LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404 \
                    file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/ChimeraTK/DeviceAccess.git;protocol=https;branch=master \
           file://0001-original-patch-include-directory.patch.patch \
           file://0002-original-patch-drop-cmake-version.patch.patch \
           file://0003-original-patch-bump-xmlpp-requirement.patch.patch \
           file://drop-glib-2.0.patch \
           file://0001-Do-not-set-library-dirs-and-rpath.patch \
           file://0001-Use-getwuid-geteuid-instead-of-getlogin.patch \
           file://0002-Remove-all-rpaths.patch \
           file://0003-Install-all-tests.patch \
           file://0004-Enable-64bit-io-for-pcie-backend.patch \
           "

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "c07b7af0a77f867a13633db0fbc1a7c4df100ae6"

S = "${WORKDIR}/git"

DEPENDS = "boost cppext exprtk libxml++-5.0 exprtk"
RDEPENDS:${PN}-ptest += "boost-test bash"

# ccache temporarily while debugging
inherit cmake pkgconfig ptest-ctk ccache

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

do_install:append() {
    sed --in-place -e "s,${B},${libdir}/${PN}/installed-tests/tests/," ${D}${libdir}/${PN}/installed-tests/tests/CTestTestfile.cmake

    # Drop this test which checks the compiler
    sed --in-place -e "/VirtualFunctionTemplate/d" ${D}${libdir}/${PN}/installed-tests/tests/CTestTestfile.cmake

    sed --in-place -e "s,${B},${libdir}/${PN}/installed-tests," ${D}${libdir}/${PN}/installed-tests/tests/dMapDir/valid.dmap
    sed --in-place -e "s,${B},${libdir}/${PN}/installed-tests," ${D}${libdir}/${PN}/installed-tests/tests/valid.dmap
    sed --in-place -e "s,${B},${libdir}/${PN}/installed-tests," ${D}${libdir}/${PN}/installed-tests/tests/runtimeLoading/runtimeLoading.dmap

    # This is too big for 32bit machines, just drop it
    sed --in-place -e "/PERFTEST.BIGPLAIN/d" ${D}/${libdir}/${PN}/installed-tests/tests/testDummyRegisterAccessors.map
}
