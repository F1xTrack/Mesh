package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: uF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11265uF0 extends A00 {

    /* renamed from: e */
    public static final C11265uF0 f43621e;

    /* renamed from: f */
    public static final C11695xd0 f43622f = new C11695xd0(18);

    /* renamed from: a */
    public final AbstractC0488Hk f43623a;

    /* renamed from: b */
    public List f43624b;

    /* renamed from: c */
    public byte f43625c;

    /* renamed from: d */
    public int f43626d;

    static {
        C11265uF0 c11265uF0 = new C11265uF0();
        f43621e = c11265uF0;
        c11265uF0.f43624b = Collections.emptyList();
    }

    public C11265uF0() {
        this.f43625c = (byte) -1;
        this.f43626d = -1;
        this.f43623a = AbstractC0488Hk.f4481a;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f43626d;
        if (i != -1) {
            return i;
        }
        int iM4207g = 0;
        for (int i2 = 0; i2 < this.f43624b.size(); i2++) {
            iM4207g += C0577J9.m4207g(1, (AbstractC0631K0) this.f43624b.get(i2));
        }
        int size = this.f43623a.size() + iM4207g;
        this.f43626d = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        WE0 we0 = new WE0(1);
        we0.f13084d = Collections.emptyList();
        return we0;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        WE0 we0 = new WE0(1);
        we0.f13084d = Collections.emptyList();
        we0.m8714p(this);
        return we0;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f43625c;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f43624b.size(); i++) {
            if (!((C11137tF0) this.f43624b.get(i)).mo131e()) {
                this.f43625c = (byte) 0;
                return false;
            }
        }
        this.f43625c = (byte) 1;
        return true;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        for (int i = 0; i < this.f43624b.size(); i++) {
            c0577j9.m4235y(1, (AbstractC0631K0) this.f43624b.get(i));
        }
        c0577j9.m4214B(this.f43623a);
    }

    public C11265uF0(C6392lu c6392lu, C0217DR c0217dr) {
        this.f43625c = (byte) -1;
        this.f43626d = -1;
        this.f43624b = Collections.emptyList();
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
                            if (!z2) {
                                this.f43624b = new ArrayList();
                                z2 = true;
                            }
                            this.f43624b.add(c6392lu.m22579g(C11137tF0.f42964i, c0217dr));
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
                    this.f43624b = Collections.unmodifiableList(this.f43624b);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f43623a = c0425Gk.m3146n();
                    throw th2;
                }
                this.f43623a = c0425Gk.m3146n();
                throw th;
            }
        }
        if (z2) {
            this.f43624b = Collections.unmodifiableList(this.f43624b);
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43623a = c0425Gk.m3146n();
            throw th3;
        }
        this.f43623a = c0425Gk.m3146n();
    }

    public C11265uF0(WE0 we0) {
        this.f43625c = (byte) -1;
        this.f43626d = -1;
        this.f43623a = we0.f41281a;
    }
}
