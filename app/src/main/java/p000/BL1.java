package p000;

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
    /* renamed from: A */
    public static int m647A(List list) {
        int iM18540v;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11420vS1) {
            C11420vS1 c11420vS1 = (C11420vS1) list;
            iM18540v = 0;
            while (i < size) {
                iM18540v += C9498gR1.m18540v(c11420vS1.m25424d(i));
                i++;
            }
        } else {
            iM18540v = 0;
            while (i < size) {
                iM18540v += C9498gR1.m18540v(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM18540v;
    }

    /* renamed from: B */
    public static void m648B(int i, List list, C10641pN0 c10641pN0, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        boolean z2 = list instanceof BT1;
        int i2 = 0;
        C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c9498gR1.m18556y(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c9498gR1.m18549H(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = C9498gR1.f27799f;
                i3 += 8;
            }
            c9498gR1.m18550I(i3);
            while (i2 < list.size()) {
                c9498gR1.m18557z(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        BT1 bt1 = (BT1) list;
        if (!z) {
            while (i2 < bt1.f839c) {
                c9498gR1.m18556y(i, bt1.m726h(i2));
                i2++;
            }
            return;
        }
        c9498gR1.m18549H(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < bt1.f839c; i6++) {
            bt1.m726h(i6);
            Logger logger2 = C9498gR1.f27799f;
            i5 += 8;
        }
        c9498gR1.m18550I(i5);
        while (i2 < bt1.f839c) {
            c9498gR1.m18557z(bt1.m726h(i2));
            i2++;
        }
    }

    /* renamed from: C */
    public static int m649C(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C9498gR1.m18541w(i) * list.size()) + m650D(list);
    }

    /* renamed from: D */
    public static int m650D(List list) {
        int iM18540v;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof BT1) {
            BT1 bt1 = (BT1) list;
            iM18540v = 0;
            while (i < size) {
                iM18540v += C9498gR1.m18540v(bt1.m726h(i));
                i++;
            }
        } else {
            iM18540v = 0;
            while (i < size) {
                iM18540v += C9498gR1.m18540v(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iM18540v;
    }

    /* renamed from: E */
    public static void m651E(int i, List list, C10641pN0 c10641pN0, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        if (list instanceof AbstractC9372fS1) {
            throw new ClassCastException();
        }
        C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c9498gR1.getClass();
                c9498gR1.m18543B(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c9498gR1.m18549H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C9498gR1.f27799f;
            i3 += 4;
        }
        c9498gR1.m18550I(i3);
        while (i2 < list.size()) {
            c9498gR1.m18544C(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: F */
    public static int m652F(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C9498gR1.m18541w(i) * size) + m653G(list);
    }

    /* renamed from: G */
    public static int m653G(List list) {
        int iM18522A;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11420vS1) {
            C11420vS1 c11420vS1 = (C11420vS1) list;
            iM18522A = 0;
            while (i < size) {
                int iM25424d = c11420vS1.m25424d(i);
                iM18522A += C9498gR1.m18522A((iM25424d >> 31) ^ (iM25424d << 1));
                i++;
            }
        } else {
            iM18522A = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM18522A += C9498gR1.m18522A((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
        }
        return iM18522A;
    }

    /* renamed from: H */
    public static void m654H(int i, List list, C10641pN0 c10641pN0, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        boolean z2 = list instanceof C11420vS1;
        int i2 = 0;
        C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c9498gR1.m18545D(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c9498gR1.m18549H(i, 2);
            int iM18540v = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM18540v += C9498gR1.m18540v(((Integer) list.get(i3)).intValue());
            }
            c9498gR1.m18550I(iM18540v);
            while (i2 < list.size()) {
                c9498gR1.m18548G(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C11420vS1 c11420vS1 = (C11420vS1) list;
        if (!z) {
            while (i2 < c11420vS1.f44385c) {
                c9498gR1.m18545D(i, c11420vS1.m25424d(i2));
                i2++;
            }
            return;
        }
        c9498gR1.m18549H(i, 2);
        int iM18540v2 = 0;
        for (int i4 = 0; i4 < c11420vS1.f44385c; i4++) {
            iM18540v2 += C9498gR1.m18540v(c11420vS1.m25424d(i4));
        }
        c9498gR1.m18550I(iM18540v2);
        while (i2 < c11420vS1.f44385c) {
            c9498gR1.m18548G(c11420vS1.m25424d(i2));
            i2++;
        }
    }

    /* renamed from: I */
    public static int m655I(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C9498gR1.m18541w(i) * size) + m656J(list);
    }

    /* renamed from: J */
    public static int m656J(List list) {
        int iM18540v;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof BT1) {
            BT1 bt1 = (BT1) list;
            iM18540v = 0;
            while (i < size) {
                long jM726h = bt1.m726h(i);
                iM18540v += C9498gR1.m18540v((jM726h >> 63) ^ (jM726h << 1));
                i++;
            }
        } else {
            iM18540v = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM18540v += C9498gR1.m18540v((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
        }
        return iM18540v;
    }

    /* renamed from: K */
    public static void m657K(int i, List list, C10641pN0 c10641pN0, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        boolean z2 = list instanceof BT1;
        int i2 = 0;
        C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c9498gR1.m18546E(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c9498gR1.m18549H(i, 2);
            int iM18540v = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM18540v += C9498gR1.m18540v(((Long) list.get(i3)).longValue());
            }
            c9498gR1.m18550I(iM18540v);
            while (i2 < list.size()) {
                c9498gR1.m18547F(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        BT1 bt1 = (BT1) list;
        if (!z) {
            while (i2 < bt1.f839c) {
                c9498gR1.m18546E(i, bt1.m726h(i2));
                i2++;
            }
            return;
        }
        c9498gR1.m18549H(i, 2);
        int iM18540v2 = 0;
        for (int i4 = 0; i4 < bt1.f839c; i4++) {
            iM18540v2 += C9498gR1.m18540v(bt1.m726h(i4));
        }
        c9498gR1.m18550I(iM18540v2);
        while (i2 < bt1.f839c) {
            c9498gR1.m18547F(bt1.m726h(i2));
            i2++;
        }
    }

    /* renamed from: L */
    public static int m658L(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C9498gR1.m18541w(i) * size) + m659M(list);
    }

    /* renamed from: M */
    public static int m659M(List list) {
        int iM18522A;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11420vS1) {
            C11420vS1 c11420vS1 = (C11420vS1) list;
            iM18522A = 0;
            while (i < size) {
                iM18522A += C9498gR1.m18522A(c11420vS1.m25424d(i));
                i++;
            }
        } else {
            iM18522A = 0;
            while (i < size) {
                iM18522A += C9498gR1.m18522A(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM18522A;
    }

    /* renamed from: N */
    public static void m660N(int i, List list, C10641pN0 c10641pN0, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        boolean z2 = list instanceof C11420vS1;
        int i2 = 0;
        C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c9498gR1.m18543B(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c9498gR1.m18549H(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = C9498gR1.f27799f;
                i3 += 4;
            }
            c9498gR1.m18550I(i3);
            while (i2 < list.size()) {
                c9498gR1.m18544C(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C11420vS1 c11420vS1 = (C11420vS1) list;
        if (!z) {
            while (i2 < c11420vS1.f44385c) {
                c9498gR1.m18543B(i, c11420vS1.m25424d(i2));
                i2++;
            }
            return;
        }
        c9498gR1.m18549H(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c11420vS1.f44385c; i6++) {
            c11420vS1.m25424d(i6);
            Logger logger2 = C9498gR1.f27799f;
            i5 += 4;
        }
        c9498gR1.m18550I(i5);
        while (i2 < c11420vS1.f44385c) {
            c9498gR1.m18544C(c11420vS1.m25424d(i2));
            i2++;
        }
    }

    /* renamed from: O */
    public static int m661O(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C9498gR1.m18541w(i) * size) + m662P(list);
    }

    /* renamed from: P */
    public static int m662P(List list) {
        int iM18540v;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof BT1) {
            BT1 bt1 = (BT1) list;
            iM18540v = 0;
            while (i < size) {
                iM18540v += C9498gR1.m18540v(bt1.m726h(i));
                i++;
            }
        } else {
            iM18540v = 0;
            while (i < size) {
                iM18540v += C9498gR1.m18540v(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iM18540v;
    }

    /* renamed from: Q */
    public static void m663Q(int i, List list, C10641pN0 c10641pN0, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        boolean z2 = list instanceof BT1;
        int i2 = 0;
        C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c9498gR1.m18556y(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c9498gR1.m18549H(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = C9498gR1.f27799f;
                i3 += 8;
            }
            c9498gR1.m18550I(i3);
            while (i2 < list.size()) {
                c9498gR1.m18557z(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        BT1 bt1 = (BT1) list;
        if (!z) {
            while (i2 < bt1.f839c) {
                c9498gR1.m18556y(i, bt1.m726h(i2));
                i2++;
            }
            return;
        }
        c9498gR1.m18549H(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < bt1.f839c; i6++) {
            bt1.m726h(i6);
            Logger logger2 = C9498gR1.f27799f;
            i5 += 8;
        }
        c9498gR1.m18550I(i5);
        while (i2 < bt1.f839c) {
            c9498gR1.m18557z(bt1.m726h(i2));
            i2++;
        }
    }

    /* renamed from: R */
    public static void m664R(int i, List list, C10641pN0 c10641pN0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        boolean z2 = list instanceof C11420vS1;
        int i2 = 0;
        C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    c9498gR1.m18551J(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            c9498gR1.m18549H(i, 2);
            int iM18522A = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iM18522A += C9498gR1.m18522A((iIntValue2 >> 31) ^ (iIntValue2 << 1));
            }
            c9498gR1.m18550I(iM18522A);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                c9498gR1.m18550I((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                i2++;
            }
            return;
        }
        C11420vS1 c11420vS1 = (C11420vS1) list;
        if (!z) {
            while (i2 < c11420vS1.f44385c) {
                int iM25424d = c11420vS1.m25424d(i2);
                c9498gR1.m18551J(i, (iM25424d >> 31) ^ (iM25424d << 1));
                i2++;
            }
            return;
        }
        c9498gR1.m18549H(i, 2);
        int iM18522A2 = 0;
        for (int i4 = 0; i4 < c11420vS1.f44385c; i4++) {
            int iM25424d2 = c11420vS1.m25424d(i4);
            iM18522A2 += C9498gR1.m18522A((iM25424d2 >> 31) ^ (iM25424d2 << 1));
        }
        c9498gR1.m18550I(iM18522A2);
        while (i2 < c11420vS1.f44385c) {
            int iM25424d3 = c11420vS1.m25424d(i2);
            c9498gR1.m18550I((iM25424d3 >> 31) ^ (iM25424d3 << 1));
            i2++;
        }
    }

    /* renamed from: S */
    public static void m665S(int i, List list, C10641pN0 c10641pN0, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        boolean z2 = list instanceof BT1;
        int i2 = 0;
        C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    c9498gR1.m18546E(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            c9498gR1.m18549H(i, 2);
            int iM18540v = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iM18540v += C9498gR1.m18540v((jLongValue2 >> 63) ^ (jLongValue2 << 1));
            }
            c9498gR1.m18550I(iM18540v);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                c9498gR1.m18547F((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                i2++;
            }
            return;
        }
        BT1 bt1 = (BT1) list;
        if (!z) {
            while (i2 < bt1.f839c) {
                long jM726h = bt1.m726h(i2);
                c9498gR1.m18546E(i, (jM726h >> 63) ^ (jM726h << 1));
                i2++;
            }
            return;
        }
        c9498gR1.m18549H(i, 2);
        int iM18540v2 = 0;
        for (int i4 = 0; i4 < bt1.f839c; i4++) {
            long jM726h2 = bt1.m726h(i4);
            iM18540v2 += C9498gR1.m18540v((jM726h2 >> 63) ^ (jM726h2 << 1));
        }
        c9498gR1.m18550I(iM18540v2);
        while (i2 < bt1.f839c) {
            long jM726h3 = bt1.m726h(i2);
            c9498gR1.m18547F((jM726h3 >> 63) ^ (jM726h3 << 1));
            i2++;
        }
    }

    /* renamed from: T */
    public static void m666T(int i, List list, C10641pN0 c10641pN0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        boolean z2 = list instanceof C11420vS1;
        int i2 = 0;
        C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c9498gR1.m18551J(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c9498gR1.m18549H(i, 2);
            int iM18522A = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM18522A += C9498gR1.m18522A(((Integer) list.get(i3)).intValue());
            }
            c9498gR1.m18550I(iM18522A);
            while (i2 < list.size()) {
                c9498gR1.m18550I(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C11420vS1 c11420vS1 = (C11420vS1) list;
        if (!z) {
            while (i2 < c11420vS1.f44385c) {
                c9498gR1.m18551J(i, c11420vS1.m25424d(i2));
                i2++;
            }
            return;
        }
        c9498gR1.m18549H(i, 2);
        int iM18522A2 = 0;
        for (int i4 = 0; i4 < c11420vS1.f44385c; i4++) {
            iM18522A2 += C9498gR1.m18522A(c11420vS1.m25424d(i4));
        }
        c9498gR1.m18550I(iM18522A2);
        while (i2 < c11420vS1.f44385c) {
            c9498gR1.m18550I(c11420vS1.m25424d(i2));
            i2++;
        }
    }

    /* renamed from: U */
    public static void m667U(int i, List list, C10641pN0 c10641pN0, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        boolean z2 = list instanceof BT1;
        int i2 = 0;
        C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c9498gR1.m18546E(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c9498gR1.m18549H(i, 2);
            int iM18540v = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM18540v += C9498gR1.m18540v(((Long) list.get(i3)).longValue());
            }
            c9498gR1.m18550I(iM18540v);
            while (i2 < list.size()) {
                c9498gR1.m18547F(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        BT1 bt1 = (BT1) list;
        if (!z) {
            while (i2 < bt1.f839c) {
                c9498gR1.m18546E(i, bt1.m726h(i2));
                i2++;
            }
            return;
        }
        c9498gR1.m18549H(i, 2);
        int iM18540v2 = 0;
        for (int i4 = 0; i4 < bt1.f839c; i4++) {
            iM18540v2 += C9498gR1.m18540v(bt1.m726h(i4));
        }
        c9498gR1.m18550I(iM18540v2);
        while (i2 < bt1.f839c) {
            c9498gR1.m18547F(bt1.m726h(i2));
            i2++;
        }
    }

    /* renamed from: a */
    public static boolean m668a(View view, WB0 wb0) {
        int iOrdinal;
        if (view == null || (iOrdinal = wb0.ordinal()) == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 12 || iOrdinal == 13) {
            return true;
        }
        Integer num = (Integer) view.getTag(R.id.pointer_events);
        return (num == null || (num.intValue() & (1 << wb0.ordinal())) == 0) ? false : true;
    }

    /* renamed from: b */
    public static int m669b(int i, Object obj, InterfaceC9122dV1 interfaceC9122dV1) {
        int iM18522A = C9498gR1.m18522A(i << 3);
        int iMo3856a = ((IP1) obj).mo3856a(interfaceC9122dV1);
        return C9498gR1.m18522A(iMo3856a) + iMo3856a + iM18522A;
    }

    /* renamed from: c */
    public static int m670c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C9498gR1.m18529h(i) * size;
    }

    /* renamed from: d */
    public static int m671d(int i, List list, InterfaceC9122dV1 interfaceC9122dV1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM18526d = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM18526d += C9498gR1.m18526d(i, (IP1) list.get(i2), interfaceC9122dV1);
        }
        return iM18526d;
    }

    /* renamed from: e */
    public static int m672e(List list) {
        return list.size();
    }

    /* renamed from: f */
    public static void m673f(int i, List list, C10641pN0 c10641pN0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            JQ1 jq1 = (JQ1) list.get(i2);
            C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
            c9498gR1.m18549H(i, 2);
            c9498gR1.m18554n(jq1);
        }
    }

    /* renamed from: g */
    public static void m674g(int i, List list, C10641pN0 c10641pN0, InterfaceC9122dV1 interfaceC9122dV1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c10641pN0.m23765x(i, list.get(i2), interfaceC9122dV1);
        }
    }

    /* renamed from: h */
    public static void m675h(int i, List list, C10641pN0 c10641pN0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        if (list instanceof AbstractC8979cQ1) {
            throw new ClassCastException();
        }
        C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                c9498gR1.m18549H(i, 0);
                c9498gR1.m18552g(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c9498gR1.m18549H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C9498gR1.f27799f;
            i3++;
        }
        c9498gR1.m18550I(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            c9498gR1.m18552g(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: i */
    public static void m676i(Object obj, int i, LS1 ls1, IS1 is1) {
        if (is1 == null) {
            return;
        }
        boolean z = ls1 instanceof RandomAccess;
        PV1 pv1 = PV1.f9096f;
        PV1 pv12 = null;
        if (!z) {
            Iterator it = ls1.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!is1.mo3879a(iIntValue)) {
                    if (pv12 == null) {
                        AbstractC10908rS1 abstractC10908rS1 = (AbstractC10908rS1) obj;
                        PV1 pv1M6377e = abstractC10908rS1.zzb;
                        if (pv1M6377e == pv1) {
                            pv1M6377e = PV1.m6377e();
                            abstractC10908rS1.zzb = pv1M6377e;
                        }
                        pv12 = pv1M6377e;
                    }
                    pv12.m6380c(i << 3, Long.valueOf(iIntValue));
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
            if (is1.mo3879a(iIntValue2)) {
                if (i3 != i2) {
                    ls1.set(i2, num);
                }
                i2++;
            } else {
                if (pv12 == null) {
                    AbstractC10908rS1 abstractC10908rS12 = (AbstractC10908rS1) obj;
                    PV1 pv1M6377e2 = abstractC10908rS12.zzb;
                    if (pv1M6377e2 == pv1) {
                        pv1M6377e2 = PV1.m6377e();
                        abstractC10908rS12.zzb = pv1M6377e2;
                    }
                    pv12 = pv1M6377e2;
                }
                pv12.m6380c(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i2 != size) {
            ls1.subList(i2, size).clear();
        }
    }

    /* renamed from: j */
    public static void m677j(Object obj, Object obj2) {
        AbstractC10908rS1 abstractC10908rS1 = (AbstractC10908rS1) obj;
        PV1 pv1 = abstractC10908rS1.zzb;
        PV1 pv12 = ((AbstractC10908rS1) obj2).zzb;
        PV1 pv13 = PV1.f9096f;
        if (!pv13.equals(pv12)) {
            if (pv13.equals(pv1)) {
                int i = pv1.f9097a + pv12.f9097a;
                int[] iArrCopyOf = Arrays.copyOf(pv1.f9098b, i);
                System.arraycopy(pv12.f9098b, 0, iArrCopyOf, pv1.f9097a, pv12.f9097a);
                Object[] objArrCopyOf = Arrays.copyOf(pv1.f9099c, i);
                System.arraycopy(pv12.f9099c, 0, objArrCopyOf, pv1.f9097a, pv12.f9097a);
                pv1 = new PV1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                pv1.getClass();
                if (!pv12.equals(pv13)) {
                    if (!pv1.f9101e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = pv1.f9097a + pv12.f9097a;
                    pv1.m6379b(i2);
                    System.arraycopy(pv12.f9098b, 0, pv1.f9098b, pv1.f9097a, pv12.f9097a);
                    System.arraycopy(pv12.f9099c, 0, pv1.f9099c, pv1.f9097a, pv12.f9097a);
                    pv1.f9097a = i2;
                }
            }
        }
        abstractC10908rS1.zzb = pv1;
    }

    /* renamed from: k */
    public static boolean m678k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: l */
    public static int m679l(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM18541w = C9498gR1.m18541w(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int iMo4321k = ((JQ1) list.get(i2)).mo4321k();
            iM18541w += C9498gR1.m18522A(iMo4321k) + iMo4321k;
        }
        return iM18541w;
    }

    /* renamed from: m */
    public static int m680m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C9498gR1.m18541w(i) * size) + m682o(list);
    }

    /* renamed from: n */
    public static int m681n(int i, List list, InterfaceC9122dV1 interfaceC9122dV1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM18541w = C9498gR1.m18541w(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iMo3856a = ((IP1) list.get(i2)).mo3856a(interfaceC9122dV1);
            iM18541w += C9498gR1.m18522A(iMo3856a) + iMo3856a;
        }
        return iM18541w;
    }

    /* renamed from: o */
    public static int m682o(List list) {
        int iM18540v;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11420vS1) {
            C11420vS1 c11420vS1 = (C11420vS1) list;
            iM18540v = 0;
            while (i < size) {
                iM18540v += C9498gR1.m18540v(c11420vS1.m25424d(i));
                i++;
            }
        } else {
            iM18540v = 0;
            while (i < size) {
                iM18540v += C9498gR1.m18540v(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM18540v;
    }

    /* renamed from: p */
    public static void m683p(int i, List list, C10641pN0 c10641pN0) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        boolean z = list instanceof InterfaceC10270mT1;
        C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                c9498gR1.m18549H(i, 2);
                int i3 = c9498gR1.f27804e;
                try {
                    int iM18522A = C9498gR1.m18522A(str.length() * 3);
                    int iM18522A2 = C9498gR1.m18522A(str.length());
                    byte[] bArr = c9498gR1.f27802c;
                    if (iM18522A2 == iM18522A) {
                        int i4 = i3 + iM18522A2;
                        c9498gR1.f27804e = i4;
                        int iM18822b = AbstractC9636hW1.m18822b(str, bArr, i4, c9498gR1.m18553k());
                        c9498gR1.f27804e = i3;
                        c9498gR1.m18550I((iM18822b - i3) - iM18522A2);
                        c9498gR1.f27804e = iM18822b;
                    } else {
                        c9498gR1.m18550I(AbstractC9636hW1.m18821a(str));
                        c9498gR1.f27804e = AbstractC9636hW1.m18822b(str, bArr, c9498gR1.f27804e, c9498gR1.m18553k());
                    }
                } catch (IndexOutOfBoundsException e) {
                    throw new C6583ou(e);
                } catch (C10148lW1 e2) {
                    c9498gR1.f27804e = i3;
                    C9498gR1.f27799f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                    byte[] bytes = str.getBytes(BS1.f826a);
                    try {
                        c9498gR1.m18550I(bytes.length);
                        c9498gR1.m18555q(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e3) {
                        throw new C6583ou(e3);
                    }
                }
            }
            return;
        }
        InterfaceC10270mT1 interfaceC10270mT1 = (InterfaceC10270mT1) list;
        for (int i5 = 0; i5 < list.size(); i5++) {
            Object objZza = interfaceC10270mT1.zza();
            if (objZza instanceof String) {
                String str2 = (String) objZza;
                c9498gR1.m18549H(i, 2);
                int i6 = c9498gR1.f27804e;
                try {
                    int iM18522A3 = C9498gR1.m18522A(str2.length() * 3);
                    int iM18522A4 = C9498gR1.m18522A(str2.length());
                    byte[] bArr2 = c9498gR1.f27802c;
                    if (iM18522A4 == iM18522A3) {
                        int i7 = i6 + iM18522A4;
                        c9498gR1.f27804e = i7;
                        int iM18822b2 = AbstractC9636hW1.m18822b(str2, bArr2, i7, c9498gR1.m18553k());
                        c9498gR1.f27804e = i6;
                        c9498gR1.m18550I((iM18822b2 - i6) - iM18522A4);
                        c9498gR1.f27804e = iM18822b2;
                    } else {
                        c9498gR1.m18550I(AbstractC9636hW1.m18821a(str2));
                        c9498gR1.f27804e = AbstractC9636hW1.m18822b(str2, bArr2, c9498gR1.f27804e, c9498gR1.m18553k());
                    }
                } catch (IndexOutOfBoundsException e4) {
                    throw new C6583ou(e4);
                } catch (C10148lW1 e5) {
                    c9498gR1.f27804e = i6;
                    C9498gR1.f27799f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
                    byte[] bytes2 = str2.getBytes(BS1.f826a);
                    try {
                        c9498gR1.m18550I(bytes2.length);
                        c9498gR1.m18555q(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e6) {
                        throw new C6583ou(e6);
                    }
                }
            } else {
                c9498gR1.m18549H(i, 2);
                c9498gR1.m18554n((JQ1) objZza);
            }
        }
    }

    /* renamed from: q */
    public static void m684q(int i, List list, C10641pN0 c10641pN0, InterfaceC9122dV1 interfaceC9122dV1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c10641pN0.m23749C(i, list.get(i2), interfaceC9122dV1);
        }
    }

    /* renamed from: r */
    public static void m685r(int i, List list, C10641pN0 c10641pN0, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        if (list instanceof AbstractC11672xR1) {
            throw new ClassCastException();
        }
        C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c9498gR1.getClass();
                c9498gR1.m18556y(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c9498gR1.m18549H(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C9498gR1.f27799f;
            i3 += 8;
        }
        c9498gR1.m18550I(i3);
        while (i2 < list.size()) {
            c9498gR1.m18557z(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: s */
    public static int m686s(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM18541w = C9498gR1.m18541w(i) * size;
        if (list instanceof InterfaceC10270mT1) {
            InterfaceC10270mT1 interfaceC10270mT1 = (InterfaceC10270mT1) list;
            while (i2 < size) {
                Object objZza = interfaceC10270mT1.zza();
                if (objZza instanceof JQ1) {
                    int iMo4321k = ((JQ1) objZza).mo4321k();
                    iM18541w = C9498gR1.m18522A(iMo4321k) + iMo4321k + iM18541w;
                } else {
                    iM18541w = C9498gR1.m18528f((String) objZza) + iM18541w;
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof JQ1) {
                    int iMo4321k2 = ((JQ1) obj).mo4321k();
                    iM18541w = C9498gR1.m18522A(iMo4321k2) + iMo4321k2 + iM18541w;
                } else {
                    iM18541w = C9498gR1.m18528f((String) obj) + iM18541w;
                }
                i2++;
            }
        }
        return iM18541w;
    }

    /* renamed from: t */
    public static int m687t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C9498gR1.m18532l(i) * size;
    }

    /* renamed from: u */
    public static int m688u(List list) {
        return list.size() << 2;
    }

    /* renamed from: v */
    public static void m689v(int i, List list, C10641pN0 c10641pN0, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        boolean z2 = list instanceof C11420vS1;
        int i2 = 0;
        C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c9498gR1.m18545D(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c9498gR1.m18549H(i, 2);
            int iM18540v = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM18540v += C9498gR1.m18540v(((Integer) list.get(i3)).intValue());
            }
            c9498gR1.m18550I(iM18540v);
            while (i2 < list.size()) {
                c9498gR1.m18548G(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C11420vS1 c11420vS1 = (C11420vS1) list;
        if (!z) {
            while (i2 < c11420vS1.f44385c) {
                c9498gR1.m18545D(i, c11420vS1.m25424d(i2));
                i2++;
            }
            return;
        }
        c9498gR1.m18549H(i, 2);
        int iM18540v2 = 0;
        for (int i4 = 0; i4 < c11420vS1.f44385c; i4++) {
            iM18540v2 += C9498gR1.m18540v(c11420vS1.m25424d(i4));
        }
        c9498gR1.m18550I(iM18540v2);
        while (i2 < c11420vS1.f44385c) {
            c9498gR1.m18548G(c11420vS1.m25424d(i2));
            i2++;
        }
    }

    /* renamed from: w */
    public static int m690w(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C9498gR1.m18531j(i) * size;
    }

    /* renamed from: x */
    public static int m691x(List list) {
        return list.size() << 3;
    }

    /* renamed from: y */
    public static void m692y(int i, List list, C10641pN0 c10641pN0, boolean z) throws C6583ou {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10641pN0.getClass();
        boolean z2 = list instanceof C11420vS1;
        int i2 = 0;
        C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c9498gR1.m18543B(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c9498gR1.m18549H(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = C9498gR1.f27799f;
                i3 += 4;
            }
            c9498gR1.m18550I(i3);
            while (i2 < list.size()) {
                c9498gR1.m18544C(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C11420vS1 c11420vS1 = (C11420vS1) list;
        if (!z) {
            while (i2 < c11420vS1.f44385c) {
                c9498gR1.m18543B(i, c11420vS1.m25424d(i2));
                i2++;
            }
            return;
        }
        c9498gR1.m18549H(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c11420vS1.f44385c; i6++) {
            c11420vS1.m25424d(i6);
            Logger logger2 = C9498gR1.f27799f;
            i5 += 4;
        }
        c9498gR1.m18550I(i5);
        while (i2 < c11420vS1.f44385c) {
            c9498gR1.m18544C(c11420vS1.m25424d(i2));
            i2++;
        }
    }

    /* renamed from: z */
    public static int m693z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C9498gR1.m18541w(i) * size) + m647A(list);
    }
}
