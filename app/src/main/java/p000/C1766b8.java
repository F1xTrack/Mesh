package p000;

/* renamed from: b8 */
/* loaded from: classes.dex */
public final class C1766b8 {

    /* renamed from: a */
    public final String f16817a;

    /* renamed from: b */
    public final String f16818b;

    /* renamed from: c */
    public final String f16819c;

    /* renamed from: d */
    public final C4030f4 f16820d;

    public C1766b8(String str, String str2, String str3, C4030f4 c4030f4) {
        O90.m5968f(str, "appId");
        this.f16817a = str;
        this.f16818b = str2;
        this.f16819c = str3;
        this.f16820d = c4030f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1766b8)) {
            return false;
        }
        C1766b8 c1766b8 = (C1766b8) obj;
        return O90.m5963a(this.f16817a, c1766b8.f16817a) && this.f16818b.equals(c1766b8.f16818b) && this.f16819c.equals(c1766b8.f16819c) && this.f16820d.equals(c1766b8.f16820d);
    }

    public final int hashCode() {
        return this.f16820d.hashCode() + ((EnumC9665hl0.LOG_ENVIRONMENT_PROD.hashCode() + AbstractC1374Vq.m8586e((((this.f16818b.hashCode() + (this.f16817a.hashCode() * 31)) * 31) + 47594046) * 31, 31, this.f16819c)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f16817a + ", deviceModel=" + this.f16818b + ", sessionSdkVersion=2.0.8, osVersion=" + this.f16819c + ", logEnvironment=" + EnumC9665hl0.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f16820d + ')';
    }
}
