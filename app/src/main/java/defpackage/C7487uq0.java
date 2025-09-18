package defpackage;

import java.io.Closeable;

/* renamed from: uq0 */
/* loaded from: classes.dex */
public final class C7487uq0 implements Closeable {
    public final int a;
    public AbstractC8446zt b;

    public C7487uq0(UE ue, int i) {
        ue.getClass();
        if (!(i >= 0 && i <= ((InterfaceC6724qq0) ue.w()).getSize())) {
            throw new IllegalArgumentException();
        }
        this.b = ue.clone();
        this.a = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        AbstractC8446zt.p(this.b);
        this.b = null;
    }

    public final synchronized boolean isClosed() {
        return !AbstractC8446zt.D(this.b);
    }

    public final synchronized void m() {
        if (isClosed()) {
            throw new C7074sg("Invalid bytebuf. Already closed");
        }
    }

    public final synchronized byte n(int i) {
        m();
        ML1.a(Boolean.valueOf(i >= 0));
        ML1.a(Boolean.valueOf(i < this.a));
        this.b.getClass();
        return ((InterfaceC6724qq0) this.b.w()).p(i);
    }

    public final synchronized void o(int i, byte[] bArr, int i2, int i3) {
        m();
        if (!(i + i3 <= this.a)) {
            throw new IllegalArgumentException();
        }
        this.b.getClass();
        ((InterfaceC6724qq0) this.b.w()).w(i, bArr, i2, i3);
    }

    public final synchronized int p() {
        m();
        return this.a;
    }
}
