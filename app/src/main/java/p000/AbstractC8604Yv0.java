package p000;

import android.app.NotificationChannel;

/* renamed from: Yv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8604Yv0 {
    /* renamed from: a */
    public static String m9426a(NotificationChannel notificationChannel) {
        return notificationChannel.getConversationId();
    }

    /* renamed from: b */
    public static String m9427b(NotificationChannel notificationChannel) {
        return notificationChannel.getParentChannelId();
    }

    /* renamed from: c */
    public static boolean m9428c(NotificationChannel notificationChannel) {
        return notificationChannel.isImportantConversation();
    }

    /* renamed from: d */
    public static void m9429d(NotificationChannel notificationChannel, String str, String str2) {
        notificationChannel.setConversationId(str, str2);
    }
}
