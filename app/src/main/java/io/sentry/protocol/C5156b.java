package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5156b implements InterfaceC5141l0 {
    public String a;
    public String b;
    public ConcurrentHashMap c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5156b.class != obj.getClass()) {
            return false;
        }
        C5156b c5156b = (C5156b) obj;
        return io.sentry.config.a.f(this.a, c5156b.a) && io.sentry.config.a.f(this.b, c5156b.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("name").d(this.a);
        }
        if (this.b != null) {
            a0.u("version").d(this.b);
        }
        ConcurrentHashMap concurrentHashMap = this.c;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.c, str, a0, str, iLogger);
            }
        }
        a0.j();
    }
}
