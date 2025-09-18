package p000;

/* loaded from: classes2.dex */
public final class V30 implements Z11 {

    /* renamed from: a */
    public final C0475HX f12334a;

    /* renamed from: b */
    public boolean f12335b;

    /* renamed from: c */
    public final /* synthetic */ C6250je f12336c;

    public V30(C6250je c6250je) {
        this.f12336c = c6250je;
        this.f12334a = new C0475HX(((C11790yN0) c6250je.f35301f).f46236a.mo2329r());
    }

    @Override // p000.Z11
    /* renamed from: c0 */
    public final void mo2328c0(C6507nj c6507nj, long j) {
        O90.m5968f(c6507nj, "source");
        if (this.f12335b) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        C6250je c6250je = this.f12336c;
        C11790yN0 c11790yN0 = (C11790yN0) c6250je.f35301f;
        if (c11790yN0.f46238c) {
            throw new IllegalStateException("closed");
        }
        c11790yN0.f46237b.m23197t0(j);
        c11790yN0.m26143m();
        C11790yN0 c11790yN02 = (C11790yN0) c6250je.f35301f;
        c11790yN02.mo4391L("\r\n");
        c11790yN02.mo2328c0(c6507nj, j);
        c11790yN02.mo4391L("\r\n");
    }

    @Override // p000.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f12335b) {
            return;
        }
        this.f12335b = true;
        ((C11790yN0) this.f12336c.f35301f).mo4391L("0\r\n\r\n");
        C6250je c6250je = this.f12336c;
        C0475HX c0475hx = this.f12334a;
        c6250je.getClass();
        C7523Ea1 c7523Ea1 = c0475hx.f4333e;
        c0475hx.f4333e = C7523Ea1.f2789d;
        c7523Ea1.mo2356a();
        c7523Ea1.mo2357b();
        this.f12336c.f35297b = 3;
    }

    @Override // p000.Z11, java.io.Flushable
    public final synchronized void flush() {
        if (this.f12335b) {
            return;
        }
        ((C11790yN0) this.f12336c.f35301f).flush();
    }

    @Override // p000.Z11
    /* renamed from: r */
    public final C7523Ea1 mo2329r() {
        return this.f12334a;
    }
}
