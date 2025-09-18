package defpackage;

/* renamed from: j3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5238j3 {
    public final long a;
    public final long b;

    public C5238j3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5238j3)) {
            return false;
        }
        C5238j3 c5238j3 = (C5238j3) obj;
        return this.a == c5238j3.a && this.b == c5238j3.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
