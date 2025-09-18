package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.internal.AppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.N1 */
/* loaded from: classes2.dex */
public final class C4674N1 {
    /* renamed from: a */
    public final Intent m19643a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
        intent.setAction(str);
        return intent;
    }
}
