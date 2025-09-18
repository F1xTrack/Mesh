package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.w1 */
/* loaded from: classes2.dex */
public final class C4945w1 extends SafeRunnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ C5017z1 c;

    public C4945w1(C5017z1 c5017z1, int i, Bundle bundle) {
        this.c = c5017z1;
        this.a = i;
        this.b = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.c.b.reportData(this.a, this.b);
    }
}
