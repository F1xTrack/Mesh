package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class q implements InterfaceC5141l0 {
    public String a;
    public Integer b;
    public Integer c;
    public Integer d;
    public HashMap e;

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("sdk_name").d(this.a);
        }
        if (this.b != null) {
            a0.u("version_major").m(this.b);
        }
        if (this.c != null) {
            a0.u("version_minor").m(this.c);
        }
        if (this.d != null) {
            a0.u("version_patchlevel").m(this.d);
        }
        HashMap map = this.e;
        if (map != null) {
            for (String str : map.keySet()) {
                a0.u(str).r(iLogger, this.e.get(str));
            }
        }
        a0.j();
    }
}
