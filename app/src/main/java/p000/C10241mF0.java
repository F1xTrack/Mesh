package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: mF0 */
/* loaded from: classes2.dex */
public final class C10241mF0 extends AbstractC11487w00 {

    /* renamed from: k */
    public static final C10241mF0 f37589k;

    /* renamed from: l */
    public static final C11695xd0 f37590l = new C11695xd0(15);

    /* renamed from: b */
    public final AbstractC0488Hk f37591b;

    /* renamed from: c */
    public int f37592c;

    /* renamed from: d */
    public List f37593d;

    /* renamed from: e */
    public List f37594e;

    /* renamed from: f */
    public List f37595f;

    /* renamed from: g */
    public GF0 f37596g;

    /* renamed from: h */
    public NF0 f37597h;

    /* renamed from: i */
    public byte f37598i;

    /* renamed from: j */
    public int f37599j;

    static {
        C10241mF0 c10241mF0 = new C10241mF0();
        f37589k = c10241mF0;
        c10241mF0.f37593d = Collections.emptyList();
        c10241mF0.f37594e = Collections.emptyList();
        c10241mF0.f37595f = Collections.emptyList();
        c10241mF0.f37596g = GF0.f3648g;
        c10241mF0.f37597h = NF0.f7670e;
    }

    public C10241mF0(C10113lF0 c10113lF0) {
        super(c10113lF0);
        this.f37598i = (byte) -1;
        this.f37599j = -1;
        this.f37591b = c10113lF0.f41281a;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: a */
    public final AbstractC0631K0 mo127a() {
        return f37589k;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f37599j;
        if (i != -1) {
            return i;
        }
        int iM4207g = 0;
        for (int i2 = 0; i2 < this.f37593d.size(); i2++) {
            iM4207g += C0577J9.m4207g(3, (AbstractC0631K0) this.f37593d.get(i2));
        }
        for (int i3 = 0; i3 < this.f37594e.size(); i3++) {
            iM4207g += C0577J9.m4207g(4, (AbstractC0631K0) this.f37594e.get(i3));
        }
        for (int i4 = 0; i4 < this.f37595f.size(); i4++) {
            iM4207g += C0577J9.m4207g(5, (AbstractC0631K0) this.f37595f.get(i4));
        }
        if ((this.f37592c & 1) == 1) {
            iM4207g += C0577J9.m4207g(30, this.f37596g);
        }
        if ((this.f37592c & 2) == 2) {
            iM4207g += C0577J9.m4207g(32, this.f37597h);
        }
        int size = this.f37591b.size() + m25536j() + iM4207g;
        this.f37599j = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return C10113lF0.m22369m();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        C10113lF0 c10113lF0M22369m = C10113lF0.m22369m();
        c10113lF0M22369m.m22371n(this);
        return c10113lF0M22369m;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f37598i;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f37593d.size(); i++) {
            if (!((C9729iF0) this.f37593d.get(i)).mo131e()) {
                this.f37598i = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f37594e.size(); i2++) {
            if (!((C10753qF0) this.f37594e.get(i2)).mo131e()) {
                this.f37598i = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f37595f.size(); i3++) {
            if (!((CF0) this.f37595f.get(i3)).mo131e()) {
                this.f37598i = (byte) 0;
                return false;
            }
        }
        if ((this.f37592c & 1) == 1 && !this.f37596g.mo131e()) {
            this.f37598i = (byte) 0;
            return false;
        }
        if (m25535i()) {
            this.f37598i = (byte) 1;
            return true;
        }
        this.f37598i = (byte) 0;
        return false;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        C9108dO1 c9108dO1 = new C9108dO1(this);
        for (int i = 0; i < this.f37593d.size(); i++) {
            c0577j9.m4235y(3, (AbstractC0631K0) this.f37593d.get(i));
        }
        for (int i2 = 0; i2 < this.f37594e.size(); i2++) {
            c0577j9.m4235y(4, (AbstractC0631K0) this.f37594e.get(i2));
        }
        for (int i3 = 0; i3 < this.f37595f.size(); i3++) {
            c0577j9.m4235y(5, (AbstractC0631K0) this.f37595f.get(i3));
        }
        if ((this.f37592c & 1) == 1) {
            c0577j9.m4235y(30, this.f37596g);
        }
        if ((this.f37592c & 2) == 2) {
            c0577j9.m4235y(32, this.f37597h);
        }
        c9108dO1.m17570K(200, c0577j9);
        c0577j9.m4214B(this.f37591b);
    }

    public C10241mF0() {
        this.f37598i = (byte) -1;
        this.f37599j = -1;
        this.f37591b = AbstractC0488Hk.f4481a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public C10241mF0(C6392lu c6392lu, C0217DR c0217dr) {
        this.f37598i = (byte) -1;
        this.f37599j = -1;
        this.f37593d = Collections.emptyList();
        this.f37594e = Collections.emptyList();
        this.f37595f = Collections.emptyList();
        this.f37596g = GF0.f3648g;
        this.f37597h = NF0.f7670e;
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        if (iM22586n == 26) {
                            int i = (c == true ? 1 : 0) & 1;
                            c = c;
                            if (i != 1) {
                                this.f37593d = new ArrayList();
                                c = (c == true ? 1 : 0) | 1;
                            }
                            this.f37593d.add(c6392lu.m22579g(C9729iF0.f28980v, c0217dr));
                        } else if (iM22586n == 34) {
                            int i2 = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i2 != 2) {
                                this.f37594e = new ArrayList();
                                c = (c == true ? 1 : 0) | 2;
                            }
                            this.f37594e.add(c6392lu.m22579g(C10753qF0.f40685v, c0217dr));
                        } else if (iM22586n != 42) {
                            WE0 we0 = null;
                            PE0 pe0M3016i = null;
                            if (iM22586n == 242) {
                                if ((this.f37592c & 1) == 1) {
                                    GF0 gf0 = this.f37596g;
                                    gf0.getClass();
                                    pe0M3016i = GF0.m3016i(gf0);
                                }
                                GF0 gf02 = (GF0) c6392lu.m22579g(GF0.f3649h, c0217dr);
                                this.f37596g = gf02;
                                if (pe0M3016i != null) {
                                    pe0M3016i.m6278q(gf02);
                                    this.f37596g = pe0M3016i.m6275m();
                                }
                                this.f37592c |= 1;
                            } else if (iM22586n != 258) {
                                if (!m25540n(c6392lu, c0577j9M4212n, c0217dr, iM22586n)) {
                                }
                            } else {
                                if ((this.f37592c & 2) == 2) {
                                    NF0 nf0 = this.f37597h;
                                    nf0.getClass();
                                    we0 = new WE0(2);
                                    we0.f13084d = Collections.emptyList();
                                    we0.m8716r(nf0);
                                }
                                NF0 nf02 = (NF0) c6392lu.m22579g(NF0.f7671f, c0217dr);
                                this.f37597h = nf02;
                                if (we0 != null) {
                                    we0.m8716r(nf02);
                                    this.f37597h = we0.m8712n();
                                }
                                this.f37592c |= 2;
                            }
                        } else {
                            int i3 = (c == true ? 1 : 0) & 4;
                            c = c;
                            if (i3 != 4) {
                                this.f37595f = new ArrayList();
                                c = (c == true ? 1 : 0) | 4;
                            }
                            this.f37595f.add(c6392lu.m22579g(CF0.f1269p, c0217dr));
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
                if (((c == true ? 1 : 0) & 1) == 1) {
                    this.f37593d = Collections.unmodifiableList(this.f37593d);
                }
                if (((c == true ? 1 : 0) & 2) == 2) {
                    this.f37594e = Collections.unmodifiableList(this.f37594e);
                }
                if (((c == true ? 1 : 0) & 4) == 4) {
                    this.f37595f = Collections.unmodifiableList(this.f37595f);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f37591b = c0425Gk.m3146n();
                    throw th2;
                }
                this.f37591b = c0425Gk.m3146n();
                m25539m();
                throw th;
            }
        }
        if (((c == true ? 1 : 0) & 1) == 1) {
            this.f37593d = Collections.unmodifiableList(this.f37593d);
        }
        if (((c == true ? 1 : 0) & 2) == 2) {
            this.f37594e = Collections.unmodifiableList(this.f37594e);
        }
        if (((c == true ? 1 : 0) & 4) == 4) {
            this.f37595f = Collections.unmodifiableList(this.f37595f);
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f37591b = c0425Gk.m3146n();
            throw th3;
        }
        this.f37591b = c0425Gk.m3146n();
        m25539m();
    }
}
