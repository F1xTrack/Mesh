package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class MP {
    public final String a;
    public final long b;
    public final Map c;

    public MP(String str, Map map, long j) {
        O90.f(map, "additionalCustomKeys");
        this.a = str;
        this.b = j;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MP)) {
            return false;
        }
        MP mp = (MP) obj;
        return O90.a(this.a, mp.a) && this.b == mp.b && O90.a(this.c, mp.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.a + ", timestamp=" + this.b + ", additionalCustomKeys=" + this.c + ')';
    }
}
