package defpackage;

/* renamed from: re */
/* loaded from: classes.dex */
public final class C6877re {
    public final long a;
    public final long b;
    public final C7444uc c;

    public C6877re(long j, long j2, C7444uc c7444uc) {
        this.a = j;
        this.b = j2;
        this.c = c7444uc;
    }

    public static C6877re a(long j, long j2, C7444uc c7444uc) {
        AbstractC3377dM1.d("duration must be positive value.", j >= 0);
        AbstractC3377dM1.d("bytes must be positive value.", j2 >= 0);
        return new C6877re(j, j2, c7444uc);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6877re)) {
            return false;
        }
        C6877re c6877re = (C6877re) obj;
        return this.a == c6877re.a && this.b == c6877re.b && this.c.equals(c6877re.c);
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.a + ", numBytesRecorded=" + this.b + ", audioStats=" + this.c + "}";
    }
}
