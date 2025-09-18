package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: gF0 */
/* loaded from: classes2.dex */
public final class C3927gF0 extends A00 {
    public static final C3927gF0 l;
    public static final C8019xd0 m = new C8019xd0(13);
    public final AbstractC0596Hk a;
    public int b;
    public int c;
    public int d;
    public EnumC3736fF0 e;
    public AF0 f;
    public int g;
    public List h;
    public List i;
    public byte j;
    public int k;

    static {
        C3927gF0 c3927gF0 = new C3927gF0();
        l = c3927gF0;
        c3927gF0.c = 0;
        c3927gF0.d = 0;
        c3927gF0.e = EnumC3736fF0.TRUE;
        c3927gF0.f = AF0.t;
        c3927gF0.g = 0;
        c3927gF0.h = Collections.emptyList();
        c3927gF0.i = Collections.emptyList();
    }

    public C3927gF0() {
        this.j = (byte) -1;
        this.k = -1;
        this.a = AbstractC0596Hk.a;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.k;
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
            iE += J9.g(4, this.f);
        }
        if ((this.b & 16) == 16) {
            iE += J9.e(5, this.g);
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            iE += J9.g(6, (K0) this.h.get(i2));
        }
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            iE += J9.g(7, (K0) this.i.get(i3));
        }
        int size = this.a.size() + iE;
        this.k = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return C3545eF0.l();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        C3545eF0 c3545eF0L = C3545eF0.l();
        c3545eF0L.m(this);
        return c3545eF0L;
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
        if ((this.b & 8) == 8 && !this.f.e()) {
            this.j = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.h.size(); i++) {
            if (!((C3927gF0) this.h.get(i)).e()) {
                this.j = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (!((C3927gF0) this.i.get(i2)).e()) {
                this.j = (byte) 0;
                return false;
            }
        }
        this.j = (byte) 1;
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
            j9.y(4, this.f);
        }
        if ((this.b & 16) == 16) {
            j9.w(5, this.g);
        }
        for (int i = 0; i < this.h.size(); i++) {
            j9.y(6, (K0) this.h.get(i));
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            j9.y(7, (K0) this.i.get(i2));
        }
        j9.B(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public C3927gF0(C5780lu c5780lu, DR dr) {
        EnumC3736fF0 enumC3736fF0;
        this.j = (byte) -1;
        this.k = -1;
        boolean z = false;
        this.c = 0;
        this.d = 0;
        EnumC3736fF0 enumC3736fF02 = EnumC3736fF0.TRUE;
        this.e = enumC3736fF02;
        this.f = AF0.t;
        this.g = 0;
        this.h = Collections.emptyList();
        this.i = Collections.emptyList();
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = c5780lu.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.b |= 1;
                            this.c = c5780lu.k();
                        } else if (iN != 16) {
                            C8327zF0 c8327zF0R = null;
                            EnumC3736fF0 enumC3736fF03 = null;
                            if (iN == 24) {
                                int iK = c5780lu.k();
                                if (iK != 0) {
                                    if (iK == 1) {
                                        enumC3736fF03 = EnumC3736fF0.FALSE;
                                    } else if (iK == 2) {
                                        enumC3736fF03 = EnumC3736fF0.NULL;
                                    }
                                    enumC3736fF0 = enumC3736fF03;
                                } else {
                                    enumC3736fF0 = enumC3736fF02;
                                }
                                if (enumC3736fF0 == null) {
                                    j9N.F(iN);
                                    j9N.F(iK);
                                } else {
                                    this.b |= 4;
                                    this.e = enumC3736fF0;
                                }
                            } else if (iN == 34) {
                                if ((this.b & 8) == 8) {
                                    AF0 af0 = this.f;
                                    af0.getClass();
                                    c8327zF0R = AF0.r(af0);
                                }
                                C8327zF0 c8327zF0 = c8327zF0R;
                                AF0 af02 = (AF0) c5780lu.g(AF0.u, dr);
                                this.f = af02;
                                if (c8327zF0 != null) {
                                    c8327zF0.n(af02);
                                    this.f = c8327zF0.l();
                                }
                                this.b |= 8;
                            } else if (iN != 40) {
                                C8019xd0 c8019xd0 = m;
                                if (iN == 50) {
                                    int i = (c == true ? 1 : 0) & 32;
                                    c = c;
                                    if (i != 32) {
                                        this.h = new ArrayList();
                                        c = (c == true ? 1 : 0) | ' ';
                                    }
                                    this.h.add(c5780lu.g(c8019xd0, dr));
                                } else if (iN != 58) {
                                    if (!c5780lu.q(iN, j9N)) {
                                    }
                                } else {
                                    int i2 = (c == true ? 1 : 0) & 64;
                                    c = c;
                                    if (i2 != 64) {
                                        this.i = new ArrayList();
                                        c = (c == true ? 1 : 0) | '@';
                                    }
                                    this.i.add(c5780lu.g(c8019xd0, dr));
                                }
                            } else {
                                this.b |= 16;
                                this.g = c5780lu.k();
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
                if (((c == true ? 1 : 0) & 32) == 32) {
                    this.h = Collections.unmodifiableList(this.h);
                }
                if (((c == true ? 1 : 0) & 64) == 64) {
                    this.i = Collections.unmodifiableList(this.i);
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
        if (((c == true ? 1 : 0) & 32) == 32) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if (((c == true ? 1 : 0) & 64) == 64) {
            this.i = Collections.unmodifiableList(this.i);
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

    public C3927gF0(C3545eF0 c3545eF0) {
        this.j = (byte) -1;
        this.k = -1;
        this.a = c3545eF0.a;
    }
}
