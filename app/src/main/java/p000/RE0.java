package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class RE0 extends AbstractC11359v00 {

    /* renamed from: A */
    public List f10066A;

    /* renamed from: B */
    public NF0 f10067B;

    /* renamed from: d */
    public int f10068d;

    /* renamed from: e */
    public int f10069e;

    /* renamed from: f */
    public int f10070f;

    /* renamed from: g */
    public int f10071g;

    /* renamed from: h */
    public List f10072h;

    /* renamed from: i */
    public List f10073i;

    /* renamed from: j */
    public List f10074j;

    /* renamed from: k */
    public List f10075k;

    /* renamed from: l */
    public List f10076l;

    /* renamed from: m */
    public List f10077m;

    /* renamed from: n */
    public List f10078n;

    /* renamed from: o */
    public List f10079o;

    /* renamed from: p */
    public List f10080p;

    /* renamed from: q */
    public List f10081q;

    /* renamed from: r */
    public List f10082r;

    /* renamed from: s */
    public List f10083s;

    /* renamed from: t */
    public int f10084t;

    /* renamed from: u */
    public AF0 f10085u;

    /* renamed from: v */
    public int f10086v;

    /* renamed from: w */
    public List f10087w;

    /* renamed from: x */
    public List f10088x;

    /* renamed from: y */
    public List f10089y;

    /* renamed from: z */
    public GF0 f10090z;

    /* renamed from: m */
    public static RE0 m6924m() {
        RE0 re0 = new RE0();
        re0.f10069e = 6;
        re0.f10072h = Collections.emptyList();
        re0.f10073i = Collections.emptyList();
        re0.f10074j = Collections.emptyList();
        re0.f10075k = Collections.emptyList();
        re0.f10076l = Collections.emptyList();
        re0.f10077m = Collections.emptyList();
        re0.f10078n = Collections.emptyList();
        re0.f10079o = Collections.emptyList();
        re0.f10080p = Collections.emptyList();
        re0.f10081q = Collections.emptyList();
        re0.f10082r = Collections.emptyList();
        re0.f10083s = Collections.emptyList();
        re0.f10085u = AF0.f123t;
        re0.f10087w = Collections.emptyList();
        re0.f10088x = Collections.emptyList();
        re0.f10089y = Collections.emptyList();
        re0.f10090z = GF0.f3648g;
        re0.f10066A = Collections.emptyList();
        re0.f10067B = NF0.f7670e;
        return re0;
    }

    public final Object clone() {
        RE0 re0M6924m = m6924m();
        re0M6924m.m6926n(m6925l());
        return re0M6924m;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        TE0 te0M6925l = m6925l();
        if (te0M6925l.mo131e()) {
            return te0M6925l;
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
            xd0 r1 = p000.TE0.f11219K     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            TE0 r1 = new TE0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m6926n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            TE0 r4 = (p000.TE0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m6926n(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RE0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m6926n((TE0) a00);
        return this;
    }

    /* renamed from: l */
    public final TE0 m6925l() {
        TE0 te0 = new TE0(this);
        int i = this.f10068d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        te0.f11231d = this.f10069e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        te0.f11232e = this.f10070f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        te0.f11233f = this.f10071g;
        if ((i & 8) == 8) {
            this.f10072h = Collections.unmodifiableList(this.f10072h);
            this.f10068d &= -9;
        }
        te0.f11234g = this.f10072h;
        if ((this.f10068d & 16) == 16) {
            this.f10073i = Collections.unmodifiableList(this.f10073i);
            this.f10068d &= -17;
        }
        te0.f11235h = this.f10073i;
        if ((this.f10068d & 32) == 32) {
            this.f10074j = Collections.unmodifiableList(this.f10074j);
            this.f10068d &= -33;
        }
        te0.f11236i = this.f10074j;
        if ((this.f10068d & 64) == 64) {
            this.f10075k = Collections.unmodifiableList(this.f10075k);
            this.f10068d &= -65;
        }
        te0.f11238k = this.f10075k;
        if ((this.f10068d & 128) == 128) {
            this.f10076l = Collections.unmodifiableList(this.f10076l);
            this.f10068d &= -129;
        }
        te0.f11240m = this.f10076l;
        if ((this.f10068d & 256) == 256) {
            this.f10077m = Collections.unmodifiableList(this.f10077m);
            this.f10068d &= -257;
        }
        te0.f11241n = this.f10077m;
        if ((this.f10068d & 512) == 512) {
            this.f10078n = Collections.unmodifiableList(this.f10078n);
            this.f10068d &= -513;
        }
        te0.f11243p = this.f10078n;
        if ((this.f10068d & 1024) == 1024) {
            this.f10079o = Collections.unmodifiableList(this.f10079o);
            this.f10068d &= -1025;
        }
        te0.f11244q = this.f10079o;
        if ((this.f10068d & 2048) == 2048) {
            this.f10080p = Collections.unmodifiableList(this.f10080p);
            this.f10068d &= -2049;
        }
        te0.f11245r = this.f10080p;
        if ((this.f10068d & 4096) == 4096) {
            this.f10081q = Collections.unmodifiableList(this.f10081q);
            this.f10068d &= -4097;
        }
        te0.f11246s = this.f10081q;
        if ((this.f10068d & 8192) == 8192) {
            this.f10082r = Collections.unmodifiableList(this.f10082r);
            this.f10068d &= -8193;
        }
        te0.f11247t = this.f10082r;
        if ((this.f10068d & 16384) == 16384) {
            this.f10083s = Collections.unmodifiableList(this.f10083s);
            this.f10068d &= -16385;
        }
        te0.f11248u = this.f10083s;
        if ((i & 32768) == 32768) {
            i2 |= 8;
        }
        te0.f11250w = this.f10084t;
        if ((i & 65536) == 65536) {
            i2 |= 16;
        }
        te0.f11251x = this.f10085u;
        if ((i & 131072) == 131072) {
            i2 |= 32;
        }
        te0.f11252y = this.f10086v;
        if ((this.f10068d & 262144) == 262144) {
            this.f10087w = Collections.unmodifiableList(this.f10087w);
            this.f10068d &= -262145;
        }
        te0.f11253z = this.f10087w;
        if ((this.f10068d & 524288) == 524288) {
            this.f10088x = Collections.unmodifiableList(this.f10088x);
            this.f10068d &= -524289;
        }
        te0.f11221B = this.f10088x;
        if ((this.f10068d & 1048576) == 1048576) {
            this.f10089y = Collections.unmodifiableList(this.f10089y);
            this.f10068d &= -1048577;
        }
        te0.f11222C = this.f10089y;
        if ((i & 2097152) == 2097152) {
            i2 |= 64;
        }
        te0.f11224E = this.f10090z;
        if ((this.f10068d & 4194304) == 4194304) {
            this.f10066A = Collections.unmodifiableList(this.f10066A);
            this.f10068d &= -4194305;
        }
        te0.f11225F = this.f10066A;
        if ((i & 8388608) == 8388608) {
            i2 |= 128;
        }
        te0.f11226G = this.f10067B;
        te0.f11230c = i2;
        return te0;
    }

    /* renamed from: n */
    public final void m6926n(TE0 te0) {
        NF0 nf0;
        GF0 gf0;
        AF0 af0;
        if (te0 == TE0.f11218J) {
            return;
        }
        int i = te0.f11230c;
        if ((i & 1) == 1) {
            int i2 = te0.f11231d;
            this.f10068d = 1 | this.f10068d;
            this.f10069e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = te0.f11232e;
            this.f10068d = 2 | this.f10068d;
            this.f10070f = i3;
        }
        if ((i & 4) == 4) {
            int i4 = te0.f11233f;
            this.f10068d = 4 | this.f10068d;
            this.f10071g = i4;
        }
        if (!te0.f11234g.isEmpty()) {
            if (this.f10072h.isEmpty()) {
                this.f10072h = te0.f11234g;
                this.f10068d &= -9;
            } else {
                if ((this.f10068d & 8) != 8) {
                    this.f10072h = new ArrayList(this.f10072h);
                    this.f10068d |= 8;
                }
                this.f10072h.addAll(te0.f11234g);
            }
        }
        if (!te0.f11235h.isEmpty()) {
            if (this.f10073i.isEmpty()) {
                this.f10073i = te0.f11235h;
                this.f10068d &= -17;
            } else {
                if ((this.f10068d & 16) != 16) {
                    this.f10073i = new ArrayList(this.f10073i);
                    this.f10068d |= 16;
                }
                this.f10073i.addAll(te0.f11235h);
            }
        }
        if (!te0.f11236i.isEmpty()) {
            if (this.f10074j.isEmpty()) {
                this.f10074j = te0.f11236i;
                this.f10068d &= -33;
            } else {
                if ((this.f10068d & 32) != 32) {
                    this.f10074j = new ArrayList(this.f10074j);
                    this.f10068d |= 32;
                }
                this.f10074j.addAll(te0.f11236i);
            }
        }
        if (!te0.f11238k.isEmpty()) {
            if (this.f10075k.isEmpty()) {
                this.f10075k = te0.f11238k;
                this.f10068d &= -65;
            } else {
                if ((this.f10068d & 64) != 64) {
                    this.f10075k = new ArrayList(this.f10075k);
                    this.f10068d |= 64;
                }
                this.f10075k.addAll(te0.f11238k);
            }
        }
        if (!te0.f11240m.isEmpty()) {
            if (this.f10076l.isEmpty()) {
                this.f10076l = te0.f11240m;
                this.f10068d &= -129;
            } else {
                if ((this.f10068d & 128) != 128) {
                    this.f10076l = new ArrayList(this.f10076l);
                    this.f10068d |= 128;
                }
                this.f10076l.addAll(te0.f11240m);
            }
        }
        if (!te0.f11241n.isEmpty()) {
            if (this.f10077m.isEmpty()) {
                this.f10077m = te0.f11241n;
                this.f10068d &= -257;
            } else {
                if ((this.f10068d & 256) != 256) {
                    this.f10077m = new ArrayList(this.f10077m);
                    this.f10068d |= 256;
                }
                this.f10077m.addAll(te0.f11241n);
            }
        }
        if (!te0.f11243p.isEmpty()) {
            if (this.f10078n.isEmpty()) {
                this.f10078n = te0.f11243p;
                this.f10068d &= -513;
            } else {
                if ((this.f10068d & 512) != 512) {
                    this.f10078n = new ArrayList(this.f10078n);
                    this.f10068d |= 512;
                }
                this.f10078n.addAll(te0.f11243p);
            }
        }
        if (!te0.f11244q.isEmpty()) {
            if (this.f10079o.isEmpty()) {
                this.f10079o = te0.f11244q;
                this.f10068d &= -1025;
            } else {
                if ((this.f10068d & 1024) != 1024) {
                    this.f10079o = new ArrayList(this.f10079o);
                    this.f10068d |= 1024;
                }
                this.f10079o.addAll(te0.f11244q);
            }
        }
        if (!te0.f11245r.isEmpty()) {
            if (this.f10080p.isEmpty()) {
                this.f10080p = te0.f11245r;
                this.f10068d &= -2049;
            } else {
                if ((this.f10068d & 2048) != 2048) {
                    this.f10080p = new ArrayList(this.f10080p);
                    this.f10068d |= 2048;
                }
                this.f10080p.addAll(te0.f11245r);
            }
        }
        if (!te0.f11246s.isEmpty()) {
            if (this.f10081q.isEmpty()) {
                this.f10081q = te0.f11246s;
                this.f10068d &= -4097;
            } else {
                if ((this.f10068d & 4096) != 4096) {
                    this.f10081q = new ArrayList(this.f10081q);
                    this.f10068d |= 4096;
                }
                this.f10081q.addAll(te0.f11246s);
            }
        }
        if (!te0.f11247t.isEmpty()) {
            if (this.f10082r.isEmpty()) {
                this.f10082r = te0.f11247t;
                this.f10068d &= -8193;
            } else {
                if ((this.f10068d & 8192) != 8192) {
                    this.f10082r = new ArrayList(this.f10082r);
                    this.f10068d |= 8192;
                }
                this.f10082r.addAll(te0.f11247t);
            }
        }
        if (!te0.f11248u.isEmpty()) {
            if (this.f10083s.isEmpty()) {
                this.f10083s = te0.f11248u;
                this.f10068d &= -16385;
            } else {
                if ((this.f10068d & 16384) != 16384) {
                    this.f10083s = new ArrayList(this.f10083s);
                    this.f10068d |= 16384;
                }
                this.f10083s.addAll(te0.f11248u);
            }
        }
        int i5 = te0.f11230c;
        if ((i5 & 8) == 8) {
            int i6 = te0.f11250w;
            this.f10068d |= 32768;
            this.f10084t = i6;
        }
        if ((i5 & 16) == 16) {
            AF0 af02 = te0.f11251x;
            if ((this.f10068d & 65536) != 65536 || (af0 = this.f10085u) == AF0.f123t) {
                this.f10085u = af02;
            } else {
                C11901zF0 c11901zF0M126r = AF0.m126r(af0);
                c11901zF0M126r.m26352n(af02);
                this.f10085u = c11901zF0M126r.m26351l();
            }
            this.f10068d |= 65536;
        }
        if ((te0.f11230c & 32) == 32) {
            int i7 = te0.f11252y;
            this.f10068d |= 131072;
            this.f10086v = i7;
        }
        if (!te0.f11253z.isEmpty()) {
            if (this.f10087w.isEmpty()) {
                this.f10087w = te0.f11253z;
                this.f10068d &= -262145;
            } else {
                if ((this.f10068d & 262144) != 262144) {
                    this.f10087w = new ArrayList(this.f10087w);
                    this.f10068d |= 262144;
                }
                this.f10087w.addAll(te0.f11253z);
            }
        }
        if (!te0.f11221B.isEmpty()) {
            if (this.f10088x.isEmpty()) {
                this.f10088x = te0.f11221B;
                this.f10068d &= -524289;
            } else {
                if ((this.f10068d & 524288) != 524288) {
                    this.f10088x = new ArrayList(this.f10088x);
                    this.f10068d |= 524288;
                }
                this.f10088x.addAll(te0.f11221B);
            }
        }
        if (!te0.f11222C.isEmpty()) {
            if (this.f10089y.isEmpty()) {
                this.f10089y = te0.f11222C;
                this.f10068d &= -1048577;
            } else {
                if ((this.f10068d & 1048576) != 1048576) {
                    this.f10089y = new ArrayList(this.f10089y);
                    this.f10068d |= 1048576;
                }
                this.f10089y.addAll(te0.f11222C);
            }
        }
        if ((te0.f11230c & 64) == 64) {
            GF0 gf02 = te0.f11224E;
            if ((this.f10068d & 2097152) != 2097152 || (gf0 = this.f10090z) == GF0.f3648g) {
                this.f10090z = gf02;
            } else {
                PE0 pe0M3016i = GF0.m3016i(gf0);
                pe0M3016i.m6278q(gf02);
                this.f10090z = pe0M3016i.m6275m();
            }
            this.f10068d |= 2097152;
        }
        if (!te0.f11225F.isEmpty()) {
            if (this.f10066A.isEmpty()) {
                this.f10066A = te0.f11225F;
                this.f10068d &= -4194305;
            } else {
                if ((this.f10068d & 4194304) != 4194304) {
                    this.f10066A = new ArrayList(this.f10066A);
                    this.f10068d |= 4194304;
                }
                this.f10066A.addAll(te0.f11225F);
            }
        }
        if ((te0.f11230c & 128) == 128) {
            NF0 nf02 = te0.f11226G;
            if ((this.f10068d & 8388608) != 8388608 || (nf0 = this.f10067B) == NF0.f7670e) {
                this.f10067B = nf02;
            } else {
                WE0 we0 = new WE0(2);
                we0.f13084d = Collections.emptyList();
                we0.m8716r(nf0);
                we0.m8716r(nf02);
                this.f10067B = we0.m8712n();
            }
            this.f10068d |= 8388608;
        }
        m25292k(te0);
        this.f41281a = this.f41281a.m3573d(te0.f11229b);
    }
}
