package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class IF0 extends AbstractC7709w00 {
    public static final IF0 l;
    public static final C8019xd0 m = new C8019xd0(26);
    public final AbstractC0596Hk b;
    public int c;
    public int d;
    public int e;
    public AF0 f;
    public int g;
    public AF0 h;
    public int i;
    public byte j;
    public int k;

    static {
        IF0 if0 = new IF0();
        l = if0;
        if0.d = 0;
        if0.e = 0;
        AF0 af0 = AF0.t;
        if0.f = af0;
        if0.g = 0;
        if0.h = af0;
        if0.i = 0;
    }

    public IF0(HF0 hf0) {
        super(hf0);
        this.j = (byte) -1;
        this.k = -1;
        this.b = hf0.a;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final K0 a() {
        return l;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.k;
        if (i != -1) {
            return i;
        }
        int iE = (this.c & 1) == 1 ? J9.e(1, this.d) : 0;
        if ((this.c & 2) == 2) {
            iE += J9.e(2, this.e);
        }
        if ((this.c & 4) == 4) {
            iE += J9.g(3, this.f);
        }
        if ((this.c & 16) == 16) {
            iE += J9.g(4, this.h);
        }
        if ((this.c & 8) == 8) {
            iE += J9.e(5, this.g);
        }
        if ((this.c & 32) == 32) {
            iE += J9.e(6, this.i);
        }
        int size = this.b.size() + j() + iE;
        this.k = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        HF0 hf0 = new HF0();
        AF0 af0 = AF0.t;
        hf0.g = af0;
        hf0.i = af0;
        return hf0;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        HF0 hf0 = new HF0();
        AF0 af0 = AF0.t;
        hf0.g = af0;
        hf0.i = af0;
        hf0.m(this);
        return hf0;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final boolean e() {
        byte b = this.j;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.c;
        if ((i & 2) != 2) {
            this.j = (byte) 0;
            return false;
        }
        if ((i & 4) == 4 && !this.f.e()) {
            this.j = (byte) 0;
            return false;
        }
        if ((this.c & 16) == 16 && !this.h.e()) {
            this.j = (byte) 0;
            return false;
        }
        if (i()) {
            this.j = (byte) 1;
            return true;
        }
        this.j = (byte) 0;
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
            j9.y(3, this.f);
        }
        if ((this.c & 16) == 16) {
            j9.y(4, this.h);
        }
        if ((this.c & 8) == 8) {
            j9.w(5, this.g);
        }
        if ((this.c & 32) == 32) {
            j9.w(6, this.i);
        }
        c3383dO1.K(200, j9);
        j9.B(this.b);
    }

    public IF0() {
        this.j = (byte) -1;
        this.k = -1;
        this.b = AbstractC0596Hk.a;
    }

    public IF0(C5780lu c5780lu, DR dr) {
        this.j = (byte) -1;
        this.k = -1;
        boolean z = false;
        this.d = 0;
        this.e = 0;
        AF0 af0 = AF0.t;
        this.f = af0;
        this.g = 0;
        this.h = af0;
        this.i = 0;
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iN = c5780lu.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.c |= 1;
                                this.d = c5780lu.k();
                            } else if (iN != 16) {
                                C8327zF0 c8327zF0R = null;
                                if (iN == 26) {
                                    if ((this.c & 4) == 4) {
                                        AF0 af02 = this.f;
                                        af02.getClass();
                                        c8327zF0R = AF0.r(af02);
                                    }
                                    AF0 af03 = (AF0) c5780lu.g(AF0.u, dr);
                                    this.f = af03;
                                    if (c8327zF0R != null) {
                                        c8327zF0R.n(af03);
                                        this.f = c8327zF0R.l();
                                    }
                                    this.c |= 4;
                                } else if (iN == 34) {
                                    if ((this.c & 16) == 16) {
                                        AF0 af04 = this.h;
                                        af04.getClass();
                                        c8327zF0R = AF0.r(af04);
                                    }
                                    AF0 af05 = (AF0) c5780lu.g(AF0.u, dr);
                                    this.h = af05;
                                    if (c8327zF0R != null) {
                                        c8327zF0R.n(af05);
                                        this.h = c8327zF0R.l();
                                    }
                                    this.c |= 16;
                                } else if (iN == 40) {
                                    this.c |= 8;
                                    this.g = c5780lu.k();
                                } else if (iN != 48) {
                                    if (!n(c5780lu, j9N, dr, iN)) {
                                    }
                                } else {
                                    this.c |= 32;
                                    this.i = c5780lu.k();
                                }
                            } else {
                                this.c |= 2;
                                this.e = c5780lu.k();
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
