package defpackage;

import java.util.List;

/* renamed from: hx0 */
/* loaded from: classes.dex */
public final class C4250hx0 implements WR {
    public YR a;
    public AbstractC4089h51 b;
    public boolean c;

    public final boolean a(C7566vF c7566vF) {
        boolean zE;
        C5599kx0 c5599kx0 = new C5599kx0();
        if (c5599kx0.a(c7566vF, true) && (c5599kx0.a & 2) == 2) {
            int iMin = Math.min(c5599kx0.e, 8);
            C4103hA0 c4103hA0 = new C4103hA0(iMin);
            c7566vF.f(c4103hA0.a, 0, iMin, false);
            c4103hA0.G(0);
            if (c4103hA0.a() >= 5 && c4103hA0.u() == 127 && c4103hA0.w() == 1179402563) {
                this.b = new TV();
            } else {
                c4103hA0.G(0);
                try {
                    zE = U02.e(1, c4103hA0, true);
                } catch (C5643lA0 unused) {
                    zE = false;
                }
                if (zE) {
                    this.b = new C5567km1();
                } else {
                    c4103hA0.G(0);
                    if (C0950Ly0.e(c4103hA0, C0950Ly0.o)) {
                        this.b = new C0950Ly0();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0182  */
    @Override // defpackage.WR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.XR r21, defpackage.SV r22) throws defpackage.C5643lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4250hx0.d(XR, SV):int");
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) {
        try {
            return a((C7566vF) xr);
        } catch (C5643lA0 unused) {
            return false;
        }
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        AbstractC4089h51 abstractC4089h51 = this.b;
        if (abstractC4089h51 != null) {
            C5408jx0 c5408jx0 = abstractC4089h51.a;
            C5599kx0 c5599kx0 = c5408jx0.a;
            c5599kx0.a = 0;
            c5599kx0.b = 0L;
            c5599kx0.c = 0;
            c5599kx0.d = 0;
            c5599kx0.e = 0;
            c5408jx0.b.D(0);
            c5408jx0.c = -1;
            c5408jx0.e = false;
            if (j == 0) {
                abstractC4089h51.d(!abstractC4089h51.l);
                return;
            }
            if (abstractC4089h51.h != 0) {
                long j3 = (abstractC4089h51.i * j2) / 1000000;
                abstractC4089h51.e = j3;
                InterfaceC5790lx0 interfaceC5790lx0 = abstractC4089h51.d;
                int i = AbstractC0277Dh1.a;
                interfaceC5790lx0.d(j3);
                abstractC4089h51.h = 2;
            }
        }
    }

    @Override // defpackage.WR
    public final List h() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        this.a = yr;
    }

    @Override // defpackage.WR
    public final void release() {
    }
}
