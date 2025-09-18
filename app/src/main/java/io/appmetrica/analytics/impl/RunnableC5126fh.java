package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.fh */
/* loaded from: classes2.dex */
public final class RunnableC5126fh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UserProfile f31688a;

    /* renamed from: b */
    public final /* synthetic */ C5601yh f31689b;

    public RunnableC5126fh(C5601yh c5601yh, UserProfile userProfile) {
        this.f31689b = c5601yh;
        this.f31688a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f31689b;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).reportUserProfile(this.f31688a);
    }
}
