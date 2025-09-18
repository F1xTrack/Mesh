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

/* renamed from: io.appmetrica.analytics.impl.Eb */
/* loaded from: classes2.dex */
public final class C4468Eb implements InterfaceC4443Db, InterfaceC5280ll {

    /* renamed from: a */
    public final Context f30061a;

    /* renamed from: b */
    public final InterfaceC4540Hb f30062b;

    /* renamed from: c */
    public final LocationClient f30063c;

    /* renamed from: d */
    public final C5504uk f30064d;

    /* renamed from: e */
    public final C4376Aj f30065e;

    /* renamed from: f */
    public final LastKnownLocationExtractorProviderFactory f30066f;

    /* renamed from: g */
    public final LocationReceiverProviderFactory f30067g;

    public C4468Eb(Context context, InterfaceC4540Hb interfaceC4540Hb, LocationClient locationClient) {
        this.f30061a = context;
        this.f30062b = interfaceC4540Hb;
        this.f30063c = locationClient;
        C4660Mb c4660Mb = new C4660Mb();
        this.f30064d = new C5504uk(new C5389q5(c4660Mb, C5244ka.m20614h().m20628m().getAskForPermissionStrategy()));
        this.f30065e = C5244ka.m20614h().m20628m();
        ((C4612Kb) interfaceC4540Hb).m19551a(c4660Mb, true);
        ((C4612Kb) interfaceC4540Hb).m19551a(locationClient, true);
        this.f30066f = locationClient.getLastKnownExtractorProviderFactory();
        this.f30067g = locationClient.getLocationReceiverProviderFactory();
    }

    /* renamed from: a */
    public final C5504uk m19350a() {
        return this.f30064d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4443Db
    /* renamed from: b */
    public final void mo19325b(Object obj) {
        ((C4612Kb) this.f30062b).m19552a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f30066f;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4443Db, io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final Location getLocation() {
        return this.f30063c.getLocation();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f30067g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f30064d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4443Db
    public final void init() {
        this.f30063c.init(this.f30061a, this.f30064d, C5244ka.f32038C.f32044d.m21140c(), this.f30065e.mo19193d());
        ModuleLocationSourcesServiceController moduleLocationSourcesServiceControllerMo19194e = this.f30065e.mo19194e();
        if (moduleLocationSourcesServiceControllerMo19194e != null) {
            moduleLocationSourcesServiceControllerMo19194e.init();
        } else {
            LocationClient locationClient = this.f30063c;
            locationClient.registerLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.f30063c;
            locationClient2.registerLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((C4612Kb) this.f30062b).m19550a(this.f30065e.mo19195f());
        C5244ka.f32038C.f32061u.m20579a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(LocationControllerObserver locationControllerObserver) {
        ((C4612Kb) this.f30062b).m19551a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f30063c.registerLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f30063c.unregisterLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(LocationFilter locationFilter) {
        this.f30063c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5280ll
    /* renamed from: a */
    public final void mo19206a(C5155gl c5155gl) {
        C5487u3 c5487u3 = c5155gl.f31806y;
        if (c5487u3 != null) {
            long j = c5487u3.f32671a;
            this.f30063c.updateCacheArguments(new CacheArguments(j, 2 * j));
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LocationReceiverProvider locationReceiverProvider) {
        this.f30063c.registerLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LocationReceiverProvider locationReceiverProvider) {
        this.f30063c.unregisterLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4443Db
    /* renamed from: a */
    public final void mo19323a(Object obj) {
        ((C4612Kb) this.f30062b).m19554b(obj);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4443Db
    /* renamed from: a */
    public final void mo19324a(boolean z) {
        ((C4612Kb) this.f30062b).m19553a(z);
    }
}
