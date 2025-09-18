package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: s3 */
/* loaded from: classes.dex */
public final class C6799s3 implements InterfaceC1412WR {

    /* renamed from: d */
    public final C9591hA0 f42226d;

    /* renamed from: e */
    public final C0683Kq f42227e;

    /* renamed from: f */
    public InterfaceC1538YR f42228f;

    /* renamed from: g */
    public long f42229g;

    /* renamed from: j */
    public boolean f42232j;

    /* renamed from: k */
    public boolean f42233k;

    /* renamed from: l */
    public boolean f42234l;

    /* renamed from: a */
    public final int f42223a = 0;

    /* renamed from: b */
    public final C6862t3 f42224b = new C6862t3(0, null, true);

    /* renamed from: c */
    public final C9591hA0 f42225c = new C9591hA0(2048);

    /* renamed from: i */
    public int f42231i = -1;

    /* renamed from: h */
    public long f42230h = -1;

    public C6799s3() {
        C9591hA0 c9591hA0 = new C9591hA0(10);
        this.f42226d = c9591hA0;
        byte[] bArr = c9591hA0.f28293a;
        this.f42227e = new C0683Kq(bArr, bArr.length);
    }

    /* renamed from: a */
    public final int m24599a(C7000vF c7000vF) throws EOFException, InterruptedIOException {
        int i = 0;
        while (true) {
            C9591hA0 c9591hA0 = this.f42226d;
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
        if (this.f42230h == -1) {
            this.f42230h = i;
        }
        return i;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo738d(p000.InterfaceC1475XR r19, p000.C1164SV r20) throws p000.C10103lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6799s3.mo738d(XR, SV):int");
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) throws EOFException, InterruptedIOException {
        C7000vF c7000vF = (C7000vF) interfaceC1475XR;
        int iM24599a = m24599a(c7000vF);
        int i = iM24599a;
        int i2 = 0;
        int i3 = 0;
        do {
            C9591hA0 c9591hA0 = this.f42226d;
            c7000vF.mo3620f(c9591hA0.f28293a, 0, 2, false);
            c9591hA0.m18741G(0);
            if ((c9591hA0.m18735A() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                c7000vF.mo3620f(c9591hA0.f28293a, 0, 4, false);
                C0683Kq c0683Kq = this.f42227e;
                c0683Kq.m4760t(14);
                int iM4752l = c0683Kq.m4752l(13);
                if (iM4752l <= 6) {
                    i++;
                    c7000vF.f44297f = 0;
                    c7000vF.m25375a(i, false);
                } else {
                    c7000vF.m25375a(iM4752l - 6, false);
                    i3 += iM4752l;
                }
            } else {
                i++;
                c7000vF.f44297f = 0;
                c7000vF.m25375a(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iM24599a < 8192);
        return false;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        this.f42233k = false;
        this.f42224b.mo9103c();
        this.f42229g = j2;
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
        this.f42228f = interfaceC1538YR;
        this.f42224b.mo9104d(interfaceC1538YR, new YM0(0, 1));
        interfaceC1538YR.mo2003p();
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
    }
}
