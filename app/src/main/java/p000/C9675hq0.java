package p000;

/* renamed from: hq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9675hq0 extends AbstractC9803iq0 {

    /* renamed from: d */
    public static final C9675hq0 f28618d = new C9675hq0("must be a member function", 0);

    /* renamed from: e */
    public static final C9675hq0 f28619e = new C9675hq0("must be a member or an extension function", 1);

    /* renamed from: c */
    public final /* synthetic */ int f28620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9675hq0(String str, int i) {
        super(str, 0);
        this.f28620c = i;
    }

    @Override // p000.InterfaceC7290zr
    /* renamed from: a */
    public final boolean mo7727a(C9261eb0 c9261eb0) {
        switch (this.f28620c) {
            case 0:
                return c9261eb0.f1435k != null;
            default:
                return (c9261eb0.f1435k == null && c9261eb0.f1434j == null) ? false : true;
        }
    }
}
