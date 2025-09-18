package io.sentry.rrweb;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class k extends b implements InterfaceC5141l0 {
    public String c;
    public HashMap d;

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
        HashMap map = this.d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                a0.u(str);
                a0.r(iLogger, obj);
            }
        }
        a0.j();
        a0.j();
        a0.j();
    }
}
