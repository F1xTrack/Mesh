package p000;

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

/* renamed from: tC */
/* loaded from: classes.dex */
public final class C6871tC implements InterfaceC11973zp0, InterfaceC9383fY0 {

    /* renamed from: y */
    public static final Pattern f42919y = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: z */
    public static final Pattern f42920z = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: a */
    public final int f42921a;

    /* renamed from: b */
    public final C1356VY f42922b;

    /* renamed from: c */
    public final InterfaceC9648hc1 f42923c;

    /* renamed from: d */
    public final C22 f42924d;

    /* renamed from: e */
    public final InterfaceC1091RL f42925e;

    /* renamed from: f */
    public final C3979eG f42926f;

    /* renamed from: g */
    public final T71 f42927g;

    /* renamed from: h */
    public final long f42928h;

    /* renamed from: i */
    public final InterfaceC10687pk0 f42929i;

    /* renamed from: j */
    public final C6224jE f42930j;

    /* renamed from: k */
    public final C8201Rb1 f42931k;

    /* renamed from: l */
    public final C6808sC[] f42932l;

    /* renamed from: m */
    public final C6914tt f42933m;

    /* renamed from: n */
    public final LB0 f42934n;

    /* renamed from: p */
    public final C1356VY f42936p;

    /* renamed from: q */
    public final C0903OL f42937q;

    /* renamed from: r */
    public InterfaceC11846yp0 f42938r;

    /* renamed from: u */
    public C1568Yv f42941u;

    /* renamed from: v */
    public C6602pC f42942v;

    /* renamed from: w */
    public int f42943w;

    /* renamed from: x */
    public List f42944x;

    /* renamed from: s */
    public C1375Vr[] f42939s = new C1375Vr[0];

    /* renamed from: t */
    public C0907OP[] f42940t = new C0907OP[0];

    /* renamed from: o */
    public final IdentityHashMap f42935o = new IdentityHashMap();

