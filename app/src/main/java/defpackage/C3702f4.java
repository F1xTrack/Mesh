package defpackage;

import java.util.ArrayList;

/* renamed from: f4 */
/* loaded from: classes.dex */
public final class C3702f4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final DD0 e;
    public final ArrayList f;

    public C3702f4(String str, String str2, String str3, String str4, DD0 dd0, ArrayList arrayList) {
        O90.f(str2, "versionName");
        O90.f(str3, "appBuildVersion");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = dd0;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3702f4)) {
            return false;
        }
        C3702f4 c3702f4 = (C3702f4) obj;
        return this.a.equals(c3702f4.a) && O90.a(this.b, c3702f4.b) && O90.a(this.c, c3702f4.c) && this.d.equals(c3702f4.d) && this.e.equals(c3702f4.e) && this.f.equals(c3702f4.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + AbstractC1705Vq.e(AbstractC1705Vq.e(AbstractC1705Vq.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + this.d + ", currentProcessDetails=" + this.e + ", appProcessDetails=" + this.f + ')';
    }
}
