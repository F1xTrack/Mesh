package p000;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* renamed from: Yk */
/* loaded from: classes2.dex */
public final class C1557Yk implements Closeable, Flushable {

    /* renamed from: a */
    public final C6673qK f14495a;

    public C1557Yk(File file, long j) {
        this.f14495a = new C6673qK(file, j, C8817b91.f16828h);
    }

    /* renamed from: a */
    public final void m9346a(C10777qR0 c10777qR0) {
        O90.m5968f(c10777qR0, "request");
        C6673qK c6673qK = this.f14495a;
        String strM7690b = TP1.m7690b(c10777qR0.f40870a);
        synchronized (c6673qK) {
            O90.m5968f(strM7690b, "key");
            c6673qK.m23977w();
            c6673qK.m23973m();
            C6673qK.m23965b0(strM7690b);
            C6419mK c6419mK = (C6419mK) c6673qK.f40783h.get(strM7690b);
            if (c6419mK == null) {
                return;
            }
            c6673qK.m23971W(c6419mK);
            if (c6673qK.f40781f <= c6673qK.f40777b) {
                c6673qK.f40789n = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14495a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f14495a.flush();
    }

    /* renamed from: m */
    public final synchronized void m9347m() {
    }
}
