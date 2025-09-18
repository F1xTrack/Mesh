package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: Xs0 */
/* loaded from: classes.dex */
public final class C1868Xs0 implements WR {
    public static final C0681Im0 u = new C0681Im0(11);
    public final int a;
    public final long b;
    public final C4103hA0 c;
    public final C1258Px d;
    public final C3878g00 e;
    public final C0136Bm1 f;
    public final WJ g;
    public YR h;
    public InterfaceC1584Ub1 i;
    public InterfaceC1584Ub1 j;
    public int k;
    public C0540Gr0 l;
    public long m;
    public long n;
    public long o;
    public int p;
    public GX0 q;
    public boolean r;
    public boolean s;
    public long t;

    public C1868Xs0() {
        this(-9223372036854775807L);
    }

    public static long a(C0540Gr0 c0540Gr0) {
        if (c0540Gr0 == null) {
            return -9223372036854775807L;
        }
        int iC = c0540Gr0.c();
        for (int i = 0; i < iC; i++) {
            InterfaceC0384Er0 interfaceC0384Er0 = c0540Gr0.a[i];
            if (interfaceC0384Er0 instanceof C6596q91) {
                C6596q91 c6596q91 = (C6596q91) interfaceC0384Er0;
                if (c6596q91.a.equals("TLEN")) {
                    return AbstractC0277Dh1.Q(Long.parseLong((String) c6596q91.d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    public final boolean c(C7566vF c7566vF) {
        GX0 gx0 = this.q;
        if (gx0 != null) {
            long jC = gx0.c();
            if (jC != -1 && c7566vF.j() > jC - 4) {
                return true;
            }
        }
        try {
            return !c7566vF.f(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:271:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x051c  */
    @Override // defpackage.WR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.XR r51, defpackage.SV r52) throws defpackage.C5643lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1868Xs0.d(XR, SV):int");
    }

    public final boolean e(C7566vF c7566vF, boolean z) throws C5643lA0, EOFException, InterruptedIOException {
        int iJ;
        int i;
        int iB;
        int i2 = z ? 32768 : 131072;
        c7566vF.f = 0;
        if (c7566vF.d == 0) {
            C0540Gr0 c0540Gr0X = this.f.x(c7566vF, (this.a & 8) == 0 ? null : u);
            this.l = c0540Gr0X;
            if (c0540Gr0X != null) {
                this.e.b(c0540Gr0X);
            }
            iJ = (int) c7566vF.j();
            if (!z) {
                c7566vF.n(iJ);
            }
            i = 0;
        } else {
            iJ = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (!c(c7566vF)) {
                C4103hA0 c4103hA0 = this.c;
                c4103hA0.G(0);
                int iG = c4103hA0.g();
                if ((i == 0 || ((-128000) & iG) == (i & (-128000))) && (iB = MA1.b(iG)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.d.b(iG);
                        i = iG;
                    }
                    c7566vF.a(iB - 4, false);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == i2) {
                        if (z) {
                            return false;
                        }
                        throw C5643lA0.a(null, "Searched too many bytes.");
                    }
                    if (z) {
                        c7566vF.f = 0;
                        c7566vF.a(iJ + i5, false);
                    } else {
                        c7566vF.n(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i = 0;
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            c7566vF.n(iJ + i4);
        } else {
            c7566vF.f = 0;
        }
        this.k = i;
        return true;
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) {
        return e((C7566vF) xr, true);
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.p = 0;
        this.t = j2;
        GX0 gx0 = this.q;
        if (!(gx0 instanceof C4097h80) || ((C4097h80) gx0).b(j2)) {
            return;
        }
        this.s = true;
        this.j = this.g;
    }

    @Override // defpackage.WR
    public final List h() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        this.h = yr;
        InterfaceC1584Ub1 interfaceC1584Ub1W = yr.w(0, 1);
        this.i = interfaceC1584Ub1W;
        this.j = interfaceC1584Ub1W;
        this.h.p();
    }

    public C1868Xs0(long j) {
        this.a = 0;
        this.b = j;
        this.c = new C4103hA0(10);
        this.d = new C1258Px();
        this.e = new C3878g00();
        this.m = -9223372036854775807L;
        this.f = new C0136Bm1(21);
        WJ wj = new WJ();
        this.g = wj;
        this.j = wj;
    }

    @Override // defpackage.WR
    public final void release() {
    }
}
