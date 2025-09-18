package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import p000.C8749ad1;

/* renamed from: io.appmetrica.analytics.impl.g2 */
/* loaded from: classes2.dex */
public final class C5136g2 {
    /* renamed from: a */
    public static final boolean m20405a(Throwable th) {
        return true;
    }

    /* renamed from: a */
    public final InterfaceC4417Ca m20406a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC4755Qa interfaceC4755Qa) {
        return new C4880Vg(new C4827Tb(interfaceC4755Qa, appMetricaConfig), new C8749ad1(5), appMetricaConfig.crashTransformer, new C4586J9(context));
    }
}
