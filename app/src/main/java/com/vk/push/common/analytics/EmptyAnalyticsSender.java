package com.vk.push.common.analytics;

import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/vk/push/common/analytics/EmptyAnalyticsSender;", "Lcom/vk/push/common/analytics/AnalyticsSender;", "<init>", "()V", "Lcom/vk/push/common/analytics/BaseAnalyticsEvent;", "event", "LTf1;", "send", "(Lcom/vk/push/common/analytics/BaseAnalyticsEvent;)V", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class EmptyAnalyticsSender implements AnalyticsSender {
    @Override // com.vk.push.common.analytics.AnalyticsSender
    public void send(BaseAnalyticsEvent event) {
        O90.f(event, "event");
    }
}
