package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.K */
/* loaded from: classes2.dex */
public final class CallableC4600K implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f30377a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC4905Wh f30378b;

    /* renamed from: c */
    public final /* synthetic */ C4791S f30379c;

    public CallableC4600K(C4791S c4791s, Context context, InterfaceC4905Wh interfaceC4905Wh) {
        this.f30379c = c4791s;
        this.f30377a = context;
        this.f30378b = interfaceC4905Wh;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AdvertisingIdsHolder advertisingIdsHolder = this.f30379c.f30718m;
        C4791S c4791s = this.f30379c;
        AdTrackingInfoResult adTrackingInfoResultM19788a = C4791S.m19788a(c4791s, this.f30377a);
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = adTrackingInfoResultM19788a.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.OK;
        if (identifierStatus != identifierStatus2) {
            adTrackingInfoResultM19788a = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, adTrackingInfoResultM19788a.mErrorExplanation);
        }
        AdTrackingInfoResult adTrackingInfoResultM19789b = C4791S.m19789b(this.f30379c, this.f30377a);
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = adTrackingInfoResultM19789b.mStatus;
        if (identifierStatus3 != identifierStatus2) {
            adTrackingInfoResultM19789b = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, adTrackingInfoResultM19789b.mErrorExplanation);
        }
        C4791S c4791s2 = this.f30379c;
        AdTrackingInfoResult adTrackingInfoResultMo19305a = c4791s2.f30712g.mo19560a(c4791s2.f30708c) ? c4791s2.f30715j.mo19305a(this.f30377a, this.f30378b) : new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = adTrackingInfoResultMo19305a.mStatus;
        if (identifierStatus4 != identifierStatus2) {
            adTrackingInfoResultMo19305a = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, adTrackingInfoResultMo19305a.mErrorExplanation);
        }
        c4791s.f30718m = new AdvertisingIdsHolder(adTrackingInfoResultM19788a, adTrackingInfoResultM19789b, adTrackingInfoResultMo19305a);
        return null;
    }
}
