package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* renamed from: Yk */
/* loaded from: classes2.dex */
public final class C1921Yk implements Closeable, Flushable {
    public final C6627qK a;

    public C1921Yk(File file, long j) {
        this.a = new C6627qK(file, j, C2272b91.h);
    }

    public final void a(C6649qR0 c6649qR0) {
        O90.f(c6649qR0, "request");
        C6627qK c6627qK = this.a;
        String strB = TP1.b(c6649qR0.a);
        synchronized (c6627qK) {
            O90.f(strB, "key");
            c6627qK.w();
            c6627qK.m();
            C6627qK.b0(strB);
            C5863mK c5863mK = (C5863mK) c6627qK.h.get(strB);
            if (c5863mK == null) {
                return;
            }
            c6627qK.W(c5863mK);
            if (c6627qK.f <= c6627qK.b) {
                c6627qK.n = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    public final synchronized void m() {
    }
}
