package p000;

import com.p019vk.push.common.analytics.BaseAnalyticsEvent;
import com.p019vk.push.common.messaging.RemoteMessage;
import com.p019vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* renamed from: Cs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7455Cs1 extends BaseAnalyticsEvent {

    /* renamed from: b */
    public final RemoteMessage f1743b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7455Cs1(RemoteMessage remoteMessage) {
        super("vkcm_sdk_client_show_push");
        O90.m5968f(remoteMessage, "message");
        this.f1743b = remoteMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7455Cs1) && O90.m5963a(this.f1743b, ((C7455Cs1) obj).f1743b);
    }

    @Override // com.p019vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C8896bn0 c8896bn0 = new C8896bn0();
        RemoteMessage remoteMessage = this.f1743b;
        ExtensionsKt.setPushToken(c8896bn0, remoteMessage.getToken());
        ExtensionsKt.setPushId(c8896bn0, remoteMessage.getToken(), remoteMessage.getMessageId());
        return c8896bn0.m10510b();
    }

    public final int hashCode() {
        return this.f1743b.hashCode();
    }

    public final String toString() {
        return "PushShowAnalyticsEvent(message=" + this.f1743b + ')';
    }
}
