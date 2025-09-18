package io.sentry.protocol;

import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.config.AbstractC6003a;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.n */
/* loaded from: classes2.dex */
public final class C6098n implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f34407a;

    /* renamed from: b */
    public String f34408b;

    /* renamed from: c */
    public String f34409c;

    /* renamed from: d */
    public Object f34410d;

    /* renamed from: e */
    public String f34411e;

    /* renamed from: f */
    public ConcurrentHashMap f34412f;

    /* renamed from: g */
    public ConcurrentHashMap f34413g;

    /* renamed from: h */
    public Long f34414h;

    /* renamed from: i */
    public ConcurrentHashMap f34415i;

    /* renamed from: j */
    public String f34416j;

    /* renamed from: k */
    public String f34417k;

    /* renamed from: l */
    public ConcurrentHashMap f34418l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6098n.class != obj.getClass()) {
            return false;
        }
        C6098n c6098n = (C6098n) obj;
        return AbstractC6003a.m21747f(this.f34407a, c6098n.f34407a) && AbstractC6003a.m21747f(this.f34408b, c6098n.f34408b) && AbstractC6003a.m21747f(this.f34409c, c6098n.f34409c) && AbstractC6003a.m21747f(this.f34411e, c6098n.f34411e) && AbstractC6003a.m21747f(this.f34412f, c6098n.f34412f) && AbstractC6003a.m21747f(this.f34413g, c6098n.f34413g) && AbstractC6003a.m21747f(this.f34414h, c6098n.f34414h) && AbstractC6003a.m21747f(this.f34416j, c6098n.f34416j) && AbstractC6003a.m21747f(this.f34417k, c6098n.f34417k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34407a, this.f34408b, this.f34409c, this.f34411e, this.f34412f, this.f34413g, this.f34414h, this.f34416j, this.f34417k});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34407a != null) {
            interfaceC5749A0.mo13828u("url").mo13811d(this.f34407a);
        }
        if (this.f34408b != null) {
            interfaceC5749A0.mo13828u("method").mo13811d(this.f34408b);
        }
        if (this.f34409c != null) {
            interfaceC5749A0.mo13828u("query_string").mo13811d(this.f34409c);
        }
        if (this.f34410d != null) {
            interfaceC5749A0.mo13828u("data").mo13825r(iLogger, this.f34410d);
        }
        if (this.f34411e != null) {
            interfaceC5749A0.mo13828u("cookies").mo13811d(this.f34411e);
        }
        if (this.f34412f != null) {
            interfaceC5749A0.mo13828u("headers").mo13825r(iLogger, this.f34412f);
        }
        if (this.f34413g != null) {
            interfaceC5749A0.mo13828u("env").mo13825r(iLogger, this.f34413g);
        }
        if (this.f34415i != null) {
            interfaceC5749A0.mo13828u("other").mo13825r(iLogger, this.f34415i);
        }
        if (this.f34416j != null) {
            interfaceC5749A0.mo13828u("fragment").mo13825r(iLogger, this.f34416j);
        }
        if (this.f34414h != null) {
            interfaceC5749A0.mo13828u("body_size").mo13825r(iLogger, this.f34414h);
        }
        if (this.f34417k != null) {
            interfaceC5749A0.mo13828u("api_target").mo13825r(iLogger, this.f34417k);
        }
        ConcurrentHashMap concurrentHashMap = this.f34418l;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34418l, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
