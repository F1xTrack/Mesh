package io.sentry.clientreport;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class e implements InterfaceC5141l0 {
    public final String a;
    public final String b;
    public final Long c;
    public HashMap d;

    public e(String str, String str2, Long l) {
        this.a = str;
        this.b = str2;
        this.c = l;
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("reason").d(this.a);
        a0.u("category").d(this.b);
        a0.u("quantity").m(this.c);
        HashMap map = this.d;
        if (map != null) {
            for (String str : map.keySet()) {
                a0.u(str).r(iLogger, this.d.get(str));
            }
        }
        a0.j();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.a + "', category='" + this.b + "', quantity=" + this.c + '}';
    }
}
