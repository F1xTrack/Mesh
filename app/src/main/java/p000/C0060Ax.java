package p000;

/* renamed from: Ax */
/* loaded from: classes.dex */
public class C0060Ax implements CX0 {

    /* renamed from: a */
    public final long f476a;

    /* renamed from: b */
    public final long f477b;

    /* renamed from: c */
    public final int f478c;

    /* renamed from: d */
    public final long f479d;

    /* renamed from: e */
    public final int f480e;

    /* renamed from: f */
    public final long f481f;

    /* renamed from: g */
    public final boolean f482g;

    public C0060Ax(long j, long j2, int i, int i2, boolean z) {
        this.f476a = j;
        this.f477b = j2;
        this.f478c = i2 == -1 ? 1 : i2;
        this.f480e = i;
        this.f482g = z;
        if (j == -1) {
            this.f479d = -1L;
            this.f481f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.f479d = j3;
            this.f481f = (Math.max(0L, j3) * 8000000) / i;
        }
    }

    @Override // p000.CX0
    /* renamed from: e */
    public final boolean mo413e() {
        return this.f479d != -1 || this.f482g;
    }

    @Override // p000.CX0
    /* renamed from: i */
    public final BX0 mo414i(long j) {
        long j2 = this.f479d;
        long j3 = this.f477b;
        if (j2 == -1 && !this.f482g) {
            EX0 ex0 = new EX0(0L, j3);
            return new BX0(ex0, ex0);
        }
        int i = this.f480e;
        long j4 = this.f478c;
        long jMin = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / i;
        EX0 ex02 = new EX0(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.f476a) {
                return new BX0(ex02, new EX0((Math.max(0L, j5 - j3) * 8000000) / i, j5));
            }
        }
        return new BX0(ex02, ex02);
    }

    @Override // p000.CX0
    /* renamed from: k */
    public final long mo415k() {
        return this.f481f;
    }
}
