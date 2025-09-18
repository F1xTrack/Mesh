package p000;

/* renamed from: dv1 */
/* loaded from: classes2.dex */
public final class C9174dv1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f26390e;

    /* renamed from: f */
    public final /* synthetic */ C1068Qy f26391f;

    /* renamed from: g */
    public final /* synthetic */ C10326mv1 f26392g;

    /* renamed from: h */
    public final /* synthetic */ String f26393h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9174dv1(C1068Qy c1068Qy, C10326mv1 c10326mv1, String str, int i) {
        super(1);
        this.f26390e = i;
        this.f26391f = c1068Qy;
        this.f26392g = c10326mv1;
        this.f26393h = str;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        K81 k81 = (K81) obj;
        switch (this.f26390e) {
            case 0:
                O90.m5968f(k81, "$this$create");
                AbstractC9366fP1.m18230b(this.f26391f, null, new C8655Zu1(k81, null, this.f26392g, this.f26393h), 3);
                break;
            default:
                O90.m5968f(k81, "$this$create");
                AbstractC9366fP1.m18230b(this.f26391f, null, new C11859yv1(k81, null, this.f26392g, this.f26393h), 3);
                break;
        }
        return C8313Tf1.f11463a;
    }
}
