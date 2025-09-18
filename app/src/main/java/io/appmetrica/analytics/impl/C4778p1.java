package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.p1 */
/* loaded from: classes2.dex */
public final class C4778p1 extends SafeRunnable {
    public final /* synthetic */ Configuration a;
    public final /* synthetic */ C5017z1 b;

    public C4778p1(C5017z1 c5017z1, Configuration configuration) {
        this.b = c5017z1;
        this.a = configuration;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.b.b.onConfigurationChanged(this.a);
    }
}
