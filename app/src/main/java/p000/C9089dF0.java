package p000;

import java.io.IOException;

/* renamed from: dF0 */
/* loaded from: classes2.dex */
public final class C9089dF0 extends AbstractC11487w00 {

    /* renamed from: g */
    public static final C9089dF0 f25897g;

    /* renamed from: h */
    public static final C11695xd0 f25898h = new C11695xd0(12);

    /* renamed from: b */
    public final AbstractC0488Hk f25899b;

    /* renamed from: c */
    public int f25900c;

    /* renamed from: d */
    public int f25901d;

    /* renamed from: e */
    public byte f25902e;

    /* renamed from: f */
    public int f25903f;

    static {
        C9089dF0 c9089dF0 = new C9089dF0();
        f25897g = c9089dF0;
        c9089dF0.f25901d = 0;
    }

    public C9089dF0(C8956cF0 c8956cF0) {
        super(c8956cF0);
        this.f25902e = (byte) -1;
        this.f25903f = -1;
        this.f25899b = c8956cF0.f41281a;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: a */
    public final AbstractC0631K0 mo127a() {
        return f25897g;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f25903f;
        if (i != -1) {
            return i;
        }
        int size = this.f25899b.size() + m25536j() + ((this.f25900c & 1) == 1 ? C0577J9.m4205e(1, this.f25901d) : 0);
        this.f25903f = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return new C8956cF0();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        C8956cF0 c8956cF0 = new C8956cF0();
        c8956cF0.m10629l(this);
        return c8956cF0;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f25902e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m25535i()) {
            this.f25902e = (byte) 1;
            return true;
        }
        this.f25902e = (byte) 0;
        return false;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        C9108dO1 c9108dO1 = new C9108dO1(this);
        if ((this.f25900c & 1) == 1) {
            c0577j9.m4233w(1, this.f25901d);
        }
        c9108dO1.m17570K(200, c0577j9);
        c0577j9.m4214B(this.f25899b);
    }

    public C9089dF0() {
        this.f25902e = (byte) -1;
        this.f25903f = -1;
        this.f25899b = AbstractC0488Hk.f4481a;
    }

    public C9089dF0(C6392lu c6392lu, C0217DR c0217dr) {
        this.f25902e = (byte) -1;
        this.f25903f = -1;
        boolean z = false;
        this.f25901d = 0;
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        if (iM22586n != 8) {
                            if (!m25540n(c6392lu, c0577j9M4212n, c0217dr, iM22586n)) {
                            }
                        } else {
                            this.f25900c |= 1;
                            this.f25901d = c6392lu.m22583k();
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
                    this.f25899b = c0425Gk.m3146n();
                    throw th2;
                }
                this.f25899b = c0425Gk.m3146n();
                m25539m();
                throw th;
            }
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f25899b = c0425Gk.m3146n();
            throw th3;
        }
        this.f25899b = c0425Gk.m3146n();
        m25539m();
    }
}
