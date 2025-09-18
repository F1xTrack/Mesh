package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.Nc */
/* loaded from: classes2.dex */
public final class C4685Nc extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C4780Rc f30507a;

    /* renamed from: b */
    public final /* synthetic */ AdRevenue f30508b;

    /* renamed from: c */
    public final /* synthetic */ boolean f30509c;

    public C4685Nc(C4780Rc c4780Rc, AdRevenue adRevenue, boolean z) {
        this.f30507a = c4780Rc;
        this.f30508b = adRevenue;
        this.f30509c = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4780Rc.m19761a(this.f30507a).reportAdRevenue(this.f30508b, this.f30509c);
    }
}
