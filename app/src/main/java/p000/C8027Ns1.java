package p000;

import java.util.Map;

/* renamed from: Ns1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8027Ns1 {

    /* renamed from: a */
    public final Map f8099a;

    /* renamed from: b */
    public final C11224tw1 f8100b;

    /* renamed from: c */
    public final String f8101c;

    public C8027Ns1(Map map, C11224tw1 c11224tw1, String str) {
        this.f8099a = map;
        this.f8100b = c11224tw1;
        this.f8101c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8027Ns1)) {
            return false;
        }
        C8027Ns1 c8027Ns1 = (C8027Ns1) obj;
        return O90.m5963a(this.f8099a, c8027Ns1.f8099a) && O90.m5963a(this.f8100b, c8027Ns1.f8100b) && O90.m5963a(this.f8101c, c8027Ns1.f8101c);
    }

    public final int hashCode() {
        return this.f8101c.hashCode() + ((this.f8100b.hashCode() + (this.f8099a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ActualConfigDto(data=" + this.f8099a + ", configMetadata=" + this.f8100b + ", shortSegments=" + ((Object) G12.m2910a(this.f8101c)) + ')';
    }
}
