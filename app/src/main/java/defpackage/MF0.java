package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class MF0 extends A00 {
    public static final MF0 k;
    public static final C8019xd0 l = new C8019xd0(27);
    public final AbstractC0596Hk a;
    public int b;
    public int c;
    public int d;
    public KF0 e;
    public int f;
    public int g;
    public LF0 h;
    public byte i;
    public int j;

    static {
        MF0 mf0 = new MF0();
        k = mf0;
        mf0.c = 0;
        mf0.d = 0;
        mf0.e = KF0.ERROR;
        mf0.f = 0;
        mf0.g = 0;
        mf0.h = LF0.LANGUAGE_VERSION;
    }

    public MF0() {
        this.i = (byte) -1;
        this.j = -1;
        this.a = AbstractC0596Hk.a;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.j;
        if (i != -1) {
            return i;
        }
        int iE = (this.b & 1) == 1 ? J9.e(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            iE += J9.e(2, this.d);
        }
        if ((this.b & 4) == 4) {
            iE += J9.c(3, this.e.a);
        }
        if ((this.b & 8) == 8) {
            iE += J9.e(4, this.f);
        }
        if ((this.b & 16) == 16) {
            iE += J9.e(5, this.g);
        }
        if ((this.b & 32) == 32) {
            iE += J9.c(6, this.h.a);
        }
        int size = this.a.size() + iE;
        this.j = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return JF0.l();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        JF0 jf0L = JF0.l();
        jf0L.m(this);
        return jf0L;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final boolean e() {
        byte b = this.i;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.i = (byte) 1;
        return true;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        if ((this.b & 1) == 1) {
            j9.w(1, this.c);
        }
        if ((this.b & 2) == 2) {
            j9.w(2, this.d);
        }
        if ((this.b & 4) == 4) {
            j9.v(3, this.e.a);
        }
        if ((this.b & 8) == 8) {
            j9.w(4, this.f);
        }
        if ((this.b & 16) == 16) {
            j9.w(5, this.g);
        }
        if ((this.b & 32) == 32) {
            j9.v(6, this.h.a);
        }
        j9.B(this.a);
    }

    public MF0(C5780lu c5780lu) {
        this.i = (byte) -1;
        this.j = -1;
        boolean z = false;
        this.c = 0;
        this.d = 0;
        KF0 kf0 = KF0.ERROR;
        this.e = kf0;
        this.f = 0;
        this.g = 0;
        LF0 lf0 = LF0.LANGUAGE_VERSION;
        this.h = lf0;
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        while (!z) {
            try {
                try {
                    int iN = c5780lu.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.b |= 1;
                            this.c = c5780lu.k();
                        } else if (iN != 16) {
                            LF0 lf02 = null;
                            KF0 kf02 = null;
                            if (iN == 24) {
                                int iK = c5780lu.k();
                                if (iK == 0) {
                                    kf02 = KF0.WARNING;
                                } else if (iK == 1) {
                                    kf02 = kf0;
                                } else if (iK == 2) {
                                    kf02 = KF0.HIDDEN;
                                }
                                if (kf02 == null) {
                                    j9N.F(iN);
                                    j9N.F(iK);
                                } else {
                                    this.b |= 4;
                                    this.e = kf02;
                                }
                            } else if (iN == 32) {
                                this.b |= 8;
                                this.f = c5780lu.k();
                            } else if (iN == 40) {
                                this.b |= 16;
                                this.g = c5780lu.k();
                            } else if (iN != 48) {
                                if (!c5780lu.q(iN, j9N)) {
                                }
                            } else {
                                int iK2 = c5780lu.k();
                                if (iK2 == 0) {
                                    lf02 = lf0;
                                } else if (iK2 == 1) {
                                    lf02 = LF0.COMPILER_VERSION;
                                } else if (iK2 == 2) {
                                    lf02 = LF0.API_VERSION;
                                }
                                if (lf02 == null) {
                                    j9N.F(iN);
                                    j9N.F(iK2);
                                } else {
                                    this.b |= 32;
                                    this.h = lf02;
                                }
                            }
                        } else {
                            this.b |= 2;
                            this.d = c5780lu.k();
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
                try {
                    j9N.m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.a = c0518Gk.n();
                    throw th2;
                }
                this.a = c0518Gk.n();
                throw th;
            }
        }
        try {
            j9N.m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.a = c0518Gk.n();
            throw th3;
        }
        this.a = c0518Gk.n();
    }

    public MF0(JF0 jf0) {
        this.i = (byte) -1;
        this.j = -1;
        this.a = jf0.a;
    }
}
