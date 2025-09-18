package defpackage;

/* renamed from: Qv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1330Qv extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ KX f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1330Qv(KX kx, int i) {
        super(1);
        this.e = i;
        this.f = kx;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                I5 i5 = (I5) obj;
                O90.f(i5, "it");
                return i5.D(this.f);
            default:
                KX kx = (KX) obj;
                O90.f(kx, "it");
                return Boolean.valueOf(!kx.d() && O90.a(kx.e(), this.f));
        }
    }
}
