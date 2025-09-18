package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class FF0 extends AbstractC11487w00 {

    /* renamed from: m */
    public static final FF0 f3111m;

    /* renamed from: n */
    public static final C11695xd0 f3112n = new C11695xd0(24);

    /* renamed from: b */
    public final AbstractC0488Hk f3113b;

    /* renamed from: c */
    public int f3114c;

    /* renamed from: d */
    public int f3115d;

    /* renamed from: e */
    public int f3116e;

    /* renamed from: f */
    public boolean f3117f;

    /* renamed from: g */
    public EF0 f3118g;

    /* renamed from: h */
    public List f3119h;

    /* renamed from: i */
    public List f3120i;

    /* renamed from: j */
    public int f3121j;

    /* renamed from: k */
    public byte f3122k;

    /* renamed from: l */
    public int f3123l;

    static {
        FF0 ff0 = new FF0();
        f3111m = ff0;
        ff0.f3115d = 0;
        ff0.f3116e = 0;
        ff0.f3117f = false;
        ff0.f3118g = EF0.INV;
        ff0.f3119h = Collections.emptyList();
        ff0.f3120i = Collections.emptyList();
    }

    public FF0(DF0 df0) {
        super(df0);
        this.f3121j = -1;
        this.f3122k = (byte) -1;
        this.f3123l = -1;
        this.f3113b = df0.f41281a;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: a */
    public final AbstractC0631K0 mo127a() {
        return f3111m;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f3123l;
        if (i != -1) {
            return i;
        }
        int iM4205e = (this.f3114c & 1) == 1 ? C0577J9.m4205e(1, this.f3115d) : 0;
        if ((this.f3114c & 2) == 2) {
            iM4205e += C0577J9.m4205e(2, this.f3116e);
        }
        if ((this.f3114c & 4) == 4) {
            iM4205e += C0577J9.m4211k(3) + 1;
        }
        if ((this.f3114c & 8) == 8) {
            iM4205e += C0577J9.m4204c(4, this.f3118g.f2581a);
        }
        for (int i2 = 0; i2 < this.f3119h.size(); i2++) {
            iM4205e += C0577J9.m4207g(5, (AbstractC0631K0) this.f3119h.get(i2));
        }
        int iM4206f = 0;
        for (int i3 = 0; i3 < this.f3120i.size(); i3++) {
            iM4206f += C0577J9.m4206f(((Integer) this.f3120i.get(i3)).intValue());
        }
        int iM4206f2 = iM4205e + iM4206f;
        if (!this.f3120i.isEmpty()) {
            iM4206f2 = iM4206f2 + 1 + C0577J9.m4206f(iM4206f);
        }
        this.f3121j = iM4206f;
        int size = this.f3113b.size() + m25536j() + iM4206f2;
        this.f3123l = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return DF0.m1603m();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        DF0 df0M1603m = DF0.m1603m();
        df0M1603m.m1605n(this);
        return df0M1603m;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f3122k;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f3114c;
        if ((i & 1) != 1) {
            this.f3122k = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.f3122k = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f3119h.size(); i2++) {
            if (!((AF0) this.f3119h.get(i2)).mo131e()) {
                this.f3122k = (byte) 0;
                return false;
            }
        }
        if (m25535i()) {
            this.f3122k = (byte) 1;
            return true;
        }
        this.f3122k = (byte) 0;
        return false;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        C9108dO1 c9108dO1 = new C9108dO1(this);
        if ((this.f3114c & 1) == 1) {
            c0577j9.m4233w(1, this.f3115d);
        }
        if ((this.f3114c & 2) == 2) {
            c0577j9.m4233w(2, this.f3116e);
        }
        if ((this.f3114c & 4) == 4) {
            boolean z = this.f3117f;
            c0577j9.m4220H(3, 0);
            c0577j9.m4213A(z ? 1 : 0);
        }
        if ((this.f3114c & 8) == 8) {
            c0577j9.m4232v(4, this.f3118g.f2581a);
        }
        for (int i = 0; i < this.f3119h.size(); i++) {
            c0577j9.m4235y(5, (AbstractC0631K0) this.f3119h.get(i));
        }
        if (this.f3120i.size() > 0) {
            c0577j9.m4218F(50);
            c0577j9.m4218F(this.f3121j);
        }
        for (int i2 = 0; i2 < this.f3120i.size(); i2++) {
            c0577j9.m4234x(((Integer) this.f3120i.get(i2)).intValue());
        }
        c9108dO1.m17570K(1000, c0577j9);
        c0577j9.m4214B(this.f3113b);
    }

    public FF0() {
        this.f3121j = -1;
        this.f3122k = (byte) -1;
        this.f3123l = -1;
        this.f3113b = AbstractC0488Hk.f4481a;
    }

    public FF0(C6392lu c6392lu, C0217DR c0217dr) {
        EF0 ef0;
        this.f3121j = -1;
        this.f3122k = (byte) -1;
        this.f3123l = -1;
        this.f3115d = 0;
        this.f3116e = 0;
        this.f3117f = false;
        EF0 ef02 = EF0.INV;
        this.f3118g = ef02;
        this.f3119h = Collections.emptyList();
        this.f3120i = Collections.emptyList();
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iM22586n = c6392lu.m22586n();
                        if (iM22586n != 0) {
                            if (iM22586n == 8) {
                                this.f3114c |= 1;
                                this.f3115d = c6392lu.m22583k();
                            } else if (iM22586n == 16) {
                                this.f3114c |= 2;
                                this.f3116e = c6392lu.m22583k();
                            } else if (iM22586n == 24) {
                                this.f3114c |= 4;
                                this.f3117f = c6392lu.m22584l() != 0;
                            } else if (iM22586n == 32) {
                                int iM22583k = c6392lu.m22583k();
                                if (iM22583k == 0) {
                                    ef0 = EF0.IN;
                                } else if (iM22583k != 1) {
                                    ef0 = iM22583k != 2 ? null : ef02;
                                } else {
                                    ef0 = EF0.OUT;
                                }
                                if (ef0 == null) {
                                    c0577j9M4212n.m4218F(iM22586n);
                                    c0577j9M4212n.m4218F(iM22583k);
                                } else {
                                    this.f3114c |= 8;
                                    this.f3118g = ef0;
                                }
                            } else if (iM22586n == 42) {
                                if ((i & 16) != 16) {
                                    this.f3119h = new ArrayList();
                                    i |= 16;
                                }
                                this.f3119h.add(c6392lu.m22579g(AF0.f124u, c0217dr));
                            } else if (iM22586n == 48) {
                                if ((i & 32) != 32) {
                                    this.f3120i = new ArrayList();
                                    i |= 32;
                                }
                                this.f3120i.add(Integer.valueOf(c6392lu.m22583k()));
                            } else if (iM22586n != 50) {
                                if (!m25540n(c6392lu, c0577j9M4212n, c0217dr, iM22586n)) {
                                }
                            } else {
                                int iM22576d = c6392lu.m22576d(c6392lu.m22583k());
                                if ((i & 32) != 32 && c6392lu.m22574b() > 0) {
                                    this.f3120i = new ArrayList();
                                    i |= 32;
                                }
                                while (c6392lu.m22574b() > 0) {
                                    this.f3120i.add(Integer.valueOf(c6392lu.m22583k()));
                                }
                                c6392lu.m22575c(iM22576d);
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        Y90 y90 = new Y90(e.getMessage());
                        y90.f14178a = this;
                        throw y90;
                    }
                } catch (Y90 e2) {
                    e2.f14178a = this;
                    throw e2;
                }
            } catch (Throwable th) {
                if ((i & 16) == 16) {
                    this.f3119h = Collections.unmodifiableList(this.f3119h);
                }
                if ((i & 32) == 32) {
                    this.f3120i = Collections.unmodifiableList(this.f3120i);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f3113b = c0425Gk.m3146n();
                    throw th2;
                }
                this.f3113b = c0425Gk.m3146n();
                m25539m();
                throw th;
            }
        }
        if ((i & 16) == 16) {
            this.f3119h = Collections.unmodifiableList(this.f3119h);
        }
        if ((i & 32) == 32) {
            this.f3120i = Collections.unmodifiableList(this.f3120i);
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f3113b = c0425Gk.m3146n();
            throw th3;
        }
        this.f3113b = c0425Gk.m3146n();
        m25539m();
    }
}
