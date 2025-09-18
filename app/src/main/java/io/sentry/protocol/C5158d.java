package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.HashMap;
import java.util.List;

/* renamed from: io.sentry.protocol.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5158d implements InterfaceC5141l0 {
    public q a;
    public List b;
    public HashMap c;

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("sdk_info").r(iLogger, this.a);
        }
        if (this.b != null) {
            a0.u("images").r(iLogger, this.b);
        }
        HashMap map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                a0.u(str).r(iLogger, this.c.get(str));
            }
        }
        a0.j();
    }
}
