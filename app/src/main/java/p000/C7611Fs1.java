package p000;

/* renamed from: Fs1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7611Fs1 {

    /* renamed from: a */
    public final String f3457a;

    /* renamed from: b */
    public final Long f3458b;

    public C7611Fs1(String str, Long l) {
        this.f3457a = str;
        this.f3458b = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7611Fs1) {
            C7611Fs1 c7611Fs1 = (C7611Fs1) obj;
            if (this.f3457a.equals(c7611Fs1.f3457a)) {
                Long l = c7611Fs1.f3458b;
                Long l2 = this.f3458b;
                if (l2 != null ? l2.equals(l) : l == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f3457a.hashCode() ^ 1000003;
        Long l = this.f3458b;
        return (iHashCode * 1000003) ^ (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.f3457a + ", cloudProjectNumber=" + this.f3458b + "}";
    }
}
