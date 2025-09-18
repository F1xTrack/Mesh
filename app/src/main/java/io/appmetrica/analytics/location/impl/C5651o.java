package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;

/* renamed from: io.appmetrica.analytics.location.impl.o */
/* loaded from: classes2.dex */
public final class C5651o implements LocationReceiverProviderFactory {

    /* renamed from: a */
    public final C5653q f32986a;

    public C5651o(C5653q c5653q) {
        this.f32986a = c5653q;
    }

    /* renamed from: a */
    public final C5653q m21272a() {
        return this.f32986a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.f32986a;
    }
}
