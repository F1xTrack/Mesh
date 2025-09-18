package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C3114u1 extends J {
    public C3114u1(Context context, U3 u3, com.yandex.metrica.u uVar, C2941n2 c2941n2) {
        this(context, u3, uVar, c2941n2, new K0(context));
    }

    private C3114u1(Context context, U3 u3, com.yandex.metrica.u uVar, C2941n2 c2941n2, K0 k0) {
        CounterConfiguration counterConfiguration = new CounterConfiguration();
        synchronized (counterConfiguration) {
            counterConfiguration.g(uVar.apiKey);
            counterConfiguration.p(uVar.sessionTimeout);
            counterConfiguration.f(null);
            counterConfiguration.i(null);
            counterConfiguration.e(uVar.logs);
            Boolean bool = uVar.statisticsSending;
            if (U2.a(bool)) {
                counterConfiguration.n(bool.booleanValue());
            }
            Integer num = uVar.maxReportsInDatabaseCount;
            if (U2.a(num)) {
                counterConfiguration.a.put("MAX_REPORTS_IN_DB_COUNT", num);
            }
            counterConfiguration.m(uVar.apiKey);
        }
        this(context, c2941n2, uVar, new C2866k2(u3, counterConfiguration, uVar.userProfileID), k0, Y.g().j(), new C3210xh(), new C3185wh(null, null), new F7(), new A7(), new C3120u7(), new C3070s7(), new C2622a7(k0));
    }

    public C3114u1(Context context, C2941n2 c2941n2, com.yandex.metrica.u uVar, C2866k2 c2866k2, K0 k0, Hm hm, C3210xh c3210xh, C3185wh c3185wh, F7 f7, A7 a7, C3120u7 c3120u7, C3070s7 c3070s7, C2622a7 c2622a7) {
        super(context, c2941n2, c2866k2, k0, hm, c3210xh.a(c2941n2.b(), uVar.apiKey, false), c3185wh, f7, a7, c3120u7, c3070s7, c2622a7);
    }
}
