package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4440b1 implements Runnable {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ C4611i1 b;

    public RunnableC4440b1(C4611i1 c4611i1, Activity activity) {
        this.b = c4611i1;
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4611i1 c4611i1 = this.b;
        Zj zj = c4611i1.h;
        Activity activity = this.a;
        Fa fa = c4611i1.d().a;
        if (activity != null) {
            zj.f.a(activity);
        }
        if (zj.e.a(activity, EnumC4800q.PAUSED)) {
            fa.b(activity);
        }
    }
}
