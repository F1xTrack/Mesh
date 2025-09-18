package defpackage;

import java.io.IOException;

/* renamed from: yF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8137yF0 extends A00 {
    public static final C8137yF0 h;
    public static final C8019xd0 i = new C8019xd0(22);
    public final AbstractC0596Hk a;
    public int b;
    public EnumC7947xF0 c;
    public AF0 d;
    public int e;
    public byte f;
    public int g;

    static {
        C8137yF0 c8137yF0 = new C8137yF0();
        h = c8137yF0;
        c8137yF0.c = EnumC7947xF0.INV;
        c8137yF0.d = AF0.t;
        c8137yF0.e = 0;
    }

    public C8137yF0() {
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
        int iC = (this.b & 1) == 1 ? J9.c(1, this.c.a) : 0;
        if ((this.b & 2) == 2) {
            iC += J9.g(2, this.d);
        }
        if ((this.b & 4) == 4) {
            iC += J9.e(3, this.e);
        }
        int size = this.a.size() + iC;
        this.g = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return C7757wF0.l();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        C7757wF0 c7757wF0L = C7757wF0.l();
        c7757wF0L.m(this);
        return c7757wF0L;
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
        if ((this.b & 2) != 2 || this.d.e()) {
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
            j9.v(1, this.c.a);
        }
        if ((this.b & 2) == 2) {
            j9.y(2, this.d);
        }
        if ((this.b & 4) == 4) {
            j9.w(3, this.e);
        }
        j9.B(this.a);
    }

    public C8137yF0(C5780lu c5780lu, DR dr) {
        this.f = (byte) -1;
        this.g = -1;
        EnumC7947xF0 enumC7947xF0 = EnumC7947xF0.INV;
        this.c = enumC7947xF0;
        this.d = AF0.t;
        boolean z = false;
        this.e = 0;
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        while (!z) {
            try {
                try {
                    int iN = c5780lu.n();
                    if (iN != 0) {
                        C8327zF0 c8327zF0R = null;
                        EnumC7947xF0 enumC7947xF02 = null;
                        if (iN == 8) {
                            int iK = c5780lu.k();
                            if (iK == 0) {
                                enumC7947xF02 = EnumC7947xF0.IN;
                            } else if (iK == 1) {
                                enumC7947xF02 = EnumC7947xF0.OUT;
                            } else if (iK == 2) {
                                enumC7947xF02 = enumC7947xF0;
                            } else if (iK == 3) {
                                enumC7947xF02 = EnumC7947xF0.STAR;
                            }
                            if (enumC7947xF02 == null) {
                                j9N.F(iN);
                                j9N.F(iK);
                            } else {
                                this.b |= 1;
                                this.c = enumC7947xF02;
                            }
                        } else if (iN == 18) {
                            if ((this.b & 2) == 2) {
                                AF0 af0 = this.d;
                                af0.getClass();
                                c8327zF0R = AF0.r(af0);
                            }
                            AF0 af02 = (AF0) c5780lu.g(AF0.u, dr);
                            this.d = af02;
                            if (c8327zF0R != null) {
                                c8327zF0R.n(af02);
                                this.d = c8327zF0R.l();
                            }
                            this.b |= 2;
                        } else if (iN != 24) {
                            if (!c5780lu.q(iN, j9N)) {
                            }
                        } else {
                            this.b |= 4;
                            this.e = c5780lu.k();
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

    public C8137yF0(C7757wF0 c7757wF0) {
        this.f = (byte) -1;
        this.g = -1;
        this.a = c7757wF0.a;
    }
}
