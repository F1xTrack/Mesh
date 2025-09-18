package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.s1 */
/* loaded from: classes2.dex */
public final class C5435s1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f32527a;

    /* renamed from: b */
    public final /* synthetic */ int f32528b;

    /* renamed from: c */
    public final /* synthetic */ int f32529c;

    /* renamed from: d */
    public final /* synthetic */ C5610z1 f32530d;

    public C5435s1(C5610z1 c5610z1, Intent intent, int i, int i2) {
        this.f32530d = c5610z1;
        this.f32527a = intent;
        this.f32528b = i;
        this.f32529c = i2;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f32530d.f32901b.mo19251a(this.f32527a, this.f32528b, this.f32529c);
    }
}
