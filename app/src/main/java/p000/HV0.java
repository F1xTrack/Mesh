package p000;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class HV0 {

    /* renamed from: a */
    public static final Class f4324a;

    /* renamed from: b */
    public static final C9784ig1 f4325b;

    /* renamed from: c */
    public static final C9784ig1 f4326c;

    static {
        Class<?> cls;
        Class<?> cls2;
        C9784ig1 c9784ig1 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f4324a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                c9784ig1 = (C9784ig1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f4325b = c9784ig1;
        f4326c = new C9784ig1();
    }

    /* renamed from: A */
    public static boolean m3453A(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: B */
    public static void m3454B(int i, List list, C8342Tu0 c8342Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                c6518nu.m23274H(i, 0);
                c6518nu.m23278y(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c6518nu.m23274H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C6518nu.f38597e;
            i3++;
        }
        c6518nu.m23275I(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            c6518nu.m23278y(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: C */
    public static void m3455C(int i, List list, C8342Tu0 c8342Tu0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8342Tu0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C0299Ek c0299Ek = (C0299Ek) list.get(i2);
            C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
            c6518nu.m23274H(i, 2);
            c6518nu.m23267A(c0299Ek);
        }
    }

    /* renamed from: D */
    public static void m3456D(int i, List list, C8342Tu0 c8342Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c6518nu.getClass();
                c6518nu.m23270D(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c6518nu.m23274H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C6518nu.f38597e;
            i3 += 8;
        }
        c6518nu.m23275I(i3);
        while (i2 < list.size()) {
            c6518nu.m23271E(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: E */
    public static void m3457E(int i, List list, C8342Tu0 c8342Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c6518nu.m23274H(i, 0);
                c6518nu.m23272F(iIntValue);
            }
            return;
        }
        c6518nu.m23274H(i, 2);
        int iM23254l = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM23254l += C6518nu.m23254l(((Integer) list.get(i3)).intValue());
        }
        c6518nu.m23275I(iM23254l);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c6518nu.m23272F(((Integer) list.get(i4)).intValue());
        }
    }

    /* renamed from: F */
    public static void m3458F(int i, List list, C8342Tu0 c8342Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6518nu.m23268B(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c6518nu.m23274H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C6518nu.f38597e;
            i3 += 4;
        }
        c6518nu.m23275I(i3);
        while (i2 < list.size()) {
            c6518nu.m23269C(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: G */
    public static void m3459G(int i, List list, C8342Tu0 c8342Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6518nu.m23270D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c6518nu.m23274H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C6518nu.f38597e;
            i3 += 8;
        }
        c6518nu.m23275I(i3);
        while (i2 < list.size()) {
            c6518nu.m23271E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: H */
    public static void m3460H(int i, List list, C8342Tu0 c8342Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c6518nu.getClass();
                c6518nu.m23268B(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c6518nu.m23274H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C6518nu.f38597e;
            i3 += 4;
        }
        c6518nu.m23275I(i3);
        while (i2 < list.size()) {
            c6518nu.m23269C(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: I */
    public static void m3461I(int i, List list, C8342Tu0 c8342Tu0, DV0 dv0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8342Tu0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c8342Tu0.m7805B0(i, list.get(i2), dv0);
        }
    }

    /* renamed from: J */
    public static void m3462J(int i, List list, C8342Tu0 c8342Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c6518nu.m23274H(i, 0);
                c6518nu.m23272F(iIntValue);
            }
            return;
        }
        c6518nu.m23274H(i, 2);
        int iM23254l = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM23254l += C6518nu.m23254l(((Integer) list.get(i3)).intValue());
        }
        c6518nu.m23275I(iM23254l);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c6518nu.m23272F(((Integer) list.get(i4)).intValue());
        }
    }

    /* renamed from: K */
    public static void m3463K(int i, List list, C8342Tu0 c8342Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6518nu.m23276J(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c6518nu.m23274H(i, 2);
        int iM23266x = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM23266x += C6518nu.m23266x(((Long) list.get(i3)).longValue());
        }
        c6518nu.m23275I(iM23266x);
        while (i2 < list.size()) {
            c6518nu.m23277K(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: L */
    public static void m3464L(int i, List list, C8342Tu0 c8342Tu0, DV0 dv0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8342Tu0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c8342Tu0.m7808E0(i, list.get(i2), dv0);
        }
    }

    /* renamed from: M */
    public static void m3465M(int i, List list, C8342Tu0 c8342Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6518nu.m23268B(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c6518nu.m23274H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C6518nu.f38597e;
            i3 += 4;
        }
        c6518nu.m23275I(i3);
        while (i2 < list.size()) {
            c6518nu.m23269C(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: N */
    public static void m3466N(int i, List list, C8342Tu0 c8342Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6518nu.m23270D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c6518nu.m23274H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C6518nu.f38597e;
            i3 += 8;
        }
        c6518nu.m23275I(i3);
        while (i2 < list.size()) {
            c6518nu.m23271E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: O */
    public static void m3467O(int i, List list, C8342Tu0 c8342Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c6518nu.m23274H(i, 0);
                c6518nu.m23275I((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        c6518nu.m23274H(i, 2);
        int iM23264v = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM23264v += C6518nu.m23264v((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c6518nu.m23275I(iM23264v);
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue3 = ((Integer) list.get(i4)).intValue();
            c6518nu.m23275I((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    /* renamed from: P */
    public static void m3468P(int i, List list, C8342Tu0 c8342Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c6518nu.m23276J(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        c6518nu.m23274H(i, 2);
        int iM23266x = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM23266x += C6518nu.m23266x((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c6518nu.m23275I(iM23266x);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c6518nu.m23277K((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* renamed from: Q */
    public static void m3469Q(int i, List list, C8342Tu0 c8342Tu0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8342Tu0.getClass();
        boolean z = list instanceof InterfaceC9147di0;
        C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                String str = (String) list.get(i2);
                c6518nu.m23274H(i, 2);
                c6518nu.m23273G(str);
                i2++;
            }
            return;
        }
        InterfaceC9147di0 interfaceC9147di0 = (InterfaceC9147di0) list;
        while (i2 < list.size()) {
            Object objMo9787p = interfaceC9147di0.mo9787p(i2);
            if (objMo9787p instanceof String) {
                c6518nu.m23274H(i, 2);
                c6518nu.m23273G((String) objMo9787p);
            } else {
                c6518nu.m23274H(i, 2);
                c6518nu.m23267A((C0299Ek) objMo9787p);
            }
            i2++;
        }
    }

    /* renamed from: R */
    public static void m3470R(int i, List list, C8342Tu0 c8342Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c6518nu.m23274H(i, 0);
                c6518nu.m23275I(iIntValue);
            }
            return;
        }
        c6518nu.m23274H(i, 2);
        int iM23264v = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM23264v += C6518nu.m23264v(((Integer) list.get(i3)).intValue());
        }
        c6518nu.m23275I(iM23264v);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c6518nu.m23275I(((Integer) list.get(i4)).intValue());
        }
    }

    /* renamed from: S */
    public static void m3471S(int i, List list, C8342Tu0 c8342Tu0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6518nu.m23276J(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c6518nu.m23274H(i, 2);
        int iM23266x = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM23266x += C6518nu.m23266x(((Long) list.get(i3)).longValue());
        }
        c6518nu.m23275I(iM23266x);
        while (i2 < list.size()) {
            c6518nu.m23277K(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public static int m3472a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C6518nu.m23244b(i) * size;
    }

    /* renamed from: b */
    public static int m3473b(List list) {
        return list.size();
    }

    /* renamed from: c */
    public static int m3474c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM23262t = C6518nu.m23262t(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM23262t += C6518nu.m23246d((C0299Ek) list.get(i2));
        }
        return iM23262t;
    }

    /* renamed from: d */
    public static int m3475d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6518nu.m23262t(i) * size) + m3476e(list);
    }

    /* renamed from: e */
    public static int m3476e(List list) {
        int iM23254l;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8816b90) {
            C8816b90 c8816b90 = (C8816b90) list;
            iM23254l = 0;
            while (i < size) {
                iM23254l += C6518nu.m23254l(c8816b90.getInt(i));
                i++;
            }
        } else {
            iM23254l = 0;
            while (i < size) {
                iM23254l += C6518nu.m23254l(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM23254l;
    }

    /* renamed from: f */
    public static int m3477f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C6518nu.m23249g(i) * size;
    }

    /* renamed from: g */
    public static int m3478g(List list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m3479h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C6518nu.m23250h(i) * size;
    }

    /* renamed from: i */
    public static int m3480i(List list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m3481j(int i, List list, DV0 dv0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM23252j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM23252j += C6518nu.m23252j(i, (AbstractC0568J0) list.get(i2), dv0);
        }
        return iM23252j;
    }

    /* renamed from: k */
    public static int m3482k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6518nu.m23262t(i) * size) + m3483l(list);
    }

    /* renamed from: l */
    public static int m3483l(List list) {
        int iM23254l;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8816b90) {
            C8816b90 c8816b90 = (C8816b90) list;
            iM23254l = 0;
            while (i < size) {
                iM23254l += C6518nu.m23254l(c8816b90.getInt(i));
                i++;
            }
        } else {
            iM23254l = 0;
            while (i < size) {
                iM23254l += C6518nu.m23254l(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM23254l;
    }

    /* renamed from: m */
    public static int m3484m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C6518nu.m23262t(i) * list.size()) + m3485n(list);
    }

    /* renamed from: n */
    public static int m3485n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC11584wl0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM23266x = 0;
        for (int i = 0; i < size; i++) {
            iM23266x += C6518nu.m23266x(((Long) list.get(i)).longValue());
        }
        return iM23266x;
    }

    /* renamed from: o */
    public static int m3486o(int i, Object obj, DV0 dv0) {
        int iM23262t = C6518nu.m23262t(i);
        int iMo4101c = ((AbstractC0568J0) obj).mo4101c(dv0);
        return C6518nu.m23264v(iMo4101c) + iMo4101c + iM23262t;
    }

    /* renamed from: p */
    public static int m3487p(int i, List list, DV0 dv0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM23262t = C6518nu.m23262t(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iMo4101c = ((AbstractC0568J0) list.get(i2)).mo4101c(dv0);
            iM23262t += C6518nu.m23264v(iMo4101c) + iMo4101c;
        }
        return iM23262t;
    }

    /* renamed from: q */
    public static int m3488q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6518nu.m23262t(i) * size) + m3489r(list);
    }

    /* renamed from: r */
    public static int m3489r(List list) {
        int iM23264v;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8816b90) {
            C8816b90 c8816b90 = (C8816b90) list;
            iM23264v = 0;
            while (i < size) {
                int i2 = c8816b90.getInt(i);
                iM23264v += C6518nu.m23264v((i2 >> 31) ^ (i2 << 1));
                i++;
            }
        } else {
            iM23264v = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM23264v += C6518nu.m23264v((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
        }
        return iM23264v;
    }

    /* renamed from: s */
    public static int m3490s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6518nu.m23262t(i) * size) + m3491t(list);
    }

    /* renamed from: t */
    public static int m3491t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC11584wl0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM23266x = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iM23266x += C6518nu.m23266x((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iM23266x;
    }

    /* renamed from: u */
    public static int m3492u(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM23262t = C6518nu.m23262t(i) * size;
        if (list instanceof InterfaceC9147di0) {
            InterfaceC9147di0 interfaceC9147di0 = (InterfaceC9147di0) list;
            while (i2 < size) {
                Object objMo9787p = interfaceC9147di0.mo9787p(i2);
                iM23262t = (objMo9787p instanceof C0299Ek ? C6518nu.m23246d((C0299Ek) objMo9787p) : C6518nu.m23261s((String) objMo9787p)) + iM23262t;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iM23262t = (obj instanceof C0299Ek ? C6518nu.m23246d((C0299Ek) obj) : C6518nu.m23261s((String) obj)) + iM23262t;
                i2++;
            }
        }
        return iM23262t;
    }

    /* renamed from: v */
    public static int m3493v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6518nu.m23262t(i) * size) + m3494w(list);
    }

    /* renamed from: w */
    public static int m3494w(List list) {
        int iM23264v;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8816b90) {
            C8816b90 c8816b90 = (C8816b90) list;
            iM23264v = 0;
            while (i < size) {
                iM23264v += C6518nu.m23264v(c8816b90.getInt(i));
                i++;
            }
        } else {
            iM23264v = 0;
            while (i < size) {
                iM23264v += C6518nu.m23264v(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM23264v;
    }

    /* renamed from: x */
    public static int m3495x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6518nu.m23262t(i) * size) + m3496y(list);
    }

    /* renamed from: y */
    public static int m3496y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC11584wl0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM23266x = 0;
        for (int i = 0; i < size; i++) {
            iM23266x += C6518nu.m23266x(((Long) list.get(i)).longValue());
        }
        return iM23266x;
    }

    /* renamed from: z */
    public static void m3497z(C9784ig1 c9784ig1, Object obj, Object obj2) {
        c9784ig1.getClass();
        AbstractC11868z00 abstractC11868z00 = (AbstractC11868z00) obj;
        C9528gg1 c9528gg1 = abstractC11868z00.unknownFields;
        C9528gg1 c9528gg12 = ((AbstractC11868z00) obj2).unknownFields;
        C9528gg1 c9528gg13 = C9528gg1.f27928f;
        if (!c9528gg13.equals(c9528gg12)) {
            if (c9528gg13.equals(c9528gg1)) {
                int i = c9528gg1.f27929a + c9528gg12.f27929a;
                int[] iArrCopyOf = Arrays.copyOf(c9528gg1.f27930b, i);
                System.arraycopy(c9528gg12.f27930b, 0, iArrCopyOf, c9528gg1.f27929a, c9528gg12.f27929a);
                Object[] objArrCopyOf = Arrays.copyOf(c9528gg1.f27931c, i);
                System.arraycopy(c9528gg12.f27931c, 0, objArrCopyOf, c9528gg1.f27929a, c9528gg12.f27929a);
                c9528gg1 = new C9528gg1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c9528gg1.getClass();
                if (!c9528gg12.equals(c9528gg13)) {
                    if (!c9528gg1.f27933e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = c9528gg1.f27929a;
                    int i3 = c9528gg12.f27929a + i2;
                    int[] iArr = c9528gg1.f27930b;
                    if (i3 > iArr.length) {
                        int i4 = (i2 / 2) + i2;
                        if (i4 < i3) {
                            i4 = i3;
                        }
                        if (i4 < 8) {
                            i4 = 8;
                        }
                        c9528gg1.f27930b = Arrays.copyOf(iArr, i4);
                        c9528gg1.f27931c = Arrays.copyOf(c9528gg1.f27931c, i4);
                    }
                    System.arraycopy(c9528gg12.f27930b, 0, c9528gg1.f27930b, c9528gg1.f27929a, c9528gg12.f27929a);
                    System.arraycopy(c9528gg12.f27931c, 0, c9528gg1.f27931c, c9528gg1.f27929a, c9528gg12.f27929a);
                    c9528gg1.f27929a = i3;
                }
            }
        }
        abstractC11868z00.unknownFields = c9528gg1;
    }
}
