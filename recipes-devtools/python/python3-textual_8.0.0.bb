
SUMMARY = "Modern Text User Interface framework"
AUTHOR = "Will McGugan <will@textualize.io>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=efa34cbda5817e1e7c540c6cff8f033d"

SRC_URI[md5sum] = "dbf6b68b7d762938e356413fbc317e09"
SRC_URI[sha256sum] = "ce48f83a3d686c0fac0e80bf9136e1f8851c653aa6a4502e43293a151df18809"

RDEPENDS:${PN} = "python3-markdown-it-py python3-mdit-py-plugins python3-rich python3-typing-extensions python3-platformdirs python3-pygments python3-modules"

inherit pypi python_poetry_core
