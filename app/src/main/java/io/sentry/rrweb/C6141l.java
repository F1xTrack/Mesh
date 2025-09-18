package io.sentry.rrweb;

import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.rrweb.l */
/* loaded from: classes2.dex */
public final class C6141l extends AbstractC6131b implements InterfaceC6058l0 {

    /* renamed from: c */
    public String f34586c;

    /* renamed from: d */
    public String f34587d;

    /* renamed from: e */
    public String f34588e;

    /* renamed from: f */
    public double f34589f;

    /* renamed from: g */
    public double f34590g;

    /* renamed from: h */
    public ConcurrentHashMap f34591h;

    /* renamed from: i */
    public HashMap f34592i;

    /* renamed from: j */
    public ConcurrentHashMap f34593j;

    /* renamed from: k */
    public ConcurrentHashMap f34594k;

    public C6141l() {
        super(EnumC6132c.Custom);
        this.f34586c = "performanceSpan";
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("type").mo13825r(iLogger, this.f34560a);
        interfaceC5749A0.mo13828u("timestamp").mo13809b(this.f34561b);
        interfaceC5749A0.mo13828u("data");
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("tag").mo13811d(this.f34586c);
        interfaceC5749A0.mo13828u("payload");
        interfaceC5749A0.mo13824q();
        if (this.f34587d != null) {
            interfaceC5749A0.mo13828u("op").mo13811d(this.f34587d);
        }
        if (this.f34588e != null) {
            interfaceC5749A0.mo13828u("description").mo13811d(this.f34588e);
        }
        interfaceC5749A0.mo13828u("startTimestamp").mo13825r(iLogger, BigDecimal.valueOf(this.f34589f));
        interfaceC5749A0.mo13828u("endTimestamp").mo13825r(iLogger, BigDecimal.valueOf(this.f34590g));
        if (this.f34591h != null) {
            interfaceC5749A0.mo13828u("data").mo13825r(iLogger, this.f34591h);
        }
        ConcurrentHashMap concurrentHashMap = this.f34593j;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34593j, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
        ConcurrentHashMap concurrentHashMap2 = this.f34594k;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                AbstractC6008d.m21773c(this.f34594k, str2, interfaceC5749A0, str2, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
        HashMap map = this.f34592i;
        if (map != null) {
            for (String str3 : map.keySet()) {
                Object obj = this.f34592i.get(str3);
                interfaceC5749A0.mo13828u(str3);
                interfaceC5749A0.mo13825r(iLogger, obj);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
