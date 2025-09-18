package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.j */
/* loaded from: classes2.dex */
public final class RunnableC4632j implements Runnable {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ C4680l b;

    public RunnableC4632j(C4680l c4680l, Activity activity) {
        this.b = c4680l;
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
