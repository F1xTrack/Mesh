package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes2.dex */
public final class Li implements Na {
    public final /* synthetic */ UserProfile a;

    public Li(UserProfile userProfile) {
        this.a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(Oa oa) {
        oa.reportUserProfile(this.a);
    }
}
