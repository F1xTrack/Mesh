package io.sentry.protocol;

import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.config.AbstractC6003a;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.m */
/* loaded from: classes2.dex */
public final class C6097m implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f34400a;

    /* renamed from: b */
    public String f34401b;

    /* renamed from: c */
    public String f34402c;

    /* renamed from: d */
    public String f34403d;

    /* renamed from: e */
    public String f34404e;

    /* renamed from: f */
    public Boolean f34405f;

    /* renamed from: g */
    public ConcurrentHashMap f34406g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6097m.class != obj.getClass()) {
            return false;
        }
        C6097m c6097m = (C6097m) obj;
        return AbstractC6003a.m21747f(this.f34400a, c6097m.f34400a) && AbstractC6003a.m21747f(this.f34401b, c6097m.f34401b) && AbstractC6003a.m21747f(this.f34402c, c6097m.f34402c) && AbstractC6003a.m21747f(this.f34403d, c6097m.f34403d) && AbstractC6003a.m21747f(this.f34404e, c6097m.f34404e) && AbstractC6003a.m21747f(this.f34405f, c6097m.f34405f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34400a, this.f34401b, this.f34402c, this.f34403d, this.f34404e, this.f34405f});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34400a != null) {
            interfaceC5749A0.mo13828u("name").mo13811d(this.f34400a);
        }
        if (this.f34401b != null) {
            interfaceC5749A0.mo13828u("version").mo13811d(this.f34401b);
        }
        if (this.f34402c != null) {
            interfaceC5749A0.mo13828u("raw_description").mo13811d(this.f34402c);
        }
        if (this.f34403d != null) {
            interfaceC5749A0.mo13828u("build").mo13811d(this.f34403d);
        }
        if (this.f34404e != null) {
            interfaceC5749A0.mo13828u("kernel_version").mo13811d(this.f34404e);
        }
        if (this.f34405f != null) {
            interfaceC5749A0.mo13828u("rooted").mo13826s(this.f34405f);
        }
        ConcurrentHashMap concurrentHashMap = this.f34406g;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34406g, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
