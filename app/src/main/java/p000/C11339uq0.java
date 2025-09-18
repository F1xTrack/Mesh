package p000;

import java.io.Closeable;

/* renamed from: uq0 */
/* loaded from: classes.dex */
public final class C11339uq0 implements Closeable {

    /* renamed from: a */
    public final int f43971a;

    /* renamed from: b */
    public AbstractC7292zt f43972b;

    public C11339uq0(C1273UE c1273ue, int i) {
        c1273ue.getClass();
        if (!(i >= 0 && i <= ((InterfaceC10827qq0) c1273ue.m26572w()).getSize())) {
            throw new IllegalArgumentException();
        }
        this.f43972b = c1273ue.clone();
        this.f43971a = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        AbstractC7292zt.m26569p(this.f43972b);
        this.f43972b = null;
    }

    public final synchronized boolean isClosed() {
        return !AbstractC7292zt.m26565D(this.f43972b);
    }

    /* renamed from: m */
    public final synchronized void m25250m() {
        if (isClosed()) {
            throw new C6838sg("Invalid bytebuf. Already closed");
        }
    }

    /* renamed from: n */
    public final synchronized byte m25251n(int i) {
        m25250m();
        ML1.m5334a(Boolean.valueOf(i >= 0));
        ML1.m5334a(Boolean.valueOf(i < this.f43971a));
        this.f43972b.getClass();
        return ((InterfaceC10827qq0) this.f43972b.m26572w()).mo6581p(i);
    }

    /* renamed from: o */
    public final synchronized void m25252o(int i, byte[] bArr, int i2, int i3) {
        m25250m();
        if (!(i + i3 <= this.f43971a)) {
            throw new IllegalArgumentException();
        }
        this.f43972b.getClass();
        ((InterfaceC10827qq0) this.f43972b.m26572w()).mo6582w(i, bArr, i2, i3);
    }

    /* renamed from: p */
    public final synchronized int m25253p() {
        m25250m();
        return this.f43971a;
    }
}
