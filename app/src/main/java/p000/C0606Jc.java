package p000;

/* renamed from: Jc */
/* loaded from: classes.dex */
public final class C0606Jc extends AbstractC1206TA {

    /* renamed from: b */
    public final String f5626b;

    /* renamed from: c */
    public final String f5627c;

    /* renamed from: d */
    public final int f5628d;

    /* renamed from: e */
    public final String f5629e;

    /* renamed from: f */
    public final String f5630f;

    /* renamed from: g */
    public final String f5631g;

    /* renamed from: h */
    public final String f5632h;

    /* renamed from: i */
    public final String f5633i;

    /* renamed from: j */
    public final String f5634j;

    /* renamed from: k */
    public final C1171Sc f5635k;

    /* renamed from: l */
    public final C0983Pc f5636l;

    /* renamed from: m */
    public final AbstractC6995vA f5637m;

    public C0606Jc(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, C1171Sc c1171Sc, C0983Pc c0983Pc, AbstractC6995vA abstractC6995vA) {
        this.f5626b = str;
        this.f5627c = str2;
        this.f5628d = i;
        this.f5629e = str3;
        this.f5630f = str4;
        this.f5631g = str5;
        this.f5632h = str6;
        this.f5633i = str7;
        this.f5634j = str8;
        this.f5635k = c1171Sc;
        this.f5636l = c0983Pc;
        this.f5637m = abstractC6995vA;
    }

    /* renamed from: a */
    public final C0543Ic m4358a() {
        C0543Ic c0543Ic = new C0543Ic();
        c0543Ic.f5029a = this.f5626b;
        c0543Ic.f5030b = this.f5627c;
        c0543Ic.f5031c = this.f5628d;
        c0543Ic.f5032d = this.f5629e;
        c0543Ic.f5033e = this.f5630f;
        c0543Ic.f5034f = this.f5631g;
        c0543Ic.f5035g = this.f5632h;
        c0543Ic.f5036h = this.f5633i;
        c0543Ic.f5037i = this.f5634j;
        c0543Ic.f5038j = this.f5635k;
        c0543Ic.f5039k = this.f5636l;
        c0543Ic.f5040l = this.f5637m;
        c0543Ic.f5041m = (byte) 1;
        return c0543Ic;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1206TA)) {
            return false;
        }
        C0606Jc c0606Jc = (C0606Jc) ((AbstractC1206TA) obj);
        if (this.f5626b.equals(c0606Jc.f5626b)) {
            if (this.f5627c.equals(c0606Jc.f5627c) && this.f5628d == c0606Jc.f5628d && this.f5629e.equals(c0606Jc.f5629e)) {
                String str = c0606Jc.f5630f;
                String str2 = this.f5630f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c0606Jc.f5631g;
                    String str4 = this.f5631g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = c0606Jc.f5632h;
                        String str6 = this.f5632h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.f5633i.equals(c0606Jc.f5633i) && this.f5634j.equals(c0606Jc.f5634j)) {
                                C1171Sc c1171Sc = c0606Jc.f5635k;
                                C1171Sc c1171Sc2 = this.f5635k;
                                if (c1171Sc2 != null ? c1171Sc2.equals(c1171Sc) : c1171Sc == null) {
                                    C0983Pc c0983Pc = c0606Jc.f5636l;
                                    C0983Pc c0983Pc2 = this.f5636l;
                                    if (c0983Pc2 != null ? c0983Pc2.equals(c0983Pc) : c0983Pc == null) {
                                        AbstractC6995vA abstractC6995vA = c0606Jc.f5637m;
                                        AbstractC6995vA abstractC6995vA2 = this.f5637m;
                                        if (abstractC6995vA2 == null) {
                                            if (abstractC6995vA == null) {
                                                return true;
                                            }
                                        } else if (abstractC6995vA2.equals(abstractC6995vA)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f5626b.hashCode() ^ 1000003) * 1000003) ^ this.f5627c.hashCode()) * 1000003) ^ this.f5628d) * 1000003) ^ this.f5629e.hashCode()) * 1000003;
        String str = this.f5630f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f5631g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f5632h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f5633i.hashCode()) * 1000003) ^ this.f5634j.hashCode()) * 1000003;
        C1171Sc c1171Sc = this.f5635k;
        int iHashCode5 = (iHashCode4 ^ (c1171Sc == null ? 0 : c1171Sc.hashCode())) * 1000003;
        C0983Pc c0983Pc = this.f5636l;
        int iHashCode6 = (iHashCode5 ^ (c0983Pc == null ? 0 : c0983Pc.hashCode())) * 1000003;
        AbstractC6995vA abstractC6995vA = this.f5637m;
        return iHashCode6 ^ (abstractC6995vA != null ? abstractC6995vA.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f5626b + ", gmpAppId=" + this.f5627c + ", platform=" + this.f5628d + ", installationUuid=" + this.f5629e + ", firebaseInstallationId=" + this.f5630f + ", firebaseAuthenticationToken=" + this.f5631g + ", appQualitySessionId=" + this.f5632h + ", buildVersion=" + this.f5633i + ", displayVersion=" + this.f5634j + ", session=" + this.f5635k + ", ndkPayload=" + this.f5636l + ", appExitInfo=" + this.f5637m + "}";
    }
}
