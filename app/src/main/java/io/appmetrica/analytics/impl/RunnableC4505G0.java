package io.appmetrica.analytics.impl;

import android.location.Location;

/* renamed from: io.appmetrica.analytics.impl.G0 */
/* loaded from: classes2.dex */
public final class RunnableC4505G0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Location f30156a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f30157b;

    public RunnableC4505G0(C5185i1 c5185i1, Location location) {
        this.f30157b = c5185i1;
        this.f30156a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5334o0 c5334o0 = this.f30157b.f31880a;
        Location location = this.f30156a;
        c5334o0.getClass();
        C5309n0.m20768g().mo19312a(location);
    }
}
