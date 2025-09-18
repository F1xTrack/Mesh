package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class RE0 extends AbstractC7518v00 {
    public List A;
    public NF0 B;
    public int d;
    public int e;
    public int f;
    public int g;
    public List h;
    public List i;
    public List j;
    public List k;
    public List l;
    public List m;
    public List n;
    public List o;
    public List p;
    public List q;
    public List r;
    public List s;
    public int t;
    public AF0 u;
    public int v;
    public List w;
    public List x;
    public List y;
    public GF0 z;

    public static RE0 m() {
        RE0 re0 = new RE0();
        re0.e = 6;
        re0.h = Collections.emptyList();
        re0.i = Collections.emptyList();
        re0.j = Collections.emptyList();
        re0.k = Collections.emptyList();
        re0.l = Collections.emptyList();
        re0.m = Collections.emptyList();
        re0.n = Collections.emptyList();
        re0.o = Collections.emptyList();
        re0.p = Collections.emptyList();
        re0.q = Collections.emptyList();
        re0.r = Collections.emptyList();
        re0.s = Collections.emptyList();
        re0.u = AF0.t;
        re0.w = Collections.emptyList();
        re0.x = Collections.emptyList();
        re0.y = Collections.emptyList();
        re0.z = GF0.g;
        re0.A = Collections.emptyList();
        re0.B = NF0.e;
        return re0;
    }

    public final Object clone() {
        RE0 re0M = m();
        re0M.n(l());
        return re0M;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        TE0 te0L = l();
        if (te0L.e()) {
            return te0L;
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
            xd0 r1 = defpackage.TE0.K     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            TE0 r1 = new TE0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            TE0 r4 = (defpackage.TE0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.n(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RE0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        n((TE0) a00);
        return this;
    }

    public final TE0 l() {
        TE0 te0 = new TE0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        te0.d = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        te0.e = this.f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        te0.f = this.g;
        if ((i & 8) == 8) {
            this.h = Collections.unmodifiableList(this.h);
            this.d &= -9;
        }
        te0.g = this.h;
        if ((this.d & 16) == 16) {
            this.i = Collections.unmodifiableList(this.i);
            this.d &= -17;
        }
        te0.h = this.i;
        if ((this.d & 32) == 32) {
            this.j = Collections.unmodifiableList(this.j);
            this.d &= -33;
        }
        te0.i = this.j;
        if ((this.d & 64) == 64) {
            this.k = Collections.unmodifiableList(this.k);
            this.d &= -65;
        }
        te0.k = this.k;
        if ((this.d & 128) == 128) {
            this.l = Collections.unmodifiableList(this.l);
            this.d &= -129;
        }
        te0.m = this.l;
        if ((this.d & 256) == 256) {
            this.m = Collections.unmodifiableList(this.m);
            this.d &= -257;
        }
        te0.n = this.m;
        if ((this.d & 512) == 512) {
            this.n = Collections.unmodifiableList(this.n);
            this.d &= -513;
        }
        te0.p = this.n;
        if ((this.d & 1024) == 1024) {
            this.o = Collections.unmodifiableList(this.o);
            this.d &= -1025;
        }
        te0.q = this.o;
        if ((this.d & 2048) == 2048) {
            this.p = Collections.unmodifiableList(this.p);
            this.d &= -2049;
        }
        te0.r = this.p;
        if ((this.d & 4096) == 4096) {
            this.q = Collections.unmodifiableList(this.q);
            this.d &= -4097;
        }
        te0.s = this.q;
        if ((this.d & 8192) == 8192) {
            this.r = Collections.unmodifiableList(this.r);
            this.d &= -8193;
        }
        te0.t = this.r;
        if ((this.d & 16384) == 16384) {
            this.s = Collections.unmodifiableList(this.s);
            this.d &= -16385;
        }
        te0.u = this.s;
        if ((i & 32768) == 32768) {
            i2 |= 8;
        }
        te0.w = this.t;
        if ((i & 65536) == 65536) {
            i2 |= 16;
        }
        te0.x = this.u;
        if ((i & 131072) == 131072) {
            i2 |= 32;
        }
        te0.y = this.v;
        if ((this.d & 262144) == 262144) {
            this.w = Collections.unmodifiableList(this.w);
            this.d &= -262145;
        }
        te0.z = this.w;
        if ((this.d & 524288) == 524288) {
            this.x = Collections.unmodifiableList(this.x);
            this.d &= -524289;
        }
        te0.B = this.x;
        if ((this.d & 1048576) == 1048576) {
            this.y = Collections.unmodifiableList(this.y);
            this.d &= -1048577;
        }
        te0.C = this.y;
        if ((i & 2097152) == 2097152) {
            i2 |= 64;
        }
        te0.E = this.z;
        if ((this.d & 4194304) == 4194304) {
            this.A = Collections.unmodifiableList(this.A);
            this.d &= -4194305;
        }
        te0.F = this.A;
        if ((i & 8388608) == 8388608) {
            i2 |= 128;
        }
        te0.G = this.B;
        te0.c = i2;
        return te0;
    }

    public final void n(TE0 te0) {
        NF0 nf0;
        GF0 gf0;
        AF0 af0;
        if (te0 == TE0.J) {
            return;
        }
        int i = te0.c;
        if ((i & 1) == 1) {
            int i2 = te0.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = te0.e;
            this.d = 2 | this.d;
            this.f = i3;
        }
        if ((i & 4) == 4) {
            int i4 = te0.f;
            this.d = 4 | this.d;
            this.g = i4;
        }
        if (!te0.g.isEmpty()) {
            if (this.h.isEmpty()) {
                this.h = te0.g;
                this.d &= -9;
            } else {
                if ((this.d & 8) != 8) {
                    this.h = new ArrayList(this.h);
                    this.d |= 8;
                }
                this.h.addAll(te0.g);
            }
        }
        if (!te0.h.isEmpty()) {
            if (this.i.isEmpty()) {
                this.i = te0.h;
                this.d &= -17;
            } else {
                if ((this.d & 16) != 16) {
                    this.i = new ArrayList(this.i);
                    this.d |= 16;
                }
                this.i.addAll(te0.h);
            }
        }
        if (!te0.i.isEmpty()) {
            if (this.j.isEmpty()) {
                this.j = te0.i;
                this.d &= -33;
            } else {
                if ((this.d & 32) != 32) {
                    this.j = new ArrayList(this.j);
                    this.d |= 32;
                }
                this.j.addAll(te0.i);
            }
        }
        if (!te0.k.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = te0.k;
                this.d &= -65;
            } else {
                if ((this.d & 64) != 64) {
                    this.k = new ArrayList(this.k);
                    this.d |= 64;
                }
                this.k.addAll(te0.k);
            }
        }
        if (!te0.m.isEmpty()) {
            if (this.l.isEmpty()) {
                this.l = te0.m;
                this.d &= -129;
            } else {
                if ((this.d & 128) != 128) {
                    this.l = new ArrayList(this.l);
                    this.d |= 128;
                }
                this.l.addAll(te0.m);
            }
        }
        if (!te0.n.isEmpty()) {
            if (this.m.isEmpty()) {
                this.m = te0.n;
                this.d &= -257;
            } else {
                if ((this.d & 256) != 256) {
                    this.m = new ArrayList(this.m);
                    this.d |= 256;
                }
                this.m.addAll(te0.n);
            }
        }
        if (!te0.p.isEmpty()) {
            if (this.n.isEmpty()) {
                this.n = te0.p;
                this.d &= -513;
            } else {
                if ((this.d & 512) != 512) {
                    this.n = new ArrayList(this.n);
                    this.d |= 512;
                }
                this.n.addAll(te0.p);
            }
        }
        if (!te0.q.isEmpty()) {
            if (this.o.isEmpty()) {
                this.o = te0.q;
                this.d &= -1025;
            } else {
                if ((this.d & 1024) != 1024) {
                    this.o = new ArrayList(this.o);
                    this.d |= 1024;
                }
                this.o.addAll(te0.q);
            }
        }
        if (!te0.r.isEmpty()) {
            if (this.p.isEmpty()) {
                this.p = te0.r;
                this.d &= -2049;
            } else {
                if ((this.d & 2048) != 2048) {
                    this.p = new ArrayList(this.p);
                    this.d |= 2048;
                }
                this.p.addAll(te0.r);
            }
        }
        if (!te0.s.isEmpty()) {
            if (this.q.isEmpty()) {
                this.q = te0.s;
                this.d &= -4097;
            } else {
                if ((this.d & 4096) != 4096) {
                    this.q = new ArrayList(this.q);
                    this.d |= 4096;
                }
                this.q.addAll(te0.s);
            }
        }
        if (!te0.t.isEmpty()) {
            if (this.r.isEmpty()) {
                this.r = te0.t;
                this.d &= -8193;
            } else {
                if ((this.d & 8192) != 8192) {
                    this.r = new ArrayList(this.r);
                    this.d |= 8192;
                }
                this.r.addAll(te0.t);
            }
        }
        if (!te0.u.isEmpty()) {
            if (this.s.isEmpty()) {
                this.s = te0.u;
                this.d &= -16385;
            } else {
                if ((this.d & 16384) != 16384) {
                    this.s = new ArrayList(this.s);
                    this.d |= 16384;
                }
                this.s.addAll(te0.u);
            }
        }
        int i5 = te0.c;
        if ((i5 & 8) == 8) {
            int i6 = te0.w;
            this.d |= 32768;
            this.t = i6;
        }
        if ((i5 & 16) == 16) {
            AF0 af02 = te0.x;
            if ((this.d & 65536) != 65536 || (af0 = this.u) == AF0.t) {
                this.u = af02;
            } else {
                C8327zF0 c8327zF0R = AF0.r(af0);
                c8327zF0R.n(af02);
                this.u = c8327zF0R.l();
            }
            this.d |= 65536;
        }
        if ((te0.c & 32) == 32) {
            int i7 = te0.y;
            this.d |= 131072;
            this.v = i7;
        }
        if (!te0.z.isEmpty()) {
            if (this.w.isEmpty()) {
                this.w = te0.z;
                this.d &= -262145;
            } else {
                if ((this.d & 262144) != 262144) {
                    this.w = new ArrayList(this.w);
                    this.d |= 262144;
                }
                this.w.addAll(te0.z);
            }
        }
        if (!te0.B.isEmpty()) {
            if (this.x.isEmpty()) {
                this.x = te0.B;
                this.d &= -524289;
            } else {
                if ((this.d & 524288) != 524288) {
                    this.x = new ArrayList(this.x);
                    this.d |= 524288;
                }
                this.x.addAll(te0.B);
            }
        }
        if (!te0.C.isEmpty()) {
            if (this.y.isEmpty()) {
                this.y = te0.C;
                this.d &= -1048577;
            } else {
                if ((this.d & 1048576) != 1048576) {
                    this.y = new ArrayList(this.y);
                    this.d |= 1048576;
                }
                this.y.addAll(te0.C);
            }
        }
        if ((te0.c & 64) == 64) {
            GF0 gf02 = te0.E;
            if ((this.d & 2097152) != 2097152 || (gf0 = this.z) == GF0.g) {
                this.z = gf02;
            } else {
                PE0 pe0I = GF0.i(gf0);
                pe0I.q(gf02);
                this.z = pe0I.m();
            }
            this.d |= 2097152;
        }
        if (!te0.F.isEmpty()) {
            if (this.A.isEmpty()) {
                this.A = te0.F;
                this.d &= -4194305;
            } else {
                if ((this.d & 4194304) != 4194304) {
                    this.A = new ArrayList(this.A);
                    this.d |= 4194304;
                }
                this.A.addAll(te0.F);
            }
        }
        if ((te0.c & 128) == 128) {
            NF0 nf02 = te0.G;
            if ((this.d & 8388608) != 8388608 || (nf0 = this.B) == NF0.e) {
                this.B = nf02;
            } else {
                WE0 we0 = new WE0(2);
                we0.d = Collections.emptyList();
                we0.r(nf0);
                we0.r(nf02);
                this.B = we0.n();
            }
            this.d |= 8388608;
        }
        k(te0);
        this.a = this.a.d(te0.b);
    }
}
