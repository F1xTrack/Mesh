package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.HashMap;

/* renamed from: io.sentry.protocol.s */
/* loaded from: classes2.dex */
public final class C6103s implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f34435a;

    /* renamed from: b */
    public String f34436b;

    /* renamed from: c */
    public String f34437c;

    /* renamed from: d */
    public Long f34438d;

    /* renamed from: e */
    public C6109y f34439e;

    /* renamed from: f */
    public C6094j f34440f;

    /* renamed from: g */
    public HashMap f34441g;

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34435a != null) {
            interfaceC5749A0.mo13828u("type").mo13811d(this.f34435a);
        }
        if (this.f34436b != null) {
            interfaceC5749A0.mo13828u("value").mo13811d(this.f34436b);
        }
        if (this.f34437c != null) {
            interfaceC5749A0.mo13828u("module").mo13811d(this.f34437c);
        }
        if (this.f34438d != null) {
            interfaceC5749A0.mo13828u(CrashHianalyticsData.THREAD_ID).mo13820m(this.f34438d);
        }
        if (this.f34439e != null) {
            interfaceC5749A0.mo13828u("stacktrace").mo13825r(iLogger, this.f34439e);
        }
        if (this.f34440f != null) {
            interfaceC5749A0.mo13828u("mechanism").mo13825r(iLogger, this.f34440f);
        }
        HashMap map = this.f34441g;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5749A0.mo13828u(str).mo13825r(iLogger, this.f34441g.get(str));
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
