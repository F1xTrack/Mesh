package io.sentry;

import com.huawei.hms.rn.push.constants.NotificationConstants;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class F0 implements InterfaceC5141l0 {
    public String a;
    public String b;
    public String c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public ConcurrentHashMap h;

    public F0(U u, Long l, Long l2) {
        this.a = u.k().toString();
        this.b = u.n().a.toString();
        this.c = u.getName().isEmpty() ? "unknown" : u.getName();
        this.d = l;
        this.f = l2;
    }

    public final void a(Long l, Long l2, Long l3, Long l4) {
        if (this.e == null) {
            this.e = Long.valueOf(l.longValue() - l2.longValue());
            this.d = Long.valueOf(this.d.longValue() - l2.longValue());
            this.g = Long.valueOf(l3.longValue() - l4.longValue());
            this.f = Long.valueOf(this.f.longValue() - l4.longValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F0.class != obj.getClass()) {
            return false;
        }
        F0 f0 = (F0) obj;
        return this.a.equals(f0.a) && this.b.equals(f0.b) && this.c.equals(f0.c) && this.d.equals(f0.d) && this.f.equals(f0.f) && io.sentry.config.a.f(this.g, f0.g) && io.sentry.config.a.f(this.e, f0.e) && io.sentry.config.a.f(this.h, f0.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u(NotificationConstants.ID).r(iLogger, this.a);
        a0.u("trace_id").r(iLogger, this.b);
        a0.u("name").r(iLogger, this.c);
        a0.u("relative_start_ns").r(iLogger, this.d);
        a0.u("relative_end_ns").r(iLogger, this.e);
        a0.u("relative_cpu_start_ms").r(iLogger, this.f);
        a0.u("relative_cpu_end_ms").r(iLogger, this.g);
        ConcurrentHashMap concurrentHashMap = this.h;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.h, str, a0, str, iLogger);
            }
        }
        a0.j();
    }
}
