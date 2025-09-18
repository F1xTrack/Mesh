package io.sentry;

import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6104t;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.Q1 */
/* loaded from: classes2.dex */
public class C5798Q1 implements InterfaceC6058l0 {

    /* renamed from: a */
    public final C6104t f33379a;

    /* renamed from: b */
    public final C5803S1 f33380b;

    /* renamed from: c */
    public final C5803S1 f33381c;

    /* renamed from: d */
    public transient C5820Y0 f33382d;

    /* renamed from: e */
    public final String f33383e;

    /* renamed from: f */
    public String f33384f;

    /* renamed from: g */
    public EnumC5809U1 f33385g;

    /* renamed from: h */
    public ConcurrentHashMap f33386h;

    /* renamed from: i */
    public String f33387i;

    /* renamed from: j */
    public ConcurrentHashMap f33388j;

    public C5798Q1(C6104t c6104t, C5803S1 c5803s1, String str, C5803S1 c5803s12, C5820Y0 c5820y0) {
        this(c6104t, c5803s1, c5803s12, str, null, c5820y0, null, "manual");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5798Q1)) {
            return false;
        }
        C5798Q1 c5798q1 = (C5798Q1) obj;
        return this.f33379a.equals(c5798q1.f33379a) && this.f33380b.equals(c5798q1.f33380b) && AbstractC6003a.m21747f(this.f33381c, c5798q1.f33381c) && this.f33383e.equals(c5798q1.f33383e) && AbstractC6003a.m21747f(this.f33384f, c5798q1.f33384f) && this.f33385g == c5798q1.f33385g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33379a, this.f33380b, this.f33381c, this.f33383e, this.f33384f, this.f33385g});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("trace_id");
        this.f33379a.serialize(interfaceC5749A0, iLogger);
        interfaceC5749A0.mo13828u("span_id");
        interfaceC5749A0.mo13811d(this.f33380b.f33395a);
        C5803S1 c5803s1 = this.f33381c;
        if (c5803s1 != null) {
            interfaceC5749A0.mo13828u("parent_span_id");
            interfaceC5749A0.mo13811d(c5803s1.f33395a);
        }
        interfaceC5749A0.mo13828u("op").mo13811d(this.f33383e);
        if (this.f33384f != null) {
            interfaceC5749A0.mo13828u("description").mo13811d(this.f33384f);
        }
        if (this.f33385g != null) {
            interfaceC5749A0.mo13828u("status").mo13825r(iLogger, this.f33385g);
        }
        if (this.f33387i != null) {
            interfaceC5749A0.mo13828u("origin").mo13825r(iLogger, this.f33387i);
        }
        if (!this.f33386h.isEmpty()) {
            interfaceC5749A0.mo13828u("tags").mo13825r(iLogger, this.f33386h);
        }
        ConcurrentHashMap concurrentHashMap = this.f33388j;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                interfaceC5749A0.mo13828u(str).mo13825r(iLogger, this.f33388j.get(str));
            }
        }
        interfaceC5749A0.mo13817j();
    }

    public C5798Q1(C6104t c6104t, C5803S1 c5803s1, C5803S1 c5803s12, String str, String str2, C5820Y0 c5820y0, EnumC5809U1 enumC5809U1, String str3) {
        this.f33386h = new ConcurrentHashMap();
        this.f33387i = "manual";
        AbstractC6003a.m21735D(c6104t, "traceId is required");
        this.f33379a = c6104t;
        AbstractC6003a.m21735D(c5803s1, "spanId is required");
        this.f33380b = c5803s1;
        AbstractC6003a.m21735D(str, "operation is required");
        this.f33383e = str;
        this.f33381c = c5803s12;
        this.f33382d = c5820y0;
        this.f33384f = str2;
        this.f33385g = enumC5809U1;
        this.f33387i = str3;
    }

    public C5798Q1(C5798Q1 c5798q1) {
        this.f33386h = new ConcurrentHashMap();
        this.f33387i = "manual";
        this.f33379a = c5798q1.f33379a;
        this.f33380b = c5798q1.f33380b;
        this.f33381c = c5798q1.f33381c;
        this.f33382d = c5798q1.f33382d;
        this.f33383e = c5798q1.f33383e;
        this.f33384f = c5798q1.f33384f;
        this.f33385g = c5798q1.f33385g;
        ConcurrentHashMap concurrentHashMapM21732A = AbstractC6003a.m21732A(c5798q1.f33386h);
        if (concurrentHashMapM21732A != null) {
            this.f33386h = concurrentHashMapM21732A;
        }
    }
}
