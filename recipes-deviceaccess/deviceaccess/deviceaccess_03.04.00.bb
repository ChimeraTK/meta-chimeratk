LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404 \
                    file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/ChimeraTK/DeviceAccess.git;protocol=https;branch=master \
           file://0001-original-patch-include-directory.patch.patch \
          file://0002-original-patch-drop-cmake-version.patch.patch \
           file://0001-Do-not-set-library-dirs-and-rpath.patch \
           "

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "64b0c75502fdd51c642f089aef7919d3b1561c5a"

S = "${WORKDIR}/git"

DEPENDS = "glib-2.0 libxml++ boost cppext exprtk exprtk"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
