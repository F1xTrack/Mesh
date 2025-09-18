package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5161g implements InterfaceC5141l0 {
    public String a;
    public String b;
    public String c;
    public ConcurrentHashMap d;

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("city").d(this.a);
        }
        if (this.b != null) {
            a0.u("country_code").d(this.b);
        }
        if (this.c != null) {
            a0.u("region").d(this.c);
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
