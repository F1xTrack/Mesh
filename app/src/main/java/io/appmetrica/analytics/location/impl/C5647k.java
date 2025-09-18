package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.location.impl.k */
/* loaded from: classes2.dex */
public final class C5647k implements ILastKnownUpdater, LocationControllerObserver {

    /* renamed from: a */
    public final Context f32969a;

    /* renamed from: b */
    public final PermissionExtractor f32970b;

    /* renamed from: c */
    public final C5652p f32971c;

    /* renamed from: d */
    public final IHandlerExecutor f32972d;

    /* renamed from: e */
    public final C5650n f32973e;

    /* renamed from: f */
    public final LocationDataCacheUpdateScheduler f32974f;

    /* renamed from: g */
    public boolean f32975g;

    /* renamed from: h */
    public final HashMap f32976h = new HashMap();

    /* renamed from: i */
    public final HashMap f32977i = new HashMap();

    public C5647k(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, C5652p c5652p) {
        this.f32969a = context;
        this.f32971c = c5652p;
        this.f32970b = permissionExtractor;
        this.f32972d = iHandlerExecutor;
        this.f32973e = new C5650n(c5652p);
        LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, c5652p.m21273a(), "loc");
        this.f32974f = locationDataCacheUpdateScheduler;
        c5652p.m21273a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    /* renamed from: a */
    public final Location m21262a() {
        return (Location) this.f32971c.f32988b.getData();
    }

    /* renamed from: b */
    public final synchronized void m21266b() {
        try {
            this.f32974f.startUpdates();
            Iterator it = this.f32977i.values().iterator();
            while (it.hasNext()) {
                ((LocationReceiver) it.next()).startLocationUpdates();
            }
            updateLastKnown();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized void m21269c() {
        this.f32974f.stopUpdates();
        Iterator it = this.f32977i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f32975g) {
            this.f32975g = true;
            m21266b();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f32975g) {
            this.f32975g = false;
            m21269c();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        Iterator it = this.f32976h.values().iterator();
        while (it.hasNext()) {
            ((LastKnownLocationExtractor) it.next()).updateLastKnownLocation();
        }
    }

    /* renamed from: a */
    public final void m21263a(C5645i c5645i) {
        this.f32972d.execute(new RunnableC5646j(this, c5645i));
    }

    /* renamed from: a */
    public final synchronized void m21264a(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f32969a, this.f32970b, this.f32972d, this.f32973e);
        this.f32976h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f32975g) {
            extractor.updateLastKnownLocation();
        }
    }

    /* renamed from: b */
    public final synchronized void m21267b(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f32976h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    /* renamed from: b */
    public final synchronized void m21268b(LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = (LocationReceiver) this.f32977i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f32975g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    /* renamed from: a */
    public final synchronized void m21265a(LocationReceiverProvider locationReceiverProvider) {
        try {
            LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f32969a, this.f32970b, this.f32972d, this.f32973e);
            LocationReceiver locationReceiver2 = (LocationReceiver) this.f32977i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
            if (this.f32975g) {
                if (locationReceiver2 != null) {
                    locationReceiver2.stopLocationUpdates();
                }
                locationReceiver.startLocationUpdates();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
