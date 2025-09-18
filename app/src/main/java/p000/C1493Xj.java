package p000;

/* renamed from: Xj */
/* loaded from: classes2.dex */
public final class C1493Xj extends AbstractC7364Az0 implements InterfaceC11993zz0 {

    /* renamed from: h */
    public final C1178Sj f13931h;

    /* renamed from: i */
    public final C7967Mo1 f13932i;

    /* renamed from: j */
    public final C10919rY0 f13933j;

    /* renamed from: k */
    public C10497oF0 f13934k;

    /* renamed from: l */
    public C1151SI f13935l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1493Xj(C0664KX c0664kx, Z41 z41, InterfaceC7402Bs0 interfaceC7402Bs0, C10497oF0 c10497oF0, C1178Sj c1178Sj) {
        super(interfaceC7402Bs0, c0664kx);
        O90.m5968f(c0664kx, "fqName");
        O90.m5968f(z41, "storageManager");
        O90.m5968f(interfaceC7402Bs0, "module");
        this.f13931h = c1178Sj;
        C11393vF0 c11393vF0 = c10497oF0.f38908d;
        O90.m5967e(c11393vF0, "getStrings(...)");
        C11265uF0 c11265uF0 = c10497oF0.f38909e;
        O90.m5967e(c11265uF0, "getQualifiedNames(...)");
        O90.m5968f(c11393vF0, "strings");
        O90.m5968f(c11265uF0, "qualifiedNames");
        C7967Mo1 c7967Mo1 = new C7967Mo1();
        c7967Mo1.f7362a = c11393vF0;
        c7967Mo1.f7363b = c11265uF0;
        this.f13932i = c7967Mo1;
        this.f13933j = new C10919rY0(c10497oF0, c7967Mo1, c1178Sj, new C7236z(12, this));
        this.f13934k = c10497oF0;
    }

    @Override // p000.InterfaceC11993zz0
    /* renamed from: d0 */
    public final InterfaceC10059kq0 mo2748d0() {
        C1151SI c1151si = this.f13935l;
        if (c1151si != null) {
            return c1151si;
        }
        O90.m5977o("_memberScope");
        throw null;
    }

    @Override // p000.AbstractC7364Az0, p000.AbstractC0203DD, p000.AbstractC1259U0
    public final String toString() {
        return "builtins package fragment for " + this.f494f + " from " + AbstractC6940uI.m25157j(this);
    }

    /* renamed from: z1 */
    public final void m9109z1(C7129xI c7129xI) {
        O90.m5968f(c7129xI, "components");
        C10497oF0 c10497oF0 = this.f13934k;
        if (c10497oF0 == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f13934k = null;
        C10241mF0 c10241mF0 = c10497oF0.f38910f;
        O90.m5967e(c10241mF0, "getPackage(...)");
        this.f13935l = new C1151SI(this, c10241mF0, this.f13932i, this.f13931h, null, c7129xI, "scope of " + this, new C4090g1(14, this));
    }
}
