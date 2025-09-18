package defpackage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Gd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0498Gd0 extends A00 {
    public static final C0498Gd0 m;
    public static final C8019xd0 n = new C8019xd0(4);
    public final AbstractC0596Hk a;
    public int b;
    public int c;
    public int d;
    public Object e;
    public EnumC0420Fd0 f;
    public List g;
    public int h;
    public List i;
    public int j;
    public byte k;
    public int l;

    static {
        C0498Gd0 c0498Gd0 = new C0498Gd0();
        m = c0498Gd0;
        c0498Gd0.c = 1;
        c0498Gd0.d = 0;
        c0498Gd0.e = "";
        c0498Gd0.f = EnumC0420Fd0.NONE;
        c0498Gd0.g = Collections.emptyList();
        c0498Gd0.i = Collections.emptyList();
    }

    public C0498Gd0() {
        this.h = -1;
        this.j = -1;
        this.k = (byte) -1;
        this.l = -1;
        this.a = AbstractC0596Hk.a;
    }

    @Override // defpackage.K0
    public final int b() {
        AbstractC0596Hk c1919Yj0;
        int i = this.l;
        if (i != -1) {
            return i;
        }
        int iE = (this.b & 1) == 1 ? J9.e(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            iE += J9.e(2, this.d);
        }
        if ((this.b & 8) == 8) {
            iE += J9.c(3, this.f.a);
        }
        int iF = 0;
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            iF += J9.f(((Integer) this.g.get(i2)).intValue());
        }
        int iF2 = iE + iF;
        if (!this.g.isEmpty()) {
            iF2 = iF2 + 1 + J9.f(iF);
        }
        this.h = iF;
        int iF3 = 0;
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            iF3 += J9.f(((Integer) this.i.get(i3)).intValue());
        }
        int size = iF2 + iF3;
        if (!this.i.isEmpty()) {
            size = size + 1 + J9.f(iF3);
        }
        this.j = iF3;
        if ((this.b & 4) == 4) {
            Object obj = this.e;
            if (obj instanceof String) {
                try {
                    c1919Yj0 = new C1919Yj0(((String) obj).getBytes("UTF-8"));
                    this.e = c1919Yj0;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            } else {
                c1919Yj0 = (AbstractC0596Hk) obj;
            }
            size += c1919Yj0.size() + J9.i(c1919Yj0.size()) + J9.k(6);
        }
        int size2 = this.a.size() + size;
        this.l = size2;
        return size2;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return C0342Ed0.l();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        C0342Ed0 c0342Ed0L = C0342Ed0.l();
        c0342Ed0L.m(this);
        return c0342Ed0L;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final boolean e() {
        byte b = this.k;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.k = (byte) 1;
        return true;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        AbstractC0596Hk c1919Yj0;
        b();
        if ((this.b & 1) == 1) {
            j9.w(1, this.c);
        }
        if ((this.b & 2) == 2) {
            j9.w(2, this.d);
        }
        if ((this.b & 8) == 8) {
            j9.v(3, this.f.a);
        }
        if (this.g.size() > 0) {
            j9.F(34);
            j9.F(this.h);
        }
        for (int i = 0; i < this.g.size(); i++) {
            j9.x(((Integer) this.g.get(i)).intValue());
        }
        if (this.i.size() > 0) {
            j9.F(42);
            j9.F(this.j);
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            j9.x(((Integer) this.i.get(i2)).intValue());
        }
        if ((this.b & 4) == 4) {
            Object obj = this.e;
            if (obj instanceof String) {
                try {
                    c1919Yj0 = new C1919Yj0(((String) obj).getBytes("UTF-8"));
                    this.e = c1919Yj0;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            } else {
                c1919Yj0 = (AbstractC0596Hk) obj;
            }
            j9.H(6, 2);
            j9.F(c1919Yj0.size());
            j9.B(c1919Yj0);
        }
        j9.B(this.a);
    }

    public C0498Gd0(C5780lu c5780lu) {
        EnumC0420Fd0 enumC0420Fd0;
        this.h = -1;
        this.j = -1;
        this.k = (byte) -1;
        this.l = -1;
        this.c = 1;
        boolean z = false;
        this.d = 0;
        this.e = "";
        EnumC0420Fd0 enumC0420Fd02 = EnumC0420Fd0.NONE;
        this.f = enumC0420Fd02;
        this.g = Collections.emptyList();
        this.i = Collections.emptyList();
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = c5780lu.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.b |= 1;
                            this.c = c5780lu.k();
                        } else if (iN == 16) {
                            this.b |= 2;
                            this.d = c5780lu.k();
                        } else if (iN == 24) {
                            int iK = c5780lu.k();
                            if (iK == 0) {
                                enumC0420Fd0 = enumC0420Fd02;
                            } else if (iK != 1) {
                                enumC0420Fd0 = iK != 2 ? null : EnumC0420Fd0.DESC_TO_CLASS_ID;
                            } else {
                                enumC0420Fd0 = EnumC0420Fd0.INTERNAL_TO_CLASS_ID;
                            }
                            if (enumC0420Fd0 == null) {
                                j9N.F(iN);
                                j9N.F(iK);
                            } else {
                                this.b |= 8;
                                this.f = enumC0420Fd0;
                            }
                        } else if (iN == 32) {
                            if ((i & 16) != 16) {
                                this.g = new ArrayList();
                                i |= 16;
                            }
                            this.g.add(Integer.valueOf(c5780lu.k()));
                        } else if (iN == 34) {
                            int iD = c5780lu.d(c5780lu.k());
                            if ((i & 16) != 16 && c5780lu.b() > 0) {
                                this.g = new ArrayList();
                                i |= 16;
                            }
                            while (c5780lu.b() > 0) {
                                this.g.add(Integer.valueOf(c5780lu.k()));
                            }
                            c5780lu.c(iD);
                        } else if (iN == 40) {
                            if ((i & 32) != 32) {
                                this.i = new ArrayList();
                                i |= 32;
                            }
                            this.i.add(Integer.valueOf(c5780lu.k()));
                        } else if (iN == 42) {
                            int iD2 = c5780lu.d(c5780lu.k());
                            if ((i & 32) != 32 && c5780lu.b() > 0) {
                                this.i = new ArrayList();
                                i |= 32;
                            }
                            while (c5780lu.b() > 0) {
                                this.i.add(Integer.valueOf(c5780lu.k()));
                            }
                            c5780lu.c(iD2);
                        } else if (iN != 50) {
                            if (!c5780lu.q(iN, j9N)) {
                            }
                        } else {
                            C1919Yj0 c1919Yj0E = c5780lu.e();
                            this.b |= 4;
                            this.e = c1919Yj0E;
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
                if ((i & 16) == 16) {
                    this.g = Collections.unmodifiableList(this.g);
                }
                if ((i & 32) == 32) {
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
        if ((i & 16) == 16) {
            this.g = Collections.unmodifiableList(this.g);
        }
        if ((i & 32) == 32) {
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

    public C0498Gd0(C0342Ed0 c0342Ed0) {
        this.h = -1;
        this.j = -1;
        this.k = (byte) -1;
        this.l = -1;
        this.a = c0342Ed0.a;
    }
}
