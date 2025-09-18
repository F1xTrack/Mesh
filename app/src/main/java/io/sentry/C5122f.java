package io.sentry;

import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.f */
/* loaded from: classes2.dex */
public final class C5122f implements InterfaceC5141l0 {
    public final Long a;
    public Date b;
    public String c;
    public String d;
    public ConcurrentHashMap e;
    public String f;
    public String g;
    public EnumC5148n1 h;
    public ConcurrentHashMap i;

    public C5122f(Date date) {
        this.e = new ConcurrentHashMap();
        this.b = date;
        this.a = null;
    }

    public final Date a() {
        Date date = this.b;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l = this.a;
        if (l == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateL = io.sentry.config.a.l(l.longValue());
        this.b = dateL;
        return dateL;
    }

    public final void b(Object obj, String str) {
        this.e.put(str, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5122f.class != obj.getClass()) {
            return false;
        }
        C5122f c5122f = (C5122f) obj;
        return a().getTime() == c5122f.a().getTime() && io.sentry.config.a.f(this.c, c5122f.c) && io.sentry.config.a.f(this.d, c5122f.d) && io.sentry.config.a.f(this.f, c5122f.f) && io.sentry.config.a.f(this.g, c5122f.g) && this.h == c5122f.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.f, this.g, this.h});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("timestamp").r(iLogger, a());
        if (this.c != null) {
            a0.u("message").d(this.c);
        }
        if (this.d != null) {
            a0.u("type").d(this.d);
        }
        a0.u("data").r(iLogger, this.e);
        if (this.f != null) {
            a0.u("category").d(this.f);
        }
        if (this.g != null) {
            a0.u("origin").d(this.g);
        }
        if (this.h != null) {
            a0.u("level").r(iLogger, this.h);
        }
        ConcurrentHashMap concurrentHashMap = this.i;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.i, str, a0, str, iLogger);
            }
        }
        a0.j();
    }

    public C5122f(long j) {
        this.e = new ConcurrentHashMap();
        this.a = Long.valueOf(j);
        this.b = null;
    }

    public C5122f(C5122f c5122f) {
        this.e = new ConcurrentHashMap();
        this.b = c5122f.b;
        this.a = c5122f.a;
        this.c = c5122f.c;
        this.d = c5122f.d;
        this.f = c5122f.f;
        this.g = c5122f.g;
        ConcurrentHashMap concurrentHashMapA = io.sentry.config.a.A(c5122f.e);
        if (concurrentHashMapA != null) {
            this.e = concurrentHashMapA;
        }
        this.i = io.sentry.config.a.A(c5122f.i);
        this.h = c5122f.h;
    }

    public C5122f() {
        this(System.currentTimeMillis());
    }
}
