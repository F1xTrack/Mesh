package io.sentry;

import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6093i;
import io.sentry.protocol.C6104t;
import io.sentry.util.C6170c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.sentry.P1 */
/* loaded from: classes2.dex */
public final class C5795P1 implements InterfaceC5804T {

    /* renamed from: a */
    public final AbstractC5827a1 f33365a;

    /* renamed from: b */
    public AbstractC5827a1 f33366b;

    /* renamed from: c */
    public final C5798Q1 f33367c;

    /* renamed from: d */
    public final C5786M1 f33368d;

    /* renamed from: e */
    public final C5757D f33369e;

    /* renamed from: h */
    public final C5806T1 f33372h;

    /* renamed from: i */
    public InterfaceC5800R1 f33373i;

    /* renamed from: f */
    public boolean f33370f = false;

    /* renamed from: g */
    public final AtomicBoolean f33371g = new AtomicBoolean(false);

    /* renamed from: j */
    public final ConcurrentHashMap f33374j = new ConcurrentHashMap();

    /* renamed from: k */
    public final ConcurrentHashMap f33375k = new ConcurrentHashMap();

    /* renamed from: l */
    public final C6170c f33376l = new C6170c(new C5754C(3));

    public C5795P1(C6104t c6104t, C5803S1 c5803s1, C5786M1 c5786m1, String str, C5757D c5757d, AbstractC5827a1 abstractC5827a1, C5806T1 c5806t1, C5777J1 c5777j1) {
        this.f33367c = new C5798Q1(c6104t, new C5803S1(), str, c5803s1, c5786m1.f33327b.f33367c.f33382d);
        this.f33368d = c5786m1;
        AbstractC6003a.m21735D(c5757d, "hub is required");
        this.f33369e = c5757d;
        this.f33372h = c5806t1;
        this.f33373i = c5777j1;
        if (abstractC5827a1 != null) {
            this.f33365a = abstractC5827a1;
        } else {
            this.f33365a = c5757d.mo21364A().getDateProvider().now();
        }
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: b */
    public final boolean mo21420b() {
        return this.f33370f;
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: d */
    public final boolean mo21422d(AbstractC5827a1 abstractC5827a1) {
        if (this.f33366b == null) {
            return false;
        }
        this.f33366b = abstractC5827a1;
        return true;
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: e */
    public final void mo21423e(Number number, String str) {
        if (this.f33370f) {
            this.f33369e.mo21364A().getLogger().mo21407k(EnumC6069n1.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f33375k.put(str, new C6093i(number, null));
        C5786M1 c5786m1 = this.f33368d;
        C5795P1 c5795p1 = c5786m1.f33327b;
        if (c5795p1 == this || c5795p1.f33375k.containsKey(str)) {
            return;
        }
        c5786m1.mo21423e(number, str);
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: f */
    public final void mo21424f(EnumC5809U1 enumC5809U1) {
        mo21434p(enumC5809U1, this.f33369e.mo21364A().getDateProvider().now());
    }

    @Override // io.sentry.InterfaceC5804T
    public final void finish() {
        mo21424f(this.f33367c.f33385g);
    }

    @Override // io.sentry.InterfaceC5804T
    public final String getDescription() {
        return this.f33367c.f33384f;
    }

    @Override // io.sentry.InterfaceC5804T
    public final EnumC5809U1 getStatus() {
        return this.f33367c.f33385g;
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: h */
    public final void mo21426h(Object obj, String str) {
        this.f33374j.put(str, obj);
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: j */
    public final void mo21428j(String str) {
        this.f33367c.f33384f = str;
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: m */
    public final void mo21431m(String str, Long l, EnumC6071o0 enumC6071o0) {
        if (this.f33370f) {
            this.f33369e.mo21364A().getLogger().mo21407k(EnumC6069n1.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f33375k.put(str, new C6093i(l, enumC6071o0.apiName()));
        C5786M1 c5786m1 = this.f33368d;
        C5795P1 c5795p1 = c5786m1.f33327b;
        if (c5795p1 == this || c5795p1.f33375k.containsKey(str)) {
            return;
        }
        c5786m1.mo21431m(str, l, enumC6071o0);
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: n */
    public final C5798Q1 mo21432n() {
        return this.f33367c;
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: o */
    public final AbstractC5827a1 mo21433o() {
        return this.f33366b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.InterfaceC5804T
    /* renamed from: p */
    public final void mo21434p(EnumC5809U1 enumC5809U1, AbstractC5827a1 abstractC5827a1) {
        AbstractC5827a1 abstractC5827a12;
        AbstractC5827a1 abstractC5827a13;
        if (this.f33370f || !this.f33371g.compareAndSet(false, true)) {
            return;
        }
        C5798Q1 c5798q1 = this.f33367c;
        c5798q1.f33385g = enumC5809U1;
        if (abstractC5827a1 == null) {
            abstractC5827a1 = this.f33369e.mo21364A().getDateProvider().now();
        }
        this.f33366b = abstractC5827a1;
        C5806T1 c5806t1 = this.f33372h;
        c5806t1.getClass();
        if (c5806t1.f33409a) {
            C5786M1 c5786m1 = this.f33368d;
            C5803S1 c5803s1 = c5786m1.f33327b.f33367c.f33380b;
            C5803S1 c5803s12 = c5798q1.f33380b;
            boolean zEquals = c5803s1.equals(c5803s12);
            CopyOnWriteArrayList<C5795P1> copyOnWriteArrayList = c5786m1.f33328c;
            if (!zEquals) {
                ArrayList arrayList = new ArrayList();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    C5795P1 c5795p1 = (C5795P1) it.next();
                    C5803S1 c5803s13 = c5795p1.f33367c.f33381c;
                    if (c5803s13 != null && c5803s13.equals(c5803s12)) {
                        arrayList.add(c5795p1);
                    }
                }
                copyOnWriteArrayList = arrayList;
            }
            AbstractC5827a1 abstractC5827a14 = null;
            AbstractC5827a1 abstractC5827a15 = null;
            for (C5795P1 c5795p12 : copyOnWriteArrayList) {
                if (abstractC5827a14 == null || c5795p12.f33365a.mo21495b(abstractC5827a14) < 0) {
                    abstractC5827a14 = c5795p12.f33365a;
                }
                if (abstractC5827a15 == null || ((abstractC5827a13 = c5795p12.f33366b) != null && abstractC5827a13.mo21495b(abstractC5827a15) > 0)) {
                    abstractC5827a15 = c5795p12.f33366b;
                }
            }
            if (c5806t1.f33409a && abstractC5827a15 != null && ((abstractC5827a12 = this.f33366b) == null || abstractC5827a12.mo21495b(abstractC5827a15) > 0)) {
                mo21422d(abstractC5827a15);
            }
        }
        InterfaceC5800R1 interfaceC5800R1 = this.f33373i;
        if (interfaceC5800R1 != null) {
            interfaceC5800R1.mo21409a(this);
        }
        this.f33370f = true;
    }

    @Override // io.sentry.InterfaceC5804T
    /* renamed from: q */
    public final AbstractC5827a1 mo21435q() {
        return this.f33365a;
    }

    public C5795P1(C5824Z1 c5824z1, C5786M1 c5786m1, C5757D c5757d, AbstractC5827a1 abstractC5827a1, C5828a2 c5828a2) {
        this.f33367c = c5824z1;
        AbstractC6003a.m21735D(c5786m1, "sentryTracer is required");
        this.f33368d = c5786m1;
        this.f33369e = c5757d;
        this.f33373i = null;
        if (abstractC5827a1 != null) {
            this.f33365a = abstractC5827a1;
        } else {
            this.f33365a = c5757d.mo21364A().getDateProvider().now();
        }
        this.f33372h = c5828a2;
    }
}
