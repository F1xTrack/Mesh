package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;

/* renamed from: io.appmetrica.analytics.location.impl.e */
/* loaded from: classes2.dex */
public final class C5641e implements InterfaceC5655s {
    @Override // io.appmetrica.analytics.location.impl.InterfaceC5655s
    /* renamed from: a */
    public final PermissionResolutionStrategy mo21260a(PermissionExtractor permissionExtractor) {
        return new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_FINE_LOCATION");
    }
}
