package p000;

/* renamed from: Uh1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8369Uh1 extends AbstractC9803iq0 {

    /* renamed from: d */
    public static final C8369Uh1 f11978d = new C8369Uh1("must have no value parameters", 0);

    /* renamed from: e */
    public static final C8369Uh1 f11979e = new C8369Uh1("must have a single value parameter", 1);

    /* renamed from: c */
    public final /* synthetic */ int f11980c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8369Uh1(String str, int i) {
        super(str, 1);
        this.f11980c = i;
    }

    @Override // p000.InterfaceC7290zr
    /* renamed from: a */
    public final boolean mo7727a(C9261eb0 c9261eb0) {
        switch (this.f11980c) {
            case 0:
                return c9261eb0.mo1221f0().isEmpty();
            default:
                return c9261eb0.mo1221f0().size() == 1;
        }
    }
}
