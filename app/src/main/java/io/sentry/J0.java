package io.sentry;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class J0 implements InterfaceC5141l0 {
    public Integer a;
    public List b;
    public HashMap c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J0.class != obj.getClass()) {
            return false;
        }
        J0 j0 = (J0) obj;
        return io.sentry.config.a.f(this.a, j0.a) && io.sentry.config.a.f(this.b, j0.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("segment_id").m(this.a);
        }
        HashMap map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                a0.u(str).r(iLogger, this.c.get(str));
            }
        }
        a0.j();
        a0.f(true);
        if (this.a != null) {
            a0.n();
        }
        List list = this.b;
        if (list != null) {
            a0.r(iLogger, list);
        }
        a0.f(false);
    }
}
