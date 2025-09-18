package p000;

import java.io.IOException;

/* renamed from: yF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11774yF0 extends A00 {

    /* renamed from: h */
    public static final C11774yF0 f46149h;

    /* renamed from: i */
    public static final C11695xd0 f46150i = new C11695xd0(22);

    /* renamed from: a */
    public final AbstractC0488Hk f46151a;

    /* renamed from: b */
    public int f46152b;

    /* renamed from: c */
    public EnumC11647xF0 f46153c;

    /* renamed from: d */
    public AF0 f46154d;

    /* renamed from: e */
    public int f46155e;

    /* renamed from: f */
    public byte f46156f;

    /* renamed from: g */
    public int f46157g;

    static {
        C11774yF0 c11774yF0 = new C11774yF0();
        f46149h = c11774yF0;
        c11774yF0.f46153c = EnumC11647xF0.INV;
        c11774yF0.f46154d = AF0.f123t;
        c11774yF0.f46155e = 0;
    }

    public C11774yF0() {
        this.f46156f = (byte) -1;
        this.f46157g = -1;
        this.f46151a = AbstractC0488Hk.f4481a;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f46157g;
        if (i != -1) {
            return i;
        }
        int iM4204c = (this.f46152b & 1) == 1 ? C0577J9.m4204c(1, this.f46153c.f45499a) : 0;
        if ((this.f46152b & 2) == 2) {
            iM4204c += C0577J9.m4207g(2, this.f46154d);
        }
        if ((this.f46152b & 4) == 4) {
            iM4204c += C0577J9.m4205e(3, this.f46155e);
        }
        int size = this.f46151a.size() + iM4204c;
        this.f46157g = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return C11520wF0.m25578l();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        C11520wF0 c11520wF0M25578l = C11520wF0.m25578l();
        c11520wF0M25578l.m25580m(this);
        return c11520wF0M25578l;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f46156f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f46152b & 2) != 2 || this.f46154d.mo131e()) {
            this.f46156f = (byte) 1;
            return true;
        }
        this.f46156f = (byte) 0;
        return false;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        if ((this.f46152b & 1) == 1) {
            c0577j9.m4232v(1, this.f46153c.f45499a);
        }
        if ((this.f46152b & 2) == 2) {
            c0577j9.m4235y(2, this.f46154d);
        }
        if ((this.f46152b & 4) == 4) {
            c0577j9.m4233w(3, this.f46155e);
        }
        c0577j9.m4214B(this.f46151a);
    }

    public C11774yF0(C6392lu c6392lu, C0217DR c0217dr) {
        this.f46156f = (byte) -1;
        this.f46157g = -1;
        EnumC11647xF0 enumC11647xF0 = EnumC11647xF0.INV;
        this.f46153c = enumC11647xF0;
        this.f46154d = AF0.f123t;
        boolean z = false;
        this.f46155e = 0;
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        C11901zF0 c11901zF0M126r = null;
                        EnumC11647xF0 enumC11647xF02 = null;
                        if (iM22586n == 8) {
                            int iM22583k = c6392lu.m22583k();
                            if (iM22583k == 0) {
                                enumC11647xF02 = EnumC11647xF0.IN;
                            } else if (iM22583k == 1) {
                                enumC11647xF02 = EnumC11647xF0.OUT;
                            } else if (iM22583k == 2) {
                                enumC11647xF02 = enumC11647xF0;
                            } else if (iM22583k == 3) {
                                enumC11647xF02 = EnumC11647xF0.STAR;
                            }
                            if (enumC11647xF02 == null) {
                                c0577j9M4212n.m4218F(iM22586n);
                                c0577j9M4212n.m4218F(iM22583k);
                            } else {
                                this.f46152b |= 1;
                                this.f46153c = enumC11647xF02;
                            }
                        } else if (iM22586n == 18) {
                            if ((this.f46152b & 2) == 2) {
                                AF0 af0 = this.f46154d;
                                af0.getClass();
                                c11901zF0M126r = AF0.m126r(af0);
                            }
                            AF0 af02 = (AF0) c6392lu.m22579g(AF0.f124u, c0217dr);
                            this.f46154d = af02;
                            if (c11901zF0M126r != null) {
                                c11901zF0M126r.m26352n(af02);
                                this.f46154d = c11901zF0M126r.m26351l();
                            }
                            this.f46152b |= 2;
                        } else if (iM22586n != 24) {
                            if (!c6392lu.m22589q(iM22586n, c0577j9M4212n)) {
                            }
                        } else {
                            this.f46152b |= 4;
                            this.f46155e = c6392lu.m22583k();
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
                    this.f46151a = c0425Gk.m3146n();
                    throw th2;
                }
                this.f46151a = c0425Gk.m3146n();
                throw th;
            }
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f46151a = c0425Gk.m3146n();
            throw th3;
        }
        this.f46151a = c0425Gk.m3146n();
    }

    public C11774yF0(C11520wF0 c11520wF0) {
        this.f46156f = (byte) -1;
        this.f46157g = -1;
        this.f46151a = c11520wF0.f41281a;
    }
}
