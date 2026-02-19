LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404 \
                    file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/ChimeraTK/cppext.git;branch=master;protocol=https \
           "

# Modify these as desired
PV = "01.07.01"

# Tag 01.05.00
SRCREV = "84b5f4822e57a970b8671ef2ebd9cff2309b7d17"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Doxygen GccAtomic
DEPENDS = "boost"
RDEPENDS:${PN} = "boost-system boost-thread"
RDEPENDS:${PN}-dev = ""

inherit pkgconfig cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
BBCLASSEXTEND = "native nativesdk"

