package io.sentry;

import com.yandex.metrica.C3796o;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6082E;
import io.sentry.protocol.C6085a;
import io.sentry.protocol.C6087c;
import io.sentry.protocol.C6098n;
import io.sentry.protocol.C6104t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.sentry.L0 */
/* loaded from: classes2.dex */
public final class C5782L0 {

    /* renamed from: a */
    public InterfaceC5807U f33305a;

    /* renamed from: b */
    public C6082E f33306b;

    /* renamed from: c */
    public String f33307c;

    /* renamed from: d */
    public C6098n f33308d;

    /* renamed from: e */
    public final ArrayList f33309e;

    /* renamed from: f */
    public final C5815W1 f33310f;

    /* renamed from: g */
    public final ConcurrentHashMap f33311g;

    /* renamed from: h */
    public final ConcurrentHashMap f33312h;

    /* renamed from: i */
    public final CopyOnWriteArrayList f33313i;

    /* renamed from: j */
    public final C5759D1 f33314j;

    /* renamed from: k */
    public volatile C5792O1 f33315k;

    /* renamed from: l */
    public final Object f33316l;

    /* renamed from: m */
    public final Object f33317m;

    /* renamed from: n */
    public final Object f33318n;

    /* renamed from: o */
    public final C6087c f33319o;

    /* renamed from: p */
    public final CopyOnWriteArrayList f33320p;

    /* renamed from: q */
    public C3796o f33321q;

    /* renamed from: r */
    public C6104t f33322r;

    public C5782L0(C5759D1 c5759d1) {
        this.f33309e = new ArrayList();
        this.f33311g = new ConcurrentHashMap();
        this.f33312h = new ConcurrentHashMap();
        this.f33313i = new CopyOnWriteArrayList();
        this.f33316l = new Object();
        this.f33317m = new Object();
        this.f33318n = new Object();
        this.f33319o = new C6087c();
        this.f33320p = new CopyOnWriteArrayList();
        this.f33322r = C6104t.f34442b;
        this.f33314j = c5759d1;
        int maxBreadcrumbs = c5759d1.getMaxBreadcrumbs();
        this.f33310f = maxBreadcrumbs > 0 ? new C5815W1(new C6023h(maxBreadcrumbs)) : new C5815W1(new C6111q());
        this.f33321q = new C3796o();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m21410a(io.sentry.C6017f r5, io.sentry.C6193y r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L7
            io.sentry.y r6 = new io.sentry.y
            r6.<init>()
        L7:
            io.sentry.D1 r6 = r4.f33314j
            io.sentry.s1 r0 = r6.getBeforeBreadcrumb()
            if (r0 == 0) goto L5d
            io.sentry.react.b r0 = (io.sentry.react.C6118b) r0     // Catch: java.lang.Throwable -> L42
            java.util.concurrent.ConcurrentHashMap r1 = r5.f34147e     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "url"
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L42
            goto L22
        L20:
            java.lang.String r1 = ""
        L22:
            java.lang.String r2 = r5.f34146d     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "http"
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L5d
            java.lang.String r2 = r0.f34515b     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L36
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L40
        L36:
            java.lang.String r0 = r0.f34516c     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L5d
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L5d
        L40:
            r5 = 0
            goto L5d
        L42:
            r0 = move-exception
            io.sentry.ILogger r1 = r6.getLogger()
            io.sentry.n1 r2 = io.sentry.EnumC6069n1.ERROR
            java.lang.String r3 = "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb."
            r1.mo21406d(r2, r3, r0)
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L5d
            java.lang.String r1 = "sentry:message"
            java.lang.String r0 = r0.getMessage()
            r5.m21778b(r0, r1)
        L5d:
            if (r5 == 0) goto L7f
            io.sentry.W1 r0 = r4.f33310f
            r0.add(r5)
            java.util.List r6 = r6.getScopeObservers()
            java.util.Iterator r6 = r6.iterator()
        L6c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L8d
            java.lang.Object r1 = r6.next()
            io.sentry.P r1 = (io.sentry.InterfaceC5793P) r1
            r1.mo21447i(r5)
            r1.mo21449k(r0)
            goto L6c
        L7f:
            io.sentry.ILogger r5 = r6.getLogger()
            io.sentry.n1 r6 = io.sentry.EnumC6069n1.INFO
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Breadcrumb was dropped by beforeBreadcrumb"
            r5.mo21407k(r6, r1, r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C5782L0.m21410a(io.sentry.f, io.sentry.y):void");
    }

    /* renamed from: b */
    public final void m21411b() {
        C5815W1 c5815w1 = this.f33310f;
        c5815w1.clear();
        Iterator<InterfaceC5793P> it = this.f33314j.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo21449k(c5815w1);
        }
    }

    /* renamed from: c */
    public final void m21412c() {
        synchronized (this.f33317m) {
            this.f33305a = null;
        }
        for (InterfaceC5793P interfaceC5793P : this.f33314j.getScopeObservers()) {
            interfaceC5793P.mo21446h(null);
            interfaceC5793P.mo21443d(null, this);
        }
    }

    public final Object clone() {
        return new C5782L0(this);
    }

    /* renamed from: d */
    public final void m21413d(C6104t c6104t) {
        this.f33322r = c6104t;
        Iterator<InterfaceC5793P> it = this.f33314j.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo21441b(c6104t);
        }
    }

