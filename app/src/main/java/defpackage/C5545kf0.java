package defpackage;

/* renamed from: kf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5545kf0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C5736lf0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5545kf0(C5736lf0 c5736lf0, int i) {
        super(0);
        this.e = i;
        this.f = c5736lf0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return new C5354jf0(this.f);
            default:
                return this.f.t();
        }
    }
}
