package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: gL1 */
/* loaded from: classes.dex */
public abstract class AbstractC9486gL1 {

    /* renamed from: a */
    public static final C1210TE f27693a;

    static {
        C9482gJ1 c9482gJ1 = C9482gJ1.f27672c;
        f27693a = new C1210TE(7);
    }

    /* renamed from: A */
    public static void m18440A(int i, List list, L21 l21, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        boolean z2 = list instanceof UG1;
        int i2 = 0;
        WE1 we1 = (WE1) l21.f6473b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    we1.m8729k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            we1.m8732n(i, 2);
            int iM8718c = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8718c += WE1.m8718c(((Integer) list.get(i3)).intValue());
            }
            we1.m8734p(iM8718c);
            while (i2 < list.size()) {
                we1.m8730l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        UG1 ug1 = (UG1) list;
        if (!z) {
            while (i2 < ug1.f11713c) {
                we1.m8729k(i, ug1.m7950h(i2));
                i2++;
            }
            return;
        }
        we1.m8732n(i, 2);
        int iM8718c2 = 0;
        for (int i4 = 0; i4 < ug1.f11713c; i4++) {
            iM8718c2 += WE1.m8718c(ug1.m7950h(i4));
        }
        we1.m8734p(iM8718c2);
        while (i2 < ug1.f11713c) {
            we1.m8730l(ug1.m7950h(i2));
            i2++;
        }
    }

