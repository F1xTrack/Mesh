package p000;

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
public final class HandlerThreadC10489oB0 extends HandlerThread implements Handler.Callback {

    /* renamed from: a */
    public RunnableC1092RM f38863a;

    /* renamed from: b */
    public Handler f38864b;

    /* renamed from: c */
    public Error f38865c;

    /* renamed from: d */
    public RuntimeException f38866d;

    /* renamed from: e */
    public C10617pB0 f38867e;

    /* renamed from: a */
    public final void m23355a(int i) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f38863a.getClass();
        RunnableC1092RM runnableC1092RM = this.f38863a;
        runnableC1092RM.getClass();
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        F12.m2486c("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr = new int[2];
        F12.m2486c("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
        runnableC1092RM.f10143c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, RunnableC1092RM.f10140g, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i2 = AbstractC7485Dh1.f2166a;
        F12.m2486c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(runnableC1092RM.f10143c, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        F12.m2486c("eglCreateContext failed", eGLContextEglCreateContext != null);
        runnableC1092RM.f10144d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = runnableC1092RM.f10143c;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            F12.m2486c("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        F12.m2486c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        runnableC1092RM.f10145e = eGLSurfaceEglCreatePbufferSurface;
        int[] iArr3 = runnableC1092RM.f10142b;
        GLES20.glGenTextures(1, iArr3, 0);
        F12.m2485b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        runnableC1092RM.f10146f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(runnableC1092RM);
        SurfaceTexture surfaceTexture2 = this.f38863a.f10146f;
        surfaceTexture2.getClass();
        this.f38867e = new C10617pB0(this, surfaceTexture2, i != 0);
    }

    /* renamed from: b */
    public final void m23356b() {
        this.f38863a.getClass();
        RunnableC1092RM runnableC1092RM = this.f38863a;
        runnableC1092RM.f10141a.removeCallbacks(runnableC1092RM);
        try {
            SurfaceTexture surfaceTexture = runnableC1092RM.f10146f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, runnableC1092RM.f10142b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = runnableC1092RM.f10143c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = runnableC1092RM.f10143c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = runnableC1092RM.f10145e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC1092RM.f10143c, runnableC1092RM.f10145e);
            }
            EGLContext eGLContext = runnableC1092RM.f10144d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(runnableC1092RM.f10143c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = runnableC1092RM.f10143c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(runnableC1092RM.f10143c);
            }
            runnableC1092RM.f10143c = null;
            runnableC1092RM.f10144d = null;
            runnableC1092RM.f10145e = null;
            runnableC1092RM.f10146f = null;
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
                    m23356b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                m23355a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (Error e) {
                AbstractC10872rA1.m24172e("Failed to initialize placeholder surface", e);
                this.f38865c = e;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                AbstractC10872rA1.m24172e("Failed to initialize placeholder surface", e2);
                this.f38866d = e2;
                synchronized (this) {
                    notify();
                }
            } catch (C10850r10 e3) {
                AbstractC10872rA1.m24172e("Failed to initialize placeholder surface", e3);
                this.f38866d = new IllegalStateException(e3);
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
