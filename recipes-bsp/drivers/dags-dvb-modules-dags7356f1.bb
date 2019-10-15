require dags-dvb-modules.inc

COMPATIBLE_MACHINE = "^(worldvisionf1|worldvisionf1plus)$"

SRCDATE = "20171201"
KV = "3.9.7"

SRC_URI[md5sum] = "842566ec81722539b7211d9c13ab39c9"
SRC_URI[sha256sum] = "fa1bd1a9b79644c3ec4687dc83dfbb87bb1f5f68194e9baa4ec8d5527339b9f2"

SRC_URI = "http://en3homeftp.net/release/images/oedrivers/bcmlinuxdvb_f1_7356-${KV}-${SRCDATE}.tar.gz"

do_populate_sysroot() {
}

do_install() {
    install -d ${D}/lib/modules/${KV}/extra
    install -m 0644 ${WORKDIR}/lib/modules/${KV}/extra/bcmlinuxdvb.ko ${D}/lib/modules/${KV}/extra/bcmlinuxdvb.ko
    install -d ${D}/${sysconfdir}/modules-load.d
    echo bcmlinuxdvb _hwtype=\$hwtypenum > ${D}/${sysconfdir}/modules-load.d/_${MACHINE}.conf
}

FILES_${PN} += "${sysconfdir}/modules-load.d/_${MACHINE}.conf /lib/modules/${KV}/extra"
