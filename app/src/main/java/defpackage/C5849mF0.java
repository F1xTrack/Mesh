package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: mF0 */
/* loaded from: classes2.dex */
public final class C5849mF0 extends AbstractC7709w00 {
    public static final C5849mF0 k;
    public static final C8019xd0 l = new C8019xd0(15);
    public final AbstractC0596Hk b;
    public int c;
    public List d;
    public List e;
    public List f;
    public GF0 g;
    public NF0 h;
    public byte i;
    public int j;

    static {
        C5849mF0 c5849mF0 = new C5849mF0();
        k = c5849mF0;
        c5849mF0.d = Collections.emptyList();
        c5849mF0.e = Collections.emptyList();
        c5849mF0.f = Collections.emptyList();
        c5849mF0.g = GF0.g;
        c5849mF0.h = NF0.e;
    }

    public C5849mF0(C5658lF0 c5658lF0) {
        super(c5658lF0);
        this.i = (byte) -1;
        this.j = -1;
        this.b = c5658lF0.a;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final K0 a() {
        return k;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.j;
        if (i != -1) {
            return i;
        }
        int iG = 0;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            iG += J9.g(3, (K0) this.d.get(i2));
        }
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            iG += J9.g(4, (K0) this.e.get(i3));
        }
        for (int i4 = 0; i4 < this.f.size(); i4++) {
            iG += J9.g(5, (K0) this.f.get(i4));
        }
        if ((this.c & 1) == 1) {
            iG += J9.g(30, this.g);
        }
        if ((this.c & 2) == 2) {
            iG += J9.g(32, this.h);
        }
        int size = this.b.size() + j() + iG;
        this.j = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return C5658lF0.m();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        C5658lF0 c5658lF0M = C5658lF0.m();
        c5658lF0M.n(this);
        return c5658lF0M;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final boolean e() {
        byte b = this.i;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.d.size(); i++) {
            if (!((C4309iF0) this.d.get(i)).e()) {
                this.i = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            if (!((C6613qF0) this.e.get(i2)).e()) {
                this.i = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            if (!((CF0) this.f.get(i3)).e()) {
                this.i = (byte) 0;
                return false;
            }
        }
        if ((this.c & 1) == 1 && !this.g.e()) {
            this.i = (byte) 0;
            return false;
        }
        if (i()) {
            this.i = (byte) 1;
            return true;
        }
        this.i = (byte) 0;
        return false;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        C3383dO1 c3383dO1 = new C3383dO1(this);
        for (int i = 0; i < this.d.size(); i++) {
            j9.y(3, (K0) this.d.get(i));
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            j9.y(4, (K0) this.e.get(i2));
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            j9.y(5, (K0) this.f.get(i3));
        }
        if ((this.c & 1) == 1) {
            j9.y(30, this.g);
        }
        if ((this.c & 2) == 2) {
            j9.y(32, this.h);
        }
        c3383dO1.K(200, j9);
        j9.B(this.b);
    }

    public C5849mF0() {
        this.i = (byte) -1;
        this.j = -1;
        this.b = AbstractC0596Hk.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public C5849mF0(C5780lu c5780lu, DR dr) {
        this.i = (byte) -1;
        this.j = -1;
        this.d = Collections.emptyList();
        this.e = Collections.emptyList();
        this.f = Collections.emptyList();
        this.g = GF0.g;
        this.h = NF0.e;
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = c5780lu.n();
                    if (iN != 0) {
                        if (iN == 26) {
                            int i = (c == true ? 1 : 0) & 1;
                            c = c;
                            if (i != 1) {
                                this.d = new ArrayList();
                                c = (c == true ? 1 : 0) | 1;
                            }
                            this.d.add(c5780lu.g(C4309iF0.v, dr));
                        } else if (iN == 34) {
                            int i2 = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i2 != 2) {
                                this.e = new ArrayList();
                                c = (c == true ? 1 : 0) | 2;
                            }
                            this.e.add(c5780lu.g(C6613qF0.v, dr));
                        } else if (iN != 42) {
                            WE0 we0 = null;
                            PE0 pe0I = null;
                            if (iN == 242) {
                                if ((this.c & 1) == 1) {
                                    GF0 gf0 = this.g;
                                    gf0.getClass();
                                    pe0I = GF0.i(gf0);
                                }
                                GF0 gf02 = (GF0) c5780lu.g(GF0.h, dr);
                                this.g = gf02;
                                if (pe0I != null) {
                                    pe0I.q(gf02);
                                    this.g = pe0I.m();
                                }
                                this.c |= 1;
                            } else if (iN != 258) {
                                if (!n(c5780lu, j9N, dr, iN)) {
                                }
                            } else {
                                if ((this.c & 2) == 2) {
                                    NF0 nf0 = this.h;
                                    nf0.getClass();
                                    we0 = new WE0(2);
                                    we0.d = Collections.emptyList();
                                    we0.r(nf0);
                                }
                                NF0 nf02 = (NF0) c5780lu.g(NF0.f, dr);
                                this.h = nf02;
                                if (we0 != null) {
                                    we0.r(nf02);
                                    this.h = we0.n();
                                }
                                this.c |= 2;
                            }
                        } else {
                            int i3 = (c == true ? 1 : 0) & 4;
                            c = c;
                            if (i3 != 4) {
                                this.f = new ArrayList();
                                c = (c == true ? 1 : 0) | 4;
                            }
                            this.f.add(c5780lu.g(CF0.p, dr));
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
                if (((c == true ? 1 : 0) & 1) == 1) {
                    this.d = Collections.unmodifiableList(this.d);
                }
                if (((c == true ? 1 : 0) & 2) == 2) {
                    this.e = Collections.unmodifiableList(this.e);
                }
                if (((c == true ? 1 : 0) & 4) == 4) {
                    this.f = Collections.unmodifiableList(this.f);
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
        if (((c == true ? 1 : 0) & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
        }
        if (((c == true ? 1 : 0) & 2) == 2) {
            this.e = Collections.unmodifiableList(this.e);
        }
        if (((c == true ? 1 : 0) & 4) == 4) {
            this.f = Collections.unmodifiableList(this.f);
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
