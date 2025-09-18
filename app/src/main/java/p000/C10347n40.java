package p000;

import java.net.SocketTimeoutException;

/* renamed from: n40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10347n40 extends C6994v9 {

    /* renamed from: m */
    public final /* synthetic */ C10475o40 f38069m;

    public C10347n40(C10475o40 c10475o40) {
        this.f38069m = c10475o40;
    }

    @Override // p000.C6994v9
    /* renamed from: k */
    public final void mo1159k() {
        this.f38069m.m23333e(9);
        C9579h40 c9579h40 = this.f38069m.f38757b;
        synchronized (c9579h40) {
            long j = c9579h40.f28227n;
            long j2 = c9579h40.f28226m;
            if (j < j2) {
                return;
            }
            c9579h40.f28226m = j2 + 1;
            c9579h40.f28228o = System.nanoTime() + 1000000000;
            c9579h40.f28221h.m9679c(new C6610pK(AbstractC1374Vq.m8593l(new StringBuilder(), c9579h40.f28216c, " ping"), c9579h40, 1), 0L);
        }
    }

    /* renamed from: l */
    public final void m23068l() throws SocketTimeoutException {
        if (m25370j()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
