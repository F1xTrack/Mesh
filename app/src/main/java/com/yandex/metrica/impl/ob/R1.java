package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public class R1 extends C3166vn implements F2 {
    private final Executor b;
    private volatile b g;
    private Rd h;
    private final I9 i;
    private final BlockingQueue<b> d = new LinkedBlockingQueue();
    private final Object e = new Object();
    private final Object f = new Object();
    private Executor c = new ExecutorC2987on();

    public static class b {
        final T1 a;
        private final String b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            return this.b.equals(((b) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        private b(T1 t1) {
            this.a = t1;
            this.b = t1.a();
        }
    }

    public R1(Context context, Executor executor, I9 i9) {
        this.b = executor;
        this.i = i9;
        this.h = new Rd(context);
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public void a() {
    }

    public void b(T1 t1) {
        synchronized (this.e) {
            try {
                b bVar = new b(t1);
                if (c() && !this.d.contains(bVar) && !bVar.equals(this.g) && bVar.a.u()) {
                    this.d.offer(bVar);
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        T1 t1 = null;
        while (c()) {
            try {
                synchronized (this.f) {
                }
                this.g = this.d.take();
                t1 = this.g.a;
                (t1.z() ? this.b : this.c).execute(a(t1));
                synchronized (this.f) {
                    this.g = null;
                    t1.w();
                    t1.x();
                }
            } catch (InterruptedException unused) {
                synchronized (this.f) {
                    try {
                        this.g = null;
                        if (t1 != null) {
                            t1.w();
                            t1.x();
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f) {
                    try {
                        this.g = null;
                        if (t1 != null) {
                            t1.w();
                            t1.x();
                        }
                        throw th;
                    } finally {
                    }
                }
            }
        }
    }

    public W1 a(T1 t1) {
        return new W1(this.h, new Sd(new Td(this.i, t1.b()), t1.j()), t1, this, new V1(), "NetworkTaskQueue");
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public void b() {
        synchronized (this.f) {
            try {
                b bVar = this.g;
                if (bVar != null) {
                    bVar.a.x();
                }
                ArrayList arrayList = new ArrayList(this.d.size());
                this.d.drainTo(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a.x();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
