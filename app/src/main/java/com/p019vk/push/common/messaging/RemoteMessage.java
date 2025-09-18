package com.p019vk.push.common.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC0705LB;
import p000.C10801qd0;
import p000.F71;
import p000.O90;

@Metadata(m22266d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 *2\u00020\u0001:\u0003+*,B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\bJ\u0019\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\bJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010\u000b¨\u0006-"}, m22267d2 = {"Lcom/vk/push/common/messaging/RemoteMessage;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "<init>", "(Landroid/os/Parcel;)V", "", "getMessageId", "()Ljava/lang/String;", "", "getPriority", "()I", "getFrom", "getTtl", "getCollapseKey", "", "getData", "()Ljava/util/Map;", "", "getRawData", "()[B", "Lcom/vk/push/common/messaging/RemoteMessage$Notification;", "getNotification", "()Lcom/vk/push/common/messaging/RemoteMessage$Notification;", "Lcom/vk/push/common/messaging/ClickActionType;", "getClickActionType", "()Lcom/vk/push/common/messaging/ClickActionType;", "", "getPushMessageServerReceivedAt", "()J", "getToken", "Landroid/content/Intent;", "toIntent", "()Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "LTf1;", "populateSendMessageIntent", "(Landroid/content/Intent;)V", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "CREATOR", "Builder", "Notification", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class RemoteMessage implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a */
    public final Bundle f20300a;

    /* renamed from: b */
    public final F71 f20301b;

    @Metadata(m22266d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0007J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0000¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u0007J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&¨\u0006'"}, m22267d2 = {"Lcom/vk/push/common/messaging/RemoteMessage$Builder;", "", "<init>", "()V", "", "value", "setMessageId", "(Ljava/lang/String;)Lcom/vk/push/common/messaging/RemoteMessage$Builder;", "setCollapseKey", "", "setPriority", "(I)Lcom/vk/push/common/messaging/RemoteMessage$Builder;", "setFrom", "setTtl", "(Ljava/lang/Integer;)Lcom/vk/push/common/messaging/RemoteMessage$Builder;", "Lcom/vk/push/common/messaging/NotificationParams;", "setNotificationParams", "(Lcom/vk/push/common/messaging/NotificationParams;)Lcom/vk/push/common/messaging/RemoteMessage$Builder;", "setClickActionType", "", "setPushMessageServerReceivedAt", "(J)Lcom/vk/push/common/messaging/RemoteMessage$Builder;", "", "data", "setRawData", "([B)Lcom/vk/push/common/messaging/RemoteMessage$Builder;", "", "dataToSet", "setData", "(Ljava/util/Map;)Lcom/vk/push/common/messaging/RemoteMessage$Builder;", "key", "addData", "(Ljava/lang/String;Ljava/lang/String;)Lcom/vk/push/common/messaging/RemoteMessage$Builder;", "clearData", "()Lcom/vk/push/common/messaging/RemoteMessage$Builder;", "setToken", "Lcom/vk/push/common/messaging/RemoteMessage;", "build", "()Lcom/vk/push/common/messaging/RemoteMessage;", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Builder {

        /* renamed from: b */
        public byte[] f20303b;

        /* renamed from: c */
        public String f20304c;

        /* renamed from: d */
        public String f20305d;

        /* renamed from: e */
        public int f20306e;

        /* renamed from: h */
        public NotificationParams f20309h;

        /* renamed from: i */
        public long f20310i;

        /* renamed from: k */
        public String f20312k;

        /* renamed from: a */
        public final LinkedHashMap f20302a = new LinkedHashMap();

        /* renamed from: f */
        public Integer f20307f = 0;

        /* renamed from: g */
        public String f20308g = "";

        /* renamed from: j */
        public String f20311j = "";

        public final Builder addData(String key, String value) {
            O90.m5968f(key, "key");
            O90.m5968f(value, "value");
            this.f20302a.put(key, value);
            return this;
        }

        public final RemoteMessage build() {
            Bundle bundle = new Bundle();
            String str = this.f20304c;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            bundle.putString("vk.message_id", str);
            bundle.putString("vk.collapse_key", this.f20305d);
            bundle.putInt("vk.priority", this.f20306e);
            Integer num = this.f20307f;
            if (num != null) {
                bundle.putInt("vk.ttl", num.intValue());
            }
            bundle.putString("vk.from", this.f20308g);
            LinkedHashMap linkedHashMap = this.f20302a;
            bundle.putStringArrayList("vk.data_key", new ArrayList<>(linkedHashMap.keySet()));
            bundle.putStringArrayList("vk.data_value", new ArrayList<>(linkedHashMap.values()));
            bundle.putByteArray("vk.data_raw", this.f20303b);
            bundle.putString("vkpns.click_action_type", this.f20312k);
            bundle.putParcelable("vk.notification_params", this.f20309h);
            bundle.putLong("vk.push_message_server_received_at", this.f20310i);
            bundle.putString("vk.token", this.f20311j);
            return new RemoteMessage(bundle, null);
        }

        public final Builder clearData() {
            this.f20302a.clear();
            return this;
        }

        public final Builder setClickActionType(String value) {
            this.f20312k = value;
            return this;
        }

        public final Builder setCollapseKey(String value) {
            this.f20305d = value;
            return this;
        }

        public final Builder setData(Map<String, String> dataToSet) {
            O90.m5968f(dataToSet, "dataToSet");
            LinkedHashMap linkedHashMap = this.f20302a;
            linkedHashMap.clear();
            linkedHashMap.putAll(dataToSet);
            return this;
        }

        public final Builder setFrom(String value) {
            O90.m5968f(value, "value");
            this.f20308g = value;
            return this;
        }

        public final Builder setMessageId(String value) {
            O90.m5968f(value, "value");
            this.f20304c = value;
            return this;
        }

        public final Builder setNotificationParams(NotificationParams value) {
            O90.m5968f(value, "value");
            this.f20309h = value;
            return this;
        }

        public final Builder setPriority(int value) {
            this.f20306e = value;
            return this;
        }

        public final Builder setPushMessageServerReceivedAt(long value) {
            this.f20310i = value;
            return this;
        }

        public final Builder setRawData(byte[] data) {
            this.f20303b = data;
            return this;
        }

        public final Builder setToken(String value) {
            O90.m5968f(value, "value");
            this.f20311j = value;
            return this;
        }

        public final Builder setTtl(Integer value) {
            this.f20307f = value;
            return this;
        }
    }

    @Metadata(m22266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, m22267d2 = {"Lcom/vk/push/common/messaging/RemoteMessage$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/common/messaging/RemoteMessage;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "(Landroid/os/Parcel;)Lcom/vk/push/common/messaging/RemoteMessage;", "", "size", "", "newArray", "(I)[Lcom/vk/push/common/messaging/RemoteMessage;", "", "CLICK_ACTION_TYPE", "Ljava/lang/String;", "COLLAPSE_KEY", "DATA_KEY", "DATA_RAW", "DATA_VALUE", "FROM", "MESSAGE_ID", "NOTIFICATION_PARAMS", "PRIORITY", "PUSH_MESSAGE_SERVER_RECEIVED_AT", "TOKEN", "TTL", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    /* renamed from: com.vk.push.common.messaging.RemoteMessage$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<RemoteMessage> {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @Override // android.os.Parcelable.Creator
        public RemoteMessage createFromParcel(Parcel parcel) {
            O90.m5968f(parcel, "parcel");
            return new RemoteMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public RemoteMessage[] newArray(int size) {
            return new RemoteMessage[size];
        }
    }

    @Metadata(m22266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\bJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m22267d2 = {"Lcom/vk/push/common/messaging/RemoteMessage$Notification;", "", "Lcom/vk/push/common/messaging/NotificationParams;", "notificationParams", "<init>", "(Lcom/vk/push/common/messaging/NotificationParams;)V", "", "getTitle", "()Ljava/lang/String;", "getBody", "getChannelId", "getClickAction", "Landroid/net/Uri;", "getImageUrl", "()Landroid/net/Uri;", "getColor", "getIcon", "copy", "(Lcom/vk/push/common/messaging/NotificationParams;)Lcom/vk/push/common/messaging/RemoteMessage$Notification;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final /* data */ class Notification {

        /* renamed from: a */
        public final NotificationParams f20313a;

        public Notification(NotificationParams notificationParams) {
            O90.m5968f(notificationParams, "notificationParams");
            this.f20313a = notificationParams;
        }

        public static /* synthetic */ Notification copy$default(Notification notification, NotificationParams notificationParams, int i, Object obj) {
            if ((i & 1) != 0) {
                notificationParams = notification.f20313a;
            }
            return notification.copy(notificationParams);
        }

        public final Notification copy(NotificationParams notificationParams) {
            O90.m5968f(notificationParams, "notificationParams");
            return new Notification(notificationParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Notification) && O90.m5963a(this.f20313a, ((Notification) other).f20313a);
        }

        public final String getBody() {
            return this.f20313a.getBody();
        }

        public final String getChannelId() {
            return this.f20313a.getChannelId();
        }

        public final String getClickAction() {
            return this.f20313a.getClickAction();
        }

        public final String getColor() {
            return this.f20313a.getColor();
        }

        public final String getIcon() {
            return this.f20313a.getIcon();
        }

        public final Uri getImageUrl() {
            NotificationParams notificationParams = this.f20313a;
            String imageUrl = notificationParams.getImageUrl();
            if (imageUrl == null || imageUrl.length() == 0) {
                return null;
            }
            return Uri.parse(notificationParams.getImageUrl());
        }

        public final String getTitle() {
            return this.f20313a.getTitle();
        }

        public int hashCode() {
            return this.f20313a.hashCode();
        }

        public String toString() {
            return "Notification(notificationParams=" + this.f20313a + ')';
        }
    }

    public /* synthetic */ RemoteMessage(Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final ClickActionType getClickActionType() {
        String string = this.f20300a.getString("vkpns.click_action_type");
        if (string == null) {
            return null;
        }
        Object obj = ClickActionType.DEFAULT;
        try {
            String upperCase = string.toUpperCase(Locale.ROOT);
            O90.m5967e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Object objValueOf = Enum.valueOf(ClickActionType.class, upperCase);
            O90.m5967e(objValueOf, "{\n        if (this != nu…faultEnum\n        }\n    }");
            obj = objValueOf;
        } catch (IllegalArgumentException unused) {
        }
        return (ClickActionType) obj;
    }

    public final String getCollapseKey() {
        return this.f20300a.getString("vk.collapse_key");
    }

    public final Map<String, String> getData() {
        return (Map) this.f20301b.getValue();
    }

    public final String getFrom() {
        String string = this.f20300a.getString("vk.from", "");
        O90.m5967e(string, "bundle.getString(FROM, \"\")");
        return string;
    }

    public final String getMessageId() {
        return this.f20300a.getString("vk.message_id");
    }

    public final Notification getNotification() {
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f20300a;
        NotificationParams notificationParams = (NotificationParams) (i >= 33 ? bundle.getParcelable("vk.notification_params", NotificationParams.class) : bundle.getParcelable("vk.notification_params"));
        if (notificationParams == null) {
            return null;
        }
        return new Notification(notificationParams);
    }

    public final int getPriority() {
        return this.f20300a.getInt("vk.priority", 0);
    }

    public final long getPushMessageServerReceivedAt() {
        return this.f20300a.getLong("vk.push_message_server_received_at");
    }

    public final byte[] getRawData() {
        return this.f20300a.getByteArray("vk.data_raw");
    }

    public final String getToken() {
        return this.f20300a.getString("vk.token");
    }

    public final int getTtl() {
        return this.f20300a.getInt("vk.ttl", 0);
    }

    public final void populateSendMessageIntent(Intent intent) {
        O90.m5968f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        intent.putExtras(this.f20300a);
    }

    public final Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtras(this.f20300a);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        O90.m5968f(parcel, "parcel");
        parcel.writeBundle(this.f20300a);
    }

    public RemoteMessage(Bundle bundle) {
        this.f20300a = bundle;
        this.f20301b = AbstractC0705LB.m4915b(new C10801qd0(20, this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteMessage(Parcel parcel) {
        O90.m5968f(parcel, "parcel");
        Bundle bundle = parcel.readBundle(RemoteMessage.class.getClassLoader());
        this(bundle == null ? new Bundle(0) : bundle);
    }
}
