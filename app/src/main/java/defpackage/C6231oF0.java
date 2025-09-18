package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: oF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6231oF0 extends AbstractC7709w00 {
    public static final C6231oF0 j;
    public static final C8019xd0 k = new C8019xd0(16);
    public final AbstractC0596Hk b;
    public int c;
    public C7567vF0 d;
    public C7376uF0 e;
    public C5849mF0 f;
    public List g;
    public byte h;
    public int i;

    static {
        C6231oF0 c6231oF0 = new C6231oF0();
        j = c6231oF0;
        c6231oF0.d = C7567vF0.e;
        c6231oF0.e = C7376uF0.e;
        c6231oF0.f = C5849mF0.k;
        c6231oF0.g = Collections.emptyList();
    }

    public C6231oF0(C6040nF0 c6040nF0) {
        super(c6040nF0);
        this.h = (byte) -1;
        this.i = -1;
        this.b = c6040nF0.a;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final K0 a() {
        return j;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        int iG = (this.c & 1) == 1 ? J9.g(1, this.d) : 0;
        if ((this.c & 2) == 2) {
            iG += J9.g(2, this.e);
        }
        if ((this.c & 4) == 4) {
            iG += J9.g(3, this.f);
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            iG += J9.g(4, (K0) this.g.get(i2));
        }
        int size = this.b.size() + j() + iG;
        this.i = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return C6040nF0.m();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        C6040nF0 c6040nF0M = C6040nF0.m();
        c6040nF0M.n(this);
        return c6040nF0M;
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
        if ((this.c & 2) == 2 && !this.e.e()) {
            this.h = (byte) 0;
            return false;
        }
        if ((this.c & 4) == 4 && !this.f.e()) {
            this.h = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            if (!((TE0) this.g.get(i)).e()) {
                this.h = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.h = (byte) 1;
            return true;
        }
        this.h = (byte) 0;
        return false;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        C3383dO1 c3383dO1 = new C3383dO1(this);
        if ((this.c & 1) == 1) {
            j9.y(1, this.d);
        }
        if ((this.c & 2) == 2) {
            j9.y(2, this.e);
        }
        if ((this.c & 4) == 4) {
            j9.y(3, this.f);
        }
        for (int i = 0; i < this.g.size(); i++) {
            j9.y(4, (K0) this.g.get(i));
        }
        c3383dO1.K(200, j9);
        j9.B(this.b);
    }

    public C6231oF0() {
        this.h = (byte) -1;
        this.i = -1;
        this.b = AbstractC0596Hk.a;
    }

    public C6231oF0(C5780lu c5780lu, DR dr) {
        this.h = (byte) -1;
        this.i = -1;
        this.d = C7567vF0.e;
        this.e = C7376uF0.e;
        this.f = C5849mF0.k;
        this.g = Collections.emptyList();
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = c5780lu.n();
                    if (iN != 0) {
                        C5658lF0 c5658lF0M = null;
                        WE0 we0 = null;
                        WE0 we02 = null;
                        if (iN == 10) {
                            if ((this.c & 1) == 1) {
                                C7567vF0 c7567vF0 = this.d;
                                c7567vF0.getClass();
                                we0 = new WE0(3);
                                we0.d = C2376bi0.b;
                                we0.q(c7567vF0);
                            }
                            C7567vF0 c7567vF02 = (C7567vF0) c5780lu.g(C7567vF0.f, dr);
                            this.d = c7567vF02;
                            if (we0 != null) {
                                we0.q(c7567vF02);
                                this.d = we0.m();
                            }
                            this.c |= 1;
                        } else if (iN == 18) {
                            if ((this.c & 2) == 2) {
                                C7376uF0 c7376uF0 = this.e;
                                c7376uF0.getClass();
                                we02 = new WE0(1);
                                we02.d = Collections.emptyList();
                                we02.p(c7376uF0);
                            }
                            C7376uF0 c7376uF02 = (C7376uF0) c5780lu.g(C7376uF0.f, dr);
                            this.e = c7376uF02;
                            if (we02 != null) {
                                we02.p(c7376uF02);
                                this.e = we02.l();
                            }
                            this.c |= 2;
                        } else if (iN == 26) {
                            if ((this.c & 4) == 4) {
                                C5849mF0 c5849mF0 = this.f;
                                c5849mF0.getClass();
                                c5658lF0M = C5658lF0.m();
                                c5658lF0M.n(c5849mF0);
                            }
                            C5849mF0 c5849mF02 = (C5849mF0) c5780lu.g(C5849mF0.l, dr);
                            this.f = c5849mF02;
                            if (c5658lF0M != null) {
                                c5658lF0M.n(c5849mF02);
                                this.f = c5658lF0M.l();
                            }
                            this.c |= 4;
                        } else if (iN != 34) {
                            if (!n(c5780lu, j9N, dr, iN)) {
                            }
                        } else {
                            int i = (c == true ? 1 : 0) & '\b';
                            c = c;
                            if (i != 8) {
                                this.g = new ArrayList();
                                c = '\b';
                            }
                            this.g.add(c5780lu.g(TE0.K, dr));
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
                if (((c == true ? 1 : 0) & '\b') == 8) {
                    this.g = Collections.unmodifiableList(this.g);
                }
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
        if (((c == true ? 1 : 0) & '\b') == 8) {
            this.g = Collections.unmodifiableList(this.g);
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
