package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.HashMap;

/* renamed from: io.sentry.rrweb.k */
/* loaded from: classes2.dex */
public final class C6140k extends AbstractC6131b implements InterfaceC6058l0 {

    /* renamed from: c */
    public String f34584c;

    /* renamed from: d */
    public HashMap f34585d;

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("type").mo13825r(iLogger, this.f34560a);
        interfaceC5749A0.mo13828u("timestamp").mo13809b(this.f34561b);
        interfaceC5749A0.mo13828u("data");
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("tag").mo13811d(this.f34584c);
        interfaceC5749A0.mo13828u("payload");
        interfaceC5749A0.mo13824q();
        HashMap map = this.f34585d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                interfaceC5749A0.mo13828u(str);
                interfaceC5749A0.mo13825r(iLogger, obj);
            }
        }
        interfaceC5749A0.mo13817j();
        interfaceC5749A0.mo13817j();
        interfaceC5749A0.mo13817j();
    }
}
