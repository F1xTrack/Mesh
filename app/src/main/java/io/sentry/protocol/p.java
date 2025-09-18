package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class p implements InterfaceC5141l0 {
    public String a;
    public ConcurrentHashMap b;
    public Integer c;
    public Long d;
    public Object e;
    public ConcurrentHashMap f;

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("cookies").d(this.a);
        }
        if (this.b != null) {
            a0.u("headers").r(iLogger, this.b);
        }
        if (this.c != null) {
            a0.u("status_code").r(iLogger, this.c);
        }
        if (this.d != null) {
            a0.u("body_size").r(iLogger, this.d);
        }
        if (this.e != null) {
            a0.u("data").r(iLogger, this.e);
        }
        ConcurrentHashMap concurrentHashMap = this.f;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.f, str, a0, str, iLogger);
            }
        }
        a0.j();
    }
}
