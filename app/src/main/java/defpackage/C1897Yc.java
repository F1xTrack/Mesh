package defpackage;

/* renamed from: Yc */
/* loaded from: classes.dex */
public final class C1897Yc extends PA {
    public final long a;
    public final String b;
    public final C1975Zc c;
    public final C5538kd d;
    public final C5729ld e;
    public final C6493pd f;

    public C1897Yc(long j, String str, C1975Zc c1975Zc, C5538kd c5538kd, C5729ld c5729ld, C6493pd c6493pd) {
        this.a = j;
        this.b = str;
        this.c = c1975Zc;
        this.d = c5538kd;
        this.e = c5729ld;
        this.f = c6493pd;
    }

    public final C1819Xc a() {
        C1819Xc c1819Xc = new C1819Xc();
        c1819Xc.a = this.a;
        c1819Xc.b = this.b;
        c1819Xc.c = this.c;
        c1819Xc.d = this.d;
        c1819Xc.e = this.e;
        c1819Xc.f = this.f;
        c1819Xc.g = (byte) 1;
        return c1819Xc;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PA)) {
            return false;
        }
        C1897Yc c1897Yc = (C1897Yc) ((PA) obj);
        if (this.a == c1897Yc.a) {
            if (this.b.equals(c1897Yc.b) && this.c.equals(c1897Yc.c) && this.d.equals(c1897Yc.d)) {
                C5729ld c5729ld = c1897Yc.e;
                C5729ld c5729ld2 = this.e;
                if (c5729ld2 != null ? c5729ld2.equals(c5729ld) : c5729ld == null) {
                    C6493pd c6493pd = c1897Yc.f;
                    C6493pd c6493pd2 = this.f;
                    if (c6493pd2 == null) {
                        if (c6493pd == null) {
                            return true;
                        }
                    } else if (c6493pd2.equals(c6493pd)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        C5729ld c5729ld = this.e;
        int iHashCode2 = (iHashCode ^ (c5729ld == null ? 0 : c5729ld.hashCode())) * 1000003;
        C6493pd c6493pd = this.f;
        return iHashCode2 ^ (c6493pd != null ? c6493pd.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
