package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.appmetrica.analytics.impl.zm */
/* loaded from: classes2.dex */
public final class C5631zm {

    /* renamed from: a */
    public final InterfaceC5606ym f32938a;

    /* renamed from: b */
    public final BiFunction f32939b;

    /* renamed from: c */
    public final C4851Ub f32940c;

    public C5631zm() {
        this(new C5556wm(), new C5194ia(), C5388q4.m20928h().m20940k());
    }

    /* renamed from: a */
    public final ArrayList m21249a(Thread thread, Thread thread2) {
        Map<Thread, StackTraceElement[]> allStackTraces;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new C5581xm());
        try {
            ((C5556wm) this.f32938a).getClass();
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
                arrayList.add((C5456sm) this.f32939b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public C5631zm(C5556wm c5556wm, C5194ia c5194ia, C4851Ub c4851Ub) {
        this.f32938a = c5556wm;
        this.f32939b = c5194ia;
        this.f32940c = c4851Ub;
    }
}
