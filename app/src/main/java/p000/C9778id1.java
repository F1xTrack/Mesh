package p000;

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
public final class C9778id1 implements InterfaceC1412WR {

    /* renamed from: a */
    public final int f29377a;

    /* renamed from: b */
    public final int f29378b;

    /* renamed from: c */
    public final List f29379c;

    /* renamed from: d */
    public final C9591hA0 f29380d;

    /* renamed from: e */
    public final SparseIntArray f29381e;

    /* renamed from: f */
    public final C0986Pf f29382f;

    /* renamed from: g */
    public final InterfaceC8939c61 f29383g;

    /* renamed from: h */
    public final SparseArray f29384h;

    /* renamed from: i */
    public final SparseBooleanArray f29385i;

    /* renamed from: j */
    public final SparseBooleanArray f29386j;

    /* renamed from: k */
    public final C9475gG0 f29387k;

    /* renamed from: l */
    public C1039QV f29388l;

    /* renamed from: m */
    public InterfaceC1538YR f29389m;

    /* renamed from: n */
    public int f29390n;

    /* renamed from: o */
    public boolean f29391o;

    /* renamed from: p */
    public boolean f29392p;

    /* renamed from: q */
    public boolean f29393q;

    /* renamed from: r */
    public InterfaceC10034kd1 f29394r;

    /* renamed from: s */
    public int f29395s;

    /* renamed from: t */
    public int f29396t;

