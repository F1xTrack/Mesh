package defpackage;

import com.facebook.crypto.mac.NativeMac;
import io.appmetrica.analytics.impl.C4473c9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: qF0 */
/* loaded from: classes2.dex */
public final class C6613qF0 extends AbstractC7709w00 {
    public static final C6613qF0 u;
    public static final C8019xd0 v = new C8019xd0(17);
    public final AbstractC0596Hk b;
    public int c;
    public int d;
    public int e;
    public int f;
    public AF0 g;
    public int h;
    public List i;
    public AF0 j;
    public int k;
    public List l;
    public List m;
    public int n;
    public IF0 o;
    public int p;
    public int q;
    public List r;
    public byte s;
    public int t;

    static {
        C6613qF0 c6613qF0 = new C6613qF0();
        u = c6613qF0;
        c6613qF0.q();
    }

    public C6613qF0(C6422pF0 c6422pF0) {
        super(c6422pF0);
        this.n = -1;
        this.s = (byte) -1;
        this.t = -1;
        this.b = c6422pF0.a;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final K0 a() {
        return u;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.t;
        if (i != -1) {
            return i;
        }
        int iE = (this.c & 2) == 2 ? J9.e(1, this.e) : 0;
        if ((this.c & 4) == 4) {
            iE += J9.e(2, this.f);
        }
        if ((this.c & 8) == 8) {
            iE += J9.g(3, this.g);
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            iE += J9.g(4, (K0) this.i.get(i2));
        }
        if ((this.c & 32) == 32) {
            iE += J9.g(5, this.j);
        }
        if ((this.c & 128) == 128) {
            iE += J9.g(6, this.o);
        }
        if ((this.c & 256) == 256) {
            iE += J9.e(7, this.p);
        }
        if ((this.c & 512) == 512) {
            iE += J9.e(8, this.q);
        }
        if ((this.c & 16) == 16) {
            iE += J9.e(9, this.h);
        }
        if ((this.c & 64) == 64) {
            iE += J9.e(10, this.k);
        }
        if ((this.c & 1) == 1) {
            iE += J9.e(11, this.d);
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            iE += J9.g(12, (K0) this.l.get(i3));
        }
        int iF = 0;
        for (int i4 = 0; i4 < this.m.size(); i4++) {
            iF += J9.f(((Integer) this.m.get(i4)).intValue());
        }
        int iF2 = iE + iF;
        if (!this.m.isEmpty()) {
            iF2 = iF2 + 1 + J9.f(iF);
        }
        this.n = iF;
        int iF3 = 0;
        for (int i5 = 0; i5 < this.r.size(); i5++) {
            iF3 += J9.f(((Integer) this.r.get(i5)).intValue());
        }
        int size = this.b.size() + j() + (this.r.size() * 2) + iF2 + iF3;
        this.t = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return C6422pF0.m();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        C6422pF0 c6422pF0M = C6422pF0.m();
        c6422pF0M.n(this);
        return c6422pF0M;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final boolean e() {
        byte b = this.s;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.c;
        if ((i & 4) != 4) {
            this.s = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.g.e()) {
            this.s = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (!((FF0) this.i.get(i2)).e()) {
                this.s = (byte) 0;
                return false;
            }
        }
        if (p() && !this.j.e()) {
            this.s = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            if (!((AF0) this.l.get(i3)).e()) {
                this.s = (byte) 0;
                return false;
            }
        }
        if ((this.c & 128) == 128 && !this.o.e()) {
            this.s = (byte) 0;
            return false;
        }
        if (i()) {
            this.s = (byte) 1;
            return true;
        }
        this.s = (byte) 0;
        return false;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        C3383dO1 c3383dO1 = new C3383dO1(this);
        if ((this.c & 2) == 2) {
            j9.w(1, this.e);
        }
        if ((this.c & 4) == 4) {
            j9.w(2, this.f);
        }
        if ((this.c & 8) == 8) {
            j9.y(3, this.g);
        }
        for (int i = 0; i < this.i.size(); i++) {
            j9.y(4, (K0) this.i.get(i));
        }
        if ((this.c & 32) == 32) {
            j9.y(5, this.j);
        }
        if ((this.c & 128) == 128) {
            j9.y(6, this.o);
        }
        if ((this.c & 256) == 256) {
            j9.w(7, this.p);
        }
        if ((this.c & 512) == 512) {
            j9.w(8, this.q);
        }
        if ((this.c & 16) == 16) {
            j9.w(9, this.h);
        }
        if ((this.c & 64) == 64) {
            j9.w(10, this.k);
        }
        if ((this.c & 1) == 1) {
            j9.w(11, this.d);
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            j9.y(12, (K0) this.l.get(i2));
        }
        if (this.m.size() > 0) {
            j9.F(106);
            j9.F(this.n);
        }
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            j9.x(((Integer) this.m.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.r.size(); i4++) {
            j9.w(31, ((Integer) this.r.get(i4)).intValue());
        }
        c3383dO1.K(19000, j9);
        j9.B(this.b);
    }

    public final boolean p() {
        return (this.c & 32) == 32;
    }

    public final void q() {
        this.d = 518;
        this.e = 2054;
        this.f = 0;
        AF0 af0 = AF0.t;
        this.g = af0;
        this.h = 0;
        this.i = Collections.emptyList();
        this.j = af0;
        this.k = 0;
        this.l = Collections.emptyList();
        this.m = Collections.emptyList();
        this.o = IF0.l;
        this.p = 0;
        this.q = 0;
        this.r = Collections.emptyList();
    }

    public C6613qF0() {
        this.n = -1;
        this.s = (byte) -1;
        this.t = -1;
        this.b = AbstractC0596Hk.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public C6613qF0(C5780lu c5780lu, DR dr) {
        this.n = -1;
        this.s = (byte) -1;
        this.t = -1;
        q();
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        boolean z = false;
        char c = 0;
        while (true) {
            ?? N = 256;
            if (!z) {
                try {
                    try {
                        int iN = c5780lu.n();
                        C8327zF0 c8327zF0R = null;
                        HF0 hf0 = null;
                        C8327zF0 c8327zF0R2 = null;
                        switch (iN) {
                            case 0:
                                z = true;
                            case 8:
                                this.c |= 2;
                                this.e = c5780lu.k();
                            case 16:
                                this.c |= 4;
                                this.f = c5780lu.k();
                            case 26:
                                if ((this.c & 8) == 8) {
                                    AF0 af0 = this.g;
                                    af0.getClass();
                                    c8327zF0R = AF0.r(af0);
                                }
                                AF0 af02 = (AF0) c5780lu.g(AF0.u, dr);
                                this.g = af02;
                                if (c8327zF0R != null) {
                                    c8327zF0R.n(af02);
                                    this.g = c8327zF0R.l();
                                }
                                this.c |= 8;
                            case 34:
                                int i = (c == true ? 1 : 0) & 32;
                                c = c;
                                if (i != 32) {
                                    this.i = new ArrayList();
                                    c = (c == true ? 1 : 0) | ' ';
                                }
                                this.i.add(c5780lu.g(FF0.n, dr));
                            case C4473c9.M /* 42 */:
                                if ((this.c & 32) == 32) {
                                    AF0 af03 = this.j;
                                    af03.getClass();
                                    c8327zF0R2 = AF0.r(af03);
                                }
                                AF0 af04 = (AF0) c5780lu.g(AF0.u, dr);
                                this.j = af04;
                                if (c8327zF0R2 != null) {
                                    c8327zF0R2.n(af04);
                                    this.j = c8327zF0R2.l();
                                }
                                this.c |= 32;
                            case 50:
                                if ((this.c & 128) == 128) {
                                    IF0 if0 = this.o;
                                    if0.getClass();
                                    hf0 = new HF0();
                                    AF0 af05 = AF0.t;
                                    hf0.g = af05;
                                    hf0.i = af05;
                                    hf0.m(if0);
                                }
                                IF0 if02 = (IF0) c5780lu.g(IF0.m, dr);
                                this.o = if02;
                                if (hf0 != null) {
                                    hf0.m(if02);
                                    this.o = hf0.l();
                                }
                                this.c |= 128;
                            case 56:
                                this.c |= 256;
                                this.p = c5780lu.k();
                            case NativeMac.KEY_LENGTH /* 64 */:
                                this.c |= 512;
                                this.q = c5780lu.k();
                            case 72:
                                this.c |= 16;
                                this.h = c5780lu.k();
                            case 80:
                                this.c |= 64;
                                this.k = c5780lu.k();
                            case 88:
                                this.c |= 1;
                                this.d = c5780lu.k();
                            case 98:
                                int i2 = (c == true ? 1 : 0) & 256;
                                c = c;
                                if (i2 != 256) {
                                    this.l = new ArrayList();
                                    c = (c == true ? 1 : 0) | 256;
                                }
                                this.l.add(c5780lu.g(AF0.u, dr));
                            case 104:
                                int i3 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i3 != 512) {
                                    this.m = new ArrayList();
                                    c = (c == true ? 1 : 0) | 512;
                                }
                                this.m.add(Integer.valueOf(c5780lu.k()));
                            case 106:
                                int iD = c5780lu.d(c5780lu.k());
                                int i4 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i4 != 512) {
                                    c = c;
                                    if (c5780lu.b() > 0) {
                                        this.m = new ArrayList();
                                        c = (c == true ? 1 : 0) | 512;
                                    }
                                }
                                while (c5780lu.b() > 0) {
                                    this.m.add(Integer.valueOf(c5780lu.k()));
                                }
                                c5780lu.c(iD);
                            case 248:
                                int i5 = (c == true ? 1 : 0) & 8192;
                                c = c;
                                if (i5 != 8192) {
                                    this.r = new ArrayList();
                                    c = (c == true ? 1 : 0) | 8192;
                                }
                                this.r.add(Integer.valueOf(c5780lu.k()));
                            case 250:
                                int iD2 = c5780lu.d(c5780lu.k());
                                int i6 = (c == true ? 1 : 0) & 8192;
                                c = c;
                                if (i6 != 8192) {
                                    c = c;
                                    if (c5780lu.b() > 0) {
                                        this.r = new ArrayList();
                                        c = (c == true ? 1 : 0) | 8192;
                                    }
                                }
                                while (c5780lu.b() > 0) {
                                    this.r.add(Integer.valueOf(c5780lu.k()));
                                }
                                c5780lu.c(iD2);
                            default:
                                N = n(c5780lu, j9N, dr, iN);
                                if (N == 0) {
                                    z = true;
                                }
                        }
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
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    if (((c == true ? 1 : 0) & 256) == N) {
                        this.l = Collections.unmodifiableList(this.l);
                    }
                    if (((c == true ? 1 : 0) & 512) == 512) {
                        this.m = Collections.unmodifiableList(this.m);
                    }
                    if (((c == true ? 1 : 0) & 8192) == 8192) {
                        this.r = Collections.unmodifiableList(this.r);
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
            } else {
                if (((c == true ? 1 : 0) & 32) == 32) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if (((c == true ? 1 : 0) & 256) == 256) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                if (((c == true ? 1 : 0) & 512) == 512) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if (((c == true ? 1 : 0) & 8192) == 8192) {
                    this.r = Collections.unmodifiableList(this.r);
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
                return;
            }
        }
    }
}
