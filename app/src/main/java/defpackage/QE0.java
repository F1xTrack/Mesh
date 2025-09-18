package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class QE0 extends A00 {
    public static final QE0 g;
    public static final C8019xd0 h = new C8019xd0(5);
    public final AbstractC0596Hk a;
    public int b;
    public int c;
    public List d;
    public byte e;
    public int f;

    static {
        QE0 qe0 = new QE0();
        g = qe0;
        qe0.c = 0;
        qe0.d = Collections.emptyList();
    }

    public QE0() {
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
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            iE += J9.g(2, (K0) this.d.get(i2));
        }
        int size = this.a.size() + iE;
        this.f = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        PE0 pe0 = new PE0(0);
        pe0.d = Collections.emptyList();
        return pe0;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        PE0 pe0 = new PE0(0);
        pe0.d = Collections.emptyList();
        pe0.p(this);
        return pe0;
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
        if ((this.b & 1) != 1) {
            this.e = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.d.size(); i++) {
            if (!((OE0) this.d.get(i)).e()) {
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
        if ((this.b & 1) == 1) {
            j9.w(1, this.c);
        }
        for (int i = 0; i < this.d.size(); i++) {
            j9.y(2, (K0) this.d.get(i));
        }
        j9.B(this.a);
    }

    public QE0(C5780lu c5780lu, DR dr) {
        this.e = (byte) -1;
        this.f = -1;
        boolean z = false;
        this.c = 0;
        this.d = Collections.emptyList();
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
                        } else if (iN != 18) {
                            if (!c5780lu.q(iN, j9N)) {
                            }
                        } else {
                            if ((c & 2) != 2) {
                                this.d = new ArrayList();
                                c = 2;
                            }
                            this.d.add(c5780lu.g(OE0.h, dr));
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
                if ((c & 2) == 2) {
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
        if ((c & 2) == 2) {
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

    public QE0(PE0 pe0) {
        this.e = (byte) -1;
        this.f = -1;
        this.a = pe0.a;
    }
}
