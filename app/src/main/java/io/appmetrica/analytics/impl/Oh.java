package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Oh implements InterfaceC4772oj {
    public final C4562g0 a;
    public final C4700lj b;
    public final ICommonExecutor c;

    public Oh(C4562g0 c4562g0, C4700lj c4700lj) {
        this(c4562g0, c4700lj, C4805q4.h().e().b());
    }

    public final void a(Pg pg) {
        Callable c4578gg;
        ICommonExecutor iCommonExecutor = this.c;
        if (pg.b) {
            C4700lj c4700lj = this.b;
            c4578gg = new C4568g6(c4700lj.a, c4700lj.b, c4700lj.c, pg);
        } else {
            C4700lj c4700lj2 = this.b;
            c4578gg = new C4578gg(c4700lj2.b, c4700lj2.c, pg);
        }
        iCommonExecutor.submit(c4578gg);
    }

    public final void b(Pg pg) {
        C4700lj c4700lj = this.b;
        C4568g6 c4568g6 = new C4568g6(c4700lj.a, c4700lj.b, c4700lj.c, pg);
        if (this.a.a()) {
            try {
                this.c.submit(c4568g6).get(4L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        if (c4568g6.c) {
            return;
        }
        try {
            c4568g6.a();
        } catch (Throwable unused2) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4772oj
    public final void reportData(int i, Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.c;
        C4700lj c4700lj = this.b;
        iCommonExecutor.submit(new Jm(c4700lj.b, c4700lj.c, i, bundle));
    }

    public Oh(C4562g0 c4562g0, C4700lj c4700lj, ICommonExecutor iCommonExecutor) {
        this.c = iCommonExecutor;
        this.b = c4700lj;
        this.a = c4562g0;
    }

    public final void b(Re re) {
        ICommonExecutor iCommonExecutor = this.c;
        C4700lj c4700lj = this.b;
        iCommonExecutor.submit(new Uh(c4700lj.b, c4700lj.c, re));
    }

    public final void a(Re re) {
        ICommonExecutor iCommonExecutor = this.c;
        C4700lj c4700lj = this.b;
        iCommonExecutor.submit(new Ld(c4700lj.b, c4700lj.c, re));
    }
}
