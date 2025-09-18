package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.StackTraceItem;
import defpackage.AbstractC8449zu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.q7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3021q7 {
    public static final C2996p7 a(Throwable th, C2722e7 c2722e7, List<StackTraceElement> list, String str, Boolean bool) {
        ArrayList arrayList = null;
        C2946n7 c2946n7A = th != null ? C2971o7.a(th) : null;
        if (list != null) {
            arrayList = new ArrayList(AbstractC8449zu.k(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C2896l7((StackTraceElement) it.next()));
            }
        }
        return new C2996p7(c2946n7A, c2722e7, arrayList, null, null, null, str, bool);
    }

    public static final C2996p7 a(String str, String str2, List<? extends StackTraceItem> list, String str3, String str4, Map<String, String> map, String str5, Boolean bool) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(AbstractC8449zu.k(list));
            for (StackTraceItem stackTraceItem : list) {
                arrayList.add(new C2896l7(stackTraceItem.getClassName(), stackTraceItem.getFileName(), stackTraceItem.getLine(), stackTraceItem.getColumn(), stackTraceItem.getMethodName(), null));
            }
        } else {
            arrayList = null;
        }
        return new C2996p7(new C2946n7(str, str2, arrayList, null, null), null, null, str3, str4, map, str5, bool);
    }
}
