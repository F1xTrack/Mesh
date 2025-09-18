package defpackage;

/* loaded from: classes2.dex */
public final class K41 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ L41 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K41(L41 l41, int i) {
        super(0);
        this.e = i;
        this.f = l41;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        L41 l41 = this.f;
        switch (this.e) {
            case 0:
                return AbstractC8259yu.f(EZ1.f(l41.b), EZ1.g(l41.b));
            default:
                return l41.c ? AbstractC8259yu.g(EZ1.e(l41.b)) : MN.a;
        }
    }
}
