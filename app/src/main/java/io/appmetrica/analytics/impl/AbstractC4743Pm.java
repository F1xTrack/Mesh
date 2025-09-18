package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC7293zu;

/* renamed from: io.appmetrica.analytics.impl.Pm */
/* loaded from: classes2.dex */
public abstract class AbstractC4743Pm {
    /* renamed from: a */
    public static final C4671Mm m19732a(Throwable th, C4815T c4815t, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        C4429Cm c4429CmM19334a = th != null ? AbstractC4454Dm.m19334a(th, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C4477Ek((StackTraceElement) it.next()));
            }
        }
        return new C4671Mm(c4429CmM19334a, c4815t, arrayList, null, null, null, str, bool);
    }
}
