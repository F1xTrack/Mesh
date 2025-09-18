package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.C3802u;
import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.u1 */
/* loaded from: classes2.dex */
class C3637u1 extends AbstractC2691J {
    public C3637u1(Context context, C2969U3 c2969u3, C3802u c3802u, C3456n2 c3456n2) {
        this(context, c2969u3, c3802u, c3456n2, new C2717K0(context));
    }

    private C3637u1(Context context, C2969U3 c2969u3, C3802u c3802u, C3456n2 c3456n2, C2717K0 c2717k0) {
        CounterConfiguration counterConfiguration = new CounterConfiguration();
        synchronized (counterConfiguration) {
            counterConfiguration.m13774g(c3802u.apiKey);
            counterConfiguration.m13783p(c3802u.sessionTimeout);
            counterConfiguration.m13773f(null);
            counterConfiguration.m13776i(null);
            counterConfiguration.m13772e(c3802u.logs);
            Boolean bool = c3802u.statisticsSending;
            if (C2968U2.m15244a(bool)) {
                counterConfiguration.m13781n(bool.booleanValue());
            }
            Integer num = c3802u.maxReportsInDatabaseCount;
            if (C2968U2.m15244a(num)) {
                counterConfiguration.f20731a.put("MAX_REPORTS_IN_DB_COUNT", num);
            }
            counterConfiguration.m13780m(c3802u.apiKey);
        }
        this(context, c3456n2, c3802u, new C3378k2(c2969u3, counterConfiguration, c3802u.userProfileID), c2717k0, C3065Y.m15442g().m15451j(), new C3731xh(), new C3705wh(null, null), new C2599F7(), new C2474A7(), new C3643u7(), new C3591s7(), new C3123a7(c2717k0));
    }

    public C3637u1(Context context, C3456n2 c3456n2, C3802u c3802u, C3378k2 c3378k2, C2717K0 c2717k0, InterfaceC2664Hm interfaceC2664Hm, C3731xh c3731xh, C3705wh c3705wh, C2599F7 c2599f7, C2474A7 c2474a7, C3643u7 c3643u7, C3591s7 c3591s7, C3123a7 c3123a7) {
        super(context, c3456n2, c3378k2, c2717k0, interfaceC2664Hm, c3731xh.m17187a(c3456n2.m16463b(), c3802u.apiKey, false), c3705wh, c2599f7, c2474a7, c3643u7, c3591s7, c3123a7);
    }
}
