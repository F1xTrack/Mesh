package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: dc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9135dc0 implements InterfaceC1412WR {

    /* renamed from: b */
    public InterfaceC1538YR f26152b;

    /* renamed from: c */
    public int f26153c;

    /* renamed from: d */
    public int f26154d;

    /* renamed from: e */
    public int f26155e;

    /* renamed from: g */
    public C8390Us0 f26157g;

    /* renamed from: h */
    public C7000vF f26158h;

    /* renamed from: i */
    public C0495Hr f26159i;

    /* renamed from: j */
    public C8650Zs0 f26160j;

    /* renamed from: a */
    public final C9591hA0 f26151a = new C9591hA0(6);

    /* renamed from: f */
    public long f26156f = -1;

    /* renamed from: a */
    public final void m17711a() {
        InterfaceC1538YR interfaceC1538YR = this.f26152b;
        interfaceC1538YR.getClass();
        interfaceC1538YR.mo2003p();
        this.f26152b.mo2006x(new C4130gf(-9223372036854775807L));
        this.f26153c = 6;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo738d(p000.InterfaceC1475XR r26, p000.C1164SV r27) throws p000.C10103lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9135dc0.mo738d(XR, SV):int");
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) throws EOFException, InterruptedIOException {
        C7000vF c7000vF = (C7000vF) interfaceC1475XR;
        C9591hA0 c9591hA0 = this.f26151a;
        c9591hA0.m18738D(2);
        c7000vF.mo3620f(c9591hA0.f28293a, 0, 2, false);
        if (c9591hA0.m18735A() != 65496) {
            return false;
        }
        c9591hA0.m18738D(2);
        c7000vF.mo3620f(c9591hA0.f28293a, 0, 2, false);
        int iM18735A = c9591hA0.m18735A();
        this.f26154d = iM18735A;
        if (iM18735A == 65504) {
            c9591hA0.m18738D(2);
            c7000vF.mo3620f(c9591hA0.f28293a, 0, 2, false);
            c7000vF.m25375a(c9591hA0.m18735A() - 2, false);
            c9591hA0.m18738D(2);
            c7000vF.mo3620f(c9591hA0.f28293a, 0, 2, false);
            this.f26154d = c9591hA0.m18735A();
        }
        if (this.f26154d != 65505) {
            return false;
        }
        c7000vF.m25375a(2, false);
        c9591hA0.m18738D(6);
        c7000vF.mo3620f(c9591hA0.f28293a, 0, 6, false);
        return c9591hA0.m18765w() == 1165519206 && c9591hA0.m18735A() == 0;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        if (j == 0) {
            this.f26153c = 0;
            this.f26160j = null;
        } else if (this.f26153c == 5) {
            C8650Zs0 c8650Zs0 = this.f26160j;
            c8650Zs0.getClass();
            c8650Zs0.mo740g(j, j2);
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
        this.f26152b = interfaceC1538YR;
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
        C8650Zs0 c8650Zs0 = this.f26160j;
        if (c8650Zs0 != null) {
            c8650Zs0.getClass();
        }
    }
}
