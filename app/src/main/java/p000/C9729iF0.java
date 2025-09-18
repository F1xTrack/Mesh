package p000;

import com.facebook.crypto.mac.NativeMac;
import io.appmetrica.analytics.impl.C5043c9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: iF0 */
/* loaded from: classes2.dex */
public final class C9729iF0 extends AbstractC11487w00 {

    /* renamed from: u */
    public static final C9729iF0 f28979u;

    /* renamed from: v */
    public static final C11695xd0 f28980v = new C11695xd0(14);

    /* renamed from: b */
    public final AbstractC0488Hk f28981b;

    /* renamed from: c */
    public int f28982c;

    /* renamed from: d */
    public int f28983d;

    /* renamed from: e */
    public int f28984e;

    /* renamed from: f */
    public int f28985f;

    /* renamed from: g */
    public AF0 f28986g;

    /* renamed from: h */
    public int f28987h;

    /* renamed from: i */
    public List f28988i;

    /* renamed from: j */
    public AF0 f28989j;

    /* renamed from: k */
    public int f28990k;

    /* renamed from: l */
    public List f28991l;

    /* renamed from: m */
    public List f28992m;

    /* renamed from: n */
    public int f28993n;

    /* renamed from: o */
    public List f28994o;

    /* renamed from: p */
    public GF0 f28995p;

    /* renamed from: q */
    public List f28996q;

    /* renamed from: r */
    public XE0 f28997r;

    /* renamed from: s */
    public byte f28998s;

    /* renamed from: t */
    public int f28999t;

    static {
        C9729iF0 c9729iF0 = new C9729iF0();
        f28979u = c9729iF0;
        c9729iF0.m18990q();
    }

