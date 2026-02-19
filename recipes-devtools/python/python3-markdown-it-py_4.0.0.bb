
SUMMARY = "Python port of markdown-it. Markdown parsing, done right!"
AUTHOR = "Chris Sewell <chrisj_sewell@hotmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a38a1697260a7ad7bf29f44b362db1fc"

SRC_URI[md5sum] = "175fe39a7fbec21878606db1947bc9ea"
SRC_URI[sha256sum] = "cb0a2b4aa34f932c007117b194e945bd74e0ec24133ceb5bac59009cda1cb9f3"

RDEPENDS:${PN} = "python3-mdurl"

PYPI_PACKAGE="markdown_it_py"

inherit pypi python_flit_core
