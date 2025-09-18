package io.sentry.protocol;

import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.v */
/* loaded from: classes2.dex */
public final class C6106v implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f34447a;

    /* renamed from: b */
    public String f34448b;

    /* renamed from: c */
    public String f34449c;

    /* renamed from: d */
    public ConcurrentHashMap f34450d;

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34447a != null) {
            interfaceC5749A0.mo13828u("name").mo13811d(this.f34447a);
        }
        if (this.f34448b != null) {
            interfaceC5749A0.mo13828u("version").mo13811d(this.f34448b);
        }
        if (this.f34449c != null) {
            interfaceC5749A0.mo13828u("raw_description").mo13811d(this.f34449c);
        }
        ConcurrentHashMap concurrentHashMap = this.f34450d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34450d, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
