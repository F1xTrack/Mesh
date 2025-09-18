package defpackage;

import java.util.Set;

/* renamed from: xe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8021xe {
    public final long a;
    public final long b;
    public final Set c;

    public C8021xe(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8021xe)) {
            return false;
        }
        C8021xe c8021xe = (C8021xe) obj;
        return this.a == c8021xe.a && this.b == c8021xe.b && this.c.equals(c8021xe.c);
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
