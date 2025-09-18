package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;

/* renamed from: io.appmetrica.analytics.location.impl.g */
/* loaded from: classes2.dex */
public final class C5643g implements LastKnownLocationExtractorProviderFactory {

    /* renamed from: a */
    public final LastKnownLocationExtractorProvider f32960a;

    /* renamed from: b */
    public final C5639c f32961b = new C5639c("location-module-gpl");

    /* renamed from: c */
    public final C5658v f32962c = new C5658v("network", new C5642f(), "location-module-network");

    /* renamed from: d */
    public final C5658v f32963d = new C5658v("gps", new C5641e(), "location-module-gps");

    public C5643g(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f32960a = lastKnownLocationExtractorProvider;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider() {
        return this.f32961b;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider() {
        return this.f32963d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider() {
        return this.f32962c;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider() {
        return this.f32960a;
    }
}
