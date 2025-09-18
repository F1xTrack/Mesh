package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;

/* renamed from: io.appmetrica.analytics.impl.Db */
/* loaded from: classes2.dex */
public interface InterfaceC4443Db extends LocationServiceApi {
    /* renamed from: a */
    void mo19323a(Object obj);

    /* renamed from: a */
    void mo19324a(boolean z);

    /* renamed from: b */
    void mo19325b(Object obj);

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    Location getLocation();

    void init();
}
