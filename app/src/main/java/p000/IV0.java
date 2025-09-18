package p000;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class IV0 {

    /* renamed from: a */
    public static final Class f4959a;

    /* renamed from: b */
    public static final C9912jg1 f4960b;

    /* renamed from: c */
    public static final C9912jg1 f4961c;

    /* renamed from: d */
    public static final C9912jg1 f4962d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f4959a = cls;
        f4960b = m3882A(false);
        f4961c = m3882A(true);
        f4962d = new C9912jg1();
    }

    /* renamed from: A */
    public static C9912jg1 m3882A(boolean z) {
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
            return (C9912jg1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: B */
    public static void m3883B(C9912jg1 c9912jg1, B00 b00, B00 b002) {
        c9912jg1.getClass();
        C9656hg1 c9656hg1 = b00.unknownFields;
        C9656hg1 c9656hg12 = b002.unknownFields;
        if (!c9656hg12.equals(C9656hg1.f28522f)) {
            int i = c9656hg1.f28523a + c9656hg12.f28523a;
            int[] iArrCopyOf = Arrays.copyOf(c9656hg1.f28524b, i);
            System.arraycopy(c9656hg12.f28524b, 0, iArrCopyOf, c9656hg1.f28523a, c9656hg12.f28523a);
            Object[] objArrCopyOf = Arrays.copyOf(c9656hg1.f28525c, i);
            System.arraycopy(c9656hg12.f28525c, 0, objArrCopyOf, c9656hg1.f28523a, c9656hg12.f28523a);
            c9656hg1 = new C9656hg1(i, iArrCopyOf, objArrCopyOf, true);
        }
        b00.unknownFields = c9656hg1;
    }

    /* renamed from: C */
    public static boolean m3884C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: D */
    public static void m3885D(int i, List list, C8170Qm0 c8170Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6709qu c6709qu = (C6709qu) c8170Qm0.f9780b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6709qu.m24106I(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        c6709qu.m24117T(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C6709qu.f41238f;
            i3++;
        }
        c6709qu.m24119V(i3);
        while (i2 < list.size()) {
            c6709qu.m24104G(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* renamed from: E */
    public static void m3886E(int i, List list, C8170Qm0 c8170Qm0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8170Qm0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((C6709qu) c8170Qm0.f9780b).m24107J(i, (C0362Fk) list.get(i2));
        }
    }

    /* renamed from: F */
    public static void m3887F(int i, List list, C8170Qm0 c8170Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6709qu c6709qu = (C6709qu) c8170Qm0.f9780b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c6709qu.getClass();
                c6709qu.m24111N(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c6709qu.m24117T(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C6709qu.f41238f;
            i3 += 8;
        }
        c6709qu.m24119V(i3);
        while (i2 < list.size()) {
            c6709qu.m24112O(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: G */
    public static void m3888G(int i, List list, C8170Qm0 c8170Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6709qu c6709qu = (C6709qu) c8170Qm0.f9780b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6709qu.m24113P(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c6709qu.m24117T(i, 2);
        int iM24093r = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM24093r += C6709qu.m24093r(((Integer) list.get(i3)).intValue());
        }
        c6709qu.m24119V(iM24093r);
        while (i2 < list.size()) {
            c6709qu.m24114Q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: H */
    public static void m3889H(int i, List list, C8170Qm0 c8170Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6709qu c6709qu = (C6709qu) c8170Qm0.f9780b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6709qu.m24109L(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c6709qu.m24117T(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C6709qu.f41238f;
            i3 += 4;
        }
        c6709qu.m24119V(i3);
        while (i2 < list.size()) {
            c6709qu.m24110M(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: I */
    public static void m3890I(int i, List list, C8170Qm0 c8170Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6709qu c6709qu = (C6709qu) c8170Qm0.f9780b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6709qu.m24111N(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c6709qu.m24117T(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C6709qu.f41238f;
            i3 += 8;
        }
        c6709qu.m24119V(i3);
        while (i2 < list.size()) {
            c6709qu.m24112O(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: J */
    public static void m3891J(int i, List list, C8170Qm0 c8170Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6709qu c6709qu = (C6709qu) c8170Qm0.f9780b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c6709qu.getClass();
                c6709qu.m24109L(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c6709qu.m24117T(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C6709qu.f41238f;
            i3 += 4;
        }
        c6709qu.m24119V(i3);
        while (i2 < list.size()) {
            c6709qu.m24110M(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: K */
    public static void m3892K(int i, List list, C8170Qm0 c8170Qm0, EV0 ev0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8170Qm0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c8170Qm0.m6761H(i, list.get(i2), ev0);
        }
    }

    /* renamed from: L */
    public static void m3893L(int i, List list, C8170Qm0 c8170Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6709qu c6709qu = (C6709qu) c8170Qm0.f9780b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6709qu.m24113P(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c6709qu.m24117T(i, 2);
        int iM24093r = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM24093r += C6709qu.m24093r(((Integer) list.get(i3)).intValue());
        }
        c6709qu.m24119V(iM24093r);
        while (i2 < list.size()) {
            c6709qu.m24114Q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: M */
    public static void m3894M(int i, List list, C8170Qm0 c8170Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6709qu c6709qu = (C6709qu) c8170Qm0.f9780b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6709qu.m24120W(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c6709qu.m24117T(i, 2);
        int iM24082D = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM24082D += C6709qu.m24082D(((Long) list.get(i3)).longValue());
        }
        c6709qu.m24119V(iM24082D);
        while (i2 < list.size()) {
            c6709qu.m24121X(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: N */
    public static void m3895N(int i, List list, C8170Qm0 c8170Qm0, EV0 ev0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8170Qm0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c8170Qm0.m6765L(i, list.get(i2), ev0);
        }
    }

    /* renamed from: O */
    public static void m3896O(int i, List list, C8170Qm0 c8170Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6709qu c6709qu = (C6709qu) c8170Qm0.f9780b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6709qu.m24109L(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c6709qu.m24117T(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C6709qu.f41238f;
            i3 += 4;
        }
        c6709qu.m24119V(i3);
        while (i2 < list.size()) {
            c6709qu.m24110M(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: P */
    public static void m3897P(int i, List list, C8170Qm0 c8170Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6709qu c6709qu = (C6709qu) c8170Qm0.f9780b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6709qu.m24111N(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c6709qu.m24117T(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C6709qu.f41238f;
            i3 += 8;
        }
        c6709qu.m24119V(i3);
        while (i2 < list.size()) {
            c6709qu.m24112O(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: Q */
    public static void m3898Q(int i, List list, C8170Qm0 c8170Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6709qu c6709qu = (C6709qu) c8170Qm0.f9780b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c6709qu.m24118U(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        c6709qu.m24117T(i, 2);
        int iM24080B = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM24080B += C6709qu.m24080B((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c6709qu.m24119V(iM24080B);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            c6709qu.m24119V((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    /* renamed from: R */
    public static void m3899R(int i, List list, C8170Qm0 c8170Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6709qu c6709qu = (C6709qu) c8170Qm0.f9780b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c6709qu.m24120W(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        c6709qu.m24117T(i, 2);
        int iM24082D = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM24082D += C6709qu.m24082D((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c6709qu.m24119V(iM24082D);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c6709qu.m24121X((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* renamed from: S */
    public static void m3900S(int i, List list, C8170Qm0 c8170Qm0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8170Qm0.getClass();
        boolean z = list instanceof InterfaceC9403fi0;
        C6709qu c6709qu = (C6709qu) c8170Qm0.f9780b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6709qu.m24115R(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        InterfaceC9403fi0 interfaceC9403fi0 = (InterfaceC9403fi0) list;
        while (i2 < list.size()) {
            Object objMo10833p = interfaceC9403fi0.mo10833p(i2);
            if (objMo10833p instanceof String) {
                c6709qu.m24115R(i, (String) objMo10833p);
            } else {
                c6709qu.m24107J(i, (C0362Fk) objMo10833p);
            }
            i2++;
        }
    }

    /* renamed from: T */
    public static void m3901T(int i, List list, C8170Qm0 c8170Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6709qu c6709qu = (C6709qu) c8170Qm0.f9780b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6709qu.m24118U(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c6709qu.m24117T(i, 2);
        int iM24080B = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM24080B += C6709qu.m24080B(((Integer) list.get(i3)).intValue());
        }
        c6709qu.m24119V(iM24080B);
        while (i2 < list.size()) {
            c6709qu.m24119V(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: U */
    public static void m3902U(int i, List list, C8170Qm0 c8170Qm0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C6709qu c6709qu = (C6709qu) c8170Qm0.f9780b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c6709qu.m24120W(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c6709qu.m24117T(i, 2);
        int iM24082D = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM24082D += C6709qu.m24082D(((Long) list.get(i3)).longValue());
        }
        c6709qu.m24119V(iM24082D);
        while (i2 < list.size()) {
            c6709qu.m24121X(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public static int m3903a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C6709qu.m24083h(i) * size;
    }

    /* renamed from: b */
    public static int m3904b(List list) {
        return list.size();
    }

    /* renamed from: c */
    public static int m3905c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM24101z = C6709qu.m24101z(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM24101z += C6709qu.m24085j((C0362Fk) list.get(i2));
        }
        return iM24101z;
    }

    /* renamed from: d */
    public static int m3906d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6709qu.m24101z(i) * size) + m3907e(list);
    }

    /* renamed from: e */
    public static int m3907e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC8944c90) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM24093r = 0;
        for (int i = 0; i < size; i++) {
            iM24093r += C6709qu.m24093r(((Integer) list.get(i)).intValue());
        }
        return iM24093r;
    }

    /* renamed from: f */
    public static int m3908f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C6709qu.m24088m(i) * size;
    }

    /* renamed from: g */
    public static int m3909g(List list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m3910h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C6709qu.m24089n(i) * size;
    }

    /* renamed from: i */
    public static int m3911i(List list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m3912j(int i, List list, EV0 ev0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM24091p = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM24091p += C6709qu.m24091p(i, (AbstractC0694L0) list.get(i2), ev0);
        }
        return iM24091p;
    }

    /* renamed from: k */
    public static int m3913k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6709qu.m24101z(i) * size) + m3914l(list);
    }

    /* renamed from: l */
    public static int m3914l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC8944c90) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM24093r = 0;
        for (int i = 0; i < size; i++) {
            iM24093r += C6709qu.m24093r(((Integer) list.get(i)).intValue());
        }
        return iM24093r;
    }

    /* renamed from: m */
    public static int m3915m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C6709qu.m24101z(i) * list.size()) + m3916n(list);
    }

    /* renamed from: n */
    public static int m3916n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC11711xl0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM24082D = 0;
        for (int i = 0; i < size; i++) {
            iM24082D += C6709qu.m24082D(((Long) list.get(i)).longValue());
        }
        return iM24082D;
    }

    /* renamed from: o */
    public static int m3917o(int i, Object obj, EV0 ev0) {
        int iM24101z = C6709qu.m24101z(i);
        int iM4819b = ((AbstractC0694L0) obj).m4819b(ev0);
        return C6709qu.m24080B(iM4819b) + iM4819b + iM24101z;
    }

    /* renamed from: p */
    public static int m3918p(int i, List list, EV0 ev0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM24101z = C6709qu.m24101z(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iM4819b = ((AbstractC0694L0) list.get(i2)).m4819b(ev0);
            iM24101z += C6709qu.m24080B(iM4819b) + iM4819b;
        }
        return iM24101z;
    }

    /* renamed from: q */
    public static int m3919q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6709qu.m24101z(i) * size) + m3920r(list);
    }

    /* renamed from: r */
    public static int m3920r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC8944c90) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM24080B = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iM24080B += C6709qu.m24080B((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM24080B;
    }

    /* renamed from: s */
    public static int m3921s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6709qu.m24101z(i) * size) + m3922t(list);
    }

    /* renamed from: t */
    public static int m3922t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC11711xl0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM24082D = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iM24082D += C6709qu.m24082D((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iM24082D;
    }

    /* renamed from: u */
    public static int m3923u(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM24101z = C6709qu.m24101z(i) * size;
        if (list instanceof InterfaceC9403fi0) {
            InterfaceC9403fi0 interfaceC9403fi0 = (InterfaceC9403fi0) list;
            while (i2 < size) {
                Object objMo10833p = interfaceC9403fi0.mo10833p(i2);
                iM24101z = (objMo10833p instanceof C0362Fk ? C6709qu.m24085j((C0362Fk) objMo10833p) : C6709qu.m24100y((String) objMo10833p)) + iM24101z;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iM24101z = (obj instanceof C0362Fk ? C6709qu.m24085j((C0362Fk) obj) : C6709qu.m24100y((String) obj)) + iM24101z;
                i2++;
            }
        }
        return iM24101z;
    }

    /* renamed from: v */
    public static int m3924v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6709qu.m24101z(i) * size) + m3925w(list);
    }

    /* renamed from: w */
    public static int m3925w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC8944c90) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM24080B = 0;
        for (int i = 0; i < size; i++) {
            iM24080B += C6709qu.m24080B(((Integer) list.get(i)).intValue());
        }
        return iM24080B;
    }

    /* renamed from: x */
    public static int m3926x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C6709qu.m24101z(i) * size) + m3927y(list);
    }

    /* renamed from: y */
    public static int m3927y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC11711xl0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM24082D = 0;
        for (int i = 0; i < size; i++) {
            iM24082D += C6709qu.m24082D(((Long) list.get(i)).longValue());
        }
        return iM24082D;
    }

    /* renamed from: z */
    public static Object m3928z(int i, List list, Object obj, C9912jg1 c9912jg1) {
        return obj;
    }
}
