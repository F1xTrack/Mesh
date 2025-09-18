package defpackage;

/* renamed from: Oo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1153Oo extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C1696Vn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1153Oo(C1696Vn c1696Vn, int i) {
        super(1);
        this.e = i;
        this.f = c1696Vn;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                C3840fo c3840fo = (C3840fo) obj;
                O90.f(c3840fo, "it");
                return Boolean.valueOf(c3840fo.j.contains(this.f.n));
            default:
                C3840fo c3840fo2 = (C3840fo) obj;
                O90.f(c3840fo2, "it");
                return Boolean.valueOf(c3840fo2.j.contains(this.f.n));
        }
    }
}
