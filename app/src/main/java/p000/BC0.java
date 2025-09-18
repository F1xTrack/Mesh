package p000;

/* loaded from: classes.dex */
public final class BC0 {

    /* renamed from: a */
    public final String f652a;

    /* renamed from: b */
    public final Long f653b;

    public BC0(String str, Long l) {
        this.f652a = str;
        this.f653b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BC0)) {
            return false;
        }
        BC0 bc0 = (BC0) obj;
        return O90.m5963a(this.f652a, bc0.f652a) && O90.m5963a(this.f653b, bc0.f653b);
    }

    public final int hashCode() {
        int iHashCode = this.f652a.hashCode() * 31;
        Long l = this.f653b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f652a + ", value=" + this.f653b + ')';
    }
}
