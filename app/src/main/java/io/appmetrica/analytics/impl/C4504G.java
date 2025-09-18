package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import ru.p031ok.tracer.base.deviceid.DeviceIdUtils;

/* renamed from: io.appmetrica.analytics.impl.G */
/* loaded from: classes2.dex */
public final class C4504G implements InterfaceC4431D {

    /* renamed from: a */
    public final InterfaceC4431D f30155a;

    public C4504G(InterfaceC4431D interfaceC4431D) {
        this.f30155a = interfaceC4431D;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4431D
    /* renamed from: a */
    public final AdTrackingInfoResult mo19304a(Context context) {
        return m19426a(new C4456E(this, context));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4431D
    /* renamed from: a */
    public final AdTrackingInfoResult mo19305a(Context context, InterfaceC4905Wh interfaceC4905Wh) {
        return m19426a(new C4480F(this, context, interfaceC4905Wh));
    }

    /* renamed from: a */
    public static AdTrackingInfoResult m19426a(Provider provider) {
        AdTrackingInfoResult adTrackingInfoResult = (AdTrackingInfoResult) provider.get();
        AdTrackingInfo adTrackingInfo = adTrackingInfoResult.mAdTrackingInfo;
        return (adTrackingInfo == null || !DeviceIdUtils.NULL_UUID.equals(adTrackingInfo.advId)) ? adTrackingInfoResult : new AdTrackingInfoResult(null, IdentifierStatus.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }
}
