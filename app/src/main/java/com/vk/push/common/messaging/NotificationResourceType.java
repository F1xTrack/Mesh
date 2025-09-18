package com.vk.push.common.messaging;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/vk/push/common/messaging/NotificationResourceType;", "", "MANIFEST", "DEFAULT_SDK", "PAYLOAD", "STUB", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationResourceType {
    public static final NotificationResourceType DEFAULT_SDK;
    public static final NotificationResourceType MANIFEST;
    public static final NotificationResourceType PAYLOAD;
    public static final NotificationResourceType STUB;
    public static final /* synthetic */ NotificationResourceType[] a;

    static {
        NotificationResourceType notificationResourceType = new NotificationResourceType("MANIFEST", 0);
        MANIFEST = notificationResourceType;
        NotificationResourceType notificationResourceType2 = new NotificationResourceType("DEFAULT_SDK", 1);
        DEFAULT_SDK = notificationResourceType2;
        NotificationResourceType notificationResourceType3 = new NotificationResourceType("PAYLOAD", 2);
        PAYLOAD = notificationResourceType3;
        NotificationResourceType notificationResourceType4 = new NotificationResourceType("STUB", 3);
        STUB = notificationResourceType4;
        a = new NotificationResourceType[]{notificationResourceType, notificationResourceType2, notificationResourceType3, notificationResourceType4};
    }

    public static NotificationResourceType valueOf(String str) {
        return (NotificationResourceType) Enum.valueOf(NotificationResourceType.class, str);
    }

    public static NotificationResourceType[] values() {
        return (NotificationResourceType[]) a.clone();
    }
}
