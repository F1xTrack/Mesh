package defpackage;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import kotlin.KotlinVersion;

/* renamed from: iG0 */
/* loaded from: classes.dex */
public final class C4312iG0 implements WR {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public QV i;
    public YR j;
    public boolean k;
    public final C0724Ja1 a = new C0724Ja1(0);
    public final C4103hA0 c = new C4103hA0(4096);
    public final SparseArray b = new SparseArray();
    public final C3930gG0 d = new C3930gG0(0);

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    @Override // defpackage.WR
    public final int d(XR xr, SV sv) throws EOFException, InterruptedIOException {
        int i;
        long j;
        InterfaceC6254oN c5617l20;
        long jC;
        long jC2;
        YN1.h(this.j);
        long j2 = ((C7566vF) xr).c;
        int i2 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
        int i3 = 1;
        C3930gG0 c3930gG0 = this.d;
        if (i2 != 0 && !c3930gG0.d) {
            boolean z = c3930gG0.f;
            C4103hA0 c4103hA0 = c3930gG0.c;
            if (!z) {
                C7566vF c7566vF = (C7566vF) xr;
                long j3 = c7566vF.c;
                int iMin = (int) Math.min(20000L, j3);
                long j4 = j3 - iMin;
                if (c7566vF.d != j4) {
                    sv.a = j4;
                } else {
                    c4103hA0.D(iMin);
                    c7566vF.f = 0;
                    c7566vF.f(c4103hA0.a, 0, iMin, false);
                    int i4 = c4103hA0.b;
                    int i5 = c4103hA0.c - 4;
                    while (true) {
                        if (i5 < i4) {
                            jC2 = -9223372036854775807L;
                            break;
                        }
                        if (C3930gG0.b(i5, c4103hA0.a) == 442) {
                            c4103hA0.G(i5 + 4);
                            jC2 = C3930gG0.c(c4103hA0);
                            if (jC2 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i5--;
                    }
                    c3930gG0.h = jC2;
                    c3930gG0.f = true;
                    i3 = 0;
                }
            } else {
                if (c3930gG0.h == -9223372036854775807L) {
                    c3930gG0.a((C7566vF) xr);
                    return 0;
                }
                if (c3930gG0.e) {
                    long j5 = c3930gG0.g;
                    if (j5 == -9223372036854775807L) {
                        c3930gG0.a((C7566vF) xr);
                        return 0;
                    }
                    C0724Ja1 c0724Ja1 = c3930gG0.b;
                    c3930gG0.i = c0724Ja1.c(c3930gG0.h) - c0724Ja1.b(j5);
                    c3930gG0.a((C7566vF) xr);
                    return 0;
                }
                C7566vF c7566vF2 = (C7566vF) xr;
                int iMin2 = (int) Math.min(20000L, c7566vF2.c);
                long j6 = 0;
                if (c7566vF2.d != j6) {
                    sv.a = j6;
                } else {
                    c4103hA0.D(iMin2);
                    c7566vF2.f = 0;
                    c7566vF2.f(c4103hA0.a, 0, iMin2, false);
                    int i6 = c4103hA0.b;
                    int i7 = c4103hA0.c;
                    while (true) {
                        if (i6 >= i7 - 3) {
                            jC = -9223372036854775807L;
                            break;
                        }
                        if (C3930gG0.b(i6, c4103hA0.a) == 442) {
                            c4103hA0.G(i6 + 4);
                            jC = C3930gG0.c(c4103hA0);
                            if (jC != -9223372036854775807L) {
                                break;
                            }
                        }
                        i6++;
                    }
                    c3930gG0.g = jC;
                    c3930gG0.e = true;
                    i3 = 0;
                }
            }
            return i3;
        }
        if (this.k) {
            i = i2;
            j = j2;
        } else {
            this.k = true;
            long j7 = c3930gG0.i;
            if (j7 != -9223372036854775807L) {
                i = i2;
                j = j2;
                QV qv = new QV(new C0240Cv0(8), new CC0(c3930gG0.b), j7, j7 + 1, 0L, j2, 188L, 1000);
                this.i = qv;
                this.j.x(qv.a);
            } else {
                i = i2;
                j = j2;
                this.j.x(new C4004gf(j7));
            }
        }
        QV qv2 = this.i;
        if (qv2 != null && qv2.c != null) {
            return qv2.b((C7566vF) xr, sv);
        }
        C7566vF c7566vF3 = (C7566vF) xr;
        c7566vF3.f = 0;
        long j8 = i != 0 ? j - c7566vF3.j() : -1L;
        if (j8 != -1 && j8 < 4) {
            return -1;
        }
        C4103hA0 c4103hA02 = this.c;
        if (!c7566vF3.f(c4103hA02.a, 0, 4, true)) {
            return -1;
        }
        c4103hA02.G(0);
        int iG = c4103hA02.g();
        if (iG == 441) {
            return -1;
        }
        if (iG == 442) {
            c7566vF3.f(c4103hA02.a, 0, 10, false);
            c4103hA02.G(9);
            c7566vF3.n((c4103hA02.u() & 7) + 14);
            return 0;
        }
        if (iG == 443) {
            c7566vF3.f(c4103hA02.a, 0, 2, false);
            c4103hA02.G(0);
            c7566vF3.n(c4103hA02.A() + 6);
            return 0;
        }
        if (((iG & (-256)) >> 8) != 1) {
            c7566vF3.n(1);
            return 0;
        }
        int i8 = iG & KotlinVersion.MAX_COMPONENT_VALUE;
        SparseArray sparseArray = this.b;
        C4121hG0 c4121hG0 = (C4121hG0) sparseArray.get(i8);
        if (!this.e) {
            if (c4121hG0 == null) {
                if (i8 == 189) {
                    c5617l20 = new C7521v1();
                    this.f = true;
                    this.h = c7566vF3.d;
                } else if ((iG & 224) == 192) {
                    c5617l20 = new C3284ct0(null, 0);
                    this.f = true;
                    this.h = c7566vF3.d;
                } else if ((iG & 240) == 224) {
                    c5617l20 = new C5617l20(null);
                    this.g = true;
                    this.h = c7566vF3.d;
                } else {
                    c5617l20 = null;
                }
                if (c5617l20 != null) {
                    c5617l20.d(this.j, new YM0(i8, 256));
                    c4121hG0 = new C4121hG0(c5617l20, this.a);
                    sparseArray.put(i8, c4121hG0);
                }
            }
            if (c7566vF3.d > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.p();
            }
        }
        c7566vF3.f(c4103hA02.a, 0, 2, false);
        c4103hA02.G(0);
        int iA = c4103hA02.A() + 6;
        if (c4121hG0 == null) {
            c7566vF3.n(iA);
        } else {
            c4103hA02.D(iA);
            c7566vF3.b(c4103hA02.a, 0, iA, false);
            c4103hA02.G(6);
            C0848Kq c0848Kq = c4121hG0.c;
            c4103hA02.e(c0848Kq.b, 0, 3);
            c0848Kq.t(0);
            c0848Kq.w(8);
            c4121hG0.d = c0848Kq.k();
            c4121hG0.e = c0848Kq.k();
            c0848Kq.w(6);
            c4103hA02.e(c0848Kq.b, 0, c0848Kq.l(8));
            c0848Kq.t(0);
            c4121hG0.g = 0L;
            if (c4121hG0.d) {
                c0848Kq.w(4);
                c0848Kq.w(1);
                c0848Kq.w(1);
                long jL = (c0848Kq.l(3) << 30) | (c0848Kq.l(15) << 15) | c0848Kq.l(15);
                c0848Kq.w(1);
                boolean z2 = c4121hG0.f;
                C0724Ja1 c0724Ja12 = c4121hG0.b;
                if (!z2 && c4121hG0.e) {
                    c0848Kq.w(4);
                    c0848Kq.w(1);
                    c0848Kq.w(1);
                    c0848Kq.w(1);
                    c0724Ja12.b((c0848Kq.l(3) << 30) | (c0848Kq.l(15) << 15) | c0848Kq.l(15));
                    c4121hG0.f = true;
                }
                c4121hG0.g = c0724Ja12.b(jL);
            }
            long j9 = c4121hG0.g;
            InterfaceC6254oN interfaceC6254oN = c4121hG0.a;
            interfaceC6254oN.f(4, j9);
            interfaceC6254oN.b(c4103hA02);
            interfaceC6254oN.e(false);
            c4103hA02.F(c4103hA02.a.length);
        }
        return 0;
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C7566vF c7566vF = (C7566vF) xr;
        c7566vF.f(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c7566vF.a(bArr[13] & 7, false);
        c7566vF.f(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        C0724Ja1 c0724Ja1 = this.a;
        boolean z = c0724Ja1.e() == -9223372036854775807L;
        if (!z) {
            long jD = c0724Ja1.d();
            z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
        }
        if (z) {
            c0724Ja1.g(j2);
        }
        QV qv = this.i;
        if (qv != null) {
            qv.d(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            C4121hG0 c4121hG0 = (C4121hG0) sparseArray.valueAt(i);
            c4121hG0.f = false;
            c4121hG0.a.c();
            i++;
        }
    }

    @Override // defpackage.WR
    public final List h() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        this.j = yr;
    }

    @Override // defpackage.WR
    public final void release() {
    }
}
