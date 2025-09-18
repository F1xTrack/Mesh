package p000;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import kotlin.KotlinVersion;

/* renamed from: iG0 */
/* loaded from: classes.dex */
public final class C9731iG0 implements InterfaceC1412WR {

    /* renamed from: e */
    public boolean f29007e;

    /* renamed from: f */
    public boolean f29008f;

    /* renamed from: g */
    public boolean f29009g;

    /* renamed from: h */
    public long f29010h;

    /* renamed from: i */
    public C1039QV f29011i;

    /* renamed from: j */
    public InterfaceC1538YR f29012j;

    /* renamed from: k */
    public boolean f29013k;

    /* renamed from: a */
    public final C7783Ja1 f29003a = new C7783Ja1(0);

    /* renamed from: c */
    public final C9591hA0 f29005c = new C9591hA0(4096);

    /* renamed from: b */
    public final SparseArray f29004b = new SparseArray();

    /* renamed from: d */
    public final C9475gG0 f29006d = new C9475gG0(0);

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    public final int mo738d(InterfaceC1475XR interfaceC1475XR, C1164SV c1164sv) throws EOFException, InterruptedIOException {
        int i;
        long j;
        InterfaceC6548oN c10085l20;
        long jM18416c;
        long jM18416c2;
        YN1.m9283h(this.f29012j);
        long j2 = ((C7000vF) interfaceC1475XR).f44294c;
        int i2 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
        int i3 = 1;
        C9475gG0 c9475gG0 = this.f29006d;
        if (i2 != 0 && !c9475gG0.f27652d) {
            boolean z = c9475gG0.f27654f;
            C9591hA0 c9591hA0 = c9475gG0.f27651c;
            if (!z) {
                C7000vF c7000vF = (C7000vF) interfaceC1475XR;
                long j3 = c7000vF.f44294c;
                int iMin = (int) Math.min(20000L, j3);
                long j4 = j3 - iMin;
                if (c7000vF.f44295d != j4) {
                    c1164sv.f10814a = j4;
                } else {
                    c9591hA0.m18738D(iMin);
                    c7000vF.f44297f = 0;
                    c7000vF.mo3620f(c9591hA0.f28293a, 0, iMin, false);
                    int i4 = c9591hA0.f28294b;
                    int i5 = c9591hA0.f28295c - 4;
                    while (true) {
                        if (i5 < i4) {
                            jM18416c2 = -9223372036854775807L;
                            break;
                        }
                        if (C9475gG0.m18415b(i5, c9591hA0.f28293a) == 442) {
                            c9591hA0.m18741G(i5 + 4);
                            jM18416c2 = C9475gG0.m18416c(c9591hA0);
                            if (jM18416c2 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i5--;
                    }
                    c9475gG0.f27656h = jM18416c2;
                    c9475gG0.f27654f = true;
                    i3 = 0;
                }
            } else {
                if (c9475gG0.f27656h == -9223372036854775807L) {
                    c9475gG0.m18417a((C7000vF) interfaceC1475XR);
                    return 0;
                }
                if (c9475gG0.f27653e) {
                    long j5 = c9475gG0.f27655g;
                    if (j5 == -9223372036854775807L) {
                        c9475gG0.m18417a((C7000vF) interfaceC1475XR);
                        return 0;
                    }
                    C7783Ja1 c7783Ja1 = c9475gG0.f27650b;
                    c9475gG0.f27657i = c7783Ja1.m4352c(c9475gG0.f27656h) - c7783Ja1.m4351b(j5);
                    c9475gG0.m18417a((C7000vF) interfaceC1475XR);
                    return 0;
                }
                C7000vF c7000vF2 = (C7000vF) interfaceC1475XR;
                int iMin2 = (int) Math.min(20000L, c7000vF2.f44294c);
                long j6 = 0;
                if (c7000vF2.f44295d != j6) {
                    c1164sv.f10814a = j6;
                } else {
                    c9591hA0.m18738D(iMin2);
                    c7000vF2.f44297f = 0;
                    c7000vF2.mo3620f(c9591hA0.f28293a, 0, iMin2, false);
                    int i6 = c9591hA0.f28294b;
                    int i7 = c9591hA0.f28295c;
                    while (true) {
                        if (i6 >= i7 - 3) {
                            jM18416c = -9223372036854775807L;
                            break;
                        }
                        if (C9475gG0.m18415b(i6, c9591hA0.f28293a) == 442) {
                            c9591hA0.m18741G(i6 + 4);
                            jM18416c = C9475gG0.m18416c(c9591hA0);
                            if (jM18416c != -9223372036854775807L) {
                                break;
                            }
                        }
                        i6++;
                    }
                    c9475gG0.f27655g = jM18416c;
                    c9475gG0.f27653e = true;
                    i3 = 0;
                }
            }
            return i3;
        }
        if (this.f29013k) {
            i = i2;
            j = j2;
        } else {
            this.f29013k = true;
            long j7 = c9475gG0.f27657i;
            if (j7 != -9223372036854775807L) {
                i = i2;
                j = j2;
                C1039QV c1039qv = new C1039QV(new C7460Cv0(8), new CC0(c9475gG0.f27650b), j7, j7 + 1, 0L, j2, 188L, 1000);
                this.f29011i = c1039qv;
                this.f29012j.mo2006x(c1039qv.f9646a);
            } else {
                i = i2;
                j = j2;
                this.f29012j.mo2006x(new C4130gf(j7));
            }
        }
        C1039QV c1039qv2 = this.f29011i;
        if (c1039qv2 != null && c1039qv2.f9648c != null) {
            return c1039qv2.m6725b((C7000vF) interfaceC1475XR, c1164sv);
        }
        C7000vF c7000vF3 = (C7000vF) interfaceC1475XR;
        c7000vF3.f44297f = 0;
        long jMo3624j = i != 0 ? j - c7000vF3.mo3624j() : -1L;
        if (jMo3624j != -1 && jMo3624j < 4) {
            return -1;
        }
        C9591hA0 c9591hA02 = this.f29005c;
        if (!c7000vF3.mo3620f(c9591hA02.f28293a, 0, 4, true)) {
            return -1;
        }
        c9591hA02.m18741G(0);
        int iM18749g = c9591hA02.m18749g();
        if (iM18749g == 441) {
            return -1;
        }
        if (iM18749g == 442) {
            c7000vF3.mo3620f(c9591hA02.f28293a, 0, 10, false);
            c9591hA02.m18741G(9);
            c7000vF3.mo3627n((c9591hA02.m18763u() & 7) + 14);
            return 0;
        }
        if (iM18749g == 443) {
            c7000vF3.mo3620f(c9591hA02.f28293a, 0, 2, false);
            c9591hA02.m18741G(0);
            c7000vF3.mo3627n(c9591hA02.m18735A() + 6);
            return 0;
        }
        if (((iM18749g & (-256)) >> 8) != 1) {
            c7000vF3.mo3627n(1);
            return 0;
        }
        int i8 = iM18749g & KotlinVersion.MAX_COMPONENT_VALUE;
        SparseArray sparseArray = this.f29004b;
        C9603hG0 c9603hG0 = (C9603hG0) sparseArray.get(i8);
        if (!this.f29007e) {
            if (c9603hG0 == null) {
                if (i8 == 189) {
                    c10085l20 = new C6986v1();
                    this.f29008f = true;
                    this.f29010h = c7000vF3.f44295d;
                } else if ((iM18749g & 224) == 192) {
                    c10085l20 = new C9041ct0(null, 0);
                    this.f29008f = true;
                    this.f29010h = c7000vF3.f44295d;
                } else if ((iM18749g & 240) == 224) {
                    c10085l20 = new C10085l20(null);
                    this.f29009g = true;
                    this.f29010h = c7000vF3.f44295d;
                } else {
                    c10085l20 = null;
                }
                if (c10085l20 != null) {
                    c10085l20.mo9104d(this.f29012j, new YM0(i8, 256));
                    c9603hG0 = new C9603hG0(c10085l20, this.f29003a);
                    sparseArray.put(i8, c9603hG0);
                }
            }
            if (c7000vF3.f44295d > ((this.f29008f && this.f29009g) ? this.f29010h + 8192 : 1048576L)) {
                this.f29007e = true;
                this.f29012j.mo2003p();
            }
        }
        c7000vF3.mo3620f(c9591hA02.f28293a, 0, 2, false);
        c9591hA02.m18741G(0);
        int iM18735A = c9591hA02.m18735A() + 6;
        if (c9603hG0 == null) {
            c7000vF3.mo3627n(iM18735A);
        } else {
            c9591hA02.m18738D(iM18735A);
            c7000vF3.mo3618b(c9591hA02.f28293a, 0, iM18735A, false);
            c9591hA02.m18741G(6);
            C0683Kq c0683Kq = c9603hG0.f28360c;
            c9591hA02.m18747e(c0683Kq.f6325b, 0, 3);
            c0683Kq.m4760t(0);
            c0683Kq.m4763w(8);
            c9603hG0.f28361d = c0683Kq.m4751k();
            c9603hG0.f28362e = c0683Kq.m4751k();
            c0683Kq.m4763w(6);
            c9591hA02.m18747e(c0683Kq.f6325b, 0, c0683Kq.m4752l(8));
            c0683Kq.m4760t(0);
            c9603hG0.f28364g = 0L;
            if (c9603hG0.f28361d) {
                c0683Kq.m4763w(4);
                c0683Kq.m4763w(1);
                c0683Kq.m4763w(1);
                long jM4752l = (c0683Kq.m4752l(3) << 30) | (c0683Kq.m4752l(15) << 15) | c0683Kq.m4752l(15);
                c0683Kq.m4763w(1);
                boolean z2 = c9603hG0.f28363f;
                C7783Ja1 c7783Ja12 = c9603hG0.f28359b;
                if (!z2 && c9603hG0.f28362e) {
                    c0683Kq.m4763w(4);
                    c0683Kq.m4763w(1);
                    c0683Kq.m4763w(1);
                    c0683Kq.m4763w(1);
                    c7783Ja12.m4351b((c0683Kq.m4752l(3) << 30) | (c0683Kq.m4752l(15) << 15) | c0683Kq.m4752l(15));
                    c9603hG0.f28363f = true;
                }
                c9603hG0.f28364g = c7783Ja12.m4351b(jM4752l);
            }
            long j8 = c9603hG0.f28364g;
            InterfaceC6548oN interfaceC6548oN = c9603hG0.f28358a;
            interfaceC6548oN.mo9106f(4, j8);
            interfaceC6548oN.mo9102b(c9591hA02);
            interfaceC6548oN.mo9105e(false);
            c9591hA02.m18740F(c9591hA02.f28293a.length);
        }
        return 0;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C7000vF c7000vF = (C7000vF) interfaceC1475XR;
        c7000vF.mo3620f(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c7000vF.m25375a(bArr[13] & 7, false);
        c7000vF.mo3620f(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        C7783Ja1 c7783Ja1 = this.f29003a;
        boolean z = c7783Ja1.m4354e() == -9223372036854775807L;
        if (!z) {
            long jM4353d = c7783Ja1.m4353d();
            z = (jM4353d == -9223372036854775807L || jM4353d == 0 || jM4353d == j2) ? false : true;
        }
        if (z) {
            c7783Ja1.m4356g(j2);
        }
        C1039QV c1039qv = this.f29011i;
        if (c1039qv != null) {
            c1039qv.m6726d(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f29004b;
            if (i >= sparseArray.size()) {
                return;
            }
            C9603hG0 c9603hG0 = (C9603hG0) sparseArray.valueAt(i);
            c9603hG0.f28363f = false;
            c9603hG0.f28358a.mo9103c();
            i++;
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: h */
    public final List mo741h() {
        N70 n70 = P70.f8867b;
        return C9367fQ0.f27184e;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: l */
    public final void mo742l(InterfaceC1538YR interfaceC1538YR) {
        this.f29012j = interfaceC1538YR;
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
    }
}
