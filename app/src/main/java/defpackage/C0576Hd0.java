package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Hd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0576Hd0 extends A00 {
    public static final C0576Hd0 g;
    public static final C8019xd0 h = new C8019xd0(3);
    public final AbstractC0596Hk a;
    public List b;
    public List c;
    public int d;
    public byte e;
    public int f;

    static {
        C0576Hd0 c0576Hd0 = new C0576Hd0();
        g = c0576Hd0;
        c0576Hd0.b = Collections.emptyList();
        c0576Hd0.c = Collections.emptyList();
    }

    public C0576Hd0() {
        this.d = -1;
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
        int iG = 0;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            iG += J9.g(1, (K0) this.b.get(i2));
        }
        int iF = 0;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            iF += J9.f(((Integer) this.c.get(i3)).intValue());
        }
        int iF2 = iG + iF;
        if (!this.c.isEmpty()) {
            iF2 = iF2 + 1 + J9.f(iF);
        }
        this.d = iF;
        int size = this.a.size() + iF2;
        this.f = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return C0264Dd0.l();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        C0264Dd0 c0264Dd0L = C0264Dd0.l();
        c0264Dd0L.m(this);
        return c0264Dd0L;
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
        this.e = (byte) 1;
        return true;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        for (int i = 0; i < this.b.size(); i++) {
            j9.y(1, (K0) this.b.get(i));
        }
        if (this.c.size() > 0) {
            j9.F(42);
            j9.F(this.d);
        }
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            j9.x(((Integer) this.c.get(i2)).intValue());
        }
        j9.B(this.a);
    }

    public C0576Hd0(C5780lu c5780lu, DR dr) {
        this.d = -1;
        this.e = (byte) -1;
        this.f = -1;
        this.b = Collections.emptyList();
        this.c = Collections.emptyList();
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = c5780lu.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if ((i & 1) != 1) {
                                this.b = new ArrayList();
                                i |= 1;
                            }
                            this.b.add(c5780lu.g(C0498Gd0.n, dr));
                        } else if (iN == 40) {
                            if ((i & 2) != 2) {
                                this.c = new ArrayList();
                                i |= 2;
                            }
                            this.c.add(Integer.valueOf(c5780lu.k()));
                        } else if (iN != 42) {
                            if (!c5780lu.q(iN, j9N)) {
                            }
                        } else {
                            int iD = c5780lu.d(c5780lu.k());
                            if ((i & 2) != 2 && c5780lu.b() > 0) {
                                this.c = new ArrayList();
                                i |= 2;
                            }
                            while (c5780lu.b() > 0) {
                                this.c.add(Integer.valueOf(c5780lu.k()));
                            }
                            c5780lu.c(iD);
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
                if ((i & 1) == 1) {
                    this.b = Collections.unmodifiableList(this.b);
                }
                if ((i & 2) == 2) {
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
        if ((i & 1) == 1) {
            this.b = Collections.unmodifiableList(this.b);
        }
        if ((i & 2) == 2) {
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

    public C0576Hd0(C0264Dd0 c0264Dd0) {
        this.d = -1;
        this.e = (byte) -1;
        this.f = -1;
        this.a = c0264Dd0.a;
    }
}
