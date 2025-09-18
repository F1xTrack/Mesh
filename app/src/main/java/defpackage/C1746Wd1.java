package defpackage;

/* renamed from: Wd1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1746Wd1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C1902Yd1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1746Wd1(C1902Yd1 c1902Yd1, int i) {
        super(1);
        this.e = i;
        this.f = c1902Yd1;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C1666Vd c1666Vd = this.f.a;
                C0074As c0074AsA = CB1.a((InterfaceC1637Ut0) c1666Vd.d, iIntValue);
                boolean z = c0074AsA.c;
                C7955xI c7955xI = (C7955xI) c1666Vd.c;
                return z ? c7955xI.b(c0074AsA) : AbstractC3312d12.c(c7955xI.b, c0074AsA);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                C1666Vd c1666Vd2 = this.f.a;
                C0074As c0074AsA2 = CB1.a((InterfaceC1637Ut0) c1666Vd2.d, iIntValue2);
                if (c0074AsA2.c) {
                    return null;
                }
                InterfaceC0153Bs0 interfaceC0153Bs0 = ((C7955xI) c1666Vd2.c).b;
                O90.f(interfaceC0153Bs0, "<this>");
                InterfaceC1087Ns interfaceC1087NsC = AbstractC3312d12.c(interfaceC0153Bs0, c0074AsA2);
                if (interfaceC1087NsC instanceof InterfaceC0499Gd1) {
                    return (InterfaceC0499Gd1) interfaceC1087NsC;
                }
                return null;
            default:
                AF0 af0 = (AF0) obj;
                O90.f(af0, "it");
                return AbstractC2123aN1.b(af0, (C5826m71) this.f.a.b);
        }
    }
}
