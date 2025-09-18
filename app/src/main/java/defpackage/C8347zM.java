package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: zM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8347zM implements InterfaceC6254oN {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public C8347zM(List list) {
        this.a = 0;
        this.f = list;
        this.g = new InterfaceC1584Ub1[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC6254oN
    public final void b(C4103hA0 c4103hA0) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (c4103hA0.a() == 0) {
                            z2 = false;
                        } else {
                            if (c4103hA0.u() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (c4103hA0.a() == 0) {
                            z = false;
                        } else {
                            if (c4103hA0.u() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = c4103hA0.b;
                    int iA = c4103hA0.a();
                    for (InterfaceC1584Ub1 interfaceC1584Ub1 : (InterfaceC1584Ub1[]) this.g) {
                        c4103hA0.G(i);
                        interfaceC1584Ub1.d(iA, c4103hA0);
                    }
                    this.e += iA;
                    break;
                }
                break;
            default:
                YN1.h((InterfaceC1584Ub1) this.g);
                if (this.b) {
                    int iA2 = c4103hA0.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iA2, 10 - i2);
                        byte[] bArr = c4103hA0.a;
                        int i3 = c4103hA0.b;
                        C4103hA0 c4103hA02 = (C4103hA0) this.f;
                        System.arraycopy(bArr, i3, c4103hA02.a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            c4103hA02.G(0);
                            if (73 != c4103hA02.u() || 68 != c4103hA02.u() || 51 != c4103hA02.u()) {
                                AbstractC6789rA1.h("Discarding invalid ID3 tag");
                                this.b = false;
                                break;
                            } else {
                                c4103hA02.H(3);
                                this.d = c4103hA02.t() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.d - this.e);
                    ((InterfaceC1584Ub1) this.g).d(iMin2, c4103hA0);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC6254oN
    public final void c() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.InterfaceC6254oN
    public final void d(YR yr, YM0 ym0) {
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    InterfaceC1584Ub1[] interfaceC1584Ub1Arr = (InterfaceC1584Ub1[]) this.g;
                    if (i >= interfaceC1584Ub1Arr.length) {
                        break;
                    } else {
                        C5349jd1 c5349jd1 = (C5349jd1) ((List) this.f).get(i);
                        ym0.a();
                        ym0.b();
                        InterfaceC1584Ub1 interfaceC1584Ub1W = yr.w(ym0.e, 3);
                        C6475pX c6475pX = new C6475pX();
                        ym0.b();
                        c6475pX.a = (String) ym0.b;
                        c6475pX.l = AbstractC1865Xr0.n("application/dvbsubs");
                        c6475pX.o = Collections.singletonList(c5349jd1.b);
                        c6475pX.d = c5349jd1.a;
                        F91.B(c6475pX, interfaceC1584Ub1W);
                        interfaceC1584Ub1Arr[i] = interfaceC1584Ub1W;
                        i++;
                    }
                }
            default:
                ym0.a();
                ym0.b();
                InterfaceC1584Ub1 interfaceC1584Ub1W2 = yr.w(ym0.e, 5);
                this.g = interfaceC1584Ub1W2;
                C6475pX c6475pX2 = new C6475pX();
                ym0.b();
                c6475pX2.a = (String) ym0.b;
                c6475pX2.l = AbstractC1865Xr0.n("application/id3");
                F91.B(c6475pX2, interfaceC1584Ub1W2);
                break;
        }
    }

    @Override // defpackage.InterfaceC6254oN
    public final void e(boolean z) {
        int i;
        switch (this.a) {
            case 0:
                if (this.b) {
                    YN1.f(this.c != -9223372036854775807L);
                    for (InterfaceC1584Ub1 interfaceC1584Ub1 : (InterfaceC1584Ub1[]) this.g) {
                        interfaceC1584Ub1.a(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                YN1.h((InterfaceC1584Ub1) this.g);
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    YN1.f(this.c != -9223372036854775807L);
                    ((InterfaceC1584Ub1) this.g).a(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC6254oN
    public final void f(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    public C8347zM() {
        this.a = 1;
        this.f = new C4103hA0(10);
        this.c = -9223372036854775807L;
    }
}
