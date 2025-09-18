package io.sentry.protocol;

import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.B */
/* loaded from: classes2.dex */
public final class C6079B implements InterfaceC6058l0 {

    /* renamed from: a */
    public final String f34285a;

    /* renamed from: b */
    public ConcurrentHashMap f34286b;

    public C6079B(String str) {
        this.f34285a = str;
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        String str = this.f34285a;
        if (str != null) {
            interfaceC5749A0.mo13828u("source").mo13825r(iLogger, str);
        }
        ConcurrentHashMap concurrentHashMap = this.f34286b;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34286b, str2, interfaceC5749A0, str2, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
