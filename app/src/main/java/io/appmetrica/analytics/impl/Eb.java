package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;

/* loaded from: classes2.dex */
public final class Eb implements Db, InterfaceC4702ll {
    public final Context a;
    public final Hb b;
    public final LocationClient c;
    public final C4916uk d;
    public final Aj e;
    public final LastKnownLocationExtractorProviderFactory f;
    public final LocationReceiverProviderFactory g;

    public Eb(Context context, Hb hb, LocationClient locationClient) {
        this.a = context;
        this.b = hb;
        this.c = locationClient;
        Mb mb = new Mb();
        this.d = new C4916uk(new C4806q5(mb, C4667ka.h().m().getAskForPermissionStrategy()));
        this.e = C4667ka.h().m();
        ((Kb) hb).a(mb, true);
        ((Kb) hb).a(locationClient, true);
        this.f = locationClient.getLastKnownExtractorProviderFactory();
        this.g = locationClient.getLocationReceiverProviderFactory();
    }

    public final C4916uk a() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.impl.Db
    public final void b(Object obj) {
        ((Kb) this.b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.impl.Db, io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final Location getLocation() {
        return this.c.getLocation();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.impl.Db
    public final void init() {
        this.c.init(this.a, this.d, C4667ka.C.d.c(), this.e.d());
        ModuleLocationSourcesServiceController moduleLocationSourcesServiceControllerE = this.e.e();
        if (moduleLocationSourcesServiceControllerE != null) {
            moduleLocationSourcesServiceControllerE.init();
        } else {
            LocationClient locationClient = this.c;
            locationClient.registerLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.c;
            locationClient2.registerLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((Kb) this.b).a(this.e.f());
        C4667ka.C.u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(LocationControllerObserver locationControllerObserver) {
        ((Kb) this.b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.c.registerLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.c.unregisterLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(LocationFilter locationFilter) {
        this.c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4702ll
    public final void a(C4583gl c4583gl) {
        C4899u3 c4899u3 = c4583gl.y;
        if (c4899u3 != null) {
            long j = c4899u3.a;
            this.c.updateCacheArguments(new CacheArguments(j, 2 * j));
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LocationReceiverProvider locationReceiverProvider) {
        this.c.registerLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LocationReceiverProvider locationReceiverProvider) {
        this.c.unregisterLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.Db
    public final void a(Object obj) {
        ((Kb) this.b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.Db
    public final void a(boolean z) {
        ((Kb) this.b).a(z);
    }
}
