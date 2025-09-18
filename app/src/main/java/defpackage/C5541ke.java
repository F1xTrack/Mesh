package defpackage;

/* renamed from: ke, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5541ke {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    public C5541ke(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = str4;
    }

    public final C5350je a() {
        C5350je c5350je = new C5350je();
        c5350je.c = this.a;
        c5350je.b = this.b;
        c5350je.d = this.c;
        c5350je.e = this.d;
        c5350je.g = Long.valueOf(this.e);
        c5350je.h = Long.valueOf(this.f);
        c5350je.f = this.g;
        return c5350je;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5541ke)) {
            return false;
        }
        C5541ke c5541ke = (C5541ke) obj;
        String str = this.a;
        if (str != null ? str.equals(c5541ke.a) : c5541ke.a == null) {
            if (AbstractC8235ym.c(this.b, c5541ke.b)) {
                String str2 = c5541ke.c;
                String str3 = this.c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = c5541ke.d;
                    String str5 = this.d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.e == c5541ke.e && this.f == c5541ke.f) {
                            String str6 = c5541ke.g;
                            String str7 = this.g;
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
        String str = this.a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC8235ym.x(this.b)) * 1000003;
        String str2 = this.c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.e;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.g;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.a);
        sb.append(", registrationStatus=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f);
        sb.append(", fisError=");
        return AbstractC1705Vq.l(sb, this.g, "}");
    }
}
