package p000;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Gd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7632Gd0 extends A00 {

    /* renamed from: m */
    public static final C7632Gd0 f3824m;

    /* renamed from: n */
    public static final C11695xd0 f3825n = new C11695xd0(4);

    /* renamed from: a */
    public final AbstractC0488Hk f3826a;

    /* renamed from: b */
    public int f3827b;

    /* renamed from: c */
    public int f3828c;

    /* renamed from: d */
    public int f3829d;

    /* renamed from: e */
    public Object f3830e;

    /* renamed from: f */
    public EnumC7580Fd0 f3831f;

    /* renamed from: g */
    public List f3832g;

    /* renamed from: h */
    public int f3833h;

    /* renamed from: i */
    public List f3834i;

    /* renamed from: j */
    public int f3835j;

    /* renamed from: k */
    public byte f3836k;

    /* renamed from: l */
    public int f3837l;

    static {
        C7632Gd0 c7632Gd0 = new C7632Gd0();
        f3824m = c7632Gd0;
        c7632Gd0.f3828c = 1;
        c7632Gd0.f3829d = 0;
        c7632Gd0.f3830e = "";
        c7632Gd0.f3831f = EnumC7580Fd0.NONE;
        c7632Gd0.f3832g = Collections.emptyList();
        c7632Gd0.f3834i = Collections.emptyList();
    }

    public C7632Gd0() {
        this.f3833h = -1;
        this.f3835j = -1;
        this.f3836k = (byte) -1;
        this.f3837l = -1;
        this.f3826a = AbstractC0488Hk.f4481a;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        AbstractC0488Hk c8580Yj0;
        int i = this.f3837l;
        if (i != -1) {
            return i;
        }
        int iM4205e = (this.f3827b & 1) == 1 ? C0577J9.m4205e(1, this.f3828c) : 0;
        if ((this.f3827b & 2) == 2) {
            iM4205e += C0577J9.m4205e(2, this.f3829d);
        }
        if ((this.f3827b & 8) == 8) {
            iM4205e += C0577J9.m4204c(3, this.f3831f.f3364a);
        }
        int iM4206f = 0;
        for (int i2 = 0; i2 < this.f3832g.size(); i2++) {
            iM4206f += C0577J9.m4206f(((Integer) this.f3832g.get(i2)).intValue());
        }
        int iM4206f2 = iM4205e + iM4206f;
        if (!this.f3832g.isEmpty()) {
            iM4206f2 = iM4206f2 + 1 + C0577J9.m4206f(iM4206f);
        }
        this.f3833h = iM4206f;
        int iM4206f3 = 0;
        for (int i3 = 0; i3 < this.f3834i.size(); i3++) {
            iM4206f3 += C0577J9.m4206f(((Integer) this.f3834i.get(i3)).intValue());
        }
        int size = iM4206f2 + iM4206f3;
        if (!this.f3834i.isEmpty()) {
            size = size + 1 + C0577J9.m4206f(iM4206f3);
        }
        this.f3835j = iM4206f3;
        if ((this.f3827b & 4) == 4) {
            Object obj = this.f3830e;
            if (obj instanceof String) {
                try {
                    c8580Yj0 = new C8580Yj0(((String) obj).getBytes("UTF-8"));
                    this.f3830e = c8580Yj0;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            } else {
                c8580Yj0 = (AbstractC0488Hk) obj;
            }
            size += c8580Yj0.size() + C0577J9.m4209i(c8580Yj0.size()) + C0577J9.m4211k(6);
        }
        int size2 = this.f3826a.size() + size;
        this.f3837l = size2;
        return size2;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return C7528Ed0.m2361l();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        C7528Ed0 c7528Ed0M2361l = C7528Ed0.m2361l();
        c7528Ed0M2361l.m2363m(this);
        return c7528Ed0M2361l;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f3836k;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f3836k = (byte) 1;
        return true;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        AbstractC0488Hk c8580Yj0;
        mo128b();
        if ((this.f3827b & 1) == 1) {
            c0577j9.m4233w(1, this.f3828c);
        }
        if ((this.f3827b & 2) == 2) {
            c0577j9.m4233w(2, this.f3829d);
        }
        if ((this.f3827b & 8) == 8) {
            c0577j9.m4232v(3, this.f3831f.f3364a);
        }
        if (this.f3832g.size() > 0) {
            c0577j9.m4218F(34);
            c0577j9.m4218F(this.f3833h);
        }
        for (int i = 0; i < this.f3832g.size(); i++) {
            c0577j9.m4234x(((Integer) this.f3832g.get(i)).intValue());
        }
        if (this.f3834i.size() > 0) {
            c0577j9.m4218F(42);
            c0577j9.m4218F(this.f3835j);
        }
        for (int i2 = 0; i2 < this.f3834i.size(); i2++) {
            c0577j9.m4234x(((Integer) this.f3834i.get(i2)).intValue());
        }
        if ((this.f3827b & 4) == 4) {
            Object obj = this.f3830e;
            if (obj instanceof String) {
                try {
                    c8580Yj0 = new C8580Yj0(((String) obj).getBytes("UTF-8"));
                    this.f3830e = c8580Yj0;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            } else {
                c8580Yj0 = (AbstractC0488Hk) obj;
            }
            c0577j9.m4220H(6, 2);
            c0577j9.m4218F(c8580Yj0.size());
            c0577j9.m4214B(c8580Yj0);
        }
        c0577j9.m4214B(this.f3826a);
    }

    public C7632Gd0(C6392lu c6392lu) {
        EnumC7580Fd0 enumC7580Fd0;
        this.f3833h = -1;
        this.f3835j = -1;
        this.f3836k = (byte) -1;
        this.f3837l = -1;
        this.f3828c = 1;
        boolean z = false;
        this.f3829d = 0;
        this.f3830e = "";
        EnumC7580Fd0 enumC7580Fd02 = EnumC7580Fd0.NONE;
        this.f3831f = enumC7580Fd02;
        this.f3832g = Collections.emptyList();
        this.f3834i = Collections.emptyList();
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        if (iM22586n == 8) {
                            this.f3827b |= 1;
                            this.f3828c = c6392lu.m22583k();
                        } else if (iM22586n == 16) {
                            this.f3827b |= 2;
                            this.f3829d = c6392lu.m22583k();
                        } else if (iM22586n == 24) {
                            int iM22583k = c6392lu.m22583k();
                            if (iM22583k == 0) {
                                enumC7580Fd0 = enumC7580Fd02;
                            } else if (iM22583k != 1) {
                                enumC7580Fd0 = iM22583k != 2 ? null : EnumC7580Fd0.DESC_TO_CLASS_ID;
                            } else {
                                enumC7580Fd0 = EnumC7580Fd0.INTERNAL_TO_CLASS_ID;
                            }
                            if (enumC7580Fd0 == null) {
                                c0577j9M4212n.m4218F(iM22586n);
                                c0577j9M4212n.m4218F(iM22583k);
                            } else {
                                this.f3827b |= 8;
                                this.f3831f = enumC7580Fd0;
                            }
                        } else if (iM22586n == 32) {
                            if ((i & 16) != 16) {
                                this.f3832g = new ArrayList();
                                i |= 16;
                            }
                            this.f3832g.add(Integer.valueOf(c6392lu.m22583k()));
                        } else if (iM22586n == 34) {
                            int iM22576d = c6392lu.m22576d(c6392lu.m22583k());
                            if ((i & 16) != 16 && c6392lu.m22574b() > 0) {
                                this.f3832g = new ArrayList();
                                i |= 16;
                            }
                            while (c6392lu.m22574b() > 0) {
                                this.f3832g.add(Integer.valueOf(c6392lu.m22583k()));
                            }
                            c6392lu.m22575c(iM22576d);
                        } else if (iM22586n == 40) {
                            if ((i & 32) != 32) {
                                this.f3834i = new ArrayList();
                                i |= 32;
                            }
                            this.f3834i.add(Integer.valueOf(c6392lu.m22583k()));
                        } else if (iM22586n == 42) {
                            int iM22576d2 = c6392lu.m22576d(c6392lu.m22583k());
                            if ((i & 32) != 32 && c6392lu.m22574b() > 0) {
                                this.f3834i = new ArrayList();
                                i |= 32;
                            }
                            while (c6392lu.m22574b() > 0) {
                                this.f3834i.add(Integer.valueOf(c6392lu.m22583k()));
                            }
                            c6392lu.m22575c(iM22576d2);
                        } else if (iM22586n != 50) {
                            if (!c6392lu.m22589q(iM22586n, c0577j9M4212n)) {
                            }
                        } else {
                            C8580Yj0 c8580Yj0M22577e = c6392lu.m22577e();
                            this.f3827b |= 4;
                            this.f3830e = c8580Yj0M22577e;
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
                if ((i & 16) == 16) {
                    this.f3832g = Collections.unmodifiableList(this.f3832g);
                }
                if ((i & 32) == 32) {
                    this.f3834i = Collections.unmodifiableList(this.f3834i);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f3826a = c0425Gk.m3146n();
                    throw th2;
                }
                this.f3826a = c0425Gk.m3146n();
                throw th;
            }
        }
        if ((i & 16) == 16) {
            this.f3832g = Collections.unmodifiableList(this.f3832g);
        }
        if ((i & 32) == 32) {
            this.f3834i = Collections.unmodifiableList(this.f3834i);
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f3826a = c0425Gk.m3146n();
            throw th3;
        }
        this.f3826a = c0425Gk.m3146n();
    }

    public C7632Gd0(C7528Ed0 c7528Ed0) {
        this.f3833h = -1;
        this.f3835j = -1;
        this.f3836k = (byte) -1;
        this.f3837l = -1;
        this.f3826a = c7528Ed0.f41281a;
    }
}
