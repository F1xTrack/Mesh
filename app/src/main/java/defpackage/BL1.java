package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public abstract class BL1 {
    public static int A(List list) {
        int iV;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7607vS1) {
            C7607vS1 c7607vS1 = (C7607vS1) list;
            iV = 0;
            while (i < size) {
                iV += C3964gR1.v(c7607vS1.d(i));
                i++;
            }
        } else {
            iV = 0;
            while (i < size) {
                iV += C3964gR1.v(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iV;
    }

    public static void B(int i, List list, C6446pN0 c6446pN0, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        boolean z2 = list instanceof BT1;
        int i2 = 0;
        C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c3964gR1.y(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c3964gR1.H(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = C3964gR1.f;
                i3 += 8;
            }
            c3964gR1.I(i3);
            while (i2 < list.size()) {
                c3964gR1.z(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        BT1 bt1 = (BT1) list;
        if (!z) {
            while (i2 < bt1.c) {
                c3964gR1.y(i, bt1.h(i2));
                i2++;
            }
            return;
        }
        c3964gR1.H(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < bt1.c; i6++) {
            bt1.h(i6);
            Logger logger2 = C3964gR1.f;
            i5 += 8;
        }
        c3964gR1.I(i5);
        while (i2 < bt1.c) {
            c3964gR1.z(bt1.h(i2));
            i2++;
        }
    }

    public static int C(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C3964gR1.w(i) * list.size()) + D(list);
    }

    public static int D(List list) {
        int iV;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof BT1) {
            BT1 bt1 = (BT1) list;
            iV = 0;
            while (i < size) {
                iV += C3964gR1.v(bt1.h(i));
                i++;
            }
        } else {
            iV = 0;
            while (i < size) {
                iV += C3964gR1.v(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iV;
    }

    public static void E(int i, List list, C6446pN0 c6446pN0, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        if (list instanceof AbstractC3776fS1) {
            throw new ClassCastException();
        }
        C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c3964gR1.getClass();
                c3964gR1.B(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c3964gR1.H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C3964gR1.f;
            i3 += 4;
        }
        c3964gR1.I(i3);
        while (i2 < list.size()) {
            c3964gR1.C(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static int F(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3964gR1.w(i) * size) + G(list);
    }

    public static int G(List list) {
        int iA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7607vS1) {
            C7607vS1 c7607vS1 = (C7607vS1) list;
            iA = 0;
            while (i < size) {
                int iD = c7607vS1.d(i);
                iA += C3964gR1.A((iD >> 31) ^ (iD << 1));
                i++;
            }
        } else {
            iA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iA += C3964gR1.A((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
        }
        return iA;
    }

    public static void H(int i, List list, C6446pN0 c6446pN0, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        boolean z2 = list instanceof C7607vS1;
        int i2 = 0;
        C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c3964gR1.D(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c3964gR1.H(i, 2);
            int iV = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iV += C3964gR1.v(((Integer) list.get(i3)).intValue());
            }
            c3964gR1.I(iV);
            while (i2 < list.size()) {
                c3964gR1.G(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C7607vS1 c7607vS1 = (C7607vS1) list;
        if (!z) {
            while (i2 < c7607vS1.c) {
                c3964gR1.D(i, c7607vS1.d(i2));
                i2++;
            }
            return;
        }
        c3964gR1.H(i, 2);
        int iV2 = 0;
        for (int i4 = 0; i4 < c7607vS1.c; i4++) {
            iV2 += C3964gR1.v(c7607vS1.d(i4));
        }
        c3964gR1.I(iV2);
        while (i2 < c7607vS1.c) {
            c3964gR1.G(c7607vS1.d(i2));
            i2++;
        }
    }

    public static int I(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3964gR1.w(i) * size) + J(list);
    }

    public static int J(List list) {
        int iV;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof BT1) {
            BT1 bt1 = (BT1) list;
            iV = 0;
            while (i < size) {
                long jH = bt1.h(i);
                iV += C3964gR1.v((jH >> 63) ^ (jH << 1));
                i++;
            }
        } else {
            iV = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iV += C3964gR1.v((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
        }
        return iV;
    }

    public static void K(int i, List list, C6446pN0 c6446pN0, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        boolean z2 = list instanceof BT1;
        int i2 = 0;
        C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c3964gR1.E(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c3964gR1.H(i, 2);
            int iV = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iV += C3964gR1.v(((Long) list.get(i3)).longValue());
            }
            c3964gR1.I(iV);
            while (i2 < list.size()) {
                c3964gR1.F(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        BT1 bt1 = (BT1) list;
        if (!z) {
            while (i2 < bt1.c) {
                c3964gR1.E(i, bt1.h(i2));
                i2++;
            }
            return;
        }
        c3964gR1.H(i, 2);
        int iV2 = 0;
        for (int i4 = 0; i4 < bt1.c; i4++) {
            iV2 += C3964gR1.v(bt1.h(i4));
        }
        c3964gR1.I(iV2);
        while (i2 < bt1.c) {
            c3964gR1.F(bt1.h(i2));
            i2++;
        }
    }

    public static int L(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3964gR1.w(i) * size) + M(list);
    }

    public static int M(List list) {
        int iA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7607vS1) {
            C7607vS1 c7607vS1 = (C7607vS1) list;
            iA = 0;
            while (i < size) {
                iA += C3964gR1.A(c7607vS1.d(i));
                i++;
            }
        } else {
            iA = 0;
            while (i < size) {
                iA += C3964gR1.A(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iA;
    }

    public static void N(int i, List list, C6446pN0 c6446pN0, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        boolean z2 = list instanceof C7607vS1;
        int i2 = 0;
        C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c3964gR1.B(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c3964gR1.H(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = C3964gR1.f;
                i3 += 4;
            }
            c3964gR1.I(i3);
            while (i2 < list.size()) {
                c3964gR1.C(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C7607vS1 c7607vS1 = (C7607vS1) list;
        if (!z) {
            while (i2 < c7607vS1.c) {
                c3964gR1.B(i, c7607vS1.d(i2));
                i2++;
            }
            return;
        }
        c3964gR1.H(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c7607vS1.c; i6++) {
            c7607vS1.d(i6);
            Logger logger2 = C3964gR1.f;
            i5 += 4;
        }
        c3964gR1.I(i5);
        while (i2 < c7607vS1.c) {
            c3964gR1.C(c7607vS1.d(i2));
            i2++;
        }
    }

    public static int O(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3964gR1.w(i) * size) + P(list);
    }

    public static int P(List list) {
        int iV;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof BT1) {
            BT1 bt1 = (BT1) list;
            iV = 0;
            while (i < size) {
                iV += C3964gR1.v(bt1.h(i));
                i++;
            }
        } else {
            iV = 0;
            while (i < size) {
                iV += C3964gR1.v(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iV;
    }

    public static void Q(int i, List list, C6446pN0 c6446pN0, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        boolean z2 = list instanceof BT1;
        int i2 = 0;
        C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c3964gR1.y(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c3964gR1.H(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = C3964gR1.f;
                i3 += 8;
            }
            c3964gR1.I(i3);
            while (i2 < list.size()) {
                c3964gR1.z(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        BT1 bt1 = (BT1) list;
        if (!z) {
            while (i2 < bt1.c) {
                c3964gR1.y(i, bt1.h(i2));
                i2++;
            }
            return;
        }
        c3964gR1.H(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < bt1.c; i6++) {
            bt1.h(i6);
            Logger logger2 = C3964gR1.f;
            i5 += 8;
        }
        c3964gR1.I(i5);
        while (i2 < bt1.c) {
            c3964gR1.z(bt1.h(i2));
            i2++;
        }
    }

    public static void R(int i, List list, C6446pN0 c6446pN0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        boolean z2 = list instanceof C7607vS1;
        int i2 = 0;
        C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    c3964gR1.J(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            c3964gR1.H(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iA += C3964gR1.A((iIntValue2 >> 31) ^ (iIntValue2 << 1));
            }
            c3964gR1.I(iA);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                c3964gR1.I((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                i2++;
            }
            return;
        }
        C7607vS1 c7607vS1 = (C7607vS1) list;
        if (!z) {
            while (i2 < c7607vS1.c) {
                int iD = c7607vS1.d(i2);
                c3964gR1.J(i, (iD >> 31) ^ (iD << 1));
                i2++;
            }
            return;
        }
        c3964gR1.H(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < c7607vS1.c; i4++) {
            int iD2 = c7607vS1.d(i4);
            iA2 += C3964gR1.A((iD2 >> 31) ^ (iD2 << 1));
        }
        c3964gR1.I(iA2);
        while (i2 < c7607vS1.c) {
            int iD3 = c7607vS1.d(i2);
            c3964gR1.I((iD3 >> 31) ^ (iD3 << 1));
            i2++;
        }
    }

    public static void S(int i, List list, C6446pN0 c6446pN0, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        boolean z2 = list instanceof BT1;
        int i2 = 0;
        C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    c3964gR1.E(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            c3964gR1.H(i, 2);
            int iV = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iV += C3964gR1.v((jLongValue2 >> 63) ^ (jLongValue2 << 1));
            }
            c3964gR1.I(iV);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                c3964gR1.F((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                i2++;
            }
            return;
        }
        BT1 bt1 = (BT1) list;
        if (!z) {
            while (i2 < bt1.c) {
                long jH = bt1.h(i2);
                c3964gR1.E(i, (jH >> 63) ^ (jH << 1));
                i2++;
            }
            return;
        }
        c3964gR1.H(i, 2);
        int iV2 = 0;
        for (int i4 = 0; i4 < bt1.c; i4++) {
            long jH2 = bt1.h(i4);
            iV2 += C3964gR1.v((jH2 >> 63) ^ (jH2 << 1));
        }
        c3964gR1.I(iV2);
        while (i2 < bt1.c) {
            long jH3 = bt1.h(i2);
            c3964gR1.F((jH3 >> 63) ^ (jH3 << 1));
            i2++;
        }
    }

    public static void T(int i, List list, C6446pN0 c6446pN0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        boolean z2 = list instanceof C7607vS1;
        int i2 = 0;
        C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c3964gR1.J(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c3964gR1.H(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += C3964gR1.A(((Integer) list.get(i3)).intValue());
            }
            c3964gR1.I(iA);
            while (i2 < list.size()) {
                c3964gR1.I(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C7607vS1 c7607vS1 = (C7607vS1) list;
        if (!z) {
            while (i2 < c7607vS1.c) {
                c3964gR1.J(i, c7607vS1.d(i2));
                i2++;
            }
            return;
        }
        c3964gR1.H(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < c7607vS1.c; i4++) {
            iA2 += C3964gR1.A(c7607vS1.d(i4));
        }
        c3964gR1.I(iA2);
        while (i2 < c7607vS1.c) {
            c3964gR1.I(c7607vS1.d(i2));
            i2++;
        }
    }

    public static void U(int i, List list, C6446pN0 c6446pN0, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        boolean z2 = list instanceof BT1;
        int i2 = 0;
        C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c3964gR1.E(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c3964gR1.H(i, 2);
            int iV = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iV += C3964gR1.v(((Long) list.get(i3)).longValue());
            }
            c3964gR1.I(iV);
            while (i2 < list.size()) {
                c3964gR1.F(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        BT1 bt1 = (BT1) list;
        if (!z) {
            while (i2 < bt1.c) {
                c3964gR1.E(i, bt1.h(i2));
                i2++;
            }
            return;
        }
        c3964gR1.H(i, 2);
        int iV2 = 0;
        for (int i4 = 0; i4 < bt1.c; i4++) {
            iV2 += C3964gR1.v(bt1.h(i4));
        }
        c3964gR1.I(iV2);
        while (i2 < bt1.c) {
            c3964gR1.F(bt1.h(i2));
            i2++;
        }
    }

    public static boolean a(View view, WB0 wb0) {
        int iOrdinal;
        if (view == null || (iOrdinal = wb0.ordinal()) == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 12 || iOrdinal == 13) {
            return true;
        }
        Integer num = (Integer) view.getTag(R.id.pointer_events);
        return (num == null || (num.intValue() & (1 << wb0.ordinal())) == 0) ? false : true;
    }

    public static int b(int i, Object obj, InterfaceC3404dV1 interfaceC3404dV1) {
        int iA = C3964gR1.A(i << 3);
        int iA2 = ((IP1) obj).a(interfaceC3404dV1);
        return C3964gR1.A(iA2) + iA2 + iA;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C3964gR1.h(i) * size;
    }

    public static int d(int i, List list, InterfaceC3404dV1 interfaceC3404dV1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iD = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iD += C3964gR1.d(i, (IP1) list.get(i2), interfaceC3404dV1);
        }
        return iD;
    }

    public static int e(List list) {
        return list.size();
    }

    public static void f(int i, List list, C6446pN0 c6446pN0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            JQ1 jq1 = (JQ1) list.get(i2);
            C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
            c3964gR1.H(i, 2);
            c3964gR1.n(jq1);
        }
    }

    public static void g(int i, List list, C6446pN0 c6446pN0, InterfaceC3404dV1 interfaceC3404dV1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c6446pN0.x(i, list.get(i2), interfaceC3404dV1);
        }
    }

    public static void h(int i, List list, C6446pN0 c6446pN0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        if (list instanceof AbstractC2513cQ1) {
            throw new ClassCastException();
        }
        C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                c3964gR1.H(i, 0);
                c3964gR1.g(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c3964gR1.H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C3964gR1.f;
            i3++;
        }
        c3964gR1.I(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            c3964gR1.g(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void i(Object obj, int i, LS1 ls1, IS1 is1) {
        if (is1 == null) {
            return;
        }
        boolean z = ls1 instanceof RandomAccess;
        PV1 pv1 = PV1.f;
        PV1 pv12 = null;
        if (!z) {
            Iterator it = ls1.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!is1.a(iIntValue)) {
                    if (pv12 == null) {
                        AbstractC6843rS1 abstractC6843rS1 = (AbstractC6843rS1) obj;
                        PV1 pv1E = abstractC6843rS1.zzb;
                        if (pv1E == pv1) {
                            pv1E = PV1.e();
                            abstractC6843rS1.zzb = pv1E;
                        }
                        pv12 = pv1E;
                    }
                    pv12.c(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return;
        }
        int size = ls1.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) ls1.get(i3);
            int iIntValue2 = num.intValue();
            if (is1.a(iIntValue2)) {
                if (i3 != i2) {
                    ls1.set(i2, num);
                }
                i2++;
            } else {
                if (pv12 == null) {
                    AbstractC6843rS1 abstractC6843rS12 = (AbstractC6843rS1) obj;
                    PV1 pv1E2 = abstractC6843rS12.zzb;
                    if (pv1E2 == pv1) {
                        pv1E2 = PV1.e();
                        abstractC6843rS12.zzb = pv1E2;
                    }
                    pv12 = pv1E2;
                }
                pv12.c(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i2 != size) {
            ls1.subList(i2, size).clear();
        }
    }

    public static void j(Object obj, Object obj2) {
        AbstractC6843rS1 abstractC6843rS1 = (AbstractC6843rS1) obj;
        PV1 pv1 = abstractC6843rS1.zzb;
        PV1 pv12 = ((AbstractC6843rS1) obj2).zzb;
        PV1 pv13 = PV1.f;
        if (!pv13.equals(pv12)) {
            if (pv13.equals(pv1)) {
                int i = pv1.a + pv12.a;
                int[] iArrCopyOf = Arrays.copyOf(pv1.b, i);
                System.arraycopy(pv12.b, 0, iArrCopyOf, pv1.a, pv12.a);
                Object[] objArrCopyOf = Arrays.copyOf(pv1.c, i);
                System.arraycopy(pv12.c, 0, objArrCopyOf, pv1.a, pv12.a);
                pv1 = new PV1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                pv1.getClass();
                if (!pv12.equals(pv13)) {
                    if (!pv1.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = pv1.a + pv12.a;
                    pv1.b(i2);
                    System.arraycopy(pv12.b, 0, pv1.b, pv1.a, pv12.a);
                    System.arraycopy(pv12.c, 0, pv1.c, pv1.a, pv12.a);
                    pv1.a = i2;
                }
            }
        }
        abstractC6843rS1.zzb = pv1;
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int l(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = C3964gR1.w(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int iK = ((JQ1) list.get(i2)).k();
            iW += C3964gR1.A(iK) + iK;
        }
        return iW;
    }

    public static int m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3964gR1.w(i) * size) + o(list);
    }

    public static int n(int i, List list, InterfaceC3404dV1 interfaceC3404dV1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = C3964gR1.w(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iA = ((IP1) list.get(i2)).a(interfaceC3404dV1);
            iW += C3964gR1.A(iA) + iA;
        }
        return iW;
    }

    public static int o(List list) {
        int iV;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7607vS1) {
            C7607vS1 c7607vS1 = (C7607vS1) list;
            iV = 0;
            while (i < size) {
                iV += C3964gR1.v(c7607vS1.d(i));
                i++;
            }
        } else {
            iV = 0;
            while (i < size) {
                iV += C3964gR1.v(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iV;
    }

    public static void p(int i, List list, C6446pN0 c6446pN0) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        boolean z = list instanceof InterfaceC5892mT1;
        C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                c3964gR1.H(i, 2);
                int i3 = c3964gR1.e;
                try {
                    int iA = C3964gR1.A(str.length() * 3);
                    int iA2 = C3964gR1.A(str.length());
                    byte[] bArr = c3964gR1.c;
                    if (iA2 == iA) {
                        int i4 = i3 + iA2;
                        c3964gR1.e = i4;
                        int iB = AbstractC4170hW1.b(str, bArr, i4, c3964gR1.k());
                        c3964gR1.e = i3;
                        c3964gR1.I((iB - i3) - iA2);
                        c3964gR1.e = iB;
                    } else {
                        c3964gR1.I(AbstractC4170hW1.a(str));
                        c3964gR1.e = AbstractC4170hW1.b(str, bArr, c3964gR1.e, c3964gR1.k());
                    }
                } catch (IndexOutOfBoundsException e) {
                    throw new C6353ou(e);
                } catch (C5710lW1 e2) {
                    c3964gR1.e = i3;
                    C3964gR1.f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                    byte[] bytes = str.getBytes(BS1.a);
                    try {
                        c3964gR1.I(bytes.length);
                        c3964gR1.q(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e3) {
                        throw new C6353ou(e3);
                    }
                }
            }
            return;
        }
        InterfaceC5892mT1 interfaceC5892mT1 = (InterfaceC5892mT1) list;
        for (int i5 = 0; i5 < list.size(); i5++) {
            Object objZza = interfaceC5892mT1.zza();
            if (objZza instanceof String) {
                String str2 = (String) objZza;
                c3964gR1.H(i, 2);
                int i6 = c3964gR1.e;
                try {
                    int iA3 = C3964gR1.A(str2.length() * 3);
                    int iA4 = C3964gR1.A(str2.length());
                    byte[] bArr2 = c3964gR1.c;
                    if (iA4 == iA3) {
                        int i7 = i6 + iA4;
                        c3964gR1.e = i7;
                        int iB2 = AbstractC4170hW1.b(str2, bArr2, i7, c3964gR1.k());
                        c3964gR1.e = i6;
                        c3964gR1.I((iB2 - i6) - iA4);
                        c3964gR1.e = iB2;
                    } else {
                        c3964gR1.I(AbstractC4170hW1.a(str2));
                        c3964gR1.e = AbstractC4170hW1.b(str2, bArr2, c3964gR1.e, c3964gR1.k());
                    }
                } catch (IndexOutOfBoundsException e4) {
                    throw new C6353ou(e4);
                } catch (C5710lW1 e5) {
                    c3964gR1.e = i6;
                    C3964gR1.f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
                    byte[] bytes2 = str2.getBytes(BS1.a);
                    try {
                        c3964gR1.I(bytes2.length);
                        c3964gR1.q(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e6) {
                        throw new C6353ou(e6);
                    }
                }
            } else {
                c3964gR1.H(i, 2);
                c3964gR1.n((JQ1) objZza);
            }
        }
    }

    public static void q(int i, List list, C6446pN0 c6446pN0, InterfaceC3404dV1 interfaceC3404dV1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c6446pN0.C(i, list.get(i2), interfaceC3404dV1);
        }
    }

    public static void r(int i, List list, C6446pN0 c6446pN0, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        if (list instanceof AbstractC7984xR1) {
            throw new ClassCastException();
        }
        C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c3964gR1.getClass();
                c3964gR1.y(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c3964gR1.H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C3964gR1.f;
            i3 += 8;
        }
        c3964gR1.I(i3);
        while (i2 < list.size()) {
            c3964gR1.z(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static int s(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iW = C3964gR1.w(i) * size;
        if (list instanceof InterfaceC5892mT1) {
            InterfaceC5892mT1 interfaceC5892mT1 = (InterfaceC5892mT1) list;
            while (i2 < size) {
                Object objZza = interfaceC5892mT1.zza();
                if (objZza instanceof JQ1) {
                    int iK = ((JQ1) objZza).k();
                    iW = C3964gR1.A(iK) + iK + iW;
                } else {
                    iW = C3964gR1.f((String) objZza) + iW;
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof JQ1) {
                    int iK2 = ((JQ1) obj).k();
                    iW = C3964gR1.A(iK2) + iK2 + iW;
                } else {
                    iW = C3964gR1.f((String) obj) + iW;
                }
                i2++;
            }
        }
        return iW;
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C3964gR1.l(i) * size;
    }

    public static int u(List list) {
        return list.size() << 2;
    }

    public static void v(int i, List list, C6446pN0 c6446pN0, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        boolean z2 = list instanceof C7607vS1;
        int i2 = 0;
        C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c3964gR1.D(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c3964gR1.H(i, 2);
            int iV = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iV += C3964gR1.v(((Integer) list.get(i3)).intValue());
            }
            c3964gR1.I(iV);
            while (i2 < list.size()) {
                c3964gR1.G(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C7607vS1 c7607vS1 = (C7607vS1) list;
        if (!z) {
            while (i2 < c7607vS1.c) {
                c3964gR1.D(i, c7607vS1.d(i2));
                i2++;
            }
            return;
        }
        c3964gR1.H(i, 2);
        int iV2 = 0;
        for (int i4 = 0; i4 < c7607vS1.c; i4++) {
            iV2 += C3964gR1.v(c7607vS1.d(i4));
        }
        c3964gR1.I(iV2);
        while (i2 < c7607vS1.c) {
            c3964gR1.G(c7607vS1.d(i2));
            i2++;
        }
    }

    public static int w(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C3964gR1.j(i) * size;
    }

    public static int x(List list) {
        return list.size() << 3;
    }

    public static void y(int i, List list, C6446pN0 c6446pN0, boolean z) throws C6353ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c6446pN0.getClass();
        boolean z2 = list instanceof C7607vS1;
        int i2 = 0;
        C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c3964gR1.B(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c3964gR1.H(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = C3964gR1.f;
                i3 += 4;
            }
            c3964gR1.I(i3);
            while (i2 < list.size()) {
                c3964gR1.C(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C7607vS1 c7607vS1 = (C7607vS1) list;
        if (!z) {
            while (i2 < c7607vS1.c) {
                c3964gR1.B(i, c7607vS1.d(i2));
                i2++;
            }
            return;
        }
        c3964gR1.H(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c7607vS1.c; i6++) {
            c7607vS1.d(i6);
            Logger logger2 = C3964gR1.f;
            i5 += 4;
        }
        c3964gR1.I(i5);
        while (i2 < c7607vS1.c) {
            c3964gR1.C(c7607vS1.d(i2));
            i2++;
        }
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3964gR1.w(i) * size) + A(list);
    }
}
