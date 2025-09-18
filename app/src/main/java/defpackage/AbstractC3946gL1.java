package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: gL1 */
/* loaded from: classes.dex */
public abstract class AbstractC3946gL1 {
    public static final TE a;

    static {
        C3940gJ1 c3940gJ1 = C3940gJ1.c;
        a = new TE(7);
    }

    public static void A(int i, List list, L21 l21, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        boolean z2 = list instanceof UG1;
        int i2 = 0;
        WE1 we1 = (WE1) l21.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    we1.k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            we1.n(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iC += WE1.c(((Integer) list.get(i3)).intValue());
            }
            we1.p(iC);
            while (i2 < list.size()) {
                we1.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        UG1 ug1 = (UG1) list;
        if (!z) {
            while (i2 < ug1.c) {
                we1.k(i, ug1.h(i2));
                i2++;
            }
            return;
        }
        we1.n(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < ug1.c; i4++) {
            iC2 += WE1.c(ug1.h(i4));
        }
        we1.p(iC2);
        while (i2 < ug1.c) {
            we1.l(ug1.h(i2));
            i2++;
        }
    }

    public static void B(int i, List list, L21 l21, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        if (list instanceof AbstractC5477kI1) {
            throw new ClassCastException();
        }
        WE1 we1 = (WE1) l21.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                we1.q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        we1.n(i, 2);
        int iC = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iC += WE1.c(((Long) list.get(i3)).longValue());
        }
        we1.p(iC);
        while (i2 < list.size()) {
            we1.r(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void C(int i, List list, L21 l21, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        boolean z2 = list instanceof UG1;
        int i2 = 0;
        WE1 we1 = (WE1) l21.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    we1.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            we1.n(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            we1.p(i3);
            while (i2 < list.size()) {
                we1.h(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        UG1 ug1 = (UG1) list;
        if (!z) {
            while (i2 < ug1.c) {
                we1.g(i, ug1.h(i2));
                i2++;
            }
            return;
        }
        we1.n(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ug1.c; i6++) {
            ug1.h(i6);
            i5 += 4;
        }
        we1.p(i5);
        while (i2 < ug1.c) {
            we1.h(ug1.h(i2));
            i2++;
        }
    }

    public static void D(int i, List list, L21 l21, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        if (list instanceof AbstractC5477kI1) {
            throw new ClassCastException();
        }
        WE1 we1 = (WE1) l21.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                we1.i(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        we1.n(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        we1.p(i3);
        while (i2 < list.size()) {
            we1.j(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void a(int i, List list, L21 l21, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        boolean z2 = list instanceof UG1;
        int i2 = 0;
        WE1 we1 = (WE1) l21.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    we1.o(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            we1.n(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iB += WE1.b((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            we1.p(iB);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                we1.p((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        UG1 ug1 = (UG1) list;
        if (!z) {
            while (i2 < ug1.c) {
                int iH = ug1.h(i2);
                we1.o(i, (iH >> 31) ^ (iH + iH));
                i2++;
            }
            return;
        }
        we1.n(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < ug1.c; i4++) {
            int iH2 = ug1.h(i4);
            iB2 += WE1.b((iH2 >> 31) ^ (iH2 + iH2));
        }
        we1.p(iB2);
        while (i2 < ug1.c) {
            int iH3 = ug1.h(i2);
            we1.p((iH3 >> 31) ^ (iH3 + iH3));
            i2++;
        }
    }

    public static void b(int i, List list, L21 l21, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        if (list instanceof AbstractC5477kI1) {
            throw new ClassCastException();
        }
        WE1 we1 = (WE1) l21.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                we1.q(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        we1.n(i, 2);
        int iC = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iC += WE1.c((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        we1.p(iC);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            we1.r((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    public static void c(int i, List list, L21 l21, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        boolean z2 = list instanceof UG1;
        int i2 = 0;
        WE1 we1 = (WE1) l21.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    we1.o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            we1.n(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += WE1.b(((Integer) list.get(i3)).intValue());
            }
            we1.p(iB);
            while (i2 < list.size()) {
                we1.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        UG1 ug1 = (UG1) list;
        if (!z) {
            while (i2 < ug1.c) {
                we1.o(i, ug1.h(i2));
                i2++;
            }
            return;
        }
        we1.n(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < ug1.c; i4++) {
            iB2 += WE1.b(ug1.h(i4));
        }
        we1.p(iB2);
        while (i2 < ug1.c) {
            we1.p(ug1.h(i2));
            i2++;
        }
    }

    public static void d(int i, List list, L21 l21, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        if (list instanceof AbstractC5477kI1) {
            throw new ClassCastException();
        }
        WE1 we1 = (WE1) l21.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                we1.q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        we1.n(i, 2);
        int iC = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iC += WE1.c(((Long) list.get(i3)).longValue());
        }
        we1.p(iC);
        while (i2 < list.size()) {
            we1.r(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int iC;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof UG1) {
            UG1 ug1 = (UG1) list;
            iC = 0;
            while (i < size) {
                iC += WE1.c(ug1.h(i));
                i++;
            }
        } else {
            iC = 0;
            while (i < size) {
                iC += WE1.c(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iC;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (WE1.b(i << 3) + 4) * size;
    }

    public static int h(List list) {
        return list.size() * 4;
    }

    public static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (WE1.b(i << 3) + 8) * size;
    }

    public static int j(List list) {
        return list.size() * 8;
    }

    public static int k(List list) {
        int iC;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof UG1) {
            UG1 ug1 = (UG1) list;
            iC = 0;
            while (i < size) {
                iC += WE1.c(ug1.h(i));
                i++;
            }
        } else {
            iC = 0;
            while (i < size) {
                iC += WE1.c(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iC;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5477kI1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iC = 0;
        for (int i = 0; i < size; i++) {
            iC += WE1.c(((Long) list.get(i)).longValue());
        }
        return iC;
    }

    public static int m(int i, Object obj, InterfaceC8153yK1 interfaceC8153yK1) {
        return WE1.t((DD1) obj, interfaceC8153yK1) + WE1.b(i << 3);
    }

    public static int n(List list) {
        int iB;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof UG1) {
            UG1 ug1 = (UG1) list;
            iB = 0;
            while (i < size) {
                int iH = ug1.h(i);
                iB += WE1.b((iH >> 31) ^ (iH + iH));
                i++;
            }
        } else {
            iB = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iB += WE1.b((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iB;
    }

    public static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5477kI1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iC = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iC += WE1.c((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iC;
    }

    public static int p(List list) {
        int iB;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof UG1) {
            UG1 ug1 = (UG1) list;
            iB = 0;
            while (i < size) {
                iB += WE1.b(ug1.h(i));
                i++;
            }
        } else {
            iB = 0;
            while (i < size) {
                iB += WE1.b(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iB;
    }

    public static int q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5477kI1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iC = 0;
        for (int i = 0; i < size; i++) {
            iC += WE1.c(((Long) list.get(i)).longValue());
        }
        return iC;
    }

    public static Object r(Object obj, int i, Object obj2, int i2) {
        Object obj3 = obj2;
        if (obj2 == null) {
            QG1 qg1 = (QG1) obj;
            C3949gM1 c3949gM1 = qg1.zzc;
            obj3 = c3949gM1;
            if (c3949gM1 == C3949gM1.f) {
                C3949gM1 c3949gM1B = C3949gM1.b();
                qg1.zzc = c3949gM1B;
                obj3 = c3949gM1B;
            }
        }
        ((C3949gM1) obj3).c(i << 3, Long.valueOf(i2));
        return obj3;
    }

    public static void s(Object obj, Object obj2) {
        SF1 sf1 = ((AbstractC8331zG1) obj2).zzb;
        if (sf1.a.isEmpty()) {
            return;
        }
        SF1 sf1N = ((AbstractC8331zG1) obj).n();
        sf1N.getClass();
        C5677lL1 c5677lL1 = sf1.a;
        int i = c5677lL1.b;
        for (int i2 = 0; i2 < i; i2++) {
            sf1N.g(c5677lL1.d(i2));
        }
        Iterator it = c5677lL1.b().iterator();
        while (it.hasNext()) {
            sf1N.g((Map.Entry) it.next());
        }
    }

    public static void t(Object obj, Object obj2) {
        QG1 qg1 = (QG1) obj;
        C3949gM1 c3949gM1 = qg1.zzc;
        C3949gM1 c3949gM12 = ((QG1) obj2).zzc;
        C3949gM1 c3949gM13 = C3949gM1.f;
        if (!c3949gM13.equals(c3949gM12)) {
            if (c3949gM13.equals(c3949gM1)) {
                int i = c3949gM1.a + c3949gM12.a;
                int[] iArrCopyOf = Arrays.copyOf(c3949gM1.b, i);
                System.arraycopy(c3949gM12.b, 0, iArrCopyOf, c3949gM1.a, c3949gM12.a);
                Object[] objArrCopyOf = Arrays.copyOf(c3949gM1.c, i);
                System.arraycopy(c3949gM12.c, 0, objArrCopyOf, c3949gM1.a, c3949gM12.a);
                c3949gM1 = new C3949gM1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c3949gM1.getClass();
                if (!c3949gM12.equals(c3949gM13)) {
                    if (!c3949gM1.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = c3949gM1.a + c3949gM12.a;
                    c3949gM1.e(i2);
                    System.arraycopy(c3949gM12.b, 0, c3949gM1.b, c3949gM1.a, c3949gM12.a);
                    System.arraycopy(c3949gM12.c, 0, c3949gM1.c, c3949gM1.a, c3949gM12.a);
                    c3949gM1.a = i2;
                }
            }
        }
        qg1.zzc = c3949gM1;
    }

    public static void u(int i, List list, L21 l21, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        if (list instanceof YD1) {
            throw new ClassCastException();
        }
        WE1 we1 = (WE1) l21.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                we1.p(i << 3);
                we1.d(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        we1.n(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        we1.p(i3);
        while (i2 < list.size()) {
            we1.d(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void v(int i, List list, L21 l21, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        if (list instanceof AbstractC6804rF1) {
            throw new ClassCastException();
        }
        WE1 we1 = (WE1) l21.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                we1.i(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        we1.n(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        we1.p(i3);
        while (i2 < list.size()) {
            we1.j(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void w(int i, List list, L21 l21, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        boolean z2 = list instanceof UG1;
        int i2 = 0;
        WE1 we1 = (WE1) l21.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    we1.k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            we1.n(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iC += WE1.c(((Integer) list.get(i3)).intValue());
            }
            we1.p(iC);
            while (i2 < list.size()) {
                we1.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        UG1 ug1 = (UG1) list;
        if (!z) {
            while (i2 < ug1.c) {
                we1.k(i, ug1.h(i2));
                i2++;
            }
            return;
        }
        we1.n(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < ug1.c; i4++) {
            iC2 += WE1.c(ug1.h(i4));
        }
        we1.p(iC2);
        while (i2 < ug1.c) {
            we1.l(ug1.h(i2));
            i2++;
        }
    }

    public static void x(int i, List list, L21 l21, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        boolean z2 = list instanceof UG1;
        int i2 = 0;
        WE1 we1 = (WE1) l21.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    we1.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            we1.n(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            we1.p(i3);
            while (i2 < list.size()) {
                we1.h(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        UG1 ug1 = (UG1) list;
        if (!z) {
            while (i2 < ug1.c) {
                we1.g(i, ug1.h(i2));
                i2++;
            }
            return;
        }
        we1.n(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ug1.c; i6++) {
            ug1.h(i6);
            i5 += 4;
        }
        we1.p(i5);
        while (i2 < ug1.c) {
            we1.h(ug1.h(i2));
            i2++;
        }
    }

    public static void y(int i, List list, L21 l21, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        if (list instanceof AbstractC5477kI1) {
            throw new ClassCastException();
        }
        WE1 we1 = (WE1) l21.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                we1.i(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        we1.n(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        we1.p(i3);
        while (i2 < list.size()) {
            we1.j(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void z(int i, List list, L21 l21, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        l21.getClass();
        boolean z2 = list instanceof ZF1;
        int i2 = 0;
        WE1 we1 = (WE1) l21.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    we1.g(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            we1.n(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            we1.p(i3);
            while (i2 < list.size()) {
                we1.h(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        ZF1 zf1 = (ZF1) list;
        if (!z) {
            while (i2 < zf1.c) {
                zf1.i(i2);
                we1.g(i, Float.floatToRawIntBits(zf1.b[i2]));
                i2++;
            }
            return;
        }
        we1.n(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zf1.c; i6++) {
            zf1.i(i6);
            float f = zf1.b[i6];
            i5 += 4;
        }
        we1.p(i5);
        while (i2 < zf1.c) {
            zf1.i(i2);
            we1.h(Float.floatToRawIntBits(zf1.b[i2]));
            i2++;
        }
    }
}
