package io.appmetrica.analytics.impl;

import android.content.Intent;

/* renamed from: io.appmetrica.analytics.impl.C0 */
/* loaded from: classes2.dex */
public final class RunnableC4407C0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f29921a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f29922b;

    public RunnableC4407C0(C5185i1 c5185i1, Intent intent) {
        this.f29922b = c5185i1;
        this.f29921a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5616z7 c5616z7 = this.f29922b.m20557d().f31105b;
        Intent intent = this.f29921a;
        c5616z7.getClass();
        if (intent != null) {
            c5616z7.m21232a(intent.getDataString(), false);
        }
    }
}
