package p000;

/* renamed from: xP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11667xP0 {

    /* renamed from: a */
    public final Class f45572a;

    /* renamed from: b */
    public final C6250je f45573b;

    public C11667xP0(Class cls, C6250je c6250je) {
        this.f45572a = cls;
        this.f45573b = c6250je;
    }

    /* renamed from: a */
    public final String m25849a() {
        return D51.m1553l(this.f45572a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11667xP0) {
            if (O90.m5963a(this.f45572a, ((C11667xP0) obj).f45572a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f45572a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC0852NX.m5765n(C11667xP0.class, sb, ": ");
        sb.append(this.f45572a);
        return sb.toString();
    }
}
