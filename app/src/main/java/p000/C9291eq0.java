package p000;

/* renamed from: eq0 */
/* loaded from: classes2.dex */
public final class C9291eq0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f26910e;

    /* renamed from: f */
    public final /* synthetic */ C9547gq0 f26911f;

    /* renamed from: g */
    public final /* synthetic */ C10753qF0 f26912g;

    /* renamed from: h */
    public final /* synthetic */ C1214TI f26913h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9291eq0(C9547gq0 c9547gq0, C10753qF0 c10753qF0, C1214TI c1214ti, int i) {
        super(0);
        this.f26910e = i;
        this.f26911f = c9547gq0;
        this.f26912g = c10753qF0;
        this.f26913h = c1214ti;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f26910e) {
            case 0:
                C9547gq0 c9547gq0 = this.f26911f;
                AbstractC7598Fm0 abstractC7598Fm0M18662a = c9547gq0.m18662a((InterfaceC0140CD) c9547gq0.f28057a.f12664e);
                O90.m5965c(abstractC7598Fm0M18662a);
                InterfaceC6658q5 interfaceC6658q5 = ((C7129xI) c9547gq0.f28057a.f12662c).f45522e;
                AbstractC7742Ig0 returnType = this.f26913h.getReturnType();
                O90.m5967e(returnType, "getReturnType(...)");
                return (AbstractC0249Dx) interfaceC6658q5.mo2293l(abstractC7598Fm0M18662a, this.f26912g, returnType);
            case 1:
                C9547gq0 c9547gq02 = this.f26911f;
                Z41 z41 = ((C7129xI) c9547gq02.f28057a.f12662c).f45518a;
                C9291eq0 c9291eq0 = new C9291eq0(c9547gq02, this.f26912g, this.f26913h, 0);
                C8582Yk0 c8582Yk0 = (C8582Yk0) z41;
                c8582Yk0.getClass();
                return new C8374Uk0(c8582Yk0, c9291eq0);
            case 2:
                C9547gq0 c9547gq03 = this.f26911f;
                AbstractC7598Fm0 abstractC7598Fm0M18662a2 = c9547gq03.m18662a((InterfaceC0140CD) c9547gq03.f28057a.f12664e);
                O90.m5965c(abstractC7598Fm0M18662a2);
                InterfaceC6658q5 interfaceC6658q52 = ((C7129xI) c9547gq03.f28057a.f12662c).f45522e;
                AbstractC7742Ig0 returnType2 = this.f26913h.getReturnType();
                O90.m5967e(returnType2, "getReturnType(...)");
                return (AbstractC0249Dx) interfaceC6658q52.mo2292e(abstractC7598Fm0M18662a2, this.f26912g, returnType2);
            default:
                C9547gq0 c9547gq04 = this.f26911f;
                Z41 z412 = ((C7129xI) c9547gq04.f28057a.f12662c).f45518a;
                C9291eq0 c9291eq02 = new C9291eq0(c9547gq04, this.f26912g, this.f26913h, 2);
                C8582Yk0 c8582Yk02 = (C8582Yk0) z412;
                c8582Yk02.getClass();
                return new C8374Uk0(c8582Yk02, c9291eq02);
        }
    }
}
