package io.sentry.protocol;

import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.config.AbstractC6003a;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.h */
/* loaded from: classes2.dex */
public final class C6092h implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f34370a;

    /* renamed from: b */
    public Integer f34371b;

    /* renamed from: c */
    public String f34372c;

    /* renamed from: d */
    public String f34373d;

    /* renamed from: e */
    public Integer f34374e;

    /* renamed from: f */
    public String f34375f;

    /* renamed from: g */
    public Boolean f34376g;

    /* renamed from: h */
    public String f34377h;

    /* renamed from: i */
    public String f34378i;

    /* renamed from: j */
    public ConcurrentHashMap f34379j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6092h.class != obj.getClass()) {
            return false;
        }
        C6092h c6092h = (C6092h) obj;
        return AbstractC6003a.m21747f(this.f34370a, c6092h.f34370a) && AbstractC6003a.m21747f(this.f34371b, c6092h.f34371b) && AbstractC6003a.m21747f(this.f34372c, c6092h.f34372c) && AbstractC6003a.m21747f(this.f34373d, c6092h.f34373d) && AbstractC6003a.m21747f(this.f34374e, c6092h.f34374e) && AbstractC6003a.m21747f(this.f34375f, c6092h.f34375f) && AbstractC6003a.m21747f(this.f34376g, c6092h.f34376g) && AbstractC6003a.m21747f(this.f34377h, c6092h.f34377h) && AbstractC6003a.m21747f(this.f34378i, c6092h.f34378i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34370a, this.f34371b, this.f34372c, this.f34373d, this.f34374e, this.f34375f, this.f34376g, this.f34377h, this.f34378i});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34370a != null) {
            interfaceC5749A0.mo13828u("name").mo13811d(this.f34370a);
        }
        if (this.f34371b != null) {
            interfaceC5749A0.mo13828u(NotificationConstants.f19487ID).mo13820m(this.f34371b);
        }
        if (this.f34372c != null) {
            interfaceC5749A0.mo13828u("vendor_id").mo13811d(this.f34372c);
        }
        if (this.f34373d != null) {
            interfaceC5749A0.mo13828u("vendor_name").mo13811d(this.f34373d);
        }
        if (this.f34374e != null) {
            interfaceC5749A0.mo13828u("memory_size").mo13820m(this.f34374e);
        }
        if (this.f34375f != null) {
            interfaceC5749A0.mo13828u("api_type").mo13811d(this.f34375f);
        }
        if (this.f34376g != null) {
            interfaceC5749A0.mo13828u("multi_threaded_rendering").mo13826s(this.f34376g);
        }
        if (this.f34377h != null) {
            interfaceC5749A0.mo13828u("version").mo13811d(this.f34377h);
        }
        if (this.f34378i != null) {
            interfaceC5749A0.mo13828u("npot_support").mo13811d(this.f34378i);
        }
        ConcurrentHashMap concurrentHashMap = this.f34379j;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34379j, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
