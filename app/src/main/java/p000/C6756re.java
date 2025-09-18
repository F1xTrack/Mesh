package p000;

/* renamed from: re */
/* loaded from: classes.dex */
public final class C6756re {

    /* renamed from: a */
    public final long f41781a;

    /* renamed from: b */
    public final long f41782b;

    /* renamed from: c */
    public final C6960uc f41783c;

    public C6756re(long j, long j2, C6960uc c6960uc) {
        this.f41781a = j;
        this.f41782b = j2;
        this.f41783c = c6960uc;
    }

    /* renamed from: a */
    public static C6756re m24436a(long j, long j2, C6960uc c6960uc) {
        AbstractC9104dM1.m17545d("duration must be positive value.", j >= 0);
        AbstractC9104dM1.m17545d("bytes must be positive value.", j2 >= 0);
        return new C6756re(j, j2, c6960uc);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6756re)) {
            return false;
        }
        C6756re c6756re = (C6756re) obj;
        return this.f41781a == c6756re.f41781a && this.f41782b == c6756re.f41782b && this.f41783c.equals(c6756re.f41783c);
    }

    public final int hashCode() {
        long j = this.f41781a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f41782b;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f41783c.hashCode();
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f41781a + ", numBytesRecorded=" + this.f41782b + ", audioStats=" + this.f41783c + "}";
    }
}
