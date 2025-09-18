package defpackage;

/* renamed from: Rd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1354Rd {
    public final String a;
    public final String b;
    public final String c;
    public final C1435Se d;
    public final int e;

    public C1354Rd(String str, String str2, String str3, C1435Se c1435Se, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c1435Se;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1354Rd)) {
            return false;
        }
        C1354Rd c1354Rd = (C1354Rd) obj;
        String str = this.a;
        if (str != null ? str.equals(c1354Rd.a) : c1354Rd.a == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(c1354Rd.b) : c1354Rd.b == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(c1354Rd.c) : c1354Rd.c == null) {
                    C1435Se c1435Se = this.d;
                    if (c1435Se != null ? c1435Se.equals(c1354Rd.d) : c1354Rd.d == null) {
                        int i = this.e;
                        if (i == 0) {
                            if (c1354Rd.e == 0) {
                                return true;
                            }
                        } else if (AbstractC8235ym.c(i, c1354Rd.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C1435Se c1435Se = this.d;
        int iHashCode4 = (iHashCode3 ^ (c1435Se == null ? 0 : c1435Se.hashCode())) * 1000003;
        int i = this.e;
        return (i != 0 ? AbstractC8235ym.x(i) : 0) ^ iHashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i = this.e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
