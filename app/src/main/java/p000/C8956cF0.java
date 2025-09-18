package p000;

/* renamed from: cF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8956cF0 extends AbstractC11359v00 {

    /* renamed from: d */
    public int f17395d;

    /* renamed from: e */
    public int f17396e;

    public final Object clone() {
        C8956cF0 c8956cF0 = new C8956cF0();
        C9089dF0 c9089dF0 = new C9089dF0(this);
        int i = (this.f17395d & 1) != 1 ? 0 : 1;
        c9089dF0.f25901d = this.f17396e;
        c9089dF0.f25900c = i;
        c8956cF0.m10629l(c9089dF0);
        return c8956cF0;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        C9089dF0 c9089dF0 = new C9089dF0(this);
        int i = (this.f17395d & 1) != 1 ? 0 : 1;
        c9089dF0.f25901d = this.f17396e;
        c9089dF0.f25900c = i;
        if (c9089dF0.mo131e()) {
            return c9089dF0;
        }
        throw new C6838sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p000.AbstractC10847r00
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.AbstractC10847r00 mo567i(p000.C6392lu r3, p000.C0217DR r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            xd0 r1 = p000.C9089dF0.f25898h     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            dF0 r1 = new dF0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m10629l(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            dF0 r4 = (p000.C9089dF0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m10629l(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8956cF0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m10629l((C9089dF0) a00);
        return this;
    }

    /* renamed from: l */
    public final void m10629l(C9089dF0 c9089dF0) {
        if (c9089dF0 == C9089dF0.f25897g) {
            return;
        }
        if ((c9089dF0.f25900c & 1) == 1) {
            int i = c9089dF0.f25901d;
            this.f17395d = 1 | this.f17395d;
            this.f17396e = i;
        }
        m25292k(c9089dF0);
        this.f41281a = this.f41281a.m3573d(c9089dF0.f25899b);
    }
}
