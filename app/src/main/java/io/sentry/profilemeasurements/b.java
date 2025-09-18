package io.sentry.profilemeasurements;

import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class b implements InterfaceC5141l0 {
    public ConcurrentHashMap a;
    public String b;
    public double c;

    public b(Long l, Number number) {
        this.b = l.toString();
        this.c = number.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return io.sentry.config.a.f(this.a, bVar.a) && this.b.equals(bVar.b) && this.c == bVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Double.valueOf(this.c)});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("value").r(iLogger, Double.valueOf(this.c));
        a0.u("elapsed_since_start_ns").r(iLogger, this.b);
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.a, str, a0, str, iLogger);
            }
        }
        a0.j();
    }
}
