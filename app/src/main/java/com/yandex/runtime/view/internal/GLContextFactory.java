package com.yandex.runtime.view.internal;

import android.opengl.GLSurfaceView;
import com.yandex.runtime.graphics.GLContextVersionBinding;
import com.yandex.runtime.logging.Logger;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* loaded from: classes2.dex */
public class GLContextFactory implements GLSurfaceView.EGLContextFactory {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int EGL_CONTEXT_FLAGS_KHR = 12540;
    private static final int EGL_CONTEXT_OPENGL_DEBUG_BIT_KHR = 1;
    private final boolean debugEnabled;
    private final GLVersionProvider glVersionProvider;

    public GLContextFactory(boolean z, GLVersionProvider gLVersionProvider) {
        this.debugEnabled = z;
        this.glVersionProvider = gLVersionProvider;
    }

    private int[] attributes(int i, boolean z) {
        return z ? new int[]{EGL_CONTEXT_CLIENT_VERSION, i, EGL_CONTEXT_FLAGS_KHR, 1, 12344} : new int[]{EGL_CONTEXT_CLIENT_VERSION, i, 12344};
    }

    private EGLContext tryCreateContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, boolean z) {
        int version = this.glVersionProvider.getVersion();
        Logger.warn("Create OpenGl ES context version " + String.valueOf(version));
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, attributes(version, z));
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContextTryCreateContext;
        if (this.debugEnabled) {
            Logger.warn("Trying to create debug gl context");
            eGLContextTryCreateContext = tryCreateContext(egl10, eGLDisplay, eGLConfig, true);
            if (eGLContextTryCreateContext == null || eGLContextTryCreateContext == EGL10.EGL_NO_CONTEXT) {
                Logger.warn("Could not create debug gl context; Got EGL error " + egl10.eglGetError());
            }
        } else {
            eGLContextTryCreateContext = null;
        }
        if ((eGLContextTryCreateContext != null && eGLContextTryCreateContext != EGL10.EGL_NO_CONTEXT) || ((eGLContextTryCreateContext = tryCreateContext(egl10, eGLDisplay, eGLConfig, false)) != null && eGLContextTryCreateContext != EGL10.EGL_NO_CONTEXT)) {
            GLContextVersionBinding.setVersion(this.glVersionProvider.getVersion());
            return eGLContextTryCreateContext;
        }
        throw new RuntimeException("eglCreateContext() failed; Got EGL error " + egl10.eglGetError());
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
            return;
        }
        throw new RuntimeException("eglDestroyContext() failed; Got EGL error " + egl10.eglGetError());
    }
}
