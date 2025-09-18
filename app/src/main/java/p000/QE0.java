package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class QE0 extends A00 {

    /* renamed from: g */
    public static final QE0 f9540g;

    /* renamed from: h */
    public static final C11695xd0 f9541h = new C11695xd0(5);

    /* renamed from: a */
    public final AbstractC0488Hk f9542a;

    /* renamed from: b */
    public int f9543b;

    /* renamed from: c */
    public int f9544c;

    /* renamed from: d */
    public List f9545d;

    /* renamed from: e */
    public byte f9546e;

    /* renamed from: f */
    public int f9547f;

    static {
        QE0 qe0 = new QE0();
        f9540g = qe0;
        qe0.f9544c = 0;
        qe0.f9545d = Collections.emptyList();
    }

    public QE0() {
        this.f9546e = (byte) -1;
        this.f9547f = -1;
        this.f9542a = AbstractC0488Hk.f4481a;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f9547f;
        if (i != -1) {
            return i;
        }
        int iM4205e = (this.f9543b & 1) == 1 ? C0577J9.m4205e(1, this.f9544c) : 0;
        for (int i2 = 0; i2 < this.f9545d.size(); i2++) {
            iM4205e += C0577J9.m4207g(2, (AbstractC0631K0) this.f9545d.get(i2));
        }
        int size = this.f9542a.size() + iM4205e;
        this.f9547f = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        PE0 pe0 = new PE0(0);
        pe0.f8932d = Collections.emptyList();
        return pe0;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        PE0 pe0 = new PE0(0);
        pe0.f8932d = Collections.emptyList();
        pe0.m6277p(this);
        return pe0;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f9546e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f9543b & 1) != 1) {
            this.f9546e = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f9545d.size(); i++) {
            if (!((OE0) this.f9545d.get(i)).mo131e()) {
                this.f9546e = (byte) 0;
                return false;
            }
        }
        this.f9546e = (byte) 1;
        return true;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        if ((this.f9543b & 1) == 1) {
            c0577j9.m4233w(1, this.f9544c);
        }
        for (int i = 0; i < this.f9545d.size(); i++) {
            c0577j9.m4235y(2, (AbstractC0631K0) this.f9545d.get(i));
        }
        c0577j9.m4214B(this.f9542a);
    }

    public QE0(C6392lu c6392lu, C0217DR c0217dr) {
        this.f9546e = (byte) -1;
        this.f9547f = -1;
        boolean z = false;
        this.f9544c = 0;
        this.f9545d = Collections.emptyList();
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        if (iM22586n == 8) {
                            this.f9543b |= 1;
                            this.f9544c = c6392lu.m22583k();
                        } else if (iM22586n != 18) {
                            if (!c6392lu.m22589q(iM22586n, c0577j9M4212n)) {
                            }
                        } else {
                            if ((c & 2) != 2) {
                                this.f9545d = new ArrayList();
                                c = 2;
                            }
                            this.f9545d.add(c6392lu.m22579g(OE0.f8318h, c0217dr));
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
                if ((c & 2) == 2) {
                    this.f9545d = Collections.unmodifiableList(this.f9545d);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f9542a = c0425Gk.m3146n();
                    throw th2;
                }
                this.f9542a = c0425Gk.m3146n();
                throw th;
            }
        }
        if ((c & 2) == 2) {
            this.f9545d = Collections.unmodifiableList(this.f9545d);
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f9542a = c0425Gk.m3146n();
            throw th3;
        }
        this.f9542a = c0425Gk.m3146n();
    }

    public QE0(PE0 pe0) {
        this.f9546e = (byte) -1;
        this.f9547f = -1;
        this.f9542a = pe0.f41281a;
    }
}
