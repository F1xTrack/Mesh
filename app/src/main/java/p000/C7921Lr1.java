package p000;

import com.p019vk.push.common.analytics.BaseAnalyticsEvent;
import com.p019vk.push.common.messaging.RemoteMessage;
import com.p019vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* renamed from: Lr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7921Lr1 extends BaseAnalyticsEvent {

    /* renamed from: b */
    public final RemoteMessage f6909b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7921Lr1(RemoteMessage remoteMessage) {
        super("vkcm_sdk_client_receive_push");
        O90.m5968f(remoteMessage, "message");
        this.f6909b = remoteMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7921Lr1) && O90.m5963a(this.f6909b, ((C7921Lr1) obj).f6909b);
    }

    @Override // com.p019vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C8896bn0 c8896bn0 = new C8896bn0();
        RemoteMessage remoteMessage = this.f6909b;
        ExtensionsKt.setPushToken(c8896bn0, remoteMessage.getToken());
        ExtensionsKt.setPushId(c8896bn0, remoteMessage.getToken(), remoteMessage.getMessageId());
        return c8896bn0.m10510b();
    }

    public final int hashCode() {
        return this.f6909b.hashCode();
    }

    public final String toString() {
        return "PushReceiveAnalyticsEvent(message=" + this.f6909b + ')';
    }
}
