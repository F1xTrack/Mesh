package p000;

import java.util.List;

/* renamed from: hf */
/* loaded from: classes.dex */
public final class C4193hf implements InterfaceC1412WR {

    /* renamed from: a */
    public final C9591hA0 f28501a;

    /* renamed from: b */
    public final C7112x1 f28502b;

    /* renamed from: c */
    public final boolean f28503c;

    /* renamed from: d */
    public final C7408Bv0 f28504d;

    /* renamed from: e */
    public int f28505e;

    /* renamed from: f */
    public InterfaceC1538YR f28506f;

    /* renamed from: g */
    public C4256if f28507g;

    /* renamed from: h */
    public long f28508h;

    /* renamed from: i */
    public C1249Tr[] f28509i;

    /* renamed from: j */
    public long f28510j;

    /* renamed from: k */
    public C1249Tr f28511k;

    /* renamed from: l */
    public int f28512l;

    /* renamed from: m */
    public long f28513m;

    /* renamed from: n */
    public long f28514n;

    /* renamed from: o */
    public int f28515o;

    /* renamed from: p */
    public boolean f28516p;

    public C4193hf(int i, C7408Bv0 c7408Bv0) {
        this.f28504d = c7408Bv0;
        this.f28503c = (i & 1) == 0;
        this.f28501a = new C9591hA0(12);
        this.f28502b = new C7112x1();
        this.f28506f = new C11370v32(17);
        this.f28509i = new C1249Tr[0];
        this.f28513m = -1L;
        this.f28514n = -1L;
        this.f28512l = -1;
        this.f28508h = -9223372036854775807L;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:264:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0379  */
    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo738d(p000.InterfaceC1475XR r29, p000.C1164SV r30) throws p000.C10103lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4193hf.mo738d(XR, SV):int");
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) {
        C9591hA0 c9591hA0 = this.f28501a;
        ((C7000vF) interfaceC1475XR).mo3620f(c9591hA0.f28293a, 0, 12, false);
        c9591hA0.m18741G(0);
        if (c9591hA0.m18751i() != 1179011410) {
            return false;
        }
        c9591hA0.m18742H(4);
        return c9591hA0.m18751i() == 541677121;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        this.f28510j = -1L;
        this.f28511k = null;
        for (C1249Tr c1249Tr : this.f28509i) {
            if (c1249Tr.f11561j == 0) {
                c1249Tr.f11559h = 0;
            } else {
                c1249Tr.f11559h = c1249Tr.f11563l[AbstractC7485Dh1.m1821f(c1249Tr.f11562k, j, true)];
            }
        }
        if (j != 0) {
            this.f28505e = 6;
        } else if (this.f28509i.length == 0) {
            this.f28505e = 0;
        } else {
            this.f28505e = 3;
        }
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
        this.f28505e = 0;
        if (this.f28503c) {
            interfaceC1538YR = new C10189lr0(interfaceC1538YR, this.f28504d);
        }
        this.f28506f = interfaceC1538YR;
        this.f28510j = -1L;
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
    }
}
