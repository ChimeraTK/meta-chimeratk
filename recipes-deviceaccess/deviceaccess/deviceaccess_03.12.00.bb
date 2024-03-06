LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404 \
                    file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/ChimeraTK/DeviceAccess.git;protocol=https;branch=master \
           file://0003-Extract-mmio-from-XDMA-backend-reuse-in-UIO.patch \
           file://0004-Drop-debug-message.patch \
           file://0005-Temporarily-disable-bar-check.patch \
           file://0001-Drop-CMake-required-version.patch \
           file://0006-Enable-symlink-devices-for-uio.patch \
           "

# Modify these as desired
PV = "03.12.00"
SRCREV = "1e1e28745703db938b06a752b4be41b74b52fcc6"

S = "${WORKDIR}/git"

DEPENDS = "libxml++ boost cppext exprtk exprtk"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DBUILD_TESTS=OFF"
