package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class F implements InterfaceC5141l0 {
    public final String a;
    public final List b;
    public HashMap c;

    public F(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        String str = this.a;
        if (str != null) {
            a0.u("rendering_system").d(str);
        }
        List list = this.b;
        if (list != null) {
            a0.u("windows").r(iLogger, list);
        }
        HashMap map = this.c;
        if (map != null) {
            for (String str2 : map.keySet()) {
                a0.u(str2).r(iLogger, this.c.get(str2));
            }
        }
        a0.j();
    }
}
