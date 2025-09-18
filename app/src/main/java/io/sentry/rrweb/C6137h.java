package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.HashMap;

/* renamed from: io.sentry.rrweb.h */
/* loaded from: classes2.dex */
public final class C6137h implements InterfaceC6058l0 {

    /* renamed from: a */
    public int f34571a;

    /* renamed from: b */
    public float f34572b;

    /* renamed from: c */
    public float f34573c;

    /* renamed from: d */
    public long f34574d;

    /* renamed from: e */
    public HashMap f34575e;

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u(NotificationConstants.f19487ID).mo13809b(this.f34571a);
        interfaceC5749A0.mo13828u("x").mo13810c(this.f34572b);
        interfaceC5749A0.mo13828u("y").mo13810c(this.f34573c);
        interfaceC5749A0.mo13828u("timeOffset").mo13809b(this.f34574d);
        HashMap map = this.f34575e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f34575e.get(str);
                interfaceC5749A0.mo13828u(str);
                interfaceC5749A0.mo13825r(iLogger, obj);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
