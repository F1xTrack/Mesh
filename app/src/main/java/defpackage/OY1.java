package defpackage;

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
    public static long a;
    public static Method b;
    public static Method c;
    public static Method d;
    public static Method e;

    public static void a(String str) {
        Trace.beginSection(f(str));
    }

    public static void b(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (C4108hC c4108hC : (Set) it2.next()) {
                        for (RH rh : c4108hC.a.c) {
                            if (rh.c == 0) {
                                Set<C4108hC> set = (Set) map.get(new C4299iC(rh.a, rh.b == 2));
                                if (set != null) {
                                    for (C4108hC c4108hC2 : set) {
                                        c4108hC.b.add(c4108hC2);
                                        c4108hC2.c.add(c4108hC);
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
                    C4108hC c4108hC3 = (C4108hC) it4.next();
                    if (c4108hC3.c.isEmpty()) {
                        hashSet2.add(c4108hC3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    C4108hC c4108hC4 = (C4108hC) hashSet2.iterator().next();
                    hashSet2.remove(c4108hC4);
                    i++;
                    Iterator it5 = c4108hC4.b.iterator();
                    while (it5.hasNext()) {
                        C4108hC c4108hC5 = (C4108hC) it5.next();
                        c4108hC5.c.remove(c4108hC4);
                        if (c4108hC5.c.isEmpty()) {
                            hashSet2.add(c4108hC5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    C4108hC c4108hC6 = (C4108hC) it6.next();
                    if (!c4108hC6.c.isEmpty() && !c4108hC6.b.isEmpty()) {
                        arrayList2.add(c4108hC6.a);
                    }
                }
                throw new TH("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            C7119sv c7119sv = (C7119sv) it.next();
            C4108hC c4108hC7 = new C4108hC(c7119sv);
            for (C6997sG0 c6997sG0 : c7119sv.b) {
                boolean z = c7119sv.e == 0;
                C4299iC c4299iC = new C4299iC(c6997sG0, !z);
                if (!map.containsKey(c4299iC)) {
                    map.put(c4299iC, new HashSet());
                }
                Set set2 = (Set) map.get(c4299iC);
                if (!set2.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + c6997sG0 + ".");
                }
                set2.add(c4108hC7);
            }
        }
    }

    public static void c(Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0103Bb1.c();
        }
        try {
            if (b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e2) {
            c(e2);
            return false;
        }
    }

    public static void e(int i, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0103Bb1.d(i, f(str));
            return;
        }
        String strF = f(str);
        try {
            if (e == null) {
                e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            e.invoke(null, Long.valueOf(a), strF, Integer.valueOf(i));
        } catch (Exception e2) {
            c(e2);
        }
    }

    public static String f(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
