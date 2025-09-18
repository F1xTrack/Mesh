package com.yandex.metrica.impl.p022ob;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.yandex.metrica.impl.ob.E3 */
/* loaded from: classes2.dex */
public class C2570E3 {

    /* renamed from: a */
    private final c f21073a;

    /* renamed from: b */
    private final InterfaceC2963Tm<Thread, StackTraceElement[], C3435m7> f21074b;

    /* renamed from: c */
    private final InterfaceC2664Hm f21075c;

    /* renamed from: com.yandex.metrica.impl.ob.E3$a */
    public class a implements c {
    }

    /* renamed from: com.yandex.metrica.impl.ob.E3$b */
    public class b implements Comparator<Thread> {
        public b(C2570E3 c2570e3) {
        }

        @Override // java.util.Comparator
        public int compare(Thread thread, Thread thread2) {
            Thread thread3 = thread;
            Thread thread4 = thread2;
            if (thread3 != thread4) {
                String name = thread3.getName();
                String name2 = thread4.getName();
                int i = C2819O2.f21836a;
                if (name != null) {
                    if (name2 == null) {
                        return 1;
                    }
                    return name.compareTo(name2);
                }
                if (name2 != null) {
                    return -1;
                }
            }
            return 0;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.E3$c */
    public interface c {
    }

    public C2570E3() {
        this(new a(), new C2545D3(), C3065Y.m15442g().m15451j());
    }

    /* renamed from: a */
    public C3227e7 m14029a() {
        StackTraceElement[] stackTrace;
        ((a) this.f21073a).getClass();
        Thread thread = Looper.getMainLooper().getThread();
        try {
            stackTrace = thread.getStackTrace();
        } catch (SecurityException unused) {
            stackTrace = null;
        }
        return new C3227e7(this.f21074b.mo13979a(thread, stackTrace), m14028a(thread, null), ((C2564Dm) this.f21075c).m14015b());
    }

    public C2570E3(c cVar, InterfaceC2963Tm<Thread, StackTraceElement[], C3435m7> interfaceC2963Tm, InterfaceC2664Hm interfaceC2664Hm) {
        this.f21073a = cVar;
        this.f21074b = interfaceC2963Tm;
        this.f21075c = interfaceC2664Hm;
    }

    /* renamed from: a */
    public List<C3435m7> m14030a(Thread thread) {
        StackTraceElement[] stackTrace;
        ((a) this.f21073a).getClass();
        Thread thread2 = Looper.getMainLooper().getThread();
        List<C3435m7> listM14028a = m14028a(thread2, thread);
        if (thread != thread2) {
            try {
                stackTrace = thread2.getStackTrace();
            } catch (SecurityException unused) {
                stackTrace = null;
            }
            ((ArrayList) listM14028a).add(0, this.f21074b.mo13979a(thread2, stackTrace));
        }
        return listM14028a;
    }

    /* renamed from: a */
    private List<C3435m7> m14028a(Thread thread, Thread thread2) {
        Map<Thread, StackTraceElement[]> allStackTraces;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new b(this));
        try {
            ((a) this.f21073a).getClass();
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
                arrayList.add(this.f21074b.mo13979a(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }
}
