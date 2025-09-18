package defpackage;

/* renamed from: oG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6233oG implements InterfaceC5790lx0 {
    public final C5599kx0 a;
    public final long b;
    public final long c;
    public final AbstractC4089h51 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public C6233oG(AbstractC4089h51 abstractC4089h51, long j, long j2, long j3, long j4, boolean z) {
        YN1.c(j >= 0 && j2 > j);
        this.d = abstractC4089h51;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new C5599kx0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // defpackage.InterfaceC5790lx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(defpackage.C7566vF r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6233oG.a(vF):long");
    }

    @Override // defpackage.InterfaceC5790lx0
    public final CX0 b() {
        if (this.f != 0) {
            return new C6042nG(this);
        }
        return null;
    }

    @Override // defpackage.InterfaceC5790lx0
    public final void d(long j) {
        this.h = AbstractC0277Dh1.k(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
