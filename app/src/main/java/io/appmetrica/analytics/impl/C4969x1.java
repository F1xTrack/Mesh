package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.x1 */
/* loaded from: classes2.dex */
public final class C4969x1 extends SafeRunnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ C5017z1 b;

    public C4969x1(C5017z1 c5017z1, Bundle bundle) {
        this.b = c5017z1;
        this.a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.b.b.resumeUserSession(this.a);
    }
}
