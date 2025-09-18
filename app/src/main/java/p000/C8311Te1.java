package p000;

import java.util.Map;

/* renamed from: Te1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8311Te1 {

    /* renamed from: a */
    public final Map f11458a;

    /* renamed from: b */
    public final C11224tw1 f11459b;

    /* renamed from: c */
    public final String f11460c;

    public C8311Te1(Map map, C11224tw1 c11224tw1, String str) {
        this.f11458a = map;
        this.f11459b = c11224tw1;
        this.f11460c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8311Te1)) {
            return false;
        }
        C8311Te1 c8311Te1 = (C8311Te1) obj;
        return O90.m5963a(this.f11458a, c8311Te1.f11458a) && O90.m5963a(this.f11459b, c8311Te1.f11459b) && O90.m5963a(this.f11460c, c8311Te1.f11460c);
    }

    public final int hashCode() {
        return this.f11460c.hashCode() + ((this.f11459b.hashCode() + (this.f11458a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NetworkConfig(data=" + this.f11458a + ", configMetadata=" + this.f11459b + ", shortSegments=" + ((Object) G12.m2910a(this.f11460c)) + ')';
    }
}
