package p000;

import java.util.Map;

/* renamed from: nm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10436nm1 {

    /* renamed from: a */
    public final Map f38503a;

    /* renamed from: b */
    public final C11224tw1 f38504b;

    /* renamed from: c */
    public final String f38505c;

    public C10436nm1(Map map, C11224tw1 c11224tw1, String str) {
        this.f38503a = map;
        this.f38504b = c11224tw1;
        this.f38505c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10436nm1)) {
            return false;
        }
        C10436nm1 c10436nm1 = (C10436nm1) obj;
        return O90.m5963a(this.f38503a, c10436nm1.f38503a) && O90.m5963a(this.f38504b, c10436nm1.f38504b) && O90.m5963a(this.f38505c, c10436nm1.f38505c);
    }

    public final int hashCode() {
        return this.f38505c.hashCode() + ((this.f38504b.hashCode() + (this.f38503a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NetworkConfigDto(data=" + this.f38503a + ", configMetadata=" + this.f38504b + ", shortSegments=" + ((Object) G12.m2910a(this.f38505c)) + ')';
    }
}
