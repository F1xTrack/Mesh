package io.appmetrica.analytics.impl;

import android.content.Intent;

/* renamed from: io.appmetrica.analytics.impl.E0 */
/* loaded from: classes2.dex */
public final class RunnableC4457E0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f30046a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f30047b;

    public RunnableC4457E0(C5185i1 c5185i1, Intent intent) {
        this.f30047b = c5185i1;
        this.f30046a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5616z7 c5616z7 = this.f30047b.m20557d().f31105b;
        Intent intent = this.f30046a;
        c5616z7.getClass();
        if (intent != null) {
            c5616z7.m21232a(intent.getDataString(), false);
        }
    }
}
