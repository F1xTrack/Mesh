package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import p000.O90;

/* renamed from: io.appmetrica.analytics.location.impl.q */
/* loaded from: classes2.dex */
public final class C5653q implements LastKnownLocationExtractorProvider, LocationReceiverProvider {

    /* renamed from: a */
    public final String f32992a = "location-passive-provider";

    /* renamed from: b */
    public C5654r f32993b;

    /* renamed from: a */
    public final C5654r m21274a(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return m21276c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    /* renamed from: b */
    public final C5654r m21275b(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return m21276c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    /* renamed from: c */
    public final synchronized C5654r m21276c(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        C5654r c5654r;
        try {
            if (this.f32993b == null) {
                this.f32993b = new C5654r(context, iHandlerExecutor.getLooper(), new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_FINE_LOCATION"), locationListener);
            }
            c5654r = this.f32993b;
            if (c5654r == null) {
                O90.m5977o("passiveProviderLocationReceiver");
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c5654r;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    public final LastKnownLocationExtractor getExtractor(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return m21276c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    public final String getIdentifier() {
        return this.f32992a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider
    public final LocationReceiver getLocationReceiver(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return m21276c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }
}
