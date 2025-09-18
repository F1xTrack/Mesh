package p000;

/* renamed from: ph */
/* loaded from: classes.dex */
public final class C6633ph {

    /* renamed from: a */
    public final long f40277a;

    /* renamed from: b */
    public final long f40278b;

    /* renamed from: c */
    public final long f40279c;

    /* renamed from: d */
    public long f40280d = 0;

    /* renamed from: e */
    public long f40281e;

    /* renamed from: f */
    public long f40282f;

    /* renamed from: g */
    public long f40283g;

    /* renamed from: h */
    public long f40284h;

    public C6633ph(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f40277a = j;
        this.f40278b = j2;
        this.f40281e = j3;
        this.f40282f = j4;
        this.f40283g = j5;
        this.f40279c = j6;
        this.f40284h = m23834a(j2, 0L, j3, j4, j5, j6);
    }

    /* renamed from: a */
    public static long m23834a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return AbstractC7485Dh1.m1826k(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }
}
