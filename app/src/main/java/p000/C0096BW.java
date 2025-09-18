package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: BW */
/* loaded from: classes.dex */
public final class C0096BW implements InterfaceC1412WR {

    /* renamed from: a */
    public final C9591hA0 f848a = new C9591hA0(4);

    /* renamed from: b */
    public final C9591hA0 f849b = new C9591hA0(9);

    /* renamed from: c */
    public final C9591hA0 f850c = new C9591hA0(11);

    /* renamed from: d */
    public final C9591hA0 f851d = new C9591hA0();

    /* renamed from: e */
    public final IW0 f852e;

    /* renamed from: f */
    public InterfaceC1538YR f853f;

    /* renamed from: g */
    public int f854g;

    /* renamed from: h */
    public boolean f855h;

    /* renamed from: i */
    public long f856i;

    /* renamed from: j */
    public int f857j;

    /* renamed from: k */
    public int f858k;

    /* renamed from: l */
    public int f859l;

    /* renamed from: m */
    public long f860m;

    /* renamed from: n */
    public boolean f861n;

    /* renamed from: o */
    public C0918Oa f862o;

    /* renamed from: p */
    public C8425Vj1 f863p;

    public C0096BW() {
        IW0 iw0 = new IW0(11, new C1404WJ());
        iw0.f4968c = -9223372036854775807L;
        iw0.f4969d = new long[0];
        iw0.f4970e = new long[0];
        this.f852e = iw0;
        this.f854g = 1;
    }

    /* renamed from: a */
    public final C9591hA0 m736a(C7000vF c7000vF) throws EOFException, InterruptedIOException {
        int i = this.f859l;
        C9591hA0 c9591hA0 = this.f851d;
        byte[] bArr = c9591hA0.f28293a;
        if (i > bArr.length) {
            c9591hA0.m18739E(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            c9591hA0.m18741G(0);
        }
        c9591hA0.m18740F(this.f859l);
        c7000vF.mo3618b(c9591hA0.f28293a, 0, this.f859l, false);
        return c9591hA0;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0378 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0273  */
    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo738d(p000.InterfaceC1475XR r30, p000.C1164SV r31) throws p000.C10103lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0096BW.mo738d(XR, SV):int");
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) throws EOFException, InterruptedIOException {
        C9591hA0 c9591hA0 = this.f848a;
        C7000vF c7000vF = (C7000vF) interfaceC1475XR;
        c7000vF.mo3620f(c9591hA0.f28293a, 0, 3, false);
        c9591hA0.m18741G(0);
        if (c9591hA0.m18766x() != 4607062) {
            return false;
        }
        c7000vF.mo3620f(c9591hA0.f28293a, 0, 2, false);
        c9591hA0.m18741G(0);
        if ((c9591hA0.m18735A() & 250) != 0) {
            return false;
        }
        c7000vF.mo3620f(c9591hA0.f28293a, 0, 4, false);
        c9591hA0.m18741G(0);
        int iM18749g = c9591hA0.m18749g();
        c7000vF.f44297f = 0;
        c7000vF.m25375a(iM18749g, false);
        c7000vF.mo3620f(c9591hA0.f28293a, 0, 4, false);
        c9591hA0.m18741G(0);
        return c9591hA0.m18749g() == 0;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        if (j == 0) {
            this.f854g = 1;
            this.f855h = false;
        } else {
            this.f854g = 3;
        }
        this.f857j = 0;
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
        this.f853f = interfaceC1538YR;
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
    }
}
