package p000;

import java.util.Set;

/* renamed from: xe */
/* loaded from: classes.dex */
public final class C7151xe {

    /* renamed from: a */
    public final long f45722a;

    /* renamed from: b */
    public final long f45723b;

    /* renamed from: c */
    public final Set f45724c;

    public C7151xe(long j, long j2, Set set) {
        this.f45722a = j;
        this.f45723b = j2;
        this.f45724c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7151xe)) {
            return false;
        }
        C7151xe c7151xe = (C7151xe) obj;
        return this.f45722a == c7151xe.f45722a && this.f45723b == c7151xe.f45723b && this.f45724c.equals(c7151xe.f45724c);
    }

    public final int hashCode() {
        long j = this.f45722a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f45723b;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f45724c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f45722a + ", maxAllowedDelay=" + this.f45723b + ", flags=" + this.f45724c + "}";
    }
}
