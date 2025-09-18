package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7712w1 implements WR {
    public final C7521v1 a = new C7521v1(null, 0, 1);
    public final C4103hA0 b = new C4103hA0(16384);
    public boolean c;

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    @Override // defpackage.WR
    public final int d(XR xr, SV sv) throws EOFException, InterruptedIOException {
        C4103hA0 c4103hA0 = this.b;
        int iR = ((C7566vF) xr).r(c4103hA0.a, 0, 16384);
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
        int i;
        C4103hA0 c4103hA0 = new C4103hA0(10);
        int i2 = 0;
        while (true) {
            c7566vF = (C7566vF) xr;
            c7566vF.f(c4103hA0.a, 0, 10, false);
            c4103hA0.G(0);
            if (c4103hA0.x() != 4801587) {
                break;
            }
            c4103hA0.H(3);
            int iT = c4103hA0.t();
            i2 += iT + 10;
            c7566vF.a(iT, false);
        }
        c7566vF.f = 0;
        c7566vF.a(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            c7566vF.f(c4103hA0.a, 0, 7, false);
            c4103hA0.G(0);
            int iA = c4103hA0.A();
            if (iA == 44096 || iA == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = c4103hA0.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iA == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    return false;
                }
                c7566vF.a(i - 7, false);
            } else {
                c7566vF.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                c7566vF.a(i4, false);
                i3 = 0;
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
