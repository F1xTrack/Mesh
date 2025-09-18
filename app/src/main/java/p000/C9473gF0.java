package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: gF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9473gF0 extends A00 {

    /* renamed from: l */
    public static final C9473gF0 f27634l;

    /* renamed from: m */
    public static final C11695xd0 f27635m = new C11695xd0(13);

    /* renamed from: a */
    public final AbstractC0488Hk f27636a;

    /* renamed from: b */
    public int f27637b;

    /* renamed from: c */
    public int f27638c;

    /* renamed from: d */
    public int f27639d;

    /* renamed from: e */
    public EnumC9345fF0 f27640e;

    /* renamed from: f */
    public AF0 f27641f;

    /* renamed from: g */
    public int f27642g;

    /* renamed from: h */
    public List f27643h;

    /* renamed from: i */
    public List f27644i;

    /* renamed from: j */
    public byte f27645j;

    /* renamed from: k */
    public int f27646k;

    static {
        C9473gF0 c9473gF0 = new C9473gF0();
        f27634l = c9473gF0;
        c9473gF0.f27638c = 0;
        c9473gF0.f27639d = 0;
        c9473gF0.f27640e = EnumC9345fF0.TRUE;
        c9473gF0.f27641f = AF0.f123t;
        c9473gF0.f27642g = 0;
        c9473gF0.f27643h = Collections.emptyList();
        c9473gF0.f27644i = Collections.emptyList();
    }

    public C9473gF0() {
        this.f27645j = (byte) -1;
        this.f27646k = -1;
        this.f27636a = AbstractC0488Hk.f4481a;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f27646k;
        if (i != -1) {
            return i;
        }
        int iM4205e = (this.f27637b & 1) == 1 ? C0577J9.m4205e(1, this.f27638c) : 0;
        if ((this.f27637b & 2) == 2) {
            iM4205e += C0577J9.m4205e(2, this.f27639d);
        }
        if ((this.f27637b & 4) == 4) {
            iM4205e += C0577J9.m4204c(3, this.f27640e.f27120a);
        }
        if ((this.f27637b & 8) == 8) {
            iM4205e += C0577J9.m4207g(4, this.f27641f);
        }
        if ((this.f27637b & 16) == 16) {
            iM4205e += C0577J9.m4205e(5, this.f27642g);
        }
        for (int i2 = 0; i2 < this.f27643h.size(); i2++) {
            iM4205e += C0577J9.m4207g(6, (AbstractC0631K0) this.f27643h.get(i2));
        }
        for (int i3 = 0; i3 < this.f27644i.size(); i3++) {
            iM4205e += C0577J9.m4207g(7, (AbstractC0631K0) this.f27644i.get(i3));
        }
        int size = this.f27636a.size() + iM4205e;
        this.f27646k = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return C9217eF0.m17884l();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        C9217eF0 c9217eF0M17884l = C9217eF0.m17884l();
        c9217eF0M17884l.m17886m(this);
        return c9217eF0M17884l;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f27645j;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f27637b & 8) == 8 && !this.f27641f.mo131e()) {
            this.f27645j = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f27643h.size(); i++) {
            if (!((C9473gF0) this.f27643h.get(i)).mo131e()) {
                this.f27645j = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f27644i.size(); i2++) {
            if (!((C9473gF0) this.f27644i.get(i2)).mo131e()) {
                this.f27645j = (byte) 0;
                return false;
            }
        }
        this.f27645j = (byte) 1;
        return true;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        if ((this.f27637b & 1) == 1) {
            c0577j9.m4233w(1, this.f27638c);
        }
        if ((this.f27637b & 2) == 2) {
            c0577j9.m4233w(2, this.f27639d);
        }
        if ((this.f27637b & 4) == 4) {
            c0577j9.m4232v(3, this.f27640e.f27120a);
        }
        if ((this.f27637b & 8) == 8) {
            c0577j9.m4235y(4, this.f27641f);
        }
        if ((this.f27637b & 16) == 16) {
            c0577j9.m4233w(5, this.f27642g);
        }
        for (int i = 0; i < this.f27643h.size(); i++) {
            c0577j9.m4235y(6, (AbstractC0631K0) this.f27643h.get(i));
        }
        for (int i2 = 0; i2 < this.f27644i.size(); i2++) {
            c0577j9.m4235y(7, (AbstractC0631K0) this.f27644i.get(i2));
        }
        c0577j9.m4214B(this.f27636a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public C9473gF0(C6392lu c6392lu, C0217DR c0217dr) {
        EnumC9345fF0 enumC9345fF0;
        this.f27645j = (byte) -1;
        this.f27646k = -1;
        boolean z = false;
        this.f27638c = 0;
        this.f27639d = 0;
        EnumC9345fF0 enumC9345fF02 = EnumC9345fF0.TRUE;
        this.f27640e = enumC9345fF02;
        this.f27641f = AF0.f123t;
        this.f27642g = 0;
        this.f27643h = Collections.emptyList();
        this.f27644i = Collections.emptyList();
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        if (iM22586n == 8) {
                            this.f27637b |= 1;
                            this.f27638c = c6392lu.m22583k();
                        } else if (iM22586n != 16) {
                            C11901zF0 c11901zF0M126r = null;
                            EnumC9345fF0 enumC9345fF03 = null;
                            if (iM22586n == 24) {
                                int iM22583k = c6392lu.m22583k();
                                if (iM22583k != 0) {
                                    if (iM22583k == 1) {
                                        enumC9345fF03 = EnumC9345fF0.FALSE;
                                    } else if (iM22583k == 2) {
                                        enumC9345fF03 = EnumC9345fF0.NULL;
                                    }
                                    enumC9345fF0 = enumC9345fF03;
                                } else {
                                    enumC9345fF0 = enumC9345fF02;
                                }
                                if (enumC9345fF0 == null) {
                                    c0577j9M4212n.m4218F(iM22586n);
                                    c0577j9M4212n.m4218F(iM22583k);
                                } else {
                                    this.f27637b |= 4;
                                    this.f27640e = enumC9345fF0;
                                }
                            } else if (iM22586n == 34) {
                                if ((this.f27637b & 8) == 8) {
                                    AF0 af0 = this.f27641f;
                                    af0.getClass();
                                    c11901zF0M126r = AF0.m126r(af0);
                                }
                                C11901zF0 c11901zF0 = c11901zF0M126r;
                                AF0 af02 = (AF0) c6392lu.m22579g(AF0.f124u, c0217dr);
                                this.f27641f = af02;
                                if (c11901zF0 != null) {
                                    c11901zF0.m26352n(af02);
                                    this.f27641f = c11901zF0.m26351l();
                                }
                                this.f27637b |= 8;
                            } else if (iM22586n != 40) {
                                C11695xd0 c11695xd0 = f27635m;
                                if (iM22586n == 50) {
                                    int i = (c == true ? 1 : 0) & 32;
                                    c = c;
                                    if (i != 32) {
                                        this.f27643h = new ArrayList();
                                        c = (c == true ? 1 : 0) | ' ';
                                    }
                                    this.f27643h.add(c6392lu.m22579g(c11695xd0, c0217dr));
                                } else if (iM22586n != 58) {
                                    if (!c6392lu.m22589q(iM22586n, c0577j9M4212n)) {
                                    }
                                } else {
                                    int i2 = (c == true ? 1 : 0) & 64;
                                    c = c;
                                    if (i2 != 64) {
                                        this.f27644i = new ArrayList();
                                        c = (c == true ? 1 : 0) | '@';
                                    }
                                    this.f27644i.add(c6392lu.m22579g(c11695xd0, c0217dr));
                                }
                            } else {
                                this.f27637b |= 16;
                                this.f27642g = c6392lu.m22583k();
                            }
                        } else {
                            this.f27637b |= 2;
                            this.f27639d = c6392lu.m22583k();
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
                if (((c == true ? 1 : 0) & 32) == 32) {
                    this.f27643h = Collections.unmodifiableList(this.f27643h);
                }
                if (((c == true ? 1 : 0) & 64) == 64) {
                    this.f27644i = Collections.unmodifiableList(this.f27644i);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f27636a = c0425Gk.m3146n();
                    throw th2;
                }
                this.f27636a = c0425Gk.m3146n();
                throw th;
            }
        }
        if (((c == true ? 1 : 0) & 32) == 32) {
            this.f27643h = Collections.unmodifiableList(this.f27643h);
        }
        if (((c == true ? 1 : 0) & 64) == 64) {
            this.f27644i = Collections.unmodifiableList(this.f27644i);
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27636a = c0425Gk.m3146n();
            throw th3;
        }
        this.f27636a = c0425Gk.m3146n();
    }

    public C9473gF0(C9217eF0 c9217eF0) {
        this.f27645j = (byte) -1;
        this.f27646k = -1;
        this.f27636a = c9217eF0.f41281a;
    }
}
