This README file contains information on the contents of the meta-chimeratk layer.

Please see the corresponding sections below for details.

Dependencies
============

  URI: git://github.com/openembedded/oe-core.git
  branch: walnascar
  revision: HEAD

  URI: git://github.com/openembedded/meta-openembedded.git
  branch: walnascar
  revision: HEAD

Recommends
==========
  URI: https://code.qt.io/cgit/yocto/meta-qt6.git/
  branch: master
  revision: HEAD

  URI: https://github.com/voltumna-linux/meta-tango/
  branch: master
  revision: 504ceac53460c9263ac3381c9130e3a0f66f693a

  More specifially, it just needs meta-oe for libxml++, meta-python for pybind11
  and meta-qt6 only of you intend to build QtHardMon.

  IF you intend to use the meta-tango layer, you MUST also include meta-tango-compat from
  inside this folder as well. meta-tango only supports LTS versions and meta-tango-compat
  adds an override for that.

  It is recommended to use TANGO version 10. This can be achieved by setting the following
  variables in your local.conf:

  * `PREFERRED_VERSION_cpptango = "10.%"`
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


