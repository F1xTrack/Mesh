package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.u1 */
/* loaded from: classes2.dex */
public final class C4897u1 extends SafeRunnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ C5017z1 b;

    public C4897u1(C5017z1 c5017z1, Intent intent) {
        this.b = c5017z1;
        this.a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.b.b.c(this.a);
    }
}
