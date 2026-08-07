This README file contains information on the contents of the meta-chimeratk layer.

Please see the corresponding sections below for details.

Dependencies
============

  URI: git://github.com/openembedded/oe-core.git
  branch: scarthgap
  revision: HEAD

  URI: git://github.com/openembedded/meta-openembedded.git
  branch: scarthgap
  revision: HEAD

Recommends
==========
  URI: https://code.qt.io/cgit/yocto/meta-qt6.git/
  branch: master
  revision: HEAD

  URI: https://github.com/voltumna-linux/meta-tango/
  branch: scarthgap
  revision: f48af0f336a08bcc5a0b39304f7c3cef5ec0edfe

  More specifially, it just needs meta-oe for libxml++, meta-python for pybind11
  and meta-qt6 only of you intend to build QtHardMon.

  It is recommended to use TANGO version 10.3. This can be achieved by setting the following
  variables in your local.conf:

  * `PREFERRED_VERSION_cpptango = "10.3%"`
  * `PREFERRED_VERSION_tango-idl = "6.0%"`.


Patches
=======

Please submit any patches against the meta-chimeratk layer to by opening a pull request
against https://github.com/ChimeraTK/meta-chimeratk

Table of Contents
=================

  I. Adding the meta-chimeratk layer to your build

I. Adding the meta-chimeratk layer to your build
=================================================

Run 'bitbake-layers add-layer meta-chimeratk'


