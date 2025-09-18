package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C3167w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class M0 {
    private final List<d> a = new ArrayList();
    private Qi b;

    public static class b {
        private boolean a = false;
        private long b;
        private long c;
        private long d;
        private final c e;

        public b(Qi qi, c cVar, String str) {
            this.e = cVar;
            this.c = qi == null ? 0L : qi.p();
            this.b = qi != null ? qi.B() : 0L;
            this.d = Long.MAX_VALUE;
        }

        public void a(long j, TimeUnit timeUnit) {
            this.d = timeUnit.toMillis(j);
        }

        public boolean b() {
            if (this.a) {
                return true;
            }
            c cVar = this.e;
            long j = this.c;
            long j2 = this.b;
            long j3 = this.d;
            cVar.getClass();
            return j2 - j >= j3;
        }

        public void a() {
            this.a = true;
        }

        public void a(Qi qi) {
            this.b = qi.B();
            this.c = qi.p();
        }
    }

    public static class c {
    }

    public static class d {
        private b a;
        private final C3167w.b b;
        private final InterfaceExecutorC3086sn c;

        public void a(Qi qi) {
            this.a.a(qi);
        }

        private d(InterfaceExecutorC3086sn interfaceExecutorC3086sn, C3167w.b bVar, b bVar2) {
            this.b = bVar;
            this.a = bVar2;
            this.c = interfaceExecutorC3086sn;
        }

        public void a(long j) {
            this.a.a(j, TimeUnit.SECONDS);
        }

        public boolean a(int i) {
            if (!this.a.b()) {
                return false;
            }
            this.b.a(TimeUnit.SECONDS.toMillis(i), this.c);
            this.a.a();
            return true;
        }
    }

    public synchronized d a(Runnable runnable, InterfaceExecutorC3086sn interfaceExecutorC3086sn, String str) {
        d dVar;
        C3167w.b bVar = new C3167w.b(runnable, P0.i().a());
        b bVar2 = new b(this.b, new c(), str);
        synchronized (this) {
            dVar = new d(interfaceExecutorC3086sn, bVar, bVar2);
            this.a.add(dVar);
        }
        return dVar;
        return dVar;
    }

    public void a(Qi qi) {
        ArrayList arrayList;
        synchronized (this) {
            this.b = qi;
            arrayList = new ArrayList(this.a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(qi);
        }
    }
}
