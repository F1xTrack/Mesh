package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* renamed from: io.appmetrica.analytics.impl.i4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4614i4 {
    public final Cl a;
    public final S b;
    public final Context c;

    public C4614i4(Cl cl2, S s, Context context) {
        this.a = cl2;
        this.b = s;
        this.c = context;
    }

    public final C4590h4 a(HashMap map) throws ExecutionException, InterruptedException {
        C4583gl c4583glE = this.a.e();
        S s = this.b;
        Context context = this.c;
        s.getClass();
        AdvertisingIdsHolder advertisingIdsHolderA = s.a(context, new C4861sd());
        return new C4590h4(C4590h4.a(c4583glE.d), C4590h4.a(c4583glE.a), C4590h4.a(c4583glE.b), C4590h4.a(c4583glE.j), C4590h4.a(c4583glE.i), C4590h4.a(AbstractC4450bb.a(Hl.a(c4583glE.k))), C4590h4.a(AbstractC4450bb.a(map)), new IdentifiersResult(advertisingIdsHolderA.getGoogle().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getGoogle().mAdTrackingInfo.advId, advertisingIdsHolderA.getGoogle().mStatus, advertisingIdsHolderA.getGoogle().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderA.getHuawei().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getHuawei().mAdTrackingInfo.advId, advertisingIdsHolderA.getHuawei().mStatus, advertisingIdsHolderA.getHuawei().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderA.getYandex().mAdTrackingInfo != null ? advertisingIdsHolderA.getYandex().mAdTrackingInfo.advId : null, advertisingIdsHolderA.getYandex().mStatus, advertisingIdsHolderA.getYandex().mErrorExplanation), C4590h4.a(AbstractC4450bb.a(c4583glE.h)), Em.a(), c4583glE.o + c4583glE.A.a, C4590h4.a(c4583glE.n.f), new Bundle());
    }
}
