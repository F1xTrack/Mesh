package defpackage;

/* renamed from: Ej1 */
/* loaded from: classes.dex */
public final class C0361Ej1 {
    public final C3866fw1 a;
    public final C8418zj1 b;
    public final C7581vK c = new C7581vK(5);
    public final J9 d = new J9();
    public final J9 e = new J9();
    public final C5971mu f;
    public C1530Tj1 g;
    public C1530Tj1 h;
    public long i;
    public long j;

    public C0361Ej1(C3866fw1 c3866fw1, C8418zj1 c8418zj1) {
        this.a = c3866fw1;
        this.b = c8418zj1;
        C5971mu c5971mu = new C5971mu();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        c5971mu.a = 0;
        c5971mu.b = 0;
        c5971mu.d = new long[iHighestOneBit];
        c5971mu.c = iHighestOneBit - 1;
        this.f = c5971mu;
        this.h = C1530Tj1.e;
        this.j = -9223372036854775807L;
    }

    public final void a() {
        C5971mu c5971mu = this.f;
        c5971mu.a = 0;
        c5971mu.b = 0;
        this.j = -9223372036854775807L;
        J9 j9 = this.e;
        if (j9.t() > 0) {
            YN1.c(j9.t() > 0);
            while (j9.t() > 1) {
                j9.p();
            }
            Object objP = j9.p();
            objP.getClass();
            j9.a(0L, (Long) objP);
        }
        C1530Tj1 c1530Tj1 = this.g;
        J9 j92 = this.d;
        if (c1530Tj1 != null) {
            j92.b();
            return;
        }
        if (j92.t() > 0) {
            YN1.c(j92.t() > 0);
            while (j92.t() > 1) {
                j92.p();
            }
            Object objP2 = j92.p();
            objP2.getClass();
            this.g = (C1530Tj1) objP2;
        }
    }
}
