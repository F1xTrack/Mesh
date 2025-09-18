package io.sentry;

import io.sentry.protocol.C5155a;
import io.sentry.protocol.C5157c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class L0 {
    public U a;
    public io.sentry.protocol.E b;
    public String c;
    public io.sentry.protocol.n d;
    public final ArrayList e;
    public final W1 f;
    public final ConcurrentHashMap g;
    public final ConcurrentHashMap h;
    public final CopyOnWriteArrayList i;
    public final D1 j;
    public volatile O1 k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final C5157c o;
    public final CopyOnWriteArrayList p;
    public com.yandex.metrica.o q;
    public io.sentry.protocol.t r;

    public L0(D1 d1) {
        this.e = new ArrayList();
        this.g = new ConcurrentHashMap();
        this.h = new ConcurrentHashMap();
        this.i = new CopyOnWriteArrayList();
        this.l = new Object();
        this.m = new Object();
        this.n = new Object();
        this.o = new C5157c();
        this.p = new CopyOnWriteArrayList();
        this.r = io.sentry.protocol.t.b;
        this.j = d1;
        int maxBreadcrumbs = d1.getMaxBreadcrumbs();
        this.f = maxBreadcrumbs > 0 ? new W1(new C5128h(maxBreadcrumbs)) : new W1(new C5162q());
        this.q = new com.yandex.metrica.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(io.sentry.C5122f r5, io.sentry.C5185y r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L7
            io.sentry.y r6 = new io.sentry.y
            r6.<init>()
        L7:
            io.sentry.D1 r6 = r4.j
            io.sentry.s1 r0 = r6.getBeforeBreadcrumb()
            if (r0 == 0) goto L5d
            io.sentry.react.b r0 = (io.sentry.react.b) r0     // Catch: java.lang.Throwable -> L42
            java.util.concurrent.ConcurrentHashMap r1 = r5.e     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "url"
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L42
            goto L22
        L20:
            java.lang.String r1 = ""
        L22:
            java.lang.String r2 = r5.d     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "http"
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L5d
            java.lang.String r2 = r0.b     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L36
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L40
        L36:
            java.lang.String r0 = r0.c     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L5d
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L5d
        L40:
            r5 = 0
            goto L5d
        L42:
            r0 = move-exception
            io.sentry.ILogger r1 = r6.getLogger()
            io.sentry.n1 r2 = io.sentry.EnumC5148n1.ERROR
            java.lang.String r3 = "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb."
            r1.d(r2, r3, r0)
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L5d
            java.lang.String r1 = "sentry:message"
            java.lang.String r0 = r0.getMessage()
            r5.b(r0, r1)
        L5d:
            if (r5 == 0) goto L7f
            io.sentry.W1 r0 = r4.f
            r0.add(r5)
            java.util.List r6 = r6.getScopeObservers()
            java.util.Iterator r6 = r6.iterator()
        L6c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L8d
            java.lang.Object r1 = r6.next()
            io.sentry.P r1 = (io.sentry.P) r1
            r1.i(r5)
            r1.k(r0)
            goto L6c
        L7f:
            io.sentry.ILogger r5 = r6.getLogger()
            io.sentry.n1 r6 = io.sentry.EnumC5148n1.INFO
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Breadcrumb was dropped by beforeBreadcrumb"
            r5.k(r6, r1, r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.L0.a(io.sentry.f, io.sentry.y):void");
    }

    public final void b() {
        W1 w1 = this.f;
        w1.clear();
        Iterator<P> it = this.j.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().k(w1);
        }
    }

    public final void c() {
        synchronized (this.m) {
            this.a = null;
        }
        for (P p : this.j.getScopeObservers()) {
            p.h(null);
            p.d(null, this);
        }
    }

    public final Object clone() {
        return new L0(this);
    }

    public final void d(io.sentry.protocol.t tVar) {
        this.r = tVar;
        Iterator<P> it = this.j.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().b(tVar);
        }
    }

    public final void e(String str) {
        this.c = str;
        C5157c c5157c = this.o;
        C5155a c5155a = (C5155a) c5157c.d(C5155a.class, "app");
        if (c5155a == null) {
            c5155a = new C5155a();
            c5157c.b(c5155a);
        }
        if (str == null) {
            c5155a.i = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            c5155a.i = arrayList;
        }
        Iterator<P> it = this.j.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().f(c5157c);
        }
    }

    public final void f(U u) {
        synchronized (this.m) {
            try {
                this.a = u;
                for (P p : this.j.getScopeObservers()) {
                    if (u != null) {
                        p.h(u.getName());
                        p.d(u.n(), this);
                    } else {
                        p.h(null);
                        p.d(null, this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(io.sentry.protocol.E e) {
        this.b = e;
        Iterator<P> it = this.j.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().e(e);
        }
    }

    public final com.yandex.metrica.o h(K0 k0) {
        com.yandex.metrica.o oVar;
        synchronized (this.n) {
            k0.a(this.q);
            oVar = new com.yandex.metrica.o(this.q);
        }
        return oVar;
    }

    public final O1 i(W0 w0) {
        O1 o1Clone;
        synchronized (this.l) {
            try {
                w0.b(this.k);
                o1Clone = this.k != null ? this.k.clone() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o1Clone;
    }

    public L0(L0 l0) {
        io.sentry.protocol.E e;
        W1 w1;
        this.e = new ArrayList();
        this.g = new ConcurrentHashMap();
        this.h = new ConcurrentHashMap();
        this.i = new CopyOnWriteArrayList();
        this.l = new Object();
        this.m = new Object();
        this.n = new Object();
        this.o = new C5157c();
        this.p = new CopyOnWriteArrayList();
        this.r = io.sentry.protocol.t.b;
        this.a = l0.a;
        this.k = l0.k;
        this.j = l0.j;
        io.sentry.protocol.E e2 = l0.b;
        io.sentry.protocol.n nVar = null;
        if (e2 != null) {
            e = new io.sentry.protocol.E();
            e.a = e2.a;
            e.c = e2.c;
            e.b = e2.b;
            e.e = e2.e;
            e.d = e2.d;
            e.f = e2.f;
            e.g = e2.g;
            e.h = io.sentry.config.a.A(e2.h);
            e.i = io.sentry.config.a.A(e2.i);
        } else {
            e = null;
        }
        this.b = e;
        this.c = l0.c;
        this.r = l0.r;
        io.sentry.protocol.n nVar2 = l0.d;
        if (nVar2 != null) {
            nVar = new io.sentry.protocol.n();
            nVar.a = nVar2.a;
            nVar.e = nVar2.e;
            nVar.b = nVar2.b;
            nVar.c = nVar2.c;
            nVar.f = io.sentry.config.a.A(nVar2.f);
            nVar.g = io.sentry.config.a.A(nVar2.g);
            nVar.i = io.sentry.config.a.A(nVar2.i);
            nVar.l = io.sentry.config.a.A(nVar2.l);
            nVar.d = nVar2.d;
            nVar.j = nVar2.j;
            nVar.h = nVar2.h;
            nVar.k = nVar2.k;
        }
        this.d = nVar;
        this.e = new ArrayList(l0.e);
        this.i = new CopyOnWriteArrayList(l0.i);
        C5122f[] c5122fArr = (C5122f[]) l0.f.toArray(new C5122f[0]);
        int maxBreadcrumbs = l0.j.getMaxBreadcrumbs();
        if (maxBreadcrumbs > 0) {
            w1 = new W1(new C5128h(maxBreadcrumbs));
        } else {
            w1 = new W1(new C5162q());
        }
        for (C5122f c5122f : c5122fArr) {
            w1.add(new C5122f(c5122f));
        }
        this.f = w1;
        ConcurrentHashMap concurrentHashMap = l0.g;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.g = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = l0.h;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap4.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.h = concurrentHashMap4;
        this.o = new C5157c(l0.o);
        this.p = new CopyOnWriteArrayList(l0.p);
        this.q = new com.yandex.metrica.o(l0.q);
    }
}
