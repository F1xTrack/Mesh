package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import io.sentry.P1;
import io.sentry.Q1;
import io.sentry.S1;
import io.sentry.U1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class w implements InterfaceC5141l0 {
    public final Double a;
    public final Double b;
    public final t c;
    public final S1 d;
    public final S1 e;
    public final String f;
    public final String g;
    public final U1 h;
    public final String i;
    public final Map j;
    public Map k;
    public final Map l;
    public final Map m;
    public ConcurrentHashMap n;

    public w(Double d, Double d2, t tVar, S1 s1, S1 s12, String str, String str2, U1 u1, String str3, Map map, Map map2, Map map3, Map map4) {
        this.a = d;
        this.b = d2;
        this.c = tVar;
        this.d = s1;
        this.e = s12;
        this.f = str;
        this.g = str2;
        this.h = u1;
        this.i = str3;
        this.j = map;
        this.l = map2;
        this.m = map3;
        this.k = map4;
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        A0 a0U = a0.u("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.a.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        a0U.r(iLogger, bigDecimalValueOf.setScale(6, roundingMode));
        Double d = this.b;
        if (d != null) {
            a0.u("timestamp").r(iLogger, BigDecimal.valueOf(d.doubleValue()).setScale(6, roundingMode));
        }
        a0.u("trace_id").r(iLogger, this.c);
        a0.u("span_id").r(iLogger, this.d);
        S1 s1 = this.e;
        if (s1 != null) {
            a0.u("parent_span_id").r(iLogger, s1);
        }
        a0.u("op").d(this.f);
        String str = this.g;
        if (str != null) {
            a0.u("description").d(str);
        }
        U1 u1 = this.h;
        if (u1 != null) {
            a0.u("status").r(iLogger, u1);
        }
        String str2 = this.i;
        if (str2 != null) {
            a0.u("origin").r(iLogger, str2);
        }
        Map map = this.j;
        if (!map.isEmpty()) {
            a0.u("tags").r(iLogger, map);
        }
        if (this.k != null) {
            a0.u("data").r(iLogger, this.k);
        }
        Map map2 = this.l;
        if (!map2.isEmpty()) {
            a0.u("measurements").r(iLogger, map2);
        }
        Map map3 = this.m;
        if (map3 != null && !map3.isEmpty()) {
            a0.u("_metrics_summary").r(iLogger, map3);
        }
        ConcurrentHashMap concurrentHashMap = this.n;
        if (concurrentHashMap != null) {
            for (String str3 : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.n, str3, a0, str3, iLogger);
            }
        }
        a0.j();
    }

    public w(P1 p1) {
        ConcurrentHashMap concurrentHashMap = p1.j;
        Q1 q1 = p1.c;
        this.g = q1.f;
        this.f = q1.e;
        this.d = q1.b;
        this.e = q1.c;
        this.c = q1.a;
        this.h = q1.g;
        this.i = q1.i;
        ConcurrentHashMap concurrentHashMapA = io.sentry.config.a.A(q1.h);
        this.j = concurrentHashMapA == null ? new ConcurrentHashMap() : concurrentHashMapA;
        ConcurrentHashMap concurrentHashMapA2 = io.sentry.config.a.A(p1.k);
        this.l = concurrentHashMapA2 == null ? new ConcurrentHashMap() : concurrentHashMapA2;
        this.b = p1.b == null ? null : Double.valueOf(p1.a.c(r1) / 1.0E9d);
        this.a = Double.valueOf(p1.a.d() / 1.0E9d);
        this.k = concurrentHashMap;
        io.sentry.metrics.b bVar = (io.sentry.metrics.b) p1.l.a();
        if (bVar != null) {
            this.m = bVar.a();
        } else {
            this.m = null;
        }
    }
}
