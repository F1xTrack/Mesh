package p000;

/* renamed from: Ce */
/* loaded from: classes.dex */
public final class C0167Ce {

    /* renamed from: a */
    public final String f1531a;

    /* renamed from: b */
    public final String f1532b;

    /* renamed from: c */
    public final String f1533c;

    /* renamed from: d */
    public final String f1534d;

    /* renamed from: e */
    public final int f1535e;

    /* renamed from: f */
    public final C0827N8 f1536f;

    public C0167Ce(String str, String str2, String str3, String str4, int i, C0827N8 c0827n8) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f1531a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f1532b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f1533c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f1534d = str4;
        this.f1535e = i;
        this.f1536f = c0827n8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0167Ce)) {
            return false;
        }
        C0167Ce c0167Ce = (C0167Ce) obj;
        return this.f1531a.equals(c0167Ce.f1531a) && this.f1532b.equals(c0167Ce.f1532b) && this.f1533c.equals(c0167Ce.f1533c) && this.f1534d.equals(c0167Ce.f1534d) && this.f1535e == c0167Ce.f1535e && this.f1536f.equals(c0167Ce.f1536f);
    }

    public final int hashCode() {
        return ((((((((((this.f1531a.hashCode() ^ 1000003) * 1000003) ^ this.f1532b.hashCode()) * 1000003) ^ this.f1533c.hashCode()) * 1000003) ^ this.f1534d.hashCode()) * 1000003) ^ this.f1535e) * 1000003) ^ this.f1536f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f1531a + ", versionCode=" + this.f1532b + ", versionName=" + this.f1533c + ", installUuid=" + this.f1534d + ", deliveryMechanism=" + this.f1535e + ", developmentPlatformProvider=" + this.f1536f + "}";
    }
}
