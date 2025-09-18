package defpackage;

/* renamed from: ie, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4383ie {
    public final long a;
    public final C1513Te b;
    public final C0185Cd c;

    public C4383ie(long j, C1513Te c1513Te, C0185Cd c0185Cd) {
        this.a = j;
        this.b = c1513Te;
        this.c = c0185Cd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4383ie)) {
            return false;
        }
        C4383ie c4383ie = (C4383ie) obj;
        return this.a == c4383ie.a && this.b.equals(c4383ie.b) && this.c.equals(c4383ie.c);
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
