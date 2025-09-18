package defpackage;

/* renamed from: Ce, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188Ce {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final N8 f;

    public C0188Ce(String str, String str2, String str3, String str4, int i, N8 n8) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.d = str4;
        this.e = i;
        this.f = n8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0188Ce)) {
            return false;
        }
        C0188Ce c0188Ce = (C0188Ce) obj;
        return this.a.equals(c0188Ce.a) && this.b.equals(c0188Ce.b) && this.c.equals(c0188Ce.c) && this.d.equals(c0188Ce.d) && this.e == c0188Ce.e && this.f.equals(c0188Ce.f);
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
