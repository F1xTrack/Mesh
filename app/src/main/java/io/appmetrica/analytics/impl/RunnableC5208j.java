package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.j */
/* loaded from: classes2.dex */
public final class RunnableC5208j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f31952a;

    /* renamed from: b */
    public final /* synthetic */ C5258l f31953b;

    public RunnableC5208j(C5258l c5258l, Activity activity) {
        this.f31953b = c5258l;
        this.f31952a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31953b.m20661a(this.f31952a);
    }
}
