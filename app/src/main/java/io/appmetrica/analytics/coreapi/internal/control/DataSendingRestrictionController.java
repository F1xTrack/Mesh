package io.appmetrica.analytics.coreapi.internal.control;

import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m22267d2 = {"Lio/appmetrica/analytics/coreapi/internal/control/DataSendingRestrictionController;", "", "isRestrictedForBackgroundDataCollection", "", "()Z", "isRestrictedForReporter", "isRestrictedForSdk", "core-api_release"}, m22268k = 1, m22269mv = {1, 6, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface DataSendingRestrictionController {
    boolean isRestrictedForBackgroundDataCollection();

    boolean isRestrictedForReporter();

    boolean isRestrictedForSdk();
}
