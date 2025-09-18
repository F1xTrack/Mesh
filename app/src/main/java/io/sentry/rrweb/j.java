package io.sentry.rrweb;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class j extends b implements InterfaceC5141l0 {
    public String c;
    public int d;
    public int e;
    public HashMap f;

    public j() {
        super(c.Meta);
        this.c = "";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.d == jVar.d && this.e == jVar.e && io.sentry.config.a.f(this.c, jVar.c);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("type").r(iLogger, this.a);
        a0.u("timestamp").b(this.b);
        a0.u("data");
        a0.q();
        a0.u("href").d(this.c);
        a0.u(Snapshot.HEIGHT).b(this.d);
        a0.u(Snapshot.WIDTH).b(this.e);
        HashMap map = this.f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f.get(str);
                a0.u(str);
                a0.r(iLogger, obj);
            }
        }
        a0.j();
        a0.j();
    }
}
