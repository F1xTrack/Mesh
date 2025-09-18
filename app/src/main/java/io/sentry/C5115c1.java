package io.sentry;

import java.util.Date;
import java.util.HashMap;

/* renamed from: io.sentry.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5115c1 implements InterfaceC5141l0 {
    public final io.sentry.protocol.t a;
    public final io.sentry.protocol.r b;
    public final Y1 c;
    public Date d;
    public HashMap e;

    public C5115c1(io.sentry.protocol.t tVar, io.sentry.protocol.r rVar, Y1 y1) {
        this.a = tVar;
        this.b = rVar;
        this.c = y1;
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        io.sentry.protocol.t tVar = this.a;
        if (tVar != null) {
            a0.u("event_id").r(iLogger, tVar);
        }
        io.sentry.protocol.r rVar = this.b;
        if (rVar != null) {
            a0.u("sdk").r(iLogger, rVar);
        }
        Y1 y1 = this.c;
        if (y1 != null) {
            a0.u("trace").r(iLogger, y1);
        }
        if (this.d != null) {
            a0.u("sent_at").r(iLogger, io.sentry.config.a.s(this.d));
        }
        HashMap map = this.e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.e.get(str);
                a0.u(str);
                a0.r(iLogger, obj);
            }
        }
        a0.j();
    }
}
