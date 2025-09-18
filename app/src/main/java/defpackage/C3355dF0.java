package defpackage;

import java.io.IOException;

/* renamed from: dF0 */
/* loaded from: classes2.dex */
public final class C3355dF0 extends AbstractC7709w00 {
    public static final C3355dF0 g;
    public static final C8019xd0 h = new C8019xd0(12);
    public final AbstractC0596Hk b;
    public int c;
    public int d;
    public byte e;
    public int f;

    static {
        C3355dF0 c3355dF0 = new C3355dF0();
        g = c3355dF0;
        c3355dF0.d = 0;
    }

    public C3355dF0(C2479cF0 c2479cF0) {
        super(c2479cF0);
        this.e = (byte) -1;
        this.f = -1;
        this.b = c2479cF0.a;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final K0 a() {
        return g;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.f;
        if (i != -1) {
            return i;
        }
        int size = this.b.size() + j() + ((this.c & 1) == 1 ? J9.e(1, this.d) : 0);
        this.f = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return new C2479cF0();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        C2479cF0 c2479cF0 = new C2479cF0();
        c2479cF0.l(this);
        return c2479cF0;
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
        if (i()) {
            this.e = (byte) 1;
            return true;
        }
        this.e = (byte) 0;
        return false;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        C3383dO1 c3383dO1 = new C3383dO1(this);
        if ((this.c & 1) == 1) {
            j9.w(1, this.d);
        }
        c3383dO1.K(200, j9);
        j9.B(this.b);
    }

    public C3355dF0() {
        this.e = (byte) -1;
        this.f = -1;
        this.b = AbstractC0596Hk.a;
    }

    public C3355dF0(C5780lu c5780lu, DR dr) {
        this.e = (byte) -1;
        this.f = -1;
        boolean z = false;
        this.d = 0;
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        while (!z) {
            try {
                try {
                    int iN = c5780lu.n();
                    if (iN != 0) {
                        if (iN != 8) {
                            if (!n(c5780lu, j9N, dr, iN)) {
                            }
                        } else {
                            this.c |= 1;
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
