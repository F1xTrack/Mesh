package io.sentry.rrweb;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class m extends b implements InterfaceC5141l0 {
    public String c;
    public int d;
    public long e;
    public long f;
    public String g;
    public String h;
    public int i;
    public int j;
    public int k;
    public String l;
    public int m;
    public int n;
    public int o;
    public HashMap p;
    public ConcurrentHashMap q;
    public ConcurrentHashMap r;

    public m() {
        super(c.Custom);
        this.g = "h264";
        this.h = "mp4";
        this.l = "constant";
        this.c = "video";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        m mVar = (m) obj;
        return this.d == mVar.d && this.e == mVar.e && this.f == mVar.f && this.i == mVar.i && this.j == mVar.j && this.k == mVar.k && this.m == mVar.m && this.n == mVar.n && this.o == mVar.o && io.sentry.config.a.f(this.c, mVar.c) && io.sentry.config.a.f(this.g, mVar.g) && io.sentry.config.a.f(this.h, mVar.h) && io.sentry.config.a.f(this.l, mVar.l);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.c, Integer.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), this.g, this.h, Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k), this.l, Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o)});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("type").r(iLogger, this.a);
        a0.u("timestamp").b(this.b);
        a0.u("data");
        a0.q();
        a0.u("tag").d(this.c);
        a0.u("payload");
        a0.q();
        a0.u("segmentId").b(this.d);
        a0.u("size").b(this.e);
        a0.u("duration").b(this.f);
        a0.u("encoding").d(this.g);
        a0.u("container").d(this.h);
        a0.u(Snapshot.HEIGHT).b(this.i);
        a0.u(Snapshot.WIDTH).b(this.j);
        a0.u("frameCount").b(this.k);
        a0.u("frameRate").b(this.m);
        a0.u("frameRateType").d(this.l);
        a0.u("left").b(this.n);
        a0.u("top").b(this.o);
        ConcurrentHashMap concurrentHashMap = this.q;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.q, str, a0, str, iLogger);
            }
        }
        a0.j();
        ConcurrentHashMap concurrentHashMap2 = this.r;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                AbstractC5116d.c(this.r, str2, a0, str2, iLogger);
            }
        }
        a0.j();
        HashMap map = this.p;
        if (map != null) {
            for (String str3 : map.keySet()) {
                Object obj = this.p.get(str3);
                a0.u(str3);
                a0.r(iLogger, obj);
            }
        }
        a0.j();
    }
}
