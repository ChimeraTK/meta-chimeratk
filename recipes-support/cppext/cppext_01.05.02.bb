LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404 \
                    file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/ChimeraTK/cppext.git;branch=master;protocol=https \
           file://0001-Drop-CMake-version-requirement.patch \
           "

# Modify these as desired
PV = "01.05.02"

# Tag 01.05.00
SRCREV = "5ffe5e12a3ac6caafe59adaa7a5a9299ff44e5b9"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Doxygen GccAtomic
DEPENDS = "boost"
RDEPENDS_${PN} = "boost-system boost-thread"

inherit pkgconfig cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

