package p000;

import java.util.Iterator;

/* renamed from: Bl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7388Bl0 implements Iterable, InterfaceC11315ue0 {

    /* renamed from: a */
    public final long f1009a;

    /* renamed from: b */
    public final long f1010b;

    /* renamed from: c */
    public final long f1011c;

    public C7388Bl0(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f1009a = j;
        if (j3 > 0) {
            if (j < j2) {
                long j4 = j2 % j3;
                long j5 = j % j3;
                long j6 = ((j4 < 0 ? j4 + j3 : j4) - (j5 < 0 ? j5 + j3 : j5)) % j3;
                j2 -= j6 < 0 ? j6 + j3 : j6;
            }
        } else {
            if (j3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j > j2) {
                long j7 = -j3;
                long j8 = j % j7;
                long j9 = j2 % j7;
                long j10 = ((j8 < 0 ? j8 + j7 : j8) - (j9 < 0 ? j9 + j7 : j9)) % j7;
                j2 += j10 < 0 ? j10 + j7 : j10;
            }
        }
        this.f1010b = j2;
        this.f1011c = j3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7388Bl0) {
            if (!isEmpty() || !((C7388Bl0) obj).isEmpty()) {
                C7388Bl0 c7388Bl0 = (C7388Bl0) obj;
                if (this.f1009a != c7388Bl0.f1009a || this.f1010b != c7388Bl0.f1010b || this.f1011c != c7388Bl0.f1011c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        long j2 = this.f1009a;
        long j3 = this.f1010b;
        long j4 = (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32))) * j;
        long j5 = this.f1011c;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    public boolean isEmpty() {
        long j = this.f1011c;
        long j2 = this.f1010b;
        long j3 = this.f1009a;
        if (j > 0) {
            if (j3 <= j2) {
                return false;
            }
        } else if (j3 >= j2) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C7440Cl0(this.f1009a, this.f1010b, this.f1011c);
    }

    public String toString() {
        StringBuilder sb;
        long j = this.f1011c;
        long j2 = this.f1010b;
        long j3 = this.f1009a;
        if (j > 0) {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append("..");
            sb.append(j2);
            sb.append(" step ");
            sb.append(j);
        } else {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append(" downTo ");
            sb.append(j2);
            sb.append(" step ");
            sb.append(-j);
        }
        return sb.toString();
    }
}
