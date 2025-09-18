package com.vk.push.common.analytics;

import defpackage.O90;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/vk/push/common/analytics/BaseAnalyticsEvent;", "", "", "eventName", "<init>", "(Ljava/lang/String;)V", "", "getParams", "()Ljava/util/Map;", "a", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseAnalyticsEvent {

    /* renamed from: a, reason: from kotlin metadata */
    public final String eventName;

    public BaseAnalyticsEvent(String str) {
        O90.f(str, "eventName");
        this.eventName = str;
    }

    public String getEventName() {
        return this.eventName;
    }

    public abstract Map<String, String> getParams();
}
