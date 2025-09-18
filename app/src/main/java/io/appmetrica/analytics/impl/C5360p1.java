package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.p1 */
/* loaded from: classes2.dex */
public final class C5360p1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Configuration f32373a;

    /* renamed from: b */
    public final /* synthetic */ C5610z1 f32374b;

    public C5360p1(C5610z1 c5610z1, Configuration configuration) {
        this.f32374b = c5610z1;
        this.f32373a = configuration;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f32374b.f32901b.onConfigurationChanged(this.f32373a);
    }
}
