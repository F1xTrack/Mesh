package io.sentry;

import defpackage.H30;
import io.sentry.protocol.C5157c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class M1 implements U {
    public final P1 b;
    public final D d;
    public final String e;
    public volatile K1 g;
    public volatile K1 h;
    public volatile Timer i;
    public final Object j;
    public final AtomicBoolean k;
    public final AtomicBoolean l;
    public final C5113c m;
    public final io.sentry.protocol.C n;
    public final X o;
    public final C5157c p;
    public final b2 q;
    public final a2 r;
    public final io.sentry.protocol.t a = new io.sentry.protocol.t((UUID) null);
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public L1 f = L1.c;

    public M1(Z1 z1, D d, a2 a2Var, b2 b2Var) {
        this.i = null;
        Object obj = new Object();
        this.j = obj;
        this.k = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.l = atomicBoolean;
        this.p = new C5157c();
        this.b = new P1(z1, this, d, a2Var.b, a2Var);
        this.e = z1.k;
        this.o = z1.o;
        this.d = d;
        this.q = b2Var;
        this.n = z1.l;
        this.r = a2Var;
        C5113c c5113c = z1.n;
        if (c5113c != null) {
            this.m = c5113c;
        } else {
            this.m = new C5113c(d.A().getLogger());
        }
        if (b2Var != null) {
            b2Var.g(this);
        }
        if (a2Var.e == null && a2Var.f == null) {
            return;
        }
        boolean z = true;
        this.i = new Timer(true);
        Long l = a2Var.f;
        if (l != null) {
            synchronized (obj) {
                try {
                    if (this.i != null) {
                        r();
                        atomicBoolean.set(true);
                        this.h = new K1(this, 1);
                        this.i.schedule(this.h, l.longValue());
                    }
                } catch (Throwable th) {
                    this.d.A().getLogger().d(EnumC5148n1.WARNING, "Failed to schedule finish timer", th);
                    U1 status = getStatus();
                    if (status == null) {
                        status = U1.DEADLINE_EXCEEDED;
                    }
                    if (this.r.e == null) {
                        z = false;
                    }
                    c(status, z, null);
                    this.l.set(false);
                } finally {
                }
            }
        }
        l();
    }

    @Override // io.sentry.T
    public final Y1 a() {
        if (!this.d.A().isTraceSampling()) {
            return null;
        }
        synchronized (this) {
            try {
                if (this.m.b) {
                    AtomicReference atomicReference = new AtomicReference();
                    AtomicReference atomicReference2 = new AtomicReference();
                    this.d.w(new H30(atomicReference, 23, atomicReference2));
                    this.m.e(this, (io.sentry.protocol.E) atomicReference.get(), (io.sentry.protocol.t) atomicReference2.get(), this.d.A(), this.b.c.d);
                    this.m.b = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.m.f();
    }

    @Override // io.sentry.T
    public final boolean b() {
        return this.b.f;
    }

    @Override // io.sentry.U
    public final void c(U1 u1, boolean z, C5185y c5185y) {
        if (this.b.f) {
            return;
        }
        AbstractC5083a1 abstractC5083a1Now = this.d.A().getDateProvider().now();
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            P1 p1 = (P1) listIterator.previous();
            p1.i = null;
            p1.p(u1, abstractC5083a1Now);
        }
        t(u1, abstractC5083a1Now, z, c5185y);
    }

    @Override // io.sentry.T
    public final boolean d(AbstractC5083a1 abstractC5083a1) {
        return this.b.d(abstractC5083a1);
    }

    @Override // io.sentry.T
    public final void e(Number number, String str) {
        this.b.e(number, str);
    }

    @Override // io.sentry.T
    public final void f(U1 u1) {
        p(u1, null);
    }

    @Override // io.sentry.T
    public final void finish() {
        p(getStatus(), null);
    }

    @Override // io.sentry.T
    public final T g(String str, String str2, AbstractC5083a1 abstractC5083a1, X x) {
        T1 t1 = new T1();
        P1 p1 = this.b;
        boolean z = p1.f;
        C5183x0 c5183x0 = C5183x0.a;
        if (z || !this.o.equals(x)) {
            return c5183x0;
        }
        int size = this.c.size();
        D d = this.d;
        if (size >= d.A().getMaxSpans()) {
            d.A().getLogger().k(EnumC5148n1.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
            return c5183x0;
        }
        if (p1.f) {
            return c5183x0;
        }
        S1 s1 = p1.c.b;
        M1 m1 = p1.d;
        P1 p12 = m1.b;
        if (p12.f || !m1.o.equals(x)) {
            return c5183x0;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = m1.c;
        int size2 = copyOnWriteArrayList.size();
        D d2 = m1.d;
        if (size2 >= d2.A().getMaxSpans()) {
            d2.A().getLogger().k(EnumC5148n1.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
            return c5183x0;
        }
        io.sentry.config.a.D(s1, "parentSpanId is required");
        m1.s();
        P1 p13 = new P1(p12.c.a, s1, m1, str, m1.d, abstractC5083a1, t1, new J1(m1));
        p13.c.f = str2;
        p13.h(String.valueOf(Thread.currentThread().getId()), "thread.id");
        p13.h(d2.A().getMainThreadChecker().a() ? "main" : Thread.currentThread().getName(), "thread.name");
        copyOnWriteArrayList.add(p13);
        b2 b2Var = m1.q;
        if (b2Var != null) {
            b2Var.f(p13);
        }
        return p13;
    }

    @Override // io.sentry.T
    public final String getDescription() {
        return this.b.c.f;
    }

    @Override // io.sentry.U
    public final String getName() {
        return this.e;
    }

    @Override // io.sentry.T
    public final U1 getStatus() {
        return this.b.c.g;
    }

    @Override // io.sentry.T
    public final void h(Object obj, String str) {
        P1 p1 = this.b;
        if (p1.f) {
            this.d.A().getLogger().k(EnumC5148n1.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            p1.h(obj, str);
        }
    }

    @Override // io.sentry.U
    public final P1 i() {
        ArrayList arrayList = new ArrayList(this.c);
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((P1) arrayList.get(size)).f) {
                return (P1) arrayList.get(size);
            }
        }
        return null;
    }

    @Override // io.sentry.T
    public final void j(String str) {
        P1 p1 = this.b;
        if (p1.f) {
            this.d.A().getLogger().k(EnumC5148n1.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            p1.c.f = str;
        }
    }

    @Override // io.sentry.U
    public final io.sentry.protocol.t k() {
        return this.a;
    }

    @Override // io.sentry.U
    public final void l() {
        Long l;
        synchronized (this.j) {
            try {
                if (this.i != null && (l = this.r.e) != null) {
                    s();
                    this.k.set(true);
                    this.g = new K1(this, 0);
                    try {
                        this.i.schedule(this.g, l.longValue());
                    } catch (Throwable th) {
                        this.d.A().getLogger().d(EnumC5148n1.WARNING, "Failed to schedule finish timer", th);
                        U1 status = getStatus();
                        if (status == null) {
                            status = U1.OK;
                        }
                        p(status, null);
                        this.k.set(false);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.sentry.T
    public final void m(String str, Long l, EnumC5150o0 enumC5150o0) {
        this.b.m(str, l, enumC5150o0);
    }

    @Override // io.sentry.T
    public final Q1 n() {
        return this.b.c;
    }

    @Override // io.sentry.T
    public final AbstractC5083a1 o() {
        return this.b.b;
    }

    @Override // io.sentry.T
    public final void p(U1 u1, AbstractC5083a1 abstractC5083a1) {
        t(u1, abstractC5083a1, true, null);
    }

    @Override // io.sentry.T
    public final AbstractC5083a1 q() {
        return this.b.a;
    }

    public final void r() {
        synchronized (this.j) {
            try {
                if (this.h != null) {
                    this.h.cancel();
                    this.l.set(false);
                    this.h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        synchronized (this.j) {
            try {
                if (this.g != null) {
                    this.g.cancel();
                    this.k.set(false);
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(io.sentry.U1 r5, io.sentry.AbstractC5083a1 r6, boolean r7, io.sentry.C5185y r8) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.M1.t(io.sentry.U1, io.sentry.a1, boolean, io.sentry.y):void");
    }

    public final boolean u() {
        ArrayList arrayList = new ArrayList(this.c);
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            P1 p1 = (P1) it.next();
            if (!p1.f && p1.b == null) {
                return false;
            }
        }
        return true;
    }
}
