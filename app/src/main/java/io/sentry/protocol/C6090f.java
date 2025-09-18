package io.sentry.protocol;

import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.config.AbstractC6003a;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.f */
/* loaded from: classes2.dex */
public final class C6090f implements InterfaceC6058l0 {

    /* renamed from: A */
    public String f34331A;

    /* renamed from: B */
    public String f34332B;

    /* renamed from: C */
    public String f34333C;

    /* renamed from: D */
    public String f34334D;

    /* renamed from: E */
    public Float f34335E;

    /* renamed from: F */
    public Integer f34336F;

    /* renamed from: G */
    public Double f34337G;

    /* renamed from: H */
    public String f34338H;

    /* renamed from: I */
    public ConcurrentHashMap f34339I;

    /* renamed from: a */
    public String f34340a;

    /* renamed from: b */
    public String f34341b;

    /* renamed from: c */
    public String f34342c;

    /* renamed from: d */
    public String f34343d;

    /* renamed from: e */
    public String f34344e;

    /* renamed from: f */
    public String f34345f;

    /* renamed from: g */
    public String[] f34346g;

    /* renamed from: h */
    public Float f34347h;

    /* renamed from: i */
    public Boolean f34348i;

    /* renamed from: j */
    public Boolean f34349j;

    /* renamed from: k */
    public EnumC6089e f34350k;

    /* renamed from: l */
    public Boolean f34351l;

    /* renamed from: m */
    public Long f34352m;

    /* renamed from: n */
    public Long f34353n;

    /* renamed from: o */
    public Long f34354o;

    /* renamed from: p */
    public Boolean f34355p;

    /* renamed from: q */
    public Long f34356q;

    /* renamed from: r */
    public Long f34357r;

    /* renamed from: s */
    public Long f34358s;

    /* renamed from: t */
    public Long f34359t;

    /* renamed from: u */
    public Integer f34360u;

    /* renamed from: v */
    public Integer f34361v;

    /* renamed from: w */
    public Float f34362w;

    /* renamed from: x */
    public Integer f34363x;

    /* renamed from: y */
    public Date f34364y;

