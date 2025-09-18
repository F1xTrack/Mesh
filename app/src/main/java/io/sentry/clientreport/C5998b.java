package io.sentry.clientreport;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.config.AbstractC6003a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: io.sentry.clientreport.b */
/* loaded from: classes2.dex */
public final class C5998b implements InterfaceC6058l0 {

    /* renamed from: a */
    public final Date f34113a;

    /* renamed from: b */
    public final ArrayList f34114b;

    /* renamed from: c */
    public HashMap f34115c;

    public C5998b(Date date, ArrayList arrayList) {
        this.f34113a = date;
        this.f34114b = arrayList;
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("timestamp").mo13811d(AbstractC6003a.m21759s(this.f34113a));
        interfaceC5749A0.mo13828u("discarded_events").mo13825r(iLogger, this.f34114b);
        HashMap map = this.f34115c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5749A0.mo13828u(str).mo13825r(iLogger, this.f34115c.get(str));
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
