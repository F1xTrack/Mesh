package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4464c0 {
    public final HashMap a = new HashMap();

    public final synchronized C4439b0 a(Z4 z4, PublicLogger publicLogger, C4743ne c4743ne) {
        C4439b0 c4439b0;
        c4439b0 = (C4439b0) this.a.get(z4.toString());
        if (c4439b0 == null) {
            C4414a0 c4414a0D = c4743ne.d();
            c4439b0 = new C4439b0(c4414a0D.a, c4414a0D.b, new C4868sk(publicLogger, "[App Environment]"));
            this.a.put(z4.toString(), c4439b0);
        }
        return c4439b0;
    }

    public final synchronized void a(C4414a0 c4414a0, C4743ne c4743ne) {
        c4743ne.a(c4414a0).b();
    }
}
