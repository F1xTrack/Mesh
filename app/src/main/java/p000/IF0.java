package p000;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class IF0 extends AbstractC11487w00 {

    /* renamed from: l */
    public static final IF0 f4860l;

    /* renamed from: m */
    public static final C11695xd0 f4861m = new C11695xd0(26);

    /* renamed from: b */
    public final AbstractC0488Hk f4862b;

    /* renamed from: c */
    public int f4863c;

    /* renamed from: d */
    public int f4864d;

    /* renamed from: e */
    public int f4865e;

    /* renamed from: f */
    public AF0 f4866f;

    /* renamed from: g */
    public int f4867g;

    /* renamed from: h */
    public AF0 f4868h;

    /* renamed from: i */
    public int f4869i;

    /* renamed from: j */
    public byte f4870j;

    /* renamed from: k */
    public int f4871k;

    static {
        IF0 if0 = new IF0();
        f4860l = if0;
        if0.f4864d = 0;
        if0.f4865e = 0;
        AF0 af0 = AF0.f123t;
        if0.f4866f = af0;
        if0.f4867g = 0;
        if0.f4868h = af0;
        if0.f4869i = 0;
    }

    public IF0(HF0 hf0) {
        super(hf0);
        this.f4870j = (byte) -1;
        this.f4871k = -1;
        this.f4862b = hf0.f41281a;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: a */
    public final AbstractC0631K0 mo127a() {
        return f4860l;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f4871k;
        if (i != -1) {
            return i;
        }
        int iM4205e = (this.f4863c & 1) == 1 ? C0577J9.m4205e(1, this.f4864d) : 0;
        if ((this.f4863c & 2) == 2) {
            iM4205e += C0577J9.m4205e(2, this.f4865e);
        }
        if ((this.f4863c & 4) == 4) {
            iM4205e += C0577J9.m4207g(3, this.f4866f);
        }
        if ((this.f4863c & 16) == 16) {
            iM4205e += C0577J9.m4207g(4, this.f4868h);
        }
        if ((this.f4863c & 8) == 8) {
            iM4205e += C0577J9.m4205e(5, this.f4867g);
        }
        if ((this.f4863c & 32) == 32) {
            iM4205e += C0577J9.m4205e(6, this.f4869i);
        }
        int size = this.f4862b.size() + m25536j() + iM4205e;
        this.f4871k = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        HF0 hf0 = new HF0();
        AF0 af0 = AF0.f123t;
        hf0.f4196g = af0;
        hf0.f4198i = af0;
        return hf0;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        HF0 hf0 = new HF0();
        AF0 af0 = AF0.f123t;
        hf0.f4196g = af0;
        hf0.f4198i = af0;
        hf0.m3336m(this);
        return hf0;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f4870j;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f4863c;
        if ((i & 2) != 2) {
            this.f4870j = (byte) 0;
            return false;
        }
        if ((i & 4) == 4 && !this.f4866f.mo131e()) {
            this.f4870j = (byte) 0;
            return false;
        }
        if ((this.f4863c & 16) == 16 && !this.f4868h.mo131e()) {
            this.f4870j = (byte) 0;
            return false;
        }
        if (m25535i()) {
            this.f4870j = (byte) 1;
            return true;
        }
        this.f4870j = (byte) 0;
        return false;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        C9108dO1 c9108dO1 = new C9108dO1(this);
        if ((this.f4863c & 1) == 1) {
            c0577j9.m4233w(1, this.f4864d);
        }
        if ((this.f4863c & 2) == 2) {
            c0577j9.m4233w(2, this.f4865e);
        }
        if ((this.f4863c & 4) == 4) {
            c0577j9.m4235y(3, this.f4866f);
        }
        if ((this.f4863c & 16) == 16) {
            c0577j9.m4235y(4, this.f4868h);
        }
        if ((this.f4863c & 8) == 8) {
            c0577j9.m4233w(5, this.f4867g);
        }
        if ((this.f4863c & 32) == 32) {
            c0577j9.m4233w(6, this.f4869i);
        }
        c9108dO1.m17570K(200, c0577j9);
        c0577j9.m4214B(this.f4862b);
    }

    public IF0() {
        this.f4870j = (byte) -1;
        this.f4871k = -1;
        this.f4862b = AbstractC0488Hk.f4481a;
    }

    public IF0(C6392lu c6392lu, C0217DR c0217dr) {
        this.f4870j = (byte) -1;
        this.f4871k = -1;
        boolean z = false;
        this.f4864d = 0;
        this.f4865e = 0;
        AF0 af0 = AF0.f123t;
        this.f4866f = af0;
        this.f4867g = 0;
        this.f4868h = af0;
        this.f4869i = 0;
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iM22586n = c6392lu.m22586n();
                        if (iM22586n != 0) {
                            if (iM22586n == 8) {
                                this.f4863c |= 1;
                                this.f4864d = c6392lu.m22583k();
                            } else if (iM22586n != 16) {
                                C11901zF0 c11901zF0M126r = null;
                                if (iM22586n == 26) {
                                    if ((this.f4863c & 4) == 4) {
                                        AF0 af02 = this.f4866f;
                                        af02.getClass();
                                        c11901zF0M126r = AF0.m126r(af02);
                                    }
                                    AF0 af03 = (AF0) c6392lu.m22579g(AF0.f124u, c0217dr);
                                    this.f4866f = af03;
                                    if (c11901zF0M126r != null) {
                                        c11901zF0M126r.m26352n(af03);
                                        this.f4866f = c11901zF0M126r.m26351l();
                                    }
                                    this.f4863c |= 4;
                                } else if (iM22586n == 34) {
                                    if ((this.f4863c & 16) == 16) {
                                        AF0 af04 = this.f4868h;
                                        af04.getClass();
                                        c11901zF0M126r = AF0.m126r(af04);
                                    }
                                    AF0 af05 = (AF0) c6392lu.m22579g(AF0.f124u, c0217dr);
                                    this.f4868h = af05;
                                    if (c11901zF0M126r != null) {
                                        c11901zF0M126r.m26352n(af05);
                                        this.f4868h = c11901zF0M126r.m26351l();
                                    }
                                    this.f4863c |= 16;
                                } else if (iM22586n == 40) {
                                    this.f4863c |= 8;
                                    this.f4867g = c6392lu.m22583k();
                                } else if (iM22586n != 48) {
                                    if (!m25540n(c6392lu, c0577j9M4212n, c0217dr, iM22586n)) {
                                    }
                                } else {
                                    this.f4863c |= 32;
                                    this.f4869i = c6392lu.m22583k();
                                }
                            } else {
                                this.f4863c |= 2;
                                this.f4865e = c6392lu.m22583k();
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
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f4862b = c0425Gk.m3146n();
                    throw th2;
                }
                this.f4862b = c0425Gk.m3146n();
                m25539m();
                throw th;
            }
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f4862b = c0425Gk.m3146n();
            throw th3;
        }
        this.f4862b = c0425Gk.m3146n();
        m25539m();
    }
}
