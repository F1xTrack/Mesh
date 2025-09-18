package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public class F3 {
    private final C3166vn a;
    private final BlockingQueue<b> b = new LinkedBlockingQueue();
    private ConcurrentHashMap<Class, CopyOnWriteArrayList<J3<? extends H3>>> c = new ConcurrentHashMap<>();
    private WeakHashMap<Object, CopyOnWriteArrayList<d>> d = new WeakHashMap<>();
    private ConcurrentHashMap<Class, H3> e = new ConcurrentHashMap<>();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                F3.this.getClass();
                try {
                    ((b) F3.this.b.take()).a();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public static class b {
        private final H3 a;
        private final J3<? extends H3> b;

        public /* synthetic */ b(H3 h3, J3 j3, a aVar) {
            this(h3, j3);
        }

        public void a() {
            try {
                if (this.b.a(this.a)) {
                    return;
                }
                this.b.b(this.a);
            } catch (Throwable unused) {
            }
        }

        private b(H3 h3, J3<? extends H3> j3) {
            this.a = h3;
            this.b = j3;
        }
    }

    public static final class c {
        private static final F3 a = new F3();
    }

    public static class d {
        final CopyOnWriteArrayList<J3<? extends H3>> a;
        final J3<? extends H3> b;

        public /* synthetic */ d(CopyOnWriteArrayList copyOnWriteArrayList, J3 j3, a aVar) {
            this(copyOnWriteArrayList, j3);
        }

        public void finalize() throws Throwable {
            super.finalize();
            this.a.remove(this.b);
        }

        private d(CopyOnWriteArrayList<J3<? extends H3>> copyOnWriteArrayList, J3<? extends H3> j3) {
            this.a = copyOnWriteArrayList;
            this.b = j3;
        }
    }

    public F3() {
        C3166vn c3166vnA = ThreadFactoryC3191wn.a("YMM-BD", new a());
        this.a = c3166vnA;
        c3166vnA.start();
    }

    public static final F3 a() {
        return c.a;
    }

    public synchronized void a(H3 h3) {
        synchronized (this) {
            CopyOnWriteArrayList<J3<? extends H3>> copyOnWriteArrayList = this.c.get(h3.getClass());
            if (copyOnWriteArrayList != null) {
                Iterator<J3<? extends H3>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    this.b.add(new b(h3, it.next(), null));
                }
            }
        }
        this.e.put(h3.getClass(), h3);
    }

    public synchronized void a(Object obj, Class cls, J3<? extends H3> j3) {
        try {
            CopyOnWriteArrayList<J3<? extends H3>> copyOnWriteArrayList = this.c.get(cls);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.c.put(cls, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(j3);
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.d.get(obj);
            if (copyOnWriteArrayList2 == null) {
                copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                this.d.put(obj, copyOnWriteArrayList2);
            }
            a aVar = null;
            copyOnWriteArrayList2.add(new d(copyOnWriteArrayList, j3, aVar));
            H3 h3 = this.e.get(cls);
            if (h3 != null) {
                this.b.add(new b(h3, j3, aVar));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(Object obj) {
        CopyOnWriteArrayList<d> copyOnWriteArrayListRemove = this.d.remove(obj);
        if (copyOnWriteArrayListRemove != null) {
            for (d dVar : copyOnWriteArrayListRemove) {
                dVar.a.remove(dVar.b);
            }
        }
    }
}
