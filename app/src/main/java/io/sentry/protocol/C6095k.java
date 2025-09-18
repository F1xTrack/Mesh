package io.sentry.protocol;

import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.k */
/* loaded from: classes2.dex */
public final class C6095k implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f34391a;

    /* renamed from: b */
    public String f34392b;

    /* renamed from: c */
    public List f34393c;

    /* renamed from: d */
    public ConcurrentHashMap f34394d;

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34391a != null) {
            interfaceC5749A0.mo13828u("formatted").mo13811d(this.f34391a);
        }
        if (this.f34392b != null) {
            interfaceC5749A0.mo13828u("message").mo13811d(this.f34392b);
        }
        List list = this.f34393c;
        if (list != null && !list.isEmpty()) {
            interfaceC5749A0.mo13828u("params").mo13825r(iLogger, this.f34393c);
        }
        ConcurrentHashMap concurrentHashMap = this.f34394d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34394d, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
