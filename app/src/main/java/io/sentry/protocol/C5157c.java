package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import io.sentry.Q1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.c */
/* loaded from: classes2.dex */
public final class C5157c extends ConcurrentHashMap implements InterfaceC5141l0 {
    public final Object a = new Object();

    public C5157c() {
    }

    public final Q1 a() {
        return (Q1) d(Q1.class, "trace");
    }

    public final void b(C5155a c5155a) {
        put("app", c5155a);
    }

    public final void c(Q1 q1) {
        io.sentry.config.a.D(q1, "traceContext is required");
        put("trace", q1);
    }

    public final Object d(Class cls, String str) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                a0.u(str).r(iLogger, obj);
            }
        }
        a0.j();
    }

    public C5157c(C5157c c5157c) {
        Iterator it = c5157c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C5155a)) {
                    C5155a c5155a = (C5155a) value;
                    C5155a c5155a2 = new C5155a();
                    c5155a2.g = c5155a.g;
                    c5155a2.a = c5155a.a;
                    c5155a2.e = c5155a.e;
                    c5155a2.b = c5155a.b;
                    c5155a2.f = c5155a.f;
                    c5155a2.d = c5155a.d;
                    c5155a2.c = c5155a.c;
                    c5155a2.h = io.sentry.config.a.A(c5155a.h);
                    c5155a2.k = c5155a.k;
                    List list = c5155a.i;
                    c5155a2.i = list != null ? new ArrayList(list) : null;
                    c5155a2.j = c5155a.j;
                    c5155a2.l = io.sentry.config.a.A(c5155a.l);
                    b(c5155a2);
                } else if ("browser".equals(entry.getKey()) && (value instanceof C5156b)) {
                    C5156b c5156b = (C5156b) value;
                    C5156b c5156b2 = new C5156b();
                    c5156b2.a = c5156b.a;
                    c5156b2.b = c5156b.b;
                    c5156b2.c = io.sentry.config.a.A(c5156b.c);
                    put("browser", c5156b2);
                } else if ("device".equals(entry.getKey()) && (value instanceof C5160f)) {
                    C5160f c5160f = (C5160f) value;
                    C5160f c5160f2 = new C5160f();
                    c5160f2.a = c5160f.a;
                    c5160f2.b = c5160f.b;
                    c5160f2.c = c5160f.c;
                    c5160f2.d = c5160f.d;
                    c5160f2.e = c5160f.e;
                    c5160f2.f = c5160f.f;
                    c5160f2.i = c5160f.i;
                    c5160f2.j = c5160f.j;
                    c5160f2.k = c5160f.k;
                    c5160f2.l = c5160f.l;
                    c5160f2.m = c5160f.m;
                    c5160f2.n = c5160f.n;
                    c5160f2.o = c5160f.o;
                    c5160f2.p = c5160f.p;
                    c5160f2.q = c5160f.q;
                    c5160f2.r = c5160f.r;
                    c5160f2.s = c5160f.s;
                    c5160f2.t = c5160f.t;
                    c5160f2.u = c5160f.u;
                    c5160f2.v = c5160f.v;
                    c5160f2.w = c5160f.w;
                    c5160f2.x = c5160f.x;
                    c5160f2.y = c5160f.y;
                    c5160f2.A = c5160f.A;
                    c5160f2.B = c5160f.B;
                    c5160f2.D = c5160f.D;
                    c5160f2.E = c5160f.E;
                    c5160f2.h = c5160f.h;
                    String[] strArr = c5160f.g;
                    c5160f2.g = strArr != null ? (String[]) strArr.clone() : null;
                    c5160f2.C = c5160f.C;
                    TimeZone timeZone = c5160f.z;
                    c5160f2.z = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    c5160f2.F = c5160f.F;
                    c5160f2.G = c5160f.G;
                    c5160f2.H = c5160f.H;
                    c5160f2.I = io.sentry.config.a.A(c5160f.I);
                    put("device", c5160f2);
                } else if ("os".equals(entry.getKey()) && (value instanceof m)) {
                    m mVar = (m) value;
                    m mVar2 = new m();
                    mVar2.a = mVar.a;
                    mVar2.b = mVar.b;
                    mVar2.c = mVar.c;
                    mVar2.d = mVar.d;
                    mVar2.e = mVar.e;
                    mVar2.f = mVar.f;
                    mVar2.g = io.sentry.config.a.A(mVar.g);
                    put("os", mVar2);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof v)) {
                    v vVar = (v) value;
                    v vVar2 = new v();
                    vVar2.a = vVar.a;
                    vVar2.b = vVar.b;
                    vVar2.c = vVar.c;
                    vVar2.d = io.sentry.config.a.A(vVar.d);
                    put("runtime", vVar2);
                } else if ("gpu".equals(entry.getKey()) && (value instanceof h)) {
                    h hVar = (h) value;
                    h hVar2 = new h();
                    hVar2.a = hVar.a;
                    hVar2.b = hVar.b;
                    hVar2.c = hVar.c;
                    hVar2.d = hVar.d;
                    hVar2.e = hVar.e;
                    hVar2.f = hVar.f;
                    hVar2.g = hVar.g;
                    hVar2.h = hVar.h;
                    hVar2.i = hVar.i;
                    hVar2.j = io.sentry.config.a.A(hVar.j);
                    put("gpu", hVar2);
                } else if ("trace".equals(entry.getKey()) && (value instanceof Q1)) {
                    c(new Q1((Q1) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof p)) {
                    p pVar = (p) value;
                    p pVar2 = new p();
                    pVar2.a = pVar.a;
                    pVar2.b = io.sentry.config.a.A(pVar.b);
                    pVar2.f = io.sentry.config.a.A(pVar.f);
                    pVar2.c = pVar.c;
                    pVar2.d = pVar.d;
                    pVar2.e = pVar.e;
                    synchronized (this.a) {
                        put("response", pVar2);
                    }
                } else {
                    put((String) entry.getKey(), value);
                }
            }
        }
    }
}
