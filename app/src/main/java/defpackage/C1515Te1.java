package defpackage;

import java.util.Map;

/* renamed from: Te1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1515Te1 {
    public final Map a;
    public final C7315tw1 b;
    public final String c;

    public C1515Te1(Map map, C7315tw1 c7315tw1, String str) {
        this.a = map;
        this.b = c7315tw1;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1515Te1)) {
            return false;
        }
        C1515Te1 c1515Te1 = (C1515Te1) obj;
        return O90.a(this.a, c1515Te1.a) && O90.a(this.b, c1515Te1.b) && O90.a(this.c, c1515Te1.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NetworkConfig(data=" + this.a + ", configMetadata=" + this.b + ", shortSegments=" + ((Object) G12.a(this.c)) + ')';
    }
}
