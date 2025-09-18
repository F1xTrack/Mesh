package p000;

import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.impl.C5043c9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class NE0 extends A00 {

    /* renamed from: p */
    public static final NE0 f7652p;

    /* renamed from: q */
    public static final C11695xd0 f7653q = new C11695xd0(7);

    /* renamed from: a */
    public final AbstractC0488Hk f7654a;

    /* renamed from: b */
    public int f7655b;

    /* renamed from: c */
    public ME0 f7656c;

    /* renamed from: d */
    public long f7657d;

    /* renamed from: e */
    public float f7658e;

    /* renamed from: f */
    public double f7659f;

    /* renamed from: g */
    public int f7660g;

    /* renamed from: h */
    public int f7661h;

    /* renamed from: i */
    public int f7662i;

    /* renamed from: j */
    public QE0 f7663j;

    /* renamed from: k */
    public List f7664k;

    /* renamed from: l */
    public int f7665l;

    /* renamed from: m */
    public int f7666m;

    /* renamed from: n */
    public byte f7667n;

    /* renamed from: o */
    public int f7668o;

    static {
        NE0 ne0 = new NE0();
        f7652p = ne0;
        ne0.m5612i();
    }

    public NE0() {
        this.f7667n = (byte) -1;
        this.f7668o = -1;
        this.f7654a = AbstractC0488Hk.f4481a;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f7668o;
        if (i != -1) {
            return i;
        }
        int iM4204c = (this.f7655b & 1) == 1 ? C0577J9.m4204c(1, this.f7656c.f7059a) : 0;
        if ((this.f7655b & 2) == 2) {
            long j = this.f7657d;
            iM4204c += C0577J9.m4210j((j >> 63) ^ (j << 1)) + C0577J9.m4211k(2);
        }
        if ((this.f7655b & 4) == 4) {
            iM4204c += C0577J9.m4211k(3) + 4;
        }
        if ((this.f7655b & 8) == 8) {
            iM4204c += C0577J9.m4211k(4) + 8;
        }
        if ((this.f7655b & 16) == 16) {
            iM4204c += C0577J9.m4205e(5, this.f7660g);
        }
        if ((this.f7655b & 32) == 32) {
            iM4204c += C0577J9.m4205e(6, this.f7661h);
        }
        if ((this.f7655b & 64) == 64) {
            iM4204c += C0577J9.m4205e(7, this.f7662i);
        }
        if ((this.f7655b & 128) == 128) {
            iM4204c += C0577J9.m4207g(8, this.f7663j);
        }
        for (int i2 = 0; i2 < this.f7664k.size(); i2++) {
            iM4204c += C0577J9.m4207g(9, (AbstractC0631K0) this.f7664k.get(i2));
        }
        if ((this.f7655b & 512) == 512) {
            iM4204c += C0577J9.m4205e(10, this.f7666m);
        }
        if ((this.f7655b & 256) == 256) {
            iM4204c += C0577J9.m4205e(11, this.f7665l);
        }
        int size = this.f7654a.size() + iM4204c;
        this.f7668o = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return LE0.m4929l();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        LE0 le0M4929l = LE0.m4929l();
        le0M4929l.m4931m(this);
        return le0M4929l;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f7667n;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f7655b & 128) == 128 && !this.f7663j.mo131e()) {
            this.f7667n = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f7664k.size(); i++) {
            if (!((NE0) this.f7664k.get(i)).mo131e()) {
                this.f7667n = (byte) 0;
                return false;
            }
        }
        this.f7667n = (byte) 1;
        return true;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        if ((this.f7655b & 1) == 1) {
            c0577j9.m4232v(1, this.f7656c.f7059a);
        }
        if ((this.f7655b & 2) == 2) {
            long j = this.f7657d;
            c0577j9.m4220H(2, 0);
            c0577j9.m4219G((j >> 63) ^ (j << 1));
        }
        if ((this.f7655b & 4) == 4) {
            float f = this.f7658e;
            c0577j9.m4220H(3, 5);
            c0577j9.m4216D(Float.floatToRawIntBits(f));
        }
        if ((this.f7655b & 8) == 8) {
            double d = this.f7659f;
            c0577j9.m4220H(4, 1);
            c0577j9.m4217E(Double.doubleToRawLongBits(d));
        }
        if ((this.f7655b & 16) == 16) {
            c0577j9.m4233w(5, this.f7660g);
        }
        if ((this.f7655b & 32) == 32) {
            c0577j9.m4233w(6, this.f7661h);
        }
        if ((this.f7655b & 64) == 64) {
            c0577j9.m4233w(7, this.f7662i);
        }
        if ((this.f7655b & 128) == 128) {
            c0577j9.m4235y(8, this.f7663j);
        }
        for (int i = 0; i < this.f7664k.size(); i++) {
            c0577j9.m4235y(9, (AbstractC0631K0) this.f7664k.get(i));
        }
        if ((this.f7655b & 512) == 512) {
            c0577j9.m4233w(10, this.f7666m);
        }
        if ((this.f7655b & 256) == 256) {
            c0577j9.m4233w(11, this.f7665l);
        }
        c0577j9.m4214B(this.f7654a);
    }

    /* renamed from: i */
    public final void m5612i() {
        this.f7656c = ME0.BYTE;
        this.f7657d = 0L;
        this.f7658e = 0.0f;
        this.f7659f = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f7660g = 0;
        this.f7661h = 0;
        this.f7662i = 0;
        this.f7663j = QE0.f9540g;
        this.f7664k = Collections.emptyList();
        this.f7665l = 0;
        this.f7666m = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public NE0(C6392lu c6392lu, C0217DR c0217dr) {
        PE0 pe0;
        this.f7667n = (byte) -1;
        this.f7668o = -1;
        m5612i();
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        boolean z = false;
        char c = 0;
        while (true) {
            ?? M22589q = 256;
            if (!z) {
                try {
                    try {
                        int iM22586n = c6392lu.m22586n();
                        switch (iM22586n) {
                            case 0:
                                z = true;
                            case 8:
                                int iM22583k = c6392lu.m22583k();
                                ME0 me0M5287b = ME0.m5287b(iM22583k);
                                if (me0M5287b == null) {
                                    c0577j9M4212n.m4218F(iM22586n);
                                    c0577j9M4212n.m4218F(iM22583k);
                                } else {
                                    this.f7655b |= 1;
                                    this.f7656c = me0M5287b;
                                }
                            case 16:
                                this.f7655b |= 2;
                                long jM22584l = c6392lu.m22584l();
                                this.f7657d = (-(jM22584l & 1)) ^ (jM22584l >>> 1);
                            case 29:
                                this.f7655b |= 4;
                                this.f7658e = Float.intBitsToFloat(c6392lu.m22581i());
                            case 33:
                                this.f7655b |= 8;
                                this.f7659f = Double.longBitsToDouble(c6392lu.m22582j());
                            case C5043c9.f31376L /* 40 */:
                                this.f7655b |= 16;
                                this.f7660g = c6392lu.m22583k();
                            case 48:
                                this.f7655b |= 32;
                                this.f7661h = c6392lu.m22583k();
                            case 56:
                                this.f7655b |= 64;
                                this.f7662i = c6392lu.m22583k();
                            case 66:
                                if ((this.f7655b & 128) == 128) {
                                    QE0 qe0 = this.f7663j;
                                    qe0.getClass();
                                    pe0 = new PE0(0);
                                    pe0.f8932d = Collections.emptyList();
                                    pe0.m6277p(qe0);
                                } else {
                                    pe0 = null;
                                }
                                QE0 qe02 = (QE0) c6392lu.m22579g(QE0.f9541h, c0217dr);
                                this.f7663j = qe02;
                                if (pe0 != null) {
                                    pe0.m6277p(qe02);
                                    this.f7663j = pe0.m6274l();
                                }
                                this.f7655b |= 128;
                            case 74:
                                if ((c & 256) != 256) {
                                    this.f7664k = new ArrayList();
                                    c = 256;
                                }
                                this.f7664k.add(c6392lu.m22579g(f7653q, c0217dr));
                            case 80:
                                this.f7655b |= 512;
                                this.f7666m = c6392lu.m22583k();
                            case 88:
                                this.f7655b |= 256;
                                this.f7665l = c6392lu.m22583k();
                            default:
                                M22589q = c6392lu.m22589q(iM22586n, c0577j9M4212n);
                                if (M22589q == 0) {
                                    z = true;
                                }
                        }
                    } catch (Y90 e) {
                        e.f14178a = this;
                        throw e;
                    } catch (IOException e2) {
                        Y90 y90 = new Y90(e2.getMessage());
                        y90.f14178a = this;
                        throw y90;
                    }
                } catch (Throwable th) {
                    if ((c & 256) == M22589q) {
                        this.f7664k = Collections.unmodifiableList(this.f7664k);
                    }
                    try {
                        c0577j9M4212n.m4224m();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f7654a = c0425Gk.m3146n();
                        throw th2;
                    }
                    this.f7654a = c0425Gk.m3146n();
                    throw th;
                }
            } else {
                if ((c & 256) == 256) {
                    this.f7664k = Collections.unmodifiableList(this.f7664k);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f7654a = c0425Gk.m3146n();
                    throw th3;
                }
                this.f7654a = c0425Gk.m3146n();
                return;
            }
        }
    }

    public NE0(LE0 le0) {
        this.f7667n = (byte) -1;
        this.f7668o = -1;
        this.f7654a = le0.f41281a;
    }
}
