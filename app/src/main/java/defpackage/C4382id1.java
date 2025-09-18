package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: id1 */
/* loaded from: classes.dex */
public final class C4382id1 implements WR {
    public final int a;
    public final int b;
    public final List c;
    public final C4103hA0 d;
    public final SparseIntArray e;
    public final C1204Pf f;
    public final InterfaceC2453c61 g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final C3930gG0 k;
    public QV l;
    public YR m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public InterfaceC5540kd1 r;
    public int s;
    public int t;

    public C4382id1(int i, int i2, InterfaceC2453c61 interfaceC2453c61, C0724Ja1 c0724Ja1, C1204Pf c1204Pf) {
        this.f = c1204Pf;
        this.a = i;
        this.b = i2;
        this.g = interfaceC2453c61;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(c0724Ja1);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(c0724Ja1);
        }
        this.d = new C4103hA0(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new C3930gG0(1);
        this.m = YR.u0;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (InterfaceC5540kd1) sparseArray2.valueAt(i3));
        }
        C0999Mo1 c0999Mo1 = new C0999Mo1();
        c0999Mo1.b = this;
        c0999Mo1.a = new C0848Kq(new byte[4], 4);
        sparseArray.put(0, new C5712lX0(c0999Mo1));
        this.r = null;
    }

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // defpackage.WR
    public final int d(XR xr, SV sv) throws C5643lA0, EOFException, InterruptedIOException {
        ?? r2;
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        long j2;
        long j3;
        long j4 = ((C7566vF) xr).c;
        int i5 = this.a;
        byte b = i5 == 2;
        if (this.o) {
            C3930gG0 c3930gG0 = this.k;
            if (j4 != -1 && b != true && !c3930gG0.d) {
                int i6 = this.t;
                if (i6 <= 0) {
                    c3930gG0.a((C7566vF) xr);
                    return 0;
                }
                boolean z = c3930gG0.f;
                C4103hA0 c4103hA0 = c3930gG0.c;
                if (!z) {
                    C7566vF c7566vF = (C7566vF) xr;
                    long j5 = c7566vF.c;
                    int iMin = (int) Math.min(112800, j5);
                    long j6 = j5 - iMin;
                    if (c7566vF.d == j6) {
                        c4103hA0.D(iMin);
                        c7566vF.f = 0;
                        c7566vF.f(c4103hA0.a, 0, iMin, false);
                        int i7 = c4103hA0.b;
                        int i8 = c4103hA0.c;
                        int i9 = i8 - 188;
                        while (true) {
                            if (i9 < i7) {
                                j3 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = c4103hA0.a;
                            int i10 = -4;
                            int i11 = 0;
                            while (true) {
                                if (i10 > 4) {
                                    break;
                                }
                                int i12 = (i10 * 188) + i9;
                                if (i12 < i7 || i12 >= i8 || bArr[i12] != 71) {
                                    i11 = 0;
                                } else {
                                    i11++;
                                    if (i11 == 5) {
                                        long jD = WY1.d(c4103hA0, i9, i6);
                                        if (jD != -9223372036854775807L) {
                                            j3 = jD;
                                            break;
                                        }
                                    }
                                }
                                i10++;
                            }
                            i9--;
                        }
                        c3930gG0.h = j3;
                        c3930gG0.f = true;
                        return 0;
                    }
                    sv.a = j6;
                } else {
                    if (c3930gG0.h == -9223372036854775807L) {
                        c3930gG0.a((C7566vF) xr);
                        return 0;
                    }
                    if (c3930gG0.e) {
                        long j7 = c3930gG0.g;
                        if (j7 == -9223372036854775807L) {
                            c3930gG0.a((C7566vF) xr);
                            return 0;
                        }
                        C0724Ja1 c0724Ja1 = c3930gG0.b;
                        c3930gG0.i = c0724Ja1.c(c3930gG0.h) - c0724Ja1.b(j7);
                        c3930gG0.a((C7566vF) xr);
                        return 0;
                    }
                    C7566vF c7566vF2 = (C7566vF) xr;
                    int iMin2 = (int) Math.min(112800, c7566vF2.c);
                    long j8 = 0;
                    if (c7566vF2.d == j8) {
                        c4103hA0.D(iMin2);
                        c7566vF2.f = 0;
                        c7566vF2.f(c4103hA0.a, 0, iMin2, false);
                        int i13 = c4103hA0.b;
                        int i14 = c4103hA0.c;
                        while (true) {
                            if (i13 >= i14) {
                                j2 = -9223372036854775807L;
                                break;
                            }
                            if (c4103hA0.a[i13] == 71) {
                                long jD2 = WY1.d(c4103hA0, i13, i6);
                                if (jD2 != -9223372036854775807L) {
                                    j2 = jD2;
                                    break;
                                }
                            }
                            i13++;
                        }
                        c3930gG0.g = j2;
                        c3930gG0.e = true;
                        return 0;
                    }
                    sv.a = j8;
                }
                return 1;
            }
            if (this.p) {
                i = i5;
                j = j4;
            } else {
                this.p = true;
                long j9 = c3930gG0.i;
                if (j9 != -9223372036854775807L) {
                    i = i5;
                    j = j4;
                    QV qv = new QV(new C0240Cv0(8), new VY(this.t, c3930gG0.b), j9, j9 + 1, 0L, j4, 188L, 940);
                    this.l = qv;
                    this.m.x(qv.a);
                } else {
                    i = i5;
                    j = j4;
                    this.m.x(new C4004gf(j9));
                }
            }
            if (this.q) {
                this.q = false;
                g(0L, 0L);
                if (((C7566vF) xr).d != 0) {
                    sv.a = 0L;
                    return 1;
                }
            }
            r2 = 1;
            r2 = 1;
            QV qv2 = this.l;
            if (qv2 != null && qv2.c != null) {
                return qv2.b((C7566vF) xr, sv);
            }
        } else {
            r2 = 1;
            i = i5;
            j = j4;
        }
        C4103hA0 c4103hA02 = this.d;
        byte[] bArr2 = c4103hA02.a;
        if (9400 - c4103hA02.b < 188) {
            int iA = c4103hA02.a();
            if (iA > 0) {
                System.arraycopy(bArr2, c4103hA02.b, bArr2, 0, iA);
            }
            c4103hA02.E(iA, bArr2);
        }
        while (true) {
            int iA2 = c4103hA02.a();
            SparseArray sparseArray = this.h;
            if (iA2 >= 188) {
                int i15 = c4103hA02.b;
                int i16 = c4103hA02.c;
                byte[] bArr3 = c4103hA02.a;
                int i17 = i15;
                while (i17 < i16 && bArr3[i17] != 71) {
                    i17++;
                }
                c4103hA02.G(i17);
                int i18 = i17 + 188;
                if (i18 > i16) {
                    int i19 = (i17 - i15) + this.s;
                    this.s = i19;
                    i2 = i;
                    i3 = 2;
                    if (i2 == 2 && i19 > 376) {
                        throw C5643lA0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                    i4 = 0;
                } else {
                    i2 = i;
                    i3 = 2;
                    i4 = 0;
                    this.s = 0;
                }
                int i20 = c4103hA02.c;
                if (i18 > i20) {
                    return i4;
                }
                int iG = c4103hA02.g();
                if ((8388608 & iG) != 0) {
                    c4103hA02.G(i18);
                    return i4;
                }
                int i21 = (4194304 & iG) != 0 ? r2 : 0;
                int i22 = (2096896 & iG) >> 8;
                boolean z2 = (iG & 32) != 0 ? r2 : false;
                InterfaceC5540kd1 interfaceC5540kd1 = (iG & 16) != 0 ? (InterfaceC5540kd1) sparseArray.get(i22) : null;
                if (interfaceC5540kd1 == null) {
                    c4103hA02.G(i18);
                    return 0;
                }
                if (i2 != i3) {
                    int i23 = iG & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i24 = sparseIntArray.get(i22, i23 - 1);
                    sparseIntArray.put(i22, i23);
                    if (i24 == i23) {
                        c4103hA02.G(i18);
                        return 0;
                    }
                    if (i23 != ((i24 + r2) & 15)) {
                        interfaceC5540kd1.c();
                    }
                }
                if (z2) {
                    int iU = c4103hA02.u();
                    i21 |= (c4103hA02.u() & 64) != 0 ? i3 : 0;
                    c4103hA02.H(iU - r2);
                }
                boolean z3 = this.o;
                if (i2 == i3 || z3 || !this.j.get(i22, false)) {
                    c4103hA02.F(i18);
                    interfaceC5540kd1.a(i21, c4103hA02);
                    c4103hA02.F(i20);
                }
                if (i2 != i3 && !z3 && this.o && j != -1) {
                    this.q = r2;
                }
                c4103hA02.G(i18);
                return 0;
            }
            int i25 = c4103hA02.c;
            int iR = ((C7566vF) xr).r(bArr2, i25, 9400 - i25);
            if (iR == -1) {
                for (int i26 = 0; i26 < sparseArray.size(); i26++) {
                    InterfaceC5540kd1 interfaceC5540kd12 = (InterfaceC5540kd1) sparseArray.valueAt(i26);
                    if (interfaceC5540kd12 instanceof WA0) {
                        WA0 wa0 = (WA0) interfaceC5540kd12;
                        if (wa0.c == 3 && wa0.j == -1 && (b == false || !(wa0.a instanceof C5617l20))) {
                            wa0.a(r2, new C4103hA0());
                        }
                    }
                }
                return -1;
            }
            c4103hA02.F(i25 + iR);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // defpackage.WR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(defpackage.XR r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            hA0 r0 = r6.d
            byte[] r0 = r0.a
            vF r7 = (defpackage.C7566vF) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.f(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.n(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4382id1.f(XR):boolean");
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        QV qv;
        YN1.f(this.a != 2);
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0724Ja1 c0724Ja1 = (C0724Ja1) list.get(i);
            boolean z = c0724Ja1.e() == -9223372036854775807L;
            if (!z) {
                long jD = c0724Ja1.d();
                z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
            }
            if (z) {
                c0724Ja1.g(j2);
            }
        }
        if (j2 != 0 && (qv = this.l) != null) {
            qv.d(j2);
        }
        this.d.D(0);
        this.e.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i2 >= sparseArray.size()) {
                this.s = 0;
                return;
            } else {
                ((InterfaceC5540kd1) sparseArray.valueAt(i2)).c();
                i2++;
            }
        }
    }

    @Override // defpackage.WR
    public final List h() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        if ((this.b & 1) == 0) {
            yr = new C5772lr0(yr, this.g);
        }
        this.m = yr;
    }

    @Override // defpackage.WR
    public final void release() {
    }
}
