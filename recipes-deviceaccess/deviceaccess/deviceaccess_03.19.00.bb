LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404 \
                    file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/ChimeraTK/DeviceAccess.git;protocol=https;branch=03.19 \
           file://0001-Bump-LibXML-version.patch \
           file://0001-Use-exprtk-from-Yocto.patch \
           file://0004-Drop-BAR0-check.patch \
           file://0002-Remove-old-configuration-files.patch \
           file://0001-fix-build-with-newer-boost-versions.patch \
           "

# Modify these as desired
PV = "03.19.00"
SRCREV = "15ca32a93f8f2c436582d2108934570a06e96f55"

S = "${WORKDIR}/git"

DEPENDS = "boost cppext exprtk libxml++-5.0 exprtk nlohmann-json"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
