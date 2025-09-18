package p000;

/* renamed from: lI */
/* loaded from: classes2.dex */
public final class C6354lI extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f36997e;

    /* renamed from: f */
    public final /* synthetic */ C6417mI f36998f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6354lI(C6417mI c6417mI, int i) {
        super(1);
        this.f36997e = i;
        this.f36998f = c6417mI;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f36997e) {
            case 0:
                AbstractC10804qe1 abstractC10804qe1 = (AbstractC10804qe1) obj;
                O90.m5968f(abstractC10804qe1, "it");
                if (abstractC10804qe1.mo24039c()) {
                    return "*";
                }
                AbstractC7742Ig0 abstractC7742Ig0Mo24038b = abstractC10804qe1.mo24038b();
                O90.m5967e(abstractC7742Ig0Mo24038b, "getType(...)");
                String strM22736X = this.f36998f.m22736X(abstractC7742Ig0Mo24038b);
                if (abstractC10804qe1.mo24037a() == EnumC9532gi1.f27947c) {
                    return strM22736X;
                }
                return abstractC10804qe1.mo24037a() + ' ' + strM22736X;
            default:
                AbstractC7742Ig0 abstractC7742Ig0 = (AbstractC7742Ig0) obj;
                O90.m5965c(abstractC7742Ig0);
                return this.f36998f.m22736X(abstractC7742Ig0);
        }
    }
}
