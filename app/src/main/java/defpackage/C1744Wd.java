package defpackage;

import java.util.Arrays;

/* renamed from: Wd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1744Wd extends AbstractC4404il0 {
    public final long a;
    public final Integer b;
    public final C0416Fc c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final C2363be h;
    public final C0341Ed i;

    public C1744Wd(long j, Integer num, C0416Fc c0416Fc, long j2, byte[] bArr, String str, long j3, C2363be c2363be, C0341Ed c0341Ed) {
        this.a = j;
        this.b = num;
        this.c = c0416Fc;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = c2363be;
        this.i = c0341Ed;
    }

    public final boolean equals(Object obj) {
        Integer num;
        C0416Fc c0416Fc;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4404il0)) {
            return false;
        }
        AbstractC4404il0 abstractC4404il0 = (AbstractC4404il0) obj;
        C1744Wd c1744Wd = (C1744Wd) abstractC4404il0;
        if (this.a == c1744Wd.a && ((num = this.b) != null ? num.equals(c1744Wd.b) : c1744Wd.b == null) && ((c0416Fc = this.c) != null ? c0416Fc.equals(c1744Wd.c) : c1744Wd.c == null)) {
            if (this.d == c1744Wd.d) {
                if (Arrays.equals(this.e, abstractC4404il0 instanceof C1744Wd ? ((C1744Wd) abstractC4404il0).e : c1744Wd.e)) {
                    String str = c1744Wd.f;
                    String str2 = this.f;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.g == c1744Wd.g) {
                            C2363be c2363be = c1744Wd.h;
                            C2363be c2363be2 = this.h;
                            if (c2363be2 != null ? c2363be2.equals(c2363be) : c2363be == null) {
                                C0341Ed c0341Ed = c1744Wd.i;
                                C0341Ed c0341Ed2 = this.i;
                                if (c0341Ed2 == null) {
                                    if (c0341Ed == null) {
                                        return true;
                                    }
                                } else if (c0341Ed2.equals(c0341Ed)) {
                                    return true;
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
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        C0416Fc c0416Fc = this.c;
        int iHashCode2 = (iHashCode ^ (c0416Fc == null ? 0 : c0416Fc.hashCode())) * 1000003;
        long j2 = this.d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        C2363be c2363be = this.h;
        int iHashCode5 = (i2 ^ (c2363be == null ? 0 : c2363be.hashCode())) * 1000003;
        C0341Ed c0341Ed = this.i;
        return iHashCode5 ^ (c0341Ed != null ? c0341Ed.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
