package io.sentry.clientreport;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class b implements InterfaceC5141l0 {
    public final Date a;
    public final ArrayList b;
    public HashMap c;

    public b(Date date, ArrayList arrayList) {
        this.a = date;
        this.b = arrayList;
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("timestamp").d(io.sentry.config.a.s(this.a));
        a0.u("discarded_events").r(iLogger, this.b);
        HashMap map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                a0.u(str).r(iLogger, this.c.get(str));
            }
        }
        a0.j();
    }
}
