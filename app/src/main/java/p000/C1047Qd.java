package p000;

/* renamed from: Qd */
/* loaded from: classes.dex */
public final class C1047Qd {

    /* renamed from: a */
    public final String f9702a;

    /* renamed from: b */
    public final String f9703b;

    /* renamed from: c */
    public final String f9704c;

    public C1047Qd(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f9702a = str;
        this.f9703b = str2;
        this.f9704c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1047Qd)) {
            return false;
        }
        C1047Qd c1047Qd = (C1047Qd) obj;
        if (this.f9702a.equals(c1047Qd.f9702a)) {
            String str = c1047Qd.f9703b;
            String str2 = this.f9703b;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = c1047Qd.f9704c;
                String str4 = this.f9704c;
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
        int iHashCode = (this.f9702a.hashCode() ^ 1000003) * 1000003;
        String str = this.f9703b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f9704c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f9702a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f9703b);
        sb.append(", firebaseAuthenticationToken=");
        return AbstractC1374Vq.m8593l(sb, this.f9704c, "}");
    }
}
