package p000;

/* loaded from: classes.dex */
public final class DX0 {

    /* renamed from: c */
    public static final DX0 f2039c;

    /* renamed from: a */
    public final long f2040a;

    /* renamed from: b */
    public final long f2041b;

    static {
        DX0 dx0 = new DX0(0L, 0L);
        new DX0(Long.MAX_VALUE, Long.MAX_VALUE);
        new DX0(Long.MAX_VALUE, 0L);
        new DX0(0L, Long.MAX_VALUE);
        f2039c = dx0;
    }

    public DX0(long j, long j2) {
        YN1.m9278c(j >= 0);
        YN1.m9278c(j2 >= 0);
        this.f2040a = j;
        this.f2041b = j2;
    }

    /* renamed from: a */
    public final long m1724a(long j, long j2, long j3) {
        long j4 = this.f2040a;
        long j5 = this.f2041b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        int i = AbstractC7485Dh1.f2166a;
        long j6 = j - j4;
        if (((j4 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j5;
        if (((j5 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = false;
        boolean z2 = j6 <= j2 && j2 <= j7;
        if (j6 <= j3 && j3 <= j7) {
            z = true;
        }
        return (z2 && z) ? Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3 : z2 ? j2 : z ? j3 : j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DX0.class != obj.getClass()) {
            return false;
        }
        DX0 dx0 = (DX0) obj;
        return this.f2040a == dx0.f2040a && this.f2041b == dx0.f2041b;
    }

    public final int hashCode() {
        return (((int) this.f2040a) * 31) + ((int) this.f2041b);
    }
}
