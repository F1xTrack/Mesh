package io.sentry.protocol;

import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.g */
/* loaded from: classes2.dex */
public final class C6091g implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f34366a;

    /* renamed from: b */
    public String f34367b;

    /* renamed from: c */
    public String f34368c;

    /* renamed from: d */
    public ConcurrentHashMap f34369d;

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34366a != null) {
            interfaceC5749A0.mo13828u("city").mo13811d(this.f34366a);
        }
        if (this.f34367b != null) {
            interfaceC5749A0.mo13828u("country_code").mo13811d(this.f34367b);
        }
        if (this.f34368c != null) {
            interfaceC5749A0.mo13828u("region").mo13811d(this.f34368c);
        }
        ConcurrentHashMap concurrentHashMap = this.f34369d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34369d, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
