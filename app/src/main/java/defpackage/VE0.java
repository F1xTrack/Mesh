package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class VE0 extends AbstractC7709w00 {
    public static final VE0 i;
    public static final C8019xd0 j = new C8019xd0(9);
    public final AbstractC0596Hk b;
    public int c;
    public int d;
    public List e;
    public List f;
    public byte g;
    public int h;

    static {
        VE0 ve0 = new VE0();
        i = ve0;
        ve0.d = 6;
        ve0.e = Collections.emptyList();
        ve0.f = Collections.emptyList();
    }

    public VE0(UE0 ue0) {
        super(ue0);
        this.g = (byte) -1;
        this.h = -1;
        this.b = ue0.a;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final K0 a() {
        return i;
    }

    @Override // defpackage.K0
    public final int b() {
        int i2 = this.h;
        if (i2 != -1) {
            return i2;
        }
        int iE = (this.c & 1) == 1 ? J9.e(1, this.d) : 0;
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            iE += J9.g(2, (K0) this.e.get(i3));
        }
        int iF = 0;
        for (int i4 = 0; i4 < this.f.size(); i4++) {
            iF += J9.f(((Integer) this.f.get(i4)).intValue());
        }
        int size = this.b.size() + j() + (this.f.size() * 2) + iE + iF;
        this.h = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return UE0.m();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        UE0 ue0M = UE0.m();
        ue0M.n(this);
        return ue0M;
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
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            if (!((IF0) this.e.get(i2)).e()) {
                this.g = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.g = (byte) 1;
            return true;
        }
        this.g = (byte) 0;
        return false;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        C3383dO1 c3383dO1 = new C3383dO1(this);
        if ((this.c & 1) == 1) {
            j9.w(1, this.d);
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            j9.y(2, (K0) this.e.get(i2));
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            j9.w(31, ((Integer) this.f.get(i3)).intValue());
        }
        c3383dO1.K(19000, j9);
        j9.B(this.b);
    }

    public VE0() {
        this.g = (byte) -1;
        this.h = -1;
        this.b = AbstractC0596Hk.a;
    }

    public VE0(C5780lu c5780lu, DR dr) {
        this.g = (byte) -1;
        this.h = -1;
        this.d = 6;
        this.e = Collections.emptyList();
        this.f = Collections.emptyList();
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        boolean z = false;
        int i2 = 0;
        while (!z) {
            try {
                try {
                    int iN = c5780lu.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.c |= 1;
                            this.d = c5780lu.k();
                        } else if (iN == 18) {
                            if ((i2 & 2) != 2) {
                                this.e = new ArrayList();
                                i2 |= 2;
                            }
                            this.e.add(c5780lu.g(IF0.m, dr));
                        } else if (iN == 248) {
                            if ((i2 & 4) != 4) {
                                this.f = new ArrayList();
                                i2 |= 4;
                            }
                            this.f.add(Integer.valueOf(c5780lu.k()));
                        } else if (iN != 250) {
                            if (!n(c5780lu, j9N, dr, iN)) {
                            }
                        } else {
                            int iD = c5780lu.d(c5780lu.k());
                            if ((i2 & 4) != 4 && c5780lu.b() > 0) {
                                this.f = new ArrayList();
                                i2 |= 4;
                            }
                            while (c5780lu.b() > 0) {
                                this.f.add(Integer.valueOf(c5780lu.k()));
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
                if ((i2 & 2) == 2) {
                    this.e = Collections.unmodifiableList(this.e);
                }
                if ((i2 & 4) == 4) {
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
        if ((i2 & 2) == 2) {
            this.e = Collections.unmodifiableList(this.e);
        }
        if ((i2 & 4) == 4) {
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
