package defpackage;

import com.vk.push.common.ads.AdsConstants;
import com.vk.push.common.component.TopicComponent;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.common.messaging.interceptor.PushInterceptor;

/* renamed from: Bq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0148Bq1 implements PushInterceptor {
    public final TopicComponent a;

    public C0148Bq1(TopicComponent topicComponent) {
        O90.f(topicComponent, "topicComponent");
        this.a = topicComponent;
    }

    @Override // com.vk.push.common.messaging.interceptor.PushInterceptor
    public final boolean onIntercept(RemoteMessage remoteMessage) {
        O90.f(remoteMessage, "remoteMessage");
        boolean zA = O90.a(remoteMessage.getFrom(), AdsConstants.ADS_TOPIC_NAME);
        if (zA) {
            this.a.unsubscribeFromTopic(AdsConstants.ADS_TOPIC_NAME);
        }
        return zA;
    }
}
