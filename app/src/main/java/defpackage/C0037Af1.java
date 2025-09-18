package defpackage;

/* renamed from: Af1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0037Af1 implements Comparable {
    public final long a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C0037Af1) obj).a;
        long j2 = this.a ^ Long.MIN_VALUE;
        long j3 = j ^ Long.MIN_VALUE;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0037Af1) {
            return this.a == ((C0037Af1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.a;
        if (j >= 0) {
            HS1.b(10);
            String string = Long.toString(j, 10);
            O90.e(string, "toString(...)");
            return string;
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        HS1.b(10);
        String string2 = Long.toString(j3, 10);
        O90.e(string2, "toString(...)");
        HS1.b(10);
        String string3 = Long.toString(j4, 10);
        O90.e(string3, "toString(...)");
        return string2.concat(string3);
    }
}
