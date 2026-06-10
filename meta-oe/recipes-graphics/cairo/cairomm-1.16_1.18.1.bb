SUMMARY = "C++ bindings for Cairo graphics library"

LICENSE = "LGPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=c46bda00ffbb0ba1dac22f8d087f54d9"

inherit gnomebase

DEPENDS += "boost cairo libsigc++-3"

SRC_URI = "https://www.cairographics.org/releases/cairomm-${PV}.tar.xz"
SRC_URI[sha256sum] = "e0e996a979ee52c840dca3ee74f5d005e3259b94ddce58f255d3b6f47c8cb41d"

S = "${UNPACKDIR}/cairomm-${PV}"

FILES:${PN}-doc += "${datadir}/devhelp"
FILES:${PN}-dev += "${libdir}/cairomm-*/"

