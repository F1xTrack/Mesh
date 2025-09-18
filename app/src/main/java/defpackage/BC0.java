package defpackage;

/* loaded from: classes.dex */
public final class BC0 {
    public final String a;
    public final Long b;

    public BC0(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BC0)) {
            return false;
        }
        BC0 bc0 = (BC0) obj;
        return O90.a(this.a, bc0.a) && O90.a(this.b, bc0.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
