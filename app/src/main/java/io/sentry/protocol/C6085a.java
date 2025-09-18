package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.config.AbstractC6003a;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.a */
/* loaded from: classes2.dex */
public final class C6085a implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f34312a;

    /* renamed from: b */
    public Date f34313b;

    /* renamed from: c */
    public String f34314c;

    /* renamed from: d */
    public String f34315d;

    /* renamed from: e */
    public String f34316e;

    /* renamed from: f */
    public String f34317f;

    /* renamed from: g */
    public String f34318g;

    /* renamed from: h */
    public AbstractMap f34319h;

    /* renamed from: i */
    public List f34320i;

    /* renamed from: j */
    public String f34321j;

    /* renamed from: k */
    public Boolean f34322k;

    /* renamed from: l */
    public ConcurrentHashMap f34323l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6085a.class != obj.getClass()) {
            return false;
        }
        C6085a c6085a = (C6085a) obj;
        return AbstractC6003a.m21747f(this.f34312a, c6085a.f34312a) && AbstractC6003a.m21747f(this.f34313b, c6085a.f34313b) && AbstractC6003a.m21747f(this.f34314c, c6085a.f34314c) && AbstractC6003a.m21747f(this.f34315d, c6085a.f34315d) && AbstractC6003a.m21747f(this.f34316e, c6085a.f34316e) && AbstractC6003a.m21747f(this.f34317f, c6085a.f34317f) && AbstractC6003a.m21747f(this.f34318g, c6085a.f34318g) && AbstractC6003a.m21747f(this.f34319h, c6085a.f34319h) && AbstractC6003a.m21747f(this.f34322k, c6085a.f34322k) && AbstractC6003a.m21747f(this.f34320i, c6085a.f34320i) && AbstractC6003a.m21747f(this.f34321j, c6085a.f34321j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34312a, this.f34313b, this.f34314c, this.f34315d, this.f34316e, this.f34317f, this.f34318g, this.f34319h, this.f34322k, this.f34320i, this.f34321j});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34312a != null) {
            interfaceC5749A0.mo13828u("app_identifier").mo13811d(this.f34312a);
        }
        if (this.f34313b != null) {
            interfaceC5749A0.mo13828u("app_start_time").mo13825r(iLogger, this.f34313b);
        }
        if (this.f34314c != null) {
            interfaceC5749A0.mo13828u("device_app_hash").mo13811d(this.f34314c);
        }
        if (this.f34315d != null) {
            interfaceC5749A0.mo13828u("build_type").mo13811d(this.f34315d);
        }
        if (this.f34316e != null) {
            interfaceC5749A0.mo13828u("app_name").mo13811d(this.f34316e);
        }
        if (this.f34317f != null) {
            interfaceC5749A0.mo13828u("app_version").mo13811d(this.f34317f);
        }
        if (this.f34318g != null) {
            interfaceC5749A0.mo13828u("app_build").mo13811d(this.f34318g);
        }
        AbstractMap abstractMap = this.f34319h;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            interfaceC5749A0.mo13828u("permissions").mo13825r(iLogger, this.f34319h);
        }
        if (this.f34322k != null) {
            interfaceC5749A0.mo13828u("in_foreground").mo13826s(this.f34322k);
        }
        if (this.f34320i != null) {
            interfaceC5749A0.mo13828u("view_names").mo13825r(iLogger, this.f34320i);
        }
        if (this.f34321j != null) {
            interfaceC5749A0.mo13828u("start_type").mo13811d(this.f34321j);
        }
        ConcurrentHashMap concurrentHashMap = this.f34323l;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                interfaceC5749A0.mo13828u(str).mo13825r(iLogger, this.f34323l.get(str));
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
