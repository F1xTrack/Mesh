package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8828bF0 extends A00 {

    /* renamed from: i */
    public static final C8828bF0 f16897i;

    /* renamed from: j */
    public static final C11695xd0 f16898j = new C11695xd0(11);

    /* renamed from: a */
    public final AbstractC0488Hk f16899a;

    /* renamed from: b */
    public int f16900b;

    /* renamed from: c */
    public ZE0 f16901c;

    /* renamed from: d */
    public List f16902d;

    /* renamed from: e */
    public C9473gF0 f16903e;

    /* renamed from: f */
    public EnumC8700aF0 f16904f;

    /* renamed from: g */
    public byte f16905g;

    /* renamed from: h */
    public int f16906h;

    static {
        C8828bF0 c8828bF0 = new C8828bF0();
        f16897i = c8828bF0;
        c8828bF0.f16901c = ZE0.RETURNS_CONSTANT;
        c8828bF0.f16902d = Collections.emptyList();
        c8828bF0.f16903e = C9473gF0.f27634l;
        c8828bF0.f16904f = EnumC8700aF0.AT_MOST_ONCE;
    }

    public C8828bF0() {
        this.f16905g = (byte) -1;
        this.f16906h = -1;
        this.f16899a = AbstractC0488Hk.f4481a;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f16906h;
        if (i != -1) {
            return i;
        }
        int iM4204c = (this.f16900b & 1) == 1 ? C0577J9.m4204c(1, this.f16901c.f14815a) : 0;
        for (int i2 = 0; i2 < this.f16902d.size(); i2++) {
            iM4204c += C0577J9.m4207g(2, (AbstractC0631K0) this.f16902d.get(i2));
        }
        if ((this.f16900b & 2) == 2) {
            iM4204c += C0577J9.m4207g(3, this.f16903e);
        }
        if ((this.f16900b & 4) == 4) {
            iM4204c += C0577J9.m4204c(4, this.f16904f.f15407a);
        }
        int size = this.f16899a.size() + iM4204c;
        this.f16906h = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return YE0.m9242l();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        YE0 ye0M9242l = YE0.m9242l();
        ye0M9242l.m9244m(this);
        return ye0M9242l;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f16905g;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f16902d.size(); i++) {
            if (!((C9473gF0) this.f16902d.get(i)).mo131e()) {
                this.f16905g = (byte) 0;
                return false;
            }
        }
        if ((this.f16900b & 2) != 2 || this.f16903e.mo131e()) {
            this.f16905g = (byte) 1;
            return true;
        }
        this.f16905g = (byte) 0;
        return false;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        if ((this.f16900b & 1) == 1) {
            c0577j9.m4232v(1, this.f16901c.f14815a);
        }
        for (int i = 0; i < this.f16902d.size(); i++) {
            c0577j9.m4235y(2, (AbstractC0631K0) this.f16902d.get(i));
        }
        if ((this.f16900b & 2) == 2) {
            c0577j9.m4235y(3, this.f16903e);
        }
        if ((this.f16900b & 4) == 4) {
            c0577j9.m4232v(4, this.f16904f.f15407a);
        }
        c0577j9.m4214B(this.f16899a);
    }

    public C8828bF0(C6392lu c6392lu, C0217DR c0217dr) {
        this.f16905g = (byte) -1;
        this.f16906h = -1;
        ZE0 ze0 = ZE0.RETURNS_CONSTANT;
        this.f16901c = ze0;
        this.f16902d = Collections.emptyList();
        this.f16903e = C9473gF0.f27634l;
        EnumC8700aF0 enumC8700aF0 = EnumC8700aF0.AT_MOST_ONCE;
        this.f16904f = enumC8700aF0;
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        EnumC8700aF0 enumC8700aF02 = null;
                        ZE0 ze02 = null;
                        C9217eF0 c9217eF0M17884l = null;
                        if (iM22586n == 8) {
                            int iM22583k = c6392lu.m22583k();
                            if (iM22583k == 0) {
                                ze02 = ze0;
                            } else if (iM22583k == 1) {
                                ze02 = ZE0.CALLS;
                            } else if (iM22583k == 2) {
                                ze02 = ZE0.RETURNS_NOT_NULL;
                            }
                            if (ze02 == null) {
                                c0577j9M4212n.m4218F(iM22586n);
                                c0577j9M4212n.m4218F(iM22583k);
                            } else {
                                this.f16900b |= 1;
                                this.f16901c = ze02;
                            }
                        } else if (iM22586n == 18) {
                            int i = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i != 2) {
                                this.f16902d = new ArrayList();
                                c = 2;
                            }
                            this.f16902d.add(c6392lu.m22579g(C9473gF0.f27635m, c0217dr));
                        } else if (iM22586n == 26) {
                            if ((this.f16900b & 2) == 2) {
                                C9473gF0 c9473gF0 = this.f16903e;
                                c9473gF0.getClass();
                                c9217eF0M17884l = C9217eF0.m17884l();
                                c9217eF0M17884l.m17886m(c9473gF0);
                            }
                            C9473gF0 c9473gF02 = (C9473gF0) c6392lu.m22579g(C9473gF0.f27635m, c0217dr);
                            this.f16903e = c9473gF02;
                            if (c9217eF0M17884l != null) {
                                c9217eF0M17884l.m17886m(c9473gF02);
                                this.f16903e = c9217eF0M17884l.m17885k();
                            }
                            this.f16900b |= 2;
                        } else if (iM22586n != 32) {
                            if (!c6392lu.m22589q(iM22586n, c0577j9M4212n)) {
                            }
                        } else {
                            int iM22583k2 = c6392lu.m22583k();
                            if (iM22583k2 == 0) {
                                enumC8700aF02 = enumC8700aF0;
                            } else if (iM22583k2 == 1) {
                                enumC8700aF02 = EnumC8700aF0.EXACTLY_ONCE;
                            } else if (iM22583k2 == 2) {
                                enumC8700aF02 = EnumC8700aF0.AT_LEAST_ONCE;
                            }
                            if (enumC8700aF02 == null) {
                                c0577j9M4212n.m4218F(iM22586n);
                                c0577j9M4212n.m4218F(iM22583k2);
                            } else {
                                this.f16900b |= 4;
                                this.f16904f = enumC8700aF02;
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
                if (((c == true ? 1 : 0) & 2) == 2) {
                    this.f16902d = Collections.unmodifiableList(this.f16902d);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f16899a = c0425Gk.m3146n();
                    throw th2;
                }
                this.f16899a = c0425Gk.m3146n();
                throw th;
            }
        }
        if (((c == true ? 1 : 0) & 2) == 2) {
            this.f16902d = Collections.unmodifiableList(this.f16902d);
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f16899a = c0425Gk.m3146n();
            throw th3;
        }
        this.f16899a = c0425Gk.m3146n();
    }

    public C8828bF0(YE0 ye0) {
        this.f16905g = (byte) -1;
        this.f16906h = -1;
        this.f16899a = ye0.f41281a;
    }
}
