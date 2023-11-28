LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad \
                    file://LICENSE-CC0;md5=6888abe69dbc6330301f0467e21c0317"

SRC_URI = "gitsm://github.com/open62541/open62541.git;protocol=https;branch=master \
           file://FixForZeroSamplingInterval.patch \
           file://RemovePythonDependency.patch \
           file://SkipFirstHistoryEntry.patch \
           file://0001-Do-not-leak-OpenSSL-paths-into-target-file.patch \
           "

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "v1.3.3"

S = "${WORKDIR}/git"

DEPENDS = "openssl"

inherit cmake python3native

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DUA_ENABLE_AMALGAMATION=Off \
                 -DBUILD_SHARED_LIBS=ON \
                 -DUA_ENABLE_METHODCALLS=ON \
                 -DUA_ENABLE_NODEMANAGEMENT=ON \
                 -DUA_ENABLE_SUBSCRIPTIONS=ON \
                 -DUA_LOGLEVEL=300 \
                 -DUA_ENABLE_ENCRYPTION=OPENSSL \
                 -DUA_ENABLE_HISTORIZING=ON"

