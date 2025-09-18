package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* renamed from: pB0 */
/* loaded from: classes.dex */
public final class C6410pB0 extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final HandlerThreadC6219oB0 b;
    public boolean c;

    public C6410pB0(HandlerThreadC6219oB0 handlerThreadC6219oB0, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = handlerThreadC6219oB0;
        this.a = z;
    }

    public static synchronized boolean a(Context context) {
        String strEglQueryString;
        int i;
        try {
            if (!e) {
                int i2 = AbstractC0277Dh1.a;
                if (i2 >= 24 && ((i2 >= 26 || !("samsung".equals(AbstractC0277Dh1.c) || "XT1650".equals(AbstractC0277Dh1.d))) && ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i = 0;
                }
                d = i;
                e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return d != 0;
    }

    public static C6410pB0 b(Context context, boolean z) {
        boolean z2 = false;
        YN1.f(!z || a(context));
        HandlerThreadC6219oB0 handlerThreadC6219oB0 = new HandlerThreadC6219oB0("ExoPlayer:PlaceholderSurface");
        int i = z ? d : 0;
        handlerThreadC6219oB0.start();
        Handler handler = new Handler(handlerThreadC6219oB0.getLooper(), handlerThreadC6219oB0);
        handlerThreadC6219oB0.b = handler;
        handlerThreadC6219oB0.a = new RM(handler);
        synchronized (handlerThreadC6219oB0) {
            handlerThreadC6219oB0.b.obtainMessage(1, i, 0).sendToTarget();
            while (handlerThreadC6219oB0.e == null && handlerThreadC6219oB0.d == null && handlerThreadC6219oB0.c == null) {
                try {
                    handlerThreadC6219oB0.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThreadC6219oB0.d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = handlerThreadC6219oB0.c;
        if (error != null) {
            throw error;
        }
        C6410pB0 c6410pB0 = handlerThreadC6219oB0.e;
        c6410pB0.getClass();
        return c6410pB0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    HandlerThreadC6219oB0 handlerThreadC6219oB0 = this.b;
                    handlerThreadC6219oB0.b.getClass();
                    handlerThreadC6219oB0.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
