package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class u implements InterfaceC5141l0 {
    public final String a;
    public final String b;
    public HashMap c;

    public u(String str, String str2) {
        io.sentry.config.a.D(str, "name is required.");
        this.a = str;
        io.sentry.config.a.D(str2, "version is required.");
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return Objects.equals(this.a, uVar.a) && Objects.equals(this.b, uVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("name").d(this.a);
        a0.u("version").d(this.b);
        HashMap map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                a0.u(str).r(iLogger, this.c.get(str));
            }
        }
        a0.j();
    }
}
