FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-Port-to-new-sysconfig.patch"
INSANE_SKIP:${PN} += "patch-status"
INSANE_SKIP:${PN}-native += "patch-status"
