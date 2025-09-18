package p000;

/* renamed from: Oo */
/* loaded from: classes2.dex */
public final class C0932Oo extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f8625e;

    /* renamed from: f */
    public final /* synthetic */ C1371Vn f8626f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0932Oo(C1371Vn c1371Vn, int i) {
        super(1);
        this.f8625e = i;
        this.f8626f = c1371Vn;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f8625e) {
            case 0:
                C4076fo c4076fo = (C4076fo) obj;
                O90.m5968f(c4076fo, "it");
                return Boolean.valueOf(c4076fo.f27396j.contains(this.f8626f.f12745n));
            default:
                C4076fo c4076fo2 = (C4076fo) obj;
                O90.m5968f(c4076fo2, "it");
                return Boolean.valueOf(c4076fo2.f27396j.contains(this.f8626f.f12745n));
        }
    }
}
