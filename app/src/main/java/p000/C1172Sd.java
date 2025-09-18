package p000;

/* renamed from: Sd */
/* loaded from: classes.dex */
public final class C1172Sd {

    /* renamed from: a */
    public final String f10878a;

    /* renamed from: b */
    public final long f10879b;

    /* renamed from: c */
    public final long f10880c;

    public C1172Sd(long j, long j2, String str) {
        this.f10878a = str;
        this.f10879b = j;
        this.f10880c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1172Sd)) {
            return false;
        }
        C1172Sd c1172Sd = (C1172Sd) obj;
        return this.f10878a.equals(c1172Sd.f10878a) && this.f10879b == c1172Sd.f10879b && this.f10880c == c1172Sd.f10880c;
    }

    public final int hashCode() {
        int iHashCode = (this.f10878a.hashCode() ^ 1000003) * 1000003;
        long j = this.f10879b;
        long j2 = this.f10880c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f10878a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f10879b);
        sb.append(", tokenCreationTimestamp=");
        return AbstractC0852NX.m5760i(sb, this.f10880c, "}");
    }
}
