package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: u1 */
/* loaded from: classes.dex */
public final class C6923u1 implements InterfaceC1412WR {

    /* renamed from: a */
    public final C6986v1 f43445a = new C6986v1();

    /* renamed from: b */
    public final C9591hA0 f43446b = new C9591hA0(2786);

    /* renamed from: c */
    public boolean f43447c;

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    public final int mo738d(InterfaceC1475XR interfaceC1475XR, C1164SV c1164sv) throws EOFException, InterruptedIOException {
        C9591hA0 c9591hA0 = this.f43446b;
        int iMo2367r = ((C7000vF) interfaceC1475XR).mo2367r(c9591hA0.f28293a, 0, 2786);
        if (iMo2367r == -1) {
            return -1;
        }
        c9591hA0.m18741G(0);
        c9591hA0.m18740F(iMo2367r);
        boolean z = this.f43447c;
        C6986v1 c6986v1 = this.f43445a;
        if (!z) {
            c6986v1.f44085n = 0L;
            this.f43447c = true;
        }
        c6986v1.mo9102b(c9591hA0);
        return 0;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) throws EOFException, InterruptedIOException {
        C7000vF c7000vF;
        int iM4914a;
        C9591hA0 c9591hA0 = new C9591hA0(10);
        int i = 0;
        while (true) {
            c7000vF = (C7000vF) interfaceC1475XR;
            c7000vF.mo3620f(c9591hA0.f28293a, 0, 10, false);
            c9591hA0.m18741G(0);
            if (c9591hA0.m18766x() != 4801587) {
                break;
            }
            c9591hA0.m18742H(3);
            int iM18762t = c9591hA0.m18762t();
            i += iM18762t + 10;
            c7000vF.m25375a(iM18762t, false);
        }
        c7000vF.f44297f = 0;
        c7000vF.m25375a(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            c7000vF.mo3620f(c9591hA0.f28293a, 0, 6, false);
            c9591hA0.m18741G(0);
            if (c9591hA0.m18735A() != 2935) {
                c7000vF.f44297f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                c7000vF.m25375a(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = c9591hA0.f28293a;
                if (bArr.length < 6) {
                    iM4914a = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iM4914a = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iM4914a = AbstractC0705LB.m4914a((b & 192) >> 6, b & 63);
                }
                if (iM4914a == -1) {
                    return false;
                }
                c7000vF.m25375a(iM4914a - 6, false);
            }
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        this.f43447c = false;
        this.f43445a.mo9103c();
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
        this.f43445a.mo9104d(interfaceC1538YR, new YM0(0, 1));
        interfaceC1538YR.mo2003p();
        interfaceC1538YR.mo2006x(new C4130gf(-9223372036854775807L));
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
    }
}