    /* renamed from: e */
    public final void m21414e(String str) {
        this.f33307c = str;
        C6087c c6087c = this.f33319o;
        C6085a c6085a = (C6085a) c6087c.m21852d(C6085a.class, "app");
        if (c6085a == null) {
            c6085a = new C6085a();
            c6087c.m21850b(c6085a);
        }
        if (str == null) {
            c6085a.f34320i = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            c6085a.f34320i = arrayList;
        }
        Iterator<InterfaceC5793P> it = this.f33314j.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo21444f(c6087c);
        }
    }

    /* renamed from: f */
    public final void m21415f(InterfaceC5807U interfaceC5807U) {
        synchronized (this.f33317m) {
            try {
                this.f33305a = interfaceC5807U;
                for (InterfaceC5793P interfaceC5793P : this.f33314j.getScopeObservers()) {
                    if (interfaceC5807U != null) {
                        interfaceC5793P.mo21446h(interfaceC5807U.getName());
                        interfaceC5793P.mo21443d(interfaceC5807U.mo21432n(), this);
                    } else {
                        interfaceC5793P.mo21446h(null);
                        interfaceC5793P.mo21443d(null, this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final void m21416g(C6082E c6082e) {
        this.f33306b = c6082e;
        Iterator<InterfaceC5793P> it = this.f33314j.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo21456e(c6082e);
        }
    }

    /* renamed from: h */
    public final C3796o m21417h(InterfaceC5779K0 interfaceC5779K0) {
        C3796o c3796o;
        synchronized (this.f33318n) {
            interfaceC5779K0.mo3167a(this.f33321q);
            c3796o = new C3796o(this.f33321q);
        }
        return c3796o;
    }

    /* renamed from: i */
    public final C5792O1 m21418i(C5814W0 c5814w0) {
        C5792O1 c5792o1Clone;
        synchronized (this.f33316l) {
            try {
                c5814w0.m21475b(this.f33315k);
                c5792o1Clone = this.f33315k != null ? this.f33315k.clone() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5792o1Clone;
    }

    public C5782L0(C5782L0 c5782l0) {
        C6082E c6082e;
        C5815W1 c5815w1;
        this.f33309e = new ArrayList();
        this.f33311g = new ConcurrentHashMap();
        this.f33312h = new ConcurrentHashMap();
        this.f33313i = new CopyOnWriteArrayList();
        this.f33316l = new Object();
        this.f33317m = new Object();
        this.f33318n = new Object();
        this.f33319o = new C6087c();
        this.f33320p = new CopyOnWriteArrayList();
        this.f33322r = C6104t.f34442b;
        this.f33305a = c5782l0.f33305a;
        this.f33315k = c5782l0.f33315k;
        this.f33314j = c5782l0.f33314j;
        C6082E c6082e2 = c5782l0.f33306b;
        C6098n c6098n = null;
        if (c6082e2 != null) {
            c6082e = new C6082E();
            c6082e.f34288a = c6082e2.f34288a;
            c6082e.f34290c = c6082e2.f34290c;
            c6082e.f34289b = c6082e2.f34289b;
            c6082e.f34292e = c6082e2.f34292e;
            c6082e.f34291d = c6082e2.f34291d;
            c6082e.f34293f = c6082e2.f34293f;
            c6082e.f34294g = c6082e2.f34294g;
            c6082e.f34295h = AbstractC6003a.m21732A(c6082e2.f34295h);
            c6082e.f34296i = AbstractC6003a.m21732A(c6082e2.f34296i);
        } else {
            c6082e = null;
        }
        this.f33306b = c6082e;
        this.f33307c = c5782l0.f33307c;
        this.f33322r = c5782l0.f33322r;
        C6098n c6098n2 = c5782l0.f33308d;
        if (c6098n2 != null) {
            c6098n = new C6098n();
            c6098n.f34407a = c6098n2.f34407a;
            c6098n.f34411e = c6098n2.f34411e;
            c6098n.f34408b = c6098n2.f34408b;
            c6098n.f34409c = c6098n2.f34409c;
            c6098n.f34412f = AbstractC6003a.m21732A(c6098n2.f34412f);
            c6098n.f34413g = AbstractC6003a.m21732A(c6098n2.f34413g);
            c6098n.f34415i = AbstractC6003a.m21732A(c6098n2.f34415i);
            c6098n.f34418l = AbstractC6003a.m21732A(c6098n2.f34418l);
            c6098n.f34410d = c6098n2.f34410d;
            c6098n.f34416j = c6098n2.f34416j;
            c6098n.f34414h = c6098n2.f34414h;
            c6098n.f34417k = c6098n2.f34417k;
        }
        this.f33308d = c6098n;
        this.f33309e = new ArrayList(c5782l0.f33309e);
        this.f33313i = new CopyOnWriteArrayList(c5782l0.f33313i);
        C6017f[] c6017fArr = (C6017f[]) c5782l0.f33310f.toArray(new C6017f[0]);
        int maxBreadcrumbs = c5782l0.f33314j.getMaxBreadcrumbs();
        if (maxBreadcrumbs > 0) {
            c5815w1 = new C5815W1(new C6023h(maxBreadcrumbs));
        } else {
            c5815w1 = new C5815W1(new C6111q());
        }
        for (C6017f c6017f : c6017fArr) {
            c5815w1.add(new C6017f(c6017f));
        }
        this.f33310f = c5815w1;
        ConcurrentHashMap concurrentHashMap = c5782l0.f33311g;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f33311g = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = c5782l0.f33312h;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap4.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.f33312h = concurrentHashMap4;
        this.f33319o = new C6087c(c5782l0.f33319o);
        this.f33320p = new CopyOnWriteArrayList(c5782l0.f33320p);
        this.f33321q = new C3796o(c5782l0.f33321q);
    }
}
