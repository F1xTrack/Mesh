package p000;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class OE0 extends A00 {

    /* renamed from: g */
    public static final OE0 f8317g;

    /* renamed from: h */
    public static final C11695xd0 f8318h = new C11695xd0(6);

    /* renamed from: a */
    public final AbstractC0488Hk f8319a;

    /* renamed from: b */
    public int f8320b;

    /* renamed from: c */
    public int f8321c;

    /* renamed from: d */
    public NE0 f8322d;

    /* renamed from: e */
    public byte f8323e;

    /* renamed from: f */
    public int f8324f;

    static {
        OE0 oe0 = new OE0();
        f8317g = oe0;
        oe0.f8321c = 0;
        oe0.f8322d = NE0.f7652p;
    }

    public OE0() {
        this.f8323e = (byte) -1;
        this.f8324f = -1;
        this.f8319a = AbstractC0488Hk.f4481a;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f8324f;
        if (i != -1) {
            return i;
        }
        int iM4205e = (this.f8320b & 1) == 1 ? C0577J9.m4205e(1, this.f8321c) : 0;
        if ((this.f8320b & 2) == 2) {
            iM4205e += C0577J9.m4207g(2, this.f8322d);
        }
        int size = this.f8319a.size() + iM4205e;
        this.f8324f = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        PE0 pe0 = new PE0(2);
        pe0.f8932d = NE0.f7652p;
        return pe0;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        PE0 pe0 = new PE0(2);
        pe0.f8932d = NE0.f7652p;
        pe0.m6276o(this);
        return pe0;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f8323e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f8320b;
        if ((i & 1) != 1) {
            this.f8323e = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.f8323e = (byte) 0;
            return false;
        }
        if (this.f8322d.mo131e()) {
            this.f8323e = (byte) 1;
            return true;
        }
        this.f8323e = (byte) 0;
        return false;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        if ((this.f8320b & 1) == 1) {
            c0577j9.m4233w(1, this.f8321c);
        }
        if ((this.f8320b & 2) == 2) {
            c0577j9.m4235y(2, this.f8322d);
        }
        c0577j9.m4214B(this.f8319a);
    }

    public OE0(C6392lu c6392lu, C0217DR c0217dr) {
        LE0 le0M4929l;
        this.f8323e = (byte) -1;
        this.f8324f = -1;
        boolean z = false;
        this.f8321c = 0;
        this.f8322d = NE0.f7652p;
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        if (iM22586n == 8) {
                            this.f8320b |= 1;
                            this.f8321c = c6392lu.m22583k();
                        } else if (iM22586n != 18) {
                            if (!c6392lu.m22589q(iM22586n, c0577j9M4212n)) {
                            }
                        } else {
                            if ((this.f8320b & 2) == 2) {
                                NE0 ne0 = this.f8322d;
                                ne0.getClass();
                                le0M4929l = LE0.m4929l();
                                le0M4929l.m4931m(ne0);
                            } else {
                                le0M4929l = null;
                            }
                            NE0 ne02 = (NE0) c6392lu.m22579g(NE0.f7653q, c0217dr);
                            this.f8322d = ne02;
                            if (le0M4929l != null) {
                                le0M4929l.m4931m(ne02);
                                this.f8322d = le0M4929l.m4930k();
                            }
                            this.f8320b |= 2;
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
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8319a = c0425Gk.m3146n();
                    throw th2;
                }
                this.f8319a = c0425Gk.m3146n();
                throw th;
            }
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8319a = c0425Gk.m3146n();
            throw th3;
        }
        this.f8319a = c0425Gk.m3146n();
    }

    public OE0(PE0 pe0) {
        this.f8323e = (byte) -1;
        this.f8324f = -1;
        this.f8319a = pe0.f41281a;
    }
}
