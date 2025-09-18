package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class UH1 {
    public static final Class a;
    public static final PI1 b;
    public static final PI1 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        PI1 pi1 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
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
                pi1 = (PI1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = pi1;
        c = new PI1();
    }

    public static void A(int i, List list, C6273oT0 c6273oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5271jD1 c5271jD1 = (C5271jD1) c6273oT0.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c5271jD1.l(i << 3);
                if (iIntValue >= 0) {
                    c5271jD1.l(iIntValue);
                } else {
                    c5271jD1.n(iIntValue);
                }
                i2++;
            }
            return;
        }
        c5271jD1.k(i, 2);
        int iS = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iS += C5271jD1.s(((Integer) list.get(i3)).intValue());
        }
        c5271jD1.l(iS);
        while (i2 < list.size()) {
            int iIntValue2 = ((Integer) list.get(i2)).intValue();
            if (iIntValue2 >= 0) {
                c5271jD1.l(iIntValue2);
            } else {
                c5271jD1.n(iIntValue2);
            }
            i2++;
        }
    }

    public static void B(int i, List list, C6273oT0 c6273oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5271jD1 c5271jD1 = (C5271jD1) c6273oT0.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c5271jD1.m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c5271jD1.k(i, 2);
        int iS = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iS += C5271jD1.s(((Long) list.get(i3)).longValue());
        }
        c5271jD1.l(iS);
        while (i2 < list.size()) {
            c5271jD1.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void C(int i, List list, C6273oT0 c6273oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5271jD1 c5271jD1 = (C5271jD1) c6273oT0.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c5271jD1.f(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c5271jD1.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        c5271jD1.l(i3);
        while (i2 < list.size()) {
            c5271jD1.g(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void a(int i, List list, C6273oT0 c6273oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5271jD1 c5271jD1 = (C5271jD1) c6273oT0.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c5271jD1.h(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c5271jD1.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        c5271jD1.l(i3);
        while (i2 < list.size()) {
            c5271jD1.i(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void b(int i, List list, C6273oT0 c6273oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5271jD1 c5271jD1 = (C5271jD1) c6273oT0.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c5271jD1.l(i << 3);
                c5271jD1.l((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return;
        }
        c5271jD1.k(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iR += C5271jD1.r((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        c5271jD1.l(iR);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            c5271jD1.l((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i2++;
        }
    }

    public static void c(int i, List list, C6273oT0 c6273oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5271jD1 c5271jD1 = (C5271jD1) c6273oT0.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c5271jD1.m(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        c5271jD1.k(i, 2);
        int iS = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iS += C5271jD1.s((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        c5271jD1.l(iS);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c5271jD1.n((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    public static void d(int i, List list, C6273oT0 c6273oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5271jD1 c5271jD1 = (C5271jD1) c6273oT0.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c5271jD1.l(i << 3);
                c5271jD1.l(iIntValue);
                i2++;
            }
            return;
        }
        c5271jD1.k(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR += C5271jD1.r(((Integer) list.get(i3)).intValue());
        }
        c5271jD1.l(iR);
        while (i2 < list.size()) {
            c5271jD1.l(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void e(int i, List list, C6273oT0 c6273oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5271jD1 c5271jD1 = (C5271jD1) c6273oT0.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c5271jD1.m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c5271jD1.k(i, 2);
        int iS = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iS += C5271jD1.s(((Long) list.get(i3)).longValue());
        }
        c5271jD1.l(iS);
        while (i2 < list.size()) {
            c5271jD1.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int g(List list) {
        int iS;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IE1) {
            IE1 ie1 = (IE1) list;
            iS = 0;
            while (i < size) {
                ie1.h(i);
                iS += C5271jD1.s(ie1.b[i]);
                i++;
            }
        } else {
            iS = 0;
            while (i < size) {
                iS += C5271jD1.s(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iS;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C5271jD1.r(i << 3) + 4) * size;
    }

    public static int i(List list) {
        return list.size() * 4;
    }

    public static int j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C5271jD1.r(i << 3) + 8) * size;
    }

    public static int k(List list) {
        return list.size() * 8;
    }

    public static int l(List list) {
        int iS;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IE1) {
            IE1 ie1 = (IE1) list;
            iS = 0;
            while (i < size) {
                ie1.h(i);
                iS += C5271jD1.s(ie1.b[i]);
                i++;
            }
        } else {
            iS = 0;
            while (i < size) {
                iS += C5271jD1.s(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iS;
    }

    public static int m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2293bG1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iS = 0;
        for (int i = 0; i < size; i++) {
            iS += C5271jD1.s(((Long) list.get(i)).longValue());
        }
        return iS;
    }

    public static int n(int i, Object obj, PH1 ph1) {
        return C5271jD1.p((DB1) obj, ph1) + C5271jD1.r(i << 3);
    }

    public static int o(List list) {
        int iR;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IE1) {
            IE1 ie1 = (IE1) list;
            iR = 0;
            while (i < size) {
                ie1.h(i);
                int i2 = ie1.b[i];
                iR += C5271jD1.r((i2 >> 31) ^ (i2 + i2));
                i++;
            }
        } else {
            iR = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iR += C5271jD1.r((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iR;
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2293bG1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iS = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iS += C5271jD1.s((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iS;
    }

    public static int q(List list) {
        int iR;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IE1) {
            IE1 ie1 = (IE1) list;
            iR = 0;
            while (i < size) {
                ie1.h(i);
                iR += C5271jD1.r(ie1.b[i]);
                i++;
            }
        } else {
            iR = 0;
            while (i < size) {
                iR += C5271jD1.r(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iR;
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2293bG1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iS = 0;
        for (int i = 0; i < size; i++) {
            iS += C5271jD1.s(((Long) list.get(i)).longValue());
        }
        return iS;
    }

    public static Object s(Object obj, int i, int i2, Object obj2, PI1 pi1) {
        Object obj3 = obj2;
        if (obj2 == null) {
            pi1.getClass();
            EE1 ee1 = (EE1) obj;
            MI1 mi1 = ee1.zzc;
            obj3 = mi1;
            if (mi1 == MI1.f) {
                MI1 mi1B = MI1.b();
                ee1.zzc = mi1B;
                obj3 = mi1B;
            }
        }
        pi1.getClass();
        ((MI1) obj3).c(i << 3, Long.valueOf(i2));
        return obj3;
    }

    public static void t(PI1 pi1, Object obj, Object obj2) {
        pi1.getClass();
        EE1 ee1 = (EE1) obj;
        MI1 mi1 = ee1.zzc;
        MI1 mi12 = ((EE1) obj2).zzc;
        MI1 mi13 = MI1.f;
        if (!mi13.equals(mi12)) {
            if (mi13.equals(mi1)) {
                int i = mi1.a + mi12.a;
                int[] iArrCopyOf = Arrays.copyOf(mi1.b, i);
                System.arraycopy(mi12.b, 0, iArrCopyOf, mi1.a, mi12.a);
                Object[] objArrCopyOf = Arrays.copyOf(mi1.c, i);
                System.arraycopy(mi12.c, 0, objArrCopyOf, mi1.a, mi12.a);
                mi1 = new MI1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                mi1.getClass();
                if (!mi12.equals(mi13)) {
                    if (!mi1.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = mi1.a + mi12.a;
                    mi1.e(i2);
                    System.arraycopy(mi12.b, 0, mi1.b, mi1.a, mi12.a);
                    System.arraycopy(mi12.c, 0, mi1.c, mi1.a, mi12.a);
                    mi1.a = i2;
                }
            }
        }
        ee1.zzc = mi1;
    }

    public static void u(int i, List list, C6273oT0 c6273oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5271jD1 c5271jD1 = (C5271jD1) c6273oT0.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                c5271jD1.l(i << 3);
                c5271jD1.c(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        c5271jD1.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        c5271jD1.l(i3);
        while (i2 < list.size()) {
            c5271jD1.c(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void v(int i, List list, C6273oT0 c6273oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5271jD1 c5271jD1 = (C5271jD1) c6273oT0.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c5271jD1.h(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        c5271jD1.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        c5271jD1.l(i3);
        while (i2 < list.size()) {
            c5271jD1.i(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void w(int i, List list, C6273oT0 c6273oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5271jD1 c5271jD1 = (C5271jD1) c6273oT0.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c5271jD1.l(i << 3);
                if (iIntValue >= 0) {
                    c5271jD1.l(iIntValue);
                } else {
                    c5271jD1.n(iIntValue);
                }
                i2++;
            }
            return;
        }
        c5271jD1.k(i, 2);
        int iS = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iS += C5271jD1.s(((Integer) list.get(i3)).intValue());
        }
        c5271jD1.l(iS);
        while (i2 < list.size()) {
            int iIntValue2 = ((Integer) list.get(i2)).intValue();
            if (iIntValue2 >= 0) {
                c5271jD1.l(iIntValue2);
            } else {
                c5271jD1.n(iIntValue2);
            }
            i2++;
        }
    }

    public static void x(int i, List list, C6273oT0 c6273oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5271jD1 c5271jD1 = (C5271jD1) c6273oT0.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c5271jD1.f(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c5271jD1.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        c5271jD1.l(i3);
        while (i2 < list.size()) {
            c5271jD1.g(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void y(int i, List list, C6273oT0 c6273oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5271jD1 c5271jD1 = (C5271jD1) c6273oT0.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c5271jD1.h(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c5271jD1.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        c5271jD1.l(i3);
        while (i2 < list.size()) {
            c5271jD1.i(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void z(int i, List list, C6273oT0 c6273oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5271jD1 c5271jD1 = (C5271jD1) c6273oT0.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c5271jD1.f(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        c5271jD1.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        c5271jD1.l(i3);
        while (i2 < list.size()) {
            c5271jD1.g(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }
}
