package p000;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class OY1 {

    /* renamed from: a */
    public static long f8483a;

    /* renamed from: b */
    public static Method f8484b;

    /* renamed from: c */
    public static Method f8485c;

    /* renamed from: d */
    public static Method f8486d;

    /* renamed from: e */
    public static Method f8487e;

    /* renamed from: a */
    public static void m6083a(String str) {
        Trace.beginSection(m6088f(str));
    }

    /* renamed from: b */
    public static void m6084b(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (C4164hC c4164hC : (Set) it2.next()) {
                        for (C1087RH c1087rh : c4164hC.f28305a.f42721c) {
                            if (c1087rh.f10106c == 0) {
                                Set<C4164hC> set = (Set) map.get(new C4227iC(c1087rh.f10104a, c1087rh.f10105b == 2));
                                if (set != null) {
                                    for (C4164hC c4164hC2 : set) {
                                        c4164hC.f28306b.add(c4164hC2);
                                        c4164hC2.f28307c.add(c4164hC);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C4164hC c4164hC3 = (C4164hC) it4.next();
                    if (c4164hC3.f28307c.isEmpty()) {
                        hashSet2.add(c4164hC3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    C4164hC c4164hC4 = (C4164hC) hashSet2.iterator().next();
                    hashSet2.remove(c4164hC4);
                    i++;
                    Iterator it5 = c4164hC4.f28306b.iterator();
                    while (it5.hasNext()) {
                        C4164hC c4164hC5 = (C4164hC) it5.next();
                        c4164hC5.f28307c.remove(c4164hC4);
                        if (c4164hC5.f28307c.isEmpty()) {
                            hashSet2.add(c4164hC5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    C4164hC c4164hC6 = (C4164hC) it6.next();
                    if (!c4164hC6.f28307c.isEmpty() && !c4164hC6.f28306b.isEmpty()) {
                        arrayList2.add(c4164hC6.f28305a);
                    }
                }
                throw new C1213TH("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            C6853sv c6853sv = (C6853sv) it.next();
            C4164hC c4164hC7 = new C4164hC(c6853sv);
            for (C11011sG0 c11011sG0 : c6853sv.f42720b) {
                boolean z = c6853sv.f42723e == 0;
                C4227iC c4227iC = new C4227iC(c11011sG0, !z);
                if (!map.containsKey(c4227iC)) {
                    map.put(c4227iC, new HashSet());
                }
                Set set2 = (Set) map.get(c4227iC);
                if (!set2.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + c11011sG0 + ".");
                }
                set2.add(c4164hC7);
            }
        }
    }

    /* renamed from: c */
    public static void m6085c(Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* renamed from: d */
    public static boolean m6086d() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC7369Bb1.m776c();
        }
        try {
            if (f8484b == null) {
                f8483a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f8484b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f8484b.invoke(null, Long.valueOf(f8483a))).booleanValue();
        } catch (Exception e) {
            m6085c(e);
            return false;
        }
    }

    /* renamed from: e */
    public static void m6087e(int i, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC7369Bb1.m777d(i, m6088f(str));
            return;
        }
        String strM6088f = m6088f(str);
        try {
            if (f8487e == null) {
                f8487e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f8487e.invoke(null, Long.valueOf(f8483a), strM6088f, Integer.valueOf(i));
        } catch (Exception e) {
            m6085c(e);
        }
    }

    /* renamed from: f */
    public static String m6088f(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
