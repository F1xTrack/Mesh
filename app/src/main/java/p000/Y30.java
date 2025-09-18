package p000;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class Y30 extends U30 {

    /* renamed from: d */
    public boolean f14136d;

    @Override // p000.U30, p000.U21
    /* renamed from: H */
    public final long mo96H(C6507nj c6507nj, long j) throws IOException {
        O90.m5968f(c6507nj, "sink");
        if (this.f11624b) {
            throw new IllegalStateException("closed");
        }
        if (this.f14136d) {
            return -1L;
        }
        long jMo96H = super.mo96H(c6507nj, 8192L);
        if (jMo96H != -1) {
            return jMo96H;
        }
        this.f14136d = true;
        m7868m();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11624b) {
            return;
        }
        if (!this.f14136d) {
            m7868m();
        }
        this.f11624b = true;
    }
}
