package io.sentry.protocol;

import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import io.sentry.M1;
import io.sentry.P1;
import io.sentry.Q1;
import io.sentry.V0;
import io.sentry.Y0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class A extends V0 implements InterfaceC5141l0 {
    public String p;
    public Double q;
    public Double r;
    public final ArrayList s;
    public final HashMap t;
    public Map u;
    public B v;
    public ConcurrentHashMap w;

    public A(ArrayList arrayList, HashMap map, B b) {
        Double dValueOf = Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE);
        ArrayList arrayList2 = new ArrayList();
        this.s = arrayList2;
        HashMap map2 = new HashMap();
        this.t = map2;
        this.p = "";
        this.q = dValueOf;
        this.r = null;
        arrayList2.addAll(arrayList);
        map2.putAll(map);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.t.putAll(((w) it.next()).l);
        }
        this.v = b;
        this.u = null;
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.p != null) {
            a0.u("transaction").d(this.p);
        }
        A0 a0U = a0.u("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.q.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        a0U.r(iLogger, bigDecimalValueOf.setScale(6, roundingMode));
        if (this.r != null) {
            a0.u("timestamp").r(iLogger, BigDecimal.valueOf(this.r.doubleValue()).setScale(6, roundingMode));
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            a0.u("spans").r(iLogger, arrayList);
        }
        a0.u("type").d("transaction");
        HashMap map = this.t;
        if (!map.isEmpty()) {
            a0.u("measurements").r(iLogger, map);
        }
        Map map2 = this.u;
        if (map2 != null && !map2.isEmpty()) {
            a0.u("_metrics_summary").r(iLogger, this.u);
        }
        a0.u("transaction_info").r(iLogger, this.v);
        io.sentry.config.a.E(this, a0, iLogger);
        ConcurrentHashMap concurrentHashMap = this.w;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.w, str, a0, str, iLogger);
            }
        }
        a0.j();
    }

    public A(M1 m1) {
        super(m1.a);
        this.s = new ArrayList();
        this.t = new HashMap();
        P1 p1 = m1.b;
        this.q = Double.valueOf(p1.a.d() / 1.0E9d);
        this.r = Double.valueOf(p1.a.c(p1.b) / 1.0E9d);
        this.p = m1.e;
        Iterator it = m1.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            P1 p12 = (P1) it.next();
            Boolean bool = Boolean.TRUE;
            Y0 y0 = p12.c.d;
            if (bool.equals(y0 != null ? (Boolean) y0.a : null)) {
                this.s.add(new w(p12));
            }
        }
        C5157c c5157c = this.b;
        c5157c.putAll(m1.p);
        Q1 q1 = p1.c;
        c5157c.c(new Q1(q1.a, q1.b, q1.c, q1.e, q1.f, q1.d, q1.g, q1.i));
        for (Map.Entry entry : q1.h.entrySet()) {
            a((String) entry.getKey(), (String) entry.getValue());
        }
        ConcurrentHashMap concurrentHashMap = p1.j;
        if (concurrentHashMap != null) {
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (this.o == null) {
                    this.o = new HashMap();
                }
                this.o.put(str, value);
            }
        }
        this.v = new B(m1.n.apiName());
        io.sentry.metrics.b bVar = (io.sentry.metrics.b) p1.l.a();
        if (bVar != null) {
            this.u = bVar.a();
        } else {
            this.u = null;
        }
    }
}
