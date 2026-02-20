SUMMARY = "ChimeraTK Console Hardware Interface"
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ChimeraTK/Chai/;protocol=https;branch=main"

# Modify these as desired
PV = "01.00.03"
SRCREV = "f211114969eda97cf7e39ee441debbc0ce4766cd"

S = "${WORKDIR}/git"

RDEPENDS:${PN} = "deviceaccess-python-bindings python3-platformdirs python3-rich python3-typing-extensions python3-pygments python3-textual"

inherit cmake python3-dir setuptools3-base

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

