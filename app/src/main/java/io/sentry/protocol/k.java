package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class k implements InterfaceC5141l0 {
    public String a;
    public String b;
    public List c;
    public ConcurrentHashMap d;

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("formatted").d(this.a);
        }
        if (this.b != null) {
            a0.u("message").d(this.b);
        }
        List list = this.c;
        if (list != null && !list.isEmpty()) {
            a0.u("params").r(iLogger, this.c);
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
