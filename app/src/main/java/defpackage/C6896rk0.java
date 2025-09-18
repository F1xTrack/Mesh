package defpackage;

/* renamed from: rk0 */
/* loaded from: classes.dex */
public final class C6896rk0 extends C0390Et0 {
    public final C7509ux1 l;
    public Object m;
    public C1135Oi n;

    public C6896rk0(C7509ux1 c7509ux1) {
        this.l = c7509ux1;
        if (c7509ux1.a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        c7509ux1.a = this;
    }

    @Override // androidx.lifecycle.b
    public final void g() {
        C7509ux1 c7509ux1 = this.l;
        c7509ux1.c = true;
        c7509ux1.e = false;
        c7509ux1.d = false;
        c7509ux1.k.drainPermits();
        c7509ux1.f();
    }

    @Override // androidx.lifecycle.b
    public final void h() {
        this.l.c = false;
    }

    @Override // androidx.lifecycle.b
    public final void i(InterfaceC3677ex0 interfaceC3677ex0) {
        super.i(interfaceC3677ex0);
        this.m = null;
        this.n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [Li0, java.lang.Object] */
    public final void l() {
        ?? r0 = this.m;
        C1135Oi c1135Oi = this.n;
        if (r0 == 0 || c1135Oi == null) {
            return;
        }
        super.i(c1135Oi);
        e(r0, c1135Oi);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
