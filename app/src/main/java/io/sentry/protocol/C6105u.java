package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.config.AbstractC6003a;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: io.sentry.protocol.u */
/* loaded from: classes2.dex */
public final class C6105u implements InterfaceC6058l0 {

    /* renamed from: a */
    public final String f34444a;

    /* renamed from: b */
    public final String f34445b;

    /* renamed from: c */
    public HashMap f34446c;

    public C6105u(String str, String str2) {
        AbstractC6003a.m21735D(str, "name is required.");
        this.f34444a = str;
        AbstractC6003a.m21735D(str2, "version is required.");
        this.f34445b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6105u.class != obj.getClass()) {
            return false;
        }
        C6105u c6105u = (C6105u) obj;
        return Objects.equals(this.f34444a, c6105u.f34444a) && Objects.equals(this.f34445b, c6105u.f34445b);
    }

    public final int hashCode() {
        return Objects.hash(this.f34444a, this.f34445b);
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("name").mo13811d(this.f34444a);
        interfaceC5749A0.mo13828u("version").mo13811d(this.f34445b);
        HashMap map = this.f34446c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5749A0.mo13828u(str).mo13825r(iLogger, this.f34446c.get(str));
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
