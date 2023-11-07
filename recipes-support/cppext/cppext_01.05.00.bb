LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404 \
                    file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/ChimeraTK/cppext.git;branch=master;protocol=https \
           file://0001-Drop-CMake-version-requirement.patch \
           "

# Modify these as desired
PV = "1.0+git${SRCPV}"

# Tag 01.05.00
SRCREV = "429d3d8a097eee601d5ddafc2a09ab7b36e51787"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Doxygen GccAtomic
DEPENDS = "boost"
RDEPENDS:${PN} = "boost-system boost-thread"

inherit pkgconfig cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

