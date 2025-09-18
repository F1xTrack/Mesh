package p000;

/* renamed from: rh */
/* loaded from: classes.dex */
public final class C6759rh {

    /* renamed from: d */
    public static final C6759rh f41805d = new C6759rh(-3, -9223372036854775807L, -1);

    /* renamed from: e */
    public static C6759rh f41806e;

    /* renamed from: a */
    public long f41807a;

    /* renamed from: b */
    public long f41808b;

    /* renamed from: c */
    public int f41809c;

    public C6759rh(int i, long j, long j2) {
        this.f41809c = i;
        this.f41807a = j;
        this.f41808b = j2;
    }

    /* renamed from: a */
    public void m24448a(double d, double d2, long j) {
        double d3 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + Math.round((r3 - 9.0E-4f) - r7) + 9.0E-4f + ((-d2) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d4 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d4))) / (Math.cos(dAsin) * Math.cos(d4));
        if (dSin3 >= 1.0d) {
            this.f41809c = 1;
            this.f41807a = -1L;
            this.f41808b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f41809c = 0;
                this.f41807a = -1L;
                this.f41808b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f41807a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f41808b = jRound;
            if (jRound >= j || this.f41807a <= j) {
                this.f41809c = 1;
            } else {
                this.f41809c = 0;
            }
        }
    }
}
