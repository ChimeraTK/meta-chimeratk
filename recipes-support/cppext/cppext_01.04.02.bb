LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404 \
                    file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/ChimeraTK/cppext.git;branch=master;protocol=https \
           file://drop-cmake-version.patch \
           file://0001-Do-not-hard-core-libatomic-paths-into-cmake-config.patch \
           "

# Modify these as desired
PV = "1.0+git${SRCPV}"

# Tag 01.04.02
SRCREV = "72667aa2467bfa7740222a975b30d305be5b81ae"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Doxygen GccAtomic
DEPENDS = "boost"
RDEPENDS:${PN} = "boost-system boost-thread"

inherit pkgconfig cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

