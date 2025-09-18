package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;

/* renamed from: io.appmetrica.analytics.impl.Pb */
/* loaded from: classes2.dex */
public final class C4732Pb implements LocationReceiverProvider {

    /* renamed from: a */
    public final String f30612a = "Location receiver stub";

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    public final String getIdentifier() {
        return this.f30612a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider
    public final LocationReceiver getLocationReceiver(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return new C4756Qb();
    }
}
