package p000;

/* renamed from: NK */
/* loaded from: classes2.dex */
public final class C0839NK extends AbstractC8356Ub0 {

    /* renamed from: e */
    public final /* synthetic */ int f7727e;

    /* renamed from: f */
    public final Object f7728f;

    public /* synthetic */ C0839NK(int i, Object obj) {
        this.f7727e = i;
        this.f7728f = obj;
    }

    @Override // p000.AbstractC8356Ub0
    /* renamed from: j */
    public final boolean mo2434j() {
        switch (this.f7727e) {
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nZ] */
    @Override // p000.AbstractC8356Ub0
    /* renamed from: k */
    public final void mo2435k(Throwable th) {
        switch (this.f7727e) {
            case 0:
                ((InterfaceC0776MK) this.f7728f).mo3407a();
                break;
            case 1:
                this.f7728f.invoke(th);
                break;
            default:
                Object obj = C9002cc0.f17647a.get(m8084i());
                boolean z = obj instanceof C6519nv;
                C8564Yb0 c8564Yb0 = (C8564Yb0) this.f7728f;
                if (!z) {
                    c8564Yb0.resumeWith(AbstractC9720iA1.m18978a(obj));
                    break;
                } else {
                    c8564Yb0.resumeWith(RQ1.m7015b(((C6519nv) obj).f38606a));
                    break;
                }
        }
    }
}
