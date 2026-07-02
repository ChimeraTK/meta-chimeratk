# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
SUMMARY = "ApplicationCore based server which directly connects devices to the control system. OPC-UA variant"
require recipes-tools/genericdeviceserver/genericdeviceserver.inc

DEPENDS:append = " controlsystemadapter-opc-ua-adapter deviceaccess-opcuabackend"

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DADAPTER=OPCUA"

