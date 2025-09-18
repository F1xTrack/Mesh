package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class Y30 extends U30 {
    public boolean d;

    @Override // defpackage.U30, defpackage.U21
    public final long H(C6129nj c6129nj, long j) throws IOException {
        O90.f(c6129nj, "sink");
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        if (this.d) {
            return -1L;
        }
        long jH = super.H(c6129nj, 8192L);
        if (jH != -1) {
            return jH;
        }
        this.d = true;
        m();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (!this.d) {
            m();
        }
        this.b = true;
    }
}
