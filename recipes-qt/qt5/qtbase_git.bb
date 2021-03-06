require qt5-git.inc
require ${PN}.inc

SRC_URI = "\
    ${QT_GIT}/qt/${QT_MODULE}.git;branch=${QT_MODULE_BRANCH} \
"

# common for qtbase-native, qtbase-nativesdk and qtbase
SRC_URI += "\
    file://0001-Add-linux-oe-g-platform.patch \
    file://0002-qlibraryinfo-allow-to-set-qt.conf-from-the-outside-u.patch \
    file://0003-Add-external-hostbindir-option.patch \
    file://0004-qt_module-Fix-pkgconfig-and-libtool-replacements.patch \
    file://0005-Revert-eglfs-Print-the-chosen-config-in-debug-mode.patch \
    file://0006-qeglplatformintegration-Undefine-CursorShape-from-X..patch \
    file://0007-configure-bump-path-length-from-256-to-512-character.patch \
    file://0008-eglfs-fix-egl-error-for-platforms-only-supporting-on.patch \
    file://0009-QOpenGLPaintDevice-sub-area-support.patch \
    file://0010-Make-Qt5GuiConfigExtras.cmake-find-gl-es-include-dir.patch \
"
 
# specific for qtbase
SRC_URI += "\
    file://0011-qmake-don-t-build-it-in-configure-but-allow-to-build.patch \
    file://0012-Set-paths-for-target-properly.patch \
"

SRCREV = "f58e882b7594c59b6050d3c87562fcf836d10f60"

LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=d87ae0d200af76dca730d911474cbe5b \
                    file://LICENSE.LGPLv3;md5=ffcfac38a32c9ebdb8ff768fa1702478 \
                    file://LGPL_EXCEPTION.txt;md5=0145c4d1b6f96a661c2c139dfb268fb6 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"
