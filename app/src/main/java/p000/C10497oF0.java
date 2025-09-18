package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: oF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10497oF0 extends AbstractC11487w00 {

    /* renamed from: j */
    public static final C10497oF0 f38904j;

    /* renamed from: k */
    public static final C11695xd0 f38905k = new C11695xd0(16);

    /* renamed from: b */
    public final AbstractC0488Hk f38906b;

    /* renamed from: c */
    public int f38907c;

    /* renamed from: d */
    public C11393vF0 f38908d;

    /* renamed from: e */
    public C11265uF0 f38909e;

    /* renamed from: f */
    public C10241mF0 f38910f;

    /* renamed from: g */
    public List f38911g;

    /* renamed from: h */
    public byte f38912h;

    /* renamed from: i */
    public int f38913i;

    static {
        C10497oF0 c10497oF0 = new C10497oF0();
        f38904j = c10497oF0;
        c10497oF0.f38908d = C11393vF0.f44299e;
        c10497oF0.f38909e = C11265uF0.f43621e;
        c10497oF0.f38910f = C10241mF0.f37589k;
        c10497oF0.f38911g = Collections.emptyList();
    }

    public C10497oF0(C10369nF0 c10369nF0) {
        super(c10369nF0);
        this.f38912h = (byte) -1;
        this.f38913i = -1;
        this.f38906b = c10369nF0.f41281a;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: a */
    public final AbstractC0631K0 mo127a() {
        return f38904j;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f38913i;
        if (i != -1) {
            return i;
        }
        int iM4207g = (this.f38907c & 1) == 1 ? C0577J9.m4207g(1, this.f38908d) : 0;
        if ((this.f38907c & 2) == 2) {
            iM4207g += C0577J9.m4207g(2, this.f38909e);
        }
        if ((this.f38907c & 4) == 4) {
            iM4207g += C0577J9.m4207g(3, this.f38910f);
        }
        for (int i2 = 0; i2 < this.f38911g.size(); i2++) {
            iM4207g += C0577J9.m4207g(4, (AbstractC0631K0) this.f38911g.get(i2));
        }
        int size = this.f38906b.size() + m25536j() + iM4207g;
        this.f38913i = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return C10369nF0.m23111m();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        C10369nF0 c10369nF0M23111m = C10369nF0.m23111m();
        c10369nF0M23111m.m23113n(this);
        return c10369nF0M23111m;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f38912h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f38907c & 2) == 2 && !this.f38909e.mo131e()) {
            this.f38912h = (byte) 0;
            return false;
        }
        if ((this.f38907c & 4) == 4 && !this.f38910f.mo131e()) {
            this.f38912h = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f38911g.size(); i++) {
            if (!((TE0) this.f38911g.get(i)).mo131e()) {
                this.f38912h = (byte) 0;
                return false;
            }
        }
        if (m25535i()) {
            this.f38912h = (byte) 1;
            return true;
        }
        this.f38912h = (byte) 0;
        return false;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        C9108dO1 c9108dO1 = new C9108dO1(this);
        if ((this.f38907c & 1) == 1) {
            c0577j9.m4235y(1, this.f38908d);
        }
        if ((this.f38907c & 2) == 2) {
            c0577j9.m4235y(2, this.f38909e);
        }
        if ((this.f38907c & 4) == 4) {
            c0577j9.m4235y(3, this.f38910f);
        }
        for (int i = 0; i < this.f38911g.size(); i++) {
            c0577j9.m4235y(4, (AbstractC0631K0) this.f38911g.get(i));
        }
        c9108dO1.m17570K(200, c0577j9);
        c0577j9.m4214B(this.f38906b);
    }

    public C10497oF0() {
        this.f38912h = (byte) -1;
        this.f38913i = -1;
        this.f38906b = AbstractC0488Hk.f4481a;
    }

    public C10497oF0(C6392lu c6392lu, C0217DR c0217dr) {
        this.f38912h = (byte) -1;
        this.f38913i = -1;
        this.f38908d = C11393vF0.f44299e;
        this.f38909e = C11265uF0.f43621e;
        this.f38910f = C10241mF0.f37589k;
        this.f38911g = Collections.emptyList();
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        C10113lF0 c10113lF0M22369m = null;
                        WE0 we0 = null;
                        WE0 we02 = null;
                        if (iM22586n == 10) {
                            if ((this.f38907c & 1) == 1) {
                                C11393vF0 c11393vF0 = this.f38908d;
                                c11393vF0.getClass();
                                we0 = new WE0(3);
                                we0.f13084d = C8886bi0.f17124b;
                                we0.m8715q(c11393vF0);
                            }
                            C11393vF0 c11393vF02 = (C11393vF0) c6392lu.m22579g(C11393vF0.f44300f, c0217dr);
                            this.f38908d = c11393vF02;
                            if (we0 != null) {
                                we0.m8715q(c11393vF02);
                                this.f38908d = we0.m8711m();
                            }
                            this.f38907c |= 1;
                        } else if (iM22586n == 18) {
                            if ((this.f38907c & 2) == 2) {
                                C11265uF0 c11265uF0 = this.f38909e;
                                c11265uF0.getClass();
                                we02 = new WE0(1);
                                we02.f13084d = Collections.emptyList();
                                we02.m8714p(c11265uF0);
                            }
                            C11265uF0 c11265uF02 = (C11265uF0) c6392lu.m22579g(C11265uF0.f43622f, c0217dr);
                            this.f38909e = c11265uF02;
                            if (we02 != null) {
                                we02.m8714p(c11265uF02);
                                this.f38909e = we02.m8710l();
                            }
                            this.f38907c |= 2;
                        } else if (iM22586n == 26) {
                            if ((this.f38907c & 4) == 4) {
                                C10241mF0 c10241mF0 = this.f38910f;
                                c10241mF0.getClass();
                                c10113lF0M22369m = C10113lF0.m22369m();
                                c10113lF0M22369m.m22371n(c10241mF0);
                            }
                            C10241mF0 c10241mF02 = (C10241mF0) c6392lu.m22579g(C10241mF0.f37590l, c0217dr);
                            this.f38910f = c10241mF02;
                            if (c10113lF0M22369m != null) {
                                c10113lF0M22369m.m22371n(c10241mF02);
                                this.f38910f = c10113lF0M22369m.m22370l();
                            }
                            this.f38907c |= 4;
                        } else if (iM22586n != 34) {
                            if (!m25540n(c6392lu, c0577j9M4212n, c0217dr, iM22586n)) {
                            }
                        } else {
                            int i = (c == true ? 1 : 0) & '\b';
                            c = c;
                            if (i != 8) {
                                this.f38911g = new ArrayList();
                                c = '\b';
                            }
                            this.f38911g.add(c6392lu.m22579g(TE0.f11219K, c0217dr));
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
                if (((c == true ? 1 : 0) & '\b') == 8) {
                    this.f38911g = Collections.unmodifiableList(this.f38911g);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f38906b = c0425Gk.m3146n();
                    throw th2;
                }
                this.f38906b = c0425Gk.m3146n();
                m25539m();
                throw th;
            }
        }
        if (((c == true ? 1 : 0) & '\b') == 8) {
            this.f38911g = Collections.unmodifiableList(this.f38911g);
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38906b = c0425Gk.m3146n();
            throw th3;
        }
        this.f38906b = c0425Gk.m3146n();
        m25539m();
    }
}
