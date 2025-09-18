package com.p019vk.push.core.remote.config.omicron;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class DefaultAnalyticsHandler implements AnalyticsHandler {
    @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onCacheHit(DataId dataId, boolean z) {
    }

    @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onCacheMiss(DataId dataId) {
    }

    @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onCacheUpdated(DataId dataId) {
    }

    @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onConfigReceivedFromNetwork(String str) {
    }

    @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onConfigRequestEnded(int i) {
    }

    @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onConfigRequestFailedWithException(Throwable th) {
    }

    @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onConfigRequestStarted(String str) {
    }

    @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onGetDataError(Throwable th, String str) {
    }

    @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onHandledException(Throwable th) {
    }

    @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onResponseError(DataId dataId, int i) {
    }

    @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onResponseIOException(DataId dataId, IOException iOException) {
    }

    @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onResponseNotModified(DataId dataId) {
    }

    @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onResponseParseException(DataId dataId, ParseException parseException) {
    }

    @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onResponseSuccess(DataId dataId) {
    }

    @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onWaitForActualOnTime(DataId dataId) {
    }

    @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onWaitForActualTimeout(DataId dataId) {
    }
}
