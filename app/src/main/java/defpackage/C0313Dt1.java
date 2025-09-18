package defpackage;

import java.util.Map;

/* renamed from: Dt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0313Dt1 {
    public final long a;
    public final Map b;
    public final C7315tw1 c;
    public final String d;

    public C0313Dt1(long j, Map map, C7315tw1 c7315tw1, String str) {
        this.a = j;
        this.b = map;
        this.c = c7315tw1;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0313Dt1)) {
            return false;
        }
        C0313Dt1 c0313Dt1 = (C0313Dt1) obj;
        return this.a == c0313Dt1.a && O90.a(this.b, c0313Dt1.b) && O90.a(this.c, c0313Dt1.c) && O90.a(this.d, c0313Dt1.d);
    }

    public final int hashCode() {
        long j = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PersistableConfig(updateTime=" + ((Object) ("ConfigUpdateTime(unixTimeStamp=" + this.a + ')')) + ", data=" + this.b + ", configMetadata=" + this.c + ", shortSegments=" + ((Object) G12.a(this.d)) + ')';
    }
}
