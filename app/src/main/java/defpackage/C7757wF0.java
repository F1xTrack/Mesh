package defpackage;

/* renamed from: wF0 */
/* loaded from: classes2.dex */
public final class C7757wF0 extends AbstractC6754r00 implements InterfaceC6917rr0 {
    public int b;
    public EnumC7947xF0 c;
    public AF0 d;
    public int e;

    public static C7757wF0 l() {
        C7757wF0 c7757wF0 = new C7757wF0();
        c7757wF0.c = EnumC7947xF0.INV;
        c7757wF0.d = AF0.t;
        return c7757wF0;
    }

    public final Object clone() {
        C7757wF0 c7757wF0L = l();
        c7757wF0L.m(k());
        return c7757wF0L;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        C8137yF0 c8137yF0K = k();
        if (c8137yF0K.e()) {
            return c8137yF0K;
        }
        throw new C7074sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x001b  */
    @Override // defpackage.AbstractC6754r00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC6754r00 i(defpackage.C5780lu r3, defpackage.DR r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            xd0 r1 = defpackage.C8137yF0.i     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            yF0 r1 = new yF0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.m(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            yF0 r4 = (defpackage.C8137yF0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7757wF0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        m((C8137yF0) a00);
        return this;
    }

    public final C8137yF0 k() {
        C8137yF0 c8137yF0 = new C8137yF0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c8137yF0.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c8137yF0.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c8137yF0.e = this.e;
        c8137yF0.b = i2;
        return c8137yF0;
    }

    public final void m(C8137yF0 c8137yF0) {
        AF0 af0;
        if (c8137yF0 == C8137yF0.h) {
            return;
        }
        if ((c8137yF0.b & 1) == 1) {
            EnumC7947xF0 enumC7947xF0 = c8137yF0.c;
            enumC7947xF0.getClass();
            this.b = 1 | this.b;
            this.c = enumC7947xF0;
        }
        if ((c8137yF0.b & 2) == 2) {
            AF0 af02 = c8137yF0.d;
            if ((this.b & 2) != 2 || (af0 = this.d) == AF0.t) {
                this.d = af02;
            } else {
                C8327zF0 c8327zF0R = AF0.r(af0);
                c8327zF0R.n(af02);
                this.d = c8327zF0R.l();
            }
            this.b |= 2;
        }
        if ((c8137yF0.b & 4) == 4) {
            int i = c8137yF0.e;
            this.b = 4 | this.b;
            this.e = i;
        }
        this.a = this.a.d(c8137yF0.a);
    }
}
