package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.Z0 */
/* loaded from: classes2.dex */
public final class RunnableC4960Z0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AnrListener f31135a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f31136b;

    public RunnableC4960Z0(C5185i1 c5185i1, AnrListener anrListener) {
        this.f31136b = c5185i1;
        this.f31135a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5185i1.m20518a(this.f31136b).mo19403a(this.f31135a);
    }
}
