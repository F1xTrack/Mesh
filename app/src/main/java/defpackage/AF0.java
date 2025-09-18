package defpackage;

import com.facebook.crypto.mac.NativeMac;
import io.appmetrica.analytics.impl.C4473c9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class AF0 extends AbstractC7709w00 {
    public static final AF0 t;
    public static final C8019xd0 u = new C8019xd0(21);
    public final AbstractC0596Hk b;
    public int c;
    public List d;
    public boolean e;
    public int f;
    public AF0 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public AF0 m;
    public int n;
    public AF0 o;
    public int p;
    public int q;
    public byte r;
    public int s;

    static {
        AF0 af0 = new AF0();
        t = af0;
        af0.q();
    }

    public AF0(C8327zF0 c8327zF0) {
        super(c8327zF0);
        this.r = (byte) -1;
        this.s = -1;
        this.b = c8327zF0.a;
    }

    public static C8327zF0 r(AF0 af0) {
        C8327zF0 c8327zF0M = C8327zF0.m();
        c8327zF0M.n(af0);
        return c8327zF0M;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final K0 a() {
        return t;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.s;
        if (i != -1) {
            return i;
        }
        int iE = (this.c & 4096) == 4096 ? J9.e(1, this.q) : 0;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            iE += J9.g(2, (K0) this.d.get(i2));
        }
        if ((this.c & 1) == 1) {
            iE += J9.k(3) + 1;
        }
        if ((this.c & 2) == 2) {
            iE += J9.e(4, this.f);
        }
        if ((this.c & 4) == 4) {
            iE += J9.g(5, this.g);
        }
        if ((this.c & 16) == 16) {
            iE += J9.e(6, this.i);
        }
        if ((this.c & 32) == 32) {
            iE += J9.e(7, this.j);
        }
        if ((this.c & 8) == 8) {
            iE += J9.e(8, this.h);
        }
        if ((this.c & 64) == 64) {
            iE += J9.e(9, this.k);
        }
        if ((this.c & 256) == 256) {
            iE += J9.g(10, this.m);
        }
        if ((this.c & 512) == 512) {
            iE += J9.e(11, this.n);
        }
        if ((this.c & 128) == 128) {
            iE += J9.e(12, this.l);
        }
        if ((this.c & 1024) == 1024) {
            iE += J9.g(13, this.o);
        }
        if ((this.c & 2048) == 2048) {
            iE += J9.e(14, this.p);
        }
        int size = this.b.size() + j() + iE;
        this.s = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return C8327zF0.m();
    }

    @Override // defpackage.InterfaceC6917rr0
    public final boolean e() {
        byte b = this.r;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.d.size(); i++) {
            if (!((C8137yF0) this.d.get(i)).e()) {
                this.r = (byte) 0;
                return false;
            }
        }
        if ((this.c & 4) == 4 && !this.g.e()) {
            this.r = (byte) 0;
            return false;
        }
        if ((this.c & 256) == 256 && !this.m.e()) {
            this.r = (byte) 0;
            return false;
        }
        if ((this.c & 1024) == 1024 && !this.o.e()) {
            this.r = (byte) 0;
            return false;
        }
        if (i()) {
            this.r = (byte) 1;
            return true;
        }
        this.r = (byte) 0;
        return false;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        C3383dO1 c3383dO1 = new C3383dO1(this);
        if ((this.c & 4096) == 4096) {
            j9.w(1, this.q);
        }
        for (int i = 0; i < this.d.size(); i++) {
            j9.y(2, (K0) this.d.get(i));
        }
        if ((this.c & 1) == 1) {
            boolean z = this.e;
            j9.H(3, 0);
            j9.A(z ? 1 : 0);
        }
        if ((this.c & 2) == 2) {
            j9.w(4, this.f);
        }
        if ((this.c & 4) == 4) {
            j9.y(5, this.g);
        }
        if ((this.c & 16) == 16) {
            j9.w(6, this.i);
        }
        if ((this.c & 32) == 32) {
            j9.w(7, this.j);
        }
        if ((this.c & 8) == 8) {
            j9.w(8, this.h);
        }
        if ((this.c & 64) == 64) {
            j9.w(9, this.k);
        }
        if ((this.c & 256) == 256) {
            j9.y(10, this.m);
        }
        if ((this.c & 512) == 512) {
            j9.w(11, this.n);
        }
        if ((this.c & 128) == 128) {
            j9.w(12, this.l);
        }
        if ((this.c & 1024) == 1024) {
            j9.y(13, this.o);
        }
        if ((this.c & 2048) == 2048) {
            j9.w(14, this.p);
        }
        c3383dO1.K(200, j9);
        j9.B(this.b);
    }

    public final boolean p() {
        return (this.c & 16) == 16;
    }

    public final void q() {
        this.d = Collections.emptyList();
        this.e = false;
        this.f = 0;
        AF0 af0 = t;
        this.g = af0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = af0;
        this.n = 0;
        this.o = af0;
        this.p = 0;
        this.q = 0;
    }

    @Override // defpackage.K0
    /* renamed from: s */
    public final C8327zF0 d() {
        return r(this);
    }

    public AF0() {
        this.r = (byte) -1;
        this.s = -1;
        this.b = AbstractC0596Hk.a;
    }

    public AF0(C5780lu c5780lu, DR dr) {
        this.r = (byte) -1;
        this.s = -1;
        q();
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iN = c5780lu.n();
                    C8019xd0 c8019xd0 = u;
                    C8327zF0 c8327zF0R = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.c |= 4096;
                            this.q = c5780lu.k();
                            continue;
                        case 18:
                            if (!z2) {
                                this.d = new ArrayList();
                                z2 = true;
                            }
                            this.d.add(c5780lu.g(C8137yF0.i, dr));
                            continue;
                        case 24:
                            this.c |= 1;
                            this.e = c5780lu.l() != 0;
                            continue;
                        case 32:
                            this.c |= 2;
                            this.f = c5780lu.k();
                            continue;
                        case C4473c9.M /* 42 */:
                            if ((this.c & 4) == 4) {
                                AF0 af0 = this.g;
                                af0.getClass();
                                c8327zF0R = r(af0);
                            }
                            AF0 af02 = (AF0) c5780lu.g(c8019xd0, dr);
                            this.g = af02;
                            if (c8327zF0R != null) {
                                c8327zF0R.n(af02);
                                this.g = c8327zF0R.l();
                            }
                            this.c |= 4;
                            continue;
                        case 48:
                            this.c |= 16;
                            this.i = c5780lu.k();
                            continue;
                        case 56:
                            this.c |= 32;
                            this.j = c5780lu.k();
                            continue;
                        case NativeMac.KEY_LENGTH /* 64 */:
                            this.c |= 8;
                            this.h = c5780lu.k();
                            continue;
                        case 72:
                            this.c |= 64;
                            this.k = c5780lu.k();
                            continue;
                        case 82:
                            if ((this.c & 256) == 256) {
                                AF0 af03 = this.m;
                                af03.getClass();
                                c8327zF0R = r(af03);
                            }
                            AF0 af04 = (AF0) c5780lu.g(c8019xd0, dr);
                            this.m = af04;
                            if (c8327zF0R != null) {
                                c8327zF0R.n(af04);
                                this.m = c8327zF0R.l();
                            }
                            this.c |= 256;
                            continue;
                        case 88:
                            this.c |= 512;
                            this.n = c5780lu.k();
                            continue;
                        case 96:
                            this.c |= 128;
                            this.l = c5780lu.k();
                            continue;
                        case 106:
                            if ((this.c & 1024) == 1024) {
                                AF0 af05 = this.o;
                                af05.getClass();
                                c8327zF0R = r(af05);
                            }
                            AF0 af06 = (AF0) c5780lu.g(c8019xd0, dr);
                            this.o = af06;
                            if (c8327zF0R != null) {
                                c8327zF0R.n(af06);
                                this.o = c8327zF0R.l();
                            }
                            this.c |= 1024;
                            continue;
                        case 112:
                            this.c |= 2048;
                            this.p = c5780lu.k();
                            continue;
                        default:
                            if (!n(c5780lu, j9N, dr, iN)) {
                                break;
                            }
                    }
                    z = true;
                } catch (Y90 e) {
                    e.a = this;
                    throw e;
                } catch (IOException e2) {
                    Y90 y90 = new Y90(e2.getMessage());
                    y90.a = this;
                    throw y90;
                }
            } catch (Throwable th) {
                if (z2) {
                    this.d = Collections.unmodifiableList(this.d);
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
        }
        if (z2) {
            this.d = Collections.unmodifiableList(this.d);
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
    }
}
