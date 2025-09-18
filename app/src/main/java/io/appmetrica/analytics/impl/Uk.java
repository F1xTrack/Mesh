package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsItem;
import io.appmetrica.analytics.StartupParamsItemStatus;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* loaded from: classes2.dex */
public final class Uk {
    public final Wk a = new Wk();

    public final StartupParamsItem a(IdentifiersResult identifiersResult) {
        String str = identifiersResult.id;
        Wk wk = this.a;
        IdentifierStatus identifierStatus = identifiersResult.status;
        wk.getClass();
        int i = Vk.a[identifierStatus.ordinal()];
        return new StartupParamsItem(str, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? StartupParamsItemStatus.UNKNOWN_ERROR : StartupParamsItemStatus.FEATURE_DISABLED : StartupParamsItemStatus.NETWORK_ERROR : StartupParamsItemStatus.INVALID_VALUE_FROM_PROVIDER : StartupParamsItemStatus.PROVIDER_UNAVAILABLE : StartupParamsItemStatus.OK, identifiersResult.errorExplanation);
    }
}
