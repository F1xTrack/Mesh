package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.v1 */
/* loaded from: classes2.dex */
public final class C5510v1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f32717a;

    /* renamed from: b */
    public final /* synthetic */ C5610z1 f32718b;

    public C5510v1(C5610z1 c5610z1, Intent intent) {
        this.f32718b = c5610z1;
        this.f32717a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f32718b.f32901b.mo19255b(this.f32717a);
    }
}
