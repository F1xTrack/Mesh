package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;

/* loaded from: classes2.dex */
public interface Db extends LocationServiceApi {
    void a(Object obj);

    void a(boolean z);

    void b(Object obj);

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    Location getLocation();

    void init();
}
