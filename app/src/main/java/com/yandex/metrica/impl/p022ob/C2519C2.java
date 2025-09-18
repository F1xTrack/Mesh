package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.EnumC2458c;

/* renamed from: com.yandex.metrica.impl.ob.C2 */
/* loaded from: classes2.dex */
public class C2519C2 {

    /* renamed from: a */
    private final String f20959a;

    /* renamed from: b */
    private final Context f20960b;

    /* renamed from: c */
    private final EnumC2458c f20961c;

    /* renamed from: d */
    private final C2569E2 f20962d;

    public C2519C2(String str, Context context, EnumC2458c enumC2458c, C2569E2 c2569e2) {
        this.f20959a = str;
        this.f20960b = context;
        int iOrdinal = enumC2458c.ordinal();
        if (iOrdinal == 0) {
            this.f20961c = EnumC2458c.SELF_DIAGNOSTIC_MAIN;
        } else if (iOrdinal != 1) {
            this.f20961c = null;
        } else {
            this.f20961c = EnumC2458c.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f20962d = c2569e2;
    }

    /* renamed from: a */
    public void m13947a(C3376k0 c3376k0) {
        if (this.f20961c != null) {
            try {
                String str = this.f20959a;
                CounterConfiguration counterConfiguration = new CounterConfiguration();
                synchronized (counterConfiguration) {
                    counterConfiguration.m13777j(str);
                }
                counterConfiguration.m13770c(this.f20961c);
                this.f20962d.m14027a(c3376k0.m16228b(new C3378k2(new C2969U3(this.f20960b, (ResultReceiver) null), counterConfiguration, null).m16254c()));
            } catch (Throwable unused) {
            }
        }
    }
}
