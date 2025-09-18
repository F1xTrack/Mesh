package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class HV0 {
    public static final Class a;
    public static final C4390ig1 b;
    public static final C4390ig1 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        C4390ig1 c4390ig1 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                c4390ig1 = (C4390ig1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = c4390ig1;
        c = new C4390ig1();
    }

    public static boolean A(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void B(int i, List list, C1562Tu0 c1562Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6162nu c6162nu = (C6162nu) c1562Tu0.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                c6162nu.H(i, 0);
                c6162nu.y(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c6162nu.H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C6162nu.e;
            i3++;
        }
        c6162nu.I(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            c6162nu.y(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void C(int i, List list, C1562Tu0 c1562Tu0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1562Tu0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C0362Ek c0362Ek = (C0362Ek) list.get(i2);
            C6162nu c6162nu = (C6162nu) c1562Tu0.b;
            c6162nu.H(i, 2);
            c6162nu.A(c0362Ek);
        }
    }

    public static void D(int i, List list, C1562Tu0 c1562Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6162nu c6162nu = (C6162nu) c1562Tu0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c6162nu.getClass();
                c6162nu.D(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c6162nu.H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C6162nu.e;
            i3 += 8;
        }
        c6162nu.I(i3);
        while (i2 < list.size()) {
            c6162nu.E(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void E(int i, List list, C1562Tu0 c1562Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6162nu c6162nu = (C6162nu) c1562Tu0.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c6162nu.H(i, 0);
                c6162nu.F(iIntValue);
            }
            return;
        }
        c6162nu.H(i, 2);
        int iL = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iL += C6162nu.l(((Integer) list.get(i3)).intValue());
        }
        c6162nu.I(iL);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c6162nu.F(((Integer) list.get(i4)).intValue());
        }
    }

    public static void F(int i, List list, C1562Tu0 c1562Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6162nu c6162nu = (C6162nu) c1562Tu0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6162nu.B(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c6162nu.H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C6162nu.e;
            i3 += 4;
        }
        c6162nu.I(i3);
        while (i2 < list.size()) {
            c6162nu.C(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void G(int i, List list, C1562Tu0 c1562Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6162nu c6162nu = (C6162nu) c1562Tu0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6162nu.D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c6162nu.H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C6162nu.e;
            i3 += 8;
        }
        c6162nu.I(i3);
        while (i2 < list.size()) {
            c6162nu.E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void H(int i, List list, C1562Tu0 c1562Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6162nu c6162nu = (C6162nu) c1562Tu0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c6162nu.getClass();
                c6162nu.B(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c6162nu.H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C6162nu.e;
            i3 += 4;
        }
        c6162nu.I(i3);
        while (i2 < list.size()) {
            c6162nu.C(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void I(int i, List list, C1562Tu0 c1562Tu0, DV0 dv0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1562Tu0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c1562Tu0.B0(i, list.get(i2), dv0);
        }
    }

    public static void J(int i, List list, C1562Tu0 c1562Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6162nu c6162nu = (C6162nu) c1562Tu0.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c6162nu.H(i, 0);
                c6162nu.F(iIntValue);
            }
            return;
        }
        c6162nu.H(i, 2);
        int iL = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iL += C6162nu.l(((Integer) list.get(i3)).intValue());
        }
        c6162nu.I(iL);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c6162nu.F(((Integer) list.get(i4)).intValue());
        }
    }

    public static void K(int i, List list, C1562Tu0 c1562Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6162nu c6162nu = (C6162nu) c1562Tu0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6162nu.J(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c6162nu.H(i, 2);
        int iX = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iX += C6162nu.x(((Long) list.get(i3)).longValue());
        }
        c6162nu.I(iX);
        while (i2 < list.size()) {
            c6162nu.K(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void L(int i, List list, C1562Tu0 c1562Tu0, DV0 dv0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1562Tu0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c1562Tu0.E0(i, list.get(i2), dv0);
        }
    }

    public static void M(int i, List list, C1562Tu0 c1562Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6162nu c6162nu = (C6162nu) c1562Tu0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6162nu.B(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c6162nu.H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C6162nu.e;
            i3 += 4;
        }
        c6162nu.I(i3);
        while (i2 < list.size()) {
            c6162nu.C(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void N(int i, List list, C1562Tu0 c1562Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6162nu c6162nu = (C6162nu) c1562Tu0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6162nu.D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c6162nu.H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C6162nu.e;
            i3 += 8;
        }
        c6162nu.I(i3);
        while (i2 < list.size()) {
            c6162nu.E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void O(int i, List list, C1562Tu0 c1562Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6162nu c6162nu = (C6162nu) c1562Tu0.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c6162nu.H(i, 0);
                c6162nu.I((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        c6162nu.H(i, 2);
        int iV = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iV += C6162nu.v((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c6162nu.I(iV);
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue3 = ((Integer) list.get(i4)).intValue();
            c6162nu.I((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    public static void P(int i, List list, C1562Tu0 c1562Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6162nu c6162nu = (C6162nu) c1562Tu0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c6162nu.J(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        c6162nu.H(i, 2);
        int iX = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iX += C6162nu.x((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c6162nu.I(iX);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c6162nu.K((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void Q(int i, List list, C1562Tu0 c1562Tu0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1562Tu0.getClass();
        boolean z = list instanceof InterfaceC3442di0;
        C6162nu c6162nu = (C6162nu) c1562Tu0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                String str = (String) list.get(i2);
                c6162nu.H(i, 2);
                c6162nu.G(str);
                i2++;
            }
            return;
        }
        InterfaceC3442di0 interfaceC3442di0 = (InterfaceC3442di0) list;
        while (i2 < list.size()) {
            Object objP = interfaceC3442di0.p(i2);
            if (objP instanceof String) {
                c6162nu.H(i, 2);
                c6162nu.G((String) objP);
            } else {
                c6162nu.H(i, 2);
                c6162nu.A((C0362Ek) objP);
            }
            i2++;
        }
    }

    public static void R(int i, List list, C1562Tu0 c1562Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6162nu c6162nu = (C6162nu) c1562Tu0.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c6162nu.H(i, 0);
                c6162nu.I(iIntValue);
            }
            return;
        }
        c6162nu.H(i, 2);
        int iV = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iV += C6162nu.v(((Integer) list.get(i3)).intValue());
        }
        c6162nu.I(iV);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c6162nu.I(((Integer) list.get(i4)).intValue());
        }
    }

    public static void S(int i, List list, C1562Tu0 c1562Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6162nu c6162nu = (C6162nu) c1562Tu0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6162nu.J(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c6162nu.H(i, 2);
        int iX = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iX += C6162nu.x(((Long) list.get(i3)).longValue());
        }
        c6162nu.I(iX);
        while (i2 < list.size()) {
            c6162nu.K(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C6162nu.b(i) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = C6162nu.t(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iT += C6162nu.d((C0362Ek) list.get(i2));
        }
        return iT;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6162nu.t(i) * size) + e(list);
    }

    public static int e(List list) {
        int iL;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2271b90) {
            C2271b90 c2271b90 = (C2271b90) list;
            iL = 0;
            while (i < size) {
                iL += C6162nu.l(c2271b90.getInt(i));
                i++;
            }
        } else {
            iL = 0;
            while (i < size) {
                iL += C6162nu.l(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iL;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C6162nu.g(i) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C6162nu.h(i) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i, List list, DV0 dv0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iJ += C6162nu.j(i, (J0) list.get(i2), dv0);
        }
        return iJ;
    }

    public static int k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6162nu.t(i) * size) + l(list);
    }

    public static int l(List list) {
        int iL;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2271b90) {
            C2271b90 c2271b90 = (C2271b90) list;
            iL = 0;
            while (i < size) {
                iL += C6162nu.l(c2271b90.getInt(i));
                i++;
            }
        } else {
            iL = 0;
            while (i < size) {
                iL += C6162nu.l(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iL;
    }

    public static int m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C6162nu.t(i) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC7853wl0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i = 0; i < size; i++) {
            iX += C6162nu.x(((Long) list.get(i)).longValue());
        }
        return iX;
    }

    public static int o(int i, Object obj, DV0 dv0) {
        int iT = C6162nu.t(i);
        int iC = ((J0) obj).c(dv0);
        return C6162nu.v(iC) + iC + iT;
    }

    public static int p(int i, List list, DV0 dv0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = C6162nu.t(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iC = ((J0) list.get(i2)).c(dv0);
            iT += C6162nu.v(iC) + iC;
        }
        return iT;
    }

    public static int q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6162nu.t(i) * size) + r(list);
    }

    public static int r(List list) {
        int iV;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2271b90) {
            C2271b90 c2271b90 = (C2271b90) list;
            iV = 0;
            while (i < size) {
                int i2 = c2271b90.getInt(i);
                iV += C6162nu.v((i2 >> 31) ^ (i2 << 1));
                i++;
            }
        } else {
            iV = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iV += C6162nu.v((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
        }
        return iV;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6162nu.t(i) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC7853wl0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iX += C6162nu.x((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iX;
    }

    public static int u(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iT = C6162nu.t(i) * size;
        if (list instanceof InterfaceC3442di0) {
            InterfaceC3442di0 interfaceC3442di0 = (InterfaceC3442di0) list;
            while (i2 < size) {
                Object objP = interfaceC3442di0.p(i2);
                iT = (objP instanceof C0362Ek ? C6162nu.d((C0362Ek) objP) : C6162nu.s((String) objP)) + iT;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iT = (obj instanceof C0362Ek ? C6162nu.d((C0362Ek) obj) : C6162nu.s((String) obj)) + iT;
                i2++;
            }
        }
        return iT;
    }

    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6162nu.t(i) * size) + w(list);
    }

    public static int w(List list) {
        int iV;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2271b90) {
            C2271b90 c2271b90 = (C2271b90) list;
            iV = 0;
            while (i < size) {
                iV += C6162nu.v(c2271b90.getInt(i));
                i++;
            }
        } else {
            iV = 0;
            while (i < size) {
                iV += C6162nu.v(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iV;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6162nu.t(i) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC7853wl0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i = 0; i < size; i++) {
            iX += C6162nu.x(((Long) list.get(i)).longValue());
        }
        return iX;
    }

    public static void z(C4390ig1 c4390ig1, Object obj, Object obj2) {
        c4390ig1.getClass();
        AbstractC8279z00 abstractC8279z00 = (AbstractC8279z00) obj;
        C4009gg1 c4009gg1 = abstractC8279z00.unknownFields;
        C4009gg1 c4009gg12 = ((AbstractC8279z00) obj2).unknownFields;
        C4009gg1 c4009gg13 = C4009gg1.f;
        if (!c4009gg13.equals(c4009gg12)) {
            if (c4009gg13.equals(c4009gg1)) {
                int i = c4009gg1.a + c4009gg12.a;
                int[] iArrCopyOf = Arrays.copyOf(c4009gg1.b, i);
                System.arraycopy(c4009gg12.b, 0, iArrCopyOf, c4009gg1.a, c4009gg12.a);
                Object[] objArrCopyOf = Arrays.copyOf(c4009gg1.c, i);
                System.arraycopy(c4009gg12.c, 0, objArrCopyOf, c4009gg1.a, c4009gg12.a);
                c4009gg1 = new C4009gg1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c4009gg1.getClass();
                if (!c4009gg12.equals(c4009gg13)) {
                    if (!c4009gg1.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = c4009gg1.a;
                    int i3 = c4009gg12.a + i2;
                    int[] iArr = c4009gg1.b;
                    if (i3 > iArr.length) {
                        int i4 = (i2 / 2) + i2;
                        if (i4 < i3) {
                            i4 = i3;
                        }
                        if (i4 < 8) {
                            i4 = 8;
                        }
                        c4009gg1.b = Arrays.copyOf(iArr, i4);
                        c4009gg1.c = Arrays.copyOf(c4009gg1.c, i4);
                    }
                    System.arraycopy(c4009gg12.b, 0, c4009gg1.b, c4009gg1.a, c4009gg12.a);
                    System.arraycopy(c4009gg12.c, 0, c4009gg1.c, c4009gg1.a, c4009gg12.a);
                    c4009gg1.a = i3;
                }
            }
        }
        abstractC8279z00.unknownFields = c4009gg1;
    }
}
