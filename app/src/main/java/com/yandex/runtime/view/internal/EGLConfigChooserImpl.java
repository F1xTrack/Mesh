package com.yandex.runtime.view.internal;

import android.opengl.GLSurfaceView;
import com.yandex.runtime.logging.Logger;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* loaded from: classes2.dex */
public class EGLConfigChooserImpl implements GLSurfaceView.EGLConfigChooser, GLVersionProvider {
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private static final int EGL_OPENGL_ES3_BIT_KHR = 64;
    private int glVersion = 2;

    private static int[] getAttrs(int i) {
        return new int[]{12352, i == 3 ? 64 : 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 8, 12344};
    }

    private static EGLConfig tryChooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        int[] iArr2 = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2) || iArr2[0] <= 0) {
            return null;
        }
        return eGLConfigArr[0];
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        EGLConfig eGLConfigTryChooseConfig = tryChooseConfig(egl10, eGLDisplay, getAttrs(3));
        if (eGLConfigTryChooseConfig != null) {
            this.glVersion = 3;
        } else {
            Logger.warn("Could not choose OpenGl ES Version 3 config; Got EGL error " + egl10.eglGetError());
            eGLConfigTryChooseConfig = tryChooseConfig(egl10, eGLDisplay, getAttrs(2));
        }
        if (eGLConfigTryChooseConfig != null) {
            return eGLConfigTryChooseConfig;
        }
        throw new RuntimeException("eglChooseConfig() failed; Got EGL error " + egl10.eglGetError());
    }

    @Override // com.yandex.runtime.view.internal.GLVersionProvider
    public int getVersion() {
        return this.glVersion;
    }
}
