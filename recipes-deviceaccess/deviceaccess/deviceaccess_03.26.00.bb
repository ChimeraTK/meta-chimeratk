SUMMARY = "ChimeraTK core library: Provide (client) access to hardware devices and other control system applications"
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404 \
                    file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/ChimeraTK/DeviceAccess.git;protocol=https;branch=master \
           file://0001-Bump-LibXML-version.patch \
           file://0004-Drop-BAR0-check.patch \
           file://0001-Use-exprtk-from-Yocto.patch \
           file://0002-Do-not-create-pkgconfig-file.patch \
           "

# Modify these as desired
PV = "03.26.00"
SRCREV = "b117e4cf4ebc5b34377aeea102a6c791582996c2"

S = "${WORKDIR}/git"

DEPENDS = "boost cppext exprtk libxml++-5.0 exprtk nlohmann-json"
RDEPENDS_${PN}-dev += "cppext-dev"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
