mtcadummy-objs := mtcadummy_drv.o mtcadummy_proc.o mtcadummy_firmware.o mtcadummy_rw_no_struct.o
obj-m += mtcadummy.o

KVERSION = $(shell uname -r)
KERNEL_SRC = /lib/modules/$(KVERSION)/build

ccflags-y = -Wall -Wuninitialized

all:
	$(NAME) -C $(KERNEL_SRC)V=1 M=$(PWD) modules

#Compile with debug flag, causes lots of kernel output, which fills the logs
#and slows down the driver.
debug:
	KCPPFLAGS="-DPCIEUNI_DEBUG" make all

#In addition to the debug output the driver is compiled with code coverage.
#It only loads on a kernel with code coverage enabled.
full_debug:
	KCPPFLAGS="-DPCIEUNI_DEBUG -fprofile-arcs -ftest-coverage" make all

clean:
	make -C $(KERNEL_SRC) V=1 M=$(PWD) clean

#the two possible locations where the gpcieuni include files can be
#/usr/local in case of a local, manual installation by the admin
#/usr in case of an installation by the package management
EXTRA_CFLAGS += -I/usr/include

