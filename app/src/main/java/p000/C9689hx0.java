package p000;

import java.util.List;

/* renamed from: hx0 */
/* loaded from: classes.dex */
public final class C9689hx0 implements InterfaceC1412WR {

    /* renamed from: a */
    public InterfaceC1538YR f28692a;

    /* renamed from: b */
    public AbstractC9582h51 f28693b;

    /* renamed from: c */
    public boolean f28694c;

    /* renamed from: a */
    public final boolean m18929a(C7000vF c7000vF) {
        boolean zM7862e;
        C10073kx0 c10073kx0 = new C10073kx0();
        if (c10073kx0.m22318a(c7000vF, true) && (c10073kx0.f36767a & 2) == 2) {
            int iMin = Math.min(c10073kx0.f36771e, 8);
            C9591hA0 c9591hA0 = new C9591hA0(iMin);
            c7000vF.mo3620f(c9591hA0.f28293a, 0, iMin, false);
            c9591hA0.m18741G(0);
            if (c9591hA0.m18743a() >= 5 && c9591hA0.m18763u() == 127 && c9591hA0.m18765w() == 1179402563) {
                this.f28693b = new C1227TV();
            } else {
                c9591hA0.m18741G(0);
                try {
                    zM7862e = U02.m7862e(1, c9591hA0, true);
                } catch (C10103lA0 unused) {
                    zM7862e = false;
                }
                if (zM7862e) {
                    this.f28693b = new C10052km1();
                } else {
                    c9591hA0.m18741G(0);
                    if (C7934Ly0.m5170e(c9591hA0, C7934Ly0.f6945o)) {
                        this.f28693b = new C7934Ly0();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0182  */
    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo738d(p000.InterfaceC1475XR r21, p000.C1164SV r22) throws p000.C10103lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9689hx0.mo738d(XR, SV):int");
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) {
        try {
            return m18929a((C7000vF) interfaceC1475XR);
        } catch (C10103lA0 unused) {
            return false;
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        AbstractC9582h51 abstractC9582h51 = this.f28693b;
        if (abstractC9582h51 != null) {
            C9945jx0 c9945jx0 = abstractC9582h51.f28246a;
            C10073kx0 c10073kx0 = c9945jx0.f35456a;
            c10073kx0.f36767a = 0;
            c10073kx0.f36768b = 0L;
            c10073kx0.f36769c = 0;
            c10073kx0.f36770d = 0;
            c10073kx0.f36771e = 0;
            c9945jx0.f35457b.m18738D(0);
            c9945jx0.f35458c = -1;
            c9945jx0.f35460e = false;
            if (j == 0) {
                abstractC9582h51.mo5173d(!abstractC9582h51.f28257l);
                return;
            }
            if (abstractC9582h51.f28253h != 0) {
                long j3 = (abstractC9582h51.f28254i * j2) / 1000000;
                abstractC9582h51.f28250e = j3;
                InterfaceC10201lx0 interfaceC10201lx0 = abstractC9582h51.f28249d;
                int i = AbstractC7485Dh1.f2166a;
                interfaceC10201lx0.mo1938d(j3);
                abstractC9582h51.f28253h = 2;
            }
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
        this.f28692a = interfaceC1538YR;
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
    }
}
