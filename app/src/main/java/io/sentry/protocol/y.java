package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class y implements InterfaceC5141l0 {
    public List a;
    public ConcurrentHashMap b;
    public Boolean c;
    public ConcurrentHashMap d;

    public y(List list) {
        this.a = list;
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("frames").r(iLogger, this.a);
        }
        if (this.b != null) {
            a0.u("registers").r(iLogger, this.b);
        }
        if (this.c != null) {
            a0.u("snapshot").s(this.c);
        }
        ConcurrentHashMap concurrentHashMap = this.d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.d, str, a0, str, iLogger);
            }
        }
        a0.j();
    }
}
