package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ga */
/* loaded from: classes2.dex */
public final class C5144ga implements InterfaceC4684Nb {
    @Override // io.appmetrica.analytics.impl.InterfaceC4684Nb
    /* renamed from: a */
    public final C4920X8 mo19655a(C5216j7 c5216j7) {
        C4920X8 c4920x8 = null;
        if ((c5216j7 != null ? c5216j7.f31958b : null) != null && c5216j7.f31959c != null) {
            c4920x8 = new C4920X8();
            c4920x8.f31020b = c5216j7.f31958b.doubleValue();
            c4920x8.f31019a = c5216j7.f31959c.doubleValue();
            Integer num = c5216j7.f31960d;
            if (num != null) {
                c4920x8.f31025g = num.intValue();
            }
            Integer num2 = c5216j7.f31961e;
            if (num2 != null) {
                c4920x8.f31023e = num2.intValue();
            }
            Integer num3 = c5216j7.f31962f;
            if (num3 != null) {
                c4920x8.f31022d = num3.intValue();
            }
            Integer num4 = c5216j7.f31963g;
            if (num4 != null) {
                c4920x8.f31024f = num4.intValue();
            }
            Long l = c5216j7.f31964h;
            if (l != null) {
                c4920x8.f31021c = TimeUnit.MILLISECONDS.toSeconds(l.longValue());
            }
            String str = c5216j7.f31965i;
            if (str != null) {
                if (str.equals("gps")) {
                    c4920x8.f31026h = 1;
                } else if (str.equals("network")) {
                    c4920x8.f31026h = 2;
                }
            }
            String str2 = c5216j7.f31966j;
            if (str2 != null) {
                c4920x8.f31027i = str2;
            }
        }
        return c4920x8;
    }
}
