package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4572ga implements Nb {
    @Override // io.appmetrica.analytics.impl.Nb
    public final X8 a(C4640j7 c4640j7) {
        X8 x8 = null;
        if ((c4640j7 != null ? c4640j7.b : null) != null && c4640j7.c != null) {
            x8 = new X8();
            x8.b = c4640j7.b.doubleValue();
            x8.a = c4640j7.c.doubleValue();
            Integer num = c4640j7.d;
            if (num != null) {
                x8.g = num.intValue();
            }
            Integer num2 = c4640j7.e;
            if (num2 != null) {
                x8.e = num2.intValue();
            }
            Integer num3 = c4640j7.f;
            if (num3 != null) {
                x8.d = num3.intValue();
            }
            Integer num4 = c4640j7.g;
            if (num4 != null) {
                x8.f = num4.intValue();
            }
            Long l = c4640j7.h;
            if (l != null) {
                x8.c = TimeUnit.MILLISECONDS.toSeconds(l.longValue());
            }
            String str = c4640j7.i;
            if (str != null) {
                if (str.equals("gps")) {
                    x8.h = 1;
                } else if (str.equals("network")) {
                    x8.h = 2;
                }
            }
            String str2 = c4640j7.j;
            if (str2 != null) {
                x8.i = str2;
            }
        }
        return x8;
    }
}
