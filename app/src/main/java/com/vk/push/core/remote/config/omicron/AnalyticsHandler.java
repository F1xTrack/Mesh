package com.vk.push.core.remote.config.omicron;

import java.io.IOException;

/* loaded from: classes2.dex */
public interface AnalyticsHandler {
    void onCacheHit(DataId dataId, boolean z);

    void onCacheMiss(DataId dataId);

    void onCacheUpdated(DataId dataId);

    void onConfigReceivedFromNetwork(String str);

    void onConfigRequestEnded(int i);

    void onConfigRequestFailedWithException(Throwable th);

    void onConfigRequestStarted(String str);

    void onGetDataError(Throwable th, String str);

    void onHandledException(Throwable th);

    void onResponseError(DataId dataId, int i);

    void onResponseIOException(DataId dataId, IOException iOException);

    void onResponseNotModified(DataId dataId);

    void onResponseParseException(DataId dataId, ParseException parseException);

    void onResponseSuccess(DataId dataId);

    void onWaitForActualOnTime(DataId dataId);

    void onWaitForActualTimeout(DataId dataId);
}