    /* renamed from: z */
    public TimeZone f34365z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6090f.class != obj.getClass()) {
            return false;
        }
        C6090f c6090f = (C6090f) obj;
        return AbstractC6003a.m21747f(this.f34340a, c6090f.f34340a) && AbstractC6003a.m21747f(this.f34341b, c6090f.f34341b) && AbstractC6003a.m21747f(this.f34342c, c6090f.f34342c) && AbstractC6003a.m21747f(this.f34343d, c6090f.f34343d) && AbstractC6003a.m21747f(this.f34344e, c6090f.f34344e) && AbstractC6003a.m21747f(this.f34345f, c6090f.f34345f) && Arrays.equals(this.f34346g, c6090f.f34346g) && AbstractC6003a.m21747f(this.f34347h, c6090f.f34347h) && AbstractC6003a.m21747f(this.f34348i, c6090f.f34348i) && AbstractC6003a.m21747f(this.f34349j, c6090f.f34349j) && this.f34350k == c6090f.f34350k && AbstractC6003a.m21747f(this.f34351l, c6090f.f34351l) && AbstractC6003a.m21747f(this.f34352m, c6090f.f34352m) && AbstractC6003a.m21747f(this.f34353n, c6090f.f34353n) && AbstractC6003a.m21747f(this.f34354o, c6090f.f34354o) && AbstractC6003a.m21747f(this.f34355p, c6090f.f34355p) && AbstractC6003a.m21747f(this.f34356q, c6090f.f34356q) && AbstractC6003a.m21747f(this.f34357r, c6090f.f34357r) && AbstractC6003a.m21747f(this.f34358s, c6090f.f34358s) && AbstractC6003a.m21747f(this.f34359t, c6090f.f34359t) && AbstractC6003a.m21747f(this.f34360u, c6090f.f34360u) && AbstractC6003a.m21747f(this.f34361v, c6090f.f34361v) && AbstractC6003a.m21747f(this.f34362w, c6090f.f34362w) && AbstractC6003a.m21747f(this.f34363x, c6090f.f34363x) && AbstractC6003a.m21747f(this.f34364y, c6090f.f34364y) && AbstractC6003a.m21747f(this.f34331A, c6090f.f34331A) && AbstractC6003a.m21747f(this.f34332B, c6090f.f34332B) && AbstractC6003a.m21747f(this.f34333C, c6090f.f34333C) && AbstractC6003a.m21747f(this.f34334D, c6090f.f34334D) && AbstractC6003a.m21747f(this.f34335E, c6090f.f34335E) && AbstractC6003a.m21747f(this.f34336F, c6090f.f34336F) && AbstractC6003a.m21747f(this.f34337G, c6090f.f34337G) && AbstractC6003a.m21747f(this.f34338H, c6090f.f34338H);
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.f34340a, this.f34341b, this.f34342c, this.f34343d, this.f34344e, this.f34345f, this.f34347h, this.f34348i, this.f34349j, this.f34350k, this.f34351l, this.f34352m, this.f34353n, this.f34354o, this.f34355p, this.f34356q, this.f34357r, this.f34358s, this.f34359t, this.f34360u, this.f34361v, this.f34362w, this.f34363x, this.f34364y, this.f34365z, this.f34331A, this.f34332B, this.f34333C, this.f34334D, this.f34335E, this.f34336F, this.f34337G, this.f34338H}) * 31) + Arrays.hashCode(this.f34346g);
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34340a != null) {
            interfaceC5749A0.mo13828u("name").mo13811d(this.f34340a);
        }
        if (this.f34341b != null) {
            interfaceC5749A0.mo13828u("manufacturer").mo13811d(this.f34341b);
        }
        if (this.f34342c != null) {
            interfaceC5749A0.mo13828u("brand").mo13811d(this.f34342c);
        }
        if (this.f34343d != null) {
            interfaceC5749A0.mo13828u("family").mo13811d(this.f34343d);
        }
        if (this.f34344e != null) {
            interfaceC5749A0.mo13828u(CommonUrlParts.MODEL).mo13811d(this.f34344e);
        }
        if (this.f34345f != null) {
            interfaceC5749A0.mo13828u("model_id").mo13811d(this.f34345f);
        }
        if (this.f34346g != null) {
            interfaceC5749A0.mo13828u("archs").mo13825r(iLogger, this.f34346g);
        }
        if (this.f34347h != null) {
            interfaceC5749A0.mo13828u("battery_level").mo13820m(this.f34347h);
        }
        if (this.f34348i != null) {
            interfaceC5749A0.mo13828u("charging").mo13826s(this.f34348i);
        }
        if (this.f34349j != null) {
            interfaceC5749A0.mo13828u("online").mo13826s(this.f34349j);
        }
        if (this.f34350k != null) {
            interfaceC5749A0.mo13828u("orientation").mo13825r(iLogger, this.f34350k);
        }
        if (this.f34351l != null) {
            interfaceC5749A0.mo13828u("simulator").mo13826s(this.f34351l);
        }
        if (this.f34352m != null) {
            interfaceC5749A0.mo13828u("memory_size").mo13820m(this.f34352m);
        }
        if (this.f34353n != null) {
            interfaceC5749A0.mo13828u("free_memory").mo13820m(this.f34353n);
        }
        if (this.f34354o != null) {
            interfaceC5749A0.mo13828u("usable_memory").mo13820m(this.f34354o);
        }
        if (this.f34355p != null) {
            interfaceC5749A0.mo13828u("low_memory").mo13826s(this.f34355p);
        }
        if (this.f34356q != null) {
            interfaceC5749A0.mo13828u("storage_size").mo13820m(this.f34356q);
        }
        if (this.f34357r != null) {
            interfaceC5749A0.mo13828u("free_storage").mo13820m(this.f34357r);
        }
        if (this.f34358s != null) {
            interfaceC5749A0.mo13828u("external_storage_size").mo13820m(this.f34358s);
        }
        if (this.f34359t != null) {
            interfaceC5749A0.mo13828u("external_free_storage").mo13820m(this.f34359t);
        }
        if (this.f34360u != null) {
            interfaceC5749A0.mo13828u("screen_width_pixels").mo13820m(this.f34360u);
        }
        if (this.f34361v != null) {
            interfaceC5749A0.mo13828u("screen_height_pixels").mo13820m(this.f34361v);
        }
        if (this.f34362w != null) {
            interfaceC5749A0.mo13828u("screen_density").mo13820m(this.f34362w);
        }
        if (this.f34363x != null) {
            interfaceC5749A0.mo13828u(CommonUrlParts.SCREEN_DPI).mo13820m(this.f34363x);
        }
        if (this.f34364y != null) {
            interfaceC5749A0.mo13828u("boot_time").mo13825r(iLogger, this.f34364y);
        }
        if (this.f34365z != null) {
            interfaceC5749A0.mo13828u(AnalyticsBaseParamsConstantsKt.TIMEZONE).mo13825r(iLogger, this.f34365z);
        }
        if (this.f34331A != null) {
            interfaceC5749A0.mo13828u(NotificationConstants.f19487ID).mo13811d(this.f34331A);
        }
        if (this.f34332B != null) {
            interfaceC5749A0.mo13828u("language").mo13811d(this.f34332B);
        }
        if (this.f34334D != null) {
            interfaceC5749A0.mo13828u("connection_type").mo13811d(this.f34334D);
        }
        if (this.f34335E != null) {
            interfaceC5749A0.mo13828u("battery_temperature").mo13820m(this.f34335E);
        }
        if (this.f34333C != null) {
            interfaceC5749A0.mo13828u(CommonUrlParts.LOCALE).mo13811d(this.f34333C);
        }
        if (this.f34336F != null) {
            interfaceC5749A0.mo13828u("processor_count").mo13820m(this.f34336F);
        }
        if (this.f34337G != null) {
            interfaceC5749A0.mo13828u("processor_frequency").mo13820m(this.f34337G);
        }
        if (this.f34338H != null) {
            interfaceC5749A0.mo13828u("cpu_description").mo13811d(this.f34338H);
        }
        ConcurrentHashMap concurrentHashMap = this.f34339I;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                interfaceC5749A0.mo13828u(str).mo13825r(iLogger, this.f34339I.get(str));
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
