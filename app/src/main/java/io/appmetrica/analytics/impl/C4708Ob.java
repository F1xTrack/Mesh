package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;

/* renamed from: io.appmetrica.analytics.impl.Ob */
/* loaded from: classes2.dex */
public final class C4708Ob implements LocationReceiverProviderFactory {

    /* renamed from: a */
    public final C4732Pb f30554a = new C4732Pb();

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.f30554a;
    }
}
