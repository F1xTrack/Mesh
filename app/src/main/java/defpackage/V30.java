package defpackage;

/* loaded from: classes2.dex */
public final class V30 implements Z11 {
    public final HX a;
    public boolean b;
    public final /* synthetic */ C5350je c;

    public V30(C5350je c5350je) {
        this.c = c5350je;
        this.a = new HX(((C8161yN0) c5350je.f).a.r());
    }

    @Override // defpackage.Z11
    public final void c0(C6129nj c6129nj, long j) {
        O90.f(c6129nj, "source");
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        C5350je c5350je = this.c;
        C8161yN0 c8161yN0 = (C8161yN0) c5350je.f;
        if (c8161yN0.c) {
            throw new IllegalStateException("closed");
        }
        c8161yN0.b.t0(j);
        c8161yN0.m();
        C8161yN0 c8161yN02 = (C8161yN0) c5350je.f;
        c8161yN02.L("\r\n");
        c8161yN02.c0(c6129nj, j);
        c8161yN02.L("\r\n");
    }

    @Override // defpackage.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((C8161yN0) this.c.f).L("0\r\n\r\n");
        C5350je c5350je = this.c;
        HX hx = this.a;
        c5350je.getClass();
        C0334Ea1 c0334Ea1 = hx.e;
        hx.e = C0334Ea1.d;
        c0334Ea1.a();
        c0334Ea1.b();
        this.c.b = 3;
    }

    @Override // defpackage.Z11, java.io.Flushable
    public final synchronized void flush() {
        if (this.b) {
            return;
        }
        ((C8161yN0) this.c.f).flush();
    }

    @Override // defpackage.Z11
    public final C0334Ea1 r() {
        return this.a;
    }
}
