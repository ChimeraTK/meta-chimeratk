LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404 \
                    file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/ChimeraTK/DeviceAccess.git;protocol=https;branch=master \
           file://0001-Bump-LibXML-version.patch \
           file://0001-Use-exprtk-from-Yocto.patch \
           file://0001-Add-missing-memory-include.patch \
           file://0004-Drop-BAR0-check.patch \
           "

# Modify these as desired
PV = "03.15.01"
SRCREV = "6388257aeeea097131ffc3a2b2dc0237566e59a7"

S = "${WORKDIR}/git"

DEPENDS = "boost cppext exprtk libxml++-5.0 exprtk nlohmann-json"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
