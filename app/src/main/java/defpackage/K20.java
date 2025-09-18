package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class K20 implements Iterable, InterfaceC7451ue0 {
    public final String[] a;

    public K20(String[] strArr) {
        this.a = strArr;
    }

    public final String b(String str) {
        O90.f(str, "name");
        String[] strArr = this.a;
        int length = strArr.length - 2;
        int iA = AbstractC7207tM1.a(length, 0, -2);
        if (iA <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != iA) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String d(int i) {
        return this.a[i * 2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof K20) {
            if (Arrays.equals(this.a, ((K20) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final J20 i() {
        J20 j20 = new J20();
        AbstractC0314Du.n(j20.a, this.a);
        return j20;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(d(i), q(i));
        }
        return HN1.a(pairArr);
    }

    public final TreeMap k() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        O90.e(comparator, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strD = d(i);
            Locale locale = Locale.US;
            O90.e(locale, "US");
            String lowerCase = strD.toLowerCase(locale);
            O90.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(q(i));
        }
        return treeMap;
    }

    public final String q(int i) {
        return this.a[(i * 2) + 1];
    }

    public final List r(String str) {
        O90.f(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(d(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(q(i));
            }
        }
        if (arrayList == null) {
            return MN.a;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        O90.e(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strD = d(i);
            String strQ = q(i);
            sb.append(strD);
            sb.append(": ");
            if (AbstractC0199Ch1.r(strD)) {
                strQ = "██";
            }
            sb.append(strQ);
            sb.append("\n");
        }
        String string = sb.toString();
        O90.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
