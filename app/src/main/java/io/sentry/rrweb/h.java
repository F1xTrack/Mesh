package io.sentry.rrweb;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class h implements InterfaceC5141l0 {
    public int a;
    public float b;
    public float c;
    public long d;
    public HashMap e;

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u(NotificationConstants.ID).b(this.a);
        a0.u("x").c(this.b);
        a0.u("y").c(this.c);
        a0.u("timeOffset").b(this.d);
        HashMap map = this.e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.e.get(str);
                a0.u(str);
                a0.r(iLogger, obj);
            }
        }
        a0.j();
    }
}
