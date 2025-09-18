package p000;

/* renamed from: Ld */
/* loaded from: classes.dex */
public final class C0732Ld {

    /* renamed from: a */
    public final Object f6772a;

    public C0732Ld(Object obj) {
        this.f6772a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0732Ld)) {
            return false;
        }
        return this.f6772a.equals(((C0732Ld) obj).f6772a);
    }

    public final int hashCode() {
        return this.f6772a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.f6772a + "}";
    }
}
