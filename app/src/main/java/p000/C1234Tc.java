package p000;

/* renamed from: Tc */
/* loaded from: classes.dex */
public final class C1234Tc extends AbstractC0011AA {

    /* renamed from: a */
    public final String f11438a;

    /* renamed from: b */
    public final String f11439b;

    /* renamed from: c */
    public final String f11440c;

    /* renamed from: d */
    public final String f11441d;

    /* renamed from: e */
    public final String f11442e;

    /* renamed from: f */
    public final String f11443f;

    public C1234Tc(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f11438a = str;
        this.f11439b = str2;
        this.f11440c = str3;
        this.f11441d = str4;
        this.f11442e = str5;
        this.f11443f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0011AA)) {
            return false;
        }
        AbstractC0011AA abstractC0011AA = (AbstractC0011AA) obj;
        if (this.f11438a.equals(((C1234Tc) abstractC0011AA).f11438a)) {
            C1234Tc c1234Tc = (C1234Tc) abstractC0011AA;
            if (this.f11439b.equals(c1234Tc.f11439b)) {
                String str = c1234Tc.f11440c;
                String str2 = this.f11440c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c1234Tc.f11441d;
                    String str4 = this.f11441d;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = c1234Tc.f11442e;
                        String str6 = this.f11442e;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = c1234Tc.f11443f;
                            String str8 = this.f11443f;
                            if (str8 == null) {
                                if (str7 == null) {
                                    return true;
                                }
                            } else if (str8.equals(str7)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f11438a.hashCode() ^ 1000003) * 1000003) ^ this.f11439b.hashCode()) * 1000003;
        String str = this.f11440c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f11441d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f11442e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f11443f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f11438a);
        sb.append(", version=");
        sb.append(this.f11439b);
        sb.append(", displayVersion=");
        sb.append(this.f11440c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.f11441d);
        sb.append(", developmentPlatform=");
        sb.append(this.f11442e);
        sb.append(", developmentPlatformVersion=");
        return AbstractC1374Vq.m8593l(sb, this.f11443f, "}");
    }
}
