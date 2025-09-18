package io.sentry;

import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6082E;
import io.sentry.protocol.C6087c;
import io.sentry.protocol.C6104t;
import io.sentry.protocol.EnumC6080C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.H30;

/* renamed from: io.sentry.M1 */
/* loaded from: classes2.dex */
public final class C5786M1 implements InterfaceC5807U {

    /* renamed from: b */
    public final C5795P1 f33327b;

    /* renamed from: d */
    public final C5757D f33329d;

    /* renamed from: e */
    public final String f33330e;

    /* renamed from: g */
    public volatile C5780K1 f33332g;

    /* renamed from: h */
    public volatile C5780K1 f33333h;

    /* renamed from: i */
    public volatile Timer f33334i;

    /* renamed from: j */
    public final Object f33335j;

    /* renamed from: k */
    public final AtomicBoolean f33336k;

    /* renamed from: l */
    public final AtomicBoolean f33337l;

    /* renamed from: m */
    public final C5985c f33338m;

    /* renamed from: n */
    public final EnumC6080C f33339n;

    /* renamed from: o */
    public final EnumC5816X f33340o;

    /* renamed from: p */
    public final C6087c f33341p;

    /* renamed from: q */
    public final InterfaceC5982b2 f33342q;

    /* renamed from: r */
    public final C5828a2 f33343r;

    /* renamed from: a */
    public final C6104t f33326a = new C6104t((UUID) null);

    /* renamed from: c */
    public final CopyOnWriteArrayList f33328c = new CopyOnWriteArrayList();

    /* renamed from: f */
    public C5783L1 f33331f = C5783L1.f33323c;

