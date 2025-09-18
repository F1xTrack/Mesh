package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class l implements InterfaceC5141l0 {
    public double a;
    public double b;
    public double c;
    public int d;
    public ConcurrentHashMap e;

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("min").c(this.a);
        a0.u("max").c(this.b);
        a0.u("sum").c(this.c);
        a0.u("count").b(this.d);
        if (this.e != null) {
            a0.u("tags");
            a0.r(iLogger, this.e);
        }
        a0.j();
    }
}
