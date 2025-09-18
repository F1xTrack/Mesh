package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* loaded from: classes2.dex */
public final class Y0 implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ StartupParamsCallback b;
    public final /* synthetic */ List c;
    public final /* synthetic */ C4611i1 d;

    public Y0(C4611i1 c4611i1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.d = c4611i1;
        this.a = context;
        this.b = startupParamsCallback;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4753o0 c4753o0 = this.d.a;
        Context applicationContext = this.a.getApplicationContext();
        c4753o0.getClass();
        C4729n0 c4729n0A = C4729n0.a(applicationContext, false);
        c4729n0A.k().a(this.b, this.c);
    }
}
