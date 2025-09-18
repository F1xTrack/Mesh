package defpackage;

/* renamed from: Xh0 */
/* loaded from: classes2.dex */
public final class C1835Xh0 extends DD implements InterfaceC0720Iz0 {
    public static final /* synthetic */ InterfaceC5927mf0[] i;
    public final C0231Cs0 d;
    public final KX e;
    public final C1688Vk0 f;
    public final C1688Vk0 g;
    public final C1913Yh0 h;

    static {
        IP0 ip0 = BP0.a;
        i = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(C1835Xh0.class), "fragments", "getFragments()Ljava/util/List;")), ip0.f(new GE0(ip0.b(C1835Xh0.class), "empty", "getEmpty()Z"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1835Xh0(C0231Cs0 c0231Cs0, KX kx, C1922Yk0 c1922Yk0) {
        super(S20.b, kx.g());
        O90.f(c0231Cs0, "module");
        O90.f(kx, "fqName");
        O90.f(c1922Yk0, "storageManager");
        this.d = c0231Cs0;
        this.e = kx;
        this.f = new C1688Vk0(c1922Yk0, new C1757Wh0(this, 1));
        this.g = new C1688Vk0(c1922Yk0, new C1757Wh0(this, 0));
        this.h = new C1913Yh0(c1922Yk0, new C1757Wh0(this, 2));
    }

    @Override // defpackage.CD
    public final Object Z(GD gd, Object obj) {
        return gd.j(this, obj);
    }

    public final boolean equals(Object obj) {
        InterfaceC0720Iz0 interfaceC0720Iz0 = obj instanceof InterfaceC0720Iz0 ? (InterfaceC0720Iz0) obj : null;
        if (interfaceC0720Iz0 == null) {
            return false;
        }
        C1835Xh0 c1835Xh0 = (C1835Xh0) interfaceC0720Iz0;
        return O90.a(this.e, c1835Xh0.e) && O90.a(this.d, c1835Xh0.d);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    @Override // defpackage.CD
    public final CD i() {
        KX kx = this.e;
        if (kx.d()) {
            return null;
        }
        KX kxE = kx.e();
        O90.e(kxE, "parent(...)");
        return this.d.C0(kxE);
    }
}