    public C6871tC(int i, C6602pC c6602pC, T71 t71, int i2, C1356VY c1356vy, InterfaceC9648hc1 interfaceC9648hc1, C22 c22, InterfaceC1091RL interfaceC1091RL, C0903OL c0903ol, C3979eG c3979eG, C1356VY c1356vy2, long j, InterfaceC10687pk0 interfaceC10687pk0, C6224jE c6224jE, C6914tt c6914tt, QQ0 qq0, NB0 nb0) throws NumberFormatException {
        int i3;
        int i4;
        int i5;
        List list;
        boolean[] zArr;
        int i6;
        C6686qX[] c6686qXArr;
        C6686qX[] c6686qXArrM24854k;
        C1776bI c1776bIM24852c;
        Integer num;
        InterfaceC1091RL interfaceC1091RL2 = interfaceC1091RL;
        int i7 = 0;
        this.f42921a = i;
        this.f42942v = c6602pC;
        this.f42927g = t71;
        this.f42943w = i2;
        this.f42922b = c1356vy;
        this.f42923c = interfaceC9648hc1;
        this.f42924d = c22;
        this.f42925e = interfaceC1091RL2;
        this.f42937q = c0903ol;
        this.f42926f = c3979eG;
        this.f42936p = c1356vy2;
        this.f42928h = j;
        this.f42929i = interfaceC10687pk0;
        this.f42930j = c6224jE;
        this.f42933m = c6914tt;
        this.f42934n = new LB0(c6602pC, qq0, c6224jE);
        c6914tt.getClass();
        N70 n70 = P70.f8867b;
        C9367fQ0 c9367fQ0 = C9367fQ0.f27184e;
        this.f42941u = new C1568Yv(c9367fQ0, c9367fQ0);
        MA0 ma0M23640b = c6602pC.m23640b(i2);
        List list2 = ma0M23640b.f7016d;
        this.f42944x = list2;
        List list3 = ma0M23640b.f7015c;
        int size = list3.size();
        HashMap map = new HashMap(EU0.m2314a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i8 = 0; i8 < size; i8++) {
            map.put(Long.valueOf(((C4092g3) list3.get(i8)).f27533a), Integer.valueOf(i8));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i8));
            arrayList.add(arrayList2);
            sparseArray.put(i8, arrayList2);
        }
        int i9 = 0;
        while (i9 < size) {
            C4092g3 c4092g3 = (C4092g3) list3.get(i9);
            C1776bI c1776bIM24852c2 = m24852c("http://dashif.org/guidelines/trickmode", c4092g3.f27537e);
            List list4 = c4092g3.f27538f;
            c1776bIM24852c2 = c1776bIM24852c2 == null ? m24852c("http://dashif.org/guidelines/trickmode", list4) : c1776bIM24852c2;
            int iIntValue = (c1776bIM24852c2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(c1776bIM24852c2.f16930b)))) == null) ? i9 : num.intValue();
            if (iIntValue == i9 && (c1776bIM24852c = m24852c("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                int i10 = AbstractC7485Dh1.f2166a;
                String[] strArrSplit = c1776bIM24852c.f16930b.split(StringUtils.COMMA, -1);
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
            int[] iArrM24585g = AbstractC10983s22.m24585g((Collection) arrayList.get(i12));
            iArr[i12] = iArrM24585g;
            Arrays.sort(iArrM24585g);
        }
        boolean[] zArr2 = new boolean[size2];
        C6686qX[][] c6686qXArr2 = new C6686qX[size2][];
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
                List list7 = ((C4092g3) list3.get(iArr2[i15])).f27535c;
                int[] iArr3 = iArr2;
                for (int i16 = 0; i16 < list7.size(); i16++) {
                    if (!((AbstractC10649pR0) list7.get(i16)).f40079d.isEmpty()) {
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
                C4092g3 c4092g32 = (C4092g3) list3.get(i18);
                List list8 = ((C4092g3) list3.get(i18)).f27536d;
                int[] iArr5 = iArr4;
                int i19 = length3;
                int i20 = 0;
                while (i20 < list8.size()) {
                    C1776bI c1776bI = (C1776bI) list8.get(i20);
                    List list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(c1776bI.f16929a)) {
                        C6623pX c6623pX = new C6623pX();
                        c6623pX.f40161l = AbstractC8544Xr0.m9171n("application/cea-608");
                        c6623pX.f40150a = AbstractC0852NX.m5760i(new StringBuilder(), c4092g32.f27533a, ":cea608");
                        c6686qXArrM24854k = m24854k(c1776bI, f42919y, new C6686qX(c6623pX));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(c1776bI.f16929a)) {
                        C6623pX c6623pX2 = new C6623pX();
                        c6623pX2.f40161l = AbstractC8544Xr0.m9171n("application/cea-708");
                        c6623pX2.f40150a = AbstractC0852NX.m5760i(new StringBuilder(), c4092g32.f27533a, ":cea708");
                        c6686qXArrM24854k = m24854k(c1776bI, f42920z, new C6686qX(c6623pX2));
                    } else {
                        i20++;
                        list8 = list9;
                    }
                    c6686qXArr = c6686qXArrM24854k;
                    i6 = 1;
                }
                i17++;
                iArr4 = iArr5;
                length3 = i19;
            }
            i6 = 1;
            c6686qXArr = new C6686qX[0];
            c6686qXArr2[i13] = c6686qXArr;
            if (c6686qXArr.length != 0) {
                i14 += i6;
            }
            i13 += i6;
        }
        int size3 = list2.size() + i14 + size2;
        C8149Qb1[] c8149Qb1Arr = new C8149Qb1[size3];
        C6808sC[] c6808sCArr = new C6808sC[size3];
        int i21 = 0;
        int i22 = 0;
        while (i21 < size2) {
            int[] iArr6 = iArr[i21];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr6.length;
            int i23 = size2;
            int i24 = 0;
            while (i24 < length4) {
                arrayList3.addAll(((C4092g3) list3.get(iArr6[i24])).f27535c);
                i24++;
                iArr = iArr;
            }
            int[][] iArr7 = iArr;
            int size4 = arrayList3.size();
            C6686qX[] c6686qXArr3 = new C6686qX[size4];
            int i25 = 0;
            while (i25 < size4) {
                int i26 = size4;
                C6686qX c6686qX = ((AbstractC10649pR0) arrayList3.get(i25)).f40076a;
                ArrayList arrayList4 = arrayList3;
                C6623pX c6623pXM24020a = c6686qX.m24020a();
                c6623pXM24020a.f40149I = interfaceC1091RL2.mo6999j(c6686qX);
                c6686qXArr3[i25] = new C6686qX(c6623pXM24020a);
                i25++;
                size4 = i26;
                arrayList3 = arrayList4;
            }
            C4092g3 c4092g33 = (C4092g3) list3.get(iArr6[0]);
            long j2 = c4092g33.f27533a;
            String string = j2 != -1 ? Long.toString(j2) : AbstractC11153tN0.m24909u(i21, "unset:");
            int i27 = i22 + 1;
            if (zArr2[i21]) {
                i3 = i22 + 2;
                i4 = i27;
            } else {
                i3 = i27;
                i4 = -1;
            }
            if (c6686qXArr2[i21].length != 0) {
                i5 = i3;
                i3++;
            } else {
                i5 = -1;
            }
            m24853j(c1356vy, c6686qXArr3);
            List list10 = list3;
            c8149Qb1Arr[i22] = new C8149Qb1(string, c6686qXArr3);
            N70 n702 = P70.f8867b;
            C9367fQ0 c9367fQ02 = C9367fQ0.f27184e;
            c6808sCArr[i22] = new C6808sC(c4092g33.f27534b, 0, iArr6, i22, i4, i5, -1, c9367fQ02);
            int i28 = i4;
            int i29 = -1;
            if (i28 != -1) {
                String strM26232i = AbstractC7222ym.m26232i(string, ":emsg");
                C6623pX c6623pX3 = new C6623pX();
                c6623pX3.f40150a = strM26232i;
                c6623pX3.f40161l = AbstractC8544Xr0.m9171n("application/x-emsg");
                list = list2;
                zArr = zArr2;
                c8149Qb1Arr[i28] = new C8149Qb1(strM26232i, new C6686qX(c6623pX3));
                c6808sCArr[i28] = new C6808sC(5, 1, iArr6, i22, -1, -1, -1, c9367fQ02);
                i29 = -1;
            } else {
                list = list2;
                zArr = zArr2;
            }
            if (i5 != i29) {
                String strM26232i2 = AbstractC7222ym.m26232i(string, ":cc");
                c6808sCArr[i5] = new C6808sC(3, 1, iArr6, i22, -1, -1, -1, P70.m6235v(c6686qXArr2[i21]));
                m24853j(c1356vy, c6686qXArr2[i21]);
                c8149Qb1Arr[i5] = new C8149Qb1(strM26232i2, c6686qXArr2[i21]);
            }
            i21++;
            size2 = i23;
            interfaceC1091RL2 = interfaceC1091RL;
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
            C1033QP c1033qp = (C1033QP) list12.get(i30);
            C6623pX c6623pX4 = new C6623pX();
            c6623pX4.f40150a = c1033qp.m6681a();
            c6623pX4.f40161l = AbstractC8544Xr0.m9171n("application/x-emsg");
            c8149Qb1Arr[i22] = new C8149Qb1(c1033qp.m6681a() + StringUtils.PROCESS_POSTFIX_DELIMITER + i30, new C6686qX(c6623pX4));
            N70 n703 = P70.f8867b;
            c6808sCArr[i22] = new C6808sC(5, 2, new int[0], -1, -1, -1, i30, C9367fQ0.f27184e);
            i30++;
            list11 = list12;
            i22++;
        }
        Pair pairCreate = Pair.create(new C8201Rb1(c8149Qb1Arr), c6808sCArr);
        this.f42931k = (C8201Rb1) pairCreate.first;
        this.f42932l = (C6808sC[]) pairCreate.second;
    }

    /* renamed from: c */
    public static C1776bI m24852c(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            C1776bI c1776bI = (C1776bI) list.get(i);
            if (str.equals(c1776bI.f16929a)) {
                return c1776bI;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static void m24853j(C1356VY c1356vy, C6686qX[] c6686qXArr) {
        for (int i = 0; i < c6686qXArr.length; i++) {
            C6686qX c6686qX = c6686qXArr[i];
            C0142CF c0142cf = (C0142CF) c1356vy.f12613d;
            if (c0142cf.f1267c && c0142cf.f1266b.mo911b(c6686qX)) {
                C6623pX c6623pXM24020a = c6686qX.m24020a();
                c6623pXM24020a.f40161l = AbstractC8544Xr0.m9171n("application/x-media3-cues");
                c6623pXM24020a.f40146F = c0142cf.f1266b.mo917h(c6686qX);
                StringBuilder sb = new StringBuilder();
                sb.append(c6686qX.f40974m);
                String str = c6686qX.f40971j;
                sb.append(str != null ? " ".concat(str) : "");
                c6623pXM24020a.f40158i = sb.toString();
                c6623pXM24020a.f40166q = Long.MAX_VALUE;
                c6686qX = new C6686qX(c6623pXM24020a);
            }
            c6686qXArr[i] = c6686qX;
        }
    }

    /* renamed from: k */
    public static C6686qX[] m24854k(C1776bI c1776bI, Pattern pattern, C6686qX c6686qX) throws NumberFormatException {
        String str = c1776bI.f16930b;
        if (str == null) {
            return new C6686qX[]{c6686qX};
        }
        int i = AbstractC7485Dh1.f2166a;
        String[] strArrSplit = str.split(";", -1);
        C6686qX[] c6686qXArr = new C6686qX[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            Matcher matcher = pattern.matcher(strArrSplit[i2]);
            if (!matcher.matches()) {
                return new C6686qX[]{c6686qX};
            }
            int i3 = Integer.parseInt(matcher.group(1));
            C6623pX c6623pXM24020a = c6686qX.m24020a();
            c6623pXM24020a.f40150a = c6686qX.f40962a + StringUtils.PROCESS_POSTFIX_DELIMITER + i3;
            c6623pXM24020a.f40145E = i3;
            c6623pXM24020a.f40153d = matcher.group(2);
            c6686qXArr[i2] = new C6686qX(c6623pXM24020a);
        }
        return c6686qXArr;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: b */
    public final long mo1877b(long j, DX0 dx0) {
        for (C1375Vr c1375Vr : this.f42939s) {
            if (c1375Vr.f12802a == 2) {
                return c1375Vr.f12806e.mo2564b(j, dx0);
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
    @Override // p000.InterfaceC11973zp0
    /* renamed from: d */
    public final long mo1879d(InterfaceC6237jR[] interfaceC6237jRArr, boolean[] zArr, InterfaceC9121dV0[] interfaceC9121dV0Arr, boolean[] zArr2, long j) {
        int i;
        boolean z;
        int[] iArr;
        int i2;
        int[] iArr2;
        InterfaceC9121dV0[] interfaceC9121dV0Arr2;
        ?? r4;
        C8149Qb1 c8149Qb1M7046a;
        boolean z2;
        KB0 kb0;
        boolean z3;
        InterfaceC6237jR[] interfaceC6237jRArr2 = interfaceC6237jRArr;
        InterfaceC9121dV0[] interfaceC9121dV0Arr3 = interfaceC9121dV0Arr;
        int[] iArr3 = new int[interfaceC6237jRArr2.length];
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= interfaceC6237jRArr2.length) {
                break;
            }
            InterfaceC6237jR interfaceC6237jR = interfaceC6237jRArr2[i3];
            if (interfaceC6237jR != null) {
                iArr3[i3] = this.f42931k.m7047b(interfaceC6237jR.mo2724d());
            } else {
                iArr3[i3] = -1;
            }
            i3++;
        }
        for (int i4 = 0; i4 < interfaceC6237jRArr2.length; i4++) {
            if (interfaceC6237jRArr2[i4] == null || !zArr[i4]) {
                InterfaceC9121dV0 interfaceC9121dV0 = interfaceC9121dV0Arr3[i4];
                if (interfaceC9121dV0 instanceof C1375Vr) {
                    ((C1375Vr) interfaceC9121dV0).m8603A(this);
                } else if (interfaceC9121dV0 instanceof C1312Ur) {
                    ((C1312Ur) interfaceC9121dV0).m8193c();
                }
                interfaceC9121dV0Arr3[i4] = null;
            }
        }
        int i5 = 0;
        while (true) {
            if (i5 >= interfaceC6237jRArr2.length) {
                break;
            }
            InterfaceC9121dV0 interfaceC9121dV02 = interfaceC9121dV0Arr3[i5];
            if ((interfaceC9121dV02 instanceof C1031QN) || (interfaceC9121dV02 instanceof C1312Ur)) {
                int iM24855f = m24855f(i5, iArr3);
                if (iM24855f == -1) {
                    z3 = interfaceC9121dV0Arr3[i5] instanceof C1031QN;
                } else {
                    InterfaceC9121dV0 interfaceC9121dV03 = interfaceC9121dV0Arr3[i5];
                    z3 = (interfaceC9121dV03 instanceof C1312Ur) && ((C1312Ur) interfaceC9121dV03).f12169a == interfaceC9121dV0Arr3[iM24855f];
                }
                if (!z3) {
                    InterfaceC9121dV0 interfaceC9121dV04 = interfaceC9121dV0Arr3[i5];
                    if (interfaceC9121dV04 instanceof C1312Ur) {
                        ((C1312Ur) interfaceC9121dV04).m8193c();
                    }
                    interfaceC9121dV0Arr3[i5] = null;
                }
            }
            i5++;
        }
        int i6 = 0;
        while (i6 < interfaceC6237jRArr2.length) {
            InterfaceC6237jR interfaceC6237jR2 = interfaceC6237jRArr2[i6];
            if (interfaceC6237jR2 == null) {
                i2 = i6;
                iArr2 = iArr3;
                interfaceC9121dV0Arr2 = interfaceC9121dV0Arr3;
            } else {
                InterfaceC9121dV0 interfaceC9121dV05 = interfaceC9121dV0Arr3[i6];
                if (interfaceC9121dV05 == null) {
                    zArr2[i6] = z;
                    C6808sC c6808sC = this.f42932l[iArr3[i6]];
                    int i7 = c6808sC.f42292c;
                    if (i7 == 0) {
                        int i8 = c6808sC.f42295f;
                        boolean z4 = i8 != i ? z : false;
                        if (z4) {
                            c8149Qb1M7046a = this.f42931k.m7046a(i8);
                            r4 = z;
                        } else {
                            r4 = 0;
                            c8149Qb1M7046a = null;
                        }
                        int i9 = c6808sC.f42296g;
                        C9367fQ0 c9367fQ0M6236z = i9 != i ? this.f42932l[i9].f42297h : P70.m6236z();
                        int size = c9367fQ0M6236z.size() + r4;
                        C6686qX[] c6686qXArr = new C6686qX[size];
                        int[] iArr4 = new int[size];
                        if (z4) {
                            c6686qXArr[0] = c8149Qb1M7046a.m6735a();
                            iArr4[0] = 5;
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                        ArrayList arrayList = new ArrayList();
                        int i10 = 0;
                        ?? r3 = z2;
                        while (i10 < c9367fQ0M6236z.size()) {
                            C6686qX c6686qX = (C6686qX) c9367fQ0M6236z.get(i10);
                            c6686qXArr[r3] = c6686qX;
                            iArr4[r3] = 3;
                            arrayList.add(c6686qX);
                            i10++;
                            r3++;
                        }
                        if (this.f42942v.f39900d && z4) {
                            LB0 lb0 = this.f42934n;
                            kb0 = new KB0(lb0, lb0.f6535a);
                        } else {
                            kb0 = null;
                        }
                        C1356VY c1356vy = this.f42922b;
                        InterfaceC10687pk0 interfaceC10687pk0 = this.f42929i;
                        C6602pC c6602pC = this.f42942v;
                        int i11 = i6;
                        T71 t71 = this.f42927g;
                        int[] iArr5 = iArr3;
                        int i12 = this.f42943w;
                        int[] iArr6 = c6808sC.f42290a;
                        int i13 = c6808sC.f42291b;
                        long j2 = this.f42928h;
                        InterfaceC9648hc1 interfaceC9648hc1 = this.f42923c;
                        C22 c22 = this.f42924d;
                        InterfaceC1586ZC interfaceC1586ZCMo506s0 = ((InterfaceC1397WC) c1356vy.f12612c).mo506s0();
                        if (interfaceC9648hc1 != null) {
                            interfaceC1586ZCMo506s0.mo5255d(interfaceC9648hc1);
                        }
                        i2 = i11;
                        KB0 kb02 = kb0;
                        iArr2 = iArr5;
                        C1375Vr c1375Vr = new C1375Vr(c6808sC.f42291b, iArr4, c6686qXArr, new C1773bF((C0142CF) c1356vy.f12613d, interfaceC10687pk0, c6602pC, t71, i12, iArr6, interfaceC6237jR2, i13, interfaceC1586ZCMo506s0, j2, c1356vy.f12611b, z4, arrayList, kb0, c22), this, this.f42930j, j, this.f42925e, this.f42937q, this.f42926f, this.f42936p);
                        synchronized (this) {
                            this.f42935o.put(c1375Vr, kb02);
                        }
                        interfaceC9121dV0Arr2 = interfaceC9121dV0Arr;
                        interfaceC9121dV0Arr2[i2] = c1375Vr;
                    } else {
                        i2 = i6;
                        iArr2 = iArr3;
                        interfaceC9121dV0Arr2 = interfaceC9121dV0Arr3;
                        if (i7 == 2) {
                            interfaceC9121dV0Arr2[i2] = new C0907OP((C1033QP) this.f42944x.get(c6808sC.f42293d), interfaceC6237jR2.mo2724d().m6735a(), this.f42942v.f39900d);
                        }
                    }
                } else {
                    i2 = i6;
                    iArr2 = iArr3;
                    interfaceC9121dV0Arr2 = interfaceC9121dV0Arr3;
                    if (interfaceC9121dV05 instanceof C1375Vr) {
                        ((C1773bF) ((C1375Vr) interfaceC9121dV05).f12806e).f16891k = interfaceC6237jR2;
                    }
                }
            }
            i6 = i2 + 1;
            interfaceC6237jRArr2 = interfaceC6237jRArr;
            interfaceC9121dV0Arr3 = interfaceC9121dV0Arr2;
            iArr3 = iArr2;
            z = true;
            i = -1;
        }
        int[] iArr7 = iArr3;
        InterfaceC9121dV0[] interfaceC9121dV0Arr4 = interfaceC9121dV0Arr3;
        int i14 = 0;
        while (i14 < interfaceC6237jRArr.length) {
            if (interfaceC9121dV0Arr4[i14] != null || interfaceC6237jRArr[i14] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                C6808sC c6808sC2 = this.f42932l[iArr[i14]];
                if (c6808sC2.f42292c == 1) {
                    int iM24855f2 = m24855f(i14, iArr);
                    if (iM24855f2 == -1) {
                        interfaceC9121dV0Arr4[i14] = new C1031QN();
                    } else {
                        C1375Vr c1375Vr2 = (C1375Vr) interfaceC9121dV0Arr4[iM24855f2];
                        int i15 = c6808sC2.f42291b;
                        int i16 = 0;
                        while (true) {
                            C8988cV0[] c8988cV0Arr = c1375Vr2.f12815n;
                            if (i16 >= c8988cV0Arr.length) {
                                throw new IllegalStateException();
                            }
                            if (c1375Vr2.f12803b[i16] == i15) {
                                boolean[] zArr3 = c1375Vr2.f12805d;
                                YN1.m9281f(!zArr3[i16]);
                                zArr3[i16] = true;
                                c8988cV0Arr[i16].m10720F(j, true);
                                interfaceC9121dV0Arr4[i14] = new C1312Ur(c1375Vr2, c1375Vr2, c8988cV0Arr[i16], i16);
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
        for (InterfaceC9121dV0 interfaceC9121dV06 : interfaceC9121dV0Arr4) {
            if (interfaceC9121dV06 instanceof C1375Vr) {
                arrayList2.add((C1375Vr) interfaceC9121dV06);
            } else if (interfaceC9121dV06 instanceof C0907OP) {
                arrayList3.add((C0907OP) interfaceC9121dV06);
            }
        }
        C1375Vr[] c1375VrArr = new C1375Vr[arrayList2.size()];
        this.f42939s = c1375VrArr;
        arrayList2.toArray(c1375VrArr);
        C0907OP[] c0907opArr = new C0907OP[arrayList3.size()];
        this.f42940t = c0907opArr;
        arrayList3.toArray(c0907opArr);
        C6914tt c6914tt = this.f42933m;
        AbstractList abstractListM24577b = AbstractC10978s10.m24577b(arrayList2, new C4262il(22));
        c6914tt.getClass();
        this.f42941u = new C1568Yv(arrayList2, abstractListM24577b);
        return j;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: e */
    public final long mo1880e() {
        return this.f42941u.mo1880e();
    }

    /* renamed from: f */
    public final int m24855f(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        C6808sC[] c6808sCArr = this.f42932l;
        int i3 = c6808sCArr[i2].f42294e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && c6808sCArr[i5].f42292c == 0) {
                return i4;
            }
        }
        return -1;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: g */
    public final void mo1881g() {
        this.f42929i.mo858a();
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: h */
    public final long mo1882h(long j) {
        for (C1375Vr c1375Vr : this.f42939s) {
            c1375Vr.m8604B(j);
        }
        for (C0907OP c0907op : this.f42940t) {
            int iM1814b = AbstractC7485Dh1.m1814b(c0907op.f8430c, j, true);
            c0907op.f8434g = iM1814b;
            c0907op.f8435h = (c0907op.f8431d && iM1814b == c0907op.f8430c.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: i */
    public final void mo1883i(long j) {
        for (C1375Vr c1375Vr : this.f42939s) {
            c1375Vr.m8605i(j);
        }
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: l */
    public final boolean mo1884l() {
        return this.f42941u.mo1884l();
    }

    @Override // p000.InterfaceC9383fY0
    /* renamed from: m */
    public final void mo1885m(InterfaceC9511gY0 interfaceC9511gY0) {
        this.f42938r.mo1885m(this);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: n */
    public final long mo1886n() {
        return -9223372036854775807L;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: o */
    public final void mo1887o(InterfaceC11846yp0 interfaceC11846yp0, long j) {
        this.f42938r = interfaceC11846yp0;
        interfaceC11846yp0.mo1876a(this);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: q */
    public final C8201Rb1 mo1888q() {
        return this.f42931k;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: r */
    public final boolean mo1889r(C11455vk0 c11455vk0) {
        return this.f42941u.mo1889r(c11455vk0);
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: s */
    public final long mo1890s() {
        return this.f42941u.mo1890s();
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: t */
    public final void mo1891t(long j) {
        this.f42941u.mo1891t(j);
    }
}
