package p000;

import android.os.Handler;

/* loaded from: classes.dex */
public final class KB0 implements InterfaceC8357Ub1 {

    /* renamed from: a */
    public final C8988cV0 f5931a;

    /* renamed from: b */
    public final C0827N8 f5932b = new C0827N8(12, false);

    /* renamed from: c */
    public final C7816Jr0 f5933c = new C7816Jr0(1);

    /* renamed from: d */
    public long f5934d = -9223372036854775807L;

    /* renamed from: e */
    public final /* synthetic */ LB0 f5935e;

    public KB0(LB0 lb0, C6224jE c6224jE) {
        this.f5935e = lb0;
        this.f5931a = new C8988cV0(c6224jE, null, null);
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: a */
    public final void mo960a(long j, int i, int i2, int i3, C8305Tb1 c8305Tb1) {
        long jM10723h;
        long jM1805T;
        this.f5931a.mo960a(j, i, i2, i3, c8305Tb1);
        while (this.f5931a.m10737w(false)) {
            C7816Jr0 c7816Jr0 = this.f5933c;
            c7816Jr0.mo7722t();
            if (this.f5931a.m10716B(this.f5932b, c7816Jr0, 0, false) == -4) {
                c7816Jr0.m9507w();
            } else {
                c7816Jr0 = null;
            }
            if (c7816Jr0 != null) {
                long j2 = c7816Jr0.f14800g;
                C7660Gr0 c7660Gr0M22215b = this.f5935e.f6537c.m22215b(c7816Jr0);
                if (c7660Gr0M22215b != null) {
                    C0719LP c0719lp = (C0719LP) c7660Gr0M22215b.f3928a[0];
                    String str = c0719lp.f6622a;
                    String str2 = c0719lp.f6623b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jM1805T = AbstractC7485Dh1.m1805T(AbstractC7485Dh1.m1830o(c0719lp.f6626e));
                        } catch (C10103lA0 unused) {
                            jM1805T = -9223372036854775807L;
                        }
                        if (jM1805T != -9223372036854775807L) {
                            JB0 jb0 = new JB0(j2, jM1805T);
                            Handler handler = this.f5935e.f6538d;
                            handler.sendMessage(handler.obtainMessage(1, jb0));
                        }
                    }
                }
            }
        }
        C8988cV0 c8988cV0 = this.f5931a;
        ZU0 zu0 = c8988cV0.f17547a;
        synchronized (c8988cV0) {
            int i4 = c8988cV0.f17565s;
            jM10723h = i4 == 0 ? -1L : c8988cV0.m10723h(i4);
        }
        zu0.m9535b(jM10723h);
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: b */
    public final void mo961b(C9591hA0 c9591hA0, int i, int i2) {
        C8988cV0 c8988cV0 = this.f5931a;
        c8988cV0.getClass();
        c8988cV0.mo961b(c9591hA0, i, 0);
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: c */
    public final int mo962c(InterfaceC1082RC interfaceC1082RC, int i, boolean z) {
        C8988cV0 c8988cV0 = this.f5931a;
        c8988cV0.getClass();
        return c8988cV0.mo962c(interfaceC1082RC, i, z);
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: d */
    public final void mo963d(int i, C9591hA0 c9591hA0) {
        mo961b(c9591hA0, i, 0);
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: e */
    public final int mo964e(InterfaceC1082RC interfaceC1082RC, int i, boolean z) {
        return mo962c(interfaceC1082RC, i, z);
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: f */
    public final void mo965f(C6686qX c6686qX) {
        this.f5931a.mo965f(c6686qX);
    }
}
