package p000;

/* renamed from: EX */
/* loaded from: classes2.dex */
public abstract class AbstractC0286EX implements Z11 {

    /* renamed from: a */
    public final Z11 f2736a;

    public AbstractC0286EX(Z11 z11) {
        O90.m5968f(z11, "delegate");
        this.f2736a = z11;
    }

    @Override // p000.Z11
    /* renamed from: c0 */
    public void mo2328c0(C6507nj c6507nj, long j) {
        O90.m5968f(c6507nj, "source");
        this.f2736a.mo2328c0(c6507nj, j);
    }

    @Override // p000.Z11, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2736a.close();
    }

    @Override // p000.Z11, java.io.Flushable
    public void flush() {
        this.f2736a.flush();
    }

    @Override // p000.Z11
    /* renamed from: r */
    public final C7523Ea1 mo2329r() {
        return this.f2736a.mo2329r();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f2736a + ')';
    }
}
