package io.sentry;

import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import io.sentry.config.AbstractC6003a;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.F0 */
/* loaded from: classes2.dex */
public final class C5764F0 implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f33264a;

    /* renamed from: b */
    public String f33265b;

    /* renamed from: c */
    public String f33266c;

    /* renamed from: d */
    public Long f33267d;

    /* renamed from: e */
    public Long f33268e;

    /* renamed from: f */
    public Long f33269f;

    /* renamed from: g */
    public Long f33270g;

    /* renamed from: h */
    public ConcurrentHashMap f33271h;

    public C5764F0(InterfaceC5807U interfaceC5807U, Long l, Long l2) {
        this.f33264a = interfaceC5807U.mo21429k().toString();
        this.f33265b = interfaceC5807U.mo21432n().f33379a.toString();
        this.f33266c = interfaceC5807U.getName().isEmpty() ? "unknown" : interfaceC5807U.getName();
        this.f33267d = l;
        this.f33269f = l2;
    }

    /* renamed from: a */
    public final void m21385a(Long l, Long l2, Long l3, Long l4) {
        if (this.f33268e == null) {
            this.f33268e = Long.valueOf(l.longValue() - l2.longValue());
            this.f33267d = Long.valueOf(this.f33267d.longValue() - l2.longValue());
            this.f33270g = Long.valueOf(l3.longValue() - l4.longValue());
            this.f33269f = Long.valueOf(this.f33269f.longValue() - l4.longValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5764F0.class != obj.getClass()) {
            return false;
        }
        C5764F0 c5764f0 = (C5764F0) obj;
        return this.f33264a.equals(c5764f0.f33264a) && this.f33265b.equals(c5764f0.f33265b) && this.f33266c.equals(c5764f0.f33266c) && this.f33267d.equals(c5764f0.f33267d) && this.f33269f.equals(c5764f0.f33269f) && AbstractC6003a.m21747f(this.f33270g, c5764f0.f33270g) && AbstractC6003a.m21747f(this.f33268e, c5764f0.f33268e) && AbstractC6003a.m21747f(this.f33271h, c5764f0.f33271h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33264a, this.f33265b, this.f33266c, this.f33267d, this.f33268e, this.f33269f, this.f33270g, this.f33271h});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u(NotificationConstants.f19487ID).mo13825r(iLogger, this.f33264a);
        interfaceC5749A0.mo13828u("trace_id").mo13825r(iLogger, this.f33265b);
        interfaceC5749A0.mo13828u("name").mo13825r(iLogger, this.f33266c);
        interfaceC5749A0.mo13828u("relative_start_ns").mo13825r(iLogger, this.f33267d);
        interfaceC5749A0.mo13828u("relative_end_ns").mo13825r(iLogger, this.f33268e);
        interfaceC5749A0.mo13828u("relative_cpu_start_ms").mo13825r(iLogger, this.f33269f);
        interfaceC5749A0.mo13828u("relative_cpu_end_ms").mo13825r(iLogger, this.f33270g);
        ConcurrentHashMap concurrentHashMap = this.f33271h;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f33271h, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
