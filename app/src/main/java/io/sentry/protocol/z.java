package io.sentry.protocol;

import com.huawei.hms.rn.push.constants.NotificationConstants;
import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class z implements InterfaceC5141l0 {
    public Long a;
    public Integer b;
    public String c;
    public String d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public y i;
    public Map j;
    public ConcurrentHashMap k;

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u(NotificationConstants.ID).m(this.a);
        }
        if (this.b != null) {
            a0.u("priority").m(this.b);
        }
        if (this.c != null) {
            a0.u("name").d(this.c);
        }
        if (this.d != null) {
            a0.u("state").d(this.d);
        }
        if (this.e != null) {
            a0.u("crashed").s(this.e);
        }
        if (this.f != null) {
            a0.u("current").s(this.f);
        }
        if (this.g != null) {
            a0.u("daemon").s(this.g);
        }
        if (this.h != null) {
            a0.u("main").s(this.h);
        }
        if (this.i != null) {
            a0.u("stacktrace").r(iLogger, this.i);
        }
        if (this.j != null) {
            a0.u("held_locks").r(iLogger, this.j);
        }
        ConcurrentHashMap concurrentHashMap = this.k;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.k, str, a0, str, iLogger);
            }
        }
        a0.j();
    }
}
