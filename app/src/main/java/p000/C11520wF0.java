package p000;

/* renamed from: wF0 */
/* loaded from: classes2.dex */
public final class C11520wF0 extends AbstractC10847r00 implements InterfaceC10957rr0 {

    /* renamed from: b */
    public int f44732b;

    /* renamed from: c */
    public EnumC11647xF0 f44733c;

    /* renamed from: d */
    public AF0 f44734d;

    /* renamed from: e */
    public int f44735e;

    /* renamed from: l */
    public static C11520wF0 m25578l() {
        C11520wF0 c11520wF0 = new C11520wF0();
        c11520wF0.f44733c = EnumC11647xF0.INV;
        c11520wF0.f44734d = AF0.f123t;
        return c11520wF0;
    }

    public final Object clone() {
        C11520wF0 c11520wF0M25578l = m25578l();
        c11520wF0M25578l.m25580m(m25579k());
        return c11520wF0M25578l;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        C11774yF0 c11774yF0M25579k = m25579k();
        if (c11774yF0M25579k.mo131e()) {
            return c11774yF0M25579k;
        }
        throw new C6838sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x001b  */
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
            xd0 r1 = p000.C11774yF0.f46150i     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            yF0 r1 = new yF0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m25580m(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            yF0 r4 = (p000.C11774yF0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m25580m(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11520wF0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m25580m((C11774yF0) a00);
        return this;
    }

    /* renamed from: k */
    public final C11774yF0 m25579k() {
        C11774yF0 c11774yF0 = new C11774yF0(this);
        int i = this.f44732b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c11774yF0.f46153c = this.f44733c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c11774yF0.f46154d = this.f44734d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c11774yF0.f46155e = this.f44735e;
        c11774yF0.f46152b = i2;
        return c11774yF0;
    }

    /* renamed from: m */
    public final void m25580m(C11774yF0 c11774yF0) {
        AF0 af0;
        if (c11774yF0 == C11774yF0.f46149h) {
            return;
        }
        if ((c11774yF0.f46152b & 1) == 1) {
            EnumC11647xF0 enumC11647xF0 = c11774yF0.f46153c;
            enumC11647xF0.getClass();
            this.f44732b = 1 | this.f44732b;
            this.f44733c = enumC11647xF0;
        }
        if ((c11774yF0.f46152b & 2) == 2) {
            AF0 af02 = c11774yF0.f46154d;
            if ((this.f44732b & 2) != 2 || (af0 = this.f44734d) == AF0.f123t) {
                this.f44734d = af02;
            } else {
                C11901zF0 c11901zF0M126r = AF0.m126r(af0);
                c11901zF0M126r.m26352n(af02);
                this.f44734d = c11901zF0M126r.m26351l();
            }
            this.f44732b |= 2;
        }
        if ((c11774yF0.f46152b & 4) == 4) {
            int i = c11774yF0.f46155e;
            this.f44732b = 4 | this.f44732b;
            this.f44735e = i;
        }
        this.f41281a = this.f41281a.m3573d(c11774yF0.f46151a);
    }
}
