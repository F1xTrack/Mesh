package io.sentry.rrweb;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class i extends e implements InterfaceC5141l0 {
    public int d;
    public List e;
    public HashMap f;
    public HashMap g;

    public i() {
        super(d.TouchMove);
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("type").r(iLogger, this.a);
        a0.u("timestamp").b(this.b);
        a0.u("data");
        a0.q();
        a0.u("source").r(iLogger, this.c);
        List list = this.e;
        if (list != null && !list.isEmpty()) {
            a0.u("positions").r(iLogger, this.e);
        }
        a0.u("pointerId").b(this.d);
        HashMap map = this.g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.g.get(str);
                a0.u(str);
                a0.r(iLogger, obj);
            }
        }
        a0.j();
        HashMap map2 = this.f;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                Object obj2 = this.f.get(str2);
                a0.u(str2);
                a0.r(iLogger, obj2);
            }
        }
        a0.j();
    }
}
