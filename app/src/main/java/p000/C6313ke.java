package p000;

/* renamed from: ke */
/* loaded from: classes.dex */
public final class C6313ke {

    /* renamed from: a */
    public final String f36582a;

    /* renamed from: b */
    public final int f36583b;

    /* renamed from: c */
    public final String f36584c;

    /* renamed from: d */
    public final String f36585d;

    /* renamed from: e */
    public final long f36586e;

    /* renamed from: f */
    public final long f36587f;

    /* renamed from: g */
    public final String f36588g;

    public C6313ke(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.f36582a = str;
        this.f36583b = i;
        this.f36584c = str2;
        this.f36585d = str3;
        this.f36586e = j;
        this.f36587f = j2;
        this.f36588g = str4;
    }

    /* renamed from: a */
    public final C6250je m22225a() {
        C6250je c6250je = new C6250je();
        c6250je.f35298c = this.f36582a;
        c6250je.f35297b = this.f36583b;
        c6250je.f35299d = this.f36584c;
        c6250je.f35300e = this.f36585d;
        c6250je.f35302g = Long.valueOf(this.f36586e);
        c6250je.f35303h = Long.valueOf(this.f36587f);
        c6250je.f35301f = this.f36588g;
        return c6250je;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6313ke)) {
            return false;
        }
        C6313ke c6313ke = (C6313ke) obj;
        String str = this.f36582a;
        if (str != null ? str.equals(c6313ke.f36582a) : c6313ke.f36582a == null) {
            if (AbstractC7222ym.m26226c(this.f36583b, c6313ke.f36583b)) {
                String str2 = c6313ke.f36584c;
                String str3 = this.f36584c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = c6313ke.f36585d;
                    String str5 = this.f36585d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.f36586e == c6313ke.f36586e && this.f36587f == c6313ke.f36587f) {
                            String str6 = c6313ke.f36588g;
                            String str7 = this.f36588g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
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
        String str = this.f36582a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC7222ym.m26247x(this.f36583b)) * 1000003;
        String str2 = this.f36584c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f36585d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f36586e;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f36587f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f36588g;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f36582a);
        sb.append(", registrationStatus=");
        int i = this.f36583b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.f36584c);
        sb.append(", refreshToken=");
        sb.append(this.f36585d);
        sb.append(", expiresInSecs=");
        sb.append(this.f36586e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f36587f);
        sb.append(", fisError=");
        return AbstractC1374Vq.m8593l(sb, this.f36588g, "}");
    }
}
