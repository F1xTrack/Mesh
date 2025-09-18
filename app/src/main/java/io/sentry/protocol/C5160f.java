package io.sentry.protocol;

import com.huawei.hms.rn.push.constants.NotificationConstants;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5160f implements InterfaceC5141l0 {
    public String A;
    public String B;
    public String C;
    public String D;
    public Float E;
    public Integer F;
    public Double G;
    public String H;
    public ConcurrentHashMap I;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String[] g;
    public Float h;
    public Boolean i;
    public Boolean j;
    public EnumC5159e k;
    public Boolean l;
    public Long m;
    public Long n;
    public Long o;
    public Boolean p;
    public Long q;
    public Long r;
    public Long s;
    public Long t;
    public Integer u;
    public Integer v;
    public Float w;
    public Integer x;
    public Date y;
    public TimeZone z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5160f.class != obj.getClass()) {
            return false;
        }
        C5160f c5160f = (C5160f) obj;
        return io.sentry.config.a.f(this.a, c5160f.a) && io.sentry.config.a.f(this.b, c5160f.b) && io.sentry.config.a.f(this.c, c5160f.c) && io.sentry.config.a.f(this.d, c5160f.d) && io.sentry.config.a.f(this.e, c5160f.e) && io.sentry.config.a.f(this.f, c5160f.f) && Arrays.equals(this.g, c5160f.g) && io.sentry.config.a.f(this.h, c5160f.h) && io.sentry.config.a.f(this.i, c5160f.i) && io.sentry.config.a.f(this.j, c5160f.j) && this.k == c5160f.k && io.sentry.config.a.f(this.l, c5160f.l) && io.sentry.config.a.f(this.m, c5160f.m) && io.sentry.config.a.f(this.n, c5160f.n) && io.sentry.config.a.f(this.o, c5160f.o) && io.sentry.config.a.f(this.p, c5160f.p) && io.sentry.config.a.f(this.q, c5160f.q) && io.sentry.config.a.f(this.r, c5160f.r) && io.sentry.config.a.f(this.s, c5160f.s) && io.sentry.config.a.f(this.t, c5160f.t) && io.sentry.config.a.f(this.u, c5160f.u) && io.sentry.config.a.f(this.v, c5160f.v) && io.sentry.config.a.f(this.w, c5160f.w) && io.sentry.config.a.f(this.x, c5160f.x) && io.sentry.config.a.f(this.y, c5160f.y) && io.sentry.config.a.f(this.A, c5160f.A) && io.sentry.config.a.f(this.B, c5160f.B) && io.sentry.config.a.f(this.C, c5160f.C) && io.sentry.config.a.f(this.D, c5160f.D) && io.sentry.config.a.f(this.E, c5160f.E) && io.sentry.config.a.f(this.F, c5160f.F) && io.sentry.config.a.f(this.G, c5160f.G) && io.sentry.config.a.f(this.H, c5160f.H);
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H}) * 31) + Arrays.hashCode(this.g);
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("name").d(this.a);
        }
        if (this.b != null) {
            a0.u("manufacturer").d(this.b);
        }
        if (this.c != null) {
            a0.u("brand").d(this.c);
        }
        if (this.d != null) {
            a0.u("family").d(this.d);
        }
        if (this.e != null) {
            a0.u(CommonUrlParts.MODEL).d(this.e);
        }
        if (this.f != null) {
            a0.u("model_id").d(this.f);
        }
        if (this.g != null) {
            a0.u("archs").r(iLogger, this.g);
        }
        if (this.h != null) {
            a0.u("battery_level").m(this.h);
        }
        if (this.i != null) {
            a0.u("charging").s(this.i);
        }
        if (this.j != null) {
            a0.u("online").s(this.j);
        }
        if (this.k != null) {
            a0.u("orientation").r(iLogger, this.k);
        }
        if (this.l != null) {
            a0.u("simulator").s(this.l);
        }
        if (this.m != null) {
            a0.u("memory_size").m(this.m);
        }
        if (this.n != null) {
            a0.u("free_memory").m(this.n);
        }
        if (this.o != null) {
            a0.u("usable_memory").m(this.o);
        }
        if (this.p != null) {
            a0.u("low_memory").s(this.p);
        }
        if (this.q != null) {
            a0.u("storage_size").m(this.q);
        }
        if (this.r != null) {
            a0.u("free_storage").m(this.r);
        }
        if (this.s != null) {
            a0.u("external_storage_size").m(this.s);
        }
        if (this.t != null) {
            a0.u("external_free_storage").m(this.t);
        }
        if (this.u != null) {
            a0.u("screen_width_pixels").m(this.u);
        }
        if (this.v != null) {
            a0.u("screen_height_pixels").m(this.v);
        }
        if (this.w != null) {
            a0.u("screen_density").m(this.w);
        }
        if (this.x != null) {
            a0.u(CommonUrlParts.SCREEN_DPI).m(this.x);
        }
        if (this.y != null) {
            a0.u("boot_time").r(iLogger, this.y);
        }
        if (this.z != null) {
            a0.u(AnalyticsBaseParamsConstantsKt.TIMEZONE).r(iLogger, this.z);
        }
        if (this.A != null) {
            a0.u(NotificationConstants.ID).d(this.A);
        }
        if (this.B != null) {
            a0.u("language").d(this.B);
        }
        if (this.D != null) {
            a0.u("connection_type").d(this.D);
        }
        if (this.E != null) {
            a0.u("battery_temperature").m(this.E);
        }
        if (this.C != null) {
            a0.u(CommonUrlParts.LOCALE).d(this.C);
        }
        if (this.F != null) {
            a0.u("processor_count").m(this.F);
        }
        if (this.G != null) {
            a0.u("processor_frequency").m(this.G);
        }
        if (this.H != null) {
            a0.u("cpu_description").d(this.H);
        }
        ConcurrentHashMap concurrentHashMap = this.I;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                a0.u(str).r(iLogger, this.I.get(str));
            }
        }
        a0.j();
    }
}
