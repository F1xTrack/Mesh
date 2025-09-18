package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class n implements InterfaceC5141l0 {
    public String a;
    public String b;
    public String c;
    public Object d;
    public String e;
    public ConcurrentHashMap f;
    public ConcurrentHashMap g;
    public Long h;
    public ConcurrentHashMap i;
    public String j;
    public String k;
    public ConcurrentHashMap l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return io.sentry.config.a.f(this.a, nVar.a) && io.sentry.config.a.f(this.b, nVar.b) && io.sentry.config.a.f(this.c, nVar.c) && io.sentry.config.a.f(this.e, nVar.e) && io.sentry.config.a.f(this.f, nVar.f) && io.sentry.config.a.f(this.g, nVar.g) && io.sentry.config.a.f(this.h, nVar.h) && io.sentry.config.a.f(this.j, nVar.j) && io.sentry.config.a.f(this.k, nVar.k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.f, this.g, this.h, this.j, this.k});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("url").d(this.a);
        }
        if (this.b != null) {
            a0.u("method").d(this.b);
        }
        if (this.c != null) {
            a0.u("query_string").d(this.c);
        }
        if (this.d != null) {
            a0.u("data").r(iLogger, this.d);
        }
        if (this.e != null) {
            a0.u("cookies").d(this.e);
        }
        if (this.f != null) {
            a0.u("headers").r(iLogger, this.f);
        }
        if (this.g != null) {
            a0.u("env").r(iLogger, this.g);
        }
        if (this.i != null) {
            a0.u("other").r(iLogger, this.i);
        }
        if (this.j != null) {
            a0.u("fragment").r(iLogger, this.j);
        }
        if (this.h != null) {
            a0.u("body_size").r(iLogger, this.h);
        }
        if (this.k != null) {
            a0.u("api_target").r(iLogger, this.k);
        }
        ConcurrentHashMap concurrentHashMap = this.l;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.l, str, a0, str, iLogger);
            }
        }
        a0.j();
    }
}
