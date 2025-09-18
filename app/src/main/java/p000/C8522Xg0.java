package p000;

import java.util.Collections;

/* renamed from: Xg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8522Xg0 implements InterfaceC6548oN {

    /* renamed from: a */
    public final String f13893a;

    /* renamed from: b */
    public final int f13894b;

    /* renamed from: c */
    public final C9591hA0 f13895c;

    /* renamed from: d */
    public final C0683Kq f13896d;

    /* renamed from: e */
    public InterfaceC8357Ub1 f13897e;

    /* renamed from: f */
    public String f13898f;

    /* renamed from: g */
    public C6686qX f13899g;

    /* renamed from: h */
    public int f13900h;

    /* renamed from: i */
    public int f13901i;

    /* renamed from: j */
    public int f13902j;

    /* renamed from: k */
    public int f13903k;

    /* renamed from: l */
    public long f13904l;

    /* renamed from: m */
    public boolean f13905m;

    /* renamed from: n */
    public int f13906n;

    /* renamed from: o */
    public int f13907o;

    /* renamed from: p */
    public int f13908p;

    /* renamed from: q */
    public boolean f13909q;

    /* renamed from: r */
    public long f13910r;

    /* renamed from: s */
    public int f13911s;

    /* renamed from: t */
    public long f13912t;

    /* renamed from: u */
    public int f13913u;

    /* renamed from: v */
    public String f13914v;

    public C8522Xg0(String str, int i) {
        this.f13893a = str;
        this.f13894b = i;
        C9591hA0 c9591hA0 = new C9591hA0(1024);
        this.f13895c = c9591hA0;
        byte[] bArr = c9591hA0.f28293a;
        this.f13896d = new C0683Kq(bArr, bArr.length);
        this.f13904l = -9223372036854775807L;
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: b */
    public final void mo9102b(C9591hA0 c9591hA0) throws C10103lA0 {
        int iM4752l;
        boolean zM4751k;
        YN1.m9283h(this.f13897e);
        while (c9591hA0.m18743a() > 0) {
            int i = this.f13900h;
            if (i != 0) {
                if (i != 1) {
                    C9591hA0 c9591hA02 = this.f13895c;
                    C0683Kq c0683Kq = this.f13896d;
                    if (i == 2) {
                        int iM18763u = ((this.f13903k & (-225)) << 8) | c9591hA0.m18763u();
                        this.f13902j = iM18763u;
                        if (iM18763u > c9591hA02.f28293a.length) {
                            c9591hA02.m18738D(iM18763u);
                            byte[] bArr = c9591hA02.f28293a;
                            c0683Kq.getClass();
                            c0683Kq.m4758r(bArr.length, bArr);
                        }
                        this.f13901i = 0;
                        this.f13900h = 3;
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(c9591hA0.m18743a(), this.f13902j - this.f13901i);
                        c9591hA0.m18747e(c0683Kq.f6325b, this.f13901i, iMin);
                        int i2 = this.f13901i + iMin;
                        this.f13901i = i2;
                        if (i2 == this.f13902j) {
                            c0683Kq.m4760t(0);
                            if (c0683Kq.m4751k()) {
                                if (this.f13905m) {
                                }
                                this.f13900h = 0;
                            } else {
                                this.f13905m = true;
                                int iM4752l2 = c0683Kq.m4752l(1);
                                int iM4752l3 = iM4752l2 == 1 ? c0683Kq.m4752l(1) : 0;
                                this.f13906n = iM4752l3;
                                if (iM4752l3 != 0) {
                                    throw C10103lA0.m22366a(null, null);
                                }
                                if (iM4752l2 == 1) {
                                    c0683Kq.m4752l((c0683Kq.m4752l(2) + 1) * 8);
                                }
                                if (!c0683Kq.m4751k()) {
                                    throw C10103lA0.m22366a(null, null);
                                }
                                this.f13907o = c0683Kq.m4752l(6);
                                int iM4752l4 = c0683Kq.m4752l(4);
                                int iM4752l5 = c0683Kq.m4752l(3);
                                if (iM4752l4 != 0 || iM4752l5 != 0) {
                                    throw C10103lA0.m22366a(null, null);
                                }
                                if (iM4752l2 == 0) {
                                    int iM4750j = c0683Kq.m4750j();
                                    int iM4743c = c0683Kq.m4743c();
                                    C6589p c6589pM9581d = AbstractC1618Zi.m9581d(c0683Kq, true);
                                    this.f13914v = c6589pM9581d.f39424b;
                                    this.f13911s = c6589pM9581d.f39425c;
                                    this.f13913u = c6589pM9581d.f39426d;
                                    int iM4743c2 = iM4743c - c0683Kq.m4743c();
                                    c0683Kq.m4760t(iM4750j);
                                    byte[] bArr2 = new byte[(iM4743c2 + 7) / 8];
                                    c0683Kq.m4753m(iM4743c2, bArr2);
                                    C6623pX c6623pX = new C6623pX();
                                    c6623pX.f40150a = this.f13898f;
                                    c6623pX.f40161l = AbstractC8544Xr0.m9171n("audio/mp4a-latm");
                                    c6623pX.f40158i = this.f13914v;
                                    c6623pX.f40175z = this.f13913u;
                                    c6623pX.f40141A = this.f13911s;
                                    c6623pX.f40164o = Collections.singletonList(bArr2);
                                    c6623pX.f40153d = this.f13893a;
                                    c6623pX.f40155f = this.f13894b;
                                    C6686qX c6686qX = new C6686qX(c6623pX);
                                    if (!c6686qX.equals(this.f13899g)) {
                                        this.f13899g = c6686qX;
                                        this.f13912t = 1024000000 / c6686qX.f40952B;
                                        this.f13897e.mo965f(c6686qX);
                                    }
                                } else {
                                    int iM4743c3 = c0683Kq.m4743c();
                                    C6589p c6589pM9581d2 = AbstractC1618Zi.m9581d(c0683Kq, true);
                                    this.f13914v = c6589pM9581d2.f39424b;
                                    this.f13911s = c6589pM9581d2.f39425c;
                                    this.f13913u = c6589pM9581d2.f39426d;
                                    c0683Kq.m4763w(c0683Kq.m4752l((c0683Kq.m4752l(2) + 1) * 8) - (iM4743c3 - c0683Kq.m4743c()));
                                }
                                int iM4752l6 = c0683Kq.m4752l(3);
                                this.f13908p = iM4752l6;
                                if (iM4752l6 == 0) {
                                    c0683Kq.m4763w(8);
                                } else if (iM4752l6 == 1) {
                                    c0683Kq.m4763w(9);
                                } else if (iM4752l6 == 3 || iM4752l6 == 4 || iM4752l6 == 5) {
                                    c0683Kq.m4763w(6);
                                } else {
                                    if (iM4752l6 != 6 && iM4752l6 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    c0683Kq.m4763w(1);
                                }
                                boolean zM4751k2 = c0683Kq.m4751k();
                                this.f13909q = zM4751k2;
                                this.f13910r = 0L;
                                if (zM4751k2) {
                                    if (iM4752l2 == 1) {
                                        this.f13910r = c0683Kq.m4752l((c0683Kq.m4752l(2) + 1) * 8);
                                    } else {
                                        do {
                                            zM4751k = c0683Kq.m4751k();
                                            this.f13910r = (this.f13910r << 8) + c0683Kq.m4752l(8);
                                        } while (zM4751k);
                                    }
                                }
                                if (c0683Kq.m4751k()) {
                                    c0683Kq.m4763w(8);
                                }
                            }
                            if (this.f13906n != 0) {
                                throw C10103lA0.m22366a(null, null);
                            }
                            if (this.f13907o != 0) {
                                throw C10103lA0.m22366a(null, null);
                            }
                            if (this.f13908p != 0) {
                                throw C10103lA0.m22366a(null, null);
                            }
                            int i3 = 0;
                            do {
                                iM4752l = c0683Kq.m4752l(8);
                                i3 += iM4752l;
                            } while (iM4752l == 255);
                            int iM4750j2 = c0683Kq.m4750j();
                            if ((iM4750j2 & 7) == 0) {
                                c9591hA02.m18741G(iM4750j2 >> 3);
                            } else {
                                c0683Kq.m4753m(i3 * 8, c9591hA02.f28293a);
                                c9591hA02.m18741G(0);
                            }
                            this.f13897e.mo963d(i3, c9591hA02);
                            YN1.m9281f(this.f13904l != -9223372036854775807L);
                            this.f13897e.mo960a(this.f13904l, 1, i3, 0, null);
                            this.f13904l += this.f13912t;
                            if (this.f13909q) {
                                c0683Kq.m4763w((int) this.f13910r);
                            }
                            this.f13900h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iM18763u2 = c9591hA0.m18763u();
                    if ((iM18763u2 & 224) == 224) {
                        this.f13903k = iM18763u2;
                        this.f13900h = 2;
                    } else if (iM18763u2 != 86) {
                        this.f13900h = 0;
                    }
                }
            } else if (c9591hA0.m18763u() == 86) {
                this.f13900h = 1;
            }
        }
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: c */
    public final void mo9103c() {
        this.f13900h = 0;
        this.f13904l = -9223372036854775807L;
        this.f13905m = false;
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: d */
    public final void mo9104d(InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
        ym0.m9266a();
        ym0.m9267b();
        this.f13897e = interfaceC1538YR.mo2005w(ym0.f14272e, 1);
        ym0.m9267b();
        this.f13898f = (String) ym0.f14269b;
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: f */
    public final void mo9106f(int i, long j) {
        this.f13904l = j;
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: e */
    public final void mo9105e(boolean z) {
    }
}
