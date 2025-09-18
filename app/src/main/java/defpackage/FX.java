package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class FX implements U21 {
    public final U21 a;

    public FX(U21 u21) {
        O90.f(u21, "delegate");
        this.a = u21;
    }

    @Override // defpackage.U21
    public long H(C6129nj c6129nj, long j) {
        O90.f(c6129nj, "sink");
        return this.a.H(c6129nj, 8192L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.U21
    public final C0334Ea1 r() {
        return this.a.r();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
