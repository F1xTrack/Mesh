package io.sentry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class P1 implements T {
    public final AbstractC5083a1 a;
    public AbstractC5083a1 b;
    public final Q1 c;
    public final M1 d;
    public final D e;
    public final T1 h;
    public R1 i;
    public boolean f = false;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final ConcurrentHashMap k = new ConcurrentHashMap();
    public final io.sentry.util.c l = new io.sentry.util.c(new C(3));

    public P1(io.sentry.protocol.t tVar, S1 s1, M1 m1, String str, D d, AbstractC5083a1 abstractC5083a1, T1 t1, J1 j1) {
        this.c = new Q1(tVar, new S1(), str, s1, m1.b.c.d);
        this.d = m1;
        io.sentry.config.a.D(d, "hub is required");
        this.e = d;
        this.h = t1;
        this.i = j1;
        if (abstractC5083a1 != null) {
            this.a = abstractC5083a1;
        } else {
            this.a = d.A().getDateProvider().now();
        }
    }

    @Override // io.sentry.T
    public final boolean b() {
        return this.f;
    }

    @Override // io.sentry.T
    public final boolean d(AbstractC5083a1 abstractC5083a1) {
        if (this.b == null) {
            return false;
        }
        this.b = abstractC5083a1;
        return true;
    }

    @Override // io.sentry.T
    public final void e(Number number, String str) {
        if (this.f) {
            this.e.A().getLogger().k(EnumC5148n1.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.k.put(str, new io.sentry.protocol.i(number, null));
        M1 m1 = this.d;
        P1 p1 = m1.b;
        if (p1 == this || p1.k.containsKey(str)) {
            return;
        }
        m1.e(number, str);
    }

    @Override // io.sentry.T
    public final void f(U1 u1) {
        p(u1, this.e.A().getDateProvider().now());
    }

    @Override // io.sentry.T
    public final void finish() {
        f(this.c.g);
    }

    @Override // io.sentry.T
    public final String getDescription() {
        return this.c.f;
    }

    @Override // io.sentry.T
    public final U1 getStatus() {
        return this.c.g;
    }

    @Override // io.sentry.T
    public final void h(Object obj, String str) {
        this.j.put(str, obj);
    }

    @Override // io.sentry.T
    public final void j(String str) {
        this.c.f = str;
    }

    @Override // io.sentry.T
    public final void m(String str, Long l, EnumC5150o0 enumC5150o0) {
        if (this.f) {
            this.e.A().getLogger().k(EnumC5148n1.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.k.put(str, new io.sentry.protocol.i(l, enumC5150o0.apiName()));
        M1 m1 = this.d;
        P1 p1 = m1.b;
        if (p1 == this || p1.k.containsKey(str)) {
            return;
        }
        m1.m(str, l, enumC5150o0);
    }

    @Override // io.sentry.T
    public final Q1 n() {
        return this.c;
    }

    @Override // io.sentry.T
    public final AbstractC5083a1 o() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.T
    public final void p(U1 u1, AbstractC5083a1 abstractC5083a1) {
        AbstractC5083a1 abstractC5083a12;
        AbstractC5083a1 abstractC5083a13;
        if (this.f || !this.g.compareAndSet(false, true)) {
            return;
        }
        Q1 q1 = this.c;
        q1.g = u1;
        if (abstractC5083a1 == null) {
            abstractC5083a1 = this.e.A().getDateProvider().now();
        }
        this.b = abstractC5083a1;
        T1 t1 = this.h;
        t1.getClass();
        if (t1.a) {
            M1 m1 = this.d;
            S1 s1 = m1.b.c.b;
            S1 s12 = q1.b;
            boolean zEquals = s1.equals(s12);
            CopyOnWriteArrayList<P1> copyOnWriteArrayList = m1.c;
            if (!zEquals) {
                ArrayList arrayList = new ArrayList();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    P1 p1 = (P1) it.next();
                    S1 s13 = p1.c.c;
                    if (s13 != null && s13.equals(s12)) {
                        arrayList.add(p1);
                    }
                }
                copyOnWriteArrayList = arrayList;
            }
            AbstractC5083a1 abstractC5083a14 = null;
            AbstractC5083a1 abstractC5083a15 = null;
            for (P1 p12 : copyOnWriteArrayList) {
                if (abstractC5083a14 == null || p12.a.b(abstractC5083a14) < 0) {
                    abstractC5083a14 = p12.a;
                }
                if (abstractC5083a15 == null || ((abstractC5083a13 = p12.b) != null && abstractC5083a13.b(abstractC5083a15) > 0)) {
                    abstractC5083a15 = p12.b;
                }
            }
            if (t1.a && abstractC5083a15 != null && ((abstractC5083a12 = this.b) == null || abstractC5083a12.b(abstractC5083a15) > 0)) {
                d(abstractC5083a15);
            }
        }
        R1 r1 = this.i;
        if (r1 != null) {
            r1.a(this);
        }
        this.f = true;
    }

    @Override // io.sentry.T
    public final AbstractC5083a1 q() {
        return this.a;
    }

    public P1(Z1 z1, M1 m1, D d, AbstractC5083a1 abstractC5083a1, a2 a2Var) {
        this.c = z1;
        io.sentry.config.a.D(m1, "sentryTracer is required");
        this.d = m1;
        this.e = d;
        this.i = null;
        if (abstractC5083a1 != null) {
            this.a = abstractC5083a1;
        } else {
            this.a = d.A().getDateProvider().now();
        }
        this.h = a2Var;
    }
}
