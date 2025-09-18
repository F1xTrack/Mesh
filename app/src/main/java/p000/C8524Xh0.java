package p000;

/* renamed from: Xh0 */
/* loaded from: classes2.dex */
public final class C8524Xh0 extends AbstractC0203DD implements InterfaceC7780Iz0 {

    /* renamed from: i */
    public static final /* synthetic */ InterfaceC10293mf0[] f13921i;

    /* renamed from: d */
    public final C7454Cs0 f13922d;

    /* renamed from: e */
    public final C0664KX f13923e;

    /* renamed from: f */
    public final C8426Vk0 f13924f;

    /* renamed from: g */
    public final C8426Vk0 f13925g;

    /* renamed from: h */
    public final C8576Yh0 f13926h;

    static {
        IP0 ip0 = BP0.f799a;
        f13921i = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(C8524Xh0.class), "fragments", "getFragments()Ljava/util/List;")), ip0.mo3850f(new GE0(ip0.mo3846b(C8524Xh0.class), "empty", "getEmpty()Z"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8524Xh0(C7454Cs0 c7454Cs0, C0664KX c0664kx, C8582Yk0 c8582Yk0) {
        super(S20.f10539b, c0664kx.m4659g());
        O90.m5968f(c7454Cs0, "module");
        O90.m5968f(c0664kx, "fqName");
        O90.m5968f(c8582Yk0, "storageManager");
        this.f13922d = c7454Cs0;
        this.f13923e = c0664kx;
        this.f13924f = new C8426Vk0(c8582Yk0, new C8472Wh0(this, 1));
        this.f13925g = new C8426Vk0(c8582Yk0, new C8472Wh0(this, 0));
        this.f13926h = new C8576Yh0(c8582Yk0, new C8472Wh0(this, 2));
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: Z */
    public final Object mo421Z(InterfaceC0392GD interfaceC0392GD, Object obj) {
        return interfaceC0392GD.mo2847j(this, obj);
    }

    public final boolean equals(Object obj) {
        InterfaceC7780Iz0 interfaceC7780Iz0 = obj instanceof InterfaceC7780Iz0 ? (InterfaceC7780Iz0) obj : null;
        if (interfaceC7780Iz0 == null) {
            return false;
        }
        C8524Xh0 c8524Xh0 = (C8524Xh0) interfaceC7780Iz0;
        return O90.m5963a(this.f13923e, c8524Xh0.f13923e) && O90.m5963a(this.f13922d, c8524Xh0.f13922d);
    }

    public final int hashCode() {
        return this.f13923e.hashCode() + (this.f13922d.hashCode() * 31);
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: i */
    public final InterfaceC0140CD mo423i() {
        C0664KX c0664kx = this.f13923e;
        if (c0664kx.m4656d()) {
            return null;
        }
        C0664KX c0664kxM4657e = c0664kx.m4657e();
        O90.m5967e(c0664kxM4657e, "parent(...)");
        return this.f13922d.mo895C0(c0664kxM4657e);
    }
}
