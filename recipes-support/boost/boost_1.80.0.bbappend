FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-Hard-code-numpy-include-paths.patch"

DEPENDS += " python3-numpy"
PACKAGES += " boost-numpy"

FILES:${PN}-numpy = "${libdir}/libboost_numpy*.so.*"
