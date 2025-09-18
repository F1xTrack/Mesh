package p000;

import java.util.Arrays;

/* renamed from: Wd */
/* loaded from: classes.dex */
public final class C1424Wd extends AbstractC9793il0 {

    /* renamed from: a */
    public final long f13289a;

    /* renamed from: b */
    public final Integer f13290b;

    /* renamed from: c */
    public final C0354Fc f13291c;

    /* renamed from: d */
    public final long f13292d;

    /* renamed from: e */
    public final byte[] f13293e;

    /* renamed from: f */
    public final String f13294f;

    /* renamed from: g */
    public final long f13295g;

    /* renamed from: h */
    public final C1798be f13296h;

    /* renamed from: i */
    public final C0292Ed f13297i;

    public C1424Wd(long j, Integer num, C0354Fc c0354Fc, long j2, byte[] bArr, String str, long j3, C1798be c1798be, C0292Ed c0292Ed) {
        this.f13289a = j;
        this.f13290b = num;
        this.f13291c = c0354Fc;
        this.f13292d = j2;
        this.f13293e = bArr;
        this.f13294f = str;
        this.f13295g = j3;
        this.f13296h = c1798be;
        this.f13297i = c0292Ed;
    }

    public final boolean equals(Object obj) {
        Integer num;
        C0354Fc c0354Fc;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9793il0)) {
            return false;
        }
        AbstractC9793il0 abstractC9793il0 = (AbstractC9793il0) obj;
        C1424Wd c1424Wd = (C1424Wd) abstractC9793il0;
        if (this.f13289a == c1424Wd.f13289a && ((num = this.f13290b) != null ? num.equals(c1424Wd.f13290b) : c1424Wd.f13290b == null) && ((c0354Fc = this.f13291c) != null ? c0354Fc.equals(c1424Wd.f13291c) : c1424Wd.f13291c == null)) {
            if (this.f13292d == c1424Wd.f13292d) {
                if (Arrays.equals(this.f13293e, abstractC9793il0 instanceof C1424Wd ? ((C1424Wd) abstractC9793il0).f13293e : c1424Wd.f13293e)) {
                    String str = c1424Wd.f13294f;
                    String str2 = this.f13294f;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f13295g == c1424Wd.f13295g) {
                            C1798be c1798be = c1424Wd.f13296h;
                            C1798be c1798be2 = this.f13296h;
                            if (c1798be2 != null ? c1798be2.equals(c1798be) : c1798be == null) {
                                C0292Ed c0292Ed = c1424Wd.f13297i;
                                C0292Ed c0292Ed2 = this.f13297i;
                                if (c0292Ed2 == null) {
                                    if (c0292Ed == null) {
                                        return true;
                                    }
                                } else if (c0292Ed2.equals(c0292Ed)) {
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
        long j = this.f13289a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f13290b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        C0354Fc c0354Fc = this.f13291c;
        int iHashCode2 = (iHashCode ^ (c0354Fc == null ? 0 : c0354Fc.hashCode())) * 1000003;
        long j2 = this.f13292d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f13293e)) * 1000003;
        String str = this.f13294f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f13295g;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        C1798be c1798be = this.f13296h;
        int iHashCode5 = (i2 ^ (c1798be == null ? 0 : c1798be.hashCode())) * 1000003;
        C0292Ed c0292Ed = this.f13297i;
        return iHashCode5 ^ (c0292Ed != null ? c0292Ed.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f13289a + ", eventCode=" + this.f13290b + ", complianceData=" + this.f13291c + ", eventUptimeMs=" + this.f13292d + ", sourceExtension=" + Arrays.toString(this.f13293e) + ", sourceExtensionJsonProto3=" + this.f13294f + ", timezoneOffsetSeconds=" + this.f13295g + ", networkConnectionInfo=" + this.f13296h + ", experimentIds=" + this.f13297i + "}";
    }
}
