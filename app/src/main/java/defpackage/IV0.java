package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class IV0 {
    public static final Class a;
    public static final C5358jg1 b;
    public static final C5358jg1 c;
    public static final C5358jg1 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = A(false);
        c = A(true);
        d = new C5358jg1();
    }

    public static C5358jg1 A(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C5358jg1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(C5358jg1 c5358jg1, B00 b00, B00 b002) {
        c5358jg1.getClass();
        C4200hg1 c4200hg1 = b00.unknownFields;
        C4200hg1 c4200hg12 = b002.unknownFields;
        if (!c4200hg12.equals(C4200hg1.f)) {
            int i = c4200hg1.a + c4200hg12.a;
            int[] iArrCopyOf = Arrays.copyOf(c4200hg1.b, i);
            System.arraycopy(c4200hg12.b, 0, iArrCopyOf, c4200hg1.a, c4200hg12.a);
            Object[] objArrCopyOf = Arrays.copyOf(c4200hg1.c, i);
            System.arraycopy(c4200hg12.c, 0, objArrCopyOf, c4200hg1.a, c4200hg12.a);
            c4200hg1 = new C4200hg1(i, iArrCopyOf, objArrCopyOf, true);
        }
        b00.unknownFields = c4200hg1;
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void D(int i, List list, C1304Qm0 c1304Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6735qu c6735qu = (C6735qu) c1304Qm0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6735qu.I(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        c6735qu.T(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C6735qu.f;
            i3++;
        }
        c6735qu.V(i3);
        while (i2 < list.size()) {
            c6735qu.G(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void E(int i, List list, C1304Qm0 c1304Qm0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1304Qm0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((C6735qu) c1304Qm0.b).J(i, (C0440Fk) list.get(i2));
        }
    }

    public static void F(int i, List list, C1304Qm0 c1304Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6735qu c6735qu = (C6735qu) c1304Qm0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c6735qu.getClass();
                c6735qu.N(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c6735qu.T(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C6735qu.f;
            i3 += 8;
        }
        c6735qu.V(i3);
        while (i2 < list.size()) {
            c6735qu.O(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void G(int i, List list, C1304Qm0 c1304Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6735qu c6735qu = (C6735qu) c1304Qm0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6735qu.P(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c6735qu.T(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR += C6735qu.r(((Integer) list.get(i3)).intValue());
        }
        c6735qu.V(iR);
        while (i2 < list.size()) {
            c6735qu.Q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void H(int i, List list, C1304Qm0 c1304Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6735qu c6735qu = (C6735qu) c1304Qm0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6735qu.L(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c6735qu.T(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C6735qu.f;
            i3 += 4;
        }
        c6735qu.V(i3);
        while (i2 < list.size()) {
            c6735qu.M(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void I(int i, List list, C1304Qm0 c1304Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6735qu c6735qu = (C6735qu) c1304Qm0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6735qu.N(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c6735qu.T(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C6735qu.f;
            i3 += 8;
        }
        c6735qu.V(i3);
        while (i2 < list.size()) {
            c6735qu.O(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void J(int i, List list, C1304Qm0 c1304Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6735qu c6735qu = (C6735qu) c1304Qm0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c6735qu.getClass();
                c6735qu.L(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c6735qu.T(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C6735qu.f;
            i3 += 4;
        }
        c6735qu.V(i3);
        while (i2 < list.size()) {
            c6735qu.M(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void K(int i, List list, C1304Qm0 c1304Qm0, EV0 ev0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1304Qm0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c1304Qm0.H(i, list.get(i2), ev0);
        }
    }

    public static void L(int i, List list, C1304Qm0 c1304Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6735qu c6735qu = (C6735qu) c1304Qm0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6735qu.P(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c6735qu.T(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR += C6735qu.r(((Integer) list.get(i3)).intValue());
        }
        c6735qu.V(iR);
        while (i2 < list.size()) {
            c6735qu.Q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void M(int i, List list, C1304Qm0 c1304Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6735qu c6735qu = (C6735qu) c1304Qm0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6735qu.W(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c6735qu.T(i, 2);
        int iD = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iD += C6735qu.D(((Long) list.get(i3)).longValue());
        }
        c6735qu.V(iD);
        while (i2 < list.size()) {
            c6735qu.X(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void N(int i, List list, C1304Qm0 c1304Qm0, EV0 ev0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1304Qm0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c1304Qm0.L(i, list.get(i2), ev0);
        }
    }

    public static void O(int i, List list, C1304Qm0 c1304Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6735qu c6735qu = (C6735qu) c1304Qm0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6735qu.L(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c6735qu.T(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C6735qu.f;
            i3 += 4;
        }
        c6735qu.V(i3);
        while (i2 < list.size()) {
            c6735qu.M(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void P(int i, List list, C1304Qm0 c1304Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6735qu c6735qu = (C6735qu) c1304Qm0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6735qu.N(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c6735qu.T(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C6735qu.f;
            i3 += 8;
        }
        c6735qu.V(i3);
        while (i2 < list.size()) {
            c6735qu.O(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void Q(int i, List list, C1304Qm0 c1304Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6735qu c6735qu = (C6735qu) c1304Qm0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c6735qu.U(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        c6735qu.T(i, 2);
        int iB = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iB += C6735qu.B((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c6735qu.V(iB);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            c6735qu.V((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void R(int i, List list, C1304Qm0 c1304Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6735qu c6735qu = (C6735qu) c1304Qm0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c6735qu.W(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        c6735qu.T(i, 2);
        int iD = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iD += C6735qu.D((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c6735qu.V(iD);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c6735qu.X((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void S(int i, List list, C1304Qm0 c1304Qm0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1304Qm0.getClass();
        boolean z = list instanceof InterfaceC3823fi0;
        C6735qu c6735qu = (C6735qu) c1304Qm0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6735qu.R(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        InterfaceC3823fi0 interfaceC3823fi0 = (InterfaceC3823fi0) list;
        while (i2 < list.size()) {
            Object objP = interfaceC3823fi0.p(i2);
            if (objP instanceof String) {
                c6735qu.R(i, (String) objP);
            } else {
                c6735qu.J(i, (C0440Fk) objP);
            }
            i2++;
        }
    }

    public static void T(int i, List list, C1304Qm0 c1304Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6735qu c6735qu = (C6735qu) c1304Qm0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6735qu.U(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c6735qu.T(i, 2);
        int iB = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iB += C6735qu.B(((Integer) list.get(i3)).intValue());
        }
        c6735qu.V(iB);
        while (i2 < list.size()) {
            c6735qu.V(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void U(int i, List list, C1304Qm0 c1304Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6735qu c6735qu = (C6735qu) c1304Qm0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6735qu.W(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c6735qu.T(i, 2);
        int iD = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iD += C6735qu.D(((Long) list.get(i3)).longValue());
        }
        c6735qu.V(iD);
        while (i2 < list.size()) {
            c6735qu.X(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C6735qu.h(i) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ = C6735qu.z(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iZ += C6735qu.j((C0440Fk) list.get(i2));
        }
        return iZ;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6735qu.z(i) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2461c90) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iR = 0;
        for (int i = 0; i < size; i++) {
            iR += C6735qu.r(((Integer) list.get(i)).intValue());
        }
        return iR;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C6735qu.m(i) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C6735qu.n(i) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i, List list, EV0 ev0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iP += C6735qu.p(i, (L0) list.get(i2), ev0);
        }
        return iP;
    }

    public static int k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6735qu.z(i) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2461c90) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iR = 0;
        for (int i = 0; i < size; i++) {
            iR += C6735qu.r(((Integer) list.get(i)).intValue());
        }
        return iR;
    }

    public static int m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C6735qu.z(i) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC8043xl0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iD = 0;
        for (int i = 0; i < size; i++) {
            iD += C6735qu.D(((Long) list.get(i)).longValue());
        }
        return iD;
    }

    public static int o(int i, Object obj, EV0 ev0) {
        int iZ = C6735qu.z(i);
        int iB = ((L0) obj).b(ev0);
        return C6735qu.B(iB) + iB + iZ;
    }

    public static int p(int i, List list, EV0 ev0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ = C6735qu.z(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iB = ((L0) list.get(i2)).b(ev0);
            iZ += C6735qu.B(iB) + iB;
        }
        return iZ;
    }

    public static int q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6735qu.z(i) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2461c90) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iB = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iB += C6735qu.B((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iB;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6735qu.z(i) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC8043xl0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iD = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iD += C6735qu.D((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iD;
    }

    public static int u(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iZ = C6735qu.z(i) * size;
        if (list instanceof InterfaceC3823fi0) {
            InterfaceC3823fi0 interfaceC3823fi0 = (InterfaceC3823fi0) list;
            while (i2 < size) {
                Object objP = interfaceC3823fi0.p(i2);
                iZ = (objP instanceof C0440Fk ? C6735qu.j((C0440Fk) objP) : C6735qu.y((String) objP)) + iZ;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iZ = (obj instanceof C0440Fk ? C6735qu.j((C0440Fk) obj) : C6735qu.y((String) obj)) + iZ;
                i2++;
            }
        }
        return iZ;
    }

    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6735qu.z(i) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2461c90) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iB = 0;
        for (int i = 0; i < size; i++) {
            iB += C6735qu.B(((Integer) list.get(i)).intValue());
        }
        return iB;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6735qu.z(i) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC8043xl0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iD = 0;
        for (int i = 0; i < size; i++) {
            iD += C6735qu.D(((Long) list.get(i)).longValue());
        }
        return iD;
    }

    public static Object z(int i, List list, Object obj, C5358jg1 c5358jg1) {
        return obj;
    }
}
