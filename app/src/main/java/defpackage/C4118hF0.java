package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: hF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4118hF0 extends AbstractC7518v00 {
    public int d;
    public int e;
    public int f;
    public int g;
    public AF0 h;
    public int i;
    public List j;
    public AF0 k;
    public int l;
    public List m;
    public List n;
    public List o;
    public GF0 p;
    public List q;
    public XE0 r;

    public static C4118hF0 m() {
        C4118hF0 c4118hF0 = new C4118hF0();
        c4118hF0.e = 6;
        c4118hF0.f = 6;
        AF0 af0 = AF0.t;
        c4118hF0.h = af0;
        c4118hF0.j = Collections.emptyList();
        c4118hF0.k = af0;
        c4118hF0.m = Collections.emptyList();
        c4118hF0.n = Collections.emptyList();
        c4118hF0.o = Collections.emptyList();
        c4118hF0.p = GF0.g;
        c4118hF0.q = Collections.emptyList();
        c4118hF0.r = XE0.e;
        return c4118hF0;
    }

    public final Object clone() {
        C4118hF0 c4118hF0M = m();
        c4118hF0M.n(l());
        return c4118hF0M;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        C4309iF0 c4309iF0L = l();
        if (c4309iF0L.e()) {
            return c4309iF0L;
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
            xd0 r1 = defpackage.C4309iF0.v     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            iF0 r1 = new iF0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            iF0 r4 = (defpackage.C4309iF0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4118hF0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        n((C4309iF0) a00);
        return this;
    }

    public final C4309iF0 l() {
        C4309iF0 c4309iF0 = new C4309iF0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c4309iF0.d = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c4309iF0.e = this.f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c4309iF0.f = this.g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c4309iF0.g = this.h;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c4309iF0.h = this.i;
        if ((i & 32) == 32) {
            this.j = Collections.unmodifiableList(this.j);
            this.d &= -33;
        }
        c4309iF0.i = this.j;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        c4309iF0.j = this.k;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        c4309iF0.k = this.l;
        if ((this.d & 256) == 256) {
            this.m = Collections.unmodifiableList(this.m);
            this.d &= -257;
        }
        c4309iF0.l = this.m;
        if ((this.d & 512) == 512) {
            this.n = Collections.unmodifiableList(this.n);
            this.d &= -513;
        }
        c4309iF0.m = this.n;
        if ((this.d & 1024) == 1024) {
            this.o = Collections.unmodifiableList(this.o);
            this.d &= -1025;
        }
        c4309iF0.o = this.o;
        if ((i & 2048) == 2048) {
            i2 |= 128;
        }
        c4309iF0.p = this.p;
        if ((this.d & 4096) == 4096) {
            this.q = Collections.unmodifiableList(this.q);
            this.d &= -4097;
        }
        c4309iF0.q = this.q;
        if ((i & 8192) == 8192) {
            i2 |= 256;
        }
        c4309iF0.r = this.r;
        c4309iF0.c = i2;
        return c4309iF0;
    }

    public final void n(C4309iF0 c4309iF0) {
        XE0 xe0;
        GF0 gf0;
        AF0 af0;
        AF0 af02;
        if (c4309iF0 == C4309iF0.u) {
            return;
        }
        int i = c4309iF0.c;
        if ((i & 1) == 1) {
            int i2 = c4309iF0.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c4309iF0.e;
            this.d = 2 | this.d;
            this.f = i3;
        }
        if ((i & 4) == 4) {
            int i4 = c4309iF0.f;
            this.d = 4 | this.d;
            this.g = i4;
        }
        if ((i & 8) == 8) {
            AF0 af03 = c4309iF0.g;
            if ((this.d & 8) != 8 || (af02 = this.h) == AF0.t) {
                this.h = af03;
            } else {
                C8327zF0 c8327zF0R = AF0.r(af02);
                c8327zF0R.n(af03);
                this.h = c8327zF0R.l();
            }
            this.d |= 8;
        }
        if ((c4309iF0.c & 16) == 16) {
            int i5 = c4309iF0.h;
            this.d = 16 | this.d;
            this.i = i5;
        }
        if (!c4309iF0.i.isEmpty()) {
            if (this.j.isEmpty()) {
                this.j = c4309iF0.i;
                this.d &= -33;
            } else {
                if ((this.d & 32) != 32) {
                    this.j = new ArrayList(this.j);
                    this.d |= 32;
                }
                this.j.addAll(c4309iF0.i);
            }
        }
        if (c4309iF0.p()) {
            AF0 af04 = c4309iF0.j;
            if ((this.d & 64) != 64 || (af0 = this.k) == AF0.t) {
                this.k = af04;
            } else {
                C8327zF0 c8327zF0R2 = AF0.r(af0);
                c8327zF0R2.n(af04);
                this.k = c8327zF0R2.l();
            }
            this.d |= 64;
        }
        if ((c4309iF0.c & 64) == 64) {
            int i6 = c4309iF0.k;
            this.d |= 128;
            this.l = i6;
        }
        if (!c4309iF0.l.isEmpty()) {
            if (this.m.isEmpty()) {
                this.m = c4309iF0.l;
                this.d &= -257;
            } else {
                if ((this.d & 256) != 256) {
                    this.m = new ArrayList(this.m);
                    this.d |= 256;
                }
                this.m.addAll(c4309iF0.l);
            }
        }
        if (!c4309iF0.m.isEmpty()) {
            if (this.n.isEmpty()) {
                this.n = c4309iF0.m;
                this.d &= -513;
            } else {
                if ((this.d & 512) != 512) {
                    this.n = new ArrayList(this.n);
                    this.d |= 512;
                }
                this.n.addAll(c4309iF0.m);
            }
        }
        if (!c4309iF0.o.isEmpty()) {
            if (this.o.isEmpty()) {
                this.o = c4309iF0.o;
                this.d &= -1025;
            } else {
                if ((this.d & 1024) != 1024) {
                    this.o = new ArrayList(this.o);
                    this.d |= 1024;
                }
                this.o.addAll(c4309iF0.o);
            }
        }
        if ((c4309iF0.c & 128) == 128) {
            GF0 gf02 = c4309iF0.p;
            if ((this.d & 2048) != 2048 || (gf0 = this.p) == GF0.g) {
                this.p = gf02;
            } else {
                PE0 pe0I = GF0.i(gf0);
                pe0I.q(gf02);
                this.p = pe0I.m();
            }
            this.d |= 2048;
        }
        if (!c4309iF0.q.isEmpty()) {
            if (this.q.isEmpty()) {
                this.q = c4309iF0.q;
                this.d &= -4097;
            } else {
                if ((this.d & 4096) != 4096) {
                    this.q = new ArrayList(this.q);
                    this.d |= 4096;
                }
                this.q.addAll(c4309iF0.q);
            }
        }
        if ((c4309iF0.c & 256) == 256) {
            XE0 xe02 = c4309iF0.r;
            if ((this.d & 8192) != 8192 || (xe0 = this.r) == XE0.e) {
                this.r = xe02;
            } else {
                WE0 we0 = new WE0(0);
                we0.d = Collections.emptyList();
                we0.o(xe0);
                we0.o(xe02);
                this.r = we0.k();
            }
            this.d |= 8192;
        }
        k(c4309iF0);
        this.a = this.a.d(c4309iF0.b);
    }
}
