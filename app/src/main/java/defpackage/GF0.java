package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class GF0 extends A00 {
    public static final GF0 g;
    public static final C8019xd0 h = new C8019xd0(25);
    public final AbstractC0596Hk a;
    public int b;
    public List c;
    public int d;
    public byte e;
    public int f;

    static {
        GF0 gf0 = new GF0();
        g = gf0;
        gf0.c = Collections.emptyList();
        gf0.d = -1;
    }

    public GF0() {
        this.e = (byte) -1;
        this.f = -1;
        this.a = AbstractC0596Hk.a;
    }

    public static PE0 i(GF0 gf0) {
        PE0 pe0N = PE0.n();
        pe0N.q(gf0);
        return pe0N;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.f;
        if (i != -1) {
            return i;
        }
        int iE = 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            iE += J9.g(1, (K0) this.c.get(i2));
        }
        if ((this.b & 1) == 1) {
            iE += J9.e(2, this.d);
        }
        int size = this.a.size() + iE;
        this.f = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return PE0.n();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        return i(this);
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
        for (int i = 0; i < this.c.size(); i++) {
            if (!((AF0) this.c.get(i)).e()) {
                this.e = (byte) 0;
                return false;
            }
        }
        this.e = (byte) 1;
        return true;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        for (int i = 0; i < this.c.size(); i++) {
            j9.y(1, (K0) this.c.get(i));
        }
        if ((this.b & 1) == 1) {
            j9.w(2, this.d);
        }
        j9.B(this.a);
    }

    public final PE0 j() {
        return i(this);
    }

    public GF0(C5780lu c5780lu, DR dr) {
        this.e = (byte) -1;
        this.f = -1;
        this.c = Collections.emptyList();
        this.d = -1;
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int iN = c5780lu.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if (!z2) {
                                    this.c = new ArrayList();
                                    z2 = true;
                                }
                                this.c.add(c5780lu.g(AF0.u, dr));
                            } else if (iN != 16) {
                                if (!c5780lu.q(iN, j9N)) {
                                }
                            } else {
                                this.b |= 1;
                                this.d = c5780lu.k();
                            }
                        }
                        z = true;
                    } catch (Y90 e) {
                        e.a = this;
                        throw e;
                    }
                } catch (IOException e2) {
                    Y90 y90 = new Y90(e2.getMessage());
                    y90.a = this;
                    throw y90;
                }
            } catch (Throwable th) {
                if (z2) {
                    this.c = Collections.unmodifiableList(this.c);
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
            this.c = Collections.unmodifiableList(this.c);
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

    public GF0(PE0 pe0) {
        this.e = (byte) -1;
        this.f = -1;
        this.a = pe0.a;
    }
}
