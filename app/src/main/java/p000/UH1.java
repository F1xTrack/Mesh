package p000;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class UH1 {

    /* renamed from: a */
    public static final Class f11716a;

    /* renamed from: b */
    public static final PI1 f11717b;

    /* renamed from: c */
    public static final PI1 f11718c;

    static {
        Class<?> cls;
        Class<?> cls2;
        PI1 pi1 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f11716a = cls;
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
        f11717b = pi1;
        f11718c = new PI1();
    }

    /* renamed from: A */
    public static void m7955A(int i, List list, C10525oT0 c10525oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9854jD1 c9854jD1 = (C9854jD1) c10525oT0.f39025a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c9854jD1.m22003l(i << 3);
                if (iIntValue >= 0) {
                    c9854jD1.m22003l(iIntValue);
                } else {
                    c9854jD1.m22005n(iIntValue);
                }
                i2++;
            }
            return;
        }
        c9854jD1.m22002k(i, 2);
        int iM21993s = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM21993s += C9854jD1.m21993s(((Integer) list.get(i3)).intValue());
        }
        c9854jD1.m22003l(iM21993s);
        while (i2 < list.size()) {
            int iIntValue2 = ((Integer) list.get(i2)).intValue();
            if (iIntValue2 >= 0) {
                c9854jD1.m22003l(iIntValue2);
            } else {
                c9854jD1.m22005n(iIntValue2);
            }
            i2++;
        }
    }

    /* renamed from: B */
    public static void m7956B(int i, List list, C10525oT0 c10525oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9854jD1 c9854jD1 = (C9854jD1) c10525oT0.f39025a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c9854jD1.m22004m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c9854jD1.m22002k(i, 2);
        int iM21993s = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM21993s += C9854jD1.m21993s(((Long) list.get(i3)).longValue());
        }
        c9854jD1.m22003l(iM21993s);
        while (i2 < list.size()) {
            c9854jD1.m22005n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: C */
    public static void m7957C(int i, List list, C10525oT0 c10525oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9854jD1 c9854jD1 = (C9854jD1) c10525oT0.f39025a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c9854jD1.m21997f(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c9854jD1.m22002k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        c9854jD1.m22003l(i3);
        while (i2 < list.size()) {
            c9854jD1.m21998g(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: a */
    public static void m7958a(int i, List list, C10525oT0 c10525oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9854jD1 c9854jD1 = (C9854jD1) c10525oT0.f39025a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c9854jD1.m21999h(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c9854jD1.m22002k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        c9854jD1.m22003l(i3);
        while (i2 < list.size()) {
            c9854jD1.m22000i(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: b */
    public static void m7959b(int i, List list, C10525oT0 c10525oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9854jD1 c9854jD1 = (C9854jD1) c10525oT0.f39025a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c9854jD1.m22003l(i << 3);
                c9854jD1.m22003l((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return;
        }
        c9854jD1.m22002k(i, 2);
        int iM21992r = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM21992r += C9854jD1.m21992r((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        c9854jD1.m22003l(iM21992r);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            c9854jD1.m22003l((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i2++;
        }
    }

    /* renamed from: c */
    public static void m7960c(int i, List list, C10525oT0 c10525oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9854jD1 c9854jD1 = (C9854jD1) c10525oT0.f39025a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c9854jD1.m22004m(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        c9854jD1.m22002k(i, 2);
        int iM21993s = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM21993s += C9854jD1.m21993s((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        c9854jD1.m22003l(iM21993s);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c9854jD1.m22005n((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    /* renamed from: d */
    public static void m7961d(int i, List list, C10525oT0 c10525oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9854jD1 c9854jD1 = (C9854jD1) c10525oT0.f39025a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c9854jD1.m22003l(i << 3);
                c9854jD1.m22003l(iIntValue);
                i2++;
            }
            return;
        }
        c9854jD1.m22002k(i, 2);
        int iM21992r = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM21992r += C9854jD1.m21992r(((Integer) list.get(i3)).intValue());
        }
        c9854jD1.m22003l(iM21992r);
        while (i2 < list.size()) {
            c9854jD1.m22003l(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: e */
    public static void m7962e(int i, List list, C10525oT0 c10525oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9854jD1 c9854jD1 = (C9854jD1) c10525oT0.f39025a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c9854jD1.m22004m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c9854jD1.m22002k(i, 2);
        int iM21993s = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM21993s += C9854jD1.m21993s(((Long) list.get(i3)).longValue());
        }
        c9854jD1.m22003l(iM21993s);
        while (i2 < list.size()) {
            c9854jD1.m22005n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: f */
    public static boolean m7963f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: g */
    public static int m7964g(List list) {
        int iM21993s;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IE1) {
            IE1 ie1 = (IE1) list;
            iM21993s = 0;
            while (i < size) {
                ie1.m3790h(i);
                iM21993s += C9854jD1.m21993s(ie1.f4848b[i]);
                i++;
            }
        } else {
            iM21993s = 0;
            while (i < size) {
                iM21993s += C9854jD1.m21993s(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM21993s;
    }

    /* renamed from: h */
    public static int m7965h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C9854jD1.m21992r(i << 3) + 4) * size;
    }

    /* renamed from: i */
    public static int m7966i(List list) {
        return list.size() * 4;
    }

    /* renamed from: j */
    public static int m7967j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C9854jD1.m21992r(i << 3) + 8) * size;
    }

    /* renamed from: k */
    public static int m7968k(List list) {
        return list.size() * 8;
    }

    /* renamed from: l */
    public static int m7969l(List list) {
        int iM21993s;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IE1) {
            IE1 ie1 = (IE1) list;
            iM21993s = 0;
            while (i < size) {
                ie1.m3790h(i);
                iM21993s += C9854jD1.m21993s(ie1.f4848b[i]);
                i++;
            }
        } else {
            iM21993s = 0;
            while (i < size) {
                iM21993s += C9854jD1.m21993s(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM21993s;
    }

    /* renamed from: m */
    public static int m7970m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC8831bG1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM21993s = 0;
        for (int i = 0; i < size; i++) {
            iM21993s += C9854jD1.m21993s(((Long) list.get(i)).longValue());
        }
        return iM21993s;
    }

    /* renamed from: n */
    public static int m7971n(int i, Object obj, PH1 ph1) {
        return C9854jD1.m21990p((DB1) obj, ph1) + C9854jD1.m21992r(i << 3);
    }

    /* renamed from: o */
    public static int m7972o(List list) {
        int iM21992r;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IE1) {
            IE1 ie1 = (IE1) list;
            iM21992r = 0;
            while (i < size) {
                ie1.m3790h(i);
                int i2 = ie1.f4848b[i];
                iM21992r += C9854jD1.m21992r((i2 >> 31) ^ (i2 + i2));
                i++;
            }
        } else {
            iM21992r = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM21992r += C9854jD1.m21992r((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iM21992r;
    }

    /* renamed from: p */
    public static int m7973p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC8831bG1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM21993s = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iM21993s += C9854jD1.m21993s((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iM21993s;
    }

    /* renamed from: q */
    public static int m7974q(List list) {
        int iM21992r;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IE1) {
            IE1 ie1 = (IE1) list;
            iM21992r = 0;
            while (i < size) {
                ie1.m3790h(i);
                iM21992r += C9854jD1.m21992r(ie1.f4848b[i]);
                i++;
            }
        } else {
            iM21992r = 0;
            while (i < size) {
                iM21992r += C9854jD1.m21992r(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM21992r;
    }

    /* renamed from: r */
    public static int m7975r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC8831bG1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM21993s = 0;
        for (int i = 0; i < size; i++) {
            iM21993s += C9854jD1.m21993s(((Long) list.get(i)).longValue());
        }
        return iM21993s;
    }

    /* renamed from: s */
    public static Object m7976s(Object obj, int i, int i2, Object obj2, PI1 pi1) {
        Object obj3 = obj2;
        if (obj2 == null) {
            pi1.getClass();
            EE1 ee1 = (EE1) obj;
            MI1 mi1 = ee1.zzc;
            obj3 = mi1;
            if (mi1 == MI1.f7082f) {
                MI1 mi1M5297b = MI1.m5297b();
                ee1.zzc = mi1M5297b;
                obj3 = mi1M5297b;
            }
        }
        pi1.getClass();
        ((MI1) obj3).m5299c(i << 3, Long.valueOf(i2));
        return obj3;
    }

    /* renamed from: t */
    public static void m7977t(PI1 pi1, Object obj, Object obj2) {
        pi1.getClass();
        EE1 ee1 = (EE1) obj;
        MI1 mi1 = ee1.zzc;
        MI1 mi12 = ((EE1) obj2).zzc;
        MI1 mi13 = MI1.f7082f;
        if (!mi13.equals(mi12)) {
            if (mi13.equals(mi1)) {
                int i = mi1.f7083a + mi12.f7083a;
                int[] iArrCopyOf = Arrays.copyOf(mi1.f7084b, i);
                System.arraycopy(mi12.f7084b, 0, iArrCopyOf, mi1.f7083a, mi12.f7083a);
                Object[] objArrCopyOf = Arrays.copyOf(mi1.f7085c, i);
                System.arraycopy(mi12.f7085c, 0, objArrCopyOf, mi1.f7083a, mi12.f7083a);
                mi1 = new MI1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                mi1.getClass();
                if (!mi12.equals(mi13)) {
                    if (!mi1.f7087e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = mi1.f7083a + mi12.f7083a;
                    mi1.m5301e(i2);
                    System.arraycopy(mi12.f7084b, 0, mi1.f7084b, mi1.f7083a, mi12.f7083a);
                    System.arraycopy(mi12.f7085c, 0, mi1.f7085c, mi1.f7083a, mi12.f7083a);
                    mi1.f7083a = i2;
                }
            }
        }
        ee1.zzc = mi1;
    }

    /* renamed from: u */
    public static void m7978u(int i, List list, C10525oT0 c10525oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9854jD1 c9854jD1 = (C9854jD1) c10525oT0.f39025a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                c9854jD1.m22003l(i << 3);
                c9854jD1.m21994c(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        c9854jD1.m22002k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        c9854jD1.m22003l(i3);
        while (i2 < list.size()) {
            c9854jD1.m21994c(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* renamed from: v */
    public static void m7979v(int i, List list, C10525oT0 c10525oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9854jD1 c9854jD1 = (C9854jD1) c10525oT0.f39025a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c9854jD1.m21999h(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        c9854jD1.m22002k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        c9854jD1.m22003l(i3);
        while (i2 < list.size()) {
            c9854jD1.m22000i(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: w */
    public static void m7980w(int i, List list, C10525oT0 c10525oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9854jD1 c9854jD1 = (C9854jD1) c10525oT0.f39025a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c9854jD1.m22003l(i << 3);
                if (iIntValue >= 0) {
                    c9854jD1.m22003l(iIntValue);
                } else {
                    c9854jD1.m22005n(iIntValue);
                }
                i2++;
            }
            return;
        }
        c9854jD1.m22002k(i, 2);
        int iM21993s = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM21993s += C9854jD1.m21993s(((Integer) list.get(i3)).intValue());
        }
        c9854jD1.m22003l(iM21993s);
        while (i2 < list.size()) {
            int iIntValue2 = ((Integer) list.get(i2)).intValue();
            if (iIntValue2 >= 0) {
                c9854jD1.m22003l(iIntValue2);
            } else {
                c9854jD1.m22005n(iIntValue2);
            }
            i2++;
        }
    }

    /* renamed from: x */
    public static void m7981x(int i, List list, C10525oT0 c10525oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9854jD1 c9854jD1 = (C9854jD1) c10525oT0.f39025a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c9854jD1.m21997f(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c9854jD1.m22002k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        c9854jD1.m22003l(i3);
        while (i2 < list.size()) {
            c9854jD1.m21998g(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: y */
    public static void m7982y(int i, List list, C10525oT0 c10525oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9854jD1 c9854jD1 = (C9854jD1) c10525oT0.f39025a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c9854jD1.m21999h(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c9854jD1.m22002k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        c9854jD1.m22003l(i3);
        while (i2 < list.size()) {
            c9854jD1.m22000i(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public static void m7983z(int i, List list, C10525oT0 c10525oT0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9854jD1 c9854jD1 = (C9854jD1) c10525oT0.f39025a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c9854jD1.m21997f(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        c9854jD1.m22002k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        c9854jD1.m22003l(i3);
        while (i2 < list.size()) {
            c9854jD1.m21998g(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }
}
