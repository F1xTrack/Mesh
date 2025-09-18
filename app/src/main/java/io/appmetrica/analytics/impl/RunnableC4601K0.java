package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.K0 */
/* loaded from: classes2.dex */
public final class RunnableC4601K0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UserProfile f30380a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f30381b;

    public RunnableC4601K0(C5185i1 c5185i1, UserProfile userProfile) {
        this.f30381b = c5185i1;
        this.f30380a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5185i1.m20518a(this.f30381b).reportUserProfile(this.f30380a);
    }
}
