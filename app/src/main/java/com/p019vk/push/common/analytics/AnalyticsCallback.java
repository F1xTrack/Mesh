package com.p019vk.push.common.analytics;

import java.util.Map;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m22267d2 = {"Lcom/vk/push/common/analytics/AnalyticsCallback;", "", "", "eventName", "", "params", "LTf1;", "onAnalyticsEvent", "(Ljava/lang/String;Ljava/util/Map;)V", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface AnalyticsCallback {
    void onAnalyticsEvent(String eventName, Map<String, String> params);
}
