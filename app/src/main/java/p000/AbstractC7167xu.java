package p000;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;

/* renamed from: xu */
/* loaded from: classes2.dex */
public abstract class AbstractC7167xu extends AbstractC0246Du {
    /* renamed from: A */
    public static Object m25955A(List list) {
        O90.m5968f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* renamed from: B */
    public static Object m25956B(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* renamed from: C */
    public static Object m25957C(List list) {
        O90.m5968f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: D */
    public static Object m25958D(int i, List list) {
        O90.m5968f(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: E */
    public static Set m25959E(Collection collection, Iterable iterable) {
        O90.m5968f(collection, "<this>");
        O90.m5968f(iterable, "other");
        Set setM25986f0 = m25986f0(collection);
        setM25986f0.retainAll(AbstractC0246Du.m1922o(iterable));
        return setM25986f0;
    }

    /* renamed from: F */
    public static final void m25960F(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(iterable, "<this>");
        O90.m5968f(sb, "buffer");
        O90.m5968f(charSequence, "separator");
        O90.m5968f(charSequence2, "prefix");
        O90.m5968f(charSequence3, "postfix");
        O90.m5968f(charSequence4, "truncated");
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                AbstractC11501w51.m25560a(sb, obj, interfaceC6497nZ);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    /* renamed from: G */
    public static /* synthetic */ void m25961G(Iterable iterable, StringBuilder sb, String str, String str2, String str3, InterfaceC6497nZ interfaceC6497nZ, int i) {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? "" : str2;
        String str6 = (i & 8) != 0 ? "" : str3;
        if ((i & 64) != 0) {
            interfaceC6497nZ = null;
        }
        m25960F(iterable, sb, str4, str5, str6, -1, "...", interfaceC6497nZ);
    }

    /* renamed from: H */
    public static String m25962H(Iterable iterable, String str, String str2, String str3, InterfaceC6497nZ interfaceC6497nZ, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC6497nZ = null;
        }
        O90.m5968f(iterable, "<this>");
        O90.m5968f(str4, "separator");
        O90.m5968f(str5, "prefix");
        O90.m5968f(str6, "postfix");
        StringBuilder sb = new StringBuilder();
        m25960F(iterable, sb, str4, str5, str6, -1, "...", interfaceC6497nZ);
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    /* renamed from: I */
    public static Object m25963I(Iterable iterable) {
        if (iterable instanceof List) {
            return m25964J((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* renamed from: J */
    public static Object m25964J(List list) {
        O90.m5968f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC7230yu.m26273d(list));
    }

    /* renamed from: K */
    public static Object m25965K(List list) {
        O90.m5968f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: L */
    public static ArrayList m25966L(Iterable iterable, Iterable iterable2) {
        O90.m5968f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m25968N((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC0246Du.m1920m(arrayList, iterable);
        AbstractC0246Du.m1920m(arrayList, iterable2);
        return arrayList;
    }

    /* renamed from: M */
    public static ArrayList m25967M(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return m25969O((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC0246Du.m1920m(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: N */
    public static ArrayList m25968N(Collection collection, Iterable iterable) {
        O90.m5968f(collection, "<this>");
        O90.m5968f(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC0246Du.m1920m(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* renamed from: O */
    public static ArrayList m25969O(Collection collection, Object obj) {
        O90.m5968f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: P */
    public static List m25970P(ArrayList arrayList) {
        O90.m5968f(arrayList, "<this>");
        if (arrayList.size() <= 1) {
            return m25982b0(arrayList);
        }
        List listM25985e0 = m25985e0(arrayList);
        Collections.reverse(listM25985e0);
        return listM25985e0;
    }

    /* renamed from: Q */
    public static Object m25971Q(Iterable iterable) {
        O90.m5968f(iterable, "<this>");
        if (iterable instanceof List) {
            return m25972R((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    /* renamed from: R */
    public static Object m25972R(List list) {
        O90.m5968f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* renamed from: S */
    public static Object m25973S(Iterable iterable) {
        O90.m5968f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* renamed from: T */
    public static Object m25974T(List list) {
        O90.m5968f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: U */
    public static List m25975U(List list, C9461g90 c9461g90) {
        O90.m5968f(list, "<this>");
        O90.m5968f(c9461g90, "indices");
        if (c9461g90.isEmpty()) {
            return C0779MN.f7117a;
        }
        return m25982b0(list.subList(c9461g90.f26569a, c9461g90.f26570b + 1));
    }

    /* renamed from: V */
    public static List m25976V(AbstractList abstractList) {
        O90.m5968f(abstractList, "<this>");
        if (abstractList.size() <= 1) {
            return m25982b0(abstractList);
        }
        Object[] array = abstractList.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        O90.m5968f(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return AbstractC0576J8.m4176c(array);
    }

    /* renamed from: W */
    public static List m25977W(Iterable iterable, Comparator comparator) {
        O90.m5968f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listM25985e0 = m25985e0(iterable);
            AbstractC0183Cu.m1455l(listM25985e0, comparator);
            return listM25985e0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m25982b0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC0576J8.m4199z(array, comparator);
        return AbstractC0576J8.m4176c(array);
    }

    /* renamed from: X */
    public static List m25978X(Iterable iterable, int i) {
        O90.m5968f(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC7222ym.m26230g(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return C0779MN.f7117a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return m25982b0(iterable);
            }
            if (i == 1) {
                return AbstractC7230yu.m26274e(m25998z(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return AbstractC7230yu.m26278i(arrayList);
    }

    /* renamed from: Y */
    public static List m25979Y(int i, List list) {
        O90.m5968f(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC7222ym.m26230g(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return C0779MN.f7117a;
        }
        int size = list.size();
        if (i >= size) {
            return m25982b0(list);
        }
        if (i == 1) {
            return AbstractC7230yu.m26274e(m25964J(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* renamed from: Z */
    public static final void m25980Z(Iterable iterable, AbstractCollection abstractCollection) {
        O90.m5968f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* renamed from: a0 */
    public static int[] m25981a0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: b0 */
    public static List m25982b0(Iterable iterable) {
        O90.m5968f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC7230yu.m26278i(m25985e0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C0779MN.f7117a;
        }
        if (size != 1) {
            return m25984d0(collection);
        }
        return AbstractC7230yu.m26274e(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: c0 */
    public static long[] m25983c0(Collection collection) {
        O90.m5968f(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: d0 */
    public static ArrayList m25984d0(Collection collection) {
        O90.m5968f(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: e0 */
    public static final List m25985e0(Iterable iterable) {
        O90.m5968f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m25984d0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m25980Z(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: f0 */
    public static Set m25986f0(Iterable iterable) {
        O90.m5968f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m25980Z(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: g0 */
    public static Set m25987g0(Iterable iterable) {
        O90.m5968f(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        C1156SN c1156sn = C1156SN.f10705a;
        if (!z) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m25980Z(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : AbstractC11433vZ0.m25454e(linkedHashSet.iterator().next()) : c1156sn;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c1156sn;
        }
        if (size2 == 1) {
            return AbstractC11433vZ0.m25454e(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC11205tn0.m24983b(collection.size()));
        m25980Z(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    /* renamed from: h0 */
    public static C0702L8 m25988h0(Iterable iterable) {
        O90.m5968f(iterable, "<this>");
        return new C0702L8(new C4090g1(8, iterable));
    }

    /* renamed from: i0 */
    public static ArrayList m25989i0(Iterable iterable, Iterable iterable2) {
        O90.m5968f(iterable, "<this>");
        O90.m5968f(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC7293zu.m26586k(iterable), AbstractC7293zu.m26586k(iterable2)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: r */
    public static final int m25990r(int i, List list) {
        if (i >= 0 && i <= AbstractC7230yu.m26273d(list)) {
            return AbstractC7230yu.m26273d(list) - i;
        }
        StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "Element index ", " must be in range [");
        sbM26237n.append(new C9461g90(0, AbstractC7230yu.m26273d(list), 1));
        sbM26237n.append("].");
        throw new IndexOutOfBoundsException(sbM26237n.toString());
    }

    /* renamed from: s */
    public static final int m25991s(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "Position index ", " must be in range [");
        sbM26237n.append(new C9461g90(0, list.size(), 1));
        sbM26237n.append("].");
        throw new IndexOutOfBoundsException(sbM26237n.toString());
    }

    /* renamed from: t */
    public static C0764M8 m25992t(Iterable iterable) {
        O90.m5968f(iterable, "<this>");
        return new C0764M8(1, iterable);
    }

    /* renamed from: u */
    public static double m25993u(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dFloatValue = ConfigValue.DOUBLE_DEFAULT_VALUE;
        int i = 0;
        while (it.hasNext()) {
            dFloatValue += ((Number) it.next()).floatValue();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / i;
    }

    /* renamed from: v */
    public static boolean m25994v(Iterable iterable, Object obj) {
        int iIndexOf;
        O90.m5968f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    AbstractC7230yu.m26279j();
                    throw null;
                }
                if (O90.m5963a(obj, next)) {
                    iIndexOf = i;
                    break;
                }
                i++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    /* renamed from: w */
    public static List m25995w(Iterable iterable) {
        ArrayList arrayList;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - 1;
            if (size <= 0) {
                return C0779MN.f7117a;
            }
            if (size == 1) {
                return AbstractC7230yu.m26274e(m25963I(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    for (int i = 1; i < size2; i++) {
                        arrayList.add(((List) iterable).get(i));
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(1);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= 1) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return AbstractC7230yu.m26278i(arrayList);
    }

    /* renamed from: x */
    public static List m25996x(int i, List list) {
        O90.m5968f(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC7222ym.m26230g(i, "Requested element count ", " is less than zero.").toString());
        }
        List list2 = list;
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return m25978X(list2, size);
    }

    /* renamed from: y */
    public static List m25997y(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    public static Object m25998z(Iterable iterable) {
        O90.m5968f(iterable, "<this>");
        if (iterable instanceof List) {
            return m25955A((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }
}
