package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes2.dex */
public final class P5 extends BaseRequestConfig.DataSource {
    public final C4583gl a;
    public final SdkEnvironmentProvider b;

    public P5(C4583gl c4583gl, SdkEnvironmentProvider sdkEnvironmentProvider, PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c4583gl.e(), c4583gl.a(), c4583gl.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.a = c4583gl;
        this.b = sdkEnvironmentProvider;
    }
}
