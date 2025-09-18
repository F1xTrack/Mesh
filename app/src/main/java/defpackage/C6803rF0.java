package defpackage;

/* renamed from: rF0 */
/* loaded from: classes2.dex */
public final class C6803rF0 extends AbstractC6754r00 implements InterfaceC6917rr0 {
    public int b;
    public int c;
    public int d;
    public EnumC6994sF0 e;

    public static C6803rF0 l() {
        C6803rF0 c6803rF0 = new C6803rF0();
        c6803rF0.c = -1;
        c6803rF0.e = EnumC6994sF0.PACKAGE;
        return c6803rF0;
    }

    public final Object clone() {
        C6803rF0 c6803rF0L = l();
        c6803rF0L.m(k());
        return c6803rF0L;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        C7185tF0 c7185tF0K = k();
        if (c7185tF0K.e()) {
            return c7185tF0K;
        }
        throw new C7074sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x001b  */
    @Override // defpackage.AbstractC6754r00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC6754r00 i(defpackage.C5780lu r2, defpackage.DR r3) throws java.lang.Throwable {
        /*
            r1 = this;
            r3 = 0
            xd0 r0 = defpackage.C7185tF0.i     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            tF0 r0 = new tF0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.m(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            K0 r0 = r2.a     // Catch: java.lang.Throwable -> Lf
            tF0 r0 = (defpackage.C7185tF0) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.m(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6803rF0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        m((C7185tF0) a00);
        return this;
    }

    public final C7185tF0 k() {
        C7185tF0 c7185tF0 = new C7185tF0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c7185tF0.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c7185tF0.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c7185tF0.e = this.e;
        c7185tF0.b = i2;
        return c7185tF0;
    }

    public final void m(C7185tF0 c7185tF0) {
        if (c7185tF0 == C7185tF0.h) {
            return;
        }
        int i = c7185tF0.b;
        if ((i & 1) == 1) {
            int i2 = c7185tF0.c;
            this.b = 1 | this.b;
            this.c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c7185tF0.d;
            this.b = 2 | this.b;
            this.d = i3;
        }
        if ((i & 4) == 4) {
            EnumC6994sF0 enumC6994sF0 = c7185tF0.e;
            enumC6994sF0.getClass();
            this.b = 4 | this.b;
            this.e = enumC6994sF0;
        }
        this.a = this.a.d(c7185tF0.a);
    }
}
