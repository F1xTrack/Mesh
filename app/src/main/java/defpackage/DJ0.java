package defpackage;

/* loaded from: classes2.dex */
public final class DJ0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ GJ0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DJ0(GJ0 gj0, int i) {
        super(0);
        this.e = i;
        this.f = gj0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return this.f.g.getReactHost();
            default:
                return (PL0) this.f.a("getReactNativeHost");
        }
    }
}
