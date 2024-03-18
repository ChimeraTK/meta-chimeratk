LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404 \
                    file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/ChimeraTK/DeviceAccess.git;protocol=https;branch=master \
           file://0001-Bump-LibXML-version.patch \
           file://0003-Extract-mmio-from-XDMA-backend-reuse-in-UIO.patch \
           file://0001-Use-exprtk-from-Yocto.patch \
           file://0003-Temporarily-disable-BAR-check.patch \
           file://0004-Remove-debug-output.patch \
           file://0005-Enable-symlinked-devices-for-UIO.patch \
           file://0001-Add-missing-memory-include.patch \
           "

# Modify these as desired
PV = "03.12.00"
SRCREV = "1e1e28745703db938b06a752b4be41b74b52fcc6"

S = "${WORKDIR}/git"

DEPENDS = "boost cppext exprtk libxml++-5.0 exprtk"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
