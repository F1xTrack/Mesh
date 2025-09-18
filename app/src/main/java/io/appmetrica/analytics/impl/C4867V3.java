package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* renamed from: io.appmetrica.analytics.impl.V3 */
/* loaded from: classes2.dex */
public final class C4867V3 extends SimpleThreadSafeToggle {

    /* renamed from: a */
    public final C5398qe f30841a;

    public C4867V3(C5398qe c5398qe) {
        super(c5398qe.m20972e(), "[ClientApiTrackingStatusToggle]");
        this.f30841a = c5398qe;
    }

    /* renamed from: a */
    public final void m19901a(boolean z) {
        updateState(z);
        this.f30841a.m20971d(z);
    }
}
