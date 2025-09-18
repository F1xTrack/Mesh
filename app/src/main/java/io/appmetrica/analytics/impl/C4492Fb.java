package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;

/* renamed from: io.appmetrica.analytics.impl.Fb */
/* loaded from: classes2.dex */
public final class C4492Fb implements InterfaceC4443Db {

    /* renamed from: a */
    public final C4686Nd f30128a = new C4686Nd();

    /* renamed from: b */
    public final C5345ob f30129b = new C5345ob();

    /* renamed from: c */
    public final C4708Ob f30130c = new C4708Ob();

    @Override // io.appmetrica.analytics.impl.InterfaceC4443Db
    /* renamed from: a */
    public final void mo19323a(Object obj) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4443Db
    /* renamed from: b */
    public final void mo19325b(Object obj) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f30129b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4443Db, io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final Location getLocation() {
        return null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f30130c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f30128a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4443Db
    public final void init() {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(LocationControllerObserver locationControllerObserver) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(LocationFilter locationFilter) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4443Db
    /* renamed from: a */
    public final void mo19324a(boolean z) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LocationReceiverProvider locationReceiverProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LocationReceiverProvider locationReceiverProvider) {
    }
}
