package p000;

import java.io.IOException;

/* renamed from: FX */
/* loaded from: classes2.dex */
public abstract class AbstractC0349FX implements U21 {

    /* renamed from: a */
    public final U21 f3294a;

    public AbstractC0349FX(U21 u21) {
        O90.m5968f(u21, "delegate");
        this.f3294a = u21;
    }

    @Override // p000.U21
    /* renamed from: H */
    public long mo96H(C6507nj c6507nj, long j) {
        O90.m5968f(c6507nj, "sink");
        return this.f3294a.mo96H(c6507nj, 8192L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f3294a.close();
    }

    @Override // p000.U21
    /* renamed from: r */
    public final C7523Ea1 mo97r() {
        return this.f3294a.mo97r();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f3294a + ')';
    }
}
