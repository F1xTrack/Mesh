package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.t1 */
/* loaded from: classes2.dex */
public final class C5460t1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f32608a;

    /* renamed from: b */
    public final /* synthetic */ C5610z1 f32609b;

    public C5460t1(C5610z1 c5610z1, Intent intent) {
        this.f32609b = c5610z1;
        this.f32608a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f32609b.f32901b.mo19249a(this.f32608a);
    }
}
