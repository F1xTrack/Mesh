package defpackage;

/* renamed from: yd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8209yd0 extends AbstractC6754r00 implements InterfaceC6917rr0 {
    public final /* synthetic */ int b;
    public int c;
    public int d;
    public int e;

    public /* synthetic */ C8209yd0(int i) {
        this.b = i;
    }

    public final Object clone() {
        switch (this.b) {
            case 0:
                C8209yd0 c8209yd0 = new C8209yd0(0);
                c8209yd0.m(k());
                return c8209yd0;
            default:
                C8209yd0 c8209yd02 = new C8209yd0(1);
                c8209yd02.n(l());
                return c8209yd02;
        }
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        switch (this.b) {
            case 0:
                C8399zd0 c8399zd0K = k();
                if (c8399zd0K.e()) {
                    return c8399zd0K;
                }
                throw new C7074sg();
            default:
                C0030Ad0 c0030Ad0L = l();
                if (c0030Ad0L.e()) {
                    return c0030Ad0L;
                }
                throw new C7074sg();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    @Override // defpackage.AbstractC6754r00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC6754r00 i(defpackage.C5780lu r2, defpackage.DR r3) throws java.lang.Throwable {
        /*
            r1 = this;
            int r3 = r1.b
            switch(r3) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r3 = 0
            xd0 r0 = defpackage.C0030Ad0.h     // Catch: java.lang.Throwable -> L14 defpackage.Y90 -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 defpackage.Y90 -> L16
            Ad0 r0 = new Ad0     // Catch: java.lang.Throwable -> L14 defpackage.Y90 -> L16
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L14 defpackage.Y90 -> L16
            r1.n(r0)
            return r1
        L14:
            r2 = move-exception
            goto L1e
        L16:
            r2 = move-exception
            K0 r0 = r2.a     // Catch: java.lang.Throwable -> L14
            Ad0 r0 = (defpackage.C0030Ad0) r0     // Catch: java.lang.Throwable -> L14
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            r2 = move-exception
            r3 = r0
        L1e:
            if (r3 == 0) goto L23
            r1.n(r3)
        L23:
            throw r2
        L24:
            r3 = 0
            xd0 r0 = defpackage.C8399zd0.h     // Catch: java.lang.Throwable -> L33 defpackage.Y90 -> L35
            r0.getClass()     // Catch: java.lang.Throwable -> L33 defpackage.Y90 -> L35
            zd0 r0 = new zd0     // Catch: java.lang.Throwable -> L33 defpackage.Y90 -> L35
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L33 defpackage.Y90 -> L35
            r1.m(r0)
            return r1
        L33:
            r2 = move-exception
            goto L3d
        L35:
            r2 = move-exception
            K0 r0 = r2.a     // Catch: java.lang.Throwable -> L33
            zd0 r0 = (defpackage.C8399zd0) r0     // Catch: java.lang.Throwable -> L33
            throw r2     // Catch: java.lang.Throwable -> L3b
        L3b:
            r2 = move-exception
            r3 = r0
        L3d:
            if (r3 == 0) goto L42
            r1.m(r3)
        L42:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8209yd0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        switch (this.b) {
            case 0:
                m((C8399zd0) a00);
                break;
            default:
                n((C0030Ad0) a00);
                break;
        }
        return this;
    }

    public C8399zd0 k() {
        C8399zd0 c8399zd0 = new C8399zd0(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c8399zd0.c = this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c8399zd0.d = this.e;
        c8399zd0.b = i2;
        return c8399zd0;
    }

    public C0030Ad0 l() {
        C0030Ad0 c0030Ad0 = new C0030Ad0(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c0030Ad0.c = this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c0030Ad0.d = this.e;
        c0030Ad0.b = i2;
        return c0030Ad0;
    }

    public void m(C8399zd0 c8399zd0) {
        if (c8399zd0 == C8399zd0.g) {
            return;
        }
        int i = c8399zd0.b;
        if ((i & 1) == 1) {
            int i2 = c8399zd0.c;
            this.c = 1 | this.c;
            this.d = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c8399zd0.d;
            this.c = 2 | this.c;
            this.e = i3;
        }
        this.a = this.a.d(c8399zd0.a);
    }

    public void n(C0030Ad0 c0030Ad0) {
        if (c0030Ad0 == C0030Ad0.g) {
            return;
        }
        int i = c0030Ad0.b;
        if ((i & 1) == 1) {
            int i2 = c0030Ad0.c;
            this.c = 1 | this.c;
            this.d = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c0030Ad0.d;
            this.c = 2 | this.c;
            this.e = i3;
        }
        this.a = this.a.d(c0030Ad0.a);
    }
}
