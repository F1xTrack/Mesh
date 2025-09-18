package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.d5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4494d5 extends AbstractC4469c5 {
    public C4494d5(C4567g5 c4567g5) {
        super(c4567g5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4469c5
    public final boolean b(int i) {
        return i < 113;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4469c5
    public final void c() {
        C4743ne c4743ne = this.a.c;
        try {
            Xj xj = new Xj(c4743ne, "background");
            Long lA = xj.c.a(Xj.d);
            if (lA != null) {
                xj.a(Xj.d, Long.valueOf(TimeUnit.SECONDS.toMillis(lA.longValue())));
            }
            Long lA2 = xj.c.a(Xj.e);
            if (lA2 != null) {
                xj.a(Xj.e, Long.valueOf(TimeUnit.SECONDS.toMillis(lA2.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            Xj xj2 = new Xj(c4743ne, C4524ea.g);
            Long lA3 = xj2.c.a(Xj.d);
            if (lA3 != null) {
                xj2.a(Xj.d, Long.valueOf(TimeUnit.SECONDS.toMillis(lA3.longValue())));
            }
            Long lA4 = xj2.c.a(Xj.e);
            if (lA4 != null) {
                xj2.a(Xj.e, Long.valueOf(TimeUnit.SECONDS.toMillis(lA4.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
