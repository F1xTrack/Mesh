package p000;

import java.io.IOException;

/* renamed from: tF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11137tF0 extends A00 {

    /* renamed from: h */
    public static final C11137tF0 f42963h;

    /* renamed from: i */
    public static final C11695xd0 f42964i = new C11695xd0(19);

    /* renamed from: a */
    public final AbstractC0488Hk f42965a;

    /* renamed from: b */
    public int f42966b;

    /* renamed from: c */
    public int f42967c;

    /* renamed from: d */
    public int f42968d;

    /* renamed from: e */
    public EnumC11009sF0 f42969e;

    /* renamed from: f */
    public byte f42970f;

    /* renamed from: g */
    public int f42971g;

    static {
        C11137tF0 c11137tF0 = new C11137tF0();
        f42963h = c11137tF0;
        c11137tF0.f42967c = -1;
        c11137tF0.f42968d = 0;
        c11137tF0.f42969e = EnumC11009sF0.PACKAGE;
    }

    public C11137tF0() {
        this.f42970f = (byte) -1;
        this.f42971g = -1;
        this.f42965a = AbstractC0488Hk.f4481a;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f42971g;
        if (i != -1) {
            return i;
        }
        int iM4205e = (this.f42966b & 1) == 1 ? C0577J9.m4205e(1, this.f42967c) : 0;
        if ((this.f42966b & 2) == 2) {
            iM4205e += C0577J9.m4205e(2, this.f42968d);
        }
        if ((this.f42966b & 4) == 4) {
            iM4205e += C0577J9.m4204c(3, this.f42969e.f42340a);
        }
        int size = this.f42965a.size() + iM4205e;
        this.f42971g = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return C10881rF0.m24243l();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        C10881rF0 c10881rF0M24243l = C10881rF0.m24243l();
        c10881rF0M24243l.m24245m(this);
        return c10881rF0M24243l;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f42970f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f42966b & 2) == 2) {
            this.f42970f = (byte) 1;
            return true;
        }
        this.f42970f = (byte) 0;
        return false;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        if ((this.f42966b & 1) == 1) {
            c0577j9.m4233w(1, this.f42967c);
        }
        if ((this.f42966b & 2) == 2) {
            c0577j9.m4233w(2, this.f42968d);
        }
        if ((this.f42966b & 4) == 4) {
            c0577j9.m4232v(3, this.f42969e.f42340a);
        }
        c0577j9.m4214B(this.f42965a);
    }

    public C11137tF0(C6392lu c6392lu) {
        EnumC11009sF0 enumC11009sF0;
        this.f42970f = (byte) -1;
        this.f42971g = -1;
        this.f42967c = -1;
        boolean z = false;
        this.f42968d = 0;
        EnumC11009sF0 enumC11009sF02 = EnumC11009sF0.PACKAGE;
        this.f42969e = enumC11009sF02;
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        if (iM22586n == 8) {
                            this.f42966b |= 1;
                            this.f42967c = c6392lu.m22583k();
                        } else if (iM22586n == 16) {
                            this.f42966b |= 2;
                            this.f42968d = c6392lu.m22583k();
                        } else if (iM22586n != 24) {
                            if (!c6392lu.m22589q(iM22586n, c0577j9M4212n)) {
                            }
                        } else {
                            int iM22583k = c6392lu.m22583k();
                            if (iM22583k == 0) {
                                enumC11009sF0 = EnumC11009sF0.CLASS;
                            } else if (iM22583k != 1) {
                                enumC11009sF0 = iM22583k != 2 ? null : EnumC11009sF0.LOCAL;
                            } else {
                                enumC11009sF0 = enumC11009sF02;
                            }
                            if (enumC11009sF0 == null) {
                                c0577j9M4212n.m4218F(iM22586n);
                                c0577j9M4212n.m4218F(iM22583k);
                            } else {
                                this.f42966b |= 4;
                                this.f42969e = enumC11009sF0;
                            }
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
                    this.f42965a = c0425Gk.m3146n();
                    throw th2;
                }
                this.f42965a = c0425Gk.m3146n();
                throw th;
            }
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f42965a = c0425Gk.m3146n();
            throw th3;
        }
        this.f42965a = c0425Gk.m3146n();
    }

    public C11137tF0(C10881rF0 c10881rF0) {
        this.f42970f = (byte) -1;
        this.f42971g = -1;
        this.f42965a = c10881rF0.f41281a;
    }
}
