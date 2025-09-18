package p000;

/* renamed from: yd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11822yd0 extends AbstractC10847r00 implements InterfaceC10957rr0 {

    /* renamed from: b */
    public final /* synthetic */ int f46360b;

    /* renamed from: c */
    public int f46361c;

    /* renamed from: d */
    public int f46362d;

    /* renamed from: e */
    public int f46363e;

    public /* synthetic */ C11822yd0(int i) {
        this.f46360b = i;
    }

    public final Object clone() {
        switch (this.f46360b) {
            case 0:
                C11822yd0 c11822yd0 = new C11822yd0(0);
                c11822yd0.m26207m(m26205k());
                return c11822yd0;
            default:
                C11822yd0 c11822yd02 = new C11822yd0(1);
                c11822yd02.m26208n(m26206l());
                return c11822yd02;
        }
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        switch (this.f46360b) {
            case 0:
                C11949zd0 c11949zd0M26205k = m26205k();
                if (c11949zd0M26205k.mo131e()) {
                    return c11949zd0M26205k;
                }
                throw new C6838sg();
            default:
                C7320Ad0 c7320Ad0M26206l = m26206l();
                if (c7320Ad0M26206l.mo131e()) {
                    return c7320Ad0M26206l;
                }
                throw new C6838sg();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    @Override // p000.AbstractC10847r00
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.AbstractC10847r00 mo567i(p000.C6392lu r2, p000.C0217DR r3) throws java.lang.Throwable {
        /*
            r1 = this;
            int r3 = r1.f46360b
            switch(r3) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r3 = 0
            xd0 r0 = p000.C7320Ad0.f290h     // Catch: java.lang.Throwable -> L14 p000.Y90 -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 p000.Y90 -> L16
            Ad0 r0 = new Ad0     // Catch: java.lang.Throwable -> L14 p000.Y90 -> L16
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L14 p000.Y90 -> L16
            r1.m26208n(r0)
            return r1
        L14:
            r2 = move-exception
            goto L1e
        L16:
            r2 = move-exception
            K0 r0 = r2.f14178a     // Catch: java.lang.Throwable -> L14
            Ad0 r0 = (p000.C7320Ad0) r0     // Catch: java.lang.Throwable -> L14
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            r2 = move-exception
            r3 = r0
        L1e:
            if (r3 == 0) goto L23
            r1.m26208n(r3)
        L23:
            throw r2
        L24:
            r3 = 0
            xd0 r0 = p000.C11949zd0.f46910h     // Catch: java.lang.Throwable -> L33 p000.Y90 -> L35
            r0.getClass()     // Catch: java.lang.Throwable -> L33 p000.Y90 -> L35
            zd0 r0 = new zd0     // Catch: java.lang.Throwable -> L33 p000.Y90 -> L35
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L33 p000.Y90 -> L35
            r1.m26207m(r0)
            return r1
        L33:
            r2 = move-exception
            goto L3d
        L35:
            r2 = move-exception
            K0 r0 = r2.f14178a     // Catch: java.lang.Throwable -> L33
            zd0 r0 = (p000.C11949zd0) r0     // Catch: java.lang.Throwable -> L33
            throw r2     // Catch: java.lang.Throwable -> L3b
        L3b:
            r2 = move-exception
            r3 = r0
        L3d:
            if (r3 == 0) goto L42
            r1.m26207m(r3)
        L42:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11822yd0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        switch (this.f46360b) {
            case 0:
                m26207m((C11949zd0) a00);
                break;
            default:
                m26208n((C7320Ad0) a00);
                break;
        }
        return this;
    }

    /* renamed from: k */
    public C11949zd0 m26205k() {
        C11949zd0 c11949zd0 = new C11949zd0(this);
        int i = this.f46361c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c11949zd0.f46913c = this.f46362d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c11949zd0.f46914d = this.f46363e;
        c11949zd0.f46912b = i2;
        return c11949zd0;
    }

    /* renamed from: l */
    public C7320Ad0 m26206l() {
        C7320Ad0 c7320Ad0 = new C7320Ad0(this);
        int i = this.f46361c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c7320Ad0.f293c = this.f46362d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c7320Ad0.f294d = this.f46363e;
        c7320Ad0.f292b = i2;
        return c7320Ad0;
    }

    /* renamed from: m */
    public void m26207m(C11949zd0 c11949zd0) {
        if (c11949zd0 == C11949zd0.f46909g) {
            return;
        }
        int i = c11949zd0.f46912b;
        if ((i & 1) == 1) {
            int i2 = c11949zd0.f46913c;
            this.f46361c = 1 | this.f46361c;
            this.f46362d = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c11949zd0.f46914d;
            this.f46361c = 2 | this.f46361c;
            this.f46363e = i3;
        }
        this.f41281a = this.f41281a.m3573d(c11949zd0.f46911a);
    }

    /* renamed from: n */
    public void m26208n(C7320Ad0 c7320Ad0) {
        if (c7320Ad0 == C7320Ad0.f289g) {
            return;
        }
        int i = c7320Ad0.f292b;
        if ((i & 1) == 1) {
            int i2 = c7320Ad0.f293c;
            this.f46361c = 1 | this.f46361c;
            this.f46362d = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c7320Ad0.f294d;
            this.f46361c = 2 | this.f46361c;
            this.f46363e = i3;
        }
        this.f41281a = this.f41281a.m3573d(c7320Ad0.f291a);
    }
}
