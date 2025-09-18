package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class i implements InterfaceC5141l0 {
    public final Number a;
    public final String b;
    public ConcurrentHashMap c;

    public i(Number number, String str) {
        this.a = number;
        this.b = str;
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("value").m(this.a);
        String str = this.b;
        if (str != null) {
            a0.u("unit").d(str);
        }
        ConcurrentHashMap concurrentHashMap = this.c;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.c, str2, a0, str2, iLogger);
            }
        }
        a0.j();
    }
}
