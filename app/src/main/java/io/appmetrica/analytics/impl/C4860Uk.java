package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsItem;
import io.appmetrica.analytics.StartupParamsItemStatus;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.Uk */
/* loaded from: classes2.dex */
public final class C4860Uk {

    /* renamed from: a */
    public final C4908Wk f30833a = new C4908Wk();

    /* renamed from: a */
    public final StartupParamsItem m19894a(IdentifiersResult identifiersResult) {
        String str = identifiersResult.f32948id;
        C4908Wk c4908Wk = this.f30833a;
        IdentifierStatus identifierStatus = identifiersResult.status;
        c4908Wk.getClass();
        int i = AbstractC4884Vk.f30875a[identifierStatus.ordinal()];
        return new StartupParamsItem(str, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? StartupParamsItemStatus.UNKNOWN_ERROR : StartupParamsItemStatus.FEATURE_DISABLED : StartupParamsItemStatus.NETWORK_ERROR : StartupParamsItemStatus.INVALID_VALUE_FROM_PROVIDER : StartupParamsItemStatus.PROVIDER_UNAVAILABLE : StartupParamsItemStatus.OK, identifiersResult.errorExplanation);
    }
}
