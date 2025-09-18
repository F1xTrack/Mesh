package defpackage;

import java.net.SocketTimeoutException;

/* renamed from: l40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5625l40 implements Z11 {
    public final boolean a;
    public final C6129nj b = new C6129nj();
    public boolean c;
    public final /* synthetic */ C6198o40 d;

    public C5625l40(C6198o40 c6198o40, boolean z) {
        this.d = c6198o40;
        this.a = z;
    }

    public final void a(boolean z) throws SocketTimeoutException {
        long jMin;
        boolean z2;
        C6198o40 c6198o40 = this.d;
        synchronized (c6198o40) {
            c6198o40.l.i();
            while (c6198o40.e >= c6198o40.f && !this.a && !this.c && c6198o40.f() == 0) {
                try {
                    c6198o40.l();
                } finally {
                    c6198o40.l.l();
                }
            }
            c6198o40.l.l();
            c6198o40.b();
            jMin = Math.min(c6198o40.f - c6198o40.e, this.b.b);
            c6198o40.e += jMin;
            z2 = z && jMin == this.b.b;
        }
        this.d.l.i();
        try {
            C6198o40 c6198o402 = this.d;
            c6198o402.b.l(c6198o402.a, z2, this.b, jMin);
        } finally {
            c6198o40 = this.d;
        }
    }

    @Override // defpackage.Z11
    public final void c0(C6129nj c6129nj, long j) throws SocketTimeoutException {
        O90.f(c6129nj, "source");
        byte[] bArr = AbstractC0199Ch1.a;
        C6129nj c6129nj2 = this.b;
        c6129nj2.c0(c6129nj, j);
        while (c6129nj2.b >= 16384) {
            a(false);
        }
    }

    @Override // defpackage.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws SocketTimeoutException {
        C6198o40 c6198o40 = this.d;
        byte[] bArr = AbstractC0199Ch1.a;
        synchronized (c6198o40) {
            if (this.c) {
                return;
            }
            boolean z = c6198o40.f() == 0;
            C6198o40 c6198o402 = this.d;
            if (!c6198o402.j.a) {
                if (this.b.b > 0) {
                    while (this.b.b > 0) {
                        a(true);
                    }
                } else if (z) {
                    c6198o402.b.l(c6198o402.a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.c = true;
            }
            this.d.b.w.flush();
            this.d.a();
        }
    }

    @Override // defpackage.Z11, java.io.Flushable
    public final void flush() throws SocketTimeoutException {
        C6198o40 c6198o40 = this.d;
        byte[] bArr = AbstractC0199Ch1.a;
        synchronized (c6198o40) {
            c6198o40.b();
        }
        while (this.b.b > 0) {
            a(false);
            this.d.b.w.flush();
        }
    }

    @Override // defpackage.Z11
    public final C0334Ea1 r() {
        return this.d.l;
    }
}
