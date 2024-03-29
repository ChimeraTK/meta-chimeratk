SUMMARY = "MTCA dummy kernel driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

inherit module

SRC_URI = "git://github.com/ChimeraTK/pciedummy-driver;protocol=https;branch=master"

PV = "00.10.03"
SRCREV = "9a65ea49b2c55fecafb61a04fa41afb89fa8881e"

S = "${WORKDIR}/git"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES_${PN} += "kernel-module-pciedummy"
