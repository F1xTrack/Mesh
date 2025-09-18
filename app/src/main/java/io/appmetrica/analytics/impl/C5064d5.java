package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.d5 */
/* loaded from: classes2.dex */
public final class C5064d5 extends AbstractC5039c5 {
    public C5064d5(C5139g5 c5139g5) {
        super(c5139g5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5039c5
    /* renamed from: b */
    public final boolean mo20213b(int i) {
        return i < 113;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5039c5
    /* renamed from: c */
    public final void mo20214c() {
        C5323ne c5323ne = this.f31353a.f31724c;
        try {
            C4931Xj c4931Xj = new C4931Xj(c5323ne, "background");
            Long lM20118a = c4931Xj.f31062c.m20118a(C4931Xj.f31054d);
            if (lM20118a != null) {
                c4931Xj.m19986a(C4931Xj.f31054d, Long.valueOf(TimeUnit.SECONDS.toMillis(lM20118a.longValue())));
            }
            Long lM20118a2 = c4931Xj.f31062c.m20118a(C4931Xj.f31055e);
            if (lM20118a2 != null) {
                c4931Xj.m19986a(C4931Xj.f31055e, Long.valueOf(TimeUnit.SECONDS.toMillis(lM20118a2.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            C4931Xj c4931Xj2 = new C4931Xj(c5323ne, C5094ea.f31575g);
            Long lM20118a3 = c4931Xj2.f31062c.m20118a(C4931Xj.f31054d);
            if (lM20118a3 != null) {
                c4931Xj2.m19986a(C4931Xj.f31054d, Long.valueOf(TimeUnit.SECONDS.toMillis(lM20118a3.longValue())));
            }
            Long lM20118a4 = c4931Xj2.f31062c.m20118a(C4931Xj.f31055e);
            if (lM20118a4 != null) {
                c4931Xj2.m19986a(C4931Xj.f31055e, Long.valueOf(TimeUnit.SECONDS.toMillis(lM20118a4.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
