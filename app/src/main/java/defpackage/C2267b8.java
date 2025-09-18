package defpackage;

/* renamed from: b8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2267b8 {
    public final String a;
    public final String b;
    public final String c;
    public final C3702f4 d;

    public C2267b8(String str, String str2, String str3, C3702f4 c3702f4) {
        O90.f(str, "appId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c3702f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2267b8)) {
            return false;
        }
        C2267b8 c2267b8 = (C2267b8) obj;
        return O90.a(this.a, c2267b8.a) && this.b.equals(c2267b8.b) && this.c.equals(c2267b8.c) && this.d.equals(c2267b8.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((EnumC4214hl0.LOG_ENVIRONMENT_PROD.hashCode() + AbstractC1705Vq.e((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 47594046) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + this.b + ", sessionSdkVersion=2.0.8, osVersion=" + this.c + ", logEnvironment=" + EnumC4214hl0.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.d + ')';
    }
}
