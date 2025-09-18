package p000;

/* renamed from: rk0 */
/* loaded from: classes.dex */
public final class C10943rk0 extends C7560Et0 {

    /* renamed from: l */
    public final C11354ux1 f41839l;

    /* renamed from: m */
    public Object f41840m;

    /* renamed from: n */
    public C0926Oi f41841n;

    public C10943rk0(C11354ux1 c11354ux1) {
        this.f41839l = c11354ux1;
        if (c11354ux1.f41356a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        c11354ux1.f41356a = this;
    }

    @Override // androidx.lifecycle.AbstractC1743b
    /* renamed from: g */
    public final void mo1869g() {
        C11354ux1 c11354ux1 = this.f41839l;
        c11354ux1.f41358c = true;
        c11354ux1.f41360e = false;
        c11354ux1.f41359d = false;
        c11354ux1.f44050k.drainPermits();
        c11354ux1.m24165f();
    }

    @Override // androidx.lifecycle.AbstractC1743b
    /* renamed from: h */
    public final void mo1870h() {
        this.f41839l.f41358c = false;
    }

    @Override // androidx.lifecycle.AbstractC1743b
    /* renamed from: i */
    public final void mo10135i(InterfaceC9305ex0 interfaceC9305ex0) {
        super.mo10135i(interfaceC9305ex0);
        this.f41840m = null;
        this.f41841n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [Li0, java.lang.Object] */
    /* renamed from: l */
    public final void m24468l() {
        ?? r0 = this.f41840m;
        C0926Oi c0926Oi = this.f41841n;
        if (r0 == 0 || c0926Oi == null) {
            return;
        }
        super.mo10135i(c0926Oi);
        m10133e(r0, c0926Oi);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.f41839l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
