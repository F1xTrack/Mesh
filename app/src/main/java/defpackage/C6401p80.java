package defpackage;

/* renamed from: p80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6401p80 extends AbstractC1318Qr {
    public final C4019gk j;
    public VH k;
    public long l;
    public volatile boolean m;

    public C6401p80(ZC zc, C3538eD c3538eD, C6666qX c6666qX, int i, Object obj, C4019gk c4019gk) {
        super(zc, c3538eD, 2, c6666qX, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.j = c4019gk;
    }

    @Override // defpackage.InterfaceC5751lk0
    public final void e() {
        if (this.l == 0) {
            this.j.a(this.k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C3538eD c3538eDD = this.b.d(this.l);
            M41 m41 = this.i;
            C7566vF c7566vF = new C7566vF(m41, c3538eDD.f, m41.c(c3538eDD));
            while (!this.m) {
                try {
                    int iD = this.j.a.d(c7566vF, C4019gk.k);
                    boolean z = false;
                    YN1.f(iD != 1);
                    if (iD == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } finally {
                    this.l = c7566vF.d - this.b.f;
                }
            }
        } finally {
            AbstractC4370iZ1.b(this.i);
        }
    }

    @Override // defpackage.InterfaceC5751lk0
    public final void s() {
        this.m = true;
    }
}
