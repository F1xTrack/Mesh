package p000;

import java.io.IOException;

/* renamed from: vF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11393vF0 extends A00 {

    /* renamed from: e */
    public static final C11393vF0 f44299e;

    /* renamed from: f */
    public static final C11695xd0 f44300f = new C11695xd0(20);

    /* renamed from: a */
    public final AbstractC0488Hk f44301a;

    /* renamed from: b */
    public InterfaceC9275ei0 f44302b;

    /* renamed from: c */
    public byte f44303c;

    /* renamed from: d */
    public int f44304d;

    static {
        C11393vF0 c11393vF0 = new C11393vF0();
        f44299e = c11393vF0;
        c11393vF0.f44302b = C8886bi0.f17124b;
    }

    public C11393vF0() {
        this.f44303c = (byte) -1;
        this.f44304d = -1;
        this.f44301a = AbstractC0488Hk.f4481a;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f44304d;
        if (i != -1) {
            return i;
        }
        int size = 0;
        for (int i2 = 0; i2 < this.f44302b.size(); i2++) {
            AbstractC0488Hk abstractC0488HkMo10485X = this.f44302b.mo10485X(i2);
            size += abstractC0488HkMo10485X.size() + C0577J9.m4209i(abstractC0488HkMo10485X.size());
        }
        int size2 = this.f44301a.size() + this.f44302b.size() + size;
        this.f44304d = size2;
        return size2;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        WE0 we0 = new WE0(3);
        we0.f13084d = C8886bi0.f17124b;
        return we0;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        WE0 we0 = new WE0(3);
        we0.f13084d = C8886bi0.f17124b;
        we0.m8715q(this);
        return we0;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f44303c;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f44303c = (byte) 1;
        return true;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        for (int i = 0; i < this.f44302b.size(); i++) {
            AbstractC0488Hk abstractC0488HkMo10485X = this.f44302b.mo10485X(i);
            c0577j9.m4220H(1, 2);
            c0577j9.m4218F(abstractC0488HkMo10485X.size());
            c0577j9.m4214B(abstractC0488HkMo10485X);
        }
        c0577j9.m4214B(this.f44301a);
    }

    public C11393vF0(C6392lu c6392lu) {
        this.f44303c = (byte) -1;
        this.f44304d = -1;
        this.f44302b = C8886bi0.f17124b;
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        if (iM22586n != 10) {
                            if (!c6392lu.m22589q(iM22586n, c0577j9M4212n)) {
                            }
                        } else {
                            C8580Yj0 c8580Yj0M22577e = c6392lu.m22577e();
                            if (!z2) {
                                this.f44302b = new C8886bi0();
                                z2 = true;
                            }
                            this.f44302b.mo10486b0(c8580Yj0M22577e);
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
                if (z2) {
                    this.f44302b = this.f44302b.mo10488o();
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f44301a = c0425Gk.m3146n();
                    throw th2;
                }
                this.f44301a = c0425Gk.m3146n();
                throw th;
            }
        }
        if (z2) {
            this.f44302b = this.f44302b.mo10488o();
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44301a = c0425Gk.m3146n();
            throw th3;
        }
        this.f44301a = c0425Gk.m3146n();
    }

    public C11393vF0(WE0 we0) {
        this.f44303c = (byte) -1;
        this.f44304d = -1;
        this.f44301a = we0.f41281a;
    }
}
