package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* renamed from: io.appmetrica.analytics.impl.a1 */
/* loaded from: classes2.dex */
public final class RunnableC4985a1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ExternalAttribution f31234a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f31235b;

    public RunnableC4985a1(C5185i1 c5185i1, ExternalAttribution externalAttribution) {
        this.f31235b = c5185i1;
        this.f31234a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5185i1.m20518a(this.f31235b).mo19404a(this.f31234a);
    }
}
