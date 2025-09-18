package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.r1 */
/* loaded from: classes2.dex */
public final class C4825r1 extends SafeRunnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ int b;
    public final /* synthetic */ C5017z1 c;

    public C4825r1(C5017z1 c5017z1, Intent intent, int i) {
        this.c = c5017z1;
        this.a = intent;
        this.b = i;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.c.b.a(this.a, this.b);
    }
}
