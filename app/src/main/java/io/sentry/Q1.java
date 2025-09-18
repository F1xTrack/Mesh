package io.sentry;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class Q1 implements InterfaceC5141l0 {
    public final io.sentry.protocol.t a;
    public final S1 b;
    public final S1 c;
    public transient Y0 d;
    public final String e;
    public String f;
    public U1 g;
    public ConcurrentHashMap h;
    public String i;
    public ConcurrentHashMap j;

    public Q1(io.sentry.protocol.t tVar, S1 s1, String str, S1 s12, Y0 y0) {
        this(tVar, s1, s12, str, null, y0, null, "manual");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q1)) {
            return false;
        }
        Q1 q1 = (Q1) obj;
        return this.a.equals(q1.a) && this.b.equals(q1.b) && io.sentry.config.a.f(this.c, q1.c) && this.e.equals(q1.e) && io.sentry.config.a.f(this.f, q1.f) && this.g == q1.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.f, this.g});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("trace_id");
        this.a.serialize(a0, iLogger);
        a0.u("span_id");
        a0.d(this.b.a);
        S1 s1 = this.c;
        if (s1 != null) {
            a0.u("parent_span_id");
            a0.d(s1.a);
        }
        a0.u("op").d(this.e);
        if (this.f != null) {
            a0.u("description").d(this.f);
        }
        if (this.g != null) {
            a0.u("status").r(iLogger, this.g);
        }
        if (this.i != null) {
            a0.u("origin").r(iLogger, this.i);
        }
        if (!this.h.isEmpty()) {
            a0.u("tags").r(iLogger, this.h);
        }
        ConcurrentHashMap concurrentHashMap = this.j;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                a0.u(str).r(iLogger, this.j.get(str));
            }
        }
        a0.j();
    }

    public Q1(io.sentry.protocol.t tVar, S1 s1, S1 s12, String str, String str2, Y0 y0, U1 u1, String str3) {
        this.h = new ConcurrentHashMap();
        this.i = "manual";
        io.sentry.config.a.D(tVar, "traceId is required");
        this.a = tVar;
        io.sentry.config.a.D(s1, "spanId is required");
        this.b = s1;
        io.sentry.config.a.D(str, "operation is required");
        this.e = str;
        this.c = s12;
        this.d = y0;
        this.f = str2;
        this.g = u1;
        this.i = str3;
    }

    public Q1(Q1 q1) {
        this.h = new ConcurrentHashMap();
        this.i = "manual";
        this.a = q1.a;
        this.b = q1.b;
        this.c = q1.c;
        this.d = q1.d;
        this.e = q1.e;
        this.f = q1.f;
        this.g = q1.g;
        ConcurrentHashMap concurrentHashMapA = io.sentry.config.a.A(q1.h);
        if (concurrentHashMapA != null) {
            this.h = concurrentHashMapA;
        }
    }
}
