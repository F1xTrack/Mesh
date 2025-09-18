package defpackage;

import java.io.IOException;

/* renamed from: tF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7185tF0 extends A00 {
    public static final C7185tF0 h;
    public static final C8019xd0 i = new C8019xd0(19);
    public final AbstractC0596Hk a;
    public int b;
    public int c;
    public int d;
    public EnumC6994sF0 e;
    public byte f;
    public int g;

    static {
        C7185tF0 c7185tF0 = new C7185tF0();
        h = c7185tF0;
        c7185tF0.c = -1;
        c7185tF0.d = 0;
        c7185tF0.e = EnumC6994sF0.PACKAGE;
    }

    public C7185tF0() {
        this.f = (byte) -1;
        this.g = -1;
        this.a = AbstractC0596Hk.a;
    }

    @Override // defpackage.K0
    public final int b() {
        int i2 = this.g;
        if (i2 != -1) {
            return i2;
        }
        int iE = (this.b & 1) == 1 ? J9.e(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            iE += J9.e(2, this.d);
        }
        if ((this.b & 4) == 4) {
            iE += J9.c(3, this.e.a);
        }
        int size = this.a.size() + iE;
        this.g = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return C6803rF0.l();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        C6803rF0 c6803rF0L = C6803rF0.l();
        c6803rF0L.m(this);
        return c6803rF0L;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final boolean e() {
        byte b = this.f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.b & 2) == 2) {
            this.f = (byte) 1;
            return true;
        }
        this.f = (byte) 0;
        return false;
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
        j9.B(this.a);
    }

    public C7185tF0(C5780lu c5780lu) {
        EnumC6994sF0 enumC6994sF0;
        this.f = (byte) -1;
        this.g = -1;
        this.c = -1;
        boolean z = false;
        this.d = 0;
        EnumC6994sF0 enumC6994sF02 = EnumC6994sF0.PACKAGE;
        this.e = enumC6994sF02;
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
                        } else if (iN == 16) {
                            this.b |= 2;
                            this.d = c5780lu.k();
                        } else if (iN != 24) {
                            if (!c5780lu.q(iN, j9N)) {
                            }
                        } else {
                            int iK = c5780lu.k();
                            if (iK == 0) {
                                enumC6994sF0 = EnumC6994sF0.CLASS;
                            } else if (iK != 1) {
                                enumC6994sF0 = iK != 2 ? null : EnumC6994sF0.LOCAL;
                            } else {
                                enumC6994sF0 = enumC6994sF02;
                            }
                            if (enumC6994sF0 == null) {
                                j9N.F(iN);
                                j9N.F(iK);
                            } else {
                                this.b |= 4;
                                this.e = enumC6994sF0;
                            }
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

    public C7185tF0(C6803rF0 c6803rF0) {
        this.f = (byte) -1;
        this.g = -1;
        this.a = c6803rF0.a;
    }
}
