package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.r1 */
/* loaded from: classes2.dex */
public final class C5410r1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f32491a;

    /* renamed from: b */
    public final /* synthetic */ int f32492b;

    /* renamed from: c */
    public final /* synthetic */ C5610z1 f32493c;

    public C5410r1(C5610z1 c5610z1, Intent intent, int i) {
        this.f32493c = c5610z1;
        this.f32491a = intent;
        this.f32492b = i;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f32493c.f32901b.mo19250a(this.f32491a, this.f32492b);
    }
}
