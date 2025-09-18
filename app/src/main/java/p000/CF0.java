package p000;

import io.appmetrica.analytics.impl.C5043c9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class CF0 extends AbstractC11487w00 {

    /* renamed from: o */
    public static final CF0 f1268o;

    /* renamed from: p */
    public static final C11695xd0 f1269p = new C11695xd0(23);

    /* renamed from: b */
    public final AbstractC0488Hk f1270b;

    /* renamed from: c */
    public int f1271c;

    /* renamed from: d */
    public int f1272d;

    /* renamed from: e */
    public int f1273e;

    /* renamed from: f */
    public List f1274f;

    /* renamed from: g */
    public AF0 f1275g;

    /* renamed from: h */
    public int f1276h;

    /* renamed from: i */
    public AF0 f1277i;

    /* renamed from: j */
    public int f1278j;

    /* renamed from: k */
    public List f1279k;

    /* renamed from: l */
    public List f1280l;

    /* renamed from: m */
    public byte f1281m;

    /* renamed from: n */
    public int f1282n;

    static {
        CF0 cf0 = new CF0();
        f1268o = cf0;
        cf0.m1128p();
    }

    public CF0(BF0 bf0) {
        super(bf0);
        this.f1281m = (byte) -1;
        this.f1282n = -1;
        this.f1270b = bf0.f41281a;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: a */
    public final AbstractC0631K0 mo127a() {
        return f1268o;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f1282n;
        if (i != -1) {
            return i;
        }
        int iM4205e = (this.f1271c & 1) == 1 ? C0577J9.m4205e(1, this.f1272d) : 0;
        if ((this.f1271c & 2) == 2) {
            iM4205e += C0577J9.m4205e(2, this.f1273e);
        }
        for (int i2 = 0; i2 < this.f1274f.size(); i2++) {
            iM4205e += C0577J9.m4207g(3, (AbstractC0631K0) this.f1274f.get(i2));
        }
        if ((this.f1271c & 4) == 4) {
            iM4205e += C0577J9.m4207g(4, this.f1275g);
        }
        if ((this.f1271c & 8) == 8) {
            iM4205e += C0577J9.m4205e(5, this.f1276h);
        }
        if ((this.f1271c & 16) == 16) {
            iM4205e += C0577J9.m4207g(6, this.f1277i);
        }
        if ((this.f1271c & 32) == 32) {
            iM4205e += C0577J9.m4205e(7, this.f1278j);
        }
        for (int i3 = 0; i3 < this.f1279k.size(); i3++) {
            iM4205e += C0577J9.m4207g(8, (AbstractC0631K0) this.f1279k.get(i3));
        }
        int iM4206f = 0;
        for (int i4 = 0; i4 < this.f1280l.size(); i4++) {
            iM4206f += C0577J9.m4206f(((Integer) this.f1280l.get(i4)).intValue());
        }
        int size = this.f1270b.size() + m25536j() + (this.f1280l.size() * 2) + iM4205e + iM4206f;
        this.f1282n = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return BF0.m565m();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        BF0 bf0M565m = BF0.m565m();
        bf0M565m.m570n(this);
        return bf0M565m;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f1281m;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f1271c & 2) != 2) {
            this.f1281m = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f1274f.size(); i++) {
            if (!((FF0) this.f1274f.get(i)).mo131e()) {
                this.f1281m = (byte) 0;
                return false;
            }
        }
        if ((this.f1271c & 4) == 4 && !this.f1275g.mo131e()) {
            this.f1281m = (byte) 0;
            return false;
        }
        if ((this.f1271c & 16) == 16 && !this.f1277i.mo131e()) {
            this.f1281m = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f1279k.size(); i2++) {
            if (!((QE0) this.f1279k.get(i2)).mo131e()) {
                this.f1281m = (byte) 0;
                return false;
            }
        }
        if (m25535i()) {
            this.f1281m = (byte) 1;
            return true;
        }
        this.f1281m = (byte) 0;
        return false;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        C9108dO1 c9108dO1 = new C9108dO1(this);
        if ((this.f1271c & 1) == 1) {
            c0577j9.m4233w(1, this.f1272d);
        }
        if ((this.f1271c & 2) == 2) {
            c0577j9.m4233w(2, this.f1273e);
        }
        for (int i = 0; i < this.f1274f.size(); i++) {
            c0577j9.m4235y(3, (AbstractC0631K0) this.f1274f.get(i));
        }
        if ((this.f1271c & 4) == 4) {
            c0577j9.m4235y(4, this.f1275g);
        }
        if ((this.f1271c & 8) == 8) {
            c0577j9.m4233w(5, this.f1276h);
        }
        if ((this.f1271c & 16) == 16) {
            c0577j9.m4235y(6, this.f1277i);
        }
        if ((this.f1271c & 32) == 32) {
            c0577j9.m4233w(7, this.f1278j);
        }
        for (int i2 = 0; i2 < this.f1279k.size(); i2++) {
            c0577j9.m4235y(8, (AbstractC0631K0) this.f1279k.get(i2));
        }
        for (int i3 = 0; i3 < this.f1280l.size(); i3++) {
            c0577j9.m4233w(31, ((Integer) this.f1280l.get(i3)).intValue());
        }
        c9108dO1.m17570K(200, c0577j9);
        c0577j9.m4214B(this.f1270b);
    }

    /* renamed from: p */
    public final void m1128p() {
        this.f1272d = 6;
        this.f1273e = 0;
        this.f1274f = Collections.emptyList();
        AF0 af0 = AF0.f123t;
        this.f1275g = af0;
        this.f1276h = 0;
        this.f1277i = af0;
        this.f1278j = 0;
        this.f1279k = Collections.emptyList();
        this.f1280l = Collections.emptyList();
    }

    public CF0() {
        this.f1281m = (byte) -1;
        this.f1282n = -1;
        this.f1270b = AbstractC0488Hk.f4481a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public CF0(C6392lu c6392lu, C0217DR c0217dr) {
        this.f1281m = (byte) -1;
        this.f1282n = -1;
        m1128p();
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        boolean z = false;
        int i = 0;
        while (true) {
            ?? M25540n = 128;
            if (!z) {
                try {
                    try {
                        int iM22586n = c6392lu.m22586n();
                        C11901zF0 c11901zF0M126r = null;
                        switch (iM22586n) {
                            case 0:
                                z = true;
                            case 8:
                                this.f1271c |= 1;
                                this.f1272d = c6392lu.m22583k();
                            case 16:
                                this.f1271c |= 2;
                                this.f1273e = c6392lu.m22583k();
                            case 26:
                                if ((i & 4) != 4) {
                                    this.f1274f = new ArrayList();
                                    i |= 4;
                                }
                                this.f1274f.add(c6392lu.m22579g(FF0.f3112n, c0217dr));
                            case 34:
                                if ((this.f1271c & 4) == 4) {
                                    AF0 af0 = this.f1275g;
                                    af0.getClass();
                                    c11901zF0M126r = AF0.m126r(af0);
                                }
                                AF0 af02 = (AF0) c6392lu.m22579g(AF0.f124u, c0217dr);
                                this.f1275g = af02;
                                if (c11901zF0M126r != null) {
                                    c11901zF0M126r.m26352n(af02);
                                    this.f1275g = c11901zF0M126r.m26351l();
                                }
                                this.f1271c |= 4;
                            case C5043c9.f31376L /* 40 */:
                                this.f1271c |= 8;
                                this.f1276h = c6392lu.m22583k();
                            case 50:
                                if ((this.f1271c & 16) == 16) {
                                    AF0 af03 = this.f1277i;
                                    af03.getClass();
                                    c11901zF0M126r = AF0.m126r(af03);
                                }
                                AF0 af04 = (AF0) c6392lu.m22579g(AF0.f124u, c0217dr);
                                this.f1277i = af04;
                                if (c11901zF0M126r != null) {
                                    c11901zF0M126r.m26352n(af04);
                                    this.f1277i = c11901zF0M126r.m26351l();
                                }
                                this.f1271c |= 16;
                            case 56:
                                this.f1271c |= 32;
                                this.f1278j = c6392lu.m22583k();
                            case 66:
                                if ((i & 128) != 128) {
                                    this.f1279k = new ArrayList();
                                    i |= 128;
                                }
                                this.f1279k.add(c6392lu.m22579g(QE0.f9541h, c0217dr));
                            case 248:
                                if ((i & 256) != 256) {
                                    this.f1280l = new ArrayList();
                                    i |= 256;
                                }
                                this.f1280l.add(Integer.valueOf(c6392lu.m22583k()));
                            case 250:
                                int iM22576d = c6392lu.m22576d(c6392lu.m22583k());
                                if ((i & 256) != 256 && c6392lu.m22574b() > 0) {
                                    this.f1280l = new ArrayList();
                                    i |= 256;
                                }
                                while (c6392lu.m22574b() > 0) {
                                    this.f1280l.add(Integer.valueOf(c6392lu.m22583k()));
                                }
                                c6392lu.m22575c(iM22576d);
                                break;
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
                    if ((i & 4) == 4) {
                        this.f1274f = Collections.unmodifiableList(this.f1274f);
                    }
                    if ((i & 128) == M25540n) {
                        this.f1279k = Collections.unmodifiableList(this.f1279k);
                    }
                    if ((i & 256) == 256) {
                        this.f1280l = Collections.unmodifiableList(this.f1280l);
                    }
                    try {
                        c0577j9M4212n.m4224m();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f1270b = c0425Gk.m3146n();
                        throw th2;
                    }
                    this.f1270b = c0425Gk.m3146n();
                    m25539m();
                    throw th;
                }
            } else {
                if ((i & 4) == 4) {
                    this.f1274f = Collections.unmodifiableList(this.f1274f);
                }
                if ((i & 128) == 128) {
                    this.f1279k = Collections.unmodifiableList(this.f1279k);
                }
                if ((i & 256) == 256) {
                    this.f1280l = Collections.unmodifiableList(this.f1280l);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f1270b = c0425Gk.m3146n();
                    throw th3;
                }
                this.f1270b = c0425Gk.m3146n();
                m25539m();
                return;
            }
        }
    }
}
