package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: w1 */
/* loaded from: classes.dex */
public final class C7049w1 implements InterfaceC1412WR {

    /* renamed from: a */
    public final C6986v1 f44634a = new C6986v1(null, 0, 1);

    /* renamed from: b */
    public final C9591hA0 f44635b = new C9591hA0(16384);

    /* renamed from: c */
    public boolean f44636c;

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    public final int mo738d(InterfaceC1475XR interfaceC1475XR, C1164SV c1164sv) throws EOFException, InterruptedIOException {
        C9591hA0 c9591hA0 = this.f44635b;
        int iMo2367r = ((C7000vF) interfaceC1475XR).mo2367r(c9591hA0.f28293a, 0, 16384);
        if (iMo2367r == -1) {
            return -1;
        }
        c9591hA0.m18741G(0);
        c9591hA0.m18740F(iMo2367r);
        boolean z = this.f44636c;
        C6986v1 c6986v1 = this.f44634a;
        if (!z) {
            c6986v1.f44085n = 0L;
            this.f44636c = true;
        }
        c6986v1.mo9102b(c9591hA0);
        return 0;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) throws EOFException, InterruptedIOException {
        C7000vF c7000vF;
        int i;
        C9591hA0 c9591hA0 = new C9591hA0(10);
        int i2 = 0;
        while (true) {
            c7000vF = (C7000vF) interfaceC1475XR;
            c7000vF.mo3620f(c9591hA0.f28293a, 0, 10, false);
            c9591hA0.m18741G(0);
            if (c9591hA0.m18766x() != 4801587) {
                break;
            }
            c9591hA0.m18742H(3);
            int iM18762t = c9591hA0.m18762t();
            i2 += iM18762t + 10;
            c7000vF.m25375a(iM18762t, false);
        }
        c7000vF.f44297f = 0;
        c7000vF.m25375a(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            c7000vF.mo3620f(c9591hA0.f28293a, 0, 7, false);
            c9591hA0.m18741G(0);
            int iM18735A = c9591hA0.m18735A();
            if (iM18735A == 44096 || iM18735A == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = c9591hA0.f28293a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iM18735A == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    return false;
                }
                c7000vF.m25375a(i - 7, false);
            } else {
                c7000vF.f44297f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                c7000vF.m25375a(i4, false);
                i3 = 0;
            }
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        this.f44636c = false;
        this.f44634a.mo9103c();
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: h */
    public final List mo741h() {
        N70 n70 = P70.f8867b;
        return C9367fQ0.f27184e;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: l */
    public final void mo742l(InterfaceC1538YR interfaceC1538YR) {
        this.f44634a.mo9104d(interfaceC1538YR, new YM0(0, 1));
        interfaceC1538YR.mo2003p();
        interfaceC1538YR.mo2006x(new C4130gf(-9223372036854775807L));
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
    }
}
