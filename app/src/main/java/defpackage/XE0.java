package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class XE0 extends A00 {
    public static final XE0 e;
    public static final C8019xd0 f = new C8019xd0(10);
    public final AbstractC0596Hk a;
    public List b;
    public byte c;
    public int d;

    static {
        XE0 xe0 = new XE0();
        e = xe0;
        xe0.b = Collections.emptyList();
    }

    public XE0() {
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
        int iG = 0;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            iG += J9.g(1, (K0) this.b.get(i2));
        }
        int size = this.a.size() + iG;
        this.d = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        WE0 we0 = new WE0(0);
        we0.d = Collections.emptyList();
        return we0;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        WE0 we0 = new WE0(0);
        we0.d = Collections.emptyList();
        we0.o(this);
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
        for (int i = 0; i < this.b.size(); i++) {
            if (!((C2289bF0) this.b.get(i)).e()) {
                this.c = (byte) 0;
                return false;
            }
        }
        this.c = (byte) 1;
        return true;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        for (int i = 0; i < this.b.size(); i++) {
            j9.y(1, (K0) this.b.get(i));
        }
        j9.B(this.a);
    }

    public XE0(C5780lu c5780lu, DR dr) {
        this.c = (byte) -1;
        this.d = -1;
        this.b = Collections.emptyList();
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
                            if (!z2) {
                                this.b = new ArrayList();
                                z2 = true;
                            }
                            this.b.add(c5780lu.g(C2289bF0.j, dr));
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
                    this.b = Collections.unmodifiableList(this.b);
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
            this.b = Collections.unmodifiableList(this.b);
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

    public XE0(WE0 we0) {
        this.c = (byte) -1;
        this.d = -1;
        this.a = we0.a;
    }
}
