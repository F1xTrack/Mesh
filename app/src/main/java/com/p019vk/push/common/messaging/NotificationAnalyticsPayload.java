package com.p019vk.push.common.messaging;

import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import com.p019vk.push.common.utils.StringExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.F91;
import p000.O90;

@Metadata(m22266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u001a"}, m22267d2 = {"Lcom/vk/push/common/messaging/NotificationAnalyticsPayload;", "", "", "pushTokenPart", RemoteMessageAttributes.MESSAGE_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/vk/push/common/messaging/NotificationAnalyticsPayload;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPushTokenPart", "b", "getMessageId", "Companion", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NotificationAnalyticsPayload {
    public static final int CHARS_TO_CHECK = 10;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    public final String pushTokenPart;

    /* renamed from: b, reason: from kotlin metadata */
    public final String messageId;

    @Metadata(m22266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005*\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m22267d2 = {"Lcom/vk/push/common/messaging/NotificationAnalyticsPayload$Companion;", "", "", "pushTokenPart", RemoteMessageAttributes.MESSAGE_ID, "Lcom/vk/push/common/messaging/NotificationAnalyticsPayload;", "createSafe", "(Ljava/lang/String;Ljava/lang/String;)Lcom/vk/push/common/messaging/NotificationAnalyticsPayload;", "Lcom/vk/push/common/messaging/RemoteMessage;", "toNotificationAnalyticsPayload", "(Lcom/vk/push/common/messaging/RemoteMessage;)Lcom/vk/push/common/messaging/NotificationAnalyticsPayload;", "", "CHARS_TO_CHECK", "I", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final NotificationAnalyticsPayload createSafe(String pushTokenPart, String messageId) {
            String strTakeSafe = pushTokenPart != null ? StringExtensionsKt.takeSafe(pushTokenPart, 10) : null;
            if (strTakeSafe == null || messageId == null) {
                return null;
            }
            return new NotificationAnalyticsPayload(strTakeSafe, messageId);
        }

        public final NotificationAnalyticsPayload toNotificationAnalyticsPayload(RemoteMessage remoteMessage) {
            O90.m5968f(remoteMessage, "<this>");
            return createSafe(remoteMessage.getToken(), remoteMessage.getMessageId());
        }
    }

    public NotificationAnalyticsPayload(String str, String str2) {
        O90.m5968f(str, "pushTokenPart");
        O90.m5968f(str2, RemoteMessageAttributes.MESSAGE_ID);
        this.pushTokenPart = str;
        this.messageId = str2;
    }

    public static /* synthetic */ NotificationAnalyticsPayload copy$default(NotificationAnalyticsPayload notificationAnalyticsPayload, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationAnalyticsPayload.pushTokenPart;
        }
        if ((i & 2) != 0) {
            str2 = notificationAnalyticsPayload.messageId;
        }
        return notificationAnalyticsPayload.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPushTokenPart() {
        return this.pushTokenPart;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    public final NotificationAnalyticsPayload copy(String pushTokenPart, String messageId) {
        O90.m5968f(pushTokenPart, "pushTokenPart");
        O90.m5968f(messageId, RemoteMessageAttributes.MESSAGE_ID);
        return new NotificationAnalyticsPayload(pushTokenPart, messageId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationAnalyticsPayload)) {
            return false;
        }
        NotificationAnalyticsPayload notificationAnalyticsPayload = (NotificationAnalyticsPayload) other;
        return O90.m5963a(this.pushTokenPart, notificationAnalyticsPayload.pushTokenPart) && O90.m5963a(this.messageId, notificationAnalyticsPayload.messageId);
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getPushTokenPart() {
        return this.pushTokenPart;
    }

    public int hashCode() {
        return this.messageId.hashCode() + (this.pushTokenPart.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NotificationAnalyticsPayload(pushTokenPart=");
        sb.append(this.pushTokenPart);
        sb.append(", messageId=");
        return F91.m2539v(sb, this.messageId, ')');
    }
}
