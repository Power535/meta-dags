require dags-dvb-modules.inc

COMPATIBLE_MACHINE = "^(force2plushv|lunix|purehdse|lunixco)$"

SRCDATE = "20181025"
KV = "4.2.1"

SRC_URI[md5sum] = "fbaddbac6a3f7bbdb6eebafd2555dd49"
SRC_URI[sha256sum] = "f3e04aa03ee10e83d581213ea256fdb4fda6241d521ea1096e0bdf2f966f65b5"

SRC_URI = "http://en3homeftp.net/release/images/oedrivers/bcmlinuxdvb_73625-${KV}-${SRCDATE}.tar.gz"
