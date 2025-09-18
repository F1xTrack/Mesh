package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: tC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7175tC implements InterfaceC8435zp0, InterfaceC3793fY0 {
    public static final Pattern y = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern z = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final int a;
    public final VY b;
    public final InterfaceC4188hc1 c;
    public final C22 d;
    public final RL e;
    public final C3547eG f;
    public final T71 g;
    public final long h;
    public final InterfaceC6515pk0 i;
    public final C5272jE j;
    public final C1350Rb1 k;
    public final C6984sC[] l;
    public final C7304tt m;
    public final LB0 n;
    public final VY p;
    public final OL q;
    public InterfaceC8245yp0 r;
    public C1954Yv u;
    public C6412pC v;
    public int w;
    public List x;
    public C1708Vr[] s = new C1708Vr[0];
    public OP[] t = new OP[0];
    public final IdentityHashMap o = new IdentityHashMap();

    public C7175tC(int i, C6412pC c6412pC, T71 t71, int i2, VY vy, InterfaceC4188hc1 interfaceC4188hc1, C22 c22, RL rl, OL ol, C3547eG c3547eG, VY vy2, long j, InterfaceC6515pk0 interfaceC6515pk0, C5272jE c5272jE, C7304tt c7304tt, QQ0 qq0, NB0 nb0) throws NumberFormatException {
        int i3;
        int i4;
        int i5;
        List list;
        boolean[] zArr;
        int i6;
        C6666qX[] c6666qXArr;
        C6666qX[] c6666qXArrK;
        C2297bI c2297bIC;
        Integer num;
        RL rl2 = rl;
        int i7 = 0;
        this.a = i;
        this.v = c6412pC;
        this.g = t71;
        this.w = i2;
        this.b = vy;
        this.c = interfaceC4188hc1;
        this.d = c22;
        this.e = rl2;
        this.q = ol;
        this.f = c3547eG;
        this.p = vy2;
        this.h = j;
        this.i = interfaceC6515pk0;
        this.j = c5272jE;
        this.m = c7304tt;
        this.n = new LB0(c6412pC, qq0, c5272jE);
        c7304tt.getClass();
        N70 n70 = P70.b;
        C3769fQ0 c3769fQ0 = C3769fQ0.e;
        this.u = new C1954Yv(c3769fQ0, c3769fQ0);
        MA0 ma0B = c6412pC.b(i2);
        List list2 = ma0B.d;
        this.x = list2;
        List list3 = ma0B.c;
        int size = list3.size();
        HashMap map = new HashMap(EU0.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i8 = 0; i8 < size; i8++) {
            map.put(Long.valueOf(((C3889g3) list3.get(i8)).a), Integer.valueOf(i8));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i8));
            arrayList.add(arrayList2);
            sparseArray.put(i8, arrayList2);
        }
        int i9 = 0;
        while (i9 < size) {
            C3889g3 c3889g3 = (C3889g3) list3.get(i9);
            C2297bI c2297bIC2 = c("http://dashif.org/guidelines/trickmode", c3889g3.e);
            List list4 = c3889g3.f;
            c2297bIC2 = c2297bIC2 == null ? c("http://dashif.org/guidelines/trickmode", list4) : c2297bIC2;
            int iIntValue = (c2297bIC2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(c2297bIC2.b)))) == null) ? i9 : num.intValue();
            if (iIntValue == i9 && (c2297bIC = c("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                int i10 = AbstractC0277Dh1.a;
                String[] strArrSplit = c2297bIC.b.split(StringUtils.COMMA, -1);
                int length = strArrSplit.length;
                for (int i11 = i7; i11 < length; i11++) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(strArrSplit[i11])));
                    if (num2 != null) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i9) {
                List list5 = (List) sparseArray.get(i9);
                List list6 = (List) sparseArray.get(iIntValue);
                list6.addAll(list5);
                sparseArray.put(i9, list6);
                arrayList.remove(list5);
            }
            i9++;
            i7 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            int[] iArrG = AbstractC6955s22.g((Collection) arrayList.get(i12));
            iArr[i12] = iArrG;
            Arrays.sort(iArrG);
        }
        boolean[] zArr2 = new boolean[size2];
        C6666qX[][] c6666qXArr2 = new C6666qX[size2][];
        int i13 = 0;
        int i14 = 0;
        while (i13 < size2) {
            int[] iArr2 = iArr[i13];
            int length2 = iArr2.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    break;
                }
                List list7 = ((C3889g3) list3.get(iArr2[i15])).c;
                int[] iArr3 = iArr2;
                for (int i16 = 0; i16 < list7.size(); i16++) {
                    if (!((AbstractC6458pR0) list7.get(i16)).d.isEmpty()) {
                        zArr2[i13] = true;
                        i14++;
                        break;
                    }
                }
                i15++;
                iArr2 = iArr3;
            }
            int[] iArr4 = iArr[i13];
            int length3 = iArr4.length;
            int i17 = 0;
            while (i17 < length3) {
                int i18 = iArr4[i17];
                C3889g3 c3889g32 = (C3889g3) list3.get(i18);
                List list8 = ((C3889g3) list3.get(i18)).d;
                int[] iArr5 = iArr4;
                int i19 = length3;
                int i20 = 0;
                while (i20 < list8.size()) {
                    C2297bI c2297bI = (C2297bI) list8.get(i20);
                    List list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(c2297bI.a)) {
                        C6475pX c6475pX = new C6475pX();
                        c6475pX.l = AbstractC1865Xr0.n("application/cea-608");
                        c6475pX.a = NX.i(new StringBuilder(), c3889g32.a, ":cea608");
                        c6666qXArrK = k(c2297bI, y, new C6666qX(c6475pX));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(c2297bI.a)) {
                        C6475pX c6475pX2 = new C6475pX();
                        c6475pX2.l = AbstractC1865Xr0.n("application/cea-708");
                        c6475pX2.a = NX.i(new StringBuilder(), c3889g32.a, ":cea708");
                        c6666qXArrK = k(c2297bI, z, new C6666qX(c6475pX2));
                    } else {
                        i20++;
                        list8 = list9;
                    }
                    c6666qXArr = c6666qXArrK;
                    i6 = 1;
                }
                i17++;
                iArr4 = iArr5;
                length3 = i19;
            }
            i6 = 1;
            c6666qXArr = new C6666qX[0];
            c6666qXArr2[i13] = c6666qXArr;
            if (c6666qXArr.length != 0) {
                i14 += i6;
            }
            i13 += i6;
        }
        int size3 = list2.size() + i14 + size2;
        C1272Qb1[] c1272Qb1Arr = new C1272Qb1[size3];
        C6984sC[] c6984sCArr = new C6984sC[size3];
        int i21 = 0;
        int i22 = 0;
        while (i21 < size2) {
            int[] iArr6 = iArr[i21];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr6.length;
            int i23 = size2;
            int i24 = 0;
            while (i24 < length4) {
                arrayList3.addAll(((C3889g3) list3.get(iArr6[i24])).c);
                i24++;
                iArr = iArr;
            }
            int[][] iArr7 = iArr;
            int size4 = arrayList3.size();
            C6666qX[] c6666qXArr3 = new C6666qX[size4];
            int i25 = 0;
            while (i25 < size4) {
                int i26 = size4;
                C6666qX c6666qX = ((AbstractC6458pR0) arrayList3.get(i25)).a;
                ArrayList arrayList4 = arrayList3;
                C6475pX c6475pXA = c6666qX.a();
                c6475pXA.I = rl2.j(c6666qX);
                c6666qXArr3[i25] = new C6666qX(c6475pXA);
                i25++;
                size4 = i26;
                arrayList3 = arrayList4;
            }
            C3889g3 c3889g33 = (C3889g3) list3.get(iArr6[0]);
            long j2 = c3889g33.a;
            String string = j2 != -1 ? Long.toString(j2) : AbstractC7209tN0.u(i21, "unset:");
            int i27 = i22 + 1;
            if (zArr2[i21]) {
                i3 = i22 + 2;
                i4 = i27;
            } else {
                i3 = i27;
                i4 = -1;
            }
            if (c6666qXArr2[i21].length != 0) {
                i5 = i3;
                i3++;
            } else {
                i5 = -1;
            }
            j(vy, c6666qXArr3);
            List list10 = list3;
            c1272Qb1Arr[i22] = new C1272Qb1(string, c6666qXArr3);
            N70 n702 = P70.b;
            C3769fQ0 c3769fQ02 = C3769fQ0.e;
            c6984sCArr[i22] = new C6984sC(c3889g33.b, 0, iArr6, i22, i4, i5, -1, c3769fQ02);
            int i28 = i4;
            int i29 = -1;
            if (i28 != -1) {
                String strI = AbstractC8235ym.i(string, ":emsg");
                C6475pX c6475pX3 = new C6475pX();
                c6475pX3.a = strI;
                c6475pX3.l = AbstractC1865Xr0.n("application/x-emsg");
                list = list2;
                zArr = zArr2;
                c1272Qb1Arr[i28] = new C1272Qb1(strI, new C6666qX(c6475pX3));
                c6984sCArr[i28] = new C6984sC(5, 1, iArr6, i22, -1, -1, -1, c3769fQ02);
                i29 = -1;
            } else {
                list = list2;
                zArr = zArr2;
            }
            if (i5 != i29) {
                String strI2 = AbstractC8235ym.i(string, ":cc");
                c6984sCArr[i5] = new C6984sC(3, 1, iArr6, i22, -1, -1, -1, P70.v(c6666qXArr2[i21]));
                j(vy, c6666qXArr2[i21]);
                c1272Qb1Arr[i5] = new C1272Qb1(strI2, c6666qXArr2[i21]);
            }
            i21++;
            size2 = i23;
            rl2 = rl;
            iArr = iArr7;
            i22 = i3;
            list3 = list10;
            zArr2 = zArr;
            list2 = list;
        }
        List list11 = list2;
        int i30 = 0;
        while (i30 < list11.size()) {
            List list12 = list11;
            QP qp = (QP) list12.get(i30);
            C6475pX c6475pX4 = new C6475pX();
            c6475pX4.a = qp.a();
            c6475pX4.l = AbstractC1865Xr0.n("application/x-emsg");
            c1272Qb1Arr[i22] = new C1272Qb1(qp.a() + StringUtils.PROCESS_POSTFIX_DELIMITER + i30, new C6666qX(c6475pX4));
            N70 n703 = P70.b;
            c6984sCArr[i22] = new C6984sC(5, 2, new int[0], -1, -1, -1, i30, C3769fQ0.e);
            i30++;
            list11 = list12;
            i22++;
        }
        Pair pairCreate = Pair.create(new C1350Rb1(c1272Qb1Arr), c6984sCArr);
        this.k = (C1350Rb1) pairCreate.first;
        this.l = (C6984sC[]) pairCreate.second;
    }

    public static C2297bI c(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            C2297bI c2297bI = (C2297bI) list.get(i);
            if (str.equals(c2297bI.a)) {
                return c2297bI;
            }
        }
        return null;
    }

    public static void j(VY vy, C6666qX[] c6666qXArr) {
        for (int i = 0; i < c6666qXArr.length; i++) {
            C6666qX c6666qX = c6666qXArr[i];
            CF cf = (CF) vy.d;
            if (cf.c && cf.b.b(c6666qX)) {
                C6475pX c6475pXA = c6666qX.a();
                c6475pXA.l = AbstractC1865Xr0.n("application/x-media3-cues");
                c6475pXA.F = cf.b.h(c6666qX);
                StringBuilder sb = new StringBuilder();
                sb.append(c6666qX.m);
                String str = c6666qX.j;
                sb.append(str != null ? " ".concat(str) : "");
                c6475pXA.i = sb.toString();
                c6475pXA.q = Long.MAX_VALUE;
                c6666qX = new C6666qX(c6475pXA);
            }
            c6666qXArr[i] = c6666qX;
        }
    }

    public static C6666qX[] k(C2297bI c2297bI, Pattern pattern, C6666qX c6666qX) throws NumberFormatException {
        String str = c2297bI.b;
        if (str == null) {
            return new C6666qX[]{c6666qX};
        }
        int i = AbstractC0277Dh1.a;
        String[] strArrSplit = str.split(";", -1);
        C6666qX[] c6666qXArr = new C6666qX[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            Matcher matcher = pattern.matcher(strArrSplit[i2]);
            if (!matcher.matches()) {
                return new C6666qX[]{c6666qX};
            }
            int i3 = Integer.parseInt(matcher.group(1));
            C6475pX c6475pXA = c6666qX.a();
            c6475pXA.a = c6666qX.a + StringUtils.PROCESS_POSTFIX_DELIMITER + i3;
            c6475pXA.E = i3;
            c6475pXA.d = matcher.group(2);
            c6666qXArr[i2] = new C6666qX(c6475pXA);
        }
        return c6666qXArr;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long b(long j, DX0 dx0) {
        for (C1708Vr c1708Vr : this.s) {
            if (c1708Vr.a == 2) {
                return c1708Vr.e.b(j, dx0);
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    @Override // defpackage.InterfaceC8435zp0
    public final long d(InterfaceC5311jR[] interfaceC5311jRArr, boolean[] zArr, InterfaceC3403dV0[] interfaceC3403dV0Arr, boolean[] zArr2, long j) {
        int i;
        boolean z2;
        int[] iArr;
        int i2;
        int[] iArr2;
        InterfaceC3403dV0[] interfaceC3403dV0Arr2;
        ?? r4;
        C1272Qb1 c1272Qb1A;
        boolean z3;
        KB0 kb0;
        boolean z4;
        InterfaceC5311jR[] interfaceC5311jRArr2 = interfaceC5311jRArr;
        InterfaceC3403dV0[] interfaceC3403dV0Arr3 = interfaceC3403dV0Arr;
        int[] iArr3 = new int[interfaceC5311jRArr2.length];
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= interfaceC5311jRArr2.length) {
                break;
            }
            InterfaceC5311jR interfaceC5311jR = interfaceC5311jRArr2[i3];
            if (interfaceC5311jR != null) {
                iArr3[i3] = this.k.b(interfaceC5311jR.d());
            } else {
                iArr3[i3] = -1;
            }
            i3++;
        }
        for (int i4 = 0; i4 < interfaceC5311jRArr2.length; i4++) {
            if (interfaceC5311jRArr2[i4] == null || !zArr[i4]) {
                InterfaceC3403dV0 interfaceC3403dV0 = interfaceC3403dV0Arr3[i4];
                if (interfaceC3403dV0 instanceof C1708Vr) {
                    ((C1708Vr) interfaceC3403dV0).A(this);
                } else if (interfaceC3403dV0 instanceof C1630Ur) {
                    ((C1630Ur) interfaceC3403dV0).c();
                }
                interfaceC3403dV0Arr3[i4] = null;
            }
        }
        int i5 = 0;
        while (true) {
            if (i5 >= interfaceC5311jRArr2.length) {
                break;
            }
            InterfaceC3403dV0 interfaceC3403dV02 = interfaceC3403dV0Arr3[i5];
            if ((interfaceC3403dV02 instanceof QN) || (interfaceC3403dV02 instanceof C1630Ur)) {
                int iF = f(i5, iArr3);
                if (iF == -1) {
                    z4 = interfaceC3403dV0Arr3[i5] instanceof QN;
                } else {
                    InterfaceC3403dV0 interfaceC3403dV03 = interfaceC3403dV0Arr3[i5];
                    z4 = (interfaceC3403dV03 instanceof C1630Ur) && ((C1630Ur) interfaceC3403dV03).a == interfaceC3403dV0Arr3[iF];
                }
                if (!z4) {
                    InterfaceC3403dV0 interfaceC3403dV04 = interfaceC3403dV0Arr3[i5];
                    if (interfaceC3403dV04 instanceof C1630Ur) {
                        ((C1630Ur) interfaceC3403dV04).c();
                    }
                    interfaceC3403dV0Arr3[i5] = null;
                }
            }
            i5++;
        }
        int i6 = 0;
        while (i6 < interfaceC5311jRArr2.length) {
            InterfaceC5311jR interfaceC5311jR2 = interfaceC5311jRArr2[i6];
            if (interfaceC5311jR2 == null) {
                i2 = i6;
                iArr2 = iArr3;
                interfaceC3403dV0Arr2 = interfaceC3403dV0Arr3;
            } else {
                InterfaceC3403dV0 interfaceC3403dV05 = interfaceC3403dV0Arr3[i6];
                if (interfaceC3403dV05 == null) {
                    zArr2[i6] = z2;
                    C6984sC c6984sC = this.l[iArr3[i6]];
                    int i7 = c6984sC.c;
                    if (i7 == 0) {
                        int i8 = c6984sC.f;
                        boolean z5 = i8 != i ? z2 : false;
                        if (z5) {
                            c1272Qb1A = this.k.a(i8);
                            r4 = z2;
                        } else {
                            r4 = 0;
                            c1272Qb1A = null;
                        }
                        int i9 = c6984sC.g;
                        C3769fQ0 c3769fQ0Z = i9 != i ? this.l[i9].h : P70.z();
                        int size = c3769fQ0Z.size() + r4;
                        C6666qX[] c6666qXArr = new C6666qX[size];
                        int[] iArr4 = new int[size];
                        if (z5) {
                            c6666qXArr[0] = c1272Qb1A.a();
                            iArr4[0] = 5;
                            z3 = z2;
                        } else {
                            z3 = false;
                        }
                        ArrayList arrayList = new ArrayList();
                        int i10 = 0;
                        ?? r3 = z3;
                        while (i10 < c3769fQ0Z.size()) {
                            C6666qX c6666qX = (C6666qX) c3769fQ0Z.get(i10);
                            c6666qXArr[r3] = c6666qX;
                            iArr4[r3] = 3;
                            arrayList.add(c6666qX);
                            i10++;
                            r3++;
                        }
                        if (this.v.d && z5) {
                            LB0 lb0 = this.n;
                            kb0 = new KB0(lb0, lb0.a);
                        } else {
                            kb0 = null;
                        }
                        VY vy = this.b;
                        InterfaceC6515pk0 interfaceC6515pk0 = this.i;
                        C6412pC c6412pC = this.v;
                        int i11 = i6;
                        T71 t71 = this.g;
                        int[] iArr5 = iArr3;
                        int i12 = this.w;
                        int[] iArr6 = c6984sC.a;
                        int i13 = c6984sC.b;
                        long j2 = this.h;
                        InterfaceC4188hc1 interfaceC4188hc1 = this.c;
                        C22 c22 = this.d;
                        ZC zcS0 = ((WC) vy.c).s0();
                        if (interfaceC4188hc1 != null) {
                            zcS0.d(interfaceC4188hc1);
                        }
                        i2 = i11;
                        KB0 kb02 = kb0;
                        iArr2 = iArr5;
                        C1708Vr c1708Vr = new C1708Vr(c6984sC.b, iArr4, c6666qXArr, new C2288bF((CF) vy.d, interfaceC6515pk0, c6412pC, t71, i12, iArr6, interfaceC5311jR2, i13, zcS0, j2, vy.b, z5, arrayList, kb0, c22), this, this.j, j, this.e, this.q, this.f, this.p);
                        synchronized (this) {
                            this.o.put(c1708Vr, kb02);
                        }
                        interfaceC3403dV0Arr2 = interfaceC3403dV0Arr;
                        interfaceC3403dV0Arr2[i2] = c1708Vr;
                    } else {
                        i2 = i6;
                        iArr2 = iArr3;
                        interfaceC3403dV0Arr2 = interfaceC3403dV0Arr3;
                        if (i7 == 2) {
                            interfaceC3403dV0Arr2[i2] = new OP((QP) this.x.get(c6984sC.d), interfaceC5311jR2.d().a(), this.v.d);
                        }
                    }
                } else {
                    i2 = i6;
                    iArr2 = iArr3;
                    interfaceC3403dV0Arr2 = interfaceC3403dV0Arr3;
                    if (interfaceC3403dV05 instanceof C1708Vr) {
                        ((C2288bF) ((C1708Vr) interfaceC3403dV05).e).k = interfaceC5311jR2;
                    }
                }
            }
            i6 = i2 + 1;
            interfaceC5311jRArr2 = interfaceC5311jRArr;
            interfaceC3403dV0Arr3 = interfaceC3403dV0Arr2;
            iArr3 = iArr2;
            z2 = true;
            i = -1;
        }
        int[] iArr7 = iArr3;
        InterfaceC3403dV0[] interfaceC3403dV0Arr4 = interfaceC3403dV0Arr3;
        int i14 = 0;
        while (i14 < interfaceC5311jRArr.length) {
            if (interfaceC3403dV0Arr4[i14] != null || interfaceC5311jRArr[i14] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                C6984sC c6984sC2 = this.l[iArr[i14]];
                if (c6984sC2.c == 1) {
                    int iF2 = f(i14, iArr);
                    if (iF2 == -1) {
                        interfaceC3403dV0Arr4[i14] = new QN();
                    } else {
                        C1708Vr c1708Vr2 = (C1708Vr) interfaceC3403dV0Arr4[iF2];
                        int i15 = c6984sC2.b;
                        int i16 = 0;
                        while (true) {
                            C2527cV0[] c2527cV0Arr = c1708Vr2.n;
                            if (i16 >= c2527cV0Arr.length) {
                                throw new IllegalStateException();
                            }
                            if (c1708Vr2.b[i16] == i15) {
                                boolean[] zArr3 = c1708Vr2.d;
                                YN1.f(!zArr3[i16]);
                                zArr3[i16] = true;
                                c2527cV0Arr[i16].F(j, true);
                                interfaceC3403dV0Arr4[i14] = new C1630Ur(c1708Vr2, c1708Vr2, c2527cV0Arr[i16], i16);
                                break;
                            }
                            i16++;
                        }
                    }
                    i14++;
                    iArr7 = iArr;
                }
            }
            i14++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (InterfaceC3403dV0 interfaceC3403dV06 : interfaceC3403dV0Arr4) {
            if (interfaceC3403dV06 instanceof C1708Vr) {
                arrayList2.add((C1708Vr) interfaceC3403dV06);
            } else if (interfaceC3403dV06 instanceof OP) {
                arrayList3.add((OP) interfaceC3403dV06);
            }
        }
        C1708Vr[] c1708VrArr = new C1708Vr[arrayList2.size()];
        this.s = c1708VrArr;
        arrayList2.toArray(c1708VrArr);
        OP[] opArr = new OP[arrayList3.size()];
        this.t = opArr;
        arrayList3.toArray(opArr);
        C7304tt c7304tt = this.m;
        AbstractList abstractListB = AbstractC6949s10.b(arrayList2, new C4403il(22));
        c7304tt.getClass();
        this.u = new C1954Yv(arrayList2, abstractListB);
        return j;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long e() {
        return this.u.e();
    }

    public final int f(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        C6984sC[] c6984sCArr = this.l;
        int i3 = c6984sCArr[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && c6984sCArr[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void g() {
        this.i.a();
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long h(long j) {
        for (C1708Vr c1708Vr : this.s) {
            c1708Vr.B(j);
        }
        for (OP op : this.t) {
            int iB = AbstractC0277Dh1.b(op.c, j, true);
            op.g = iB;
            op.h = (op.d && iB == op.c.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void i(long j) {
        for (C1708Vr c1708Vr : this.s) {
            c1708Vr.i(j);
        }
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean l() {
        return this.u.l();
    }

    @Override // defpackage.InterfaceC3793fY0
    public final void m(InterfaceC3984gY0 interfaceC3984gY0) {
        this.r.m(this);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long n() {
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void o(InterfaceC8245yp0 interfaceC8245yp0, long j) {
        this.r = interfaceC8245yp0;
        interfaceC8245yp0.a(this);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final C1350Rb1 q() {
        return this.k;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean r(C7660vk0 c7660vk0) {
        return this.u.r(c7660vk0);
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long s() {
        return this.u.s();
    }

    @Override // defpackage.InterfaceC3984gY0
    public final void t(long j) {
        this.u.t(j);
    }
}
