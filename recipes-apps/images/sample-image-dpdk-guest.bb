require recipes-core/images/core-image-minimal.bb

PACKAGE_ARCH = "${MACHINE_ARCH}"

CORE_IMAGE_EXTRA_INSTALL += "udev-extraconf lsb-release"
CORE_IMAGE_EXTRA_INSTALL_append_qoriq = " udev-rules-qoriq"

IMAGE_FSTYPES = "tar.gz ext2.gz ext2.gz.u-boot ubi cpio.gz cpio.gz.u-boot"

SUMMARY = "Layerscape SOC dpdk guest OS"
DESCRIPTION = "Layerscape SOC dpdk guest OS"

LICENSE = "MIT"

IMAGE_INSTALL_append = " \
    packagegroup-core-ssh-openssh \
    packagegroup-fsl-networking-core \
    dpdk \
    iperf2 \
"

