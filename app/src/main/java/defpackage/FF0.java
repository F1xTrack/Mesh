package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class FF0 extends AbstractC7709w00 {
    public static final FF0 m;
    public static final C8019xd0 n = new C8019xd0(24);
    public final AbstractC0596Hk b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public EF0 g;
    public List h;
    public List i;
    public int j;
    public byte k;
    public int l;

    static {
        FF0 ff0 = new FF0();
        m = ff0;
        ff0.d = 0;
        ff0.e = 0;
        ff0.f = false;
        ff0.g = EF0.INV;
        ff0.h = Collections.emptyList();
        ff0.i = Collections.emptyList();
    }

    public FF0(DF0 df0) {
        super(df0);
        this.j = -1;
        this.k = (byte) -1;
        this.l = -1;
        this.b = df0.a;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final K0 a() {
        return m;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.l;
        if (i != -1) {
            return i;
        }
        int iE = (this.c & 1) == 1 ? J9.e(1, this.d) : 0;
        if ((this.c & 2) == 2) {
            iE += J9.e(2, this.e);
        }
        if ((this.c & 4) == 4) {
            iE += J9.k(3) + 1;
        }
        if ((this.c & 8) == 8) {
            iE += J9.c(4, this.g.a);
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            iE += J9.g(5, (K0) this.h.get(i2));
        }
        int iF = 0;
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            iF += J9.f(((Integer) this.i.get(i3)).intValue());
        }
        int iF2 = iE + iF;
        if (!this.i.isEmpty()) {
            iF2 = iF2 + 1 + J9.f(iF);
        }
        this.j = iF;
        int size = this.b.size() + j() + iF2;
        this.l = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return DF0.m();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        DF0 df0M = DF0.m();
        df0M.n(this);
        return df0M;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final boolean e() {
        byte b = this.k;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.c;
        if ((i & 1) != 1) {
            this.k = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.k = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if (!((AF0) this.h.get(i2)).e()) {
                this.k = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.k = (byte) 1;
            return true;
        }
        this.k = (byte) 0;
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
        if ((this.c & 4) == 4) {
            boolean z = this.f;
            j9.H(3, 0);
            j9.A(z ? 1 : 0);
        }
        if ((this.c & 8) == 8) {
            j9.v(4, this.g.a);
        }
        for (int i = 0; i < this.h.size(); i++) {
            j9.y(5, (K0) this.h.get(i));
        }
        if (this.i.size() > 0) {
            j9.F(50);
            j9.F(this.j);
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            j9.x(((Integer) this.i.get(i2)).intValue());
        }
        c3383dO1.K(1000, j9);
        j9.B(this.b);
    }

    public FF0() {
        this.j = -1;
        this.k = (byte) -1;
        this.l = -1;
        this.b = AbstractC0596Hk.a;
    }

    public FF0(C5780lu c5780lu, DR dr) {
        EF0 ef0;
        this.j = -1;
        this.k = (byte) -1;
        this.l = -1;
        this.d = 0;
        this.e = 0;
        this.f = false;
        EF0 ef02 = EF0.INV;
        this.g = ef02;
        this.h = Collections.emptyList();
        this.i = Collections.emptyList();
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iN = c5780lu.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.c |= 1;
                                this.d = c5780lu.k();
                            } else if (iN == 16) {
                                this.c |= 2;
                                this.e = c5780lu.k();
                            } else if (iN == 24) {
                                this.c |= 4;
                                this.f = c5780lu.l() != 0;
                            } else if (iN == 32) {
                                int iK = c5780lu.k();
                                if (iK == 0) {
                                    ef0 = EF0.IN;
                                } else if (iK != 1) {
                                    ef0 = iK != 2 ? null : ef02;
                                } else {
                                    ef0 = EF0.OUT;
                                }
                                if (ef0 == null) {
                                    j9N.F(iN);
                                    j9N.F(iK);
                                } else {
                                    this.c |= 8;
                                    this.g = ef0;
                                }
                            } else if (iN == 42) {
                                if ((i & 16) != 16) {
                                    this.h = new ArrayList();
                                    i |= 16;
                                }
                                this.h.add(c5780lu.g(AF0.u, dr));
                            } else if (iN == 48) {
                                if ((i & 32) != 32) {
                                    this.i = new ArrayList();
                                    i |= 32;
                                }
                                this.i.add(Integer.valueOf(c5780lu.k()));
                            } else if (iN != 50) {
                                if (!n(c5780lu, j9N, dr, iN)) {
                                }
                            } else {
                                int iD = c5780lu.d(c5780lu.k());
                                if ((i & 32) != 32 && c5780lu.b() > 0) {
                                    this.i = new ArrayList();
                                    i |= 32;
                                }
                                while (c5780lu.b() > 0) {
                                    this.i.add(Integer.valueOf(c5780lu.k()));
                                }
                                c5780lu.c(iD);
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        Y90 y90 = new Y90(e.getMessage());
                        y90.a = this;
                        throw y90;
                    }
                } catch (Y90 e2) {
                    e2.a = this;
                    throw e2;
                }
            } catch (Throwable th) {
                if ((i & 16) == 16) {
                    this.h = Collections.unmodifiableList(this.h);
                }
                if ((i & 32) == 32) {
                    this.i = Collections.unmodifiableList(this.i);
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
        if ((i & 16) == 16) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if ((i & 32) == 32) {
            this.i = Collections.unmodifiableList(this.i);
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
