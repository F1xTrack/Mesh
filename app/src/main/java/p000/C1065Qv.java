package p000;

/* renamed from: Qv */
/* loaded from: classes2.dex */
public final class C1065Qv extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f9863e;

    /* renamed from: f */
    public final /* synthetic */ C0664KX f9864f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1065Qv(C0664KX c0664kx, int i) {
        super(1);
        this.f9863e = i;
        this.f9864f = c0664kx;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f9863e) {
            case 0:
                InterfaceC0510I5 interfaceC0510I5 = (InterfaceC0510I5) obj;
                O90.m5968f(interfaceC0510I5, "it");
                return interfaceC0510I5.mo3260D(this.f9864f);
            default:
                C0664KX c0664kx = (C0664KX) obj;
                O90.m5968f(c0664kx, "it");
                return Boolean.valueOf(!c0664kx.m4656d() && O90.m5963a(c0664kx.m4657e(), this.f9864f));
        }
    }
}
