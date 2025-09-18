package io.sentry.protocol;

import com.huawei.hms.rn.push.constants.NotificationConstants;
import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class h implements InterfaceC5141l0 {
    public String a;
    public Integer b;
    public String c;
    public String d;
    public Integer e;
    public String f;
    public Boolean g;
    public String h;
    public String i;
    public ConcurrentHashMap j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return io.sentry.config.a.f(this.a, hVar.a) && io.sentry.config.a.f(this.b, hVar.b) && io.sentry.config.a.f(this.c, hVar.c) && io.sentry.config.a.f(this.d, hVar.d) && io.sentry.config.a.f(this.e, hVar.e) && io.sentry.config.a.f(this.f, hVar.f) && io.sentry.config.a.f(this.g, hVar.g) && io.sentry.config.a.f(this.h, hVar.h) && io.sentry.config.a.f(this.i, hVar.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("name").d(this.a);
        }
        if (this.b != null) {
            a0.u(NotificationConstants.ID).m(this.b);
        }
        if (this.c != null) {
            a0.u("vendor_id").d(this.c);
        }
        if (this.d != null) {
            a0.u("vendor_name").d(this.d);
        }
        if (this.e != null) {
            a0.u("memory_size").m(this.e);
        }
        if (this.f != null) {
            a0.u("api_type").d(this.f);
        }
        if (this.g != null) {
            a0.u("multi_threaded_rendering").s(this.g);
        }
        if (this.h != null) {
            a0.u("version").d(this.h);
        }
        if (this.i != null) {
            a0.u("npot_support").d(this.i);
        }
        ConcurrentHashMap concurrentHashMap = this.j;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.j, str, a0, str, iLogger);
            }
        }
        a0.j();
    }
}
