LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad \
                    file://LICENSE-CC0;md5=6888abe69dbc6330301f0467e21c0317"

SRC_URI = "gitsm://github.com/open62541/open62541.git;protocol=https;branch=master \
           "

# Modify these as desired
PV = "1.4.6"
SRCREV = "v1.4.6"

S = "${WORKDIR}/git"

DEPENDS = "openssl"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DUA_ENABLE_AMALGAMATION=Off \
                 -DBUILD_SHARED_LIBS=ON \
                 -DUA_ENABLE_METHODCALLS=ON \
                 -DUA_ENABLE_NODEMANAGEMENT=ON \
                 -DUA_ENABLE_SUBSCRIPTIONS=ON \
                 -DUA_LOGLEVEL=100 \
                 -DUA_ENABLE_ENCRYPTION=OPENSSL \
                 -DUA_ENABLE_HISTORIZING=ON \
                 -DUA_NAMESPACE_ZERO=FULL \
		 -DUA_ENABLE_PUBSUB=ON \
	         -DUA_ENABLE_PUBSUB_MONITORING=ON \
	         -DUA_ENABLE_ALLOW_REUSEADDR=ON"

