package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes2.dex */
public final class Eh implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Gh b;

    public Eh(Gh gh, Context context) {
        this.b = gh;
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4753o0 c4753o0 = this.b.b;
        Context context = this.a;
        c4753o0.getClass();
        C4729n0.a(context, false);
    }
}
