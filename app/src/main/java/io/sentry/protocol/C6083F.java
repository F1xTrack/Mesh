package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.HashMap;
import java.util.List;

/* renamed from: io.sentry.protocol.F */
/* loaded from: classes2.dex */
public final class C6083F implements InterfaceC6058l0 {

    /* renamed from: a */
    public final String f34297a;

    /* renamed from: b */
    public final List f34298b;

    /* renamed from: c */
    public HashMap f34299c;

    public C6083F(String str, List list) {
        this.f34297a = str;
        this.f34298b = list;
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        String str = this.f34297a;
        if (str != null) {
            interfaceC5749A0.mo13828u("rendering_system").mo13811d(str);
        }
        List list = this.f34298b;
        if (list != null) {
            interfaceC5749A0.mo13828u("windows").mo13825r(iLogger, list);
        }
        HashMap map = this.f34299c;
        if (map != null) {
            for (String str2 : map.keySet()) {
                interfaceC5749A0.mo13828u(str2).mo13825r(iLogger, this.f34299c.get(str2));
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
