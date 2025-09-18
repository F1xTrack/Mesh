package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Hd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7684Hd0 extends A00 {

    /* renamed from: g */
    public static final C7684Hd0 f4379g;

    /* renamed from: h */
    public static final C11695xd0 f4380h = new C11695xd0(3);

    /* renamed from: a */
    public final AbstractC0488Hk f4381a;

    /* renamed from: b */
    public List f4382b;

    /* renamed from: c */
    public List f4383c;

    /* renamed from: d */
    public int f4384d;

    /* renamed from: e */
    public byte f4385e;

    /* renamed from: f */
    public int f4386f;

    static {
        C7684Hd0 c7684Hd0 = new C7684Hd0();
        f4379g = c7684Hd0;
        c7684Hd0.f4382b = Collections.emptyList();
        c7684Hd0.f4383c = Collections.emptyList();
    }

    public C7684Hd0() {
        this.f4384d = -1;
        this.f4385e = (byte) -1;
        this.f4386f = -1;
        this.f4381a = AbstractC0488Hk.f4481a;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f4386f;
        if (i != -1) {
            return i;
        }
        int iM4207g = 0;
        for (int i2 = 0; i2 < this.f4382b.size(); i2++) {
            iM4207g += C0577J9.m4207g(1, (AbstractC0631K0) this.f4382b.get(i2));
        }
        int iM4206f = 0;
        for (int i3 = 0; i3 < this.f4383c.size(); i3++) {
            iM4206f += C0577J9.m4206f(((Integer) this.f4383c.get(i3)).intValue());
        }
        int iM4206f2 = iM4207g + iM4206f;
        if (!this.f4383c.isEmpty()) {
            iM4206f2 = iM4206f2 + 1 + C0577J9.m4206f(iM4206f);
        }
        this.f4384d = iM4206f;
        int size = this.f4381a.size() + iM4206f2;
        this.f4386f = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return C7476Dd0.m1736l();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        C7476Dd0 c7476Dd0M1736l = C7476Dd0.m1736l();
        c7476Dd0M1736l.m1738m(this);
        return c7476Dd0M1736l;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f4385e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f4385e = (byte) 1;
        return true;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        for (int i = 0; i < this.f4382b.size(); i++) {
            c0577j9.m4235y(1, (AbstractC0631K0) this.f4382b.get(i));
        }
        if (this.f4383c.size() > 0) {
            c0577j9.m4218F(42);
            c0577j9.m4218F(this.f4384d);
        }
        for (int i2 = 0; i2 < this.f4383c.size(); i2++) {
            c0577j9.m4234x(((Integer) this.f4383c.get(i2)).intValue());
        }
        c0577j9.m4214B(this.f4381a);
    }

    public C7684Hd0(C6392lu c6392lu, C0217DR c0217dr) {
        this.f4384d = -1;
        this.f4385e = (byte) -1;
        this.f4386f = -1;
        this.f4382b = Collections.emptyList();
        this.f4383c = Collections.emptyList();
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        if (iM22586n == 10) {
                            if ((i & 1) != 1) {
                                this.f4382b = new ArrayList();
                                i |= 1;
                            }
                            this.f4382b.add(c6392lu.m22579g(C7632Gd0.f3825n, c0217dr));
                        } else if (iM22586n == 40) {
                            if ((i & 2) != 2) {
                                this.f4383c = new ArrayList();
                                i |= 2;
                            }
                            this.f4383c.add(Integer.valueOf(c6392lu.m22583k()));
                        } else if (iM22586n != 42) {
                            if (!c6392lu.m22589q(iM22586n, c0577j9M4212n)) {
                            }
                        } else {
                            int iM22576d = c6392lu.m22576d(c6392lu.m22583k());
                            if ((i & 2) != 2 && c6392lu.m22574b() > 0) {
                                this.f4383c = new ArrayList();
                                i |= 2;
                            }
                            while (c6392lu.m22574b() > 0) {
                                this.f4383c.add(Integer.valueOf(c6392lu.m22583k()));
                            }
                            c6392lu.m22575c(iM22576d);
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
                if ((i & 1) == 1) {
                    this.f4382b = Collections.unmodifiableList(this.f4382b);
                }
                if ((i & 2) == 2) {
                    this.f4383c = Collections.unmodifiableList(this.f4383c);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f4381a = c0425Gk.m3146n();
                    throw th2;
                }
                this.f4381a = c0425Gk.m3146n();
                throw th;
            }
        }
        if ((i & 1) == 1) {
            this.f4382b = Collections.unmodifiableList(this.f4382b);
        }
        if ((i & 2) == 2) {
            this.f4383c = Collections.unmodifiableList(this.f4383c);
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f4381a = c0425Gk.m3146n();
            throw th3;
        }
        this.f4381a = c0425Gk.m3146n();
    }

    public C7684Hd0(C7476Dd0 c7476Dd0) {
        this.f4384d = -1;
        this.f4385e = (byte) -1;
        this.f4386f = -1;
        this.f4381a = c7476Dd0.f41281a;
    }
}
