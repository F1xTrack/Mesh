package p000;

/* renamed from: Rd */
/* loaded from: classes.dex */
public final class C1109Rd {

    /* renamed from: a */
    public final String f10338a;

    /* renamed from: b */
    public final String f10339b;

    /* renamed from: c */
    public final String f10340c;

    /* renamed from: d */
    public final C1173Se f10341d;

    /* renamed from: e */
    public final int f10342e;

    public C1109Rd(String str, String str2, String str3, C1173Se c1173Se, int i) {
        this.f10338a = str;
        this.f10339b = str2;
        this.f10340c = str3;
        this.f10341d = c1173Se;
        this.f10342e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1109Rd)) {
            return false;
        }
        C1109Rd c1109Rd = (C1109Rd) obj;
        String str = this.f10338a;
        if (str != null ? str.equals(c1109Rd.f10338a) : c1109Rd.f10338a == null) {
            String str2 = this.f10339b;
            if (str2 != null ? str2.equals(c1109Rd.f10339b) : c1109Rd.f10339b == null) {
                String str3 = this.f10340c;
                if (str3 != null ? str3.equals(c1109Rd.f10340c) : c1109Rd.f10340c == null) {
                    C1173Se c1173Se = this.f10341d;
                    if (c1173Se != null ? c1173Se.equals(c1109Rd.f10341d) : c1109Rd.f10341d == null) {
                        int i = this.f10342e;
                        if (i == 0) {
                            if (c1109Rd.f10342e == 0) {
                                return true;
                            }
                        } else if (AbstractC7222ym.m26226c(i, c1109Rd.f10342e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10338a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f10339b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10340c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C1173Se c1173Se = this.f10341d;
        int iHashCode4 = (iHashCode3 ^ (c1173Se == null ? 0 : c1173Se.hashCode())) * 1000003;
        int i = this.f10342e;
        return (i != 0 ? AbstractC7222ym.m26247x(i) : 0) ^ iHashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f10338a);
        sb.append(", fid=");
        sb.append(this.f10339b);
        sb.append(", refreshToken=");
        sb.append(this.f10340c);
        sb.append(", authToken=");
        sb.append(this.f10341d);
        sb.append(", responseCode=");
        int i = this.f10342e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
