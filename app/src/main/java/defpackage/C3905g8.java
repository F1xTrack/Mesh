package defpackage;

/* renamed from: g8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3905g8 {
    public final Object a;
    public final Object b;

    public C3905g8(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3905g8)) {
            return false;
        }
        C3905g8 c3905g8 = (C3905g8) obj;
        return O90.a(this.a, c3905g8.a) && O90.a(this.b, c3905g8.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.a + ", upper=" + this.b + ')';
    }
}
