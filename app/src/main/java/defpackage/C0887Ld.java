package defpackage;

/* renamed from: Ld, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0887Ld {
    public final Object a;

    public C0887Ld(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0887Ld)) {
            return false;
        }
        return this.a.equals(((C0887Ld) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.a + "}";
    }
}
