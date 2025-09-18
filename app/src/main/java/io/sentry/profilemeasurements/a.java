package io.sentry.profilemeasurements;

import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class a implements InterfaceC5141l0 {
    public ConcurrentHashMap a;
    public String b;
    public Collection c;

    public a(String str, AbstractCollection abstractCollection) {
        this.b = str;
        this.c = abstractCollection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return io.sentry.config.a.f(this.a, aVar.a) && this.b.equals(aVar.b) && new ArrayList(this.c).equals(new ArrayList(aVar.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("unit").r(iLogger, this.b);
        a0.u("values").r(iLogger, this.c);
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.a, str, a0, str, iLogger);
            }
        }
        a0.j();
    }
}
