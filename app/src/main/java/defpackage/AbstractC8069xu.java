package defpackage;

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
public abstract class AbstractC8069xu extends AbstractC0314Du {
    public static Object A(List list) {
        O90.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object B(Iterable iterable) {
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

    public static Object C(List list) {
        O90.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object D(int i, List list) {
        O90.f(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static Set E(Collection collection, Iterable iterable) {
        O90.f(collection, "<this>");
        O90.f(iterable, "other");
        Set setF0 = f0(collection);
        setF0.retainAll(AbstractC0314Du.o(iterable));
        return setF0;
    }

    public static final void F(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(iterable, "<this>");
        O90.f(sb, "buffer");
        O90.f(charSequence, "separator");
        O90.f(charSequence2, "prefix");
        O90.f(charSequence3, "postfix");
        O90.f(charSequence4, "truncated");
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
                AbstractC7728w51.a(sb, obj, interfaceC6099nZ);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void G(Iterable iterable, StringBuilder sb, String str, String str2, String str3, InterfaceC6099nZ interfaceC6099nZ, int i) {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? "" : str2;
        String str6 = (i & 8) != 0 ? "" : str3;
        if ((i & 64) != 0) {
            interfaceC6099nZ = null;
        }
        F(iterable, sb, str4, str5, str6, -1, "...", interfaceC6099nZ);
    }

    public static String H(Iterable iterable, String str, String str2, String str3, InterfaceC6099nZ interfaceC6099nZ, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC6099nZ = null;
        }
        O90.f(iterable, "<this>");
        O90.f(str4, "separator");
        O90.f(str5, "prefix");
        O90.f(str6, "postfix");
        StringBuilder sb = new StringBuilder();
        F(iterable, sb, str4, str5, str6, -1, "...", interfaceC6099nZ);
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    public static Object I(Iterable iterable) {
        if (iterable instanceof List) {
            return J((List) iterable);
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

    public static Object J(List list) {
        O90.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC8259yu.d(list));
    }

    public static Object K(List list) {
        O90.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList L(Iterable iterable, Iterable iterable2) {
        O90.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return N((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC0314Du.m(arrayList, iterable);
        AbstractC0314Du.m(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList M(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return O((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC0314Du.m(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList N(Collection collection, Iterable iterable) {
        O90.f(collection, "<this>");
        O90.f(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC0314Du.m(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList O(Collection collection, Object obj) {
        O90.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List P(ArrayList arrayList) {
        O90.f(arrayList, "<this>");
        if (arrayList.size() <= 1) {
            return b0(arrayList);
        }
        List listE0 = e0(arrayList);
        Collections.reverse(listE0);
        return listE0;
    }

    public static Object Q(Iterable iterable) {
        O90.f(iterable, "<this>");
        if (iterable instanceof List) {
            return R((List) iterable);
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

    public static Object R(List list) {
        O90.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object S(Iterable iterable) {
        O90.f(iterable, "<this>");
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

    public static Object T(List list) {
        O90.f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List U(List list, C3909g90 c3909g90) {
        O90.f(list, "<this>");
        O90.f(c3909g90, "indices");
        if (c3909g90.isEmpty()) {
            return MN.a;
        }
        return b0(list.subList(c3909g90.a, c3909g90.b + 1));
    }

    public static List V(AbstractList abstractList) {
        O90.f(abstractList, "<this>");
        if (abstractList.size() <= 1) {
            return b0(abstractList);
        }
        Object[] array = abstractList.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        O90.f(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return J8.c(array);
    }

    public static List W(Iterable iterable, Comparator comparator) {
        O90.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listE0 = e0(iterable);
            AbstractC0236Cu.l(listE0, comparator);
            return listE0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return b0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        J8.z(array, comparator);
        return J8.c(array);
    }

    public static List X(Iterable iterable, int i) {
        O90.f(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC8235ym.g(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return MN.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return b0(iterable);
            }
            if (i == 1) {
                return AbstractC8259yu.e(z(iterable));
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
        return AbstractC8259yu.i(arrayList);
    }

    public static List Y(int i, List list) {
        O90.f(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC8235ym.g(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return MN.a;
        }
        int size = list.size();
        if (i >= size) {
            return b0(list);
        }
        if (i == 1) {
            return AbstractC8259yu.e(J(list));
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

    public static final void Z(Iterable iterable, AbstractCollection abstractCollection) {
        O90.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] a0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List b0(Iterable iterable) {
        O90.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC8259yu.i(e0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return MN.a;
        }
        if (size != 1) {
            return d0(collection);
        }
        return AbstractC8259yu.e(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static long[] c0(Collection collection) {
        O90.f(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList d0(Collection collection) {
        O90.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List e0(Iterable iterable) {
        O90.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return d0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        Z(iterable, arrayList);
        return arrayList;
    }

    public static Set f0(Iterable iterable) {
        O90.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Z(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set g0(Iterable iterable) {
        O90.f(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        SN sn = SN.a;
        if (!z) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Z(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : AbstractC7627vZ0.e(linkedHashSet.iterator().next()) : sn;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return sn;
        }
        if (size2 == 1) {
            return AbstractC7627vZ0.e(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC7287tn0.b(collection.size()));
        Z(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static L8 h0(Iterable iterable) {
        O90.f(iterable, "<this>");
        return new L8(new C3881g1(8, iterable));
    }

    public static ArrayList i0(Iterable iterable, Iterable iterable2) {
        O90.f(iterable, "<this>");
        O90.f(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC8449zu.k(iterable), AbstractC8449zu.k(iterable2)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int r(int i, List list) {
        if (i >= 0 && i <= AbstractC8259yu.d(list)) {
            return AbstractC8259yu.d(list) - i;
        }
        StringBuilder sbN = AbstractC8235ym.n(i, "Element index ", " must be in range [");
        sbN.append(new C3909g90(0, AbstractC8259yu.d(list), 1));
        sbN.append("].");
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    public static final int s(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbN = AbstractC8235ym.n(i, "Position index ", " must be in range [");
        sbN.append(new C3909g90(0, list.size(), 1));
        sbN.append("].");
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    public static M8 t(Iterable iterable) {
        O90.f(iterable, "<this>");
        return new M8(1, iterable);
    }

    public static double u(ArrayList arrayList) {
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

    public static boolean v(Iterable iterable, Object obj) {
        int iIndexOf;
        O90.f(iterable, "<this>");
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
                    AbstractC8259yu.j();
                    throw null;
                }
                if (O90.a(obj, next)) {
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

    public static List w(Iterable iterable) {
        ArrayList arrayList;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - 1;
            if (size <= 0) {
                return MN.a;
            }
            if (size == 1) {
                return AbstractC8259yu.e(I(iterable));
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
        return AbstractC8259yu.i(arrayList);
    }

    public static List x(int i, List list) {
        O90.f(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC8235ym.g(i, "Requested element count ", " is less than zero.").toString());
        }
        List list2 = list;
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return X(list2, size);
    }

    public static List y(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object z(Iterable iterable) {
        O90.f(iterable, "<this>");
        if (iterable instanceof List) {
            return A((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }
}
