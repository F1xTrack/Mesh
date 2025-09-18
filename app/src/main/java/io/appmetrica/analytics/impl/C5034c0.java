package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.c0 */
/* loaded from: classes2.dex */
public final class C5034c0 {

    /* renamed from: a */
    public final HashMap f31346a = new HashMap();

    /* renamed from: a */
    public final synchronized C5009b0 m20207a(C4964Z4 c4964z4, PublicLogger publicLogger, C5323ne c5323ne) {
        C5009b0 c5009b0;
        c5009b0 = (C5009b0) this.f31346a.get(c4964z4.toString());
        if (c5009b0 == null) {
            C4984a0 c4984a0M20824d = c5323ne.m20824d();
            c5009b0 = new C5009b0(c4984a0M20824d.f31232a, c4984a0M20824d.f31233b, new C5454sk(publicLogger, "[App Environment]"));
            this.f31346a.put(c4964z4.toString(), c5009b0);
        }
        return c5009b0;
    }

    /* renamed from: a */
    public final synchronized void m20208a(C4984a0 c4984a0, C5323ne c5323ne) {
        c5323ne.m20820a(c4984a0).m20875b();
    }
}
