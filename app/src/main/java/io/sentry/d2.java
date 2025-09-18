package io.sentry;

import com.google.android.gms.common.Scopes;
import defpackage.AbstractC1705Vq;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class d2 implements InterfaceC5141l0 {
    public final io.sentry.protocol.t a;
    public final String b;
    public final String c;
    public final String d;
    public HashMap e;

    public d2(io.sentry.protocol.t tVar, String str, String str2, String str3) {
        this.a = tVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("event_id");
        this.a.serialize(a0, iLogger);
        String str = this.b;
        if (str != null) {
            a0.u("name").d(str);
        }
        String str2 = this.c;
        if (str2 != null) {
            a0.u(Scopes.EMAIL).d(str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            a0.u("comments").d(str3);
        }
        HashMap map = this.e;
        if (map != null) {
            for (String str4 : map.keySet()) {
                a0.u(str4).r(iLogger, this.e.get(str4));
            }
        }
        a0.j();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserFeedback{eventId=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.b);
        sb.append("', email='");
        sb.append(this.c);
        sb.append("', comments='");
        return AbstractC1705Vq.l(sb, this.d, "'}");
    }
}
