package io.sentry.protocol;

import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.config.AbstractC6003a;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.b */
/* loaded from: classes2.dex */
public final class C6086b implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f34324a;

    /* renamed from: b */
    public String f34325b;

    /* renamed from: c */
    public ConcurrentHashMap f34326c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6086b.class != obj.getClass()) {
            return false;
        }
        C6086b c6086b = (C6086b) obj;
        return AbstractC6003a.m21747f(this.f34324a, c6086b.f34324a) && AbstractC6003a.m21747f(this.f34325b, c6086b.f34325b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34324a, this.f34325b});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34324a != null) {
            interfaceC5749A0.mo13828u("name").mo13811d(this.f34324a);
        }
        if (this.f34325b != null) {
            interfaceC5749A0.mo13828u("version").mo13811d(this.f34325b);
        }
        ConcurrentHashMap concurrentHashMap = this.f34326c;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34326c, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
