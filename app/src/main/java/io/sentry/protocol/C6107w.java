package io.sentry.protocol;

import io.sentry.AbstractC6008d;
import io.sentry.C5795P1;
import io.sentry.C5798Q1;
import io.sentry.C5803S1;
import io.sentry.EnumC5809U1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.config.AbstractC6003a;
import io.sentry.metrics.C6064b;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.w */
/* loaded from: classes2.dex */
public final class C6107w implements InterfaceC6058l0 {

    /* renamed from: a */
    public final Double f34451a;

    /* renamed from: b */
    public final Double f34452b;

    /* renamed from: c */
    public final C6104t f34453c;

    /* renamed from: d */
    public final C5803S1 f34454d;

    /* renamed from: e */
    public final C5803S1 f34455e;

    /* renamed from: f */
    public final String f34456f;

    /* renamed from: g */
    public final String f34457g;

    /* renamed from: h */
    public final EnumC5809U1 f34458h;

    /* renamed from: i */
    public final String f34459i;

    /* renamed from: j */
    public final Map f34460j;

    /* renamed from: k */
    public Map f34461k;

    /* renamed from: l */
    public final Map f34462l;

    /* renamed from: m */
    public final Map f34463m;

    /* renamed from: n */
    public ConcurrentHashMap f34464n;

    public C6107w(Double d, Double d2, C6104t c6104t, C5803S1 c5803s1, C5803S1 c5803s12, String str, String str2, EnumC5809U1 enumC5809U1, String str3, Map map, Map map2, Map map3, Map map4) {
        this.f34451a = d;
        this.f34452b = d2;
        this.f34453c = c6104t;
        this.f34454d = c5803s1;
        this.f34455e = c5803s12;
        this.f34456f = str;
        this.f34457g = str2;
        this.f34458h = enumC5809U1;
        this.f34459i = str3;
        this.f34460j = map;
        this.f34462l = map2;
        this.f34463m = map3;
        this.f34461k = map4;
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        InterfaceC5749A0 interfaceC5749A0Mo13828u = interfaceC5749A0.mo13828u("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.f34451a.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        interfaceC5749A0Mo13828u.mo13825r(iLogger, bigDecimalValueOf.setScale(6, roundingMode));
        Double d = this.f34452b;
        if (d != null) {
            interfaceC5749A0.mo13828u("timestamp").mo13825r(iLogger, BigDecimal.valueOf(d.doubleValue()).setScale(6, roundingMode));
        }
        interfaceC5749A0.mo13828u("trace_id").mo13825r(iLogger, this.f34453c);
        interfaceC5749A0.mo13828u("span_id").mo13825r(iLogger, this.f34454d);
        C5803S1 c5803s1 = this.f34455e;
        if (c5803s1 != null) {
            interfaceC5749A0.mo13828u("parent_span_id").mo13825r(iLogger, c5803s1);
        }
        interfaceC5749A0.mo13828u("op").mo13811d(this.f34456f);
        String str = this.f34457g;
        if (str != null) {
            interfaceC5749A0.mo13828u("description").mo13811d(str);
        }
        EnumC5809U1 enumC5809U1 = this.f34458h;
        if (enumC5809U1 != null) {
            interfaceC5749A0.mo13828u("status").mo13825r(iLogger, enumC5809U1);
        }
        String str2 = this.f34459i;
        if (str2 != null) {
            interfaceC5749A0.mo13828u("origin").mo13825r(iLogger, str2);
        }
        Map map = this.f34460j;
        if (!map.isEmpty()) {
            interfaceC5749A0.mo13828u("tags").mo13825r(iLogger, map);
        }
        if (this.f34461k != null) {
            interfaceC5749A0.mo13828u("data").mo13825r(iLogger, this.f34461k);
        }
        Map map2 = this.f34462l;
        if (!map2.isEmpty()) {
            interfaceC5749A0.mo13828u("measurements").mo13825r(iLogger, map2);
        }
        Map map3 = this.f34463m;
        if (map3 != null && !map3.isEmpty()) {
            interfaceC5749A0.mo13828u("_metrics_summary").mo13825r(iLogger, map3);
        }
        ConcurrentHashMap concurrentHashMap = this.f34464n;
        if (concurrentHashMap != null) {
            for (String str3 : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34464n, str3, interfaceC5749A0, str3, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }

    public C6107w(C5795P1 c5795p1) {
        ConcurrentHashMap concurrentHashMap = c5795p1.f33374j;
        C5798Q1 c5798q1 = c5795p1.f33367c;
        this.f34457g = c5798q1.f33384f;
        this.f34456f = c5798q1.f33383e;
        this.f34454d = c5798q1.f33380b;
        this.f34455e = c5798q1.f33381c;
        this.f34453c = c5798q1.f33379a;
        this.f34458h = c5798q1.f33385g;
        this.f34459i = c5798q1.f33387i;
        ConcurrentHashMap concurrentHashMapM21732A = AbstractC6003a.m21732A(c5798q1.f33386h);
        this.f34460j = concurrentHashMapM21732A == null ? new ConcurrentHashMap() : concurrentHashMapM21732A;
        ConcurrentHashMap concurrentHashMapM21732A2 = AbstractC6003a.m21732A(c5795p1.f33375k);
        this.f34462l = concurrentHashMapM21732A2 == null ? new ConcurrentHashMap() : concurrentHashMapM21732A2;
        this.f34452b = c5795p1.f33366b == null ? null : Double.valueOf(c5795p1.f33365a.mo21496c(r1) / 1.0E9d);
        this.f34451a = Double.valueOf(c5795p1.f33365a.mo21497d() / 1.0E9d);
        this.f34461k = concurrentHashMap;
        C6064b c6064b = (C6064b) c5795p1.f33376l.m21880a();
        if (c6064b != null) {
            this.f34463m = c6064b.m21839a();
        } else {
            this.f34463m = null;
        }
    }
}
