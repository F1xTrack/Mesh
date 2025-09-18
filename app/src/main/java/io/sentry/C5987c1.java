package io.sentry;

import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6102r;
import io.sentry.protocol.C6104t;
import java.util.Date;
import java.util.HashMap;

/* renamed from: io.sentry.c1 */
/* loaded from: classes2.dex */
public final class C5987c1 implements InterfaceC6058l0 {

    /* renamed from: a */
    public final C6104t f34090a;

    /* renamed from: b */
    public final C6102r f34091b;

    /* renamed from: c */
    public final C5821Y1 f34092c;

    /* renamed from: d */
    public Date f34093d;

    /* renamed from: e */
    public HashMap f34094e;

    public C5987c1(C6104t c6104t, C6102r c6102r, C5821Y1 c5821y1) {
        this.f34090a = c6104t;
        this.f34091b = c6102r;
        this.f34092c = c5821y1;
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        C6104t c6104t = this.f34090a;
        if (c6104t != null) {
            interfaceC5749A0.mo13828u("event_id").mo13825r(iLogger, c6104t);
        }
        C6102r c6102r = this.f34091b;
        if (c6102r != null) {
            interfaceC5749A0.mo13828u("sdk").mo13825r(iLogger, c6102r);
        }
        C5821Y1 c5821y1 = this.f34092c;
        if (c5821y1 != null) {
            interfaceC5749A0.mo13828u("trace").mo13825r(iLogger, c5821y1);
        }
        if (this.f34093d != null) {
            interfaceC5749A0.mo13828u("sent_at").mo13825r(iLogger, AbstractC6003a.m21759s(this.f34093d));
        }
        HashMap map = this.f34094e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f34094e.get(str);
                interfaceC5749A0.mo13828u(str);
                interfaceC5749A0.mo13825r(iLogger, obj);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
