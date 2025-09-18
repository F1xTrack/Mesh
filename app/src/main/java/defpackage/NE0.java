package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.impl.C4473c9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class NE0 extends A00 {
    public static final NE0 p;
    public static final C8019xd0 q = new C8019xd0(7);
    public final AbstractC0596Hk a;
    public int b;
    public ME0 c;
    public long d;
    public float e;
    public double f;
    public int g;
    public int h;
    public int i;
    public QE0 j;
    public List k;
    public int l;
    public int m;
    public byte n;
    public int o;

    static {
        NE0 ne0 = new NE0();
        p = ne0;
        ne0.i();
    }

    public NE0() {
        this.n = (byte) -1;
        this.o = -1;
        this.a = AbstractC0596Hk.a;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.o;
        if (i != -1) {
            return i;
        }
        int iC = (this.b & 1) == 1 ? J9.c(1, this.c.a) : 0;
        if ((this.b & 2) == 2) {
            long j = this.d;
            iC += J9.j((j >> 63) ^ (j << 1)) + J9.k(2);
        }
        if ((this.b & 4) == 4) {
            iC += J9.k(3) + 4;
        }
        if ((this.b & 8) == 8) {
            iC += J9.k(4) + 8;
        }
        if ((this.b & 16) == 16) {
            iC += J9.e(5, this.g);
        }
        if ((this.b & 32) == 32) {
            iC += J9.e(6, this.h);
        }
        if ((this.b & 64) == 64) {
            iC += J9.e(7, this.i);
        }
        if ((this.b & 128) == 128) {
            iC += J9.g(8, this.j);
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            iC += J9.g(9, (K0) this.k.get(i2));
        }
        if ((this.b & 512) == 512) {
            iC += J9.e(10, this.m);
        }
        if ((this.b & 256) == 256) {
            iC += J9.e(11, this.l);
        }
        int size = this.a.size() + iC;
        this.o = size;
        return size;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return LE0.l();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        LE0 le0L = LE0.l();
        le0L.m(this);
        return le0L;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final boolean e() {
        byte b = this.n;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.b & 128) == 128 && !this.j.e()) {
            this.n = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.k.size(); i++) {
            if (!((NE0) this.k.get(i)).e()) {
                this.n = (byte) 0;
                return false;
            }
        }
        this.n = (byte) 1;
        return true;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        if ((this.b & 1) == 1) {
            j9.v(1, this.c.a);
        }
        if ((this.b & 2) == 2) {
            long j = this.d;
            j9.H(2, 0);
            j9.G((j >> 63) ^ (j << 1));
        }
        if ((this.b & 4) == 4) {
            float f = this.e;
            j9.H(3, 5);
            j9.D(Float.floatToRawIntBits(f));
        }
        if ((this.b & 8) == 8) {
            double d = this.f;
            j9.H(4, 1);
            j9.E(Double.doubleToRawLongBits(d));
        }
        if ((this.b & 16) == 16) {
            j9.w(5, this.g);
        }
        if ((this.b & 32) == 32) {
            j9.w(6, this.h);
        }
        if ((this.b & 64) == 64) {
            j9.w(7, this.i);
        }
        if ((this.b & 128) == 128) {
            j9.y(8, this.j);
        }
        for (int i = 0; i < this.k.size(); i++) {
            j9.y(9, (K0) this.k.get(i));
        }
        if ((this.b & 512) == 512) {
            j9.w(10, this.m);
        }
        if ((this.b & 256) == 256) {
            j9.w(11, this.l);
        }
        j9.B(this.a);
    }

    public final void i() {
        this.c = ME0.BYTE;
        this.d = 0L;
        this.e = 0.0f;
        this.f = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = QE0.g;
        this.k = Collections.emptyList();
        this.l = 0;
        this.m = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public NE0(C5780lu c5780lu, DR dr) {
        PE0 pe0;
        this.n = (byte) -1;
        this.o = -1;
        i();
        C0518Gk c0518Gk = new C0518Gk();
        J9 j9N = J9.n(c0518Gk, 1);
        boolean z = false;
        char c = 0;
        while (true) {
            ?? Q = 256;
            if (!z) {
                try {
                    try {
                        int iN = c5780lu.n();
                        switch (iN) {
                            case 0:
                                z = true;
                            case 8:
                                int iK = c5780lu.k();
                                ME0 me0B = ME0.b(iK);
                                if (me0B == null) {
                                    j9N.F(iN);
                                    j9N.F(iK);
                                } else {
                                    this.b |= 1;
                                    this.c = me0B;
                                }
                            case 16:
                                this.b |= 2;
                                long jL = c5780lu.l();
                                this.d = (-(jL & 1)) ^ (jL >>> 1);
                            case 29:
                                this.b |= 4;
                                this.e = Float.intBitsToFloat(c5780lu.i());
                            case 33:
                                this.b |= 8;
                                this.f = Double.longBitsToDouble(c5780lu.j());
                            case C4473c9.L /* 40 */:
                                this.b |= 16;
                                this.g = c5780lu.k();
                            case 48:
                                this.b |= 32;
                                this.h = c5780lu.k();
                            case 56:
                                this.b |= 64;
                                this.i = c5780lu.k();
                            case 66:
                                if ((this.b & 128) == 128) {
                                    QE0 qe0 = this.j;
                                    qe0.getClass();
                                    pe0 = new PE0(0);
                                    pe0.d = Collections.emptyList();
                                    pe0.p(qe0);
                                } else {
                                    pe0 = null;
                                }
                                QE0 qe02 = (QE0) c5780lu.g(QE0.h, dr);
                                this.j = qe02;
                                if (pe0 != null) {
                                    pe0.p(qe02);
                                    this.j = pe0.l();
                                }
                                this.b |= 128;
                            case 74:
                                if ((c & 256) != 256) {
                                    this.k = new ArrayList();
                                    c = 256;
                                }
                                this.k.add(c5780lu.g(q, dr));
                            case 80:
                                this.b |= 512;
                                this.m = c5780lu.k();
                            case 88:
                                this.b |= 256;
                                this.l = c5780lu.k();
                            default:
                                Q = c5780lu.q(iN, j9N);
                                if (Q == 0) {
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
                    if ((c & 256) == Q) {
                        this.k = Collections.unmodifiableList(this.k);
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
            } else {
                if ((c & 256) == 256) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                try {
                    j9N.m();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.a = c0518Gk.n();
                    throw th3;
                }
                this.a = c0518Gk.n();
                return;
            }
        }
    }

    public NE0(LE0 le0) {
        this.n = (byte) -1;
        this.o = -1;
        this.a = le0.a;
    }
}
