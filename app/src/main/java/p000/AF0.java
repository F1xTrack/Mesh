package p000;

import com.facebook.crypto.mac.NativeMac;
import io.appmetrica.analytics.impl.C5043c9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class AF0 extends AbstractC11487w00 {

    /* renamed from: t */
    public static final AF0 f123t;

    /* renamed from: u */
    public static final C11695xd0 f124u = new C11695xd0(21);

    /* renamed from: b */
    public final AbstractC0488Hk f125b;

    /* renamed from: c */
    public int f126c;

    /* renamed from: d */
    public List f127d;

    /* renamed from: e */
    public boolean f128e;

    /* renamed from: f */
    public int f129f;

    /* renamed from: g */
    public AF0 f130g;

    /* renamed from: h */
    public int f131h;

    /* renamed from: i */
    public int f132i;

    /* renamed from: j */
    public int f133j;

    /* renamed from: k */
    public int f134k;

    /* renamed from: l */
    public int f135l;

    /* renamed from: m */
    public AF0 f136m;

    /* renamed from: n */
    public int f137n;

    /* renamed from: o */
    public AF0 f138o;

    /* renamed from: p */
    public int f139p;

    /* renamed from: q */
    public int f140q;

    /* renamed from: r */
    public byte f141r;

    /* renamed from: s */
    public int f142s;

    static {
        AF0 af0 = new AF0();
        f123t = af0;
        af0.m134q();
    }

    public AF0(C11901zF0 c11901zF0) {
        super(c11901zF0);
        this.f141r = (byte) -1;
        this.f142s = -1;
        this.f125b = c11901zF0.f41281a;
    }

    /* renamed from: r */
    public static C11901zF0 m126r(AF0 af0) {
        C11901zF0 c11901zF0M26350m = C11901zF0.m26350m();
        c11901zF0M26350m.m26352n(af0);
        return c11901zF0M26350m;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: a */
    public final AbstractC0631K0 mo127a() {
        return f123t;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f142s;
        if (i != -1) {
            return i;
        }
        int iM4205e = (this.f126c & 4096) == 4096 ? C0577J9.m4205e(1, this.f140q) : 0;
        for (int i2 = 0; i2 < this.f127d.size(); i2++) {
            iM4205e += C0577J9.m4207g(2, (AbstractC0631K0) this.f127d.get(i2));
        }
        if ((this.f126c & 1) == 1) {
            iM4205e += C0577J9.m4211k(3) + 1;
        }
        if ((this.f126c & 2) == 2) {
            iM4205e += C0577J9.m4205e(4, this.f129f);
        }
        if ((this.f126c & 4) == 4) {
            iM4205e += C0577J9.m4207g(5, this.f130g);
        }
        if ((this.f126c & 16) == 16) {
            iM4205e += C0577J9.m4205e(6, this.f132i);
        }
        if ((this.f126c & 32) == 32) {
            iM4205e += C0577J9.m4205e(7, this.f133j);
        }
        if ((this.f126c & 8) == 8) {
            iM4205e += C0577J9.m4205e(8, this.f131h);
        }
        if ((this.f126c & 64) == 64) {
            iM4205e += C0577J9.m4205e(9, this.f134k);
        }
        if ((this.f126c & 256) == 256) {
            iM4205e += C0577J9.m4207g(10, this.f136m);
        }
        if ((this.f126c & 512) == 512) {
            iM4205e += C0577J9.m4205e(11, this.f137n);
        }
        if ((this.f126c & 128) == 128) {
            iM4205e += C0577J9.m4205e(12, this.f135l);
        }
        if ((this.f126c & 1024) == 1024) {
            iM4205e += C0577J9.m4207g(13, this.f138o);
        }
        if ((this.f126c & 2048) == 2048) {
            iM4205e += C0577J9.m4205e(14, this.f139p);
        }
        int size = this.f125b.size() + m25536j() + iM4205e;
        this.f142s = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return C11901zF0.m26350m();
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f141r;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f127d.size(); i++) {
            if (!((C11774yF0) this.f127d.get(i)).mo131e()) {
                this.f141r = (byte) 0;
                return false;
            }
        }
        if ((this.f126c & 4) == 4 && !this.f130g.mo131e()) {
            this.f141r = (byte) 0;
            return false;
        }
        if ((this.f126c & 256) == 256 && !this.f136m.mo131e()) {
            this.f141r = (byte) 0;
            return false;
        }
        if ((this.f126c & 1024) == 1024 && !this.f138o.mo131e()) {
            this.f141r = (byte) 0;
            return false;
        }
        if (m25535i()) {
            this.f141r = (byte) 1;
            return true;
        }
        this.f141r = (byte) 0;
        return false;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        C9108dO1 c9108dO1 = new C9108dO1(this);
        if ((this.f126c & 4096) == 4096) {
            c0577j9.m4233w(1, this.f140q);
        }
        for (int i = 0; i < this.f127d.size(); i++) {
            c0577j9.m4235y(2, (AbstractC0631K0) this.f127d.get(i));
        }
        if ((this.f126c & 1) == 1) {
            boolean z = this.f128e;
            c0577j9.m4220H(3, 0);
            c0577j9.m4213A(z ? 1 : 0);
        }
        if ((this.f126c & 2) == 2) {
            c0577j9.m4233w(4, this.f129f);
        }
        if ((this.f126c & 4) == 4) {
            c0577j9.m4235y(5, this.f130g);
        }
        if ((this.f126c & 16) == 16) {
            c0577j9.m4233w(6, this.f132i);
        }
        if ((this.f126c & 32) == 32) {
            c0577j9.m4233w(7, this.f133j);
        }
        if ((this.f126c & 8) == 8) {
            c0577j9.m4233w(8, this.f131h);
        }
        if ((this.f126c & 64) == 64) {
            c0577j9.m4233w(9, this.f134k);
        }
        if ((this.f126c & 256) == 256) {
            c0577j9.m4235y(10, this.f136m);
        }
        if ((this.f126c & 512) == 512) {
            c0577j9.m4233w(11, this.f137n);
        }
        if ((this.f126c & 128) == 128) {
            c0577j9.m4233w(12, this.f135l);
        }
        if ((this.f126c & 1024) == 1024) {
            c0577j9.m4235y(13, this.f138o);
        }
        if ((this.f126c & 2048) == 2048) {
            c0577j9.m4233w(14, this.f139p);
        }
        c9108dO1.m17570K(200, c0577j9);
        c0577j9.m4214B(this.f125b);
    }

    /* renamed from: p */
    public final boolean m133p() {
        return (this.f126c & 16) == 16;
    }

    /* renamed from: q */
    public final void m134q() {
        this.f127d = Collections.emptyList();
        this.f128e = false;
        this.f129f = 0;
        AF0 af0 = f123t;
        this.f130g = af0;
        this.f131h = 0;
        this.f132i = 0;
        this.f133j = 0;
        this.f134k = 0;
        this.f135l = 0;
        this.f136m = af0;
        this.f137n = 0;
        this.f138o = af0;
        this.f139p = 0;
        this.f140q = 0;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: s */
    public final C11901zF0 mo130d() {
        return m126r(this);
    }

    public AF0() {
        this.f141r = (byte) -1;
        this.f142s = -1;
        this.f125b = AbstractC0488Hk.f4481a;
    }

    public AF0(C6392lu c6392lu, C0217DR c0217dr) {
        this.f141r = (byte) -1;
        this.f142s = -1;
        m134q();
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    C11695xd0 c11695xd0 = f124u;
                    C11901zF0 c11901zF0M126r = null;
                    switch (iM22586n) {
                        case 0:
                            break;
                        case 8:
                            this.f126c |= 4096;
                            this.f140q = c6392lu.m22583k();
                            continue;
                        case 18:
                            if (!z2) {
                                this.f127d = new ArrayList();
                                z2 = true;
                            }
                            this.f127d.add(c6392lu.m22579g(C11774yF0.f46150i, c0217dr));
                            continue;
                        case 24:
                            this.f126c |= 1;
                            this.f128e = c6392lu.m22584l() != 0;
                            continue;
                        case 32:
                            this.f126c |= 2;
                            this.f129f = c6392lu.m22583k();
                            continue;
                        case C5043c9.f31377M /* 42 */:
                            if ((this.f126c & 4) == 4) {
                                AF0 af0 = this.f130g;
                                af0.getClass();
                                c11901zF0M126r = m126r(af0);
                            }
                            AF0 af02 = (AF0) c6392lu.m22579g(c11695xd0, c0217dr);
                            this.f130g = af02;
                            if (c11901zF0M126r != null) {
                                c11901zF0M126r.m26352n(af02);
                                this.f130g = c11901zF0M126r.m26351l();
                            }
                            this.f126c |= 4;
                            continue;
                        case 48:
                            this.f126c |= 16;
                            this.f132i = c6392lu.m22583k();
                            continue;
                        case 56:
                            this.f126c |= 32;
                            this.f133j = c6392lu.m22583k();
                            continue;
                        case NativeMac.KEY_LENGTH /* 64 */:
                            this.f126c |= 8;
                            this.f131h = c6392lu.m22583k();
                            continue;
                        case 72:
                            this.f126c |= 64;
                            this.f134k = c6392lu.m22583k();
                            continue;
                        case 82:
                            if ((this.f126c & 256) == 256) {
                                AF0 af03 = this.f136m;
                                af03.getClass();
                                c11901zF0M126r = m126r(af03);
                            }
                            AF0 af04 = (AF0) c6392lu.m22579g(c11695xd0, c0217dr);
                            this.f136m = af04;
                            if (c11901zF0M126r != null) {
                                c11901zF0M126r.m26352n(af04);
                                this.f136m = c11901zF0M126r.m26351l();
                            }
                            this.f126c |= 256;
                            continue;
                        case 88:
                            this.f126c |= 512;
                            this.f137n = c6392lu.m22583k();
                            continue;
                        case 96:
                            this.f126c |= 128;
                            this.f135l = c6392lu.m22583k();
                            continue;
                        case 106:
                            if ((this.f126c & 1024) == 1024) {
                                AF0 af05 = this.f138o;
                                af05.getClass();
                                c11901zF0M126r = m126r(af05);
                            }
                            AF0 af06 = (AF0) c6392lu.m22579g(c11695xd0, c0217dr);
                            this.f138o = af06;
                            if (c11901zF0M126r != null) {
                                c11901zF0M126r.m26352n(af06);
                                this.f138o = c11901zF0M126r.m26351l();
                            }
                            this.f126c |= 1024;
                            continue;
                        case 112:
                            this.f126c |= 2048;
                            this.f139p = c6392lu.m22583k();
                            continue;
                        default:
                            if (!m25540n(c6392lu, c0577j9M4212n, c0217dr, iM22586n)) {
                                break;
                            }
                    }
                    z = true;
                } catch (Y90 e) {
                    e.f14178a = this;
                    throw e;
                } catch (IOException e2) {
                    Y90 y90 = new Y90(e2.getMessage());
                    y90.f14178a = this;
                    throw y90;
                }
            } catch (Throwable th) {
                if (z2) {
                    this.f127d = Collections.unmodifiableList(this.f127d);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f125b = c0425Gk.m3146n();
                    throw th2;
                }
                this.f125b = c0425Gk.m3146n();
                m25539m();
                throw th;
            }
        }
        if (z2) {
            this.f127d = Collections.unmodifiableList(this.f127d);
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f125b = c0425Gk.m3146n();
            throw th3;
        }
        this.f125b = c0425Gk.m3146n();
        m25539m();
    }
}
