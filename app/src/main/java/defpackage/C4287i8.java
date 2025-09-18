package defpackage;

import android.os.Looper;

/* renamed from: i8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4287i8 extends XT1 {
    public static volatile C4287i8 b;
    public static final ExecutorC4096h8 c = new ExecutorC4096h8(0);
    public final LG a = new LG();

    public static C4287i8 c() {
        if (b != null) {
            return b;
        }
        synchronized (C4287i8.class) {
            try {
                if (b == null) {
                    b = new C4287i8();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public final void d(Runnable runnable) {
        LG lg = this.a;
        if (lg.c == null) {
            synchronized (lg.a) {
                try {
                    if (lg.c == null) {
                        lg.c = LG.c(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        lg.c.post(runnable);
    }
}
