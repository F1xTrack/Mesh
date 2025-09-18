package p000;

import java.util.Map;

/* renamed from: Dt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7509Dt1 {

    /* renamed from: a */
    public final long f2289a;

    /* renamed from: b */
    public final Map f2290b;

    /* renamed from: c */
    public final C11224tw1 f2291c;

    /* renamed from: d */
    public final String f2292d;

    public C7509Dt1(long j, Map map, C11224tw1 c11224tw1, String str) {
        this.f2289a = j;
        this.f2290b = map;
        this.f2291c = c11224tw1;
        this.f2292d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7509Dt1)) {
            return false;
        }
        C7509Dt1 c7509Dt1 = (C7509Dt1) obj;
        return this.f2289a == c7509Dt1.f2289a && O90.m5963a(this.f2290b, c7509Dt1.f2290b) && O90.m5963a(this.f2291c, c7509Dt1.f2291c) && O90.m5963a(this.f2292d, c7509Dt1.f2292d);
    }

    public final int hashCode() {
        long j = this.f2289a;
        return this.f2292d.hashCode() + ((this.f2291c.hashCode() + ((this.f2290b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PersistableConfig(updateTime=" + ((Object) ("ConfigUpdateTime(unixTimeStamp=" + this.f2289a + ')')) + ", data=" + this.f2290b + ", configMetadata=" + this.f2291c + ", shortSegments=" + ((Object) G12.m2910a(this.f2292d)) + ')';
    }
}
