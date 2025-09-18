package defpackage;

import io.appmetrica.analytics.impl.C4473c9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class CF0 extends AbstractC7709w00 {
    public static final CF0 o;
    public static final C8019xd0 p = new C8019xd0(23);
    public final AbstractC0596Hk b;
    public int c;
    public int d;
    public int e;
    public List f;
    public AF0 g;
    public int h;
    public AF0 i;
    public int j;
    public List k;
    public List l;
    public byte m;
    public int n;

    static {
        CF0 cf0 = new CF0();
        o = cf0;
        cf0.p();
    }

    public CF0(BF0 bf0) {
        super(bf0);
        this.m = (byte) -1;
        this.n = -1;
        this.b = bf0.a;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final K0 a() {
        return o;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.n;
        if (i != -1) {
            return i;
        }
        int iE = (this.c & 1) == 1 ? J9.e(1, this.d) : 0;
        if ((this.c & 2) == 2) {
            iE += J9.e(2, this.e);
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            iE += J9.g(3, (K0) this.f.get(i2));
        }
        if ((this.c & 4) == 4) {
            iE += J9.g(4, this.g);
        }
        if ((this.c & 8) == 8) {
            iE += J9.e(5, this.h);
        }
        if ((this.c & 16) == 16) {
            iE += J9.g(6, this.i);
        }
        if ((this.c & 32) == 32) {
            iE += J9.e(7, this.j);
        }
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            iE += J9.g(8, (K0) this.k.get(i3));
        }
        int iF = 0;
        for (int i4 = 0; i4 < this.l.size(); i4++) {
            iF += J9.f(((Integer) this.l.get(i4)).intValue());
        }
        int size = this.b.size() + j() + (this.l.size() * 2) + iE + iF;
        this.n = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return BF0.m();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        BF0 bf0M = BF0.m();
        bf0M.n(this);
        return bf0M;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final boolean e() {
        byte b = this.m;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.c & 2) != 2) {
            this.m = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f.size(); i++) {
            if (!((FF0) this.f.get(i)).e()) {
                this.m = (byte) 0;
                return false;
            }
        }
        if ((this.c & 4) == 4 && !this.g.e()) {
            this.m = (byte) 0;
            return false;
        }
        if ((this.c & 16) == 16 && !this.i.e()) {
            this.m = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            if (!((QE0) this.k.get(i2)).e()) {
                this.m = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.m = (byte) 1;
            return true;
        }
        this.m = (byte) 0;
        return false;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        C3383dO1 c3383dO1 = new C3383dO1(this);
        if ((this.c & 1) == 1) {
            j9.w(1, this.d);
        }
        if ((this.c & 2) == 2) {
            j9.w(2, this.e);
        }
        for (int i = 0; i < this.f.size(); i++) {
            j9.y(3, (K0) this.f.get(i));
        }
        if ((this.c & 4) == 4) {
            j9.y(4, this.g);
        }
        if ((this.c & 8) == 8) {
            j9.w(5, this.h);
        }
        if ((this.c & 16) == 16) {
            j9.y(6, this.i);
        }
        if ((this.c & 32) == 32) {
            j9.w(7, this.j);
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            j9.y(8, (K0) this.k.get(i2));
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            j9.w(31, ((Integer) this.l.get(i3)).intValue());
        }
        c3383dO1.K(200, j9);
        j9.B(this.b);
    }

    public final void p() {
        this.d = 6;
        this.e = 0;
        this.f = Collections.emptyList();
        AF0 af0 = AF0.t;
        this.g = af0;
        this.h = 0;
        this.i = af0;
        this.j = 0;
        this.k = Collections.emptyList();
        this.l = Collections.emptyList();
    }

    public CF0() {
        this.m = (byte) -1;
        this.n = -1;
        this.b = AbstractC0596Hk.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public CF0(C5780lu c5780lu, DR dr) {
        this.m = (byte) -1;
        this.n = -1;
        p();
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        boolean z = false;
        int i = 0;
        while (true) {
            ?? N = 128;
            if (!z) {
                try {
                    try {
                        int iN = c5780lu.n();
                        C8327zF0 c8327zF0R = null;
                        switch (iN) {
                            case 0:
                                z = true;
                            case 8:
                                this.c |= 1;
                                this.d = c5780lu.k();
                            case 16:
                                this.c |= 2;
                                this.e = c5780lu.k();
                            case 26:
                                if ((i & 4) != 4) {
                                    this.f = new ArrayList();
                                    i |= 4;
                                }
                                this.f.add(c5780lu.g(FF0.n, dr));
                            case 34:
                                if ((this.c & 4) == 4) {
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
                                this.c |= 4;
                            case C4473c9.L /* 40 */:
                                this.c |= 8;
                                this.h = c5780lu.k();
                            case 50:
                                if ((this.c & 16) == 16) {
                                    AF0 af03 = this.i;
                                    af03.getClass();
                                    c8327zF0R = AF0.r(af03);
                                }
                                AF0 af04 = (AF0) c5780lu.g(AF0.u, dr);
                                this.i = af04;
                                if (c8327zF0R != null) {
                                    c8327zF0R.n(af04);
                                    this.i = c8327zF0R.l();
                                }
                                this.c |= 16;
                            case 56:
                                this.c |= 32;
                                this.j = c5780lu.k();
                            case 66:
                                if ((i & 128) != 128) {
                                    this.k = new ArrayList();
                                    i |= 128;
                                }
                                this.k.add(c5780lu.g(QE0.h, dr));
                            case 248:
                                if ((i & 256) != 256) {
                                    this.l = new ArrayList();
                                    i |= 256;
                                }
                                this.l.add(Integer.valueOf(c5780lu.k()));
                            case 250:
                                int iD = c5780lu.d(c5780lu.k());
                                if ((i & 256) != 256 && c5780lu.b() > 0) {
                                    this.l = new ArrayList();
                                    i |= 256;
                                }
                                while (c5780lu.b() > 0) {
                                    this.l.add(Integer.valueOf(c5780lu.k()));
                                }
                                c5780lu.c(iD);
                                break;
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
                    if ((i & 4) == 4) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
                    if ((i & 128) == N) {
                        this.k = Collections.unmodifiableList(this.k);
                    }
                    if ((i & 256) == 256) {
                        this.l = Collections.unmodifiableList(this.l);
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
                if ((i & 4) == 4) {
                    this.f = Collections.unmodifiableList(this.f);
                }
                if ((i & 128) == 128) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if ((i & 256) == 256) {
                    this.l = Collections.unmodifiableList(this.l);
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
