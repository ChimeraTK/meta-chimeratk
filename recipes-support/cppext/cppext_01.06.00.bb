LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404 \
                    file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/ChimeraTK/cppext.git;branch=master;protocol=https \
           "

# Modify these as desired
PV = "01.06.00"

# Tag 01.05.00
SRCREV = "2c78abb0c8e0412eeefde1dee8d31d2c69615983"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Doxygen GccAtomic
DEPENDS = "boost"
RDEPENDS:${PN} = "boost-system boost-thread"

inherit pkgconfig cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

