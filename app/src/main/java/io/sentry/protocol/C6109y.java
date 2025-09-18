package io.sentry.protocol;

import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.y */
/* loaded from: classes2.dex */
public final class C6109y implements InterfaceC6058l0 {

    /* renamed from: a */
    public List f34483a;

    /* renamed from: b */
    public ConcurrentHashMap f34484b;

    /* renamed from: c */
    public Boolean f34485c;

    /* renamed from: d */
    public ConcurrentHashMap f34486d;

    public C6109y(List list) {
        this.f34483a = list;
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34483a != null) {
            interfaceC5749A0.mo13828u("frames").mo13825r(iLogger, this.f34483a);
        }
        if (this.f34484b != null) {
            interfaceC5749A0.mo13828u("registers").mo13825r(iLogger, this.f34484b);
        }
        if (this.f34485c != null) {
            interfaceC5749A0.mo13828u("snapshot").mo13826s(this.f34485c);
        }
        ConcurrentHashMap concurrentHashMap = this.f34486d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34486d, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
