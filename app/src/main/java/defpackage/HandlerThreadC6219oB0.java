package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;

/* renamed from: oB0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerThreadC6219oB0 extends HandlerThread implements Handler.Callback {
    public RM a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public C6410pB0 e;

    public final void a(int i) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.a.getClass();
        RM rm = this.a;
        rm.getClass();
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        F12.c("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr = new int[2];
        F12.c("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
        rm.c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, RM.g, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i2 = AbstractC0277Dh1.a;
        F12.c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(rm.c, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        F12.c("eglCreateContext failed", eGLContextEglCreateContext != null);
        rm.d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = rm.c;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            F12.c("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        F12.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        rm.e = eGLSurfaceEglCreatePbufferSurface;
        int[] iArr3 = rm.b;
        GLES20.glGenTextures(1, iArr3, 0);
        F12.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        rm.f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(rm);
        SurfaceTexture surfaceTexture2 = this.a.f;
        surfaceTexture2.getClass();
        this.e = new C6410pB0(this, surfaceTexture2, i != 0);
    }

    public final void b() {
        this.a.getClass();
        RM rm = this.a;
        rm.a.removeCallbacks(rm);
        try {
            SurfaceTexture surfaceTexture = rm.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, rm.b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = rm.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = rm.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = rm.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(rm.c, rm.e);
            }
            EGLContext eGLContext = rm.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(rm.c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = rm.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(rm.c);
            }
            rm.c = null;
            rm.d = null;
            rm.e = null;
            rm.f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (Error e) {
                AbstractC6789rA1.e("Failed to initialize placeholder surface", e);
                this.c = e;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                AbstractC6789rA1.e("Failed to initialize placeholder surface", e2);
                this.d = e2;
                synchronized (this) {
                    notify();
                }
            } catch (C6758r10 e3) {
                AbstractC6789rA1.e("Failed to initialize placeholder surface", e3);
                this.d = new IllegalStateException(e3);
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
