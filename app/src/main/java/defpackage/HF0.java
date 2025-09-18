package defpackage;

/* loaded from: classes2.dex */
public final class HF0 extends AbstractC7518v00 {
    public int d;
    public int e;
    public int f;
    public AF0 g;
    public int h;
    public AF0 i;
    public int j;

    public final Object clone() {
        HF0 hf0 = new HF0();
        AF0 af0 = AF0.t;
        hf0.g = af0;
        hf0.i = af0;
        hf0.m(l());
        return hf0;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        IF0 if0L = l();
        if (if0L.e()) {
            return if0L;
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
            xd0 r1 = defpackage.IF0.m     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            IF0 r1 = new IF0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.m(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            IF0 r4 = (defpackage.IF0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.HF0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        m((IF0) a00);
        return this;
    }

    public final IF0 l() {
        IF0 if0 = new IF0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        if0.d = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        if0.e = this.f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        if0.f = this.g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        if0.g = this.h;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        if0.h = this.i;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        if0.i = this.j;
        if0.c = i2;
        return if0;
    }

    public final void m(IF0 if0) {
        AF0 af0;
        AF0 af02;
        if (if0 == IF0.l) {
            return;
        }
        int i = if0.c;
        if ((i & 1) == 1) {
            int i2 = if0.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = if0.e;
            this.d = 2 | this.d;
            this.f = i3;
        }
        if ((i & 4) == 4) {
            AF0 af03 = if0.f;
            if ((this.d & 4) != 4 || (af02 = this.g) == AF0.t) {
                this.g = af03;
            } else {
                C8327zF0 c8327zF0R = AF0.r(af02);
                c8327zF0R.n(af03);
                this.g = c8327zF0R.l();
            }
            this.d |= 4;
        }
        int i4 = if0.c;
        if ((i4 & 8) == 8) {
            int i5 = if0.g;
            this.d = 8 | this.d;
            this.h = i5;
        }
        if ((i4 & 16) == 16) {
            AF0 af04 = if0.h;
            if ((this.d & 16) != 16 || (af0 = this.i) == AF0.t) {
                this.i = af04;
            } else {
                C8327zF0 c8327zF0R2 = AF0.r(af0);
                c8327zF0R2.n(af04);
                this.i = c8327zF0R2.l();
            }
            this.d |= 16;
        }
        if ((if0.c & 32) == 32) {
            int i6 = if0.i;
            this.d = 32 | this.d;
            this.j = i6;
        }
        k(if0);
        this.a = this.a.d(if0.b);
    }
}
