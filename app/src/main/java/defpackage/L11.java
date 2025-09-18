package defpackage;

/* loaded from: classes.dex */
public final class L11 extends AbstractC6502pg {
    public final int o;
    public final C6666qX p;
    public long q;
    public boolean r;

    public L11(ZC zc, C3538eD c3538eD, C6666qX c6666qX, int i, Object obj, long j, long j2, long j3, int i2, C6666qX c6666qX2) {
        super(zc, c3538eD, c6666qX, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.o = i2;
        this.p = c6666qX2;
    }

    @Override // defpackage.AbstractC0297Do0
    public final boolean b() {
        return this.r;
    }

    @Override // defpackage.InterfaceC5751lk0
    public final void e() {
        M41 m41 = this.i;
        VH vh = this.m;
        YN1.h(vh);
        for (C2527cV0 c2527cV0 : (C2527cV0[]) vh.c) {
            if (c2527cV0.F != 0) {
                c2527cV0.F = 0L;
                c2527cV0.z = true;
            }
        }
        InterfaceC1584Ub1 interfaceC1584Ub1E = vh.E(this.o);
        interfaceC1584Ub1E.f(this.p);
        try {
            long jC = m41.c(this.b.d(this.q));
            if (jC != -1) {
                jC += this.q;
            }
            C7566vF c7566vF = new C7566vF(this.i, this.q, jC);
            for (int iE = 0; iE != -1; iE = interfaceC1584Ub1E.e(c7566vF, Integer.MAX_VALUE, true)) {
                this.q += iE;
            }
            interfaceC1584Ub1E.a(this.g, 1, (int) this.q, 0, null);
            AbstractC4370iZ1.b(m41);
            this.r = true;
        } catch (Throwable th) {
            AbstractC4370iZ1.b(m41);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC5751lk0
    public final void s() {
    }
}