    public C9729iF0(C9601hF0 c9601hF0) {
        super(c9601hF0);
        this.f28993n = -1;
        this.f28998s = (byte) -1;
        this.f28999t = -1;
        this.f28981b = c9601hF0.f41281a;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: a */
    public final AbstractC0631K0 mo127a() {
        return f28979u;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f28999t;
        if (i != -1) {
            return i;
        }
        int iM4205e = (this.f28982c & 2) == 2 ? C0577J9.m4205e(1, this.f28984e) : 0;
        if ((this.f28982c & 4) == 4) {
            iM4205e += C0577J9.m4205e(2, this.f28985f);
        }
        if ((this.f28982c & 8) == 8) {
            iM4205e += C0577J9.m4207g(3, this.f28986g);
        }
        for (int i2 = 0; i2 < this.f28988i.size(); i2++) {
            iM4205e += C0577J9.m4207g(4, (AbstractC0631K0) this.f28988i.get(i2));
        }
        if ((this.f28982c & 32) == 32) {
            iM4205e += C0577J9.m4207g(5, this.f28989j);
        }
        for (int i3 = 0; i3 < this.f28994o.size(); i3++) {
            iM4205e += C0577J9.m4207g(6, (AbstractC0631K0) this.f28994o.get(i3));
        }
        if ((this.f28982c & 16) == 16) {
            iM4205e += C0577J9.m4205e(7, this.f28987h);
        }
        if ((this.f28982c & 64) == 64) {
            iM4205e += C0577J9.m4205e(8, this.f28990k);
        }
        if ((this.f28982c & 1) == 1) {
            iM4205e += C0577J9.m4205e(9, this.f28983d);
        }
        for (int i4 = 0; i4 < this.f28991l.size(); i4++) {
            iM4205e += C0577J9.m4207g(10, (AbstractC0631K0) this.f28991l.get(i4));
        }
        int iM4206f = 0;
        for (int i5 = 0; i5 < this.f28992m.size(); i5++) {
            iM4206f += C0577J9.m4206f(((Integer) this.f28992m.get(i5)).intValue());
        }
        int iM4207g = iM4205e + iM4206f;
        if (!this.f28992m.isEmpty()) {
            iM4207g = iM4207g + 1 + C0577J9.m4206f(iM4206f);
        }
        this.f28993n = iM4206f;
        if ((this.f28982c & 128) == 128) {
            iM4207g += C0577J9.m4207g(30, this.f28995p);
        }
        int iM4206f2 = 0;
        for (int i6 = 0; i6 < this.f28996q.size(); i6++) {
            iM4206f2 += C0577J9.m4206f(((Integer) this.f28996q.get(i6)).intValue());
        }
        int size = (this.f28996q.size() * 2) + iM4207g + iM4206f2;
        if ((this.f28982c & 256) == 256) {
            size += C0577J9.m4207g(32, this.f28997r);
        }
        int size2 = this.f28981b.size() + m25536j() + size;
        this.f28999t = size2;
        return size2;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return C9601hF0.m18789m();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        C9601hF0 c9601hF0M18789m = C9601hF0.m18789m();
        c9601hF0M18789m.m18791n(this);
        return c9601hF0M18789m;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f28998s;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f28982c;
        if ((i & 4) != 4) {
            this.f28998s = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.f28986g.mo131e()) {
            this.f28998s = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f28988i.size(); i2++) {
            if (!((FF0) this.f28988i.get(i2)).mo131e()) {
                this.f28998s = (byte) 0;
                return false;
            }
        }
        if (m18989p() && !this.f28989j.mo131e()) {
            this.f28998s = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.f28991l.size(); i3++) {
            if (!((AF0) this.f28991l.get(i3)).mo131e()) {
                this.f28998s = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f28994o.size(); i4++) {
            if (!((IF0) this.f28994o.get(i4)).mo131e()) {
                this.f28998s = (byte) 0;
                return false;
            }
        }
        if ((this.f28982c & 128) == 128 && !this.f28995p.mo131e()) {
            this.f28998s = (byte) 0;
            return false;
        }
        if ((this.f28982c & 256) == 256 && !this.f28997r.mo131e()) {
            this.f28998s = (byte) 0;
            return false;
        }
        if (m25535i()) {
            this.f28998s = (byte) 1;
            return true;
        }
        this.f28998s = (byte) 0;
        return false;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        C9108dO1 c9108dO1 = new C9108dO1(this);
        if ((this.f28982c & 2) == 2) {
            c0577j9.m4233w(1, this.f28984e);
        }
        if ((this.f28982c & 4) == 4) {
            c0577j9.m4233w(2, this.f28985f);
        }
        if ((this.f28982c & 8) == 8) {
            c0577j9.m4235y(3, this.f28986g);
        }
        for (int i = 0; i < this.f28988i.size(); i++) {
            c0577j9.m4235y(4, (AbstractC0631K0) this.f28988i.get(i));
        }
        if ((this.f28982c & 32) == 32) {
            c0577j9.m4235y(5, this.f28989j);
        }
        for (int i2 = 0; i2 < this.f28994o.size(); i2++) {
            c0577j9.m4235y(6, (AbstractC0631K0) this.f28994o.get(i2));
        }
        if ((this.f28982c & 16) == 16) {
            c0577j9.m4233w(7, this.f28987h);
        }
        if ((this.f28982c & 64) == 64) {
            c0577j9.m4233w(8, this.f28990k);
        }
        if ((this.f28982c & 1) == 1) {
            c0577j9.m4233w(9, this.f28983d);
        }
        for (int i3 = 0; i3 < this.f28991l.size(); i3++) {
            c0577j9.m4235y(10, (AbstractC0631K0) this.f28991l.get(i3));
        }
        if (this.f28992m.size() > 0) {
            c0577j9.m4218F(90);
            c0577j9.m4218F(this.f28993n);
        }
        for (int i4 = 0; i4 < this.f28992m.size(); i4++) {
            c0577j9.m4234x(((Integer) this.f28992m.get(i4)).intValue());
        }
        if ((this.f28982c & 128) == 128) {
            c0577j9.m4235y(30, this.f28995p);
        }
        for (int i5 = 0; i5 < this.f28996q.size(); i5++) {
            c0577j9.m4233w(31, ((Integer) this.f28996q.get(i5)).intValue());
        }
        if ((this.f28982c & 256) == 256) {
            c0577j9.m4235y(32, this.f28997r);
        }
        c9108dO1.m17570K(19000, c0577j9);
        c0577j9.m4214B(this.f28981b);
    }

    /* renamed from: p */
    public final boolean m18989p() {
        return (this.f28982c & 32) == 32;
    }

    /* renamed from: q */
    public final void m18990q() {
        this.f28983d = 6;
        this.f28984e = 6;
        this.f28985f = 0;
        AF0 af0 = AF0.f123t;
        this.f28986g = af0;
        this.f28987h = 0;
        this.f28988i = Collections.emptyList();
        this.f28989j = af0;
        this.f28990k = 0;
        this.f28991l = Collections.emptyList();
        this.f28992m = Collections.emptyList();
        this.f28994o = Collections.emptyList();
        this.f28995p = GF0.f3648g;
        this.f28996q = Collections.emptyList();
        this.f28997r = XE0.f13626e;
    }

    public C9729iF0() {
        this.f28993n = -1;
        this.f28998s = (byte) -1;
        this.f28999t = -1;
        this.f28981b = AbstractC0488Hk.f4481a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public C9729iF0(C6392lu c6392lu, C0217DR c0217dr) {
        this.f28993n = -1;
        this.f28998s = (byte) -1;
        this.f28999t = -1;
        m18990q();
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        boolean z = false;
        char c = 0;
        while (true) {
            ?? M25540n = 1024;
            if (!z) {
                try {
                    try {
                        int iM22586n = c6392lu.m22586n();
                        C11901zF0 c11901zF0M126r = null;
                        WE0 we0 = null;
                        PE0 pe0M3016i = null;
                        C11901zF0 c11901zF0M126r2 = null;
                        switch (iM22586n) {
                            case 0:
                                z = true;
                            case 8:
                                this.f28982c |= 2;
                                this.f28984e = c6392lu.m22583k();
                            case 16:
                                this.f28982c |= 4;
                                this.f28985f = c6392lu.m22583k();
                            case 26:
                                if ((this.f28982c & 8) == 8) {
                                    AF0 af0 = this.f28986g;
                                    af0.getClass();
                                    c11901zF0M126r = AF0.m126r(af0);
                                }
                                AF0 af02 = (AF0) c6392lu.m22579g(AF0.f124u, c0217dr);
                                this.f28986g = af02;
                                if (c11901zF0M126r != null) {
                                    c11901zF0M126r.m26352n(af02);
                                    this.f28986g = c11901zF0M126r.m26351l();
                                }
                                this.f28982c |= 8;
                            case 34:
                                int i = (c == true ? 1 : 0) & 32;
                                c = c;
                                if (i != 32) {
                                    this.f28988i = new ArrayList();
                                    c = (c == true ? 1 : 0) | ' ';
                                }
                                this.f28988i.add(c6392lu.m22579g(FF0.f3112n, c0217dr));
                            case C5043c9.f31377M /* 42 */:
                                if ((this.f28982c & 32) == 32) {
                                    AF0 af03 = this.f28989j;
                                    af03.getClass();
                                    c11901zF0M126r2 = AF0.m126r(af03);
                                }
                                AF0 af04 = (AF0) c6392lu.m22579g(AF0.f124u, c0217dr);
                                this.f28989j = af04;
                                if (c11901zF0M126r2 != null) {
                                    c11901zF0M126r2.m26352n(af04);
                                    this.f28989j = c11901zF0M126r2.m26351l();
                                }
                                this.f28982c |= 32;
                            case 50:
                                int i2 = (c == true ? 1 : 0) & 1024;
                                c = c;
                                if (i2 != 1024) {
                                    this.f28994o = new ArrayList();
                                    c = (c == true ? 1 : 0) | 1024;
                                }
                                this.f28994o.add(c6392lu.m22579g(IF0.f4861m, c0217dr));
                            case 56:
                                this.f28982c |= 16;
                                this.f28987h = c6392lu.m22583k();
                            case NativeMac.KEY_LENGTH /* 64 */:
                                this.f28982c |= 64;
                                this.f28990k = c6392lu.m22583k();
                            case 72:
                                this.f28982c |= 1;
                                this.f28983d = c6392lu.m22583k();
                            case 82:
                                int i3 = (c == true ? 1 : 0) & 256;
                                c = c;
                                if (i3 != 256) {
                                    this.f28991l = new ArrayList();
                                    c = (c == true ? 1 : 0) | 256;
                                }
                                this.f28991l.add(c6392lu.m22579g(AF0.f124u, c0217dr));
                            case 88:
                                int i4 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i4 != 512) {
                                    this.f28992m = new ArrayList();
                                    c = (c == true ? 1 : 0) | 512;
                                }
                                this.f28992m.add(Integer.valueOf(c6392lu.m22583k()));
                            case 90:
                                int iM22576d = c6392lu.m22576d(c6392lu.m22583k());
                                int i5 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i5 != 512) {
                                    c = c;
                                    if (c6392lu.m22574b() > 0) {
                                        this.f28992m = new ArrayList();
                                        c = (c == true ? 1 : 0) | 512;
                                    }
                                }
                                while (c6392lu.m22574b() > 0) {
                                    this.f28992m.add(Integer.valueOf(c6392lu.m22583k()));
                                }
                                c6392lu.m22575c(iM22576d);
                            case 242:
                                if ((this.f28982c & 128) == 128) {
                                    GF0 gf0 = this.f28995p;
                                    gf0.getClass();
                                    pe0M3016i = GF0.m3016i(gf0);
                                }
                                GF0 gf02 = (GF0) c6392lu.m22579g(GF0.f3649h, c0217dr);
                                this.f28995p = gf02;
                                if (pe0M3016i != null) {
                                    pe0M3016i.m6278q(gf02);
                                    this.f28995p = pe0M3016i.m6275m();
                                }
                                this.f28982c |= 128;
                            case 248:
                                int i6 = (c == true ? 1 : 0) & 4096;
                                c = c;
                                if (i6 != 4096) {
                                    this.f28996q = new ArrayList();
                                    c = (c == true ? 1 : 0) | 4096;
                                }
                                this.f28996q.add(Integer.valueOf(c6392lu.m22583k()));
                            case 250:
                                int iM22576d2 = c6392lu.m22576d(c6392lu.m22583k());
                                int i7 = (c == true ? 1 : 0) & 4096;
                                c = c;
                                if (i7 != 4096) {
                                    c = c;
                                    if (c6392lu.m22574b() > 0) {
                                        this.f28996q = new ArrayList();
                                        c = (c == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (c6392lu.m22574b() > 0) {
                                    this.f28996q.add(Integer.valueOf(c6392lu.m22583k()));
                                }
                                c6392lu.m22575c(iM22576d2);
                            case 258:
                                if ((this.f28982c & 256) == 256) {
                                    XE0 xe0 = this.f28997r;
                                    xe0.getClass();
                                    we0 = new WE0(0);
                                    we0.f13084d = Collections.emptyList();
                                    we0.m8713o(xe0);
                                }
                                XE0 xe02 = (XE0) c6392lu.m22579g(XE0.f13627f, c0217dr);
                                this.f28997r = xe02;
                                if (we0 != null) {
                                    we0.m8713o(xe02);
                                    this.f28997r = we0.m8709k();
                                }
                                this.f28982c |= 256;
                            default:
                                M25540n = m25540n(c6392lu, c0577j9M4212n, c0217dr, iM22586n);
                                if (M25540n == 0) {
                                    z = true;
                                }
                        }
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
                        this.f28988i = Collections.unmodifiableList(this.f28988i);
                    }
                    if (((c == true ? 1 : 0) & 1024) == M25540n) {
                        this.f28994o = Collections.unmodifiableList(this.f28994o);
                    }
                    if (((c == true ? 1 : 0) & 256) == 256) {
                        this.f28991l = Collections.unmodifiableList(this.f28991l);
                    }
                    if (((c == true ? 1 : 0) & 512) == 512) {
                        this.f28992m = Collections.unmodifiableList(this.f28992m);
                    }
                    if (((c == true ? 1 : 0) & 4096) == 4096) {
                        this.f28996q = Collections.unmodifiableList(this.f28996q);
                    }
                    try {
                        c0577j9M4212n.m4224m();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f28981b = c0425Gk.m3146n();
                        throw th2;
                    }
                    this.f28981b = c0425Gk.m3146n();
                    m25539m();
                    throw th;
                }
            } else {
                if (((c == true ? 1 : 0) & 32) == 32) {
                    this.f28988i = Collections.unmodifiableList(this.f28988i);
                }
                if (((c == true ? 1 : 0) & 1024) == 1024) {
                    this.f28994o = Collections.unmodifiableList(this.f28994o);
                }
                if (((c == true ? 1 : 0) & 256) == 256) {
                    this.f28991l = Collections.unmodifiableList(this.f28991l);
                }
                if (((c == true ? 1 : 0) & 512) == 512) {
                    this.f28992m = Collections.unmodifiableList(this.f28992m);
                }
                if (((c == true ? 1 : 0) & 4096) == 4096) {
                    this.f28996q = Collections.unmodifiableList(this.f28996q);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f28981b = c0425Gk.m3146n();
                    throw th3;
                }
                this.f28981b = c0425Gk.m3146n();
                m25539m();
                return;
            }
        }
    }
}
