package defpackage;

import java.util.Map;

/* renamed from: Ns1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1089Ns1 {
    public final Map a;
    public final C7315tw1 b;
    public final String c;

    public C1089Ns1(Map map, C7315tw1 c7315tw1, String str) {
        this.a = map;
        this.b = c7315tw1;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1089Ns1)) {
            return false;
        }
        C1089Ns1 c1089Ns1 = (C1089Ns1) obj;
        return O90.a(this.a, c1089Ns1.a) && O90.a(this.b, c1089Ns1.b) && O90.a(this.c, c1089Ns1.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ActualConfigDto(data=" + this.a + ", configMetadata=" + this.b + ", shortSegments=" + ((Object) G12.a(this.c)) + ')';
    }
}
