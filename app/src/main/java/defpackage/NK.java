package defpackage;

/* loaded from: classes2.dex */
public final class NK extends AbstractC1583Ub0 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ NK(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.AbstractC1583Ub0
    public final boolean j() {
        switch (this.e) {
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nZ] */
    @Override // defpackage.AbstractC1583Ub0
    public final void k(Throwable th) {
        switch (this.e) {
            case 0:
                ((MK) this.f).a();
                break;
            case 1:
                this.f.invoke(th);
                break;
            default:
                Object obj = C2548cc0.a.get(i());
                boolean z = obj instanceof C6165nv;
                C1895Yb0 c1895Yb0 = (C1895Yb0) this.f;
                if (!z) {
                    c1895Yb0.resumeWith(AbstractC4295iA1.a(obj));
                    break;
                } else {
                    c1895Yb0.resumeWith(RQ1.b(((C6165nv) obj).a));
                    break;
                }
        }
    }
}
