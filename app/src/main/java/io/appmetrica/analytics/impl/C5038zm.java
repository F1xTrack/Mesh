package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.appmetrica.analytics.impl.zm */
/* loaded from: classes2.dex */
public final class C5038zm {
    public final InterfaceC5014ym a;
    public final BiFunction b;
    public final Ub c;

    public C5038zm() {
        this(new C4966wm(), new C4620ia(), C4805q4.h().k());
    }

    public final ArrayList a(Thread thread, Thread thread2) {
        Map<Thread, StackTraceElement[]> allStackTraces;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new C4990xm());
        try {
            ((C4966wm) this.a).getClass();
            allStackTraces = Thread.getAllStackTraces();
        } catch (SecurityException unused) {
            allStackTraces = null;
        }
        if (allStackTraces != null) {
            treeMap.putAll(allStackTraces);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add((C4870sm) this.b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public C5038zm(C4966wm c4966wm, C4620ia c4620ia, Ub ub) {
        this.a = c4966wm;
        this.b = c4620ia;
        this.c = ub;
    }
}
