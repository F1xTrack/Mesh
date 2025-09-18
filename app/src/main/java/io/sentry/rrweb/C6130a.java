package io.sentry.rrweb;

import io.sentry.AbstractC6008d;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.rrweb.a */
/* loaded from: classes2.dex */
public final class C6130a extends AbstractC6131b implements InterfaceC6058l0 {

    /* renamed from: c */
    public String f34550c;

    /* renamed from: d */
    public double f34551d;

    /* renamed from: e */
    public String f34552e;

    /* renamed from: f */
    public String f34553f;

    /* renamed from: g */
    public String f34554g;

    /* renamed from: h */
    public EnumC6069n1 f34555h;

    /* renamed from: i */
    public ConcurrentHashMap f34556i;

    /* renamed from: j */
    public HashMap f34557j;

    /* renamed from: k */
    public ConcurrentHashMap f34558k;

    /* renamed from: l */
    public ConcurrentHashMap f34559l;

    public C6130a() {
        super(EnumC6132c.Custom);
        this.f34550c = "breadcrumb";
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("type").mo13825r(iLogger, this.f34560a);
        interfaceC5749A0.mo13828u("timestamp").mo13809b(this.f34561b);
        interfaceC5749A0.mo13828u("data");
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("tag").mo13811d(this.f34550c);
        interfaceC5749A0.mo13828u("payload");
        interfaceC5749A0.mo13824q();
        if (this.f34552e != null) {
            interfaceC5749A0.mo13828u("type").mo13811d(this.f34552e);
        }
        interfaceC5749A0.mo13828u("timestamp").mo13825r(iLogger, BigDecimal.valueOf(this.f34551d));
        if (this.f34553f != null) {
            interfaceC5749A0.mo13828u("category").mo13811d(this.f34553f);
        }
        if (this.f34554g != null) {
            interfaceC5749A0.mo13828u("message").mo13811d(this.f34554g);
        }
        if (this.f34555h != null) {
            interfaceC5749A0.mo13828u("level").mo13825r(iLogger, this.f34555h);
        }
        if (this.f34556i != null) {
            interfaceC5749A0.mo13828u("data").mo13825r(iLogger, this.f34556i);
        }
        ConcurrentHashMap concurrentHashMap = this.f34558k;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34558k, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
        ConcurrentHashMap concurrentHashMap2 = this.f34559l;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                AbstractC6008d.m21773c(this.f34559l, str2, interfaceC5749A0, str2, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
        HashMap map = this.f34557j;
        if (map != null) {
            for (String str3 : map.keySet()) {
                Object obj = this.f34557j.get(str3);
                interfaceC5749A0.mo13828u(str3);
                interfaceC5749A0.mo13825r(iLogger, obj);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
