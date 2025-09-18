package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.s1 */
/* loaded from: classes2.dex */
public final class C4849s1 extends SafeRunnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ C5017z1 d;

    public C4849s1(C5017z1 c5017z1, Intent intent, int i, int i2) {
        this.d = c5017z1;
        this.a = intent;
        this.b = i;
        this.c = i2;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.d.b.a(this.a, this.b, this.c);
    }
}
