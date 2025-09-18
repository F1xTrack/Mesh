package com.p019vk.push.common.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.O90;
import ru.p031ok.tracer.base.ucum.UcumUtils;

@Metadata(m22266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010!\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R\u0019\u0010$\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011¨\u0006'"}, m22267d2 = {"Lcom/vk/push/common/messaging/NotificationParams;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "<init>", "(Landroid/os/Parcel;)V", "", "flags", "LTf1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "title", "b", "getBody", "body", "c", "getImageUrl", "imageUrl", UcumUtils.UCUM_DAYS, "getIcon", "icon", "e", "getColor", "color", "f", "getChannelId", "channelId", "g", "getClickAction", "clickAction", "CREATOR", "Builder", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class NotificationParams implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    public final String title;

    /* renamed from: b, reason: from kotlin metadata */
    public final String body;

    /* renamed from: c, reason: from kotlin metadata */
    public final String imageUrl;

    /* renamed from: d, reason: from kotlin metadata */
    public final String icon;

    /* renamed from: e, reason: from kotlin metadata */
    public final String color;

    /* renamed from: f, reason: from kotlin metadata */
    public final String channelId;

    /* renamed from: g, reason: from kotlin metadata */
    public final String clickAction;

    @Metadata(m22266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u0007J\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m22267d2 = {"Lcom/vk/push/common/messaging/NotificationParams$Builder;", "", "<init>", "()V", "", "value", "setTitle", "(Ljava/lang/String;)Lcom/vk/push/common/messaging/NotificationParams$Builder;", "setBody", "setImageUrl", "setIcon", "setColor", "setChannelId", "setClickAction", "Lcom/vk/push/common/messaging/NotificationParams;", "build", "()Lcom/vk/push/common/messaging/NotificationParams;", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Builder {

        /* renamed from: a */
        public String f20284a;

        /* renamed from: b */
        public String f20285b;

        /* renamed from: c */
        public String f20286c;

        /* renamed from: d */
        public String f20287d;

        /* renamed from: e */
        public String f20288e;

        /* renamed from: f */
        public String f20289f;

        /* renamed from: g */
        public String f20290g;

        public final NotificationParams build() {
            return new NotificationParams(this.f20284a, this.f20285b, this.f20286c, this.f20287d, this.f20288e, this.f20289f, this.f20290g, null);
        }

        public final Builder setBody(String value) {
            this.f20285b = value;
            return this;
        }

        public final Builder setChannelId(String value) {
            this.f20289f = value;
            return this;
        }

        public final Builder setClickAction(String value) {
            this.f20290g = value;
            return this;
        }

        public final Builder setColor(String value) {
            this.f20288e = value;
            return this;
        }

        public final Builder setIcon(String value) {
            this.f20287d = value;
            return this;
        }

        public final Builder setImageUrl(String value) {
            this.f20286c = value;
            return this;
        }

        public final Builder setTitle(String value) {
            this.f20284a = value;
            return this;
        }
    }

    @Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m22267d2 = {"Lcom/vk/push/common/messaging/NotificationParams$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/common/messaging/NotificationParams;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "(Landroid/os/Parcel;)Lcom/vk/push/common/messaging/NotificationParams;", "", "size", "", "newArray", "(I)[Lcom/vk/push/common/messaging/NotificationParams;", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    /* renamed from: com.vk.push.common.messaging.NotificationParams$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<NotificationParams> {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NotificationParams createFromParcel(Parcel parcel) {
            O90.m5968f(parcel, "parcel");
            return new NotificationParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NotificationParams[] newArray(int size) {
            return new NotificationParams[size];
        }
    }

    public /* synthetic */ NotificationParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
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

    public final String getColor() {
        return this.color;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        O90.m5968f(parcel, "parcel");
        parcel.writeString(this.title);
        parcel.writeString(this.body);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.icon);
        parcel.writeString(this.color);
        parcel.writeString(this.channelId);
        parcel.writeString(this.clickAction);
    }

    public NotificationParams(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.title = str;
        this.body = str2;
        this.imageUrl = str3;
        this.icon = str4;
        this.color = str5;
        this.channelId = str6;
        this.clickAction = str7;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationParams(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        O90.m5968f(parcel, "parcel");
    }
}
