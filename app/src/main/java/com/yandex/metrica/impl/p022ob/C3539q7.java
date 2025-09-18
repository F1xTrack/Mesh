package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.plugins.StackTraceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.AbstractC7293zu;

/* renamed from: com.yandex.metrica.impl.ob.q7 */
/* loaded from: classes2.dex */
public final class C3539q7 {
    /* renamed from: a */
    public static final C3513p7 m16602a(Throwable th, C3227e7 c3227e7, List<StackTraceElement> list, String str, Boolean bool) {
        ArrayList arrayList = null;
        C3461n7 c3461n7M16533a = th != null ? C3487o7.m16533a(th) : null;
        if (list != null) {
            arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C3409l7((StackTraceElement) it.next()));
            }
        }
        return new C3513p7(c3461n7M16533a, c3227e7, arrayList, null, null, null, str, bool);
    }

    /* renamed from: a */
    public static final C3513p7 m16601a(String str, String str2, List<? extends StackTraceItem> list, String str3, String str4, Map<String, String> map, String str5, Boolean bool) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
            for (StackTraceItem stackTraceItem : list) {
                arrayList.add(new C3409l7(stackTraceItem.getClassName(), stackTraceItem.getFileName(), stackTraceItem.getLine(), stackTraceItem.getColumn(), stackTraceItem.getMethodName(), null));
            }
        } else {
            arrayList = null;
        }
        return new C3513p7(new C3461n7(str, str2, arrayList, null, null), null, null, str3, str4, map, str5, bool);
    }
}
