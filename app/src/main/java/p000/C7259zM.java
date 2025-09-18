package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: zM */
/* loaded from: classes.dex */
public final class C7259zM implements InterfaceC6548oN {

    /* renamed from: a */
    public final /* synthetic */ int f46799a;

    /* renamed from: b */
    public boolean f46800b;

    /* renamed from: c */
    public long f46801c;

    /* renamed from: d */
    public int f46802d;

    /* renamed from: e */
    public int f46803e;

    /* renamed from: f */
    public final Object f46804f;

    /* renamed from: g */
    public Object f46805g;

    public C7259zM(List list) {
        this.f46799a = 0;
        this.f46804f = list;
        this.f46805g = new InterfaceC8357Ub1[list.size()];
        this.f46801c = -9223372036854775807L;
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: b */
    public final void mo9102b(C9591hA0 c9591hA0) {
        boolean z;
        boolean z2;
        switch (this.f46799a) {
            case 0:
                if (this.f46800b) {
                    if (this.f46802d == 2) {
                        if (c9591hA0.m18743a() == 0) {
                            z2 = false;
                        } else {
                            if (c9591hA0.m18763u() != 32) {
                                this.f46800b = false;
                            }
                            this.f46802d--;
                            z2 = this.f46800b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.f46802d == 1) {
                        if (c9591hA0.m18743a() == 0) {
                            z = false;
                        } else {
                            if (c9591hA0.m18763u() != 0) {
                                this.f46800b = false;
                            }
                            this.f46802d--;
                            z = this.f46800b;
                        }
                        if (!z) {
                        }
                    }
                    int i = c9591hA0.f28294b;
                    int iM18743a = c9591hA0.m18743a();
                    for (InterfaceC8357Ub1 interfaceC8357Ub1 : (InterfaceC8357Ub1[]) this.f46805g) {
                        c9591hA0.m18741G(i);
                        interfaceC8357Ub1.mo963d(iM18743a, c9591hA0);
                    }
                    this.f46803e += iM18743a;
                    break;
                }
                break;
            default:
                YN1.m9283h((InterfaceC8357Ub1) this.f46805g);
                if (this.f46800b) {
                    int iM18743a2 = c9591hA0.m18743a();
                    int i2 = this.f46803e;
                    if (i2 < 10) {
                        int iMin = Math.min(iM18743a2, 10 - i2);
                        byte[] bArr = c9591hA0.f28293a;
                        int i3 = c9591hA0.f28294b;
                        C9591hA0 c9591hA02 = (C9591hA0) this.f46804f;
                        System.arraycopy(bArr, i3, c9591hA02.f28293a, this.f46803e, iMin);
                        if (this.f46803e + iMin == 10) {
                            c9591hA02.m18741G(0);
                            if (73 != c9591hA02.m18763u() || 68 != c9591hA02.m18763u() || 51 != c9591hA02.m18763u()) {
                                AbstractC10872rA1.m24175h("Discarding invalid ID3 tag");
                                this.f46800b = false;
                                break;
                            } else {
                                c9591hA02.m18742H(3);
                                this.f46802d = c9591hA02.m18762t() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iM18743a2, this.f46802d - this.f46803e);
                    ((InterfaceC8357Ub1) this.f46805g).mo963d(iMin2, c9591hA0);
                    this.f46803e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: c */
    public final void mo9103c() {
        switch (this.f46799a) {
            case 0:
                this.f46800b = false;
                this.f46801c = -9223372036854775807L;
                break;
            default:
                this.f46800b = false;
                this.f46801c = -9223372036854775807L;
                break;
        }
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: d */
    public final void mo9104d(InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
        switch (this.f46799a) {
            case 0:
                int i = 0;
                while (true) {
                    InterfaceC8357Ub1[] interfaceC8357Ub1Arr = (InterfaceC8357Ub1[]) this.f46805g;
                    if (i >= interfaceC8357Ub1Arr.length) {
                        break;
                    } else {
                        C9906jd1 c9906jd1 = (C9906jd1) ((List) this.f46804f).get(i);
                        ym0.m9266a();
                        ym0.m9267b();
                        InterfaceC8357Ub1 interfaceC8357Ub1Mo2005w = interfaceC1538YR.mo2005w(ym0.f14272e, 3);
                        C6623pX c6623pX = new C6623pX();
                        ym0.m9267b();
                        c6623pX.f40150a = (String) ym0.f14269b;
                        c6623pX.f40161l = AbstractC8544Xr0.m9171n("application/dvbsubs");
                        c6623pX.f40164o = Collections.singletonList(c9906jd1.f35295b);
                        c6623pX.f40153d = c9906jd1.f35294a;
                        F91.m2512B(c6623pX, interfaceC8357Ub1Mo2005w);
                        interfaceC8357Ub1Arr[i] = interfaceC8357Ub1Mo2005w;
                        i++;
                    }
                }
            default:
                ym0.m9266a();
                ym0.m9267b();
                InterfaceC8357Ub1 interfaceC8357Ub1Mo2005w2 = interfaceC1538YR.mo2005w(ym0.f14272e, 5);
                this.f46805g = interfaceC8357Ub1Mo2005w2;
                C6623pX c6623pX2 = new C6623pX();
                ym0.m9267b();
                c6623pX2.f40150a = (String) ym0.f14269b;
                c6623pX2.f40161l = AbstractC8544Xr0.m9171n("application/id3");
                F91.m2512B(c6623pX2, interfaceC8357Ub1Mo2005w2);
                break;
        }
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: e */
    public final void mo9105e(boolean z) {
        int i;
        switch (this.f46799a) {
            case 0:
                if (this.f46800b) {
                    YN1.m9281f(this.f46801c != -9223372036854775807L);
                    for (InterfaceC8357Ub1 interfaceC8357Ub1 : (InterfaceC8357Ub1[]) this.f46805g) {
                        interfaceC8357Ub1.mo960a(this.f46801c, 1, this.f46803e, 0, null);
                    }
                    this.f46800b = false;
                    break;
                }
                break;
            default:
                YN1.m9283h((InterfaceC8357Ub1) this.f46805g);
                if (this.f46800b && (i = this.f46802d) != 0 && this.f46803e == i) {
                    YN1.m9281f(this.f46801c != -9223372036854775807L);
                    ((InterfaceC8357Ub1) this.f46805g).mo960a(this.f46801c, 1, this.f46802d, 0, null);
                    this.f46800b = false;
                    break;
                }
                break;
        }
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: f */
    public final void mo9106f(int i, long j) {
        switch (this.f46799a) {
            case 0:
                if ((i & 4) != 0) {
                    this.f46800b = true;
                    this.f46801c = j;
                    this.f46803e = 0;
                    this.f46802d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.f46800b = true;
                    this.f46801c = j;
                    this.f46802d = 0;
                    this.f46803e = 0;
                    break;
                }
                break;
        }
    }

    public C7259zM() {
        this.f46799a = 1;
        this.f46804f = new C9591hA0(10);
        this.f46801c = -9223372036854775807L;
    }
}
