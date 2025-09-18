package defpackage;

/* loaded from: classes2.dex */
public abstract class EX implements Z11 {
    public final Z11 a;

    public EX(Z11 z11) {
        O90.f(z11, "delegate");
        this.a = z11;
    }

    @Override // defpackage.Z11
    public void c0(C6129nj c6129nj, long j) {
        O90.f(c6129nj, "source");
        this.a.c0(c6129nj, j);
    }

    @Override // defpackage.Z11, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.Z11, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    @Override // defpackage.Z11
    public final C0334Ea1 r() {
        return this.a.r();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
