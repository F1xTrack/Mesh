package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Z51 implements WR {
    public final InterfaceC3519e61 a;
    public final C6666qX b;
    public final ArrayList c;
    public InterfaceC1584Ub1 f;
    public int g;
    public int h;
    public long[] i;
    public long j;
    public byte[] e = AbstractC0277Dh1.f;
    public final C4103hA0 d = new C4103hA0();

    public Z51(InterfaceC3519e61 interfaceC3519e61, C6666qX c6666qX) {
        this.a = interfaceC3519e61;
        C6475pX c6475pXA = c6666qX.a();
        c6475pXA.l = AbstractC1865Xr0.n("application/x-media3-cues");
        c6475pXA.i = c6666qX.m;
        c6475pXA.F = interfaceC3519e61.G();
        this.b = new C6666qX(c6475pXA);
        this.c = new ArrayList();
        this.h = 0;
        this.i = AbstractC0277Dh1.g;
        this.j = -9223372036854775807L;
    }

    public final void a(Y51 y51) {
        YN1.h(this.f);
        byte[] bArr = y51.b;
        int length = bArr.length;
        C4103hA0 c4103hA0 = this.d;
        c4103hA0.getClass();
        c4103hA0.E(bArr.length, bArr);
        this.f.d(length, c4103hA0);
        this.f.a(y51.a, 1, length, 0, null);
    }

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    @Override // defpackage.WR
    public final int d(XR xr, SV sv) throws C5643lA0, EOFException, InterruptedIOException {
        int i = this.h;
        YN1.f((i == 0 || i == 5) ? false : true);
        if (this.h == 1) {
            int iB = ((C7566vF) xr).c != -1 ? AbstractC6955s22.b(((C7566vF) xr).c) : 1024;
            if (iB > this.e.length) {
                this.e = new byte[iB];
            }
            this.g = 0;
            this.h = 2;
        }
        int i2 = this.h;
        ArrayList arrayList = this.c;
        if (i2 == 2) {
            byte[] bArr = this.e;
            if (bArr.length == this.g) {
                this.e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.e;
            int i3 = this.g;
            C7566vF c7566vF = (C7566vF) xr;
            int iR = c7566vF.r(bArr2, i3, bArr2.length - i3);
            if (iR != -1) {
                this.g += iR;
            }
            long j = c7566vF.c;
            if ((j != -1 && this.g == j) || iR == -1) {
                try {
                    long j2 = this.j;
                    this.a.m(this.e, 0, this.g, j2 != -9223372036854775807L ? new C3329d61(j2, true) : C3329d61.c, new C1724Vw0(18, this));
                    Collections.sort(arrayList);
                    this.i = new long[arrayList.size()];
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        this.i[i4] = ((Y51) arrayList.get(i4)).a;
                    }
                    this.e = AbstractC0277Dh1.f;
                    this.h = 4;
                } catch (RuntimeException e) {
                    throw C5643lA0.a(e, "SubtitleParser failed.");
                }
            }
        }
        if (this.h == 3) {
            if (((C7566vF) xr).i(((C7566vF) xr).c != -1 ? AbstractC6955s22.b(((C7566vF) xr).c) : 1024) == -1) {
                long j3 = this.j;
                for (int iF = j3 == -9223372036854775807L ? 0 : AbstractC0277Dh1.f(this.i, j3, true); iF < arrayList.size(); iF++) {
                    a((Y51) arrayList.get(iF));
                }
                this.h = 4;
            }
        }
        return this.h == 4 ? -1 : 0;
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) {
        return true;
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        int i = this.h;
        YN1.f((i == 0 || i == 5) ? false : true);
        this.j = j2;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override // defpackage.WR
    public final List h() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        YN1.f(this.h == 0);
        InterfaceC1584Ub1 interfaceC1584Ub1W = yr.w(0, 3);
        this.f = interfaceC1584Ub1W;
        interfaceC1584Ub1W.f(this.b);
        yr.p();
        yr.x(new C3906g80(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.h = 1;
    }

    @Override // defpackage.WR
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.a.d();
        this.h = 5;
    }
}
