package defpackage;

/* renamed from: ff0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3814ff0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C4005gf0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3814ff0(C4005gf0 c4005gf0, int i) {
        super(0);
        this.e = i;
        this.f = c4005gf0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return new C3623ef0(this.f);
            default:
                return this.f.t();
        }
    }
}
