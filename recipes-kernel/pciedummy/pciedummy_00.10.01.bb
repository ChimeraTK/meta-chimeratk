SUMMARY = "MTCA dummy kernel driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

inherit module

SRC_URI = "git://github.com/ChimeraTK/pciedummy-driver;protocol=https;branch=master"

PV = "1.0+git${SRCPV}"
SRCREV = "b9e161a40f0d303f34ad43d901cd840f94d80e17"

S = "${WORKDIR}/git"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES:${PN} += "kernel-module-pciedummy"
