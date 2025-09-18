package defpackage;

/* renamed from: Xj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1840Xj extends AbstractC0096Az0 implements InterfaceC8465zz0 {
    public final C1450Sj h;
    public final C0999Mo1 i;
    public final C6860rY0 j;
    public C6231oF0 k;
    public SI l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1840Xj(KX kx, Z41 z41, InterfaceC0153Bs0 interfaceC0153Bs0, C6231oF0 c6231oF0, C1450Sj c1450Sj) {
        super(interfaceC0153Bs0, kx);
        O90.f(kx, "fqName");
        O90.f(z41, "storageManager");
        O90.f(interfaceC0153Bs0, "module");
        this.h = c1450Sj;
        C7567vF0 c7567vF0 = c6231oF0.d;
        O90.e(c7567vF0, "getStrings(...)");
        C7376uF0 c7376uF0 = c6231oF0.e;
        O90.e(c7376uF0, "getQualifiedNames(...)");
        O90.f(c7567vF0, "strings");
        O90.f(c7376uF0, "qualifiedNames");
        C0999Mo1 c0999Mo1 = new C0999Mo1();
        c0999Mo1.a = c7567vF0;
        c0999Mo1.b = c7376uF0;
        this.i = c0999Mo1;
        this.j = new C6860rY0(c6231oF0, c0999Mo1, c1450Sj, new C8277z(12, this));
        this.k = c6231oF0;
    }

    @Override // defpackage.InterfaceC8465zz0
    public final InterfaceC5578kq0 d0() {
        SI si = this.l;
        if (si != null) {
            return si;
        }
        O90.o("_memberScope");
        throw null;
    }

    @Override // defpackage.AbstractC0096Az0, defpackage.DD, defpackage.U0
    public final String toString() {
        return "builtins package fragment for " + this.f + " from " + AbstractC7384uI.j(this);
    }

    public final void z1(C7955xI c7955xI) {
        O90.f(c7955xI, "components");
        C6231oF0 c6231oF0 = this.k;
        if (c6231oF0 == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.k = null;
        C5849mF0 c5849mF0 = c6231oF0.f;
        O90.e(c5849mF0, "getPackage(...)");
        this.l = new SI(this, c5849mF0, this.i, this.h, null, c7955xI, "scope of " + this, new C3881g1(14, this));
    }
}
