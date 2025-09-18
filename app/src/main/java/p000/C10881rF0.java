package p000;

/* renamed from: rF0 */
/* loaded from: classes2.dex */
public final class C10881rF0 extends AbstractC10847r00 implements InterfaceC10957rr0 {

    /* renamed from: b */
    public int f41397b;

    /* renamed from: c */
    public int f41398c;

    /* renamed from: d */
    public int f41399d;

    /* renamed from: e */
    public EnumC11009sF0 f41400e;

    /* renamed from: l */
    public static C10881rF0 m24243l() {
        C10881rF0 c10881rF0 = new C10881rF0();
        c10881rF0.f41398c = -1;
        c10881rF0.f41400e = EnumC11009sF0.PACKAGE;
        return c10881rF0;
    }

    public final Object clone() {
        C10881rF0 c10881rF0M24243l = m24243l();
        c10881rF0M24243l.m24245m(m24244k());
        return c10881rF0M24243l;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        C11137tF0 c11137tF0M24244k = m24244k();
        if (c11137tF0M24244k.mo131e()) {
            return c11137tF0M24244k;
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
    public final p000.AbstractC10847r00 mo567i(p000.C6392lu r2, p000.C0217DR r3) throws java.lang.Throwable {
        /*
            r1 = this;
            r3 = 0
            xd0 r0 = p000.C11137tF0.f42964i     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            tF0 r0 = new tF0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.m24245m(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            K0 r0 = r2.f14178a     // Catch: java.lang.Throwable -> Lf
            tF0 r0 = (p000.C11137tF0) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.m24245m(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10881rF0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m24245m((C11137tF0) a00);
        return this;
    }

    /* renamed from: k */
    public final C11137tF0 m24244k() {
        C11137tF0 c11137tF0 = new C11137tF0(this);
        int i = this.f41397b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c11137tF0.f42967c = this.f41398c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c11137tF0.f42968d = this.f41399d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c11137tF0.f42969e = this.f41400e;
        c11137tF0.f42966b = i2;
        return c11137tF0;
    }

    /* renamed from: m */
    public final void m24245m(C11137tF0 c11137tF0) {
        if (c11137tF0 == C11137tF0.f42963h) {
            return;
        }
        int i = c11137tF0.f42966b;
        if ((i & 1) == 1) {
            int i2 = c11137tF0.f42967c;
            this.f41397b = 1 | this.f41397b;
            this.f41398c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c11137tF0.f42968d;
            this.f41397b = 2 | this.f41397b;
            this.f41399d = i3;
        }
        if ((i & 4) == 4) {
            EnumC11009sF0 enumC11009sF0 = c11137tF0.f42969e;
            enumC11009sF0.getClass();
            this.f41397b = 4 | this.f41397b;
            this.f41400e = enumC11009sF0;
        }
        this.f41281a = this.f41281a.m3573d(c11137tF0.f42965a);
    }
}
