package io.sentry.protocol;

import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.p */
/* loaded from: classes2.dex */
public final class C6100p implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f34419a;

    /* renamed from: b */
    public ConcurrentHashMap f34420b;

    /* renamed from: c */
    public Integer f34421c;

    /* renamed from: d */
    public Long f34422d;

    /* renamed from: e */
    public Object f34423e;

    /* renamed from: f */
    public ConcurrentHashMap f34424f;

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34419a != null) {
            interfaceC5749A0.mo13828u("cookies").mo13811d(this.f34419a);
        }
        if (this.f34420b != null) {
            interfaceC5749A0.mo13828u("headers").mo13825r(iLogger, this.f34420b);
        }
        if (this.f34421c != null) {
            interfaceC5749A0.mo13828u("status_code").mo13825r(iLogger, this.f34421c);
        }
        if (this.f34422d != null) {
            interfaceC5749A0.mo13828u("body_size").mo13825r(iLogger, this.f34422d);
        }
        if (this.f34423e != null) {
            interfaceC5749A0.mo13828u("data").mo13825r(iLogger, this.f34423e);
        }
        ConcurrentHashMap concurrentHashMap = this.f34424f;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34424f, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
