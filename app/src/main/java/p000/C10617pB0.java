package p000;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* renamed from: pB0 */
/* loaded from: classes.dex */
public final class C10617pB0 extends Surface {

    /* renamed from: d */
    public static int f39881d;

    /* renamed from: e */
    public static boolean f39882e;

    /* renamed from: a */
    public final boolean f39883a;

    /* renamed from: b */
    public final HandlerThreadC10489oB0 f39884b;

    /* renamed from: c */
    public boolean f39885c;

    public C10617pB0(HandlerThreadC10489oB0 handlerThreadC10489oB0, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f39884b = handlerThreadC10489oB0;
        this.f39883a = z;
    }

    /* renamed from: a */
    public static synchronized boolean m23636a(Context context) {
        String strEglQueryString;
        int i;
        try {
            if (!f39882e) {
                int i2 = AbstractC7485Dh1.f2166a;
                if (i2 >= 24 && ((i2 >= 26 || !("samsung".equals(AbstractC7485Dh1.f2168c) || "XT1650".equals(AbstractC7485Dh1.f2169d))) && ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i = 0;
                }
                f39881d = i;
                f39882e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f39881d != 0;
    }

    /* renamed from: b */
    public static C10617pB0 m23637b(Context context, boolean z) {
        boolean z2 = false;
        YN1.m9281f(!z || m23636a(context));
        HandlerThreadC10489oB0 handlerThreadC10489oB0 = new HandlerThreadC10489oB0("ExoPlayer:PlaceholderSurface");
        int i = z ? f39881d : 0;
        handlerThreadC10489oB0.start();
        Handler handler = new Handler(handlerThreadC10489oB0.getLooper(), handlerThreadC10489oB0);
        handlerThreadC10489oB0.f38864b = handler;
        handlerThreadC10489oB0.f38863a = new RunnableC1092RM(handler);
        synchronized (handlerThreadC10489oB0) {
            handlerThreadC10489oB0.f38864b.obtainMessage(1, i, 0).sendToTarget();
            while (handlerThreadC10489oB0.f38867e == null && handlerThreadC10489oB0.f38866d == null && handlerThreadC10489oB0.f38865c == null) {
                try {
                    handlerThreadC10489oB0.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThreadC10489oB0.f38866d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = handlerThreadC10489oB0.f38865c;
        if (error != null) {
            throw error;
        }
        C10617pB0 c10617pB0 = handlerThreadC10489oB0.f38867e;
        c10617pB0.getClass();
        return c10617pB0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f39884b) {
            try {
                if (!this.f39885c) {
                    HandlerThreadC10489oB0 handlerThreadC10489oB0 = this.f39884b;
                    handlerThreadC10489oB0.f38864b.getClass();
                    handlerThreadC10489oB0.f38864b.sendEmptyMessage(2);
                    this.f39885c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
