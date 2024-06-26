This README file contains information on the contents of the meta-chimeratk layer.

Please see the corresponding sections below for details.

Dependencies
============

  URI: git://github.com/openembedded/oe-core.git
  branch: zeus
  revision: HEAD

  URI: git://github.com/openembedded/meta-openembedded.git
  branch: zeus
  revision: HEAD

Recommends
==========
  URI: https://github.com/meta-qt5/meta-qt5
  branch: zeus
  revision: HEAD

  URI: https://github.com/voltumna-linux/meta-tango/
  branch: dunfell
  revision: HEAD

  More specifially, it just needs meta-oe for libxml++ and meta-qt5 only of
  you intend to build QtHardMon.

  IF you intend to use the meta-tango layer, you MUST also include meta-tango-compat from
  inside this folder as well as meta-tango only supports LTS versions and it provides
  cppTango 9.4.2 which is the minimum version required for the Tango ControlSystem adapter.


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


