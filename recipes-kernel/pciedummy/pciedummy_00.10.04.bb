SUMMARY = "MTCA dummy kernel driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

inherit module

SRC_URI = "git://github.com/ChimeraTK/pciedummy-driver;protocol=https;branch=master \
           file://0001-fix-Make-it-possible-to-override-KERNEL_SRC.patch \
           "

PV = "00.10.04"
SRCREV = "ca7f4a475cb60754df69baa613ab543edceb17f1"

S = "${WORKDIR}/git"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES_${PN} += "kernel-module-pciedummy"
FILES_kernel-module-${PN} += "/etc/modules-load.d/mtcadummy.conf"
FILES_${PN} += "/etc/udev/rules.d/10-mtcadummy.rules"

do_compile:prepend() {
	sed -e '/EXTRA_CFLAGS/d' ${S}/Makefile.kernel > ${S}/Makefile
	sed -e 's/@mtcadummy_MAJOR_VERSION@/0/' -e 's/@mtcadummy_MINOR_VERSION@/10/' -e 's/@CMAKE_PROJECT_VERSION@/${PV}/' ${S}/version.h.in >${S}/version.h
}

do_install:append() {
	rm -rf ${D}/usr ${D}/etc/modules-load.d/mtcadummy.conf ${D}/etc/udev
}
