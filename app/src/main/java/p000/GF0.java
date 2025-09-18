package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class GF0 extends A00 {

    /* renamed from: g */
    public static final GF0 f3648g;

    /* renamed from: h */
    public static final C11695xd0 f3649h = new C11695xd0(25);

    /* renamed from: a */
    public final AbstractC0488Hk f3650a;

    /* renamed from: b */
    public int f3651b;

    /* renamed from: c */
    public List f3652c;

    /* renamed from: d */
    public int f3653d;

    /* renamed from: e */
    public byte f3654e;

    /* renamed from: f */
    public int f3655f;

    static {
        GF0 gf0 = new GF0();
        f3648g = gf0;
        gf0.f3652c = Collections.emptyList();
        gf0.f3653d = -1;
    }

    public GF0() {
        this.f3654e = (byte) -1;
        this.f3655f = -1;
        this.f3650a = AbstractC0488Hk.f4481a;
    }

    /* renamed from: i */
    public static PE0 m3016i(GF0 gf0) {
        PE0 pe0M6272n = PE0.m6272n();
        pe0M6272n.m6278q(gf0);
        return pe0M6272n;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f3655f;
        if (i != -1) {
            return i;
        }
        int iM4205e = 0;
        for (int i2 = 0; i2 < this.f3652c.size(); i2++) {
            iM4205e += C0577J9.m4207g(1, (AbstractC0631K0) this.f3652c.get(i2));
        }
        if ((this.f3651b & 1) == 1) {
            iM4205e += C0577J9.m4205e(2, this.f3653d);
        }
        int size = this.f3650a.size() + iM4205e;
        this.f3655f = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return PE0.m6272n();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        return m3016i(this);
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f3654e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f3652c.size(); i++) {
            if (!((AF0) this.f3652c.get(i)).mo131e()) {
                this.f3654e = (byte) 0;
                return false;
            }
        }
        this.f3654e = (byte) 1;
        return true;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        for (int i = 0; i < this.f3652c.size(); i++) {
            c0577j9.m4235y(1, (AbstractC0631K0) this.f3652c.get(i));
        }
        if ((this.f3651b & 1) == 1) {
            c0577j9.m4233w(2, this.f3653d);
        }
        c0577j9.m4214B(this.f3650a);
    }

    /* renamed from: j */
    public final PE0 m3017j() {
        return m3016i(this);
    }

    public GF0(C6392lu c6392lu, C0217DR c0217dr) {
        this.f3654e = (byte) -1;
        this.f3655f = -1;
        this.f3652c = Collections.emptyList();
        this.f3653d = -1;
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int iM22586n = c6392lu.m22586n();
                        if (iM22586n != 0) {
                            if (iM22586n == 10) {
                                if (!z2) {
                                    this.f3652c = new ArrayList();
                                    z2 = true;
                                }
                                this.f3652c.add(c6392lu.m22579g(AF0.f124u, c0217dr));
                            } else if (iM22586n != 16) {
                                if (!c6392lu.m22589q(iM22586n, c0577j9M4212n)) {
                                }
                            } else {
                                this.f3651b |= 1;
                                this.f3653d = c6392lu.m22583k();
                            }
                        }
                        z = true;
                    } catch (Y90 e) {
                        e.f14178a = this;
                        throw e;
                    }
                } catch (IOException e2) {
                    Y90 y90 = new Y90(e2.getMessage());
                    y90.f14178a = this;
                    throw y90;
                }
            } catch (Throwable th) {
                if (z2) {
                    this.f3652c = Collections.unmodifiableList(this.f3652c);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f3650a = c0425Gk.m3146n();
                    throw th2;
                }
                this.f3650a = c0425Gk.m3146n();
                throw th;
            }
        }
        if (z2) {
            this.f3652c = Collections.unmodifiableList(this.f3652c);
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f3650a = c0425Gk.m3146n();
            throw th3;
        }
        this.f3650a = c0425Gk.m3146n();
    }

    public GF0(PE0 pe0) {
        this.f3654e = (byte) -1;
        this.f3655f = -1;
        this.f3650a = pe0.f41281a;
    }
}
