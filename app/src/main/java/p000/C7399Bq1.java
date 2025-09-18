package p000;

import com.p019vk.push.common.ads.AdsConstants;
import com.p019vk.push.common.component.TopicComponent;
import com.p019vk.push.common.messaging.RemoteMessage;
import com.p019vk.push.common.messaging.interceptor.PushInterceptor;

/* renamed from: Bq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7399Bq1 implements PushInterceptor {

    /* renamed from: a */
    public final TopicComponent f1054a;

    public C7399Bq1(TopicComponent topicComponent) {
        O90.m5968f(topicComponent, "topicComponent");
        this.f1054a = topicComponent;
    }

    @Override // com.p019vk.push.common.messaging.interceptor.PushInterceptor
    public final boolean onIntercept(RemoteMessage remoteMessage) {
        O90.m5968f(remoteMessage, "remoteMessage");
        boolean zM5963a = O90.m5963a(remoteMessage.getFrom(), AdsConstants.ADS_TOPIC_NAME);
        if (zM5963a) {
            this.f1054a.unsubscribeFromTopic(AdsConstants.ADS_TOPIC_NAME);
        }
        return zM5963a;
    }
}