    public C9778id1(int i, int i2, InterfaceC8939c61 interfaceC8939c61, C7783Ja1 c7783Ja1, C0986Pf c0986Pf) {
        this.f29382f = c0986Pf;
        this.f29377a = i;
        this.f29378b = i2;
        this.f29383g = interfaceC8939c61;
        if (i == 1 || i == 2) {
            this.f29379c = Collections.singletonList(c7783Ja1);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f29379c = arrayList;
            arrayList.add(c7783Ja1);
        }
        this.f29380d = new C9591hA0(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f29385i = sparseBooleanArray;
        this.f29386j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f29384h = sparseArray;
        this.f29381e = new SparseIntArray();
        this.f29387k = new C9475gG0(1);
        this.f29389m = InterfaceC1538YR.f14298u0;
        this.f29396t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (InterfaceC10034kd1) sparseArray2.valueAt(i3));
        }
        C7967Mo1 c7967Mo1 = new C7967Mo1();
        c7967Mo1.f7363b = this;
        c7967Mo1.f7362a = new C0683Kq(new byte[4], 4);
        sparseArray.put(0, new C10149lX0(c7967Mo1));
        this.f29394r = null;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    public final int mo738d(InterfaceC1475XR interfaceC1475XR, C1164SV c1164sv) throws C10103lA0, EOFException, InterruptedIOException {
        ?? r2;
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        long j2;
        long j3;
        long j4 = ((C7000vF) interfaceC1475XR).f44294c;
        int i5 = this.f29377a;
        byte b = i5 == 2;
        if (this.f29391o) {
            C9475gG0 c9475gG0 = this.f29387k;
            if (j4 != -1 && b != true && !c9475gG0.f27652d) {
                int i6 = this.f29396t;
                if (i6 <= 0) {
                    c9475gG0.m18417a((C7000vF) interfaceC1475XR);
                    return 0;
                }
                boolean z = c9475gG0.f27654f;
                C9591hA0 c9591hA0 = c9475gG0.f27651c;
                if (!z) {
                    C7000vF c7000vF = (C7000vF) interfaceC1475XR;
                    long j5 = c7000vF.f44294c;
                    int iMin = (int) Math.min(112800, j5);
                    long j6 = j5 - iMin;
                    if (c7000vF.f44295d == j6) {
                        c9591hA0.m18738D(iMin);
                        c7000vF.f44297f = 0;
                        c7000vF.mo3620f(c9591hA0.f28293a, 0, iMin, false);
                        int i7 = c9591hA0.f28294b;
                        int i8 = c9591hA0.f28295c;
                        int i9 = i8 - 188;
                        while (true) {
                            if (i9 < i7) {
                                j3 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = c9591hA0.f28293a;
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
                                        long jM8808d = WY1.m8808d(c9591hA0, i9, i6);
                                        if (jM8808d != -9223372036854775807L) {
                                            j3 = jM8808d;
                                            break;
                                        }
                                    }
                                }
                                i10++;
                            }
                            i9--;
                        }
                        c9475gG0.f27656h = j3;
                        c9475gG0.f27654f = true;
                        return 0;
                    }
                    c1164sv.f10814a = j6;
                } else {
                    if (c9475gG0.f27656h == -9223372036854775807L) {
                        c9475gG0.m18417a((C7000vF) interfaceC1475XR);
                        return 0;
                    }
                    if (c9475gG0.f27653e) {
                        long j7 = c9475gG0.f27655g;
                        if (j7 == -9223372036854775807L) {
                            c9475gG0.m18417a((C7000vF) interfaceC1475XR);
                            return 0;
                        }
                        C7783Ja1 c7783Ja1 = c9475gG0.f27650b;
                        c9475gG0.f27657i = c7783Ja1.m4352c(c9475gG0.f27656h) - c7783Ja1.m4351b(j7);
                        c9475gG0.m18417a((C7000vF) interfaceC1475XR);
                        return 0;
                    }
                    C7000vF c7000vF2 = (C7000vF) interfaceC1475XR;
                    int iMin2 = (int) Math.min(112800, c7000vF2.f44294c);
                    long j8 = 0;
                    if (c7000vF2.f44295d == j8) {
                        c9591hA0.m18738D(iMin2);
                        c7000vF2.f44297f = 0;
                        c7000vF2.mo3620f(c9591hA0.f28293a, 0, iMin2, false);
                        int i13 = c9591hA0.f28294b;
                        int i14 = c9591hA0.f28295c;
                        while (true) {
                            if (i13 >= i14) {
                                j2 = -9223372036854775807L;
                                break;
                            }
                            if (c9591hA0.f28293a[i13] == 71) {
                                long jM8808d2 = WY1.m8808d(c9591hA0, i13, i6);
                                if (jM8808d2 != -9223372036854775807L) {
                                    j2 = jM8808d2;
                                    break;
                                }
                            }
                            i13++;
                        }
                        c9475gG0.f27655g = j2;
                        c9475gG0.f27653e = true;
                        return 0;
                    }
                    c1164sv.f10814a = j8;
                }
                return 1;
            }
            if (this.f29392p) {
                i = i5;
                j = j4;
            } else {
                this.f29392p = true;
                long j9 = c9475gG0.f27657i;
                if (j9 != -9223372036854775807L) {
                    i = i5;
                    j = j4;
                    C1039QV c1039qv = new C1039QV(new C7460Cv0(8), new C1356VY(this.f29396t, c9475gG0.f27650b), j9, j9 + 1, 0L, j4, 188L, 940);
                    this.f29388l = c1039qv;
                    this.f29389m.mo2006x(c1039qv.f9646a);
                } else {
                    i = i5;
                    j = j4;
                    this.f29389m.mo2006x(new C4130gf(j9));
                }
            }
            if (this.f29393q) {
                this.f29393q = false;
                mo740g(0L, 0L);
                if (((C7000vF) interfaceC1475XR).f44295d != 0) {
                    c1164sv.f10814a = 0L;
                    return 1;
                }
            }
            r2 = 1;
            r2 = 1;
            C1039QV c1039qv2 = this.f29388l;
            if (c1039qv2 != null && c1039qv2.f9648c != null) {
                return c1039qv2.m6725b((C7000vF) interfaceC1475XR, c1164sv);
            }
        } else {
            r2 = 1;
            i = i5;
            j = j4;
        }
        C9591hA0 c9591hA02 = this.f29380d;
        byte[] bArr2 = c9591hA02.f28293a;
        if (9400 - c9591hA02.f28294b < 188) {
            int iM18743a = c9591hA02.m18743a();
            if (iM18743a > 0) {
                System.arraycopy(bArr2, c9591hA02.f28294b, bArr2, 0, iM18743a);
            }
            c9591hA02.m18739E(iM18743a, bArr2);
        }
        while (true) {
            int iM18743a2 = c9591hA02.m18743a();
            SparseArray sparseArray = this.f29384h;
            if (iM18743a2 >= 188) {
                int i15 = c9591hA02.f28294b;
                int i16 = c9591hA02.f28295c;
                byte[] bArr3 = c9591hA02.f28293a;
                int i17 = i15;
                while (i17 < i16 && bArr3[i17] != 71) {
                    i17++;
                }
                c9591hA02.m18741G(i17);
                int i18 = i17 + 188;
                if (i18 > i16) {
                    int i19 = (i17 - i15) + this.f29395s;
                    this.f29395s = i19;
                    i2 = i;
                    i3 = 2;
                    if (i2 == 2 && i19 > 376) {
                        throw C10103lA0.m22366a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                    i4 = 0;
                } else {
                    i2 = i;
                    i3 = 2;
                    i4 = 0;
                    this.f29395s = 0;
                }
                int i20 = c9591hA02.f28295c;
                if (i18 > i20) {
                    return i4;
                }
                int iM18749g = c9591hA02.m18749g();
                if ((8388608 & iM18749g) != 0) {
                    c9591hA02.m18741G(i18);
                    return i4;
                }
                int i21 = (4194304 & iM18749g) != 0 ? r2 : 0;
                int i22 = (2096896 & iM18749g) >> 8;
                boolean z2 = (iM18749g & 32) != 0 ? r2 : false;
                InterfaceC10034kd1 interfaceC10034kd1 = (iM18749g & 16) != 0 ? (InterfaceC10034kd1) sparseArray.get(i22) : null;
                if (interfaceC10034kd1 == null) {
                    c9591hA02.m18741G(i18);
                    return 0;
                }
                if (i2 != i3) {
                    int i23 = iM18749g & 15;
                    SparseIntArray sparseIntArray = this.f29381e;
                    int i24 = sparseIntArray.get(i22, i23 - 1);
                    sparseIntArray.put(i22, i23);
                    if (i24 == i23) {
                        c9591hA02.m18741G(i18);
                        return 0;
                    }
                    if (i23 != ((i24 + r2) & 15)) {
                        interfaceC10034kd1.mo8702c();
                    }
                }
                if (z2) {
                    int iM18763u = c9591hA02.m18763u();
                    i21 |= (c9591hA02.m18763u() & 64) != 0 ? i3 : 0;
                    c9591hA02.m18742H(iM18763u - r2);
                }
                boolean z3 = this.f29391o;
                if (i2 == i3 || z3 || !this.f29386j.get(i22, false)) {
                    c9591hA02.m18740F(i18);
                    interfaceC10034kd1.mo8700a(i21, c9591hA02);
                    c9591hA02.m18740F(i20);
                }
                if (i2 != i3 && !z3 && this.f29391o && j != -1) {
                    this.f29393q = r2;
                }
                c9591hA02.m18741G(i18);
                return 0;
            }
            int i25 = c9591hA02.f28295c;
            int iMo2367r = ((C7000vF) interfaceC1475XR).mo2367r(bArr2, i25, 9400 - i25);
            if (iMo2367r == -1) {
                for (int i26 = 0; i26 < sparseArray.size(); i26++) {
                    InterfaceC10034kd1 interfaceC10034kd12 = (InterfaceC10034kd1) sparseArray.valueAt(i26);
                    if (interfaceC10034kd12 instanceof WA0) {
                        WA0 wa0 = (WA0) interfaceC10034kd12;
                        if (wa0.f13019c == 3 && wa0.f13026j == -1 && (b == false || !(wa0.f13017a instanceof C10085l20))) {
                            wa0.mo8700a(r2, new C9591hA0());
                        }
                    }
                }
                return -1;
            }
            c9591hA02.m18740F(i25 + iMo2367r);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo739f(p000.InterfaceC1475XR r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            hA0 r0 = r6.f29380d
            byte[] r0 = r0.f28293a
            vF r7 = (p000.C7000vF) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.mo3620f(r0, r1, r2, r1)
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
            r7.mo3627n(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9778id1.mo739f(XR):boolean");
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        C1039QV c1039qv;
        YN1.m9281f(this.f29377a != 2);
        List list = this.f29379c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C7783Ja1 c7783Ja1 = (C7783Ja1) list.get(i);
            boolean z = c7783Ja1.m4354e() == -9223372036854775807L;
            if (!z) {
                long jM4353d = c7783Ja1.m4353d();
                z = (jM4353d == -9223372036854775807L || jM4353d == 0 || jM4353d == j2) ? false : true;
            }
            if (z) {
                c7783Ja1.m4356g(j2);
            }
        }
        if (j2 != 0 && (c1039qv = this.f29388l) != null) {
            c1039qv.m6726d(j2);
        }
        this.f29380d.m18738D(0);
        this.f29381e.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f29384h;
            if (i2 >= sparseArray.size()) {
                this.f29395s = 0;
                return;
            } else {
                ((InterfaceC10034kd1) sparseArray.valueAt(i2)).mo8702c();
                i2++;
            }
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
        if ((this.f29378b & 1) == 0) {
            interfaceC1538YR = new C10189lr0(interfaceC1538YR, this.f29383g);
        }
        this.f29389m = interfaceC1538YR;
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
    }
}
