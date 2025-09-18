package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class B implements InterfaceC5141l0 {
    public final String a;
    public ConcurrentHashMap b;

    public B(String str) {
        this.a = str;
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        String str = this.a;
        if (str != null) {
            a0.u("source").r(iLogger, str);
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.b, str2, a0, str2, iLogger);
            }
        }
        a0.j();
    }
}
