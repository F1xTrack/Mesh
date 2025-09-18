package defpackage;

import java.net.SocketTimeoutException;

/* renamed from: n40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6007n40 extends C7548v9 {
    public final /* synthetic */ C6198o40 m;

    public C6007n40(C6198o40 c6198o40) {
        this.m = c6198o40;
    }

    @Override // defpackage.C7548v9
    public final void k() {
        this.m.e(9);
        C4085h40 c4085h40 = this.m.b;
        synchronized (c4085h40) {
            long j = c4085h40.n;
            long j2 = c4085h40.m;
            if (j < j2) {
                return;
            }
            c4085h40.m = j2 + 1;
            c4085h40.o = System.nanoTime() + 1000000000;
            c4085h40.h.c(new C6436pK(AbstractC1705Vq.l(new StringBuilder(), c4085h40.c, " ping"), c4085h40, 1), 0L);
        }
    }

    public final void l() throws SocketTimeoutException {
        if (j()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
