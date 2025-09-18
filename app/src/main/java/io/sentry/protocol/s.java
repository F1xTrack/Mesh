package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class s implements InterfaceC5141l0 {
    public String a;
    public String b;
    public String c;
    public Long d;
    public y e;
    public j f;
    public HashMap g;

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("type").d(this.a);
        }
        if (this.b != null) {
            a0.u("value").d(this.b);
        }
        if (this.c != null) {
            a0.u("module").d(this.c);
        }
        if (this.d != null) {
            a0.u(CrashHianalyticsData.THREAD_ID).m(this.d);
        }
        if (this.e != null) {
            a0.u("stacktrace").r(iLogger, this.e);
        }
        if (this.f != null) {
            a0.u("mechanism").r(iLogger, this.f);
        }
        HashMap map = this.g;
        if (map != null) {
            for (String str : map.keySet()) {
                a0.u(str).r(iLogger, this.g.get(str));
            }
        }
        a0.j();
    }
}
