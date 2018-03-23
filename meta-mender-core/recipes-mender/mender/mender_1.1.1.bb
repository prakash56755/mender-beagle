require mender.inc

SRC_URI = "git://github.com/mendersoftware/mender;protocol=https;branch=1.1.x"

# Tag: 1.1.1
SRCREV = "086b55ef60ac9aa41c0f5ec674bc9932e1fd65b8"

# DO NOT change the checksum here without make sure that ALL licenses (including
# dependencies) are included in the LICENSE variable below.
LIC_FILES_CHKSUM = "file://LIC_FILES_CHKSUM.sha256;md5=76c423d4ae33f8df4070f6f58187eeed"
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MIT & OLDAP-2.8"
