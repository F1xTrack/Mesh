package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.y1 */
/* loaded from: classes2.dex */
public final class C5585y1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f32834a;

    /* renamed from: b */
    public final /* synthetic */ C5610z1 f32835b;

    public C5585y1(C5610z1 c5610z1, Bundle bundle) {
        this.f32835b = c5610z1;
        this.f32834a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f32835b.f32901b.pauseUserSession(this.f32834a);
    }
}
