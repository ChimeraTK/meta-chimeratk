
SUMMARY = "Collection of plugins for markdown-it-py"
AUTHOR = "None <Chris Sewell <chrisj_sewell@hotmail.com>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a38a1697260a7ad7bf29f44b362db1fc"

SRC_URI[md5sum] = "8afddf3e020778a9d4490f43ce469d2a"
SRC_URI[sha256sum] = "f4918cb50119f50446560513a8e311d574ff6aaed72606ddae6d35716fe809c6"


RDEPENDS:${PN} = "python3-markdown-it-py"

PYPI_PACKAGE="mdit_py_plugins"

inherit pypi python_flit_core
