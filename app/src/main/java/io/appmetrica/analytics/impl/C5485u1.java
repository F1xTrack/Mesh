package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.u1 */
/* loaded from: classes2.dex */
public final class C5485u1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f32663a;

    /* renamed from: b */
    public final /* synthetic */ C5610z1 f32664b;

    public C5485u1(C5610z1 c5610z1, Intent intent) {
        this.f32664b = c5610z1;
        this.f32663a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f32664b.f32901b.mo19257c(this.f32663a);
    }
}
