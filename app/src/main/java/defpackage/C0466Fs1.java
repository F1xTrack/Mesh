package defpackage;

/* renamed from: Fs1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0466Fs1 {
    public final String a;
    public final Long b;

    public C0466Fs1(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0466Fs1) {
            C0466Fs1 c0466Fs1 = (C0466Fs1) obj;
            if (this.a.equals(c0466Fs1.a)) {
                Long l = c0466Fs1.b;
                Long l2 = this.b;
                if (l2 != null ? l2.equals(l) : l == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Long l = this.b;
        return (iHashCode * 1000003) ^ (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.a + ", cloudProjectNumber=" + this.b + "}";
    }
}
