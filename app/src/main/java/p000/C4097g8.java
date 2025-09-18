package p000;

/* renamed from: g8 */
/* loaded from: classes2.dex */
public final class C4097g8 {

    /* renamed from: a */
    public final Object f27577a;

    /* renamed from: b */
    public final Object f27578b;

    public C4097g8(Object obj, Object obj2) {
        this.f27577a = obj;
        this.f27578b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4097g8)) {
            return false;
        }
        C4097g8 c4097g8 = (C4097g8) obj;
        return O90.m5963a(this.f27577a, c4097g8.f27577a) && O90.m5963a(this.f27578b, c4097g8.f27578b);
    }

    public final int hashCode() {
        Object obj = this.f27577a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f27578b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f27577a + ", upper=" + this.f27578b + ')';
    }
}
