package com.p019vk.push.common.messaging.interceptor;

import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m22267d2 = {"Lcom/vk/push/common/messaging/interceptor/PushInterceptorStore;", "", "Lcom/vk/push/common/messaging/interceptor/PushInterceptor;", "pushInterceptor", "LTf1;", "addPushInterceptor", "(Lcom/vk/push/common/messaging/interceptor/PushInterceptor;)V", "removePushInterceptor", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface PushInterceptorStore {
    void addPushInterceptor(PushInterceptor pushInterceptor);

    void removePushInterceptor(PushInterceptor pushInterceptor);
}