    public C5786M1(C5824Z1 c5824z1, C5757D c5757d, C5828a2 c5828a2, InterfaceC5982b2 interfaceC5982b2) {
        this.f33334i = null;
        Object obj = new Object();
        this.f33335j = obj;
        this.f33336k = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f33337l = atomicBoolean;
        this.f33341p = new C6087c();
        this.f33327b = new C5795P1(c5824z1, this, c5757d, c5828a2.f33472b, c5828a2);
        this.f33330e = c5824z1.f33462k;
        this.f33340o = c5824z1.f33466o;
        this.f33329d = c5757d;
        this.f33342q = interfaceC5982b2;
        this.f33339n = c5824z1.f33463l;
        this.f33343r = c5828a2;
        C5985c c5985c = c5824z1.f33465n;
        if (c5985c != null) {
            this.f33338m = c5985c;
        } else {
            this.f33338m = new C5985c(c5757d.mo21364A().getLogger());
        }
        if (interfaceC5982b2 != null) {
            interfaceC5982b2.mo21696g(this);
        }
        if (c5828a2.f33475e == null && c5828a2.f33476f == null) {
            return;
        }
        boolean z = true;
        this.f33334i = new Timer(true);
        Long l = c5828a2.f33476f;
        if (l != null) {
            synchronized (obj) {
                try {
                    if (this.f33334i != null) {
                        m21436r();
                        atomicBoolean.set(true);
                        this.f33333h = new C5780K1(this, 1);
                        this.f33334i.schedule(this.f33333h, l.longValue());
                    }
                } catch (Throwable th) {
                    this.f33329d.mo21364A().getLogger().mo21406d(EnumC6069n1.WARNING, "Failed to schedule finish timer", th);
                    EnumC5809U1 status = getStatus();
                    if (status == null) {
                        status = EnumC5809U1.DEADLINE_EXCEEDED;
                    }
                    if (this.f33343r.f33475e == null) {
                        z = false;
                    }
                    mo21421c(status, z, null);
                    this.f33337l.set(false);
                } finally {
                }
            }
        }
        mo21430l();
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: a */
    public final C5821Y1 mo21419a() {
        if (!this.f33329d.mo21364A().isTraceSampling()) {
            return null;
        }
        synchronized (this) {
            try {
                if (this.f33338m.f34087b) {
                    AtomicReference atomicReference = new AtomicReference();
                    AtomicReference atomicReference2 = new AtomicReference();
                    this.f33329d.mo21377w(new H30(atomicReference, 23, atomicReference2));
                    this.f33338m.m21702e(this, (C6082E) atomicReference.get(), (C6104t) atomicReference2.get(), this.f33329d.mo21364A(), this.f33327b.f33367c.f33382d);
                    this.f33338m.f34087b = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f33338m.m21703f();
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: b */
    public final boolean mo21420b() {
        return this.f33327b.f33370f;
    }

    @Override // io.sentry.InterfaceC5807U
    /* renamed from: c */
    public final void mo21421c(EnumC5809U1 enumC5809U1, boolean z, C6193y c6193y) {
        if (this.f33327b.f33370f) {
            return;
        }
        AbstractC5827a1 abstractC5827a1Now = this.f33329d.mo21364A().getDateProvider().now();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f33328c;
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            C5795P1 c5795p1 = (C5795P1) listIterator.previous();
            c5795p1.f33373i = null;
            c5795p1.mo21434p(enumC5809U1, abstractC5827a1Now);
        }
        m21438t(enumC5809U1, abstractC5827a1Now, z, c6193y);
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: d */
    public final boolean mo21422d(AbstractC5827a1 abstractC5827a1) {
        return this.f33327b.mo21422d(abstractC5827a1);
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: e */
    public final void mo21423e(Number number, String str) {
        this.f33327b.mo21423e(number, str);
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: f */
    public final void mo21424f(EnumC5809U1 enumC5809U1) {
        mo21434p(enumC5809U1, null);
    }

    @Override // io.sentry.InterfaceC5804T
    public final void finish() {
        mo21434p(getStatus(), null);
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: g */
    public final InterfaceC5804T mo21425g(String str, String str2, AbstractC5827a1 abstractC5827a1, EnumC5816X enumC5816X) {
        C5806T1 c5806t1 = new C5806T1();
        C5795P1 c5795p1 = this.f33327b;
        boolean z = c5795p1.f33370f;
        C6191x0 c6191x0 = C6191x0.f34737a;
        if (z || !this.f33340o.equals(enumC5816X)) {
            return c6191x0;
        }
        int size = this.f33328c.size();
        C5757D c5757d = this.f33329d;
        if (size >= c5757d.mo21364A().getMaxSpans()) {
            c5757d.mo21364A().getLogger().mo21407k(EnumC6069n1.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
            return c6191x0;
        }
        if (c5795p1.f33370f) {
            return c6191x0;
        }
        C5803S1 c5803s1 = c5795p1.f33367c.f33380b;
        C5786M1 c5786m1 = c5795p1.f33368d;
        C5795P1 c5795p12 = c5786m1.f33327b;
        if (c5795p12.f33370f || !c5786m1.f33340o.equals(enumC5816X)) {
            return c6191x0;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = c5786m1.f33328c;
        int size2 = copyOnWriteArrayList.size();
        C5757D c5757d2 = c5786m1.f33329d;
        if (size2 >= c5757d2.mo21364A().getMaxSpans()) {
            c5757d2.mo21364A().getLogger().mo21407k(EnumC6069n1.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
            return c6191x0;
        }
        AbstractC6003a.m21735D(c5803s1, "parentSpanId is required");
        c5786m1.m21437s();
        C5795P1 c5795p13 = new C5795P1(c5795p12.f33367c.f33379a, c5803s1, c5786m1, str, c5786m1.f33329d, abstractC5827a1, c5806t1, new C5777J1(c5786m1));
        c5795p13.f33367c.f33384f = str2;
        c5795p13.mo21426h(String.valueOf(Thread.currentThread().getId()), "thread.id");
        c5795p13.mo21426h(c5757d2.mo21364A().getMainThreadChecker().mo21581a() ? "main" : Thread.currentThread().getName(), "thread.name");
        copyOnWriteArrayList.add(c5795p13);
        InterfaceC5982b2 interfaceC5982b2 = c5786m1.f33342q;
        if (interfaceC5982b2 != null) {
            interfaceC5982b2.mo21695f(c5795p13);
        }
        return c5795p13;
    }

    @Override // io.sentry.InterfaceC5804T
    public final String getDescription() {
        return this.f33327b.f33367c.f33384f;
    }

    @Override // io.sentry.InterfaceC5807U
    public final String getName() {
        return this.f33330e;
    }

    @Override // io.sentry.InterfaceC5804T
    public final EnumC5809U1 getStatus() {
        return this.f33327b.f33367c.f33385g;
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: h */
    public final void mo21426h(Object obj, String str) {
        C5795P1 c5795p1 = this.f33327b;
        if (c5795p1.f33370f) {
            this.f33329d.mo21364A().getLogger().mo21407k(EnumC6069n1.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            c5795p1.mo21426h(obj, str);
        }
    }

    @Override // io.sentry.InterfaceC5807U
    /* renamed from: i */
    public final C5795P1 mo21427i() {
        ArrayList arrayList = new ArrayList(this.f33328c);
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((C5795P1) arrayList.get(size)).f33370f) {
                return (C5795P1) arrayList.get(size);
            }
        }
        return null;
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: j */
    public final void mo21428j(String str) {
        C5795P1 c5795p1 = this.f33327b;
        if (c5795p1.f33370f) {
            this.f33329d.mo21364A().getLogger().mo21407k(EnumC6069n1.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            c5795p1.f33367c.f33384f = str;
        }
    }

    @Override // io.sentry.InterfaceC5807U
    /* renamed from: k */
    public final C6104t mo21429k() {
        return this.f33326a;
    }

    @Override // io.sentry.InterfaceC5807U
    /* renamed from: l */
    public final void mo21430l() {
        Long l;
        synchronized (this.f33335j) {
            try {
                if (this.f33334i != null && (l = this.f33343r.f33475e) != null) {
                    m21437s();
                    this.f33336k.set(true);
                    this.f33332g = new C5780K1(this, 0);
                    try {
                        this.f33334i.schedule(this.f33332g, l.longValue());
                    } catch (Throwable th) {
                        this.f33329d.mo21364A().getLogger().mo21406d(EnumC6069n1.WARNING, "Failed to schedule finish timer", th);
                        EnumC5809U1 status = getStatus();
                        if (status == null) {
                            status = EnumC5809U1.OK;
                        }
                        mo21434p(status, null);
                        this.f33336k.set(false);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: m */
    public final void mo21431m(String str, Long l, EnumC6071o0 enumC6071o0) {
        this.f33327b.mo21431m(str, l, enumC6071o0);
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: n */
    public final C5798Q1 mo21432n() {
        return this.f33327b.f33367c;
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: o */
    public final AbstractC5827a1 mo21433o() {
        return this.f33327b.f33366b;
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: p */
    public final void mo21434p(EnumC5809U1 enumC5809U1, AbstractC5827a1 abstractC5827a1) {
        m21438t(enumC5809U1, abstractC5827a1, true, null);
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: q */
    public final AbstractC5827a1 mo21435q() {
        return this.f33327b.f33365a;
    }

    /* renamed from: r */
    public final void m21436r() {
        synchronized (this.f33335j) {
            try {
                if (this.f33333h != null) {
                    this.f33333h.cancel();
                    this.f33337l.set(false);
                    this.f33333h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: s */
    public final void m21437s() {
        synchronized (this.f33335j) {
            try {
                if (this.f33332g != null) {
                    this.f33332g.cancel();
                    this.f33336k.set(false);
                    this.f33332g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x00a7  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m21438t(io.sentry.EnumC5809U1 r5, io.sentry.AbstractC5827a1 r6, boolean r7, io.sentry.C6193y r8) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C5786M1.m21438t(io.sentry.U1, io.sentry.a1, boolean, io.sentry.y):void");
    }

    /* renamed from: u */
    public final boolean m21439u() {
        ArrayList arrayList = new ArrayList(this.f33328c);
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5795P1 c5795p1 = (C5795P1) it.next();
            if (!c5795p1.f33370f && c5795p1.f33366b == null) {
                return false;
            }
        }
        return true;
    }
}
