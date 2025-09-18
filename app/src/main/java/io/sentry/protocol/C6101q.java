package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.HashMap;

/* renamed from: io.sentry.protocol.q */
/* loaded from: classes2.dex */
public final class C6101q implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f34425a;

    /* renamed from: b */
    public Integer f34426b;

    /* renamed from: c */
    public Integer f34427c;

    /* renamed from: d */
    public Integer f34428d;

    /* renamed from: e */
    public HashMap f34429e;

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34425a != null) {
            interfaceC5749A0.mo13828u("sdk_name").mo13811d(this.f34425a);
        }
        if (this.f34426b != null) {
            interfaceC5749A0.mo13828u("version_major").mo13820m(this.f34426b);
        }
        if (this.f34427c != null) {
            interfaceC5749A0.mo13828u("version_minor").mo13820m(this.f34427c);
        }
        if (this.f34428d != null) {
            interfaceC5749A0.mo13828u("version_patchlevel").mo13820m(this.f34428d);
        }
        HashMap map = this.f34429e;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5749A0.mo13828u(str).mo13825r(iLogger, this.f34429e.get(str));
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
