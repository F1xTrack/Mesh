package defpackage;

import android.os.Build;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class N90 {
    public static final Object[] a = new Object[0];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.HashMap, java.util.Map] */
    public static HashMap a(List list, HashMap map, List list2) {
        C0021Aa0 c0021Aa0;
        HashMap map2 = new HashMap();
        C3383dO1 c3383dO1F = (Build.VERSION.SDK_INT < 24 || ((String) AbstractC3341dA1.a("localeMatcher", map)).equals("lookup")) ? AbstractC7331u10.f((String[]) list.toArray(new String[list.size()])) : AbstractC7331u10.c((String[]) list.toArray(new String[list.size()]));
        HashSet hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C0021Aa0 c0021Aa02 = AbstractC3341dA1.b;
            if (((HashMap) c3383dO1F.c).isEmpty() || !((HashMap) c3383dO1F.c).containsKey(str)) {
                c0021Aa0 = c0021Aa02;
            } else {
                ?? r4 = (String) ((HashMap) c3383dO1F.c).get(str);
                boolean zIsEmpty = r4.isEmpty();
                C0021Aa0 c0021Aa03 = r4;
                if (zIsEmpty) {
                    c0021Aa03 = "true";
                }
                hashSet.add(str);
                c0021Aa0 = c0021Aa03;
            }
            C0021Aa0 c0021Aa04 = c0021Aa0;
            if (map.containsKey(str)) {
                ?? A = AbstractC3341dA1.a(str, map);
                boolean z = A instanceof String;
                C0021Aa0 bool = A;
                if (z) {
                    boolean zIsEmpty2 = ((String) A).isEmpty();
                    bool = A;
                    if (zIsEmpty2) {
                        bool = new Boolean(true);
                    }
                }
                c0021Aa04 = c0021Aa0;
                if (!(bool instanceof C0099Ba0)) {
                    boolean zEquals = bool.equals(c0021Aa0);
                    c0021Aa04 = c0021Aa0;
                    if (!zEquals) {
                        hashSet.remove(str);
                        c0021Aa04 = bool;
                    }
                }
            }
            boolean z2 = c0021Aa04 instanceof C0021Aa0;
            C0021Aa0 c0021Aa0C = c0021Aa04;
            if (!z2) {
                c0021Aa0C = AbstractC1440Sf1.c(c0021Aa04, str);
            }
            if (!(c0021Aa0C instanceof String) || AbstractC1440Sf1.a(str, (String) c0021Aa0C, (Y40) c3383dO1F.b)) {
                map2.put(str, c0021Aa0C);
            } else {
                map2.put(str, c0021Aa02);
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            ArrayList arrayList = new ArrayList();
            String str3 = (String) AbstractC1440Sf1.c((String) ((HashMap) c3383dO1F.c).get(str2), str2);
            if (!(str3 instanceof String) || AbstractC1440Sf1.a(str2, str3, (Y40) c3383dO1F.b)) {
                arrayList.add(str3);
                ((Y40) c3383dO1F.b).f(str2, arrayList);
            }
        }
        map2.put(CommonUrlParts.LOCALE, (Y40) c3383dO1F.b);
        return map2;
    }

    public static final Object[] b(Collection collection) {
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                O90.e(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                O90.e(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i = i2;
        }
    }

    public static final Object[] c(Collection collection, Object[] objArr) throws NegativeArraySizeException {
        Object[] objArrCopyOf;
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            O90.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                O90.e(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                O90.e(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i = i2;
        }
    }
}
