package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.a */
/* loaded from: classes2.dex */
public final class C5155a implements InterfaceC5141l0 {
    public String a;
    public Date b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public AbstractMap h;
    public List i;
    public String j;
    public Boolean k;
    public ConcurrentHashMap l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5155a.class != obj.getClass()) {
            return false;
        }
        C5155a c5155a = (C5155a) obj;
        return io.sentry.config.a.f(this.a, c5155a.a) && io.sentry.config.a.f(this.b, c5155a.b) && io.sentry.config.a.f(this.c, c5155a.c) && io.sentry.config.a.f(this.d, c5155a.d) && io.sentry.config.a.f(this.e, c5155a.e) && io.sentry.config.a.f(this.f, c5155a.f) && io.sentry.config.a.f(this.g, c5155a.g) && io.sentry.config.a.f(this.h, c5155a.h) && io.sentry.config.a.f(this.k, c5155a.k) && io.sentry.config.a.f(this.i, c5155a.i) && io.sentry.config.a.f(this.j, c5155a.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.k, this.i, this.j});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("app_identifier").d(this.a);
        }
        if (this.b != null) {
            a0.u("app_start_time").r(iLogger, this.b);
        }
        if (this.c != null) {
            a0.u("device_app_hash").d(this.c);
        }
        if (this.d != null) {
            a0.u("build_type").d(this.d);
        }
        if (this.e != null) {
            a0.u("app_name").d(this.e);
        }
        if (this.f != null) {
            a0.u("app_version").d(this.f);
        }
        if (this.g != null) {
            a0.u("app_build").d(this.g);
        }
        AbstractMap abstractMap = this.h;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            a0.u("permissions").r(iLogger, this.h);
        }
        if (this.k != null) {
            a0.u("in_foreground").s(this.k);
        }
        if (this.i != null) {
            a0.u("view_names").r(iLogger, this.i);
        }
        if (this.j != null) {
            a0.u("start_type").d(this.j);
        }
        ConcurrentHashMap concurrentHashMap = this.l;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                a0.u(str).r(iLogger, this.l.get(str));
            }
        }
        a0.j();
    }
}
