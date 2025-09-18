package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.w1 */
/* loaded from: classes2.dex */
public final class C5535w1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ int f32752a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f32753b;

    /* renamed from: c */
    public final /* synthetic */ C5610z1 f32754c;

    public C5535w1(C5610z1 c5610z1, int i, Bundle bundle) {
        this.f32754c = c5610z1;
        this.f32752a = i;
        this.f32753b = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f32754c.f32901b.reportData(this.f32752a, this.f32753b);
    }
}
