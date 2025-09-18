package io.sentry.protocol;

import io.sentry.C5798Q1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.config.AbstractC6003a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.c */
/* loaded from: classes2.dex */
public final class C6087c extends ConcurrentHashMap implements InterfaceC6058l0 {

    /* renamed from: a */
    public final Object f34327a = new Object();

    public C6087c() {
    }

    /* renamed from: a */
    public final C5798Q1 m21849a() {
        return (C5798Q1) m21852d(C5798Q1.class, "trace");
    }

    /* renamed from: b */
    public final void m21850b(C6085a c6085a) {
        put("app", c6085a);
    }

    /* renamed from: c */
    public final void m21851c(C5798Q1 c5798q1) {
        AbstractC6003a.m21735D(c5798q1, "traceContext is required");
        put("trace", c5798q1);
    }

    /* renamed from: d */
    public final Object m21852d(Class cls, String str) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                interfaceC5749A0.mo13828u(str).mo13825r(iLogger, obj);
            }
        }
        interfaceC5749A0.mo13817j();
    }

    public C6087c(C6087c c6087c) {
        Iterator it = c6087c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C6085a)) {
                    C6085a c6085a = (C6085a) value;
                    C6085a c6085a2 = new C6085a();
                    c6085a2.f34318g = c6085a.f34318g;
                    c6085a2.f34312a = c6085a.f34312a;
                    c6085a2.f34316e = c6085a.f34316e;
                    c6085a2.f34313b = c6085a.f34313b;
                    c6085a2.f34317f = c6085a.f34317f;
                    c6085a2.f34315d = c6085a.f34315d;
                    c6085a2.f34314c = c6085a.f34314c;
                    c6085a2.f34319h = AbstractC6003a.m21732A(c6085a.f34319h);
                    c6085a2.f34322k = c6085a.f34322k;
                    List list = c6085a.f34320i;
                    c6085a2.f34320i = list != null ? new ArrayList(list) : null;
                    c6085a2.f34321j = c6085a.f34321j;
                    c6085a2.f34323l = AbstractC6003a.m21732A(c6085a.f34323l);
                    m21850b(c6085a2);
                } else if ("browser".equals(entry.getKey()) && (value instanceof C6086b)) {
                    C6086b c6086b = (C6086b) value;
                    C6086b c6086b2 = new C6086b();
                    c6086b2.f34324a = c6086b.f34324a;
                    c6086b2.f34325b = c6086b.f34325b;
                    c6086b2.f34326c = AbstractC6003a.m21732A(c6086b.f34326c);
                    put("browser", c6086b2);
                } else if ("device".equals(entry.getKey()) && (value instanceof C6090f)) {
                    C6090f c6090f = (C6090f) value;
                    C6090f c6090f2 = new C6090f();
                    c6090f2.f34340a = c6090f.f34340a;
                    c6090f2.f34341b = c6090f.f34341b;
                    c6090f2.f34342c = c6090f.f34342c;
                    c6090f2.f34343d = c6090f.f34343d;
                    c6090f2.f34344e = c6090f.f34344e;
                    c6090f2.f34345f = c6090f.f34345f;
                    c6090f2.f34348i = c6090f.f34348i;
                    c6090f2.f34349j = c6090f.f34349j;
                    c6090f2.f34350k = c6090f.f34350k;
                    c6090f2.f34351l = c6090f.f34351l;
                    c6090f2.f34352m = c6090f.f34352m;
                    c6090f2.f34353n = c6090f.f34353n;
                    c6090f2.f34354o = c6090f.f34354o;
                    c6090f2.f34355p = c6090f.f34355p;
                    c6090f2.f34356q = c6090f.f34356q;
                    c6090f2.f34357r = c6090f.f34357r;
                    c6090f2.f34358s = c6090f.f34358s;
                    c6090f2.f34359t = c6090f.f34359t;
                    c6090f2.f34360u = c6090f.f34360u;
                    c6090f2.f34361v = c6090f.f34361v;
                    c6090f2.f34362w = c6090f.f34362w;
                    c6090f2.f34363x = c6090f.f34363x;
                    c6090f2.f34364y = c6090f.f34364y;
                    c6090f2.f34331A = c6090f.f34331A;
                    c6090f2.f34332B = c6090f.f34332B;
                    c6090f2.f34334D = c6090f.f34334D;
                    c6090f2.f34335E = c6090f.f34335E;
                    c6090f2.f34347h = c6090f.f34347h;
                    String[] strArr = c6090f.f34346g;
                    c6090f2.f34346g = strArr != null ? (String[]) strArr.clone() : null;
                    c6090f2.f34333C = c6090f.f34333C;
                    TimeZone timeZone = c6090f.f34365z;
                    c6090f2.f34365z = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    c6090f2.f34336F = c6090f.f34336F;
                    c6090f2.f34337G = c6090f.f34337G;
                    c6090f2.f34338H = c6090f.f34338H;
                    c6090f2.f34339I = AbstractC6003a.m21732A(c6090f.f34339I);
                    put("device", c6090f2);
                } else if ("os".equals(entry.getKey()) && (value instanceof C6097m)) {
                    C6097m c6097m = (C6097m) value;
                    C6097m c6097m2 = new C6097m();
                    c6097m2.f34400a = c6097m.f34400a;
                    c6097m2.f34401b = c6097m.f34401b;
                    c6097m2.f34402c = c6097m.f34402c;
                    c6097m2.f34403d = c6097m.f34403d;
                    c6097m2.f34404e = c6097m.f34404e;
                    c6097m2.f34405f = c6097m.f34405f;
                    c6097m2.f34406g = AbstractC6003a.m21732A(c6097m.f34406g);
                    put("os", c6097m2);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof C6106v)) {
                    C6106v c6106v = (C6106v) value;
                    C6106v c6106v2 = new C6106v();
                    c6106v2.f34447a = c6106v.f34447a;
                    c6106v2.f34448b = c6106v.f34448b;
                    c6106v2.f34449c = c6106v.f34449c;
                    c6106v2.f34450d = AbstractC6003a.m21732A(c6106v.f34450d);
                    put("runtime", c6106v2);
                } else if ("gpu".equals(entry.getKey()) && (value instanceof C6092h)) {
                    C6092h c6092h = (C6092h) value;
                    C6092h c6092h2 = new C6092h();
                    c6092h2.f34370a = c6092h.f34370a;
                    c6092h2.f34371b = c6092h.f34371b;
                    c6092h2.f34372c = c6092h.f34372c;
                    c6092h2.f34373d = c6092h.f34373d;
                    c6092h2.f34374e = c6092h.f34374e;
                    c6092h2.f34375f = c6092h.f34375f;
                    c6092h2.f34376g = c6092h.f34376g;
                    c6092h2.f34377h = c6092h.f34377h;
                    c6092h2.f34378i = c6092h.f34378i;
                    c6092h2.f34379j = AbstractC6003a.m21732A(c6092h.f34379j);
                    put("gpu", c6092h2);
                } else if ("trace".equals(entry.getKey()) && (value instanceof C5798Q1)) {
                    m21851c(new C5798Q1((C5798Q1) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof C6100p)) {
                    C6100p c6100p = (C6100p) value;
                    C6100p c6100p2 = new C6100p();
                    c6100p2.f34419a = c6100p.f34419a;
                    c6100p2.f34420b = AbstractC6003a.m21732A(c6100p.f34420b);
                    c6100p2.f34424f = AbstractC6003a.m21732A(c6100p.f34424f);
                    c6100p2.f34421c = c6100p.f34421c;
                    c6100p2.f34422d = c6100p.f34422d;
                    c6100p2.f34423e = c6100p.f34423e;
                    synchronized (this.f34327a) {
                        put("response", c6100p2);
                    }
                } else {
                    put((String) entry.getKey(), value);
                }
            }
        }
    }
}
