package p000;

import android.os.Looper;

/* renamed from: i8 */
/* loaded from: classes.dex */
public final class C4223i8 extends XT1 {

    /* renamed from: b */
    public static volatile C4223i8 f28830b;

    /* renamed from: c */
    public static final ExecutorC4160h8 f28831c = new ExecutorC4160h8(0);

    /* renamed from: a */
    public final C0710LG f28832a = new C0710LG();

    /* renamed from: c */
    public static C4223i8 m18971c() {
        if (f28830b != null) {
            return f28830b;
        }
        synchronized (C4223i8.class) {
            try {
                if (f28830b == null) {
                    f28830b = new C4223i8();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f28830b;
    }

    /* renamed from: d */
    public final void m18972d(Runnable runnable) {
        C0710LG c0710lg = this.f28832a;
        if (c0710lg.f6583c == null) {
            synchronized (c0710lg.f6581a) {
                try {
                    if (c0710lg.f6583c == null) {
                        c0710lg.f6583c = C0710LG.m4939c(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c0710lg.f6583c.post(runnable);
    }
}
