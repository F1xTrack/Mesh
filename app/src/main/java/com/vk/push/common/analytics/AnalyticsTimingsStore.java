package com.vk.push.common.analytics;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0005\u001a\u00020\u00042\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\u0005\u0010\rJ\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vk/push/common/analytics/AnalyticsTimingsStore;", "", "", "key", "LTf1;", "storeTiming", "(Ljava/lang/String;)V", "", "getTimePassed", "(Ljava/lang/String;)J", "Ljava/lang/Class;", "Lcom/vk/push/common/analytics/BaseAnalyticsEvent;", "event", "(Ljava/lang/Class;)V", "(Ljava/lang/Class;)J", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface AnalyticsTimingsStore {
    long getTimePassed(Class<? extends BaseAnalyticsEvent> event);

    long getTimePassed(String key);

    void storeTiming(Class<? extends BaseAnalyticsEvent> event);

    void storeTiming(String key);
}
