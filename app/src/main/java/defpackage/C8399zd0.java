package defpackage;

import java.io.IOException;

/* renamed from: zd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8399zd0 extends A00 {
    public static final C8399zd0 g;
    public static final C8019xd0 h = new C8019xd0(0);
    public final AbstractC0596Hk a;
    public int b;
    public int c;
    public int d;
    public byte e;
    public int f;

    static {
        C8399zd0 c8399zd0 = new C8399zd0();
        g = c8399zd0;
        c8399zd0.c = 0;
        c8399zd0.d = 0;
    }

    public C8399zd0() {
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
            iE += J9.e(2, this.d);
        }
        int size = this.a.size() + iE;
        this.f = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return new C8209yd0(0);
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        C8209yd0 c8209yd0 = new C8209yd0(0);
        c8209yd0.m(this);
        return c8209yd0;
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
        this.e = (byte) 1;
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
        j9.B(this.a);
    }

    public C8399zd0(C5780lu c5780lu) {
        this.e = (byte) -1;
        this.f = -1;
        boolean z = false;
        this.c = 0;
        this.d = 0;
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
                            if (!c5780lu.q(iN, j9N)) {
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

    public C8399zd0(C8209yd0 c8209yd0) {
        this.e = (byte) -1;
        this.f = -1;
        this.a = c8209yd0.a;
    }
}
