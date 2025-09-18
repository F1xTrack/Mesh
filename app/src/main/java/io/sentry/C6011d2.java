package io.sentry;

import com.google.android.gms.common.Scopes;
import io.sentry.protocol.C6104t;
import java.util.HashMap;
import p000.AbstractC1374Vq;

/* renamed from: io.sentry.d2 */
/* loaded from: classes2.dex */
public final class C6011d2 implements InterfaceC6058l0 {

    /* renamed from: a */
    public final C6104t f34127a;

    /* renamed from: b */
    public final String f34128b;

    /* renamed from: c */
    public final String f34129c;

    /* renamed from: d */
    public final String f34130d;

    /* renamed from: e */
    public HashMap f34131e;

    public C6011d2(C6104t c6104t, String str, String str2, String str3) {
        this.f34127a = c6104t;
        this.f34128b = str;
        this.f34129c = str2;
        this.f34130d = str3;
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("event_id");
        this.f34127a.serialize(interfaceC5749A0, iLogger);
        String str = this.f34128b;
        if (str != null) {
            interfaceC5749A0.mo13828u("name").mo13811d(str);
        }
        String str2 = this.f34129c;
        if (str2 != null) {
            interfaceC5749A0.mo13828u(Scopes.EMAIL).mo13811d(str2);
        }
        String str3 = this.f34130d;
        if (str3 != null) {
            interfaceC5749A0.mo13828u("comments").mo13811d(str3);
        }
        HashMap map = this.f34131e;
        if (map != null) {
            for (String str4 : map.keySet()) {
                interfaceC5749A0.mo13828u(str4).mo13825r(iLogger, this.f34131e.get(str4));
            }
        }
        interfaceC5749A0.mo13817j();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserFeedback{eventId=");
        sb.append(this.f34127a);
        sb.append(", name='");
        sb.append(this.f34128b);
        sb.append("', email='");
        sb.append(this.f34129c);
        sb.append("', comments='");
        return AbstractC1374Vq.m8593l(sb, this.f34130d, "'}");
    }
}
