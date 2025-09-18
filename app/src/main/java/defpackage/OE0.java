package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class OE0 extends A00 {
    public static final OE0 g;
    public static final C8019xd0 h = new C8019xd0(6);
    public final AbstractC0596Hk a;
    public int b;
    public int c;
    public NE0 d;
    public byte e;
    public int f;

    static {
        OE0 oe0 = new OE0();
        g = oe0;
        oe0.c = 0;
        oe0.d = NE0.p;
    }

    public OE0() {
        this.e = (byte) -1;
        this.f = -1;
        this.a = AbstractC0596Hk.a;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.f;
        if (i != -1) {
            return i;
        }
        int iE = (this.b & 1) == 1 ? J9.e(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            iE += J9.g(2, this.d);
        }
        int size = this.a.size() + iE;
        this.f = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        PE0 pe0 = new PE0(2);
        pe0.d = NE0.p;
        return pe0;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        PE0 pe0 = new PE0(2);
        pe0.d = NE0.p;
        pe0.o(this);
        return pe0;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final boolean e() {
        byte b = this.e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.b;
        if ((i & 1) != 1) {
            this.e = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.e = (byte) 0;
            return false;
        }
        if (this.d.e()) {
            this.e = (byte) 1;
            return true;
        }
        this.e = (byte) 0;
        return false;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        if ((this.b & 1) == 1) {
            j9.w(1, this.c);
        }
        if ((this.b & 2) == 2) {
            j9.y(2, this.d);
        }
        j9.B(this.a);
    }

    public OE0(C5780lu c5780lu, DR dr) {
        LE0 le0L;
        this.e = (byte) -1;
        this.f = -1;
        boolean z = false;
        this.c = 0;
        this.d = NE0.p;
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
                        } else if (iN != 18) {
                            if (!c5780lu.q(iN, j9N)) {
                            }
                        } else {
                            if ((this.b & 2) == 2) {
                                NE0 ne0 = this.d;
                                ne0.getClass();
                                le0L = LE0.l();
                                le0L.m(ne0);
                            } else {
                                le0L = null;
                            }
                            NE0 ne02 = (NE0) c5780lu.g(NE0.q, dr);
                            this.d = ne02;
                            if (le0L != null) {
                                le0L.m(ne02);
                                this.d = le0L.k();
                            }
                            this.b |= 2;
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

    public OE0(PE0 pe0) {
        this.e = (byte) -1;
        this.f = -1;
        this.a = pe0.a;
    }
}
