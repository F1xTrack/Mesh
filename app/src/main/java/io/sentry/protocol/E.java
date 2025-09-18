package io.sentry.protocol;

import com.google.android.gms.common.Scopes;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class E implements InterfaceC5141l0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public C5161g g;
    public ConcurrentHashMap h;
    public ConcurrentHashMap i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e = (E) obj;
        return io.sentry.config.a.f(this.a, e.a) && io.sentry.config.a.f(this.b, e.b) && io.sentry.config.a.f(this.c, e.c) && io.sentry.config.a.f(this.d, e.d) && io.sentry.config.a.f(this.e, e.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u(Scopes.EMAIL).d(this.a);
        }
        if (this.b != null) {
            a0.u(NotificationConstants.ID).d(this.b);
        }
        if (this.c != null) {
            a0.u("username").d(this.c);
        }
        if (this.d != null) {
            a0.u("segment").d(this.d);
        }
        if (this.e != null) {
            a0.u("ip_address").d(this.e);
        }
        if (this.f != null) {
            a0.u("name").d(this.f);
        }
        if (this.g != null) {
            a0.u("geo");
            this.g.serialize(a0, iLogger);
        }
        if (this.h != null) {
            a0.u("data").r(iLogger, this.h);
        }
        ConcurrentHashMap concurrentHashMap = this.i;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.i, str, a0, str, iLogger);
            }
        }
        a0.j();
    }
}
