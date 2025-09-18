package io.sentry.rrweb;

import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class a extends b implements InterfaceC5141l0 {
    public String c;
    public double d;
    public String e;
    public String f;
    public String g;
    public EnumC5148n1 h;
    public ConcurrentHashMap i;
    public HashMap j;
    public ConcurrentHashMap k;
    public ConcurrentHashMap l;

    public a() {
        super(c.Custom);
        this.c = "breadcrumb";
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
        if (this.e != null) {
            a0.u("type").d(this.e);
        }
        a0.u("timestamp").r(iLogger, BigDecimal.valueOf(this.d));
        if (this.f != null) {
            a0.u("category").d(this.f);
        }
        if (this.g != null) {
            a0.u("message").d(this.g);
        }
        if (this.h != null) {
            a0.u("level").r(iLogger, this.h);
        }
        if (this.i != null) {
            a0.u("data").r(iLogger, this.i);
        }
        ConcurrentHashMap concurrentHashMap = this.k;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.k, str, a0, str, iLogger);
            }
        }
        a0.j();
        ConcurrentHashMap concurrentHashMap2 = this.l;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                AbstractC5116d.c(this.l, str2, a0, str2, iLogger);
            }
        }
        a0.j();
        HashMap map = this.j;
        if (map != null) {
            for (String str3 : map.keySet()) {
                Object obj = this.j.get(str3);
                a0.u(str3);
                a0.r(iLogger, obj);
            }
        }
        a0.j();
    }
}
