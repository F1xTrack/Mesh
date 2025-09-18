package defpackage;

import java.io.IOException;

/* renamed from: Cd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0186Cd0 extends A00 {
    public static final C0186Cd0 j;
    public static final C8019xd0 k = new C8019xd0(2);
    public final AbstractC0596Hk a;
    public int b;
    public C8399zd0 c;
    public C0030Ad0 d;
    public C0030Ad0 e;
    public C0030Ad0 f;
    public C0030Ad0 g;
    public byte h;
    public int i;

    static {
        C0186Cd0 c0186Cd0 = new C0186Cd0();
        j = c0186Cd0;
        c0186Cd0.c = C8399zd0.g;
        C0030Ad0 c0030Ad0 = C0030Ad0.g;
        c0186Cd0.d = c0030Ad0;
        c0186Cd0.e = c0030Ad0;
        c0186Cd0.f = c0030Ad0;
        c0186Cd0.g = c0030Ad0;
    }

    public C0186Cd0() {
        this.h = (byte) -1;
        this.i = -1;
        this.a = AbstractC0596Hk.a;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        int iG = (this.b & 1) == 1 ? J9.g(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            iG += J9.g(2, this.d);
        }
        if ((this.b & 4) == 4) {
            iG += J9.g(3, this.e);
        }
        if ((this.b & 8) == 8) {
            iG += J9.g(4, this.f);
        }
        if ((this.b & 16) == 16) {
            iG += J9.g(5, this.g);
        }
        int size = this.a.size() + iG;
        this.i = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return C0108Bd0.l();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        C0108Bd0 c0108Bd0L = C0108Bd0.l();
        c0108Bd0L.m(this);
        return c0108Bd0L;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final boolean e() {
        byte b = this.h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.h = (byte) 1;
        return true;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        if ((this.b & 1) == 1) {
            j9.y(1, this.c);
        }
        if ((this.b & 2) == 2) {
            j9.y(2, this.d);
        }
        if ((this.b & 4) == 4) {
            j9.y(3, this.e);
        }
        if ((this.b & 8) == 8) {
            j9.y(4, this.f);
        }
        if ((this.b & 16) == 16) {
            j9.y(5, this.g);
        }
        j9.B(this.a);
    }

    public C0186Cd0(C5780lu c5780lu, DR dr) {
        this.h = (byte) -1;
        this.i = -1;
        this.c = C8399zd0.g;
        C0030Ad0 c0030Ad0 = C0030Ad0.g;
        this.d = c0030Ad0;
        this.e = c0030Ad0;
        this.f = c0030Ad0;
        this.g = c0030Ad0;
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iN = c5780lu.n();
                    if (iN != 0) {
                        C8209yd0 c8209yd0I = null;
                        if (iN == 10) {
                            if ((this.b & 1) == 1) {
                                C8399zd0 c8399zd0 = this.c;
                                c8399zd0.getClass();
                                c8209yd0I = new C8209yd0(0);
                                c8209yd0I.m(c8399zd0);
                            }
                            C8399zd0 c8399zd02 = (C8399zd0) c5780lu.g(C8399zd0.h, dr);
                            this.c = c8399zd02;
                            if (c8209yd0I != null) {
                                c8209yd0I.m(c8399zd02);
                                this.c = c8209yd0I.k();
                            }
                            this.b |= 1;
                        } else if (iN == 18) {
                            if ((this.b & 2) == 2) {
                                C0030Ad0 c0030Ad02 = this.d;
                                c0030Ad02.getClass();
                                c8209yd0I = C0030Ad0.i(c0030Ad02);
                            }
                            C0030Ad0 c0030Ad03 = (C0030Ad0) c5780lu.g(C0030Ad0.h, dr);
                            this.d = c0030Ad03;
                            if (c8209yd0I != null) {
                                c8209yd0I.n(c0030Ad03);
                                this.d = c8209yd0I.l();
                            }
                            this.b |= 2;
                        } else if (iN == 26) {
                            if ((this.b & 4) == 4) {
                                C0030Ad0 c0030Ad04 = this.e;
                                c0030Ad04.getClass();
                                c8209yd0I = C0030Ad0.i(c0030Ad04);
                            }
                            C0030Ad0 c0030Ad05 = (C0030Ad0) c5780lu.g(C0030Ad0.h, dr);
                            this.e = c0030Ad05;
                            if (c8209yd0I != null) {
                                c8209yd0I.n(c0030Ad05);
                                this.e = c8209yd0I.l();
                            }
                            this.b |= 4;
                        } else if (iN == 34) {
                            if ((this.b & 8) == 8) {
                                C0030Ad0 c0030Ad06 = this.f;
                                c0030Ad06.getClass();
                                c8209yd0I = C0030Ad0.i(c0030Ad06);
                            }
                            C0030Ad0 c0030Ad07 = (C0030Ad0) c5780lu.g(C0030Ad0.h, dr);
                            this.f = c0030Ad07;
                            if (c8209yd0I != null) {
                                c8209yd0I.n(c0030Ad07);
                                this.f = c8209yd0I.l();
                            }
                            this.b |= 8;
                        } else if (iN != 42) {
                            if (!c5780lu.q(iN, j9N)) {
                            }
                        } else {
                            if ((this.b & 16) == 16) {
                                C0030Ad0 c0030Ad08 = this.g;
                                c0030Ad08.getClass();
                                c8209yd0I = C0030Ad0.i(c0030Ad08);
                            }
                            C0030Ad0 c0030Ad09 = (C0030Ad0) c5780lu.g(C0030Ad0.h, dr);
                            this.g = c0030Ad09;
                            if (c8209yd0I != null) {
                                c8209yd0I.n(c0030Ad09);
                                this.g = c8209yd0I.l();
                            }
                            this.b |= 16;
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

    public C0186Cd0(C0108Bd0 c0108Bd0) {
        this.h = (byte) -1;
        this.i = -1;
        this.a = c0108Bd0.a;
    }
}
