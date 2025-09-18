package io.sentry.clientreport;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.HashMap;

/* renamed from: io.sentry.clientreport.e */
/* loaded from: classes2.dex */
public final class C6001e implements InterfaceC6058l0 {

    /* renamed from: a */
    public final String f34118a;

    /* renamed from: b */
    public final String f34119b;

    /* renamed from: c */
    public final Long f34120c;

    /* renamed from: d */
    public HashMap f34121d;

    public C6001e(String str, String str2, Long l) {
        this.f34118a = str;
        this.f34119b = str2;
        this.f34120c = l;
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("reason").mo13811d(this.f34118a);
        interfaceC5749A0.mo13828u("category").mo13811d(this.f34119b);
        interfaceC5749A0.mo13828u("quantity").mo13820m(this.f34120c);
        HashMap map = this.f34121d;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5749A0.mo13828u(str).mo13825r(iLogger, this.f34121d.get(str));
            }
        }
        interfaceC5749A0.mo13817j();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.f34118a + "', category='" + this.f34119b + "', quantity=" + this.f34120c + '}';
    }
}
