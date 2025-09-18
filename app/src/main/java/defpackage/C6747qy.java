package defpackage;

/* renamed from: qy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6747qy extends AbstractC6502pg {
    public final int o;
    public final long p;
    public final InterfaceC1396Rr q;
    public long r;
    public volatile boolean s;
    public boolean t;

    public C6747qy(ZC zc, C3538eD c3538eD, C6666qX c6666qX, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, InterfaceC1396Rr interfaceC1396Rr) {
        super(zc, c3538eD, c6666qX, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.q = interfaceC1396Rr;
    }

    @Override // defpackage.AbstractC0297Do0
    public final long a() {
        return this.j + this.o;
    }

    @Override // defpackage.AbstractC0297Do0
    public final boolean b() {
        return this.t;
    }

    @Override // defpackage.InterfaceC5751lk0
    public final void e() {
        VH vh = this.m;
        YN1.h(vh);
        if (this.r == 0) {
            long j = this.p;
            for (C2527cV0 c2527cV0 : (C2527cV0[]) vh.c) {
                if (c2527cV0.F != j) {
                    c2527cV0.F = j;
                    c2527cV0.z = true;
                }
            }
            InterfaceC1396Rr interfaceC1396Rr = this.q;
            long j2 = this.k;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.p;
            long j4 = this.l;
            ((C4019gk) interfaceC1396Rr).a(vh, j3, j4 == -9223372036854775807L ? -9223372036854775807L : j4 - this.p);
        }
        try {
            C3538eD c3538eDD = this.b.d(this.r);
            M41 m41 = this.i;
            C7566vF c7566vF = new C7566vF(m41, c3538eDD.f, m41.c(c3538eDD));
            while (!this.s) {
                try {
                    int iD = ((C4019gk) this.q).a.d(c7566vF, C4019gk.k);
                    YN1.f(iD != 1);
                    if (!(iD == 0)) {
                        break;
                    }
                } finally {
                    this.r = c7566vF.d - this.b.f;
                }
            }
            C6666qX c6666qX = this.d;
            if (AbstractC1865Xr0.k(c6666qX.l)) {
                int i = c6666qX.H;
                int i2 = c6666qX.I;
                if ((i > 1 || i2 > 1) && i != -1 && i2 != -1) {
                    InterfaceC1584Ub1 interfaceC1584Ub1E = vh.E(4);
                    int i3 = i * i2;
                    long j5 = (this.h - this.g) / i3;
                    for (int i4 = 1; i4 < i3; i4++) {
                        interfaceC1584Ub1E.d(0, new C4103hA0());
                        interfaceC1584Ub1E.a(i4 * j5, 0, 0, 0, null);
                    }
                }
            }
            AbstractC4370iZ1.b(this.i);
            this.t = !this.s;
        } catch (Throwable th) {
            AbstractC4370iZ1.b(this.i);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC5751lk0
    public final void s() {
        this.s = true;
    }
}
