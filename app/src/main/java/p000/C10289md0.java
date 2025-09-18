package p000;

/* renamed from: md0 */
/* loaded from: classes2.dex */
public final class C10289md0 extends R22 {

    /* renamed from: b */
    public final String f37798b;

    /* renamed from: c */
    public final String f37799c;

    public C10289md0(String str, String str2) {
        O90.m5968f(str, "name");
        O90.m5968f(str2, "desc");
        this.f37798b = str;
        this.f37799c = str2;
    }

    @Override // p000.R22
    /* renamed from: a */
    public final String mo6888a() {
        return this.f37798b + this.f37799c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10289md0)) {
            return false;
        }
        C10289md0 c10289md0 = (C10289md0) obj;
        return O90.m5963a(this.f37798b, c10289md0.f37798b) && O90.m5963a(this.f37799c, c10289md0.f37799c);
    }

    public final int hashCode() {
        return this.f37799c.hashCode() + (this.f37798b.hashCode() * 31);
    }
}
