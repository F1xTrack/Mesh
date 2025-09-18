package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes2.dex */
public final class Nc extends SafeRunnable {
    public final /* synthetic */ Rc a;
    public final /* synthetic */ AdRevenue b;
    public final /* synthetic */ boolean c;

    public Nc(Rc rc, AdRevenue adRevenue, boolean z) {
        this.a = rc;
        this.b = adRevenue;
        this.c = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Rc.a(this.a).reportAdRevenue(this.b, this.c);
    }
}
