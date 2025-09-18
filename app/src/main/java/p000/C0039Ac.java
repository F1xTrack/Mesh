package p000;

/* renamed from: Ac */
/* loaded from: classes.dex */
public final class C0039Ac {

    /* renamed from: a */
    public final int f278a;

    /* renamed from: b */
    public final Throwable f279b;

    public C0039Ac(int i, Throwable th) {
        this.f278a = i;
        this.f279b = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0039Ac)) {
            return false;
        }
        C0039Ac c0039Ac = (C0039Ac) obj;
        if (this.f278a == c0039Ac.f278a) {
            Throwable th = c0039Ac.f279b;
            Throwable th2 = this.f279b;
            if (th2 == null) {
                if (th == null) {
                    return true;
                }
            } else if (th2.equals(th)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f278a ^ 1000003) * 1000003;
        Throwable th = this.f279b;
        return i ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "StateError{code=" + this.f278a + ", cause=" + this.f279b + "}";
    }
}
