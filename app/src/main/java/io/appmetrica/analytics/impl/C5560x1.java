package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.x1 */
/* loaded from: classes2.dex */
public final class C5560x1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f32793a;

    /* renamed from: b */
    public final /* synthetic */ C5610z1 f32794b;

    public C5560x1(C5610z1 c5610z1, Bundle bundle) {
        this.f32794b = c5610z1;
        this.f32793a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f32794b.f32901b.resumeUserSession(this.f32793a);
    }
}
