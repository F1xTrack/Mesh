package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.Li */
/* loaded from: classes2.dex */
public final class C4643Li implements InterfaceC4683Na {

    /* renamed from: a */
    public final /* synthetic */ UserProfile f30452a;

    public C4643Li(UserProfile userProfile) {
        this.f30452a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4683Na
    /* renamed from: a */
    public final void mo19451a(InterfaceC4707Oa interfaceC4707Oa) {
        interfaceC4707Oa.reportUserProfile(this.f30452a);
    }
}
