package p000;

import java.io.IOException;

/* renamed from: Ad0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7320Ad0 extends A00 {

    /* renamed from: g */
    public static final C7320Ad0 f289g;

    /* renamed from: h */
    public static final C11695xd0 f290h = new C11695xd0(1);

    /* renamed from: a */
    public final AbstractC0488Hk f291a;

    /* renamed from: b */
    public int f292b;

    /* renamed from: c */
    public int f293c;

    /* renamed from: d */
    public int f294d;

    /* renamed from: e */
    public byte f295e;

    /* renamed from: f */
    public int f296f;

    static {
        C7320Ad0 c7320Ad0 = new C7320Ad0();
        f289g = c7320Ad0;
        c7320Ad0.f293c = 0;
        c7320Ad0.f294d = 0;
    }

    public C7320Ad0() {
        this.f295e = (byte) -1;
        this.f296f = -1;
        this.f291a = AbstractC0488Hk.f4481a;
    }

    /* renamed from: i */
    public static C11822yd0 m245i(C7320Ad0 c7320Ad0) {
        C11822yd0 c11822yd0 = new C11822yd0(1);
        c11822yd0.m26208n(c7320Ad0);
        return c11822yd0;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f296f;
        if (i != -1) {
            return i;
        }
        int iM4205e = (this.f292b & 1) == 1 ? C0577J9.m4205e(1, this.f293c) : 0;
        if ((this.f292b & 2) == 2) {
            iM4205e += C0577J9.m4205e(2, this.f294d);
        }
        int size = this.f291a.size() + iM4205e;
        this.f296f = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return new C11822yd0(1);
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        return m245i(this);
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f295e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f295e = (byte) 1;
        return true;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        if ((this.f292b & 1) == 1) {
            c0577j9.m4233w(1, this.f293c);
        }
        if ((this.f292b & 2) == 2) {
            c0577j9.m4233w(2, this.f294d);
        }
        c0577j9.m4214B(this.f291a);
    }

    public C7320Ad0(C6392lu c6392lu) {
        this.f295e = (byte) -1;
        this.f296f = -1;
        boolean z = false;
        this.f293c = 0;
        this.f294d = 0;
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        if (iM22586n == 8) {
                            this.f292b |= 1;
                            this.f293c = c6392lu.m22583k();
                        } else if (iM22586n != 16) {
                            if (!c6392lu.m22589q(iM22586n, c0577j9M4212n)) {
                            }
                        } else {
                            this.f292b |= 2;
                            this.f294d = c6392lu.m22583k();
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
                    this.f291a = c0425Gk.m3146n();
                    throw th2;
                }
                this.f291a = c0425Gk.m3146n();
                throw th;
            }
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f291a = c0425Gk.m3146n();
            throw th3;
        }
        this.f291a = c0425Gk.m3146n();
    }

    public C7320Ad0(C11822yd0 c11822yd0) {
        this.f295e = (byte) -1;
        this.f296f = -1;
        this.f291a = c11822yd0.f41281a;
    }
}
