package defpackage;

/* renamed from: Ac, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026Ac {
    public final int a;
    public final Throwable b;

    public C0026Ac(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0026Ac)) {
            return false;
        }
        C0026Ac c0026Ac = (C0026Ac) obj;
        if (this.a == c0026Ac.a) {
            Throwable th = c0026Ac.b;
            Throwable th2 = this.b;
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
        int i = (this.a ^ 1000003) * 1000003;
        Throwable th = this.b;
        return i ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "StateError{code=" + this.a + ", cause=" + this.b + "}";
    }
}
