package p000;

/* renamed from: Se */
/* loaded from: classes.dex */
public final class C1173Se {

    /* renamed from: a */
    public final String f10884a;

    /* renamed from: b */
    public final long f10885b;

    /* renamed from: c */
    public final int f10886c;

    public C1173Se(int i, String str, long j) {
        this.f10884a = str;
        this.f10885b = j;
        this.f10886c = i;
    }

    /* renamed from: a */
    public static C1356VY m7401a() {
        C1356VY c1356vy = new C1356VY(2, (byte) 0);
        c1356vy.f12613d = 0L;
        return c1356vy;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1173Se)) {
            return false;
        }
        C1173Se c1173Se = (C1173Se) obj;
        String str = this.f10884a;
        if (str != null ? str.equals(c1173Se.f10884a) : c1173Se.f10884a == null) {
            if (this.f10885b == c1173Se.f10885b) {
                int i = c1173Se.f10886c;
                int i2 = this.f10886c;
                if (i2 == 0) {
                    if (i == 0) {
                        return true;
                    }
                } else if (AbstractC7222ym.m26226c(i2, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10884a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f10885b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i2 = this.f10886c;
        return (i2 != 0 ? AbstractC7222ym.m26247x(i2) : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f10884a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f10885b);
        sb.append(", responseCode=");
        int i = this.f10886c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
