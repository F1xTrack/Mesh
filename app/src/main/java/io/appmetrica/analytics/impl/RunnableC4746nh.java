package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* renamed from: io.appmetrica.analytics.impl.nh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4746nh implements Runnable {
    public final /* synthetic */ ModuleEvent a;
    public final /* synthetic */ C5009yh b;

    public RunnableC4746nh(C5009yh c5009yh, ModuleEvent moduleEvent) {
        this.b = c5009yh;
        this.a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5009yh c5009yh = this.b;
        C5009yh.a(c5009yh.a, c5009yh.d, c5009yh.e).reportEvent(this.a);
    }
}
