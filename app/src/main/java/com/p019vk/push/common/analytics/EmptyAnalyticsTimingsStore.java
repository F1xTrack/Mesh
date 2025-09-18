package com.p019vk.push.common.analytics;

import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u0007\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u000e\u001a\u00020\r2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m22267d2 = {"Lcom/vk/push/common/analytics/EmptyAnalyticsTimingsStore;", "Lcom/vk/push/common/analytics/AnalyticsTimingsStore;", "<init>", "()V", "", "key", "LTf1;", "storeTiming", "(Ljava/lang/String;)V", "Ljava/lang/Class;", "Lcom/vk/push/common/analytics/BaseAnalyticsEvent;", "event", "(Ljava/lang/Class;)V", "", "getTimePassed", "(Ljava/lang/String;)J", "(Ljava/lang/Class;)J", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class EmptyAnalyticsTimingsStore implements AnalyticsTimingsStore {
    @Override // com.p019vk.push.common.analytics.AnalyticsTimingsStore
    public long getTimePassed(Class<? extends BaseAnalyticsEvent> event) {
        O90.m5968f(event, "event");
        return 0L;
    }

    @Override // com.p019vk.push.common.analytics.AnalyticsTimingsStore
    public void storeTiming(Class<? extends BaseAnalyticsEvent> event) {
        O90.m5968f(event, "event");
    }

    @Override // com.p019vk.push.common.analytics.AnalyticsTimingsStore
    public long getTimePassed(String key) {
        O90.m5968f(key, "key");
        return 0L;
    }

    @Override // com.p019vk.push.common.analytics.AnalyticsTimingsStore
    public void storeTiming(String key) {
        O90.m5968f(key, "key");
    }
}
