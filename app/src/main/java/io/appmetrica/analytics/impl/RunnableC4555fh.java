package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.fh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4555fh implements Runnable {
    public final /* synthetic */ UserProfile a;
    public final /* synthetic */ C5009yh b;

    public RunnableC4555fh(C5009yh c5009yh, UserProfile userProfile) {
        this.b = c5009yh;
        this.a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5009yh c5009yh = this.b;
        C5009yh.a(c5009yh.a, c5009yh.d, c5009yh.e).reportUserProfile(this.a);
    }
}
