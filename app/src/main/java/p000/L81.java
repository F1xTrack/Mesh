package p000;

/* loaded from: classes2.dex */
public final class L81 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f6515e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC9179dy0 f6516f;

    /* renamed from: g */
    public final /* synthetic */ Object f6517g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L81(InterfaceC9179dy0 interfaceC9179dy0, Object obj, int i) {
        super(0);
        this.f6515e = i;
        this.f6516f = interfaceC9179dy0;
        this.f6517g = obj;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f6515e) {
            case 0:
                this.f6516f.onSuccess(this.f6517g);
                break;
            default:
                this.f6516f.onSuccess(this.f6517g);
                break;
        }
        return C8313Tf1.f11463a;
    }
}
