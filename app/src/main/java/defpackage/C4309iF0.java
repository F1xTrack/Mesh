package defpackage;

import com.facebook.crypto.mac.NativeMac;
import io.appmetrica.analytics.impl.C4473c9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: iF0 */
/* loaded from: classes2.dex */
public final class C4309iF0 extends AbstractC7709w00 {
    public static final C4309iF0 u;
    public static final C8019xd0 v = new C8019xd0(14);
    public final AbstractC0596Hk b;
    public int c;
    public int d;
    public int e;
    public int f;
    public AF0 g;
    public int h;
    public List i;
    public AF0 j;
    public int k;
    public List l;
    public List m;
    public int n;
    public List o;
    public GF0 p;
    public List q;
    public XE0 r;
    public byte s;
    public int t;

    static {
        C4309iF0 c4309iF0 = new C4309iF0();
        u = c4309iF0;
        c4309iF0.q();
    }

    public C4309iF0(C4118hF0 c4118hF0) {
        super(c4118hF0);
        this.n = -1;
        this.s = (byte) -1;
        this.t = -1;
        this.b = c4118hF0.a;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final K0 a() {
        return u;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.t;
        if (i != -1) {
            return i;
        }
        int iE = (this.c & 2) == 2 ? J9.e(1, this.e) : 0;
        if ((this.c & 4) == 4) {
            iE += J9.e(2, this.f);
        }
        if ((this.c & 8) == 8) {
            iE += J9.g(3, this.g);
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            iE += J9.g(4, (K0) this.i.get(i2));
        }
        if ((this.c & 32) == 32) {
            iE += J9.g(5, this.j);
        }
        for (int i3 = 0; i3 < this.o.size(); i3++) {
            iE += J9.g(6, (K0) this.o.get(i3));
        }
        if ((this.c & 16) == 16) {
            iE += J9.e(7, this.h);
        }
        if ((this.c & 64) == 64) {
            iE += J9.e(8, this.k);
        }
        if ((this.c & 1) == 1) {
            iE += J9.e(9, this.d);
        }
        for (int i4 = 0; i4 < this.l.size(); i4++) {
            iE += J9.g(10, (K0) this.l.get(i4));
        }
        int iF = 0;
        for (int i5 = 0; i5 < this.m.size(); i5++) {
            iF += J9.f(((Integer) this.m.get(i5)).intValue());
        }
        int iG = iE + iF;
        if (!this.m.isEmpty()) {
            iG = iG + 1 + J9.f(iF);
        }
        this.n = iF;
        if ((this.c & 128) == 128) {
            iG += J9.g(30, this.p);
        }
        int iF2 = 0;
        for (int i6 = 0; i6 < this.q.size(); i6++) {
            iF2 += J9.f(((Integer) this.q.get(i6)).intValue());
        }
        int size = (this.q.size() * 2) + iG + iF2;
        if ((this.c & 256) == 256) {
            size += J9.g(32, this.r);
        }
        int size2 = this.b.size() + j() + size;
        this.t = size2;
        return size2;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return C4118hF0.m();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        C4118hF0 c4118hF0M = C4118hF0.m();
        c4118hF0M.n(this);
        return c4118hF0M;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final boolean e() {
        byte b = this.s;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.c;
        if ((i & 4) != 4) {
            this.s = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.g.e()) {
            this.s = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (!((FF0) this.i.get(i2)).e()) {
                this.s = (byte) 0;
                return false;
            }
        }
        if (p() && !this.j.e()) {
            this.s = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            if (!((AF0) this.l.get(i3)).e()) {
                this.s = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.o.size(); i4++) {
            if (!((IF0) this.o.get(i4)).e()) {
                this.s = (byte) 0;
                return false;
            }
        }
        if ((this.c & 128) == 128 && !this.p.e()) {
            this.s = (byte) 0;
            return false;
        }
        if ((this.c & 256) == 256 && !this.r.e()) {
            this.s = (byte) 0;
            return false;
        }
        if (i()) {
            this.s = (byte) 1;
            return true;
        }
        this.s = (byte) 0;
        return false;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        C3383dO1 c3383dO1 = new C3383dO1(this);
        if ((this.c & 2) == 2) {
            j9.w(1, this.e);
        }
        if ((this.c & 4) == 4) {
            j9.w(2, this.f);
        }
        if ((this.c & 8) == 8) {
            j9.y(3, this.g);
        }
        for (int i = 0; i < this.i.size(); i++) {
            j9.y(4, (K0) this.i.get(i));
        }
        if ((this.c & 32) == 32) {
            j9.y(5, this.j);
        }
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            j9.y(6, (K0) this.o.get(i2));
        }
        if ((this.c & 16) == 16) {
            j9.w(7, this.h);
        }
        if ((this.c & 64) == 64) {
            j9.w(8, this.k);
        }
        if ((this.c & 1) == 1) {
            j9.w(9, this.d);
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            j9.y(10, (K0) this.l.get(i3));
        }
        if (this.m.size() > 0) {
            j9.F(90);
            j9.F(this.n);
        }
        for (int i4 = 0; i4 < this.m.size(); i4++) {
            j9.x(((Integer) this.m.get(i4)).intValue());
        }
        if ((this.c & 128) == 128) {
            j9.y(30, this.p);
        }
        for (int i5 = 0; i5 < this.q.size(); i5++) {
            j9.w(31, ((Integer) this.q.get(i5)).intValue());
        }
        if ((this.c & 256) == 256) {
            j9.y(32, this.r);
        }
        c3383dO1.K(19000, j9);
        j9.B(this.b);
    }

    public final boolean p() {
        return (this.c & 32) == 32;
    }

    public final void q() {
        this.d = 6;
        this.e = 6;
        this.f = 0;
        AF0 af0 = AF0.t;
        this.g = af0;
        this.h = 0;
        this.i = Collections.emptyList();
        this.j = af0;
        this.k = 0;
        this.l = Collections.emptyList();
        this.m = Collections.emptyList();
        this.o = Collections.emptyList();
        this.p = GF0.g;
        this.q = Collections.emptyList();
        this.r = XE0.e;
    }

    public C4309iF0() {
        this.n = -1;
        this.s = (byte) -1;
        this.t = -1;
        this.b = AbstractC0596Hk.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public C4309iF0(C5780lu c5780lu, DR dr) {
        this.n = -1;
        this.s = (byte) -1;
        this.t = -1;
        q();
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        boolean z = false;
        char c = 0;
        while (true) {
            ?? N = 1024;
            if (!z) {
                try {
                    try {
                        int iN = c5780lu.n();
                        C8327zF0 c8327zF0R = null;
                        WE0 we0 = null;
                        PE0 pe0I = null;
                        C8327zF0 c8327zF0R2 = null;
                        switch (iN) {
                            case 0:
                                z = true;
                            case 8:
                                this.c |= 2;
                                this.e = c5780lu.k();
                            case 16:
                                this.c |= 4;
                                this.f = c5780lu.k();
                            case 26:
                                if ((this.c & 8) == 8) {
                                    AF0 af0 = this.g;
                                    af0.getClass();
                                    c8327zF0R = AF0.r(af0);
                                }
                                AF0 af02 = (AF0) c5780lu.g(AF0.u, dr);
                                this.g = af02;
                                if (c8327zF0R != null) {
                                    c8327zF0R.n(af02);
                                    this.g = c8327zF0R.l();
                                }
                                this.c |= 8;
                            case 34:
                                int i = (c == true ? 1 : 0) & 32;
                                c = c;
                                if (i != 32) {
                                    this.i = new ArrayList();
                                    c = (c == true ? 1 : 0) | ' ';
                                }
                                this.i.add(c5780lu.g(FF0.n, dr));
                            case C4473c9.M /* 42 */:
                                if ((this.c & 32) == 32) {
                                    AF0 af03 = this.j;
                                    af03.getClass();
                                    c8327zF0R2 = AF0.r(af03);
                                }
                                AF0 af04 = (AF0) c5780lu.g(AF0.u, dr);
                                this.j = af04;
                                if (c8327zF0R2 != null) {
                                    c8327zF0R2.n(af04);
                                    this.j = c8327zF0R2.l();
                                }
                                this.c |= 32;
                            case 50:
                                int i2 = (c == true ? 1 : 0) & 1024;
                                c = c;
                                if (i2 != 1024) {
                                    this.o = new ArrayList();
                                    c = (c == true ? 1 : 0) | 1024;
                                }
                                this.o.add(c5780lu.g(IF0.m, dr));
                            case 56:
                                this.c |= 16;
                                this.h = c5780lu.k();
                            case NativeMac.KEY_LENGTH /* 64 */:
                                this.c |= 64;
                                this.k = c5780lu.k();
                            case 72:
                                this.c |= 1;
                                this.d = c5780lu.k();
                            case 82:
                                int i3 = (c == true ? 1 : 0) & 256;
                                c = c;
                                if (i3 != 256) {
                                    this.l = new ArrayList();
                                    c = (c == true ? 1 : 0) | 256;
                                }
                                this.l.add(c5780lu.g(AF0.u, dr));
                            case 88:
                                int i4 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i4 != 512) {
                                    this.m = new ArrayList();
                                    c = (c == true ? 1 : 0) | 512;
                                }
                                this.m.add(Integer.valueOf(c5780lu.k()));
                            case 90:
                                int iD = c5780lu.d(c5780lu.k());
                                int i5 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i5 != 512) {
                                    c = c;
                                    if (c5780lu.b() > 0) {
                                        this.m = new ArrayList();
                                        c = (c == true ? 1 : 0) | 512;
                                    }
                                }
                                while (c5780lu.b() > 0) {
                                    this.m.add(Integer.valueOf(c5780lu.k()));
                                }
                                c5780lu.c(iD);
                            case 242:
                                if ((this.c & 128) == 128) {
                                    GF0 gf0 = this.p;
                                    gf0.getClass();
                                    pe0I = GF0.i(gf0);
                                }
                                GF0 gf02 = (GF0) c5780lu.g(GF0.h, dr);
                                this.p = gf02;
                                if (pe0I != null) {
                                    pe0I.q(gf02);
                                    this.p = pe0I.m();
                                }
                                this.c |= 128;
                            case 248:
                                int i6 = (c == true ? 1 : 0) & 4096;
                                c = c;
                                if (i6 != 4096) {
                                    this.q = new ArrayList();
                                    c = (c == true ? 1 : 0) | 4096;
                                }
                                this.q.add(Integer.valueOf(c5780lu.k()));
                            case 250:
                                int iD2 = c5780lu.d(c5780lu.k());
                                int i7 = (c == true ? 1 : 0) & 4096;
                                c = c;
                                if (i7 != 4096) {
                                    c = c;
                                    if (c5780lu.b() > 0) {
                                        this.q = new ArrayList();
                                        c = (c == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (c5780lu.b() > 0) {
                                    this.q.add(Integer.valueOf(c5780lu.k()));
                                }
                                c5780lu.c(iD2);
                            case 258:
                                if ((this.c & 256) == 256) {
                                    XE0 xe0 = this.r;
                                    xe0.getClass();
                                    we0 = new WE0(0);
                                    we0.d = Collections.emptyList();
                                    we0.o(xe0);
                                }
                                XE0 xe02 = (XE0) c5780lu.g(XE0.f, dr);
                                this.r = xe02;
                                if (we0 != null) {
                                    we0.o(xe02);
                                    this.r = we0.k();
                                }
                                this.c |= 256;
                            default:
                                N = n(c5780lu, j9N, dr, iN);
                                if (N == 0) {
                                    z = true;
                                }
                        }
                    } catch (Y90 e) {
                        e.a = this;
                        throw e;
                    } catch (IOException e2) {
                        Y90 y90 = new Y90(e2.getMessage());
                        y90.a = this;
                        throw y90;
                    }
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 32) == 32) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    if (((c == true ? 1 : 0) & 1024) == N) {
                        this.o = Collections.unmodifiableList(this.o);
                    }
                    if (((c == true ? 1 : 0) & 256) == 256) {
                        this.l = Collections.unmodifiableList(this.l);
                    }
                    if (((c == true ? 1 : 0) & 512) == 512) {
                        this.m = Collections.unmodifiableList(this.m);
                    }
                    if (((c == true ? 1 : 0) & 4096) == 4096) {
                        this.q = Collections.unmodifiableList(this.q);
                    }
                    try {
                        j9N.m();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.b = c0518Gk.n();
                        throw th2;
                    }
                    this.b = c0518Gk.n();
                    m();
                    throw th;
                }
            } else {
                if (((c == true ? 1 : 0) & 32) == 32) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if (((c == true ? 1 : 0) & 1024) == 1024) {
                    this.o = Collections.unmodifiableList(this.o);
                }
                if (((c == true ? 1 : 0) & 256) == 256) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                if (((c == true ? 1 : 0) & 512) == 512) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if (((c == true ? 1 : 0) & 4096) == 4096) {
                    this.q = Collections.unmodifiableList(this.q);
                }
                try {
                    j9N.m();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.b = c0518Gk.n();
                    throw th3;
                }
                this.b = c0518Gk.n();
                m();
                return;
            }
        }
    }
}
