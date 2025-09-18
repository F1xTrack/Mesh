package p000;

import java.net.SocketTimeoutException;

/* renamed from: l40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10091l40 implements Z11 {

    /* renamed from: a */
    public final boolean f36858a;

    /* renamed from: b */
    public final C6507nj f36859b = new C6507nj();

    /* renamed from: c */
    public boolean f36860c;

    /* renamed from: d */
    public final /* synthetic */ C10475o40 f36861d;

    public C10091l40(C10475o40 c10475o40, boolean z) {
        this.f36861d = c10475o40;
        this.f36858a = z;
    }

    /* renamed from: a */
    public final void m22355a(boolean z) throws SocketTimeoutException {
        long jMin;
        boolean z2;
        C10475o40 c10475o40 = this.f36861d;
        synchronized (c10475o40) {
            c10475o40.f38767l.m25369i();
            while (c10475o40.f38760e >= c10475o40.f38761f && !this.f36858a && !this.f36860c && c10475o40.m23334f() == 0) {
                try {
                    c10475o40.m23340l();
                } finally {
                    c10475o40.f38767l.m23068l();
                }
            }
            c10475o40.f38767l.m23068l();
            c10475o40.m23330b();
            jMin = Math.min(c10475o40.f38761f - c10475o40.f38760e, this.f36859b.f38488b);
            c10475o40.f38760e += jMin;
            z2 = z && jMin == this.f36859b.f38488b;
        }
        this.f36861d.f38767l.m25369i();
        try {
            C10475o40 c10475o402 = this.f36861d;
            c10475o402.f38757b.m18719l(c10475o402.f38756a, z2, this.f36859b, jMin);
        } finally {
            c10475o40 = this.f36861d;
        }
    }

    @Override // p000.Z11
    /* renamed from: c0 */
    public final void mo2328c0(C6507nj c6507nj, long j) throws SocketTimeoutException {
        O90.m5968f(c6507nj, "source");
        byte[] bArr = AbstractC7433Ch1.f1577a;
        C6507nj c6507nj2 = this.f36859b;
        c6507nj2.mo2328c0(c6507nj, j);
        while (c6507nj2.f38488b >= 16384) {
            m22355a(false);
        }
    }

    @Override // p000.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws SocketTimeoutException {
        C10475o40 c10475o40 = this.f36861d;
        byte[] bArr = AbstractC7433Ch1.f1577a;
        synchronized (c10475o40) {
            if (this.f36860c) {
                return;
            }
            boolean z = c10475o40.m23334f() == 0;
            C10475o40 c10475o402 = this.f36861d;
            if (!c10475o402.f38765j.f36858a) {
                if (this.f36859b.f38488b > 0) {
                    while (this.f36859b.f38488b > 0) {
                        m22355a(true);
                    }
                } else if (z) {
                    c10475o402.f38757b.m18719l(c10475o402.f38756a, true, null, 0L);
                }
            }
            synchronized (this.f36861d) {
                this.f36860c = true;
            }
            this.f36861d.f38757b.f28236w.flush();
            this.f36861d.m23329a();
        }
    }

    @Override // p000.Z11, java.io.Flushable
    public final void flush() throws SocketTimeoutException {
        C10475o40 c10475o40 = this.f36861d;
        byte[] bArr = AbstractC7433Ch1.f1577a;
        synchronized (c10475o40) {
            c10475o40.m23330b();
        }
        while (this.f36859b.f38488b > 0) {
            m22355a(false);
            this.f36861d.f38757b.f28236w.flush();
        }
    }

    @Override // p000.Z11
    /* renamed from: r */
    public final C7523Ea1 mo2329r() {
        return this.f36861d.f38767l;
    }
}
