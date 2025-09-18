package p000;

import java.io.IOException;

/* renamed from: zd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11949zd0 extends A00 {

    /* renamed from: g */
    public static final C11949zd0 f46909g;

    /* renamed from: h */
    public static final C11695xd0 f46910h = new C11695xd0(0);

    /* renamed from: a */
    public final AbstractC0488Hk f46911a;

    /* renamed from: b */
    public int f46912b;

    /* renamed from: c */
    public int f46913c;

    /* renamed from: d */
    public int f46914d;

    /* renamed from: e */
    public byte f46915e;

    /* renamed from: f */
    public int f46916f;

    static {
        C11949zd0 c11949zd0 = new C11949zd0();
        f46909g = c11949zd0;
        c11949zd0.f46913c = 0;
        c11949zd0.f46914d = 0;
    }

    public C11949zd0() {
        this.f46915e = (byte) -1;
        this.f46916f = -1;
        this.f46911a = AbstractC0488Hk.f4481a;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f46916f;
        if (i != -1) {
            return i;
        }
        int iM4205e = (this.f46912b & 1) == 1 ? C0577J9.m4205e(1, this.f46913c) : 0;
        if ((this.f46912b & 2) == 2) {
            iM4205e += C0577J9.m4205e(2, this.f46914d);
        }
        int size = this.f46911a.size() + iM4205e;
        this.f46916f = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return new C11822yd0(0);
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        C11822yd0 c11822yd0 = new C11822yd0(0);
        c11822yd0.m26207m(this);
        return c11822yd0;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f46915e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f46915e = (byte) 1;
        return true;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        if ((this.f46912b & 1) == 1) {
            c0577j9.m4233w(1, this.f46913c);
        }
        if ((this.f46912b & 2) == 2) {
            c0577j9.m4233w(2, this.f46914d);
        }
        c0577j9.m4214B(this.f46911a);
    }

    public C11949zd0(C6392lu c6392lu) {
        this.f46915e = (byte) -1;
        this.f46916f = -1;
        boolean z = false;
        this.f46913c = 0;
        this.f46914d = 0;
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        if (iM22586n == 8) {
                            this.f46912b |= 1;
                            this.f46913c = c6392lu.m22583k();
                        } else if (iM22586n != 16) {
                            if (!c6392lu.m22589q(iM22586n, c0577j9M4212n)) {
                            }
                        } else {
                            this.f46912b |= 2;
                            this.f46914d = c6392lu.m22583k();
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
                    this.f46911a = c0425Gk.m3146n();
                    throw th2;
                }
                this.f46911a = c0425Gk.m3146n();
                throw th;
            }
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f46911a = c0425Gk.m3146n();
            throw th3;
        }
        this.f46911a = c0425Gk.m3146n();
    }

    public C11949zd0(C11822yd0 c11822yd0) {
        this.f46915e = (byte) -1;
        this.f46916f = -1;
        this.f46911a = c11822yd0.f41281a;
    }
}
