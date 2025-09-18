package p000;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class MF0 extends A00 {

    /* renamed from: k */
    public static final MF0 f7061k;

    /* renamed from: l */
    public static final C11695xd0 f7062l = new C11695xd0(27);

    /* renamed from: a */
    public final AbstractC0488Hk f7063a;

    /* renamed from: b */
    public int f7064b;

    /* renamed from: c */
    public int f7065c;

    /* renamed from: d */
    public int f7066d;

    /* renamed from: e */
    public KF0 f7067e;

    /* renamed from: f */
    public int f7068f;

    /* renamed from: g */
    public int f7069g;

    /* renamed from: h */
    public LF0 f7070h;

    /* renamed from: i */
    public byte f7071i;

    /* renamed from: j */
    public int f7072j;

    static {
        MF0 mf0 = new MF0();
        f7061k = mf0;
        mf0.f7065c = 0;
        mf0.f7066d = 0;
        mf0.f7067e = KF0.ERROR;
        mf0.f7068f = 0;
        mf0.f7069g = 0;
        mf0.f7070h = LF0.LANGUAGE_VERSION;
    }

    public MF0() {
        this.f7071i = (byte) -1;
        this.f7072j = -1;
        this.f7063a = AbstractC0488Hk.f4481a;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f7072j;
        if (i != -1) {
            return i;
        }
        int iM4205e = (this.f7064b & 1) == 1 ? C0577J9.m4205e(1, this.f7065c) : 0;
        if ((this.f7064b & 2) == 2) {
            iM4205e += C0577J9.m4205e(2, this.f7066d);
        }
        if ((this.f7064b & 4) == 4) {
            iM4205e += C0577J9.m4204c(3, this.f7067e.f5974a);
        }
        if ((this.f7064b & 8) == 8) {
            iM4205e += C0577J9.m4205e(4, this.f7068f);
        }
        if ((this.f7064b & 16) == 16) {
            iM4205e += C0577J9.m4205e(5, this.f7069g);
        }
        if ((this.f7064b & 32) == 32) {
            iM4205e += C0577J9.m4204c(6, this.f7070h.f6579a);
        }
        int size = this.f7063a.size() + iM4205e;
        this.f7072j = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return JF0.m4263l();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        JF0 jf0M4263l = JF0.m4263l();
        jf0M4263l.m4265m(this);
        return jf0M4263l;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f7071i;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f7071i = (byte) 1;
        return true;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        if ((this.f7064b & 1) == 1) {
            c0577j9.m4233w(1, this.f7065c);
        }
        if ((this.f7064b & 2) == 2) {
            c0577j9.m4233w(2, this.f7066d);
        }
        if ((this.f7064b & 4) == 4) {
            c0577j9.m4232v(3, this.f7067e.f5974a);
        }
        if ((this.f7064b & 8) == 8) {
            c0577j9.m4233w(4, this.f7068f);
        }
        if ((this.f7064b & 16) == 16) {
            c0577j9.m4233w(5, this.f7069g);
        }
        if ((this.f7064b & 32) == 32) {
            c0577j9.m4232v(6, this.f7070h.f6579a);
        }
        c0577j9.m4214B(this.f7063a);
    }

    public MF0(C6392lu c6392lu) {
        this.f7071i = (byte) -1;
        this.f7072j = -1;
        boolean z = false;
        this.f7065c = 0;
        this.f7066d = 0;
        KF0 kf0 = KF0.ERROR;
        this.f7067e = kf0;
        this.f7068f = 0;
        this.f7069g = 0;
        LF0 lf0 = LF0.LANGUAGE_VERSION;
        this.f7070h = lf0;
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        if (iM22586n == 8) {
                            this.f7064b |= 1;
                            this.f7065c = c6392lu.m22583k();
                        } else if (iM22586n != 16) {
                            LF0 lf02 = null;
                            KF0 kf02 = null;
                            if (iM22586n == 24) {
                                int iM22583k = c6392lu.m22583k();
                                if (iM22583k == 0) {
                                    kf02 = KF0.WARNING;
                                } else if (iM22583k == 1) {
                                    kf02 = kf0;
                                } else if (iM22583k == 2) {
                                    kf02 = KF0.HIDDEN;
                                }
                                if (kf02 == null) {
                                    c0577j9M4212n.m4218F(iM22586n);
                                    c0577j9M4212n.m4218F(iM22583k);
                                } else {
                                    this.f7064b |= 4;
                                    this.f7067e = kf02;
                                }
                            } else if (iM22586n == 32) {
                                this.f7064b |= 8;
                                this.f7068f = c6392lu.m22583k();
                            } else if (iM22586n == 40) {
                                this.f7064b |= 16;
                                this.f7069g = c6392lu.m22583k();
                            } else if (iM22586n != 48) {
                                if (!c6392lu.m22589q(iM22586n, c0577j9M4212n)) {
                                }
                            } else {
                                int iM22583k2 = c6392lu.m22583k();
                                if (iM22583k2 == 0) {
                                    lf02 = lf0;
                                } else if (iM22583k2 == 1) {
                                    lf02 = LF0.COMPILER_VERSION;
                                } else if (iM22583k2 == 2) {
                                    lf02 = LF0.API_VERSION;
                                }
                                if (lf02 == null) {
                                    c0577j9M4212n.m4218F(iM22586n);
                                    c0577j9M4212n.m4218F(iM22583k2);
                                } else {
                                    this.f7064b |= 32;
                                    this.f7070h = lf02;
                                }
                            }
                        } else {
                            this.f7064b |= 2;
                            this.f7066d = c6392lu.m22583k();
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
                    this.f7063a = c0425Gk.m3146n();
                    throw th2;
                }
                this.f7063a = c0425Gk.m3146n();
                throw th;
            }
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f7063a = c0425Gk.m3146n();
            throw th3;
        }
        this.f7063a = c0425Gk.m3146n();
    }

    public MF0(JF0 jf0) {
        this.f7071i = (byte) -1;
        this.f7072j = -1;
        this.f7063a = jf0.f41281a;
    }
}
