RDEPENDS:${PN}-ptest += "make cmake"

FILES:${PN}-ptest += "${libdir}/${PN}/installed-tests/"

inherit ptest

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE:append = " ${@bb.utils.contains('PTEST_ENABLED', '1', '-DBUILD_TESTS=ON -DINSTALL_TESTS=ON -DTEST_INSTALL_FOLDER=${libdir}/${PN}/installed-tests', '-DBUILD_TESTS=OFF -DINSTALL_TESTS=OFF', d)}"
