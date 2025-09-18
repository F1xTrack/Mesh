package p000;

/* renamed from: Wd1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8465Wd1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f13300e;

    /* renamed from: f */
    public final /* synthetic */ C8569Yd1 f13301f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8465Wd1(C8569Yd1 c8569Yd1, int i) {
        super(1);
        this.f13300e = i;
        this.f13301f = c8569Yd1;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f13300e) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C1361Vd c1361Vd = this.f13301f.f14399a;
                C0055As c0055AsM1001a = CB1.m1001a((InterfaceC8392Ut0) c1361Vd.f12663d, iIntValue);
                boolean z = c0055AsM1001a.f453c;
                C7129xI c7129xI = (C7129xI) c1361Vd.f12662c;
                return z ? c7129xI.m25826b(c0055AsM1001a) : AbstractC9060d12.m17466c(c7129xI.f45519b, c0055AsM1001a);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                C1361Vd c1361Vd2 = this.f13301f.f14399a;
                C0055As c0055AsM1001a2 = CB1.m1001a((InterfaceC8392Ut0) c1361Vd2.f12663d, iIntValue2);
                if (c0055AsM1001a2.f453c) {
                    return null;
                }
                InterfaceC7402Bs0 interfaceC7402Bs0 = ((C7129xI) c1361Vd2.f12662c).f45519b;
                O90.m5968f(interfaceC7402Bs0, "<this>");
                InterfaceC0873Ns interfaceC0873NsM17466c = AbstractC9060d12.m17466c(interfaceC7402Bs0, c0055AsM1001a2);
                if (interfaceC0873NsM17466c instanceof InterfaceC7633Gd1) {
                    return (InterfaceC7633Gd1) interfaceC0873NsM17466c;
                }
                return null;
            default:
                AF0 af0 = (AF0) obj;
                O90.m5968f(af0, "it");
                return AbstractC8717aN1.m9722b(af0, (C10226m71) this.f13301f.f14399a.f12661b);
        }
    }
}
