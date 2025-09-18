package defpackage;

/* renamed from: Qd */
/* loaded from: classes.dex */
public final class C1276Qd {
    public final String a;
    public final String b;
    public final String c;

    public C1276Qd(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1276Qd)) {
            return false;
        }
        C1276Qd c1276Qd = (C1276Qd) obj;
        if (this.a.equals(c1276Qd.a)) {
            String str = c1276Qd.b;
            String str2 = this.b;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = c1276Qd.c;
                String str4 = this.c;
                if (str4 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str4.equals(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", firebaseAuthenticationToken=");
        return AbstractC1705Vq.l(sb, this.c, "}");
    }
}
