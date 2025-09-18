package io.sentry.rrweb;

import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class l extends b implements InterfaceC5141l0 {
    public String c;
    public String d;
    public String e;
    public double f;
    public double g;
    public ConcurrentHashMap h;
    public HashMap i;
    public ConcurrentHashMap j;
    public ConcurrentHashMap k;

    public l() {
        super(c.Custom);
        this.c = "performanceSpan";
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("type").r(iLogger, this.a);
        a0.u("timestamp").b(this.b);
        a0.u("data");
        a0.q();
        a0.u("tag").d(this.c);
        a0.u("payload");
        a0.q();
        if (this.d != null) {
            a0.u("op").d(this.d);
        }
        if (this.e != null) {
            a0.u("description").d(this.e);
        }
        a0.u("startTimestamp").r(iLogger, BigDecimal.valueOf(this.f));
        a0.u("endTimestamp").r(iLogger, BigDecimal.valueOf(this.g));
        if (this.h != null) {
            a0.u("data").r(iLogger, this.h);
        }
        ConcurrentHashMap concurrentHashMap = this.j;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.j, str, a0, str, iLogger);
            }
        }
        a0.j();
        ConcurrentHashMap concurrentHashMap2 = this.k;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                AbstractC5116d.c(this.k, str2, a0, str2, iLogger);
            }
        }
        a0.j();
        HashMap map = this.i;
        if (map != null) {
            for (String str3 : map.keySet()) {
                Object obj = this.i.get(str3);
                a0.u(str3);
                a0.r(iLogger, obj);
            }
        }
        a0.j();
    }
}
