package defpackage;

/* renamed from: cF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2479cF0 extends AbstractC7518v00 {
    public int d;
    public int e;

    public final Object clone() {
        C2479cF0 c2479cF0 = new C2479cF0();
        C3355dF0 c3355dF0 = new C3355dF0(this);
        int i = (this.d & 1) != 1 ? 0 : 1;
        c3355dF0.d = this.e;
        c3355dF0.c = i;
        c2479cF0.l(c3355dF0);
        return c2479cF0;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        C3355dF0 c3355dF0 = new C3355dF0(this);
        int i = (this.d & 1) != 1 ? 0 : 1;
        c3355dF0.d = this.e;
        c3355dF0.c = i;
        if (c3355dF0.e()) {
            return c3355dF0;
        }
        throw new C7074sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // defpackage.AbstractC6754r00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC6754r00 i(defpackage.C5780lu r3, defpackage.DR r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            xd0 r1 = defpackage.C3355dF0.h     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            dF0 r1 = new dF0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.l(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            dF0 r4 = (defpackage.C3355dF0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.l(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2479cF0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        l((C3355dF0) a00);
        return this;
    }

    public final void l(C3355dF0 c3355dF0) {
        if (c3355dF0 == C3355dF0.g) {
            return;
        }
        if ((c3355dF0.c & 1) == 1) {
            int i = c3355dF0.d;
            this.d = 1 | this.d;
            this.e = i;
        }
        k(c3355dF0);
        this.a = this.a.d(c3355dF0.b);
    }
}
