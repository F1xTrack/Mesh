package defpackage;

/* loaded from: classes2.dex */
public final class M81 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ InterfaceC1493Sx0 f;
    public final /* synthetic */ Throwable g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M81(InterfaceC1493Sx0 interfaceC1493Sx0, Throwable th, int i) {
        super(0);
        this.e = i;
        this.f = interfaceC1493Sx0;
        this.g = th;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.f.onFailure(this.g);
                break;
            default:
                this.f.onFailure(this.g);
                break;
        }
        return C1518Tf1.a;
    }
}
