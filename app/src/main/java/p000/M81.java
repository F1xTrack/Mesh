package p000;

/* loaded from: classes2.dex */
public final class M81 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f7005e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC8296Sx0 f7006f;

    /* renamed from: g */
    public final /* synthetic */ Throwable f7007g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M81(InterfaceC8296Sx0 interfaceC8296Sx0, Throwable th, int i) {
        super(0);
        this.f7005e = i;
        this.f7006f = interfaceC8296Sx0;
        this.f7007g = th;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f7005e) {
            case 0:
                this.f7006f.onFailure(this.f7007g);
                break;
            default:
                this.f7006f.onFailure(this.f7007g);
                break;
        }
        return C8313Tf1.f11463a;
    }
}
