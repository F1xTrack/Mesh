package p000;

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
public final class K20 implements Iterable, InterfaceC11315ue0 {

    /* renamed from: a */
    public final String[] f5885a;

    public K20(String[] strArr) {
        this.f5885a = strArr;
    }

    /* renamed from: b */
    public final String m4524b(String str) {
        O90.m5968f(str, "name");
        String[] strArr = this.f5885a;
        int length = strArr.length - 2;
        int iM24880a = AbstractC11152tM1.m24880a(length, 0, -2);
        if (iM24880a <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != iM24880a) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    /* renamed from: d */
    public final String m4525d(int i) {
        return this.f5885a[i * 2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof K20) {
            if (Arrays.equals(this.f5885a, ((K20) obj).f5885a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5885a);
    }

    /* renamed from: i */
    public final J20 m4526i() {
        J20 j20 = new J20();
        AbstractC0246Du.m1921n(j20.f5287a, this.f5885a);
        return j20;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(m4525d(i), m4528q(i));
        }
        return HN1.m3386a(pairArr);
    }

    /* renamed from: k */
    public final TreeMap m4527k() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        O90.m5967e(comparator, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM4525d = m4525d(i);
            Locale locale = Locale.US;
            O90.m5967e(locale, "US");
            String lowerCase = strM4525d.toLowerCase(locale);
            O90.m5967e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m4528q(i));
        }
        return treeMap;
    }

    /* renamed from: q */
    public final String m4528q(int i) {
        return this.f5885a[(i * 2) + 1];
    }

    /* renamed from: r */
    public final List m4529r(String str) {
        O90.m5968f(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(m4525d(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m4528q(i));
            }
        }
        if (arrayList == null) {
            return C0779MN.f7117a;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        O90.m5967e(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int size() {
        return this.f5885a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM4525d = m4525d(i);
            String strM4528q = m4528q(i);
            sb.append(strM4525d);
            sb.append(": ");
            if (AbstractC7433Ch1.m1289r(strM4525d)) {
                strM4528q = "██";
            }
            sb.append(strM4528q);
            sb.append("\n");
        }
        String string = sb.toString();
        O90.m5967e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
