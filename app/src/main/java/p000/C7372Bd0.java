package p000;

/* renamed from: Bd0 */
/* loaded from: classes2.dex */
public final class C7372Bd0 extends AbstractC10847r00 implements InterfaceC10957rr0 {

    /* renamed from: b */
    public int f952b;

    /* renamed from: c */
    public C11949zd0 f953c;

    /* renamed from: d */
    public C7320Ad0 f954d;

    /* renamed from: e */
    public C7320Ad0 f955e;

    /* renamed from: f */
    public C7320Ad0 f956f;

    /* renamed from: g */
    public C7320Ad0 f957g;

    /* renamed from: l */
    public static C7372Bd0 m780l() {
        C7372Bd0 c7372Bd0 = new C7372Bd0();
        c7372Bd0.f953c = C11949zd0.f46909g;
        C7320Ad0 c7320Ad0 = C7320Ad0.f289g;
        c7372Bd0.f954d = c7320Ad0;
        c7372Bd0.f955e = c7320Ad0;
        c7372Bd0.f956f = c7320Ad0;
        c7372Bd0.f957g = c7320Ad0;
        return c7372Bd0;
    }

    public final Object clone() {
        C7372Bd0 c7372Bd0M780l = m780l();
        c7372Bd0M780l.m782m(m781k());
        return c7372Bd0M780l;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        C7424Cd0 c7424Cd0M781k = m781k();
        if (c7424Cd0M781k.mo131e()) {
            return c7424Cd0M781k;
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
            xd0 r1 = p000.C7424Cd0.f1494k     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            Cd0 r1 = new Cd0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m782m(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            Cd0 r4 = (p000.C7424Cd0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m782m(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7372Bd0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m782m((C7424Cd0) a00);
        return this;
    }

    /* renamed from: k */
    public final C7424Cd0 m781k() {
        C7424Cd0 c7424Cd0 = new C7424Cd0(this);
        int i = this.f952b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c7424Cd0.f1497c = this.f953c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c7424Cd0.f1498d = this.f954d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c7424Cd0.f1499e = this.f955e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c7424Cd0.f1500f = this.f956f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c7424Cd0.f1501g = this.f957g;
        c7424Cd0.f1496b = i2;
        return c7424Cd0;
    }

    /* renamed from: m */
    public final void m782m(C7424Cd0 c7424Cd0) {
        C7320Ad0 c7320Ad0;
        C7320Ad0 c7320Ad02;
        C7320Ad0 c7320Ad03;
        C7320Ad0 c7320Ad04;
        C11949zd0 c11949zd0;
        if (c7424Cd0 == C7424Cd0.f1493j) {
            return;
        }
        if ((c7424Cd0.f1496b & 1) == 1) {
            C11949zd0 c11949zd02 = c7424Cd0.f1497c;
            if ((this.f952b & 1) != 1 || (c11949zd0 = this.f953c) == C11949zd0.f46909g) {
                this.f953c = c11949zd02;
            } else {
                C11822yd0 c11822yd0 = new C11822yd0(0);
                c11822yd0.m26207m(c11949zd0);
                c11822yd0.m26207m(c11949zd02);
                this.f953c = c11822yd0.m26205k();
            }
            this.f952b |= 1;
        }
        if ((c7424Cd0.f1496b & 2) == 2) {
            C7320Ad0 c7320Ad05 = c7424Cd0.f1498d;
            if ((this.f952b & 2) != 2 || (c7320Ad04 = this.f954d) == C7320Ad0.f289g) {
                this.f954d = c7320Ad05;
            } else {
                C11822yd0 c11822yd0M245i = C7320Ad0.m245i(c7320Ad04);
                c11822yd0M245i.m26208n(c7320Ad05);
                this.f954d = c11822yd0M245i.m26206l();
            }
            this.f952b |= 2;
        }
        if ((c7424Cd0.f1496b & 4) == 4) {
            C7320Ad0 c7320Ad06 = c7424Cd0.f1499e;
            if ((this.f952b & 4) != 4 || (c7320Ad03 = this.f955e) == C7320Ad0.f289g) {
                this.f955e = c7320Ad06;
            } else {
                C11822yd0 c11822yd0M245i2 = C7320Ad0.m245i(c7320Ad03);
                c11822yd0M245i2.m26208n(c7320Ad06);
                this.f955e = c11822yd0M245i2.m26206l();
            }
            this.f952b |= 4;
        }
        if ((c7424Cd0.f1496b & 8) == 8) {
            C7320Ad0 c7320Ad07 = c7424Cd0.f1500f;
            if ((this.f952b & 8) != 8 || (c7320Ad02 = this.f956f) == C7320Ad0.f289g) {
                this.f956f = c7320Ad07;
            } else {
                C11822yd0 c11822yd0M245i3 = C7320Ad0.m245i(c7320Ad02);
                c11822yd0M245i3.m26208n(c7320Ad07);
                this.f956f = c11822yd0M245i3.m26206l();
            }
            this.f952b |= 8;
        }
        if ((c7424Cd0.f1496b & 16) == 16) {
            C7320Ad0 c7320Ad08 = c7424Cd0.f1501g;
            if ((this.f952b & 16) != 16 || (c7320Ad0 = this.f957g) == C7320Ad0.f289g) {
                this.f957g = c7320Ad08;
            } else {
                C11822yd0 c11822yd0M245i4 = C7320Ad0.m245i(c7320Ad0);
                c11822yd0M245i4.m26208n(c7320Ad08);
                this.f957g = c11822yd0M245i4.m26206l();
            }
            this.f952b |= 16;
        }
        this.f41281a = this.f41281a.m3573d(c7424Cd0.f1495a);
    }
}
