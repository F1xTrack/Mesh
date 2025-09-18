package defpackage;

/* renamed from: dv1 */
/* loaded from: classes2.dex */
public final class C3481dv1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C1339Qy f;
    public final /* synthetic */ C5976mv1 g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3481dv1(C1339Qy c1339Qy, C5976mv1 c5976mv1, String str, int i) {
        super(1);
        this.e = i;
        this.f = c1339Qy;
        this.g = c5976mv1;
        this.h = str;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        K81 k81 = (K81) obj;
        switch (this.e) {
            case 0:
                O90.f(k81, "$this$create");
                AbstractC3767fP1.b(this.f, null, new C2031Zu1(k81, null, this.g, this.h), 3);
                break;
            default:
                O90.f(k81, "$this$create");
                AbstractC3767fP1.b(this.f, null, new C8264yv1(k81, null, this.g, this.h), 3);
                break;
        }
        return C1518Tf1.a;
    }
}
