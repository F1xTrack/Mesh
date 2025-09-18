package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class m implements InterfaceC5141l0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Boolean f;
    public ConcurrentHashMap g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return io.sentry.config.a.f(this.a, mVar.a) && io.sentry.config.a.f(this.b, mVar.b) && io.sentry.config.a.f(this.c, mVar.c) && io.sentry.config.a.f(this.d, mVar.d) && io.sentry.config.a.f(this.e, mVar.e) && io.sentry.config.a.f(this.f, mVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("name").d(this.a);
        }
        if (this.b != null) {
            a0.u("version").d(this.b);
        }
        if (this.c != null) {
            a0.u("raw_description").d(this.c);
        }
        if (this.d != null) {
            a0.u("build").d(this.d);
        }
        if (this.e != null) {
            a0.u("kernel_version").d(this.e);
        }
        if (this.f != null) {
            a0.u("rooted").s(this.f);
        }
        ConcurrentHashMap concurrentHashMap = this.g;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.g, str, a0, str, iLogger);
            }
        }
        a0.j();
    }
}
