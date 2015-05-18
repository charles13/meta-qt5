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
    file://0005-qeglplatformintegration-Undefine-CursorShape-from-X..patch \
    file://0006-configure-bump-path-length-from-256-to-512-character.patch \
    file://0007-eglfs-fix-egl-error-for-platforms-only-supporting-on.patch \
    file://0008-QOpenGLPaintDevice-sub-area-support.patch \
"

# common for qtbase-native and nativesdk-qtbase
SRC_URI += " \
    file://0009-Always-build-uic.patch \
    file://0010-Add-external-hostbindir-option-for-native-sdk.patch \
"

do_install_append() {
    # for modules which are still using syncqt and call qtPrepareTool(QMAKE_SYNCQT, syncqt)
    # e.g. qt3d, qtwayland
    ln -sf syncqt.pl ${D}${OE_QMAKE_PATH_QT_BINS}/syncqt
}

SRCREV = "35a125971cd09318f59918dba9255c8a0ad9a97c"

LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=58a180e1cf84c756c29f782b3a485c29 \
                    file://LICENSE.LGPLv3;md5=c4fe8c6de4eef597feec6e90ed62e962 \
                    file://LGPL_EXCEPTION.txt;md5=9625233da42f9e0ce9d63651a9d97654 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"
