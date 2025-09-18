package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes2.dex */
public final class K0 implements Runnable {
    public final /* synthetic */ UserProfile a;
    public final /* synthetic */ C4611i1 b;

    public K0(C4611i1 c4611i1, UserProfile userProfile) {
        this.b = c4611i1;
        this.a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4611i1.a(this.b).reportUserProfile(this.a);
    }
}
