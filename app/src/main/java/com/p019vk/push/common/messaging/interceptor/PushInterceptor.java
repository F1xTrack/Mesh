package com.p019vk.push.common.messaging.interceptor;

import com.p019vk.push.common.messaging.RemoteMessage;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m22267d2 = {"Lcom/vk/push/common/messaging/interceptor/PushInterceptor;", "", "onIntercept", "", "remoteMessage", "Lcom/vk/push/common/messaging/RemoteMessage;", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface PushInterceptor {
    boolean onIntercept(RemoteMessage remoteMessage);
}
