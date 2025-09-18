package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.P5 */
/* loaded from: classes2.dex */
public final class C4726P5 extends BaseRequestConfig.DataSource {

    /* renamed from: a */
    public final C5155gl f30602a;

    /* renamed from: b */
    public final SdkEnvironmentProvider f30603b;

    public C4726P5(C5155gl c5155gl, SdkEnvironmentProvider sdkEnvironmentProvider, PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c5155gl.m20469e(), c5155gl.m20465a(), c5155gl.m20466b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f30602a = c5155gl;
        this.f30603b = sdkEnvironmentProvider;
    }
}
