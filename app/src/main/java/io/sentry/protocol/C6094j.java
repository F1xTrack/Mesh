package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.j */
/* loaded from: classes2.dex */
public final class C6094j implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f34383a;

    /* renamed from: b */
    public String f34384b;

    /* renamed from: c */
    public String f34385c;

    /* renamed from: d */
    public Boolean f34386d;

    /* renamed from: e */
    public ConcurrentHashMap f34387e;

    /* renamed from: f */
    public ConcurrentHashMap f34388f;

    /* renamed from: g */
    public Boolean f34389g;

    /* renamed from: h */
    public HashMap f34390h;

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34383a != null) {
            interfaceC5749A0.mo13828u("type").mo13811d(this.f34383a);
        }
        if (this.f34384b != null) {
            interfaceC5749A0.mo13828u("description").mo13811d(this.f34384b);
        }
        if (this.f34385c != null) {
            interfaceC5749A0.mo13828u("help_link").mo13811d(this.f34385c);
        }
        if (this.f34386d != null) {
            interfaceC5749A0.mo13828u("handled").mo13826s(this.f34386d);
        }
        if (this.f34387e != null) {
            interfaceC5749A0.mo13828u("meta").mo13825r(iLogger, this.f34387e);
        }
        if (this.f34388f != null) {
            interfaceC5749A0.mo13828u("data").mo13825r(iLogger, this.f34388f);
        }
        if (this.f34389g != null) {
            interfaceC5749A0.mo13828u("synthetic").mo13826s(this.f34389g);
        }
        HashMap map = this.f34390h;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5749A0.mo13828u(str).mo13825r(iLogger, this.f34390h.get(str));
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
