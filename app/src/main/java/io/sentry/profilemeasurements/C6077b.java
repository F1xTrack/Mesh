package io.sentry.profilemeasurements;

import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.config.AbstractC6003a;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.profilemeasurements.b */
/* loaded from: classes2.dex */
public final class C6077b implements InterfaceC6058l0 {

    /* renamed from: a */
    public ConcurrentHashMap f34274a;

    /* renamed from: b */
    public String f34275b;

    /* renamed from: c */
    public double f34276c;

    public C6077b(Long l, Number number) {
        this.f34275b = l.toString();
        this.f34276c = number.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6077b.class != obj.getClass()) {
            return false;
        }
        C6077b c6077b = (C6077b) obj;
        return AbstractC6003a.m21747f(this.f34274a, c6077b.f34274a) && this.f34275b.equals(c6077b.f34275b) && this.f34276c == c6077b.f34276c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34274a, this.f34275b, Double.valueOf(this.f34276c)});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("value").mo13825r(iLogger, Double.valueOf(this.f34276c));
        interfaceC5749A0.mo13828u("elapsed_since_start_ns").mo13825r(iLogger, this.f34275b);
        ConcurrentHashMap concurrentHashMap = this.f34274a;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34274a, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
