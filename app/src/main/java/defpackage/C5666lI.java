package defpackage;

/* renamed from: lI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5666lI extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C5857mI f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5666lI(C5857mI c5857mI, int i) {
        super(1);
        this.e = i;
        this.f = c5857mI;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                AbstractC6689qe1 abstractC6689qe1 = (AbstractC6689qe1) obj;
                O90.f(abstractC6689qe1, "it");
                if (abstractC6689qe1.c()) {
                    return "*";
                }
                AbstractC0663Ig0 abstractC0663Ig0B = abstractC6689qe1.b();
                O90.e(abstractC0663Ig0B, "getType(...)");
                String strX = this.f.X(abstractC0663Ig0B);
                if (abstractC6689qe1.a() == EnumC4015gi1.c) {
                    return strX;
                }
                return abstractC6689qe1.a() + ' ' + strX;
            default:
                AbstractC0663Ig0 abstractC0663Ig0 = (AbstractC0663Ig0) obj;
                O90.c(abstractC0663Ig0);
                return this.f.X(abstractC0663Ig0);
        }
    }
}
