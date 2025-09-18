package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.HashMap;
import java.util.List;

/* renamed from: io.sentry.protocol.d */
/* loaded from: classes2.dex */
public final class C6088d implements InterfaceC6058l0 {

    /* renamed from: a */
    public C6101q f34328a;

    /* renamed from: b */
    public List f34329b;

    /* renamed from: c */
    public HashMap f34330c;

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34328a != null) {
            interfaceC5749A0.mo13828u("sdk_info").mo13825r(iLogger, this.f34328a);
        }
        if (this.f34329b != null) {
            interfaceC5749A0.mo13828u("images").mo13825r(iLogger, this.f34329b);
        }
        HashMap map = this.f34330c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5749A0.mo13828u(str).mo13825r(iLogger, this.f34330c.get(str));
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
