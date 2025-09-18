package io.sentry.protocol;

import com.google.android.gms.common.Scopes;
import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.config.AbstractC6003a;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.E */
/* loaded from: classes2.dex */
public final class C6082E implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f34288a;

    /* renamed from: b */
    public String f34289b;

    /* renamed from: c */
    public String f34290c;

    /* renamed from: d */
    public String f34291d;

    /* renamed from: e */
    public String f34292e;

    /* renamed from: f */
    public String f34293f;

    /* renamed from: g */
    public C6091g f34294g;

    /* renamed from: h */
    public ConcurrentHashMap f34295h;

    /* renamed from: i */
    public ConcurrentHashMap f34296i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6082E.class != obj.getClass()) {
            return false;
        }
        C6082E c6082e = (C6082E) obj;
        return AbstractC6003a.m21747f(this.f34288a, c6082e.f34288a) && AbstractC6003a.m21747f(this.f34289b, c6082e.f34289b) && AbstractC6003a.m21747f(this.f34290c, c6082e.f34290c) && AbstractC6003a.m21747f(this.f34291d, c6082e.f34291d) && AbstractC6003a.m21747f(this.f34292e, c6082e.f34292e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34288a, this.f34289b, this.f34290c, this.f34291d, this.f34292e});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34288a != null) {
            interfaceC5749A0.mo13828u(Scopes.EMAIL).mo13811d(this.f34288a);
        }
        if (this.f34289b != null) {
            interfaceC5749A0.mo13828u(NotificationConstants.f19487ID).mo13811d(this.f34289b);
        }
        if (this.f34290c != null) {
            interfaceC5749A0.mo13828u("username").mo13811d(this.f34290c);
        }
        if (this.f34291d != null) {
            interfaceC5749A0.mo13828u("segment").mo13811d(this.f34291d);
        }
        if (this.f34292e != null) {
            interfaceC5749A0.mo13828u("ip_address").mo13811d(this.f34292e);
        }
        if (this.f34293f != null) {
            interfaceC5749A0.mo13828u("name").mo13811d(this.f34293f);
        }
        if (this.f34294g != null) {
            interfaceC5749A0.mo13828u("geo");
            this.f34294g.serialize(interfaceC5749A0, iLogger);
        }
        if (this.f34295h != null) {
            interfaceC5749A0.mo13828u("data").mo13825r(iLogger, this.f34295h);
        }
        ConcurrentHashMap concurrentHashMap = this.f34296i;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34296i, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
