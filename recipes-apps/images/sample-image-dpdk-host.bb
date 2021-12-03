require sample-image-dpdk-guest.bb

SUMMARY = "Layerscape SOC qemu + dpdk host OS"
DESCRIPTION = "Layerscape SOC qemu + dpdk host OS"

LICENSE = "MIT"

# copy the manifest and the license text for each package to image
COPY_LIC_MANIFEST = "1"

IMAGE_INSTALL_append = " \
    packagegroup-core-buildessential \
    packagegroup-core-full-cmdline \
    packagegroup-fsl-devtools \
    openssl-bin \
    openssl-engines \
    qemu \
    dpdk-examples \
    ovs-dpdk \
    pktgen-dpdk \
"

IMAGE_FSTYPES_qoriq = "tar.gz ext2.gz.u-boot ext2.gz"

inherit fsl-utils
ROOTFS_POSTPROCESS_COMMAND += "rootfs_copy_core_image;"
do_image_complete[depends] += "sample-image-dpdk-guest:do_image_complete"

