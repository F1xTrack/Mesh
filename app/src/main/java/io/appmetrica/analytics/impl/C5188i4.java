package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* renamed from: io.appmetrica.analytics.impl.i4 */
/* loaded from: classes2.dex */
public final class C5188i4 {

    /* renamed from: a */
    public final C4428Cl f31899a;

    /* renamed from: b */
    public final C4791S f31900b;

    /* renamed from: c */
    public final Context f31901c;

    public C5188i4(C4428Cl c4428Cl, C4791S c4791s, Context context) {
        this.f31899a = c4428Cl;
        this.f31900b = c4791s;
        this.f31901c = context;
    }

    /* renamed from: a */
    public final C5163h4 m20564a(HashMap map) throws ExecutionException, InterruptedException {
        C5155gl c5155glM19299e = this.f31899a.m19299e();
        C4791S c4791s = this.f31900b;
        Context context = this.f31901c;
        c4791s.getClass();
        AdvertisingIdsHolder advertisingIdsHolderMo19792a = c4791s.mo19792a(context, new C5447sd());
        return new C5163h4(C5163h4.m20484a(c5155glM19299e.f31785d), C5163h4.m20484a(c5155glM19299e.f31782a), C5163h4.m20484a(c5155glM19299e.f31783b), C5163h4.m20484a(c5155glM19299e.f31791j), C5163h4.m20484a(c5155glM19299e.f31790i), C5163h4.m20484a(AbstractC5020bb.m20170a(AbstractC4550Hl.m19476a(c5155glM19299e.f31792k))), C5163h4.m20484a(AbstractC5020bb.m20170a(map)), new IdentifiersResult(advertisingIdsHolderMo19792a.getGoogle().mAdTrackingInfo == null ? null : advertisingIdsHolderMo19792a.getGoogle().mAdTrackingInfo.advId, advertisingIdsHolderMo19792a.getGoogle().mStatus, advertisingIdsHolderMo19792a.getGoogle().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderMo19792a.getHuawei().mAdTrackingInfo == null ? null : advertisingIdsHolderMo19792a.getHuawei().mAdTrackingInfo.advId, advertisingIdsHolderMo19792a.getHuawei().mStatus, advertisingIdsHolderMo19792a.getHuawei().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderMo19792a.getYandex().mAdTrackingInfo != null ? advertisingIdsHolderMo19792a.getYandex().mAdTrackingInfo.advId : null, advertisingIdsHolderMo19792a.getYandex().mStatus, advertisingIdsHolderMo19792a.getYandex().mErrorExplanation), C5163h4.m20484a(AbstractC5020bb.m20171a(c5155glM19299e.f31789h)), AbstractC4479Em.m19397a(), c5155glM19299e.f31796o + c5155glM19299e.f31779A.f30111a, C5163h4.m20482a(c5155glM19299e.f31795n.f32912f), new Bundle());
    }
}
