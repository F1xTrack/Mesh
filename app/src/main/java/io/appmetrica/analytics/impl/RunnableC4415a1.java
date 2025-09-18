package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4415a1 implements Runnable {
    public final /* synthetic */ ExternalAttribution a;
    public final /* synthetic */ C4611i1 b;

    public RunnableC4415a1(C4611i1 c4611i1, ExternalAttribution externalAttribution) {
        this.b = c4611i1;
        this.a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4611i1.a(this.b).a(this.a);
    }
}
