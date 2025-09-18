package p000;

import java.util.Map;

/* renamed from: MP */
/* loaded from: classes.dex */
public final class C0781MP {

    /* renamed from: a */
    public final String f7144a;

    /* renamed from: b */
    public final long f7145b;

    /* renamed from: c */
    public final Map f7146c;

    public C0781MP(String str, Map map, long j) {
        O90.m5968f(map, "additionalCustomKeys");
        this.f7144a = str;
        this.f7145b = j;
        this.f7146c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0781MP)) {
            return false;
        }
        C0781MP c0781mp = (C0781MP) obj;
        return O90.m5963a(this.f7144a, c0781mp.f7144a) && this.f7145b == c0781mp.f7145b && O90.m5963a(this.f7146c, c0781mp.f7146c);
    }

    public final int hashCode() {
        int iHashCode = this.f7144a.hashCode() * 31;
        long j = this.f7145b;
        return this.f7146c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f7144a + ", timestamp=" + this.f7145b + ", additionalCustomKeys=" + this.f7146c + ')';
    }
}
