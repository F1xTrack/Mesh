package p000;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* renamed from: RM */
/* loaded from: classes.dex */
public final class RunnableC1092RM implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: g */
    public static final int[] f10140g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a */
    public final Handler f10141a;

    /* renamed from: b */
    public final int[] f10142b = new int[1];

    /* renamed from: c */
    public EGLDisplay f10143c;

    /* renamed from: d */
    public EGLContext f10144d;

    /* renamed from: e */
    public EGLSurface f10145e;

    /* renamed from: f */
    public SurfaceTexture f10146f;

    public RunnableC1092RM(Handler handler) {
        this.f10141a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f10141a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f10146f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
