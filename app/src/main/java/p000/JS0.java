package p000;

/* loaded from: classes.dex */
public final class JS0 extends AbstractC1259U0 {

    /* renamed from: c */
    public final InterfaceC1560Yn f5524c;

    /* renamed from: d */
    public final AbstractC9513gZ0 f5525d;

    public JS0(InterfaceC1560Yn interfaceC1560Yn, AbstractC9513gZ0 abstractC9513gZ0) {
        super(7, interfaceC1560Yn);
        this.f5524c = interfaceC1560Yn;
        this.f5525d = abstractC9513gZ0;
    }

    @Override // p000.AbstractC1259U0, p000.InterfaceC1560Yn
    /* renamed from: L */
    public final InterfaceFutureC7800Jj0 mo904L(float f) {
        return !NR1.m5689b(this.f5525d, 0) ? new F70(1, new IllegalStateException("Zoom is not supported")) : this.f5524c.mo904L(f);
    }

    @Override // p000.AbstractC1259U0, p000.InterfaceC1560Yn
    /* renamed from: h0 */
    public final InterfaceFutureC7800Jj0 mo918h0(boolean z) {
        return !NR1.m5689b(this.f5525d, 6) ? new F70(1, new IllegalStateException("Torch is not supported")) : this.f5524c.mo918h0(z);
    }

    @Override // p000.AbstractC1259U0, p000.InterfaceC1560Yn
    /* renamed from: j0 */
    public final InterfaceFutureC7800Jj0 mo921j0(C0974PT c0974pt) {
        C0974PT c0974ptM5688a = NR1.m5688a(this.f5525d, c0974pt);
        return c0974ptM5688a == null ? new F70(1, new IllegalStateException("FocusMetering is not supported")) : this.f5524c.mo921j0(c0974ptM5688a);
    }

    @Override // p000.AbstractC1259U0, p000.InterfaceC1560Yn
    /* renamed from: r0 */
    public final InterfaceFutureC7800Jj0 mo924r0(int i) {
        return !NR1.m5689b(this.f5525d, 7) ? new F70(1, new IllegalStateException("ExposureCompensation is not supported")) : this.f5524c.mo924r0(i);
    }
}
