package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2289bF0 extends A00 {
    public static final C2289bF0 i;
    public static final C8019xd0 j = new C8019xd0(11);
    public final AbstractC0596Hk a;
    public int b;
    public ZE0 c;
    public List d;
    public C3927gF0 e;
    public EnumC2098aF0 f;
    public byte g;
    public int h;

    static {
        C2289bF0 c2289bF0 = new C2289bF0();
        i = c2289bF0;
        c2289bF0.c = ZE0.RETURNS_CONSTANT;
        c2289bF0.d = Collections.emptyList();
        c2289bF0.e = C3927gF0.l;
        c2289bF0.f = EnumC2098aF0.AT_MOST_ONCE;
    }

    public C2289bF0() {
        this.g = (byte) -1;
        this.h = -1;
        this.a = AbstractC0596Hk.a;
    }

    @Override // defpackage.K0
    public final int b() {
        int i2 = this.h;
        if (i2 != -1) {
            return i2;
        }
        int iC = (this.b & 1) == 1 ? J9.c(1, this.c.a) : 0;
        for (int i3 = 0; i3 < this.d.size(); i3++) {
            iC += J9.g(2, (K0) this.d.get(i3));
        }
        if ((this.b & 2) == 2) {
            iC += J9.g(3, this.e);
        }
        if ((this.b & 4) == 4) {
            iC += J9.c(4, this.f.a);
        }
        int size = this.a.size() + iC;
        this.h = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return YE0.l();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        YE0 ye0L = YE0.l();
        ye0L.m(this);
        return ye0L;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final boolean e() {
        byte b = this.g;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            if (!((C3927gF0) this.d.get(i2)).e()) {
                this.g = (byte) 0;
                return false;
            }
        }
        if ((this.b & 2) != 2 || this.e.e()) {
            this.g = (byte) 1;
            return true;
        }
        this.g = (byte) 0;
        return false;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        if ((this.b & 1) == 1) {
            j9.v(1, this.c.a);
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            j9.y(2, (K0) this.d.get(i2));
        }
        if ((this.b & 2) == 2) {
            j9.y(3, this.e);
        }
        if ((this.b & 4) == 4) {
            j9.v(4, this.f.a);
        }
        j9.B(this.a);
    }

    public C2289bF0(C5780lu c5780lu, DR dr) {
        this.g = (byte) -1;
        this.h = -1;
        ZE0 ze0 = ZE0.RETURNS_CONSTANT;
        this.c = ze0;
        this.d = Collections.emptyList();
        this.e = C3927gF0.l;
        EnumC2098aF0 enumC2098aF0 = EnumC2098aF0.AT_MOST_ONCE;
        this.f = enumC2098aF0;
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = c5780lu.n();
                    if (iN != 0) {
                        EnumC2098aF0 enumC2098aF02 = null;
                        ZE0 ze02 = null;
                        C3545eF0 c3545eF0L = null;
                        if (iN == 8) {
                            int iK = c5780lu.k();
                            if (iK == 0) {
                                ze02 = ze0;
                            } else if (iK == 1) {
                                ze02 = ZE0.CALLS;
                            } else if (iK == 2) {
                                ze02 = ZE0.RETURNS_NOT_NULL;
                            }
                            if (ze02 == null) {
                                j9N.F(iN);
                                j9N.F(iK);
                            } else {
                                this.b |= 1;
                                this.c = ze02;
                            }
                        } else if (iN == 18) {
                            int i2 = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i2 != 2) {
                                this.d = new ArrayList();
                                c = 2;
                            }
                            this.d.add(c5780lu.g(C3927gF0.m, dr));
                        } else if (iN == 26) {
                            if ((this.b & 2) == 2) {
                                C3927gF0 c3927gF0 = this.e;
                                c3927gF0.getClass();
                                c3545eF0L = C3545eF0.l();
                                c3545eF0L.m(c3927gF0);
                            }
                            C3927gF0 c3927gF02 = (C3927gF0) c5780lu.g(C3927gF0.m, dr);
                            this.e = c3927gF02;
                            if (c3545eF0L != null) {
                                c3545eF0L.m(c3927gF02);
                                this.e = c3545eF0L.k();
                            }
                            this.b |= 2;
                        } else if (iN != 32) {
                            if (!c5780lu.q(iN, j9N)) {
                            }
                        } else {
                            int iK2 = c5780lu.k();
                            if (iK2 == 0) {
                                enumC2098aF02 = enumC2098aF0;
                            } else if (iK2 == 1) {
                                enumC2098aF02 = EnumC2098aF0.EXACTLY_ONCE;
                            } else if (iK2 == 2) {
                                enumC2098aF02 = EnumC2098aF0.AT_LEAST_ONCE;
                            }
                            if (enumC2098aF02 == null) {
                                j9N.F(iN);
                                j9N.F(iK2);
                            } else {
                                this.b |= 4;
                                this.f = enumC2098aF02;
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
                if (((c == true ? 1 : 0) & 2) == 2) {
                    this.d = Collections.unmodifiableList(this.d);
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
        if (((c == true ? 1 : 0) & 2) == 2) {
            this.d = Collections.unmodifiableList(this.d);
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

    public C2289bF0(YE0 ye0) {
        this.g = (byte) -1;
        this.h = -1;
        this.a = ye0.a;
    }
}
