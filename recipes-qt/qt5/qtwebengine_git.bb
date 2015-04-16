require qt5-git.inc
require ${PN}.inc

QT_MODULE_BRANCH_CHROMIUM = "40.0.2214-based"

SRC_URI += " \
    git://gitorious.org/qt/qtwebengine-chromium.git;name=chromium;branch=${QT_MODULE_BRANCH_CHROMIUM};destsuffix=git/src/3rdparty \
    file://0001-functions.prf-Don-t-match-QMAKE_EXT_CPP-or-QMAKE_EXT.patch \
    file://0002-functions.prf-Make-sure-we-only-use-the-file-name-to.patch \
    file://0003-functions.prf-allow-build-for-linux-oe-g-platform.patch \
    file://0001-chromium-base.gypi-include-atomicops_internals_x86_g.patch \
"
SRCREV_qtwebengine = "f5ec28285ab7f71d6d75af963ae499603da6630e"
SRCREV_chromium = "6b1784803e5333987c5e86087ec782a3eaacfa76"
SRCREV = "${SRCREV_qtwebengine}"

SRCREV_FORMAT = "qtwebengine"

S = "${WORKDIR}/git"
