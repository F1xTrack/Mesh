package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.J */
/* loaded from: classes2.dex */
public final class CallableC4576J implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C4791S f30325a;

    public CallableC4576J(C4791S c4791s) {
        this.f30325a = c4791s;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C4791S c4791s = this.f30325a;
        AdTrackingInfoResult adTrackingInfoResultM19788a = C4791S.m19788a(c4791s, c4791s.f30716k);
        C4791S c4791s2 = this.f30325a;
        AdTrackingInfoResult adTrackingInfoResultM19789b = C4791S.m19789b(c4791s2, c4791s2.f30716k);
        C4791S c4791s3 = this.f30325a;
        c4791s.f30718m = new AdvertisingIdsHolder(adTrackingInfoResultM19788a, adTrackingInfoResultM19789b, c4791s3.f30712g.mo19560a(c4791s3.f30708c) ? c4791s3.f30715j.mo19305a(c4791s3.f30716k, new C5447sd()) : new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "identifiers collecting is forbidden for unknown reason"));
        return null;
    }
}
