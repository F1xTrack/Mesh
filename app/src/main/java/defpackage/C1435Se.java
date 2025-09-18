package defpackage;

/* renamed from: Se, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1435Se {
    public final String a;
    public final long b;
    public final int c;

    public C1435Se(int i, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public static VY a() {
        VY vy = new VY(2, (byte) 0);
        vy.d = 0L;
        return vy;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1435Se)) {
            return false;
        }
        C1435Se c1435Se = (C1435Se) obj;
        String str = this.a;
        if (str != null ? str.equals(c1435Se.a) : c1435Se.a == null) {
            if (this.b == c1435Se.b) {
                int i = c1435Se.c;
                int i2 = this.c;
                if (i2 == 0) {
                    if (i == 0) {
                        return true;
                    }
                } else if (AbstractC8235ym.c(i2, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i2 = this.c;
        return (i2 != 0 ? AbstractC8235ym.x(i2) : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", responseCode=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
