package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.l */
/* loaded from: classes2.dex */
public final class C6096l implements InterfaceC6058l0 {

    /* renamed from: a */
    public double f34395a;

    /* renamed from: b */
    public double f34396b;

    /* renamed from: c */
    public double f34397c;

    /* renamed from: d */
    public int f34398d;

    /* renamed from: e */
    public ConcurrentHashMap f34399e;

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("min").mo13810c(this.f34395a);
        interfaceC5749A0.mo13828u("max").mo13810c(this.f34396b);
        interfaceC5749A0.mo13828u("sum").mo13810c(this.f34397c);
        interfaceC5749A0.mo13828u("count").mo13809b(this.f34398d);
        if (this.f34399e != null) {
            interfaceC5749A0.mo13828u("tags");
            interfaceC5749A0.mo13825r(iLogger, this.f34399e);
        }
        interfaceC5749A0.mo13817j();
    }
}
