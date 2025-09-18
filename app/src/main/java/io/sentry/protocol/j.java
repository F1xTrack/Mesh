package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class j implements InterfaceC5141l0 {
    public String a;
    public String b;
    public String c;
    public Boolean d;
    public ConcurrentHashMap e;
    public ConcurrentHashMap f;
    public Boolean g;
    public HashMap h;

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("type").d(this.a);
        }
        if (this.b != null) {
            a0.u("description").d(this.b);
        }
        if (this.c != null) {
            a0.u("help_link").d(this.c);
        }
        if (this.d != null) {
            a0.u("handled").s(this.d);
        }
        if (this.e != null) {
            a0.u("meta").r(iLogger, this.e);
        }
        if (this.f != null) {
            a0.u("data").r(iLogger, this.f);
        }
        if (this.g != null) {
            a0.u("synthetic").s(this.g);
        }
        HashMap map = this.h;
        if (map != null) {
            for (String str : map.keySet()) {
                a0.u(str).r(iLogger, this.h.get(str));
            }
        }
        a0.j();
    }
}
