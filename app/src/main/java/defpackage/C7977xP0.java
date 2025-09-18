package defpackage;

/* renamed from: xP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7977xP0 {
    public final Class a;
    public final C5350je b;

    public C7977xP0(Class cls, C5350je c5350je) {
        this.a = cls;
        this.b = c5350je;
    }

    public final String a() {
        return D51.l(this.a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7977xP0) {
            if (O90.a(this.a, ((C7977xP0) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        NX.n(C7977xP0.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }
}
