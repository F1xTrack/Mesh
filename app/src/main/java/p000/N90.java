package p000;

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

    /* renamed from: a */
    public static final Object[] f7534a = new Object[0];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.HashMap, java.util.Map] */
    /* renamed from: a */
    public static HashMap m5578a(List list, HashMap map, List list2) {
        C7314Aa0 c7314Aa0;
        HashMap map2 = new HashMap();
        C9108dO1 c9108dO1M25076f = (Build.VERSION.SDK_INT < 24 || ((String) AbstractC9080dA1.m17501a("localeMatcher", map)).equals("lookup")) ? AbstractC11234u10.m25076f((String[]) list.toArray(new String[list.size()])) : AbstractC11234u10.m25073c((String[]) list.toArray(new String[list.size()]));
        HashSet hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C7314Aa0 c7314Aa02 = AbstractC9080dA1.f25854b;
            if (((HashMap) c9108dO1M25076f.f26013c).isEmpty() || !((HashMap) c9108dO1M25076f.f26013c).containsKey(str)) {
                c7314Aa0 = c7314Aa02;
            } else {
                ?? r4 = (String) ((HashMap) c9108dO1M25076f.f26013c).get(str);
                boolean zIsEmpty = r4.isEmpty();
                C7314Aa0 c7314Aa03 = r4;
                if (zIsEmpty) {
                    c7314Aa03 = "true";
                }
                hashSet.add(str);
                c7314Aa0 = c7314Aa03;
            }
            C7314Aa0 c7314Aa04 = c7314Aa0;
            if (map.containsKey(str)) {
                ?? M17501a = AbstractC9080dA1.m17501a(str, map);
                boolean z = M17501a instanceof String;
                C7314Aa0 bool = M17501a;
                if (z) {
                    boolean zIsEmpty2 = ((String) M17501a).isEmpty();
                    bool = M17501a;
                    if (zIsEmpty2) {
                        bool = new Boolean(true);
                    }
                }
                c7314Aa04 = c7314Aa0;
                if (!(bool instanceof C7366Ba0)) {
                    boolean zEquals = bool.equals(c7314Aa0);
                    c7314Aa04 = c7314Aa0;
                    if (!zEquals) {
                        hashSet.remove(str);
                        c7314Aa04 = bool;
                    }
                }
            }
            boolean z2 = c7314Aa04 instanceof C7314Aa0;
            C7314Aa0 c7314Aa0M7412c = c7314Aa04;
            if (!z2) {
                c7314Aa0M7412c = AbstractC8261Sf1.m7412c(c7314Aa04, str);
            }
            if (!(c7314Aa0M7412c instanceof String) || AbstractC8261Sf1.m7410a(str, (String) c7314Aa0M7412c, (Y40) c9108dO1M25076f.f26012b)) {
                map2.put(str, c7314Aa0M7412c);
            } else {
                map2.put(str, c7314Aa02);
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            ArrayList arrayList = new ArrayList();
            String str3 = (String) AbstractC8261Sf1.m7412c((String) ((HashMap) c9108dO1M25076f.f26013c).get(str2), str2);
            if (!(str3 instanceof String) || AbstractC8261Sf1.m7410a(str2, str3, (Y40) c9108dO1M25076f.f26012b)) {
                arrayList.add(str3);
                ((Y40) c9108dO1M25076f.f26012b).mo5825f(str2, arrayList);
            }
        }
        map2.put(CommonUrlParts.LOCALE, (Y40) c9108dO1M25076f.f26012b);
        return map2;
    }

    /* renamed from: b */
    public static final Object[] m5579b(Collection collection) {
        int size = collection.size();
        Object[] objArr = f7534a;
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
                O90.m5967e(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                O90.m5967e(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i = i2;
        }
    }

    /* renamed from: c */
    public static final Object[] m5580c(Collection collection, Object[] objArr) throws NegativeArraySizeException {
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
            O90.m5966d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
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
                O90.m5967e(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                O90.m5967e(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i = i2;
        }
    }
}
