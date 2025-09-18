package p000;

import java.util.ArrayList;

/* renamed from: f4 */
/* loaded from: classes.dex */
public final class C4030f4 {

    /* renamed from: a */
    public final String f27031a;

    /* renamed from: b */
    public final String f27032b;

    /* renamed from: c */
    public final String f27033c;

    /* renamed from: d */
    public final String f27034d;

    /* renamed from: e */
    public final DD0 f27035e;

    /* renamed from: f */
    public final ArrayList f27036f;

    public C4030f4(String str, String str2, String str3, String str4, DD0 dd0, ArrayList arrayList) {
        O90.m5968f(str2, "versionName");
        O90.m5968f(str3, "appBuildVersion");
        this.f27031a = str;
        this.f27032b = str2;
        this.f27033c = str3;
        this.f27034d = str4;
        this.f27035e = dd0;
        this.f27036f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4030f4)) {
            return false;
        }
        C4030f4 c4030f4 = (C4030f4) obj;
        return this.f27031a.equals(c4030f4.f27031a) && O90.m5963a(this.f27032b, c4030f4.f27032b) && O90.m5963a(this.f27033c, c4030f4.f27033c) && this.f27034d.equals(c4030f4.f27034d) && this.f27035e.equals(c4030f4.f27035e) && this.f27036f.equals(c4030f4.f27036f);
    }

    public final int hashCode() {
        return this.f27036f.hashCode() + ((this.f27035e.hashCode() + AbstractC1374Vq.m8586e(AbstractC1374Vq.m8586e(AbstractC1374Vq.m8586e(this.f27031a.hashCode() * 31, 31, this.f27032b), 31, this.f27033c), 31, this.f27034d)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f27031a + ", versionName=" + this.f27032b + ", appBuildVersion=" + this.f27033c + ", deviceManufacturer=" + this.f27034d + ", currentProcessDetails=" + this.f27035e + ", appProcessDetails=" + this.f27036f + ')';
    }
}
