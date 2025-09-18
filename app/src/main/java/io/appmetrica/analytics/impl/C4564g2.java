package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.C2171ad1;
import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.g2 */
/* loaded from: classes2.dex */
public final class C4564g2 {
    public static final boolean a(Throwable th) {
        return true;
    }

    public final Ca a(Context context, AppMetricaConfig appMetricaConfig, Qa qa) {
        return new Vg(new Tb(qa, appMetricaConfig), new C2171ad1(5), appMetricaConfig.crashTransformer, new J9(context));
    }
}
