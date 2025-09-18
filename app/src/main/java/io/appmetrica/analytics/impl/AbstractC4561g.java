package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.g */
/* loaded from: classes2.dex */
public abstract class AbstractC4561g {
    public final C4567g5 a;
    public final Tj b;
    public final Xj c;
    public final Sj d;
    public final Oa e;
    public final SystemTimeProvider f;

    public AbstractC4561g(C4567g5 c4567g5, Tj tj, Xj xj, Sj sj, Oa oa, SystemTimeProvider systemTimeProvider) {
        this.a = c4567g5;
        this.b = tj;
        this.c = xj;
        this.d = sj;
        this.e = oa;
        this.f = systemTimeProvider;
    }

    public final /* bridge */ Gj a(Object obj) {
        return a((Hj) obj);
    }

    public final Gj b() {
        if (this.c.h()) {
            return new Gj(this.a, this.c, a(), this.f);
        }
        return null;
    }

    public final Gj a(Hj hj) {
        if (this.c.h()) {
            this.e.reportEvent("create session with non-empty storage");
        }
        C4567g5 c4567g5 = this.a;
        Xj xj = this.c;
        long jA = this.b.a();
        Xj xj2 = this.c;
        xj2.a(Xj.f, Long.valueOf(jA));
        xj2.a(Xj.d, Long.valueOf(hj.a));
        xj2.a(Xj.h, Long.valueOf(hj.a));
        xj2.a(Xj.g, 0L);
        xj2.a(Xj.i, Boolean.TRUE);
        xj2.b();
        this.a.f.a(jA, this.d.a, TimeUnit.MILLISECONDS.toSeconds(hj.b));
        return new Gj(c4567g5, xj, a(), new SystemTimeProvider());
    }

    public final Jj a() {
        Ij ij = new Ij(this.d);
        ij.g = this.c.i();
        ij.f = this.c.c.a(Xj.g);
        ij.d = this.c.c.a(Xj.h);
        ij.c = this.c.c.a(Xj.f);
        ij.h = this.c.c.a(Xj.d);
        ij.a = this.c.c.a(Xj.e);
        return new Jj(ij);
    }
}
