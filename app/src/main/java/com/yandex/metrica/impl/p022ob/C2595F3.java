package com.yandex.metrica.impl.p022ob;

import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.yandex.metrica.impl.ob.F3 */
/* loaded from: classes2.dex */
public class C2595F3 {

    /* renamed from: a */
    private final C3685vn f21161a;

    /* renamed from: b */
    private final BlockingQueue<b> f21162b = new LinkedBlockingQueue();

    /* renamed from: c */
    private ConcurrentHashMap<Class, CopyOnWriteArrayList<C2695J3<? extends C2645H3>>> f21163c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private WeakHashMap<Object, CopyOnWriteArrayList<d>> f21164d = new WeakHashMap<>();

    /* renamed from: e */
    private ConcurrentHashMap<Class, C2645H3> f21165e = new ConcurrentHashMap<>();

    /* renamed from: com.yandex.metrica.impl.ob.F3$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                C2595F3.this.getClass();
                try {
                    ((b) C2595F3.this.f21162b.take()).m14060a();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.F3$b */
    public static class b {

        /* renamed from: a */
        private final C2645H3 f21167a;

        /* renamed from: b */
        private final C2695J3<? extends C2645H3> f21168b;

        public /* synthetic */ b(C2645H3 c2645h3, C2695J3 c2695j3, a aVar) {
            this(c2645h3, c2695j3);
        }

        /* renamed from: a */
        public void m14060a() {
            try {
                if (this.f21168b.m14410a(this.f21167a)) {
                    return;
                }
                this.f21168b.m14411b(this.f21167a);
            } catch (Throwable unused) {
            }
        }

        private b(C2645H3 c2645h3, C2695J3<? extends C2645H3> c2695j3) {
            this.f21167a = c2645h3;
            this.f21168b = c2695j3;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.F3$c */
    public static final class c {

        /* renamed from: a */
        private static final C2595F3 f21169a = new C2595F3();
    }

    /* renamed from: com.yandex.metrica.impl.ob.F3$d */
    public static class d {

        /* renamed from: a */
        final CopyOnWriteArrayList<C2695J3<? extends C2645H3>> f21170a;

        /* renamed from: b */
        final C2695J3<? extends C2645H3> f21171b;

        public /* synthetic */ d(CopyOnWriteArrayList copyOnWriteArrayList, C2695J3 c2695j3, a aVar) {
            this(copyOnWriteArrayList, c2695j3);
        }

        public void finalize() throws Throwable {
            super.finalize();
            this.f21170a.remove(this.f21171b);
        }

        private d(CopyOnWriteArrayList<C2695J3<? extends C2645H3>> copyOnWriteArrayList, C2695J3<? extends C2645H3> c2695j3) {
            this.f21170a = copyOnWriteArrayList;
            this.f21171b = c2695j3;
        }
    }

    public C2595F3() {
        C3685vn c3685vnM17150a = ThreadFactoryC3711wn.m17150a("YMM-BD", new a());
        this.f21161a = c3685vnM17150a;
        c3685vnM17150a.start();
    }

    /* renamed from: a */
    public static final C2595F3 m14055a() {
        return c.f21169a;
    }

    /* renamed from: a */
    public synchronized void m14057a(C2645H3 c2645h3) {
        synchronized (this) {
            CopyOnWriteArrayList<C2695J3<? extends C2645H3>> copyOnWriteArrayList = this.f21163c.get(c2645h3.getClass());
            if (copyOnWriteArrayList != null) {
                Iterator<C2695J3<? extends C2645H3>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    this.f21162b.add(new b(c2645h3, it.next(), null));
                }
            }
        }
        this.f21165e.put(c2645h3.getClass(), c2645h3);
    }

    /* renamed from: a */
    public synchronized void m14059a(Object obj, Class cls, C2695J3<? extends C2645H3> c2695j3) {
        try {
            CopyOnWriteArrayList<C2695J3<? extends C2645H3>> copyOnWriteArrayList = this.f21163c.get(cls);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.f21163c.put(cls, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(c2695j3);
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f21164d.get(obj);
            if (copyOnWriteArrayList2 == null) {
                copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                this.f21164d.put(obj, copyOnWriteArrayList2);
            }
            a aVar = null;
            copyOnWriteArrayList2.add(new d(copyOnWriteArrayList, c2695j3, aVar));
            C2645H3 c2645h3 = this.f21165e.get(cls);
            if (c2645h3 != null) {
                this.f21162b.add(new b(c2645h3, c2695j3, aVar));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized void m14058a(Object obj) {
        CopyOnWriteArrayList<d> copyOnWriteArrayListRemove = this.f21164d.remove(obj);
        if (copyOnWriteArrayListRemove != null) {
            for (d dVar : copyOnWriteArrayListRemove) {
                dVar.f21170a.remove(dVar.f21171b);
            }
        }
    }
}
