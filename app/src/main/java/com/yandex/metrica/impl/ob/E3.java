package com.yandex.metrica.impl.ob;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class E3 {
    private final c a;
    private final Tm<Thread, StackTraceElement[], C2921m7> b;
    private final Hm c;

    public class a implements c {
    }

    public class b implements Comparator<Thread> {
        public b(E3 e3) {
        }

        @Override // java.util.Comparator
        public int compare(Thread thread, Thread thread2) {
            Thread thread3 = thread;
            Thread thread4 = thread2;
            if (thread3 != thread4) {
                String name = thread3.getName();
                String name2 = thread4.getName();
                int i = O2.a;
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

    public interface c {
    }

    public E3() {
        this(new a(), new D3(), Y.g().j());
    }

    public C2722e7 a() {
        StackTraceElement[] stackTrace;
        ((a) this.a).getClass();
        Thread thread = Looper.getMainLooper().getThread();
        try {
            stackTrace = thread.getStackTrace();
        } catch (SecurityException unused) {
            stackTrace = null;
        }
        return new C2722e7(this.b.a(thread, stackTrace), a(thread, null), ((Dm) this.c).b());
    }

    public E3(c cVar, Tm<Thread, StackTraceElement[], C2921m7> tm, Hm hm) {
        this.a = cVar;
        this.b = tm;
        this.c = hm;
    }

    public List<C2921m7> a(Thread thread) {
        StackTraceElement[] stackTrace;
        ((a) this.a).getClass();
        Thread thread2 = Looper.getMainLooper().getThread();
        List<C2921m7> listA = a(thread2, thread);
        if (thread != thread2) {
            try {
                stackTrace = thread2.getStackTrace();
            } catch (SecurityException unused) {
                stackTrace = null;
            }
            ((ArrayList) listA).add(0, this.b.a(thread2, stackTrace));
        }
        return listA;
    }

    private List<C2921m7> a(Thread thread, Thread thread2) {
        Map<Thread, StackTraceElement[]> allStackTraces;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new b(this));
        try {
            ((a) this.a).getClass();
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
                arrayList.add(this.b.a(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }
}
