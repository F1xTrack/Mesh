package p000;

/* renamed from: Af1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7325Af1 implements Comparable {

    /* renamed from: a */
    public final long f305a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C7325Af1) obj).f305a;
        long j2 = this.f305a ^ Long.MIN_VALUE;
        long j3 = j ^ Long.MIN_VALUE;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7325Af1) {
            return this.f305a == ((C7325Af1) obj).f305a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f305a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.f305a;
        if (j >= 0) {
            HS1.m3431b(10);
            String string = Long.toString(j, 10);
            O90.m5967e(string, "toString(...)");
            return string;
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        HS1.m3431b(10);
        String string2 = Long.toString(j3, 10);
        O90.m5967e(string2, "toString(...)");
        HS1.m3431b(10);
        String string3 = Long.toString(j4, 10);
        O90.m5967e(string3, "toString(...)");
        return string2.concat(string3);
    }
}
