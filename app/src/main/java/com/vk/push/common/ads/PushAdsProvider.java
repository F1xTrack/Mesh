package com.vk.push.common.ads;

import com.vk.push.common.analytics.AnalyticsSenderProvider;
import com.vk.push.common.component.PushTokenComponent;
import com.vk.push.common.component.TopicComponent;
import com.vk.push.common.logger.LoggerProvider;
import com.vk.push.common.messaging.interceptor.PushInterceptorStoreProvider;
import com.vk.push.common.token.OnNewPushTokenListenerStoreProvider;
import defpackage.Q81;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\u000b\u001a\u00020\n\"\u001c\b\u0000\u0010\b*\u00020\u0002*\u00020\u0003*\u00020\u0004*\u00020\u0005*\u00020\u0006*\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/vk/push/common/ads/PushAdsProvider;", "", "Lcom/vk/push/common/messaging/interceptor/PushInterceptorStoreProvider;", "Lcom/vk/push/common/component/TopicComponent;", "Lcom/vk/push/common/component/PushTokenComponent;", "Lcom/vk/push/common/token/OnNewPushTokenListenerStoreProvider;", "Lcom/vk/push/common/analytics/AnalyticsSenderProvider;", "Lcom/vk/push/common/logger/LoggerProvider;", "T", "target", "LTf1;", "bind", "(Lcom/vk/push/common/messaging/interceptor/PushInterceptorStoreProvider;)V", "", "isEnabled", "LQ81;", "setEnabled", "(Z)LQ81;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface PushAdsProvider {
    <T extends PushInterceptorStoreProvider & TopicComponent & PushTokenComponent & OnNewPushTokenListenerStoreProvider & AnalyticsSenderProvider & LoggerProvider> void bind(T target);

    Q81 setEnabled(boolean isEnabled);
}
