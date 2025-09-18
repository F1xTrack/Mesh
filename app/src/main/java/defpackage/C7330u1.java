package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7330u1 implements WR {
    public final C7521v1 a = new C7521v1();
    public final C4103hA0 b = new C4103hA0(2786);
    public boolean c;

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    @Override // defpackage.WR
    public final int d(XR xr, SV sv) throws EOFException, InterruptedIOException {
        C4103hA0 c4103hA0 = this.b;
        int iR = ((C7566vF) xr).r(c4103hA0.a, 0, 2786);
        if (iR == -1) {
            return -1;
        }
        c4103hA0.G(0);
        c4103hA0.F(iR);
        boolean z = this.c;
        C7521v1 c7521v1 = this.a;
        if (!z) {
            c7521v1.n = 0L;
            this.c = true;
        }
        c7521v1.b(c4103hA0);
        return 0;
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) throws EOFException, InterruptedIOException {
        C7566vF c7566vF;
        int iA;
        C4103hA0 c4103hA0 = new C4103hA0(10);
        int i = 0;
        while (true) {
            c7566vF = (C7566vF) xr;
            c7566vF.f(c4103hA0.a, 0, 10, false);
            c4103hA0.G(0);
            if (c4103hA0.x() != 4801587) {
                break;
            }
            c4103hA0.H(3);
            int iT = c4103hA0.t();
            i += iT + 10;
            c7566vF.a(iT, false);
        }
        c7566vF.f = 0;
        c7566vF.a(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            c7566vF.f(c4103hA0.a, 0, 6, false);
            c4103hA0.G(0);
            if (c4103hA0.A() != 2935) {
                c7566vF.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                c7566vF.a(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = c4103hA0.a;
                if (bArr.length < 6) {
                    iA = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iA = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iA = LB.a((b & 192) >> 6, b & 63);
                }
                if (iA == -1) {
                    return false;
                }
                c7566vF.a(iA - 6, false);
            }
        }
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        this.c = false;
        this.a.c();
    }

    @Override // defpackage.WR
    public final List h() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        this.a.d(yr, new YM0(0, 1));
        yr.p();
        yr.x(new C4004gf(-9223372036854775807L));
    }

    @Override // defpackage.WR
    public final void release() {
    }
}