    /* renamed from: B */
    public static void m18441B(int i, List list, L21 l21, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        if (list instanceof AbstractC9992kI1) {
            throw new ClassCastException();
        }
        WE1 we1 = (WE1) l21.f6473b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                we1.m8735q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        we1.m8732n(i, 2);
        int iM8718c = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM8718c += WE1.m8718c(((Long) list.get(i3)).longValue());
        }
        we1.m8734p(iM8718c);
        while (i2 < list.size()) {
            we1.m8736r(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: C */
    public static void m18442C(int i, List list, L21 l21, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        boolean z2 = list instanceof UG1;
        int i2 = 0;
        WE1 we1 = (WE1) l21.f6473b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    we1.m8725g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            we1.m8732n(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            we1.m8734p(i3);
            while (i2 < list.size()) {
                we1.m8726h(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        UG1 ug1 = (UG1) list;
        if (!z) {
            while (i2 < ug1.f11713c) {
                we1.m8725g(i, ug1.m7950h(i2));
                i2++;
            }
            return;
        }
        we1.m8732n(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ug1.f11713c; i6++) {
            ug1.m7950h(i6);
            i5 += 4;
        }
        we1.m8734p(i5);
        while (i2 < ug1.f11713c) {
            we1.m8726h(ug1.m7950h(i2));
            i2++;
        }
    }

    /* renamed from: D */
    public static void m18443D(int i, List list, L21 l21, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        if (list instanceof AbstractC9992kI1) {
            throw new ClassCastException();
        }
        WE1 we1 = (WE1) l21.f6473b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                we1.m8727i(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        we1.m8732n(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        we1.m8734p(i3);
        while (i2 < list.size()) {
            we1.m8728j(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public static void m18444a(int i, List list, L21 l21, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        boolean z2 = list instanceof UG1;
        int i2 = 0;
        WE1 we1 = (WE1) l21.f6473b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    we1.m8733o(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            we1.m8732n(i, 2);
            int iM8717b = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iM8717b += WE1.m8717b((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            we1.m8734p(iM8717b);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                we1.m8734p((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        UG1 ug1 = (UG1) list;
        if (!z) {
            while (i2 < ug1.f11713c) {
                int iM7950h = ug1.m7950h(i2);
                we1.m8733o(i, (iM7950h >> 31) ^ (iM7950h + iM7950h));
                i2++;
            }
            return;
        }
        we1.m8732n(i, 2);
        int iM8717b2 = 0;
        for (int i4 = 0; i4 < ug1.f11713c; i4++) {
            int iM7950h2 = ug1.m7950h(i4);
            iM8717b2 += WE1.m8717b((iM7950h2 >> 31) ^ (iM7950h2 + iM7950h2));
        }
        we1.m8734p(iM8717b2);
        while (i2 < ug1.f11713c) {
            int iM7950h3 = ug1.m7950h(i2);
            we1.m8734p((iM7950h3 >> 31) ^ (iM7950h3 + iM7950h3));
            i2++;
        }
    }

    /* renamed from: b */
    public static void m18445b(int i, List list, L21 l21, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        if (list instanceof AbstractC9992kI1) {
            throw new ClassCastException();
        }
        WE1 we1 = (WE1) l21.f6473b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                we1.m8735q(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        we1.m8732n(i, 2);
        int iM8718c = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM8718c += WE1.m8718c((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        we1.m8734p(iM8718c);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            we1.m8736r((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    /* renamed from: c */
    public static void m18446c(int i, List list, L21 l21, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        boolean z2 = list instanceof UG1;
        int i2 = 0;
        WE1 we1 = (WE1) l21.f6473b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    we1.m8733o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            we1.m8732n(i, 2);
            int iM8717b = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8717b += WE1.m8717b(((Integer) list.get(i3)).intValue());
            }
            we1.m8734p(iM8717b);
            while (i2 < list.size()) {
                we1.m8734p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        UG1 ug1 = (UG1) list;
        if (!z) {
            while (i2 < ug1.f11713c) {
                we1.m8733o(i, ug1.m7950h(i2));
                i2++;
            }
            return;
        }
        we1.m8732n(i, 2);
        int iM8717b2 = 0;
        for (int i4 = 0; i4 < ug1.f11713c; i4++) {
            iM8717b2 += WE1.m8717b(ug1.m7950h(i4));
        }
        we1.m8734p(iM8717b2);
        while (i2 < ug1.f11713c) {
            we1.m8734p(ug1.m7950h(i2));
            i2++;
        }
    }

    /* renamed from: d */
    public static void m18447d(int i, List list, L21 l21, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        if (list instanceof AbstractC9992kI1) {
            throw new ClassCastException();
        }
        WE1 we1 = (WE1) l21.f6473b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                we1.m8735q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        we1.m8732n(i, 2);
        int iM8718c = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM8718c += WE1.m8718c(((Long) list.get(i3)).longValue());
        }
        we1.m8734p(iM8718c);
        while (i2 < list.size()) {
            we1.m8736r(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: e */
    public static boolean m18448e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: f */
    public static int m18449f(List list) {
        int iM8718c;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof UG1) {
            UG1 ug1 = (UG1) list;
            iM8718c = 0;
            while (i < size) {
                iM8718c += WE1.m8718c(ug1.m7950h(i));
                i++;
            }
        } else {
            iM8718c = 0;
            while (i < size) {
                iM8718c += WE1.m8718c(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM8718c;
    }

    /* renamed from: g */
    public static int m18450g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (WE1.m8717b(i << 3) + 4) * size;
    }

    /* renamed from: h */
    public static int m18451h(List list) {
        return list.size() * 4;
    }

    /* renamed from: i */
    public static int m18452i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (WE1.m8717b(i << 3) + 8) * size;
    }

    /* renamed from: j */
    public static int m18453j(List list) {
        return list.size() * 8;
    }

    /* renamed from: k */
    public static int m18454k(List list) {
        int iM8718c;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof UG1) {
            UG1 ug1 = (UG1) list;
            iM8718c = 0;
            while (i < size) {
                iM8718c += WE1.m8718c(ug1.m7950h(i));
                i++;
            }
        } else {
            iM8718c = 0;
            while (i < size) {
                iM8718c += WE1.m8718c(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM8718c;
    }

    /* renamed from: l */
    public static int m18455l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC9992kI1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM8718c = 0;
        for (int i = 0; i < size; i++) {
            iM8718c += WE1.m8718c(((Long) list.get(i)).longValue());
        }
        return iM8718c;
    }

    /* renamed from: m */
    public static int m18456m(int i, Object obj, InterfaceC11785yK1 interfaceC11785yK1) {
        return WE1.m8720t((DD1) obj, interfaceC11785yK1) + WE1.m8717b(i << 3);
    }

    /* renamed from: n */
    public static int m18457n(List list) {
        int iM8717b;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof UG1) {
            UG1 ug1 = (UG1) list;
            iM8717b = 0;
            while (i < size) {
                int iM7950h = ug1.m7950h(i);
                iM8717b += WE1.m8717b((iM7950h >> 31) ^ (iM7950h + iM7950h));
                i++;
            }
        } else {
            iM8717b = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM8717b += WE1.m8717b((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iM8717b;
    }

    /* renamed from: o */
    public static int m18458o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC9992kI1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM8718c = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iM8718c += WE1.m8718c((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iM8718c;
    }

    /* renamed from: p */
    public static int m18459p(List list) {
        int iM8717b;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof UG1) {
            UG1 ug1 = (UG1) list;
            iM8717b = 0;
            while (i < size) {
                iM8717b += WE1.m8717b(ug1.m7950h(i));
                i++;
            }
        } else {
            iM8717b = 0;
            while (i < size) {
                iM8717b += WE1.m8717b(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM8717b;
    }

    /* renamed from: q */
    public static int m18460q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC9992kI1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM8718c = 0;
        for (int i = 0; i < size; i++) {
            iM8718c += WE1.m8718c(((Long) list.get(i)).longValue());
        }
        return iM8718c;
    }

    /* renamed from: r */
    public static Object m18461r(Object obj, int i, Object obj2, int i2) {
        Object obj3 = obj2;
        if (obj2 == null) {
            QG1 qg1 = (QG1) obj;
            C9488gM1 c9488gM1 = qg1.zzc;
            obj3 = c9488gM1;
            if (c9488gM1 == C9488gM1.f27699f) {
                C9488gM1 c9488gM1M18470b = C9488gM1.m18470b();
                qg1.zzc = c9488gM1M18470b;
                obj3 = c9488gM1M18470b;
            }
        }
        ((C9488gM1) obj3).m18472c(i << 3, Long.valueOf(i2));
        return obj3;
    }

    /* renamed from: s */
    public static void m18462s(Object obj, Object obj2) {
        SF1 sf1 = ((AbstractC11904zG1) obj2).zzb;
        if (sf1.f10658a.isEmpty()) {
            return;
        }
        SF1 sf1M26368n = ((AbstractC11904zG1) obj).m26368n();
        sf1M26368n.getClass();
        C10126lL1 c10126lL1 = sf1.f10658a;
        int i = c10126lL1.f37018b;
        for (int i2 = 0; i2 < i; i2++) {
            sf1M26368n.m7206g(c10126lL1.m22409d(i2));
        }
        Iterator it = c10126lL1.m22407b().iterator();
        while (it.hasNext()) {
            sf1M26368n.m7206g((Map.Entry) it.next());
        }
    }

    /* renamed from: t */
    public static void m18463t(Object obj, Object obj2) {
        QG1 qg1 = (QG1) obj;
        C9488gM1 c9488gM1 = qg1.zzc;
        C9488gM1 c9488gM12 = ((QG1) obj2).zzc;
        C9488gM1 c9488gM13 = C9488gM1.f27699f;
        if (!c9488gM13.equals(c9488gM12)) {
            if (c9488gM13.equals(c9488gM1)) {
                int i = c9488gM1.f27700a + c9488gM12.f27700a;
                int[] iArrCopyOf = Arrays.copyOf(c9488gM1.f27701b, i);
                System.arraycopy(c9488gM12.f27701b, 0, iArrCopyOf, c9488gM1.f27700a, c9488gM12.f27700a);
                Object[] objArrCopyOf = Arrays.copyOf(c9488gM1.f27702c, i);
                System.arraycopy(c9488gM12.f27702c, 0, objArrCopyOf, c9488gM1.f27700a, c9488gM12.f27700a);
                c9488gM1 = new C9488gM1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c9488gM1.getClass();
                if (!c9488gM12.equals(c9488gM13)) {
                    if (!c9488gM1.f27704e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = c9488gM1.f27700a + c9488gM12.f27700a;
                    c9488gM1.m18474e(i2);
                    System.arraycopy(c9488gM12.f27701b, 0, c9488gM1.f27701b, c9488gM1.f27700a, c9488gM12.f27700a);
                    System.arraycopy(c9488gM12.f27702c, 0, c9488gM1.f27702c, c9488gM1.f27700a, c9488gM12.f27700a);
                    c9488gM1.f27700a = i2;
                }
            }
        }
        qg1.zzc = c9488gM1;
    }

    /* renamed from: u */
    public static void m18464u(int i, List list, L21 l21, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        if (list instanceof YD1) {
            throw new ClassCastException();
        }
        WE1 we1 = (WE1) l21.f6473b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                we1.m8734p(i << 3);
                we1.m8722d(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        we1.m8732n(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        we1.m8734p(i3);
        while (i2 < list.size()) {
            we1.m8722d(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* renamed from: v */
    public static void m18465v(int i, List list, L21 l21, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        if (list instanceof AbstractC10882rF1) {
            throw new ClassCastException();
        }
        WE1 we1 = (WE1) l21.f6473b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                we1.m8727i(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        we1.m8732n(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        we1.m8734p(i3);
        while (i2 < list.size()) {
            we1.m8728j(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: w */
    public static void m18466w(int i, List list, L21 l21, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        boolean z2 = list instanceof UG1;
        int i2 = 0;
        WE1 we1 = (WE1) l21.f6473b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    we1.m8729k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            we1.m8732n(i, 2);
            int iM8718c = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8718c += WE1.m8718c(((Integer) list.get(i3)).intValue());
            }
            we1.m8734p(iM8718c);
            while (i2 < list.size()) {
                we1.m8730l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        UG1 ug1 = (UG1) list;
        if (!z) {
            while (i2 < ug1.f11713c) {
                we1.m8729k(i, ug1.m7950h(i2));
                i2++;
            }
            return;
        }
        we1.m8732n(i, 2);
        int iM8718c2 = 0;
        for (int i4 = 0; i4 < ug1.f11713c; i4++) {
            iM8718c2 += WE1.m8718c(ug1.m7950h(i4));
        }
        we1.m8734p(iM8718c2);
        while (i2 < ug1.f11713c) {
            we1.m8730l(ug1.m7950h(i2));
            i2++;
        }
    }

    /* renamed from: x */
    public static void m18467x(int i, List list, L21 l21, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        boolean z2 = list instanceof UG1;
        int i2 = 0;
        WE1 we1 = (WE1) l21.f6473b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    we1.m8725g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            we1.m8732n(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            we1.m8734p(i3);
            while (i2 < list.size()) {
                we1.m8726h(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        UG1 ug1 = (UG1) list;
        if (!z) {
            while (i2 < ug1.f11713c) {
                we1.m8725g(i, ug1.m7950h(i2));
                i2++;
            }
            return;
        }
        we1.m8732n(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ug1.f11713c; i6++) {
            ug1.m7950h(i6);
            i5 += 4;
        }
        we1.m8734p(i5);
        while (i2 < ug1.f11713c) {
            we1.m8726h(ug1.m7950h(i2));
            i2++;
        }
    }

    /* renamed from: y */
    public static void m18468y(int i, List list, L21 l21, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        if (list instanceof AbstractC9992kI1) {
            throw new ClassCastException();
        }
        WE1 we1 = (WE1) l21.f6473b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                we1.m8727i(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        we1.m8732n(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        we1.m8734p(i3);
        while (i2 < list.size()) {
            we1.m8728j(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public static void m18469z(int i, List list, L21 l21, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        boolean z2 = list instanceof ZF1;
        int i2 = 0;
        WE1 we1 = (WE1) l21.f6473b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    we1.m8725g(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            we1.m8732n(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            we1.m8734p(i3);
            while (i2 < list.size()) {
                we1.m8726h(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        ZF1 zf1 = (ZF1) list;
        if (!z) {
            while (i2 < zf1.f14825c) {
                zf1.m9519i(i2);
                we1.m8725g(i, Float.floatToRawIntBits(zf1.f14824b[i2]));
                i2++;
            }
            return;
        }
        we1.m8732n(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zf1.f14825c; i6++) {
            zf1.m9519i(i6);
            float f = zf1.f14824b[i6];
            i5 += 4;
        }
        we1.m8734p(i5);
        while (i2 < zf1.f14825c) {
            zf1.m9519i(i2);
            we1.m8726h(Float.floatToRawIntBits(zf1.f14824b[i2]));
            i2++;
        }
    }
}
