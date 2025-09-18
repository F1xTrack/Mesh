package defpackage;

/* renamed from: Jc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728Jc extends TA {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final C1429Sc k;
    public final C1195Pc l;
    public final AbstractC7551vA m;

    public C0728Jc(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, C1429Sc c1429Sc, C1195Pc c1195Pc, AbstractC7551vA abstractC7551vA) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = c1429Sc;
        this.l = c1195Pc;
        this.m = abstractC7551vA;
    }

    public final C0650Ic a() {
        C0650Ic c0650Ic = new C0650Ic();
        c0650Ic.a = this.b;
        c0650Ic.b = this.c;
        c0650Ic.c = this.d;
        c0650Ic.d = this.e;
        c0650Ic.e = this.f;
        c0650Ic.f = this.g;
        c0650Ic.g = this.h;
        c0650Ic.h = this.i;
        c0650Ic.i = this.j;
        c0650Ic.j = this.k;
        c0650Ic.k = this.l;
        c0650Ic.l = this.m;
        c0650Ic.m = (byte) 1;
        return c0650Ic;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TA)) {
            return false;
        }
        C0728Jc c0728Jc = (C0728Jc) ((TA) obj);
        if (this.b.equals(c0728Jc.b)) {
            if (this.c.equals(c0728Jc.c) && this.d == c0728Jc.d && this.e.equals(c0728Jc.e)) {
                String str = c0728Jc.f;
                String str2 = this.f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c0728Jc.g;
                    String str4 = this.g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = c0728Jc.h;
                        String str6 = this.h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.i.equals(c0728Jc.i) && this.j.equals(c0728Jc.j)) {
                                C1429Sc c1429Sc = c0728Jc.k;
                                C1429Sc c1429Sc2 = this.k;
                                if (c1429Sc2 != null ? c1429Sc2.equals(c1429Sc) : c1429Sc == null) {
                                    C1195Pc c1195Pc = c0728Jc.l;
                                    C1195Pc c1195Pc2 = this.l;
                                    if (c1195Pc2 != null ? c1195Pc2.equals(c1195Pc) : c1195Pc == null) {
                                        AbstractC7551vA abstractC7551vA = c0728Jc.m;
                                        AbstractC7551vA abstractC7551vA2 = this.m;
                                        if (abstractC7551vA2 == null) {
                                            if (abstractC7551vA == null) {
                                                return true;
                                            }
                                        } else if (abstractC7551vA2.equals(abstractC7551vA)) {
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
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        C1429Sc c1429Sc = this.k;
        int iHashCode5 = (iHashCode4 ^ (c1429Sc == null ? 0 : c1429Sc.hashCode())) * 1000003;
        C1195Pc c1195Pc = this.l;
        int iHashCode6 = (iHashCode5 ^ (c1195Pc == null ? 0 : c1195Pc.hashCode())) * 1000003;
        AbstractC7551vA abstractC7551vA = this.m;
        return iHashCode6 ^ (abstractC7551vA != null ? abstractC7551vA.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
