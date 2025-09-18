package defpackage;

import java.io.IOException;

/* renamed from: vF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7567vF0 extends A00 {
    public static final C7567vF0 e;
    public static final C8019xd0 f = new C8019xd0(20);
    public final AbstractC0596Hk a;
    public InterfaceC3632ei0 b;
    public byte c;
    public int d;

    static {
        C7567vF0 c7567vF0 = new C7567vF0();
        e = c7567vF0;
        c7567vF0.b = C2376bi0.b;
    }

    public C7567vF0() {
        this.c = (byte) -1;
        this.d = -1;
        this.a = AbstractC0596Hk.a;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int size = 0;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            AbstractC0596Hk abstractC0596HkX = this.b.X(i2);
            size += abstractC0596HkX.size() + J9.i(abstractC0596HkX.size());
        }
        int size2 = this.a.size() + this.b.size() + size;
        this.d = size2;
        return size2;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        WE0 we0 = new WE0(3);
        we0.d = C2376bi0.b;
        return we0;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        WE0 we0 = new WE0(3);
        we0.d = C2376bi0.b;
        we0.q(this);
        return we0;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final boolean e() {
        byte b = this.c;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.c = (byte) 1;
        return true;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        for (int i = 0; i < this.b.size(); i++) {
            AbstractC0596Hk abstractC0596HkX = this.b.X(i);
            j9.H(1, 2);
            j9.F(abstractC0596HkX.size());
            j9.B(abstractC0596HkX);
        }
        j9.B(this.a);
    }

    public C7567vF0(C5780lu c5780lu) {
        this.c = (byte) -1;
        this.d = -1;
        this.b = C2376bi0.b;
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iN = c5780lu.n();
                    if (iN != 0) {
                        if (iN != 10) {
                            if (!c5780lu.q(iN, j9N)) {
                            }
                        } else {
                            C1919Yj0 c1919Yj0E = c5780lu.e();
                            if (!z2) {
                                this.b = new C2376bi0();
                                z2 = true;
                            }
                            this.b.b0(c1919Yj0E);
                        }
                    }
                    z = true;
                } catch (Y90 e2) {
                    e2.a = this;
                    throw e2;
                } catch (IOException e3) {
                    Y90 y90 = new Y90(e3.getMessage());
                    y90.a = this;
                    throw y90;
                }
            } catch (Throwable th) {
                if (z2) {
                    this.b = this.b.o();
                }
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
        if (z2) {
            this.b = this.b.o();
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

    public C7567vF0(WE0 we0) {
        this.c = (byte) -1;
        this.d = -1;
        this.a = we0.a;
    }
}
