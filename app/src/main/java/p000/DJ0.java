package p000;

/* loaded from: classes2.dex */
public final class DJ0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f1968e;

    /* renamed from: f */
    public final /* synthetic */ GJ0 f1969f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DJ0(GJ0 gj0, int i) {
        super(0);
        this.f1968e = i;
        this.f1969f = gj0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f1968e) {
            case 0:
                return this.f1969f.f3682g.getReactHost();
            default:
                return (PL0) this.f1969f.m3026a("getReactNativeHost");
        }
    }
}
