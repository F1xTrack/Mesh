package com.p019vk.push.common.messaging;

import kotlin.Metadata;
import p000.O90;
import ru.p031ok.tracer.base.ucum.UcumUtils;

@Metadata(m22266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017Jn\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0017¨\u00064"}, m22267d2 = {"Lcom/vk/push/common/messaging/NotificationPayload;", "", "", "title", "body", "icon", "color", "image", "channelId", "clickAction", "Lcom/vk/push/common/messaging/ClickActionType;", "clickActionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vk/push/common/messaging/ClickActionType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/vk/push/common/messaging/ClickActionType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vk/push/common/messaging/ClickActionType;)Lcom/vk/push/common/messaging/NotificationPayload;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "getBody", "c", "getIcon", UcumUtils.UCUM_DAYS, "getColor", "e", "getImage", "f", "getChannelId", "g", "getClickAction", UcumUtils.UCUM_HOURS, "Lcom/vk/push/common/messaging/ClickActionType;", "getClickActionType", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NotificationPayload {

    /* renamed from: a, reason: from kotlin metadata */
    public final String title;

    /* renamed from: b, reason: from kotlin metadata */
    public final String body;

    /* renamed from: c, reason: from kotlin metadata */
    public final String icon;

    /* renamed from: d, reason: from kotlin metadata */
    public final String color;

    /* renamed from: e, reason: from kotlin metadata */
    public final String image;

    /* renamed from: f, reason: from kotlin metadata */
    public final String channelId;

    /* renamed from: g, reason: from kotlin metadata */
    public final String clickAction;

    /* renamed from: h, reason: from kotlin metadata */
    public final ClickActionType clickActionType;

    public NotificationPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, ClickActionType clickActionType) {
        O90.m5968f(str, "title");
        this.title = str;
        this.body = str2;
        this.icon = str3;
        this.color = str4;
        this.image = str5;
        this.channelId = str6;
        this.clickAction = str7;
        this.clickActionType = clickActionType;
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component6, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getClickAction() {
        return this.clickAction;
    }

    /* renamed from: component8, reason: from getter */
    public final ClickActionType getClickActionType() {
        return this.clickActionType;
    }

    public final NotificationPayload copy(String title, String body, String icon, String color, String image, String channelId, String clickAction, ClickActionType clickActionType) {
        O90.m5968f(title, "title");
        return new NotificationPayload(title, body, icon, color, image, channelId, clickAction, clickActionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationPayload)) {
            return false;
        }
        NotificationPayload notificationPayload = (NotificationPayload) other;
        return O90.m5963a(this.title, notificationPayload.title) && O90.m5963a(this.body, notificationPayload.body) && O90.m5963a(this.icon, notificationPayload.icon) && O90.m5963a(this.color, notificationPayload.color) && O90.m5963a(this.image, notificationPayload.image) && O90.m5963a(this.channelId, notificationPayload.channelId) && O90.m5963a(this.clickAction, notificationPayload.clickAction) && this.clickActionType == notificationPayload.clickActionType;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getClickAction() {
        return this.clickAction;
    }

    public final ClickActionType getClickActionType() {
        return this.clickActionType;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.body;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.color;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.image;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.channelId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.clickAction;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ClickActionType clickActionType = this.clickActionType;
        return iHashCode7 + (clickActionType != null ? clickActionType.hashCode() : 0);
    }

    public String toString() {
        return "NotificationPayload(title=" + this.title + ", body=" + this.body + ", icon=" + this.icon + ", color=" + this.color + ", image=" + this.image + ", channelId=" + this.channelId + ", clickAction=" + this.clickAction + ", clickActionType=" + this.clickActionType + ')';
    }
}
