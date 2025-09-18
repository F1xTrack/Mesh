package defpackage;

/* renamed from: Sd */
/* loaded from: classes.dex */
public final class C1432Sd {
    public final String a;
    public final long b;
    public final long c;

    public C1432Sd(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1432Sd)) {
            return false;
        }
        C1432Sd c1432Sd = (C1432Sd) obj;
        return this.a.equals(c1432Sd.a) && this.b == c1432Sd.b && this.c == c1432Sd.c;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        long j2 = this.c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        return NX.i(sb, this.c, "}");
    }
}
