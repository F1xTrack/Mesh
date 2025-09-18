package defpackage;

/* loaded from: classes.dex */
public final class JS0 extends U0 {
    public final InterfaceC1930Yn c;
    public final AbstractC3987gZ0 d;

    public JS0(InterfaceC1930Yn interfaceC1930Yn, AbstractC3987gZ0 abstractC3987gZ0) {
        super(7, interfaceC1930Yn);
        this.c = interfaceC1930Yn;
        this.d = abstractC3987gZ0;
    }

    @Override // defpackage.U0, defpackage.InterfaceC1930Yn
    public final InterfaceFutureC0750Jj0 L(float f) {
        return !NR1.b(this.d, 0) ? new F70(1, new IllegalStateException("Zoom is not supported")) : this.c.L(f);
    }

    @Override // defpackage.U0, defpackage.InterfaceC1930Yn
    public final InterfaceFutureC0750Jj0 h0(boolean z) {
        return !NR1.b(this.d, 6) ? new F70(1, new IllegalStateException("Torch is not supported")) : this.c.h0(z);
    }

    @Override // defpackage.U0, defpackage.InterfaceC1930Yn
    public final InterfaceFutureC0750Jj0 j0(PT pt) {
        PT ptA = NR1.a(this.d, pt);
        return ptA == null ? new F70(1, new IllegalStateException("FocusMetering is not supported")) : this.c.j0(ptA);
    }

    @Override // defpackage.U0, defpackage.InterfaceC1930Yn
    public final InterfaceFutureC0750Jj0 r0(int i) {
        return !NR1.b(this.d, 7) ? new F70(1, new IllegalStateException("ExposureCompensation is not supported")) : this.c.r0(i);
    }
}
