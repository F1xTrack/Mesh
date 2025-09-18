package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: hF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9601hF0 extends AbstractC11359v00 {

    /* renamed from: d */
    public int f28337d;

    /* renamed from: e */
    public int f28338e;

    /* renamed from: f */
    public int f28339f;

    /* renamed from: g */
    public int f28340g;

    /* renamed from: h */
    public AF0 f28341h;

    /* renamed from: i */
    public int f28342i;

    /* renamed from: j */
    public List f28343j;

    /* renamed from: k */
    public AF0 f28344k;

    /* renamed from: l */
    public int f28345l;

    /* renamed from: m */
    public List f28346m;

    /* renamed from: n */
    public List f28347n;

    /* renamed from: o */
    public List f28348o;

    /* renamed from: p */
    public GF0 f28349p;

    /* renamed from: q */
    public List f28350q;

    /* renamed from: r */
    public XE0 f28351r;

    /* renamed from: m */
    public static C9601hF0 m18789m() {
        C9601hF0 c9601hF0 = new C9601hF0();
        c9601hF0.f28338e = 6;
        c9601hF0.f28339f = 6;
        AF0 af0 = AF0.f123t;
        c9601hF0.f28341h = af0;
        c9601hF0.f28343j = Collections.emptyList();
        c9601hF0.f28344k = af0;
        c9601hF0.f28346m = Collections.emptyList();
        c9601hF0.f28347n = Collections.emptyList();
        c9601hF0.f28348o = Collections.emptyList();
        c9601hF0.f28349p = GF0.f3648g;
        c9601hF0.f28350q = Collections.emptyList();
        c9601hF0.f28351r = XE0.f13626e;
        return c9601hF0;
    }

    public final Object clone() {
        C9601hF0 c9601hF0M18789m = m18789m();
        c9601hF0M18789m.m18791n(m18790l());
        return c9601hF0M18789m;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        C9729iF0 c9729iF0M18790l = m18790l();
        if (c9729iF0M18790l.mo131e()) {
            return c9729iF0M18790l;
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
            xd0 r1 = p000.C9729iF0.f28980v     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            iF0 r1 = new iF0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m18791n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            iF0 r4 = (p000.C9729iF0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m18791n(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9601hF0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m18791n((C9729iF0) a00);
        return this;
    }

    /* renamed from: l */
    public final C9729iF0 m18790l() {
        C9729iF0 c9729iF0 = new C9729iF0(this);
        int i = this.f28337d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c9729iF0.f28983d = this.f28338e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c9729iF0.f28984e = this.f28339f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c9729iF0.f28985f = this.f28340g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c9729iF0.f28986g = this.f28341h;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c9729iF0.f28987h = this.f28342i;
        if ((i & 32) == 32) {
            this.f28343j = Collections.unmodifiableList(this.f28343j);
            this.f28337d &= -33;
        }
        c9729iF0.f28988i = this.f28343j;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        c9729iF0.f28989j = this.f28344k;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        c9729iF0.f28990k = this.f28345l;
        if ((this.f28337d & 256) == 256) {
            this.f28346m = Collections.unmodifiableList(this.f28346m);
            this.f28337d &= -257;
        }
        c9729iF0.f28991l = this.f28346m;
        if ((this.f28337d & 512) == 512) {
            this.f28347n = Collections.unmodifiableList(this.f28347n);
            this.f28337d &= -513;
        }
        c9729iF0.f28992m = this.f28347n;
        if ((this.f28337d & 1024) == 1024) {
            this.f28348o = Collections.unmodifiableList(this.f28348o);
            this.f28337d &= -1025;
        }
        c9729iF0.f28994o = this.f28348o;
        if ((i & 2048) == 2048) {
            i2 |= 128;
        }
        c9729iF0.f28995p = this.f28349p;
        if ((this.f28337d & 4096) == 4096) {
            this.f28350q = Collections.unmodifiableList(this.f28350q);
            this.f28337d &= -4097;
        }
        c9729iF0.f28996q = this.f28350q;
        if ((i & 8192) == 8192) {
            i2 |= 256;
        }
        c9729iF0.f28997r = this.f28351r;
        c9729iF0.f28982c = i2;
        return c9729iF0;
    }

    /* renamed from: n */
    public final void m18791n(C9729iF0 c9729iF0) {
        XE0 xe0;
        GF0 gf0;
        AF0 af0;
        AF0 af02;
        if (c9729iF0 == C9729iF0.f28979u) {
            return;
        }
        int i = c9729iF0.f28982c;
        if ((i & 1) == 1) {
            int i2 = c9729iF0.f28983d;
            this.f28337d = 1 | this.f28337d;
            this.f28338e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c9729iF0.f28984e;
            this.f28337d = 2 | this.f28337d;
            this.f28339f = i3;
        }
        if ((i & 4) == 4) {
            int i4 = c9729iF0.f28985f;
            this.f28337d = 4 | this.f28337d;
            this.f28340g = i4;
        }
        if ((i & 8) == 8) {
            AF0 af03 = c9729iF0.f28986g;
            if ((this.f28337d & 8) != 8 || (af02 = this.f28341h) == AF0.f123t) {
                this.f28341h = af03;
            } else {
                C11901zF0 c11901zF0M126r = AF0.m126r(af02);
                c11901zF0M126r.m26352n(af03);
                this.f28341h = c11901zF0M126r.m26351l();
            }
            this.f28337d |= 8;
        }
        if ((c9729iF0.f28982c & 16) == 16) {
            int i5 = c9729iF0.f28987h;
            this.f28337d = 16 | this.f28337d;
            this.f28342i = i5;
        }
        if (!c9729iF0.f28988i.isEmpty()) {
            if (this.f28343j.isEmpty()) {
                this.f28343j = c9729iF0.f28988i;
                this.f28337d &= -33;
            } else {
                if ((this.f28337d & 32) != 32) {
                    this.f28343j = new ArrayList(this.f28343j);
                    this.f28337d |= 32;
                }
                this.f28343j.addAll(c9729iF0.f28988i);
            }
        }
        if (c9729iF0.m18989p()) {
            AF0 af04 = c9729iF0.f28989j;
            if ((this.f28337d & 64) != 64 || (af0 = this.f28344k) == AF0.f123t) {
                this.f28344k = af04;
            } else {
                C11901zF0 c11901zF0M126r2 = AF0.m126r(af0);
                c11901zF0M126r2.m26352n(af04);
                this.f28344k = c11901zF0M126r2.m26351l();
            }
            this.f28337d |= 64;
        }
        if ((c9729iF0.f28982c & 64) == 64) {
            int i6 = c9729iF0.f28990k;
            this.f28337d |= 128;
            this.f28345l = i6;
        }
        if (!c9729iF0.f28991l.isEmpty()) {
            if (this.f28346m.isEmpty()) {
                this.f28346m = c9729iF0.f28991l;
                this.f28337d &= -257;
            } else {
                if ((this.f28337d & 256) != 256) {
                    this.f28346m = new ArrayList(this.f28346m);
                    this.f28337d |= 256;
                }
                this.f28346m.addAll(c9729iF0.f28991l);
            }
        }
        if (!c9729iF0.f28992m.isEmpty()) {
            if (this.f28347n.isEmpty()) {
                this.f28347n = c9729iF0.f28992m;
                this.f28337d &= -513;
            } else {
                if ((this.f28337d & 512) != 512) {
                    this.f28347n = new ArrayList(this.f28347n);
                    this.f28337d |= 512;
                }
                this.f28347n.addAll(c9729iF0.f28992m);
            }
        }
        if (!c9729iF0.f28994o.isEmpty()) {
            if (this.f28348o.isEmpty()) {
                this.f28348o = c9729iF0.f28994o;
                this.f28337d &= -1025;
            } else {
                if ((this.f28337d & 1024) != 1024) {
                    this.f28348o = new ArrayList(this.f28348o);
                    this.f28337d |= 1024;
                }
                this.f28348o.addAll(c9729iF0.f28994o);
            }
        }
        if ((c9729iF0.f28982c & 128) == 128) {
            GF0 gf02 = c9729iF0.f28995p;
            if ((this.f28337d & 2048) != 2048 || (gf0 = this.f28349p) == GF0.f3648g) {
                this.f28349p = gf02;
            } else {
                PE0 pe0M3016i = GF0.m3016i(gf0);
                pe0M3016i.m6278q(gf02);
                this.f28349p = pe0M3016i.m6275m();
            }
            this.f28337d |= 2048;
        }
        if (!c9729iF0.f28996q.isEmpty()) {
            if (this.f28350q.isEmpty()) {
                this.f28350q = c9729iF0.f28996q;
                this.f28337d &= -4097;
            } else {
                if ((this.f28337d & 4096) != 4096) {
                    this.f28350q = new ArrayList(this.f28350q);
                    this.f28337d |= 4096;
                }
                this.f28350q.addAll(c9729iF0.f28996q);
            }
        }
        if ((c9729iF0.f28982c & 256) == 256) {
            XE0 xe02 = c9729iF0.f28997r;
            if ((this.f28337d & 8192) != 8192 || (xe0 = this.f28351r) == XE0.f13626e) {
                this.f28351r = xe02;
            } else {
                WE0 we0 = new WE0(0);
                we0.f13084d = Collections.emptyList();
                we0.m8713o(xe0);
                we0.m8713o(xe02);
                this.f28351r = we0.m8709k();
            }
            this.f28337d |= 8192;
        }
        m25292k(c9729iF0);
        this.f41281a = this.f41281a.m3573d(c9729iF0.f28981b);
    }
}
