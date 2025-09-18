package defpackage;

/* loaded from: classes2.dex */
public final class L81 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ InterfaceC3489dy0 f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L81(InterfaceC3489dy0 interfaceC3489dy0, Object obj, int i) {
        super(0);
        this.e = i;
        this.f = interfaceC3489dy0;
        this.g = obj;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.f.onSuccess(this.g);
                break;
            default:
                this.f.onSuccess(this.g);
                break;
        }
        return C1518Tf1.a;
    }
}
