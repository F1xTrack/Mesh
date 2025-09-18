package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* renamed from: Lr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0930Lr1 extends BaseAnalyticsEvent {
    public final RemoteMessage b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0930Lr1(RemoteMessage remoteMessage) {
        super("vkcm_sdk_client_receive_push");
        O90.f(remoteMessage, "message");
        this.b = remoteMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0930Lr1) && O90.a(this.b, ((C0930Lr1) obj).b);
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C2391bn0 c2391bn0 = new C2391bn0();
        RemoteMessage remoteMessage = this.b;
        ExtensionsKt.setPushToken(c2391bn0, remoteMessage.getToken());
        ExtensionsKt.setPushId(c2391bn0, remoteMessage.getToken(), remoteMessage.getMessageId());
        return c2391bn0.b();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PushReceiveAnalyticsEvent(message=" + this.b + ')';
    }
}
